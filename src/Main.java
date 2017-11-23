import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button rew = new Button("<<");
		Button play = new Button("I>");
		Button fwd = new Button(">>");
		
		Button prec = new Button("|<");
		Button stop = new Button("|_|");
		Button suiv = new Button(">|");
		
		Label ptivolume = new Label("<)");
		Slider slideVolume = new Slider();
		Label grovolume = new Label("<)))");
		
		Button chaipa1 = new Button("|||");
		Button chaipa2 = new Button(":=");
		
		Label lecteurMultimediaVLC = new Label("Lecteur multimédia VLC");
		Label zeroDeuxPointsZeroZero = new Label("0:00");
		Slider oui = new Slider();
		
		HBox h1 = new HBox(5);
		h1.getChildren().addAll(rew,play,fwd);
		h1.setAlignment(Pos.CENTER);
		h1.setPadding(new Insets(5,5,5,5));
		HBox h2 = new HBox(5);
		h2.getChildren().addAll(prec,stop,suiv);
		h2.setAlignment(Pos.TOP_CENTER);
		h2.setPadding(new Insets(5,5,5,5));
		
		HBox h3 = new HBox(5);
		h3.getChildren().addAll(ptivolume,slideVolume,grovolume);
		h3.setPadding(new Insets(8,2,2,2));
		HBox h4 = new HBox(5);
		h4.getChildren().addAll(chaipa1,chaipa2);
		h4.setPadding(new Insets(2,2,2,2));
		
		BorderPane b1 = new BorderPane();
		BorderPane b2 = new BorderPane();
		BorderPane b3 = new BorderPane();
		BorderPane b4 = new BorderPane();
		
		b4.setLeft(lecteurMultimediaVLC);
		b4.setRight(zeroDeuxPointsZeroZero);
		b4.setBottom(oui);
		b4.setPadding(new Insets(5,5,5,5));
		b4.setStyle("-fx-background-color: #D9EBBA; -fx-border-color:#C6C6C6; -fx-border-width:2; -fx-background-radius: 5px; -fx-border-radius: 5px;");
		
		b3.setTop(b4);
		b3.setLeft(h3);
		b3.setRight(h4);
		b3.setPadding(new Insets(5,5,5,5));
		
		
		b2.setTop(h1);
		b2.setCenter(h2);
		b2.setPadding(new Insets(5,5,5,5));
		
		b1.setLeft(b2);
		b1.setCenter(b3);
		b1.setStyle("-fx-background-color: linear-gradientlinear-gradient(to bottom, #DEDCE2, #AEACAC);");
		
		
		primaryStage.setMinWidth(420);
		primaryStage.setMinHeight(125);
		primaryStage.setTitle("grapher");
		primaryStage.setScene(new Scene(b1,550,90));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

