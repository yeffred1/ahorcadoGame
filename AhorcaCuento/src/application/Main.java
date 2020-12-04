package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//ScrollPane root = (ScrollPane) FXMLLoader.load(getClass().getResource("/edu/upoli/fx1/view/Form.fxml"));
			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("/aplication/escenarios/inicio.fxml"));
			Scene scene = new Scene(root, 405, 700);
			scene.getStylesheets().add(getClass().getResource("/aplication/estilos/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
