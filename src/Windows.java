import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.BorderLayout; // Default layout
import java.awt.TextField;

public class Windows {
	public static void main(String x[]) {
		Frame Win = new Frame ("QA Manchester");
		
		
		Button B1 = new Button("+"); Button B2 = new Button("-");
		Button B3 = new Button("/"); Button B4 = new Button("*");
		TextField T1, T2, T3;
		T1 = new TextField(10);
		T2 = new TextField(10);
		T3 = new TextField(10);
		
		
		Event1 E1 = new Event1(T1, T2, T3);
		Event2 E2 = new Event2(T1, T2, T3);
		Event3 E3 = new Event3(T1, T2, T3);
		Event4 E4 = new Event4(T1, T2, T3);
		
		B1.addActionListener(E1);
		B2.addActionListener(E2);
		B3.addActionListener(E3);
		B4.addActionListener(E4);
		
		FlowLayout F = new FlowLayout();
		Win.setLayout(F);
		
		
		Win.add(T1);
		Win.add(T2);
		Win.add(B1);
		Win.add(B2);
		Win.add(B3);
		Win.add(B4);
		Win.add(T3);
		
		
		Win.setSize(500,90);
		Win.setVisible(true);
	}
}
