package zad20;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Zad20 extends Application {


    public void start(Stage stage) throws Exception {

        VBox container = new VBox();

        HBox hbLogo = new HBox();
            //kolor  hbLogo.setStyle("-fx-background-color: rgba(190,125,6,0.91);");
        HBox hbSiec = new HBox();
            //kolor  hbSiec.setStyle("-fx-background-color: #b91e9b;");
        HBox hbLogin = new HBox();
            hbLogin.setPadding(new Insets(0,0,80,0));
            //kolor  hbLogin.setStyle("-fx-background-color: #039a23;");
        HBox hbStopka = new HBox();
            //kolor  hbStopka.setStyle("-fx-background-color: #0213b1;");

        container.getChildren().addAll(hbLogo, hbSiec, hbLogin, hbStopka);

        hbLogo.getChildren().add(new ImageView("/zad20/logo.png"));
        hbLogo.getChildren().add(new ImageView("/zad20/naglowek.png"));
        hbSiec.getChildren().add(new ImageView("/zad20/menu_poz.png"));
        hbStopka.getChildren().add(new ImageView("/zad20/stopka.png"));


        //LOGIN
            VBox vbGuziki = new VBox();
                //kolor  vbGuziki.setStyle("-fx-background-color: rgba(255,107,193,0.91);");
            VBox vbNapisy = new VBox();
                //kolor  vbNapisy.setStyle("-fx-background-color: rgba(79,153,255,0.91);");
            VBox vbWprowadzanie = new VBox();
                //kolor  vbWprowadzanie.setStyle("-fx-background-color: rgba(105,255,120,0.91);");
            HBox hbSprawdzanie = new HBox();
                //kolor  hbSprawdzanie.setStyle("-fx-background-color: rgba(255,81,81,0.91);");
            String aktualnyStan = "Wprowadzanie";

            hbLogin.getChildren().addAll(vbGuziki, vbNapisy, vbWprowadzanie);

            //GUZIKI
                Button bWprowadzDane = new Button();
                Button bPokażDane = new Button();
                bWprowadzDane.setGraphic(new ImageView("/zad20/p1.png"));
                bPokażDane.setGraphic(new ImageView("/zad20/p2.png"));

                vbGuziki.getChildren().addAll(bWprowadzDane, bPokażDane);
                vbGuziki.setAlignment(Pos.CENTER);
                vbGuziki.setPadding(new Insets(30));
                vbGuziki.setSpacing(30);

            //NAPISY
                Label lPesel = new Label("PESEL");
                Label lMiasto = new Label("miasto");

                vbNapisy.getChildren().addAll(lPesel, lMiasto);
                vbNapisy.setPadding(new Insets(40));
                vbNapisy.setMinWidth(120);
                vbNapisy.setSpacing(30);

            //WPROWADZANIE
                TextField tfPesel = new TextField();
                tfPesel.setMinWidth(335);
                TextField tfMiasto = new TextField();
                tfMiasto.setMinWidth(335);
                Button bZapisz = new Button("Zapisz");

                vbWprowadzanie.getChildren().addAll(tfPesel, tfMiasto, bZapisz);
                vbWprowadzanie.setPadding(new Insets(30));
                vbWprowadzanie.setSpacing(20);
                vbWprowadzanie.setAlignment(Pos.CENTER);

            //SPRAWDZANIE
                VBox vbGwiazdki = new VBox();
                    //kolor  vbGwiazdki.setStyle("-fx-background-color: rgba(168,58,144,0.67);");
                VBox vbBledy = new VBox();
                    //kolor  vbBledy.setStyle("-fx-background-color: rgba(33,48,111,0.91);");

                hbSprawdzanie.getChildren().addAll(vbGwiazdki, vbBledy);

                vbGwiazdki.getChildren().addAll(new Label("***********"), new Label("***********"));
                vbGwiazdki.setPadding(new Insets(40));
                vbGwiazdki.setSpacing(30);
                vbGwiazdki.setAlignment(Pos.TOP_RIGHT);
                vbGwiazdki.setMinWidth(200);

                vbBledy.setPadding(new Insets(40));
                vbBledy.setSpacing(30);
                vbBledy.setAlignment(Pos.TOP_RIGHT);
                vbBledy.setMinWidth(200);



            //MECHANIKA
                bWprowadzDane.setOnAction(e -> {
                    if(hbLogin.getChildren().contains(hbSprawdzanie)){
                        hbLogin.getChildren().remove(hbSprawdzanie);
                        hbLogin.getChildren().add(vbWprowadzanie);
                    }
                });

                bPokażDane.setOnAction(e -> {
                    if(hbLogin.getChildren().contains(vbWprowadzanie)) {
                        hbLogin.getChildren().remove(vbWprowadzanie);
                        hbLogin.getChildren().add(hbSprawdzanie);
                    }
                });

                bZapisz.setOnAction(e -> {
                    //TESTY

                    vbBledy.getChildren().clear();

                    if (tfPesel.getText().matches("[0-9]{11}"))
                        vbBledy.getChildren().add(new Label("Dane poprawne"));
                    else
                        vbBledy.getChildren().add(new Label("Błąd"));

                    if(tfMiasto.getText().matches("[A-Z][a-z]*"))
                        vbBledy.getChildren().add(new Label("Dane poprawne"));
                    else
                        vbBledy.getChildren().add(new Label("Błąd"));
                });



        stage.setScene(new Scene(container));
        stage.setTitle("Apka");
        stage.show();


    }

    public static void main (String[]args){
        launch(args);
    }
}
