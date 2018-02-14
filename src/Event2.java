import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event2 implements ActionListener{
	
	TextField box1, box2, box3;
	
	public void actionPerformed(ActionEvent x) {
		int A ,B, C;
		A=B=C=0;
		
		try {
		A = Integer.parseInt(box1.getText());
		B = Integer.parseInt(box2.getText());
		} catch (NumberFormatException ex) {
			System.out.println("Please insert integers");
		}
		
		C = A-B;
		box3.setText(Integer.toString(C));
	}
	
	public Event2(TextField A, TextField B, TextField C) {
		box1 = A;
		box2 = B;
		box3 = C;
	}
}
