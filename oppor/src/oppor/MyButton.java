package oppor;
import java.awt.*;
import java.awt.event.*;

/*import ddd.WindowAdapter;
import ddd.WindowCloser;
import ddd.WindowEvent;*/
public  class MyButton extends Frame implements ActionListener{
	Button redBtn ;
	Button greenBtn ;
	Button blueBtn ;
	public static void main (String args[])
	{
		MyButton f=new MyButton ("MyButton can change color");
		f.setSize(300,300);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		WindowCloser w=new WindowCloser();
		f.addWindowListener(w);

		
	}
	public MyButton (String str){
		super(str);
		redBtn=new Button("Red");
		greenBtn=new Button("Green");
	    blueBtn=new Button("Blue");
	    add(redBtn);
	    add(greenBtn);
	    add(blueBtn);
	    redBtn.addActionListener(this);
	    greenBtn.addActionListener(this);
	    blueBtn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==redBtn) setBackground(Color.red);
		if(e.getSource()==greenBtn) setBackground(Color.green);
		if(e.getSource()==blueBtn) setBackground(Color.blue);
		
		
	 }
	}
class WindowCloser extends WindowAdapter{
	public void windowClosing(WindowEvent evt){
		System.exit(0);
	}
}




