package Applet;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.Label;
import java.awt.TextField;
public class Applet1 extends Applet
{
Button b,b1;
TextField t1,t2,t3;
Label l;
public void init()
{
	add(t1=new TextField(5));
	add(l=new Label("+"));
	add(t2=new TextField(5));
	add(b=new Button("="));
	add(t3=new TextField(5));
	add(b1=new Button("Clear"));
}
public boolean action(Event e,Object o)
{
		String s1=t1.getText();
		int i=Integer.parseInt(s1);
		String s2=t2.getText();
		int j=Integer.parseInt(s2);
		int k=i+j;
		String s3=String.valueOf(k);
		t3.setText(s3);
	

			if(e.target.equals(b1))
			   {
			     t1.setText("");
			     t2.setText("");
			      t3.setText("");
			      t1.requestFocus();
			
		}
		
	return true;
}
	


		

		
	}

	




