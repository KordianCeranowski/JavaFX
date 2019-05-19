import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


@SuppressWarnings("Duplicates")
public class Zad22 extends Application {

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
        container.setPadding(new Insets(0));

            HBox hbFront = new HBox(20);
            hbFront.setAlignment(Pos.CENTER_LEFT);
            hbFront.setPadding(new Insets(0,0,0,15));
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

                VBox vbFront_Right = new VBox(10);
                vbFront_Right.setPadding(new Insets(10));
                vbFront_Right.setAlignment(Pos.CENTER_RIGHT);
                hbFront.getChildren().add(vbFront_Right);

                    HBox hbFront_Right_Cart = new HBox(10);
                    hbFront_Right_Cart.setPadding(new Insets(10));
                    hbFront_Right_Cart.setAlignment(Pos.CENTER_LEFT);
                    vbFront_Right.getChildren().add(hbFront_Right_Cart);

                        ImageView ivCart = new ImageView("img/Cart.png");
                        ivCart.setFitHeight(40);
                        ivCart.setFitWidth(80);
                        hbFront_Right_Cart.getChildren().add(ivCart);

                        Label lMoney = new Label("0.00 PLN  /  0 szt.");
                        lMoney.setId("money");
                        hbFront_Right_Cart.getChildren().add(lMoney);

                    Button bOproznij = new Button();
                    ImageView ivOproznij = new ImageView("img/oproznij.png");
                    ivOproznij.setFitHeight(30);
                    ivOproznij.setFitWidth(150);
                    bOproznij.setGraphic(ivOproznij);
                    vbFront_Right.getChildren().add(bOproznij);

            VBox vbMainMenu = new VBox();
            vbMainMenu.setPadding(new Insets(0));
            container.getChildren().add(vbMainMenu);

                HBox hbBanner = new HBox();
                hbBanner.setPadding(new Insets(0));
                vbMainMenu.getChildren().add(hbBanner);

                    ImageView ivBanner = new ImageView("img/baner2.jpg");
                    ivBanner.setFitHeight(125);
                    ivBanner.setFitWidth(1000);
                    hbBanner.getChildren().add(ivBanner);

                HBox hbCategories = new HBox(30F);
                hbCategories.setPadding(new Insets(15));
                hbCategories.setAlignment(Pos.CENTER);
                vbMainMenu.getChildren().add(hbCategories);

                    int CatHeight = 170;
                    int CatWidth = 250;

                    HBox hbCat_1 = new HBox();
                    hbCat_1.setPadding(new Insets(15));
                    hbCategories.getChildren().add(hbCat_1);

                        Button bCat_1 = new Button();
                            ImageView ivCat_1 = new ImageView("img/kawiarka.jpeg");
                            ivCat_1.setId("categoryImage");
                            ivCat_1.setFitHeight(CatHeight);
                            ivCat_1.setFitWidth(CatWidth);
                        bCat_1.setGraphic(ivCat_1);
                        hbCat_1.getChildren().add(bCat_1);

                    HBox hbCat_2 = new HBox();
                    hbCat_2.setPadding(new Insets(15));
                    hbCategories.getChildren().add(hbCat_2);

                        Button bCat_2 = new Button();
                            ImageView ivCat_2 = new ImageView("img/kawiarka.jpeg");
                            ivCat_2.setId("categoryImage");
                            ivCat_2.setFitHeight(CatHeight);
                            ivCat_2.setFitWidth(CatWidth);
                        bCat_2.setGraphic(ivCat_2);
                        hbCat_2.getChildren().add(bCat_2);

                    HBox hbCat_3 = new HBox();
                    hbCat_3.setPadding(new Insets(15));
                    hbCategories.getChildren().add(hbCat_3);

                        Button bCat_3 = new Button();
                            ImageView ivCat_3 = new ImageView("img/kawiarka.jpeg");
                            ivCat_3.setId("categoryImage");
                            ivCat_3.setFitHeight(CatHeight);
                            ivCat_3.setFitWidth(CatWidth);
                        bCat_3.setGraphic(ivCat_3);
                        hbCat_3.getChildren().add(bCat_3);

                HBox hbStopka = new HBox();
                hbStopka.setPadding(new Insets(12));
                vbMainMenu.getChildren().add(hbStopka);

                    HBox hbPost = new HBox(10);
                    hbPost.setPadding(new Insets(3));
                    hbPost.setAlignment(Pos.CENTER_LEFT);
                    hbStopka.getChildren().add(hbPost);

                        Button bPost = new Button();
                            ImageView ivPost = new ImageView("img/poczta.png");
                            ivPost.setFitHeight(50);
                            ivPost.setFitWidth(100);
                        bPost.setGraphic(ivPost);
                        hbPost.getChildren().add(bPost);

                        Label lPost = new Label("Napisz do nas");
                        lPost.setStyle("-fx-font-size: 13px; -fx-text-fill: white;");

                        hbPost.getChildren().add(lPost);

                    Region stuffPost = new Region();
                    hbStopka.getChildren().add(stuffPost);
                    hbStopka.setHgrow(stuffPost, Priority.ALWAYS);

                    HBox hbFaktura = new HBox();
                    hbFaktura.setAlignment(Pos.BOTTOM_LEFT);
                    hbStopka.getChildren().add(hbFaktura);

                        Button bFaktura = new Button();
                            ImageView ivFaktura = new ImageView("img/faktura.png");
                            ivFaktura.setFitHeight(30);
                            ivFaktura.setFitWidth(150);
                        bFaktura.setGraphic(ivFaktura);
                        hbFaktura.getChildren().add(bFaktura);


            int productHeight = 130;
            int productWidth = 130;
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


            VBox vbErrBrakTowaru = new VBox(7);
            vbErrBrakTowaru.setOnMouseEntered(e->{
                if(gpBeans.getChildren().contains(vbErrBrakTowaru))
                    gpBeans.getChildren().remove(vbErrBrakTowaru);
                else if(gpBrewers.getChildren().contains(vbErrBrakTowaru))
                    gpBrewers.getChildren().remove(vbErrBrakTowaru);
                else if(gpGrinders.getChildren().contains(vbErrBrakTowaru))
                    gpGrinders.getChildren().remove(vbErrBrakTowaru);
            });
            vbErrBrakTowaru.setId("error");
            Label lErrText = new Label("\t Przepraszamy, nasz sklep nie posiada takich ilości wybranego towaru w aktualnym momencie \n\n\t(najedź aby zamknąć)");
            lErrText.setWrapText(true);
            lErrText.setPadding(new Insets(4));
            vbErrBrakTowaru.getChildren().add(lErrText);


        int columnOfBackButton = 7;
        int rowOfBackButton = 5;

        bCat_1.setOnAction(e -> {
            lProd[0].setText(SETTINGS.names[0] + "\n" + String.format("%.2f", SETTINGS.prices[0]) + " zł\nNa magazynie: " + SETTINGS.inStock[0]);
            lProd[1].setText(SETTINGS.names[1] + "\n" + String.format("%.2f", SETTINGS.prices[1]) + " zł\nNa magazynie: " + SETTINGS.inStock[1]);
            lProd[2].setText(SETTINGS.names[2] + "\n" + String.format("%.2f", SETTINGS.prices[2]) + " zł\nNa magazynie: " + SETTINGS.inStock[2]);
            container.getChildren().remove(vbMainMenu);
            container.getChildren().add(gpBeans);
            gpBeans.add(bBackToMenu, columnOfBackButton,rowOfBackButton );
            gpBeans.add(bAddToCart, columnOfBackButton-2,rowOfBackButton -2);
        });

        bCat_2.setOnAction(e -> {
            container.getChildren().remove(vbMainMenu);
            container.getChildren().add(gpBrewers);
            gpBrewers.add(bBackToMenu, columnOfBackButton,rowOfBackButton );
            gpBrewers.add(bAddToCart, columnOfBackButton-2,rowOfBackButton -2);
            lProd[3].setText(SETTINGS.names[3] + "\n" + String.format("%.2f", SETTINGS.prices[3]) + " zł\nNa magazynie: " + SETTINGS.inStock[3]);
            lProd[4].setText(SETTINGS.names[4] + "\n" + String.format("%.2f", SETTINGS.prices[4]) + " zł\nNa magazynie: " + SETTINGS.inStock[4]);
            lProd[5].setText(SETTINGS.names[5] + "\n" + String.format("%.2f", SETTINGS.prices[5]) + " zł\nNa magazynie: " + SETTINGS.inStock[5]);
        });

        bCat_3.setOnAction(e -> {
            lProd[6].setText(SETTINGS.names[6] + "\n" + String.format("%.2f", SETTINGS.prices[6]) + " zł\nNa magazynie: " + SETTINGS.inStock[6]);
            lProd[7].setText(SETTINGS.names[7] + "\n" + String.format("%.2f", SETTINGS.prices[7]) + " zł\nNa magazynie: " + SETTINGS.inStock[7]);
            lProd[8].setText(SETTINGS.names[8] + "\n" + String.format("%.2f", SETTINGS.prices[8]) + " zł\nNa magazynie: " + SETTINGS.inStock[8]);
            container.getChildren().remove(vbMainMenu);
            container.getChildren().add(gpGrinders);
            gpGrinders.add(bBackToMenu, columnOfBackButton,rowOfBackButton );
            gpGrinders.add(bAddToCart, columnOfBackButton-2,rowOfBackButton -2);
        });

        Cart cart = new Cart();

        bOproznij.setOnAction(e -> {
            cart.empty();
            for(int j=0; j<9; j++)
                lProd[j].setText(SETTINGS.names[j] + "\n" + String.format("%.2f", SETTINGS.prices[j]) + " zł\nNa magazynie: " + SETTINGS.inStock[j]);

            lMoney.setText(cart.sumOfPurchases() + " PLN / " + cart.coutOfProducts() + " szt.");
        });


        bAddToCart.setOnAction(e -> {
            if(gpBeans.getChildren().contains(vbErrBrakTowaru))
                gpBeans.getChildren().remove(vbErrBrakTowaru);
            else if(gpBrewers.getChildren().contains(vbErrBrakTowaru))
                gpBrewers.getChildren().remove(vbErrBrakTowaru);
            else if(gpGrinders.getChildren().contains(vbErrBrakTowaru))
                gpGrinders.getChildren().remove(vbErrBrakTowaru);

            for(int j = 0; j<9; j++){
                if(!tfProd[j].getText().matches("")){
                    if(tfProd[j].getText().matches("[0-9]*"))
                        if(Integer.parseInt(tfProd[j].getText()) <= SETTINGS.inStock[j]){
                            int x = Integer.parseInt(tfProd[j].getText());
                            for(int i = 0; i < x; i++ ){
                                cart.add(j);
                                SETTINGS.takeFromStock(j);
                            }
                        }
                        else {
                            if (container.getChildren().contains(gpBeans)) {
                                if (!gpBeans.getChildren().contains(vbErrBrakTowaru))
                                    gpBeans.add(vbErrBrakTowaru, 7, 1);
                            }
                            if(container.getChildren().contains(gpBrewers)){
                                if(!gpBrewers.getChildren().contains(vbErrBrakTowaru))
                                    gpBrewers.add(vbErrBrakTowaru, 7, 1);
                            }
                            if (container.getChildren().contains(gpGrinders)) {
                                if (!gpGrinders.getChildren().contains(vbErrBrakTowaru))
                                    gpGrinders.add(vbErrBrakTowaru, 7, 1);
                            }
                        }
                    tfProd[j].setText("");
                    lProd[j].setText(SETTINGS.names[j] + "\n" + String.format("%.2f", SETTINGS.prices[j]) + " zł\nNa magazynie: " + SETTINGS.inStock[j]);
                }
            }
            lMoney.setText(cart.sumOfPurchases() + " PLN / " + cart.coutOfProducts() + " szt.");
        });



        bBackToMenu.setOnAction(e -> {
            if(gpBeans.getChildren().contains(vbErrBrakTowaru))
                gpBeans.getChildren().remove(vbErrBrakTowaru);
            else if(gpBrewers.getChildren().contains(vbErrBrakTowaru))
                gpBrewers.getChildren().remove(vbErrBrakTowaru);
            else if(gpGrinders.getChildren().contains(vbErrBrakTowaru))
                gpGrinders.getChildren().remove(vbErrBrakTowaru);

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
            lMoney.setText(cart.sumOfPurchases() + " PLN / " + cart.coutOfProducts() + " szt.");
            container.getChildren().add(vbMainMenu);
        });




        VBox vbInvoice = new VBox(10);
        vbInvoice.setMinSize(1000,604);
        vbInvoice.setPadding(new Insets(30, 50,10 ,50));
        vbInvoice.setId("invoice");
        vbInvoice.setAlignment(Pos.TOP_CENTER);
        Scene sceneInvoice = new Scene(vbInvoice);
            Label lInvoiceName = new Label("FAKTURA");
            lInvoiceName.setId("invoiceName");
            HBox hbInvoiceProducts = new HBox();
            hbInvoiceProducts.setId("invoiceProducts");
            vbInvoice.getChildren().addAll(lInvoiceName, hbInvoiceProducts);
                VBox vbInvoiceProdName = new VBox();
                VBox vbInvoiceProdPrice = new VBox();
                VBox vbInvoiceProdQuantity = new VBox();
                VBox vbInvoiceProdSum = new VBox();

                hbInvoiceProducts.getChildren().addAll(vbInvoiceProdName, vbInvoiceProdPrice, vbInvoiceProdQuantity, vbInvoiceProdSum);
            HBox hbInvoiceSummary = new HBox();
            hbInvoiceSummary.setId("summary");
            vbInvoice.getChildren().add(hbInvoiceSummary);
            hbInvoiceSummary.setAlignment(Pos.BASELINE_RIGHT);
            hbInvoiceSummary.setPadding(new Insets(0,30,0,0));
            HBox hbInvoiceButtons = new HBox();
            hbInvoiceButtons.setId("summary");
            hbInvoiceButtons.setAlignment(Pos.BASELINE_RIGHT);
            hbInvoiceButtons.setPadding(new Insets(0,30,0,0));
            vbInvoice.getChildren().add(hbInvoiceButtons);
                Button bInvoiceAccept = new Button("Akceptuj");
                Button bInvoiceReject = new Button("Wróć");
                hbInvoiceButtons.getChildren().addAll(bInvoiceReject, bInvoiceAccept);

        Label lInvoiceIsEmpty = new Label("PUSTO");
        bFaktura.setOnAction( e-> {
            if(!hbInvoiceButtons.getChildren().contains( bInvoiceAccept))
                hbInvoiceButtons.getChildren().add(bInvoiceAccept);

            if(hbInvoiceProducts.getChildren().contains(lInvoiceIsEmpty))
                hbInvoiceProducts.getChildren().remove(lInvoiceIsEmpty);

            int[] invoiceData = cart.generateInvoiceData();
            vbInvoiceProdName.getChildren().clear();
            vbInvoiceProdPrice.getChildren().clear();
            vbInvoiceProdQuantity.getChildren().clear();
            vbInvoiceProdSum.getChildren().clear();



            for(int i=0; i<9; i++) {
                if (invoiceData[i] != 0) {
                    vbInvoiceProdName.getChildren().add(new Label(SETTINGS.names[i]));
                    vbInvoiceProdPrice.getChildren().add(new Label(String.format("%.2f", SETTINGS.prices[i])));
                    vbInvoiceProdQuantity.getChildren().add(new Label("" + invoiceData[i]));
                    vbInvoiceProdSum.getChildren().add(new Label(String.format("%.2f", invoiceData[i] * SETTINGS.prices[i])));
                }
            }
            if(vbInvoiceProdName.getChildren().isEmpty()){
                hbInvoiceProducts.getChildren().add(2, lInvoiceIsEmpty);
                if(hbInvoiceButtons.getChildren().contains( bInvoiceAccept))
                    hbInvoiceButtons.getChildren().remove(bInvoiceAccept);
            }
            hbInvoiceSummary.getChildren().clear();
            hbInvoiceSummary.getChildren().add(new Label(cart.sumOfPurchases()));


            stage.setScene(sceneInvoice);
        });

        bInvoiceReject.setOnAction(e-> {
            stage.setScene(sceneStore);
        });

        Label lInvoiceThanks = new Label("Dziękujemy za zakupy");
        lInvoiceThanks.setWrapText(true);
        lInvoiceThanks.setStyle("-fx-font-size: 70px; -fx-text-fill: #32b63d");

        lInvoiceThanks.setOnMouseEntered(e->{
            spContainer.getChildren().remove(lInvoiceThanks);
        });

        bInvoiceAccept.setOnAction(e->{
            spContainer.getChildren().add(lInvoiceThanks);
            stage.setScene(sceneStore);
            lMoney.setText("0.00 PLN  /  0 szt.");
            cart.empty();

        });


        VBox vbMessage = new VBox();
        StackPane spMessage = new StackPane();
        spMessage.getChildren().add(vbMessage);
            vbMessage.setId("message");
            Scene sceneMessage = new Scene(spMessage);
            bPost.setOnAction(e->{
                stage.setScene(sceneMessage);
            });
            vbMessage.getChildren().add(new Label("Wyślij wiadomość"));

            HBox hbMessageContents = new HBox();
            hbMessageContents.setPadding(new Insets(0,0,0,20));
            vbMessage.getChildren().add(hbMessageContents);
                VBox vbMessageLabels = new VBox();
                vbMessageLabels.setId("messageLabels");
                vbMessageLabels.setPadding(new Insets(0,15,0,0));
                    vbMessageLabels.getChildren().addAll(
                            new Label("email: "),
                            new Label("Wiadomość:")
                    );
                VBox vbMessageTextFields = new VBox(15);
                    TextField tfMessageEmail = new TextField();
                    tfMessageEmail.setMaxWidth(120);
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

                Button bMessageSend = new Button("Wyślij");
                bMessageSend.setOnAction(e->{
                    if(tfMessageEmail.getText().matches("[!(\\.)]+@.+\\..+")){

                        //TODO guzik wyślij maila



                    }
                    else
                        spMessage.getChildren().add(lMessageError);
                });
                hbMessageButtons.getChildren().add(bMessageSend);





        sceneMessage.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
        sceneInvoice.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
        sceneStore.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());

        stage.setScene(sceneStore);
        stage.setTitle("Sklepik");
        stage.show();
    }

    public static void main (String[]args){
        if(SETTINGS.inStock.length == 9 && SETTINGS.names.length == 9 && SETTINGS.prices.length == 9)
            launch(args);
        else
            System.out.println("Popraw dane w SETTINGS");
    }
}

