import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.TextField;

public class Windows {
	public static void main(String x[]) {
		Frame Win = new Frame ("QA Manchester");
		
		
		Button b = new Button("Click 1");
		TextField T1, T2, T3;
		T1 = new TextField(10);
		T2 = new TextField(10);
		T3 = new TextField(10);
		
		
		Event1 E = new Event1(T1, T2, T3);
		FlowLayout F = new FlowLayout();
		Win.setLayout(F);
		
		b.addActionListener(E);
		
		Win.add(T1);
		Win.add(T2);
		Win.add(b);
		Win.add(T3);
		
		
		Win.setSize(400,400);
		Win.setVisible(true);
	}
}
