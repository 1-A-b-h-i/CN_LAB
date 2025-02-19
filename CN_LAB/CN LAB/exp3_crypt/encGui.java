import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
class egui implements ActionListener
{
	Frame f;
	TextField tf;
	TextArea ta;
	Button b1,b2;
	PrintStream pr;
	ServerSocket ss;
	Socket s;
	egui()
	{
		f=new Frame("Demo GUI");
		f.setSize(400,400);
		tf=new TextField(10);
		ta=new TextArea(20,20);
		b1=new Button("Send");
		b2=new Button("Cancel");
		f.setLayout(new FlowLayout());
        	f.add(new Label("Enter Message:"));
        	f.add(tf);
        	f.add(ta);
        	f.add(b1);
        	f.add(b2);
        	b1.addActionListener(this);
        	b2.addActionListener(this);
        	f.setVisible(true);
        	try{
            		ss=new ServerSocket(8000);    
            		s=ss.accept();
            		pr=new PrintStream(s.getOutputStream());
        	}
        	catch(Exception e)
        	{}

    	}
	public void actionPerformed(ActionEvent ae)
    	{
        	if(ae.getSource()==b1)
        	{
            		String s1=tf.getText();
           	 	char c[]=s1.toCharArray();
            		for(int i=0;i<c.length;i++)
            		{
                		c[i]=(char)(c[i]+5);
            		}
           		String a=new String(c);
            		pr.println(a);        
            		System.out.println(a);

        	}
        	else if(ae.getSource()==b2)
        	{
            		System.out.println("cancel");
       	 	}

    	}
}
class encGui
{
    public static void main(String ar[])
    {    
        egui t1=new egui();
    }
}  