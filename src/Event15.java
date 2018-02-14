import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event15 implements ActionListener{
	
	TextField box1;
	
	
	public void actionPerformed(ActionEvent x) {
		
		box1.setText("");
		Data.Clear();
	}
	
	public Event15(TextField _box) {
		
		box1 = _box;
	}
}
