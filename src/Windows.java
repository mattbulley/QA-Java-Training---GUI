import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.BorderLayout; // Default layout
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.Panel;
import java.awt.GridLayout;

public class Windows {
	
	public static void main(String x[]) {
		Frame Win = new Frame ("Integer Calculator");
		
		Panel P1 = new Panel();
		Panel P2 = new Panel();
		
		GridLayout G = new GridLayout(4, 4);
		P2.setLayout(G);
		
		Button B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16;
		
		B1 = new Button("7"); B2 = new Button("8");
		B3 = new Button("9"); B4 = new Button("+");
		B5 = new Button("4"); B6 = new Button("5");
		B7 = new Button("6"); B8 = new Button("-");
		B9 = new Button("1"); B10 = new Button("2");
		B11 = new Button("3"); B12 = new Button("/");
		B13 = new Button("0"); B14 = new Button("=");
		B15 = new Button("C"); B16 = new Button("*");
		
		TextField T1 = new TextField(10);
		
		Event1 E1 = new Event1(7, T1);
		Event2 E2 = new Event2(8, T1);
		Event3 E3 = new Event3(9, T1);
		Event4 E4 = new Event4('+', T1);
		Event5 E5 = new Event5(4, T1);
		Event6 E6 = new Event6(5, T1);
		Event7 E7 = new Event7(6, T1);
		Event8 E8 = new Event8('-', T1);
		Event9 E9 = new Event9(1, T1);
		Event10 E10 = new Event10(2, T1);
		Event11 E11 = new Event11(3, T1);
		Event12 E12 = new Event12('/', T1);
		Event13 E13 = new Event13(0, T1);
		Event14 E14 = new Event14(T1);
		Event15 E15 = new Event15(T1);
		Event16 E16 = new Event16('*', T1);
		
		B1.addActionListener(E1); // 7
		B2.addActionListener(E2); // 8
		B3.addActionListener(E3); // 9
		B4.addActionListener(E4); // +
		B5.addActionListener(E5); // 4
		B6.addActionListener(E6); // 5
		B7.addActionListener(E7); // 6
		B8.addActionListener(E8); // -
		B9.addActionListener(E9); // 1
		B10.addActionListener(E10); // 2
		B11.addActionListener(E11); // 3
		B12.addActionListener(E12); // /
		B13.addActionListener(E13); // 0
		B14.addActionListener(E14); // =
		B15.addActionListener(E15); // C
		B16.addActionListener(E16); // *
		
		Win.add(P1, BorderLayout.NORTH);
		Win.add(P2, BorderLayout.CENTER);
		
		P1.add(T1); P2.add(B1);
		P2.add(B2); P2.add(B3);
		P2.add(B4); P2.add(B5);
		P2.add(B6); P2.add(B7);
		P2.add(B8); P2.add(B9);
		P2.add(B10); P2.add(B11);
		P2.add(B12); P2.add(B13);
		P2.add(B14); P2.add(B15);
		P2.add(B16);
		
		Win.setSize(500,500);
		Win.setVisible(true);
	}
}
