import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event7 implements ActionListener{
	
	TextField box1;
	int digit;
	
	public void actionPerformed(ActionEvent x) {
		
		if(Data.counter == 0) {
			Data.str += Integer.toString(digit);
			box1.setText(Data.str);
		} else if (Data.counter == 1) {
			Data.str += Integer.toString(digit);
			box1.setText(Data.str);
		}
	}
	
	public Event7(int _digit, TextField _box) {
		digit = _digit;
		box1 = _box;
	}
}
