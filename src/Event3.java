import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event3 implements ActionListener{
	
	TextField box1, box2, box3;
	
	public void actionPerformed(ActionEvent x) {
		int A ,B;
		float C;
		A=B=0;
		C=0.0f;
		
		try {
		A = Integer.parseInt(box1.getText());
		B = Integer.parseInt(box2.getText());
		} catch (NumberFormatException ex) {
			System.out.println("Please insert integers");
		}
		
		C = (float)A/(float)B;
		box3.setText(Float.toString(C));
	}
	
	public Event3(TextField A, TextField B, TextField C) {
		box1 = A;
		box2 = B;
		box3 = C;
	}
}
