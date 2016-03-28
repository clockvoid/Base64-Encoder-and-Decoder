package Gui;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Base64;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

public class MainSceneController implements Initializable {
	@FXML TextArea encoded;
	@FXML TextArea decoded;
	@FXML ToggleGroup group;
	
	private String encoding = "utf-8";
	
	public void encode() {
		try {
			encoded.setText(Base64.getEncoder().encodeToString(decoded.getText().getBytes(encoding)));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void decode() {
		try {
			decoded.setText(new String(Base64.getDecoder().decode(encoded.getText()), encoding));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		group.selectedToggleProperty().addListener( new ChangeListener<Toggle>() {

			@Override
			public void changed(ObservableValue<? extends Toggle> arg0, Toggle arg1, Toggle arg2) {
				// TODO Auto-generated method stub
				encoding = (String)arg2.getUserData();
			}
			
		});
	}
}
