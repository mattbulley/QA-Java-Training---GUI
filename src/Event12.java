import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event12 implements ActionListener{
	
	TextField box1;
	char symbol;
	
	public void actionPerformed(ActionEvent x) {
		
		if(Data.counter == 0) {
			Data.val1 = Integer.parseInt(Data.str);
			Data.str = "";
			System.out.println(Data.val1);
			Data.counter++;
			box1.setText(Character.toString(symbol));
			System.out.println(symbol);
			Data.operator = 3;
		}
		
		// if first number: set the value of val1
		// reset the string
		// increase counter to signify we are on the second number
		// set the text to the symbol
		// set the operator to the corresponding integer

	}
	
	public Event12(char _symbol, TextField _box) {
		symbol = _symbol;
		box1 = _box;
	}
}
