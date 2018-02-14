import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event4 implements ActionListener{
	
	TextField box1;
	char symbol;
	
	
	public void actionPerformed(ActionEvent x) {
		
		try {
		if(Data.counter == 0) {
			Data.val1 = Integer.parseInt(Data.str);
			Data.str = "";
			System.out.println(Data.val1);
			Data.counter++;
			box1.setText(Character.toString(symbol));
			System.out.println(symbol);
			Data.operator = 1;
		} else if (Data.counter == 1) {
			Data.val2 = Integer.parseInt(Data.str);
			Data.val1 = Data.val1 + Data.val2;
			Data.str = "";
			Data.val2 = 0;
			box1.setText(Integer.toString(Data.val1));
		}
		} catch (NumberFormatException ex) {
			
		}
		
		// if first number: set the value of val1
		// reset the string
		// increase counter to signify we are on the second number
		// set the text to the symbol
		// set the operator to the corresponding integer

	}
	
	public Event4(char _symbol, TextField _box) {
		symbol = _symbol;
		box1 = _box;
	}
}
