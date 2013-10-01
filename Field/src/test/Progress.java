package test;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Progress extends JFrame{
	
	JProgressBar pb;

	public Progress(){
		super();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pb = new JProgressBar();
		pb.setMaximum(4000);
		pb.setValue(0);
		pb.setSize(600, 20);
		pb.setString("simulating");
		add(pb);
		setVisible(true);
		pack();
	}
	
	public void incrementProgress(){
		pb.setValue(pb.getValue()+1);
	}
	
	
}
