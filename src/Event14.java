import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Event14 implements ActionListener {
	
	TextField box1;
	int answer;
	float answerFloat;
	
	
	public void actionPerformed(ActionEvent x) {
		
		Data.val2 = Integer.parseInt(Data.str);
		
		
			switch (Data.operator) {
				case 1:
					answer = Data.val1 + Data.val2;
					break;
				case 2:
					answer = Data.val1 - Data.val2;
					break;
				case 3:
					answerFloat = ((float)Data.val1) / ((float)Data.val2);
					break;
				case 4:
					answer = Data.val1 * Data.val2;
					break;
			}
			
			if(Data.operator!=3)
				box1.setText(Integer.toString(answer));
			else
				box1.setText(Float.toString(answerFloat));
			
			System.out.println(Data.val2);
			System.out.println("=");
			Data.counter = 1;
			Data.val1 = (int)answer;
			Data.val2 = 0;
			Data.str = "";
			Data.operator = 0;
			
			
		
			
	}
	
	public Event14(TextField _box) {

		box1 = _box;
	}
}
