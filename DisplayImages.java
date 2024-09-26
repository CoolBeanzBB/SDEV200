import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;

public class DisplayImages extends Application {
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5, 5, 5, 5));
		ImageView usa = new ImageView(new Image("flag1.gif"));
		ImageView china = new ImageView(new Image("flag7.gif"));
		ImageView uk = new ImageView(new Image("flag2.gif"));
		ImageView france = new ImageView(new Image("flag6.gif"));

		pane.setHgap(5);
		pane.setVgap(5);
		pane.add(usa, 0, 0);
		pane.add(china, 1, 0);
		pane.add(uk, 0, 1);
		pane.add(france, 1, 1);

		Scene scene = new Scene(pane);
		primaryStage.setTitle("DisplayImages");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}