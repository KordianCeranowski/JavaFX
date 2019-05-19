import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Zad21 extends Application {

    public void start(Stage stage) throws Exception {

        VBox container = new VBox();
        container.setId("container");

        container.getChildren().add(new ImageView("/images/t1.jpg"));

        //górne menu
        StackPane spMenuGora = new StackPane();
        spMenuGora.setAlignment(Pos.CENTER_LEFT);
        container.getChildren().add(spMenuGora);

            spMenuGora.getChildren().add(new ImageView("/images/t2.gif"));
            HBox hbMenuGoraNapisy = new HBox();
            spMenuGora.getChildren().add(hbMenuGoraNapisy);

                hbMenuGoraNapisy.setId("hbMenuGoraNapisy");
                hbMenuGoraNapisy.setPadding(new Insets(0,0,0,30));

                Label text1 = new Label("STRONA GŁÓWNA");
                Label text2 = new Label("OFERTA");
                Label text3 = new Label("CENNIK");
                Label text4 = new Label("SKLEP ONLINE");
                Label text5 = new Label("O NAS");
                Label text6 = new Label("KONTAKT");

                text1.setId("textWhiteB");
                text2.setId("textWhiteB");
                text3.setId("textWhiteB");
                text4.setId("textWhiteB");
                text5.setId("textWhiteB");
                text6.setId("textWhiteB");

                hbMenuGoraNapisy.getChildren().addAll(
                text1, new ImageView("/images/msep.jpg"),
                text2, new ImageView("/images/msep.jpg"),
                text3, new ImageView("/images/msep.jpg"),
                text4, new ImageView("/images/msep.jpg"),
                text5, new ImageView("/images/msep.jpg"),
                text6
                );


        HBox hbSciezka = new HBox();
        container.getChildren().add(hbSciezka);
            hbSciezka.setAlignment(Pos.CENTER_LEFT);
            hbSciezka.setPadding(new Insets(0,25,0,25));
            hbSciezka.setSpacing(10);

            Label text7 = new Label("strona główna");
            Label text8 = new Label("oferta");
            Label text9 = new Label("cennik");
            Label text10 = new Label(">>");
            Label text11 = new Label(">>");

            text7.setId("textGrayUnderlined");
            text8.setId("textGrayUnderlined");
            text9.setId("textGrayUnderlined");
            text10.setId("textGray");
            text11.setId("textGray");

            hbSciezka.getChildren().addAll(
                    new ImageView("/images/path.jpg"),
                    text7, text10,//new ImageView("/images/arrow.jpg"),
                    text8, text11, //new ImageView("/images/arrow.jpg"),
                    text9
            );

        //Duży fragment pośrodku
        HBox hbBigAndScary = new HBox();
        container.getChildren().add(hbBigAndScary);
            VBox vbLewy = new VBox();
            vbLewy.setId("vbLewy");
            hbBigAndScary.getChildren().add(vbLewy);

                VBox vbNawigacja = new VBox();
                vbNawigacja.setId("vbNawigacja");
                vbLewy.getChildren().add(vbNawigacja);
                    vbNawigacja.getChildren().add(new ImageView("/images/m1.gif"));

                    StackPane spNawigacjaNapis = new StackPane();
                    vbNawigacja.getChildren().add(spNawigacjaNapis);

                        VBox vbNiceLookinStuff = new VBox();
                        spNawigacjaNapis.getChildren().add(vbNiceLookinStuff);
                        for(int i=0; i<20; i++)
                            vbNiceLookinStuff.getChildren().add(new ImageView("/images/m2.gif"));

                        spNawigacjaNapis.getChildren().add(new ImageView("/images/mng.jpg"));
                        Label text12 = new Label("NAWIGACJA");
                        text12.setId("textWhite");
                        spNawigacjaNapis.getChildren().add(text12);

                    StackPane spNawigacjaMenu = new StackPane();
                    vbNawigacja.getChildren().add(spNawigacjaMenu);
                        VBox vbNawigacjaPaski = new VBox();
                        spNawigacjaMenu.getChildren().add(vbNawigacjaPaski);
                            for(int i = 0; i<95; i++)
                                vbNawigacjaPaski.getChildren().add(new ImageView("/images/m2.gif"));
                        HBox hbNawigacjaWypunktowanie = new HBox();
                        spNawigacjaMenu.getChildren().add(hbNawigacjaWypunktowanie);
                            VBox vbNawigacjaStrzalki = new VBox();
                            vbNawigacjaStrzalki.setSpacing(20);
                            vbNawigacjaStrzalki.setPadding(new Insets(17,3,10,20));
                            hbNawigacjaWypunktowanie.getChildren().add(vbNawigacjaStrzalki);
                                for(int i = 0; i<6; i++)
                                    vbNawigacjaStrzalki.getChildren().add(new ImageView("/images/arrow.jpg"));
                            VBox vbNawigacjaNapisy = new VBox();
                            vbNawigacjaNapisy.setSpacing(12);
                            vbNawigacjaNapisy.setPadding(new Insets(12,5,5,5));
                            hbNawigacjaWypunktowanie.getChildren().add(vbNawigacjaNapisy);
                                Label text13 = new Label("Strona główna");
                                Label text14 = new Label("Oferta");
                                Label text15 = new Label("Cennik");
                                Label text16 = new Label("Sklep online");
                                Label text17 = new Label("O nas");
                                Label text18 = new Label("Kontakt");
                                vbNawigacjaNapisy.getChildren().addAll(text13, text14, text15, text16, text17, text18);
                    vbNawigacja.getChildren().add(new ImageView("/images/m3.gif"));

                VBox vbSzablon = new VBox();
                vbLewy.getChildren().add(vbSzablon);

                    vbSzablon.getChildren().add(new ImageView("/images/m1.gif"));

                    StackPane spSzablonNapis = new StackPane();

                    VBox vbNiceLookinStuff2 = new VBox();
                    spSzablonNapis.getChildren().add(vbNiceLookinStuff2);
                    for(int i=0; i<20; i++)
                        vbNiceLookinStuff2.getChildren().add(new ImageView("/images/m2.gif"));

                    vbSzablon.getChildren().add(spSzablonNapis);
                        spSzablonNapis.getChildren().add(new ImageView("/images/mng.jpg"));
                        Label text19 = new Label("SZABLON ZGODNY Z XHTML");
                        text19.setId("textWhite");
                        spSzablonNapis.getChildren().add(text19);

                    StackPane spSzablonMenu = new StackPane();
                    vbSzablon.getChildren().add(spSzablonMenu);
                        VBox vbSzablonPaski = new VBox();
                        spSzablonMenu.getChildren().add(vbSzablonPaski);
                        for(int i = 0; i<13; i++)
                            vbSzablonPaski.getChildren().add(new ImageView("/images/m2.gif"));

                        HBox hbSzablonValid = new HBox();
                        hbSzablonValid.setAlignment(Pos.TOP_CENTER);
                        hbSzablonValid.setPadding(new Insets(3));
                        spSzablonMenu.getChildren().add(hbSzablonValid);
                            Label text20 = new Label("Valid XHTLM 1.0 Transitional");
                            text20.setId("textBlue");
                            hbSzablonValid.getChildren().addAll(new ImageView("/images/path.jpg"), text20);

                    vbSzablon.getChildren().add(new ImageView("/images/m3.gif"));

            VBox vbPrawy = new VBox();
            hbBigAndScary.getChildren().add(vbPrawy);

                vbPrawy.getChildren().add(new ImageView("/images/s1.gif"));

                StackPane spTresc = new StackPane();
                vbPrawy.getChildren().add(spTresc);

                    VBox vbTrescPaski = new VBox();
                    spTresc.getChildren().add(vbTrescPaski);
                        //for(int i = 0; i<333; i++)
                        for(int i = 0; i<420; i++)
                            vbTrescPaski.getChildren().add(new ImageView("/images/s2.gif"));

                    VBox vbTrescContainer = new VBox();
                    spTresc.getChildren().add(vbTrescContainer);

                        StackPane spTrescNaglowek = new StackPane();
                        spTrescNaglowek.setPadding(new Insets(7, 0,0,0));
                        vbTrescContainer.getChildren().add(spTrescNaglowek);

                            spTrescNaglowek.getChildren().add(new ImageView("/images/ngbg.jpg"));
                            HBox hbTextNaglowek = new HBox();
                            hbTextNaglowek.setAlignment(Pos.CENTER_LEFT);
                            hbTextNaglowek.setPadding(new Insets(0,0,10,90));
                            spTrescNaglowek.getChildren().add(hbTextNaglowek);
                                Label text21 = new Label("Nagłówek podstrony");
                                text21.setId("textOrange");
                                hbTextNaglowek.getChildren().add(text21);

                        HBox hbTrescTekst1 = new HBox();
                        hbTrescTekst1.setPadding(new Insets(20,0,0,40));
                        vbTrescContainer.getChildren().add(hbTrescTekst1);
                            Label text22 = new Label("Donec hendrerit convallis felis, mollis volutpat enim semper non. Ut lacinia est in odio posuere non " +
                                    "ultrices dui adipiscing.\nEtiam eleifend tortor ac lorem tempor eget porta est imperdiet. Quisque a " +
                                    "accumsan elit. Nam ut orci risus. Curabitur id\npellentesque mauris. Sed nulla mauris, imperdiet et " +
                                    "sodales at, facilisis ac mauris. Lorem ipsum dolor sit amet, consectetur\nadipiscing elit. Mauris semper," +
                                    "felis non volutpat pharetra, sem libero tincidunt orci, id pulvinar tortor eros quis orci. In\nullamcorper" +
                                    "nisl et mauris laoreet egestas. Morbi venenatis venenatis nisi, et facilisis leo pulvinar in. Nullam" +
                                    "consectetur\nsagittis lorem.");
                            text22.setId("textLong");
                            hbTrescTekst1.getChildren().add(text22);

                        StackPane spTrescZdjecia = new StackPane();
                        spTrescZdjecia.setPadding(new Insets(7, 0,0,0));
                        vbTrescContainer.getChildren().add(spTrescZdjecia);

                            spTrescZdjecia.getChildren().add(new ImageView("/images/ngbg.jpg"));
                            HBox hbTextLogoZdjecia = new HBox();
                            hbTextLogoZdjecia.setAlignment(Pos.CENTER_LEFT);
                            hbTextLogoZdjecia.setPadding(new Insets(0,0,10,90));
                            spTrescZdjecia.getChildren().add(hbTextLogoZdjecia);
                                Label text23 = new Label("Przykładowe zdjęcia");
                                text23.setId("textOrange");
                                hbTextLogoZdjecia.getChildren().add(text23);


                    HBox hbTrescZdjecia = new HBox();
                    hbTrescZdjecia.setAlignment(Pos.BASELINE_CENTER);
                    hbTrescZdjecia.setSpacing(5);
                    hbTrescZdjecia.setPadding(new Insets(15));
                    vbTrescContainer.getChildren().add(hbTrescZdjecia);
                        hbTrescZdjecia.getChildren().addAll(new ImageView("/zad21/img1.jpg"),
                                                            new ImageView("/zad21/img2.jpg"),
                                                            new ImageView("/zad21/img3.jpg"),
                                                            new ImageView("/zad21/img4.jpg")
                                                             );

                    HBox hbTrescTekst2 = new HBox();
                    hbTrescTekst2.setPadding(new Insets(15,0,0,40));
                    vbTrescContainer.getChildren().add(hbTrescTekst2);
                        Label text24 = new Label("Sed condimentum imperdiet est, a malesuada diam laoreet lacinia. Aenean hendrerit ornare nisl quis " +
                                "lacinia. Integer\niaculis bibendum neque nec tristique. Class aptent taciti sociosqu ad litora torquent per " +
                                "conubia nostra, per inceptos\nhimenaeos. Suspendisse cursus iaculis elit eu suscipit. Donec enim lorem, " +
                                "imperdiet sed lacinia dictum, pulvinar at sem.\nCurabitur nisi nisl, imperdiet non elementum sed, auctor " +
                                "cursus mauris.");
                        text22.setId("textLong");
                        hbTrescTekst2.getChildren().add(text24);





                vbPrawy.getChildren().add(new ImageView("/images/s3.gif"));

        //STOPKA
        container.getChildren().add(new ImageView("/images/d.jpg"));

        Scene scene = new Scene(container);
        scene.getStylesheets().addAll(this.getClass().getResource("/zad21/styles.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Apka");
        stage.show();
    }

    public static void main (String[]args){
        launch(args);
    }
}