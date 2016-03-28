package Gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainWindow extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		try {
			arg0.setTitle("Base64 Encoder and Decoder");
			FXMLLoader fxmlLoader = new FXMLLoader(ClassLoader.getSystemResource("Gui/MainScene.fxml"));
			fxmlLoader.load();
			Pane root = fxmlLoader.getRoot();
			Scene mainScene = new Scene(root, 655, 300);
			arg0.setScene(mainScene);
			arg0.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
