import javafx.application.Application;
import Gui.MainWindow;

public class Base64EncoderDecoder {
	public static MainWindow mainWindow;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainWindow = new MainWindow();
		Application.launch(mainWindow.getClass(), args);
	}

}
