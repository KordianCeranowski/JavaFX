import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


@SuppressWarnings("Duplicates")
public class Zad22 extends Application {

    Connection connection;

    public void start(Stage stage) throws Exception {

        StackPane spContainer = new StackPane();
        Scene sceneStore = new Scene(spContainer);

        ImageView ivBackground = new ImageView("img/background2.jpg");
        ivBackground.setFitHeight(604);
        ivBackground.setFitWidth(1000);
        spContainer.getChildren().add(ivBackground);

        VBox container = new VBox();
        container.setId("container");
        spContainer.getChildren().add(container);

            HBox hbFront = new HBox(20);
            hbFront.setAlignment(Pos.CENTER_LEFT);
            hbFront.setPadding(new Insets(12));
            container.getChildren().add(hbFront);

                ImageView ivLogo = new ImageView("img/kawaNaLawe.jpg");
                ivLogo.setFitHeight(100);
                ivLogo.setFitWidth(150);
                ivLogo.setPreserveRatio(true);
                hbFront.getChildren().add(ivLogo);

                Label lTitle = new Label("Kawa na Jawie");
                lTitle.setId("title");
                hbFront.getChildren().add(lTitle);

                Region stuffFront = new Region();
                hbFront.getChildren().add(stuffFront);
                hbFront.setHgrow(stuffFront, Priority.ALWAYS);

                HBox hbFrontRight = new HBox();
                hbFrontRight.setPadding(new Insets(10));
                hbFrontRight.setMinWidth(275);
                hbFront.getChildren().add(hbFrontRight);

                    ImageView ivCart = new ImageView("img/Cart.png");
                    ivCart.setFitHeight(60);
                    ivCart.setFitWidth(100);
                    hbFrontRight.getChildren().add(ivCart);

                    Region stuffFrontRight = new Region();
                    hbFrontRight.setHgrow(stuffFrontRight, Priority.ALWAYS);
                    hbFrontRight.getChildren().add(stuffFrontRight);

                    VBox vbMoney = new VBox(10);
                    vbMoney.setPadding(new Insets(5));
                    vbMoney.setAlignment(Pos.TOP_RIGHT);
                    hbFrontRight.getChildren().add(vbMoney);

                        Label lMoney = new Label("0.00 PLN / 0 szt.");
                        vbMoney.getChildren().add(lMoney);
                        lMoney.setId("money");


                        Button bOproznij = new Button();
                        vbMoney.getChildren().add(bOproznij);
                            ImageView ivOproznij = new ImageView("img/oproznij.png");
                            ivOproznij.setFitHeight(35);
                            ivOproznij.setFitWidth(113);
                            bOproznij.setGraphic(ivOproznij);



            VBox vbMainMenu = new VBox();
            container.getChildren().add(vbMainMenu);

                HBox hbBanner = new HBox();
                vbMainMenu.getChildren().add(hbBanner);

                    ImageView ivBanner = new ImageView("img/baner2.jpg");
                    ivBanner.setFitHeight(125);
                    ivBanner.setFitWidth(1000);
                    hbBanner.getChildren().add(ivBanner);

                HBox hbCategories = new HBox(25);
                hbCategories.setPadding(new Insets(33,15,13,15));
                hbCategories.setAlignment(Pos.CENTER);
                vbMainMenu.getChildren().add(hbCategories);

                    int CatHeight = 180;
                    int CatWidth = 260;

                    HBox hbCat_1 = new HBox();
                    hbCat_1.setPadding(new Insets(15));
                    hbCategories.getChildren().add(hbCat_1);

                        Button bCat_1 = new Button();
                            ImageView ivCat_1 = new ImageView("img/beansCat.jpg");
                            ivCat_1.setId("categoryImage");
                            ivCat_1.setFitHeight(CatHeight);
                            ivCat_1.setFitWidth(CatWidth);
                        bCat_1.setGraphic(ivCat_1);
                        hbCat_1.getChildren().add(bCat_1);

                    HBox hbCat_2 = new HBox();
                    hbCat_2.setPadding(new Insets(15));
                    hbCategories.getChildren().add(hbCat_2);

                        Button bCat_2 = new Button();
                            ImageView ivCat_2 = new ImageView("img/kafetierre.jpg");
                            ivCat_2.setId("categoryImage");
                            ivCat_2.setFitHeight(CatHeight);
                            ivCat_2.setFitWidth(CatWidth);
                        bCat_2.setGraphic(ivCat_2);
                        hbCat_2.getChildren().add(bCat_2);

                    HBox hbCat_3 = new HBox();
                    hbCat_3.setPadding(new Insets(15));
                    hbCategories.getChildren().add(hbCat_3);

                        Button bCat_3 = new Button();
                            ImageView ivCat_3 = new ImageView("img/grindersCat.jpg");
                            ivCat_3.setId("categoryImage");
                            ivCat_3.setFitHeight(CatHeight);
                            ivCat_3.setFitWidth(CatWidth);
                        bCat_3.setGraphic(ivCat_3);
                        hbCat_3.getChildren().add(bCat_3);


                HBox hbFooter = new HBox();
                hbFooter.setPadding(new Insets(10,5,0,5));
                vbMainMenu.getChildren().add(hbFooter);

                    HBox hbPost = new HBox(10);
                    hbPost.setPadding(new Insets(0,5,4,5));
                    hbPost.setAlignment(Pos.CENTER_LEFT);
                    hbFooter.getChildren().add(hbPost);

                        Button bPost = new Button();
                        bPost.setId("buttonNoBorder");
                            ImageView ivPost = new ImageView("img/poczta.png");
                            ivPost.setFitHeight(50);
                            ivPost.setFitWidth(100);
                        bPost.setGraphic(ivPost);
                        hbPost.getChildren().add(bPost);

                        Label lPost = new Label("Napisz do nas");
                        lPost.setStyle("-fx-font-size: 13px; -fx-text-fill: white;");

                        hbPost.getChildren().add(lPost);

                    Region stuffPost = new Region();
                    hbFooter.getChildren().add(stuffPost);
                    hbFooter.setHgrow(stuffPost, Priority.ALWAYS);

                    Button bFaktura = new Button();
                    bFaktura.setId("buttonNoBorder");
                        ImageView ivFaktura = new ImageView("img/faktura.png");
                        ivFaktura.setFitHeight(50);
                        ivFaktura.setFitWidth(115);
                    bFaktura.setGraphic(ivFaktura);
                    hbFooter.getChildren().add(bFaktura);


            int productHeight = 120;
            int productWidth = 120;
            Button bBackToMenu = new Button("Powrót");
            Button bAddToCart = new Button("Dodaj do Koszyka");

            TextField[] tfProd = new TextField[9];
            for(int i = 0; i<9; i++){
                tfProd[i] = new TextField();
                tfProd[i].setId("textFieldProduct");
                tfProd[i].setOnKeyTyped(e->{
                    if(!e.getCharacter().matches("[0-9]"))
                        e.consume();
                });
            }

            Label[] lProd = new Label[9];
            for(int i = 0; i<9; i++){
                lProd[i] = new Label();
                lProd[i].setId("productDesc");
            }

            GridPane gpBeans = new GridPane();
            gpBeans.setId("gridPanes");

                ImageView ivProduct1 = new ImageView("img/products/1.jpg");
                ivProduct1.setFitWidth(productWidth);
                ivProduct1.setFitHeight(productHeight);
                ImageView ivProduct2 = new ImageView("img/products/2.jpg");
                ivProduct2.setFitWidth(productWidth);
                ivProduct2.setFitHeight(productHeight);
                ImageView ivProduct3 = new ImageView("img/products/3.jpg");
                ivProduct3.setFitWidth(productWidth);
                ivProduct3.setFitHeight(productHeight);
                gpBeans.add(ivProduct1,1, 1);
                gpBeans.add(ivProduct2,1, 3);
                gpBeans.add(ivProduct3,1, 5);

                gpBeans.add(lProd[0], 2, 1);
                gpBeans.add(lProd[1], 2, 3);
                gpBeans.add(lProd[2], 2, 5);

                gpBeans.add(tfProd[0],3, 1);
                gpBeans.add(tfProd[1],3, 3);
                gpBeans.add(tfProd[2],3, 5);

            GridPane gpBrewers = new GridPane();
            gpBrewers.setId("gridPanes");

                ImageView ivProduct4 = new ImageView("img/products/4.jpg");
                ivProduct4.setFitWidth(productWidth);
                ivProduct4.setFitHeight(productHeight);
                ImageView ivProduct5 = new ImageView("img/products/5.jpg");
                ivProduct5.setFitWidth(productWidth);
                ivProduct5.setFitHeight(productHeight);
                ImageView ivProduct6 = new ImageView("img/products/6.jpg");
                ivProduct6.setFitWidth(productWidth);
                ivProduct6.setFitHeight(productHeight);
                gpBrewers.add(ivProduct4,1, 1);
                gpBrewers.add(ivProduct5,1, 3);
                gpBrewers.add(ivProduct6,1, 5);

                gpBrewers.add(lProd[3], 2, 1);
                gpBrewers.add(lProd[4], 2, 3);
                gpBrewers.add(lProd[5], 2, 5);

                gpBrewers.add(tfProd[3],3, 1);
                gpBrewers.add(tfProd[4],3, 3);
                gpBrewers.add(tfProd[5],3, 5);

            GridPane gpGrinders = new GridPane();
            gpGrinders.setId("gridPanes");

                ImageView ivProduct7 = new ImageView("img/products/7.jpg");
                ivProduct7.setFitWidth(productWidth);
                ivProduct7.setFitHeight(productHeight);
                ImageView ivProduct8 = new ImageView("img/products/8.jpg");
                ivProduct8.setFitWidth(productWidth);
                ivProduct8.setFitHeight(productHeight);
                ImageView ivProduct9 = new ImageView("img/products/9.jpg");
                ivProduct9.setFitWidth(productWidth);
                ivProduct9.setFitHeight(productHeight);
                gpGrinders.add(ivProduct7,1, 1);
                gpGrinders.add(ivProduct8,1, 3);
                gpGrinders.add(ivProduct9,1, 5);

                gpGrinders.add(lProd[6], 2, 1);
                gpGrinders.add(lProd[7], 2, 3);
                gpGrinders.add(lProd[8], 2, 5);

                gpGrinders.add(tfProd[6],3, 1);
                gpGrinders.add(tfProd[7],3, 3);
                gpGrinders.add(tfProd[8],3, 5);


            Label lBrakTowaru = new Label("Brak dostatecznych ilości\n wybranego towaru");
            lBrakTowaru.setWrapText(true);
            lBrakTowaru.setStyle("-fx-font-size: 20px; -fx-text-fill: white");
            lBrakTowaru.setOnMouseEntered(e->{
                if(gpBeans.getChildren().contains(lBrakTowaru))
                    gpBeans.getChildren().remove(lBrakTowaru);
                else if(gpBrewers.getChildren().contains(lBrakTowaru))
                    gpBrewers.getChildren().remove(lBrakTowaru);
                else if(gpGrinders.getChildren().contains(lBrakTowaru))
                    gpGrinders.getChildren().remove(lBrakTowaru);
            });
            int rowBrakTowaru = 1;
            int columnBrakTowaru = 13;






        int columnOfBackButton = 13;
        int rowOfBackButton = 5;
        bCat_1.setId("buttonNoBorder");
        bCat_2.setId("buttonNoBorder");
        bCat_3.setId("buttonNoBorder");

        bCat_1.setOnAction(e -> {
            lProd[0].setText(SETTINGS.names[0] + "\n" + String.format("%.2f", SETTINGS.prices[0]) + " zł\nW magazynie: " + SETTINGS.inStock[0]);
            lProd[1].setText(SETTINGS.names[1] + "\n" + String.format("%.2f", SETTINGS.prices[1]) + " zł\nW magazynie: " + SETTINGS.inStock[1]);
            lProd[2].setText(SETTINGS.names[2] + "\n" + String.format("%.2f", SETTINGS.prices[2]) + " zł\nW magazynie: " + SETTINGS.inStock[2]);
            container.getChildren().remove(vbMainMenu);
            container.getChildren().add(gpBeans);
            gpBeans.add(bBackToMenu, columnOfBackButton, rowOfBackButton );
            gpBeans.add(bAddToCart, columnOfBackButton,rowOfBackButton -2);
        });

        bCat_2.setOnAction(e -> {
            lProd[3].setText(SETTINGS.names[3] + "\n" + String.format("%.2f", SETTINGS.prices[3]) + " zł\nW magazynie: " + SETTINGS.inStock[3]);
            lProd[4].setText(SETTINGS.names[4] + "\n" + String.format("%.2f", SETTINGS.prices[4]) + " zł\nW magazynie: " + SETTINGS.inStock[4]);
            lProd[5].setText(SETTINGS.names[5] + "\n" + String.format("%.2f", SETTINGS.prices[5]) + " zł\nW magazynie: " + SETTINGS.inStock[5]);
            container.getChildren().remove(vbMainMenu);
            container.getChildren().add(gpBrewers);
            gpBrewers.add(bBackToMenu, columnOfBackButton, rowOfBackButton );
            gpBrewers.add(bAddToCart, columnOfBackButton,rowOfBackButton -2);

        });

        bCat_3.setOnAction(e -> {
            lProd[6].setText(SETTINGS.names[6] + "\n" + String.format("%.2f", SETTINGS.prices[6]) + " zł\nW magazynie: " + SETTINGS.inStock[6]);
            lProd[7].setText(SETTINGS.names[7] + "\n" + String.format("%.2f", SETTINGS.prices[7]) + " zł\nW magazynie: " + SETTINGS.inStock[7]);
            lProd[8].setText(SETTINGS.names[8] + "\n" + String.format("%.2f", SETTINGS.prices[8]) + " zł\nW magazynie: " + SETTINGS.inStock[8]);
            container.getChildren().remove(vbMainMenu);
            container.getChildren().add(gpGrinders);
            gpGrinders.add(bBackToMenu, columnOfBackButton, rowOfBackButton );
            gpGrinders.add(bAddToCart, columnOfBackButton,rowOfBackButton -2);
        });



        Cart cart = new Cart();

        bOproznij.setId("buttonNoBorder");
        bOproznij.setOnAction(e -> {
            cart.empty();
            for(int j=0; j<9; j++)
                lProd[j].setText(SETTINGS.names[j] + "\n" + String.format("%.2f", SETTINGS.prices[j]) + " zł\nW magazynie: " + SETTINGS.inStock[j]);

            lMoney.setText(cart.sumOfPurchases() + " PLN / " + cart.countOfProducts() + " szt.");
        });

        bAddToCart.setOnAction(e -> {
            if(gpBeans.getChildren().contains(lBrakTowaru))
                gpBeans.getChildren().remove(lBrakTowaru);
            else if(gpBrewers.getChildren().contains(lBrakTowaru))
                gpBrewers.getChildren().remove(lBrakTowaru);
            else if(gpGrinders.getChildren().contains(lBrakTowaru))
                gpGrinders.getChildren().remove(lBrakTowaru);

            for(int j = 0; j<9; j++){
                if(!tfProd[j].getText().matches("")){
                    if(Integer.parseInt(tfProd[j].getText()) <= SETTINGS.inStock[j]){
                        int x = Integer.parseInt(tfProd[j].getText());
                        for(int i = 0; i < x; i++ ){
                            cart.add(j);
                            SETTINGS.takeFromStock(j);
                        }
                    }
                    else {
                        if (container.getChildren().contains(gpBeans)) {
                            if (!gpBeans.getChildren().contains(lBrakTowaru))
                                gpBeans.add(lBrakTowaru, columnBrakTowaru, rowBrakTowaru);
                        }
                        if(container.getChildren().contains(gpBrewers)){
                            if(!gpBrewers.getChildren().contains(lBrakTowaru))
                                gpBrewers.add(lBrakTowaru, columnBrakTowaru, rowBrakTowaru);
                        }
                        if (container.getChildren().contains(gpGrinders)) {
                            if (!gpGrinders.getChildren().contains(lBrakTowaru))
                                gpGrinders.add(lBrakTowaru, columnBrakTowaru, rowBrakTowaru);
                        }
                    }
                    tfProd[j].setText("");
                    lProd[j].setText(SETTINGS.names[j] + "\n" + String.format("%.2f", SETTINGS.prices[j]) + " zł\nW magazynie: " + SETTINGS.inStock[j]);
                }
            }
            lMoney.setText(cart.sumOfPurchases() + " PLN / " + cart.countOfProducts() + " szt.");
        });

        bBackToMenu.setOnAction(e -> {
            if(gpBeans.getChildren().contains(lBrakTowaru))
                gpBeans.getChildren().remove(lBrakTowaru);
            else if(gpBrewers.getChildren().contains(lBrakTowaru))
                gpBrewers.getChildren().remove(lBrakTowaru);
            else if(gpGrinders.getChildren().contains(lBrakTowaru))
                gpGrinders.getChildren().remove(lBrakTowaru);

            if(container.getChildren().contains(gpBeans)) {
                container.getChildren().remove(gpBeans);
                gpBeans.getChildren().removeAll(bBackToMenu, bAddToCart);
                tfProd[0].setText("");
                tfProd[1].setText("");
                tfProd[2].setText("");
            }
            else if(container.getChildren().contains(gpBrewers)) {
                container.getChildren().remove(gpBrewers);
                gpBrewers.getChildren().removeAll(bBackToMenu, bAddToCart);
                tfProd[3].setText("");
                tfProd[4].setText("");
                tfProd[5].setText("");
            }
            else if(container.getChildren().contains(gpGrinders)){
                container.getChildren().remove(gpGrinders);
                gpGrinders.getChildren().removeAll(bBackToMenu, bAddToCart);
                tfProd[6].setText("");
                tfProd[7].setText("");
                tfProd[8].setText("");
            }
            lMoney.setText(cart.sumOfPurchases() + " PLN / " + cart.countOfProducts() + " szt.");
            container.getChildren().add(vbMainMenu);
        });




        VBox vbInvoice = new VBox();
        vbInvoice.setMinSize(1000,604);
        vbInvoice.setPadding(new Insets(60, 50,10 ,50));
        vbInvoice.setId("invoice");
        vbInvoice.setAlignment(Pos.TOP_CENTER);
        StackPane spInvoice = new StackPane();
            ImageView ivInvoiceBackground = new ImageView("img/background2.jpg");
            ivInvoiceBackground.setFitHeight(604);
            ivInvoiceBackground.setFitWidth(1000);
            spInvoice.getChildren().add(ivInvoiceBackground);
        spInvoice.getChildren().add(vbInvoice);
        Scene sceneInvoice = new Scene(spInvoice);

            Label lInvoiceName = new Label("FAKTURA");
            lInvoiceName.setId("invoiceName");
            lInvoiceName.setStyle("-fx-text-fill: white");
            HBox hbInvoiceProducts = new HBox();
            hbInvoiceProducts.setId("invoiceProducts");
            vbInvoice.getChildren().addAll(lInvoiceName, hbInvoiceProducts);
                VBox vbInvoiceProdName = new VBox();
                vbInvoiceProdName.setId("invoiceTable");
                VBox vbInvoiceProdPrice = new VBox();
                vbInvoiceProdPrice.setId("invoiceTable");
                VBox vbInvoiceProdQuantity = new VBox();
                vbInvoiceProdQuantity.setId("invoiceTable");
                VBox vbInvoiceProdSum = new VBox();
                vbInvoiceProdSum.setId("invoiceTable");

                hbInvoiceProducts.getChildren().addAll(vbInvoiceProdName, vbInvoiceProdPrice, vbInvoiceProdQuantity, vbInvoiceProdSum);
            HBox hbInvoiceSummary = new HBox();
            hbInvoiceSummary.setId("summary");
            vbInvoice.getChildren().add(hbInvoiceSummary);
            hbInvoiceSummary.setAlignment(Pos.BASELINE_RIGHT);
            hbInvoiceSummary.setPadding(new Insets(0,30,0,0));
            HBox hbInvoiceButtons = new HBox();
            hbInvoiceButtons.setId("summary");
            hbInvoiceButtons.setAlignment(Pos.BASELINE_RIGHT);
            hbInvoiceButtons.setPadding(new Insets(15,30,0,0));
            vbInvoice.getChildren().add(hbInvoiceButtons);
                Button bInvoiceAccept = new Button("Akceptuj");
                Button bInvoiceReject = new Button("Wróć");
                hbInvoiceButtons.getChildren().addAll(bInvoiceReject, bInvoiceAccept);

                //to jest ten dobry error
        Label lInvoiceError = new Label("Twój Koszyk jest pusty");
        lInvoiceError.setStyle("-fx-font-size: 27px; -fx-text-fill: white;  -fx-font-weight: bold");
        lInvoiceError.setOnMouseEntered(e->{
            spContainer.getChildren().remove(lInvoiceError);
        });


        bFaktura.setOnAction( e-> {
            if(cart.countOfProducts() == 0){
                if(!spContainer.getChildren().contains(lInvoiceError))
                    spContainer.getChildren().add(lInvoiceError);
            }
            else {
//                if (!hbInvoiceButtons.getChildren().contains(bInvoiceAccept))
//                    hbInvoiceButtons.getChildren().add(bInvoiceAccept);

//                if (hbInvoiceProducts.getChildren().contains(lInvoiceIsEmpty))
//                    hbInvoiceProducts.getChildren().remove(lInvoiceIsEmpty);

                int[] invoiceData = cart.generateInvoiceData();
                vbInvoiceProdName.getChildren().clear();
                vbInvoiceProdPrice.getChildren().clear();
                vbInvoiceProdQuantity.getChildren().clear();
                vbInvoiceProdSum.getChildren().clear();


                for (int i = 0; i < 9; i++) {
                    if (invoiceData[i] != 0) {
                        vbInvoiceProdName.getChildren().add(new Label(SETTINGS.names[i]));
                        vbInvoiceProdPrice.getChildren().add(new Label(String.format("%.2f", SETTINGS.prices[i]) + " PLN"));
                        vbInvoiceProdQuantity.getChildren().add(new Label("" + invoiceData[i] + " szt."));
                        vbInvoiceProdSum.getChildren().add(new Label(": " + String.format("%.2f", invoiceData[i] * SETTINGS.prices[i]) + " PLN"));
                    }
                }

                hbInvoiceSummary.getChildren().clear();
                Label lInvoiceSummary = new Label("Łącznie do zapłaty: " + cart.sumOfPurchases() + " PLN");
                lInvoiceSummary.setStyle("-fx-text-fill: white");
                hbInvoiceSummary.getChildren().add(lInvoiceSummary);


                for (int i=0; i<cart.countOfDifferentProducts(); i++){
                    vbInvoiceProdName.getChildren().get(i).setStyle("-fx-text-fill: white");
                    vbInvoiceProdPrice.getChildren().get(i).setStyle("-fx-text-fill: white");
                    vbInvoiceProdQuantity.getChildren().get(i).setStyle("-fx-text-fill: white");
                    vbInvoiceProdSum.getChildren().get(i).setStyle("-fx-text-fill: white");
                }



                stage.setScene(sceneInvoice);
            }
        });

        bInvoiceReject.setOnAction(e-> {
            stage.setScene(sceneStore);
        });

        Label lInvoiceThanks = new Label("Dziękujemy za zakupy");
        lInvoiceThanks.setWrapText(true);
        lInvoiceThanks.setStyle("-fx-font-size: 70px; -fx-text-fill: ghostwhite");

        lInvoiceThanks.setOnMouseEntered(e->{
            spContainer.getChildren().remove(lInvoiceThanks);
        });

        bInvoiceAccept.setOnAction(e->{
            try{
                int[] invoiceData = cart.generateInvoiceData();

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;" +
                                "databaseName=" + SETTINGS.databaseName + ";" +
                                "user=" + SETTINGS.user + ";" +
                                "password=" + SETTINGS.password + ";"
                );

                Statement query = connection.createStatement();
                query.executeUpdate(
                        "INSERT INTO zakup" +
                                " VALUES ("
                                +  invoiceData[0] + ", "
                                +  invoiceData[1] + ", "
                                +  invoiceData[2] + ", "
                                +  invoiceData[3] + ", "
                                +  invoiceData[4] + ", "
                                +  invoiceData[5] + ", "
                                +  invoiceData[6] + ", "
                                +  invoiceData[7] + ", "
                                +  invoiceData[8] + ", "
                                +  cart.sumOfPurchasesDouble() + ", "
                                +  "getdate()"
                                + ")"
                );
                query.close();
                connection.close();
            }
            catch(SQLException sqle) {
                System.out.println(sqle);}
            catch(ClassNotFoundException d) {
                System.out.println("Brak sterownika");}


            spContainer.getChildren().add(lInvoiceThanks);
            stage.setScene(sceneStore);
            lMoney.setText("0.00 PLN / 0 szt.");
            cart.buy();

        });

        VBox vbMessage = new VBox();
        StackPane spMessage = new StackPane();
        ImageView ivMessageBackground = new ImageView("/img/background2.jpg");
        ivMessageBackground.setFitWidth(1000);
        ivMessageBackground.setFitHeight(604);
        spMessage.getChildren().add(ivMessageBackground);
        spMessage.getChildren().add(vbMessage);
            vbMessage.setId("message");
            vbMessage.setPadding(new Insets(110,75,75,75));
            Scene sceneMessage = new Scene(spMessage);
            bPost.setOnAction(e->{
                stage.setScene(sceneMessage);
            });

            Label lMessageWyslij = new Label("Wyślij wiadomość");
            lMessageWyslij.setStyle("-fx-text-fill: white");
            vbMessage.getChildren().add(lMessageWyslij);

            HBox hbMessageContents = new HBox();
            hbMessageContents.setStyle("-fx-text-fill: white");
            hbMessageContents.setPadding(new Insets(0,0,0,20));
            vbMessage.getChildren().add(hbMessageContents);
                VBox vbMessageLabels = new VBox();
                vbMessageLabels.setAlignment(Pos.TOP_RIGHT);
                vbMessageLabels.setId("messageLabels");
                vbMessageLabels.setPadding(new Insets(0,15,0,0));
                Label lMessageEmail = new Label("email: ");
                lMessageEmail.setStyle("-fx-text-fill: white");
                Label lMessageWiadomosc = new Label("Wiadomość:");
                lMessageWiadomosc.setStyle("-fx-text-fill: white");
                    vbMessageLabels.getChildren().addAll(lMessageEmail, lMessageWiadomosc);

                VBox vbMessageTextFields = new VBox(15);
                    TextField tfMessageEmail = new TextField();
                    tfMessageEmail.setMaxWidth(180);
                    TextArea tfMessageContent = new TextArea();
                    tfMessageContent.setMinSize(250,180);
                    tfMessageContent.setWrapText(true);
                    tfMessageContent.setPadding(new Insets(5));


                    vbMessageTextFields.getChildren().addAll(tfMessageEmail, tfMessageContent);
                hbMessageContents.getChildren().addAll(vbMessageLabels, vbMessageTextFields);

            HBox hbMessageButtons = new HBox();
            hbMessageButtons.setAlignment(Pos.CENTER_RIGHT);
            hbMessageButtons.setId("summary");
            vbMessage.getChildren().add(hbMessageButtons);
                Button bMessageHide = new Button("Ukryj");
                bMessageHide.setOnAction(e->{
                    stage.setScene(sceneStore);
                    stage.setScene(sceneMessage);
                    stage.setScene(sceneStore);
                });
                hbMessageButtons.getChildren().add(bMessageHide);

                Button bMessageClear = new Button("Wyczyść");
                bMessageClear.setOnAction(e->{
                    tfMessageEmail.clear();
                    tfMessageContent.clear();
                });
                hbMessageButtons.getChildren().add(bMessageClear);

        Label lMessageError = new Label("Podany email nie jest prawidłowy");
        lMessageError.setWrapText(true);
        lMessageError.setStyle("-fx-font-size: 20px");
        lMessageError.setOnMouseEntered(e->{
            spMessage.getChildren().remove(lMessageError);
        });

        Label lMessageSuccess = new Label("Poprawnie wysłano");
        lMessageSuccess.setWrapText(true);
        lMessageSuccess.setStyle("-fx-font-size: 30px");
        lMessageSuccess.setOnMouseEntered(e->{
            spMessage.getChildren().remove(lMessageSuccess);
        });

                Button bMessageSend = new Button("Wyślij");
                bMessageSend.setOnAction(e->{
                    if(tfMessageEmail.getText().matches(".+@.+\\..+")){
                        try{
                            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                            connection = DriverManager.getConnection(
                                "jdbc:sqlserver://localhost:1433;" +
                                    "databaseName=" + SETTINGS.databaseName + ";" +
                                    "user=" + SETTINGS.user + ";" +
                                    "password=" + SETTINGS.password + ";"
                            );
                            Statement query = connection.createStatement();
                            query.executeUpdate(
                                "INSERT INTO wiadomosc" +
                                    " VALUES ('"+  tfMessageEmail.getText()+ "', '" + tfMessageContent.getText() + "')"
                                    );
                            query.close();
                            connection.close();
                            spMessage.getChildren().add(lMessageSuccess);
                            tfMessageEmail.clear();
                            tfMessageContent.clear();
                        }
                        catch(SQLException sqle) {
                            System.out.println(sqle);}
                        catch(ClassNotFoundException d) {
                            System.out.println("Brak sterownika");}
                    }
                    else {
                        if(!spMessage.getChildren().contains(lMessageError))
                            spMessage.getChildren().add(lMessageError);
                    }
                });
                hbMessageButtons.getChildren().add(bMessageSend);

        sceneMessage.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
        sceneInvoice.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
        sceneStore.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());


        stage.setScene(sceneStore);
        stage.getIcons().add(new Image("/img/marmaid.png"));
        stage.setTitle("Sklepik");
        stage.show();
        //stage.setResizable(false);
    }

    public static void main (String[]args){
        if(SETTINGS.inStock.length == 9 && SETTINGS.names.length == 9 && SETTINGS.prices.length == 9)
            launch(args);
        else
            System.out.println("Popraw dane w SETTINGS");
    }
}

