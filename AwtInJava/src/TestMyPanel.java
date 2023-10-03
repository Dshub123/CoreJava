import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class TestMyPanel {
	
		JFrame f; 
		MyPanel p; 
		public TestMyPanel(){ 
			f = new JFrame(); 
			// get the content area of Panel. 
			Container c = f.getContentPane(); 
			// set the LayoutManager
			c.setLayout(new BorderLayout()); 
			p = new MyPanel(); 
			// add MyPanel object into container 
			c.add(p);
			// set the size of the JFrame
			f.setSize(400,400); 
			// make the JFrame visible
			f.setVisible(true); 
			// sets close behavior; EXIT_ON_CLOSE invokes System.exit(0) on closing the JFrame
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		}

		public static void main(String[] args) {
			TestMyPanel test = new TestMyPanel();
		}

	}
