package Problem_2;

//For this problem, the number of total cars, trucks and bikes are known therefore
//the best data structure algorithm to be used is HashMap, the big O for search,insertion,
//deletion is O(1)
//Since the ID is unique, the ID will be the key for the Hashmap, the program will not add 
//if ID is already in the Hashmap




import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Main_Page.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}

	
	


