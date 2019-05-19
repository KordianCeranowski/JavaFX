import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;





public class Zad18 extends Application {

    public class PeselValidator {

        private byte PESEL[] = new byte[11];
        private boolean valid = false;

        public PeselValidator(String PESELNumber) {
            if (PESELNumber.length() != 11){
                valid = false;
            }
            else {
                for (int i = 0; i < 11; i++){
                    PESEL[i] = Byte.parseByte(PESELNumber.substring(i, i+1));
                }
                if (checkSum() && checkMonth() && checkDay()) {
                    valid = true;
                }
                else {
                    valid = false;
                }
            }
        }

        public boolean isValid() {
            return valid;
        }

        public int getBirthYear() {
            int year;
            int month;
            year = 10 * PESEL[0];
            year += PESEL[1];
            month = 10 * PESEL[2];
            month += PESEL[3];
            if (month > 80 && month < 93) {
                year += 1800;
            }
            else if (month > 0 && month < 13) {
                year += 1900;
            }
            else if (month > 20 && month < 33) {
                year += 2000;
            }
            else if (month > 40 && month < 53) {
                year += 2100;
            }
            else if (month > 60 && month < 73) {
                year += 2200;
            }
            return year;
        }

        public int getBirthMonth() {
            int month;
            month = 10 * PESEL[2];
            month += PESEL[3];
            if (month > 80 && month < 93) {
                month -= 80;
            }
            else if (month > 20 && month < 33) {
                month -= 20;
            }
            else if (month > 40 && month < 53) {
                month -= 40;
            }
            else if (month > 60 && month < 73) {
                month -= 60;
            }
            return month;
        }


        public int getBirthDay() {
            int day;
            day = 10 * PESEL[4];
            day += PESEL[5];
            return day;
        }

        public String getSex() {
            if (valid) {
                if (PESEL[9] % 2 == 1) {
                    return "Mezczyzna";
                }
                else {
                    return "Kobieta";
                }
            }
            else {
                return "---";
            }
        }

        private boolean checkSum() {
            int sum = 1 * PESEL[0] +
                    3 * PESEL[1] +
                    7 * PESEL[2] +
                    9 * PESEL[3] +
                    1 * PESEL[4] +
                    3 * PESEL[5] +
                    7 * PESEL[6] +
                    9 * PESEL[7] +
                    1 * PESEL[8] +
                    3 * PESEL[9];
            sum %= 10;
            sum = 10 - sum;
            sum %= 10;

            if (sum == PESEL[10]) {
                return true;
            }
            else {
                return false;
            }
        }

        private boolean checkMonth() {
            int month = getBirthMonth();
            int day = getBirthDay();
            if (month > 0 && month < 13) {
                return true;
            }
            else {
                return false;
            }
        }

        private boolean checkDay() {
            int year = getBirthYear();
            int month = getBirthMonth();
            int day = getBirthDay();
            if ((day >0 && day < 32) &&
                    (month == 1 || month == 3 || month == 5 ||
                            month == 7 || month == 8 || month == 10 ||
                            month == 12)) {
                return true;
            }
            else if ((day >0 && day < 31) &&
                    (month == 4 || month == 6 || month == 9 ||
                            month == 11)) {
                return true;
            }
            else if ((day >0 && day < 30 && leapYear(year)) ||
                    (day >0 && day < 29 && !leapYear(year))) {
                return true;
            }
            else {
                return false;
            }
        }

        private boolean leapYear(int year) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                return true;
            else
                return false;
        }
    }


    @Override
    public void start(Stage scena) throws Exception{

        HBox buttons = new HBox();
//kolor        buttons.setStyle("-fx-background-color: #ff00a7;");
        buttons.setSpacing(5);
        buttons.setAlignment(Pos.TOP_RIGHT);
            Button btnClose = new Button("Zamknij");
            btnClose.setOnAction(e -> scena.close());

            Button btnMinimize = new Button("Zwiń do paska");
            btnMinimize.setOnAction(e -> scena.setIconified(true));
        buttons.getChildren().addAll(btnMinimize, btnClose);

        HBox container = new HBox();
//kolor        container.setStyle("-fx-background-color: #555555;");
        container.setPadding(new Insets(10));

        VBox columnOne = new VBox();
//kolor        columnOne.setStyle("-fx-background-color: #FF5555;");
        columnOne.setPadding(new Insets(60));
        container.getChildren().add(columnOne);
        columnOne.setSpacing(30);

        VBox columnTwo = new VBox();
//kolor        columnTwo.setStyle("-fx-background-color: #55FF55;");
        columnTwo.setPadding(new Insets(60));
        container.getChildren().add(columnTwo);
        columnTwo.setSpacing(20);
        columnTwo.setMinWidth(400);

        HBox columnThree = new HBox();
//kolor        columnThree.setStyle("-fx-background-color: #5555FF;");
        columnThree.setPadding(new Insets(60));
        columnThree.setSpacing(30);
        //container.getChildren().add(columnThree);

//1
        Label pesel = new Label("PESEL");
        Label miasto = new Label("miasto");
        Label kod = new Label("kod pocztowy");
        Label telefon = new Label("telefon kontaktowy");
        Label adres = new Label("adres e-mail");

        columnOne.getChildren().addAll(pesel, miasto, kod, telefon, adres);



//2
        TextField peselInput = new TextField("");
        TextField miastoInput = new TextField("");
        TextField kodInput = new TextField("");
        kodInput.setMaxWidth(120);

        HBox telefonBox = new HBox();
//kolor        telefonBox.setStyle("-fx-background-color: #FFFF44;");
        TextField telefonInput = new TextField("");
        telefonInput.setMaxWidth(120);
        Label numerPattern = new Label("     (+48)-XXX-XXX-XXX");
        telefonBox.getChildren().addAll(telefonInput, numerPattern);

        TextField adresInput = new TextField("");
        Button next = new Button("Dalej");

        columnTwo.getChildren().addAll(peselInput, miastoInput, kodInput, telefonBox, adresInput, next);



//3

        VBox gwiazdki = new VBox();
        //gwiazdki.setPadding(new Insets(60));
        gwiazdki.setSpacing(30);
//kolor        gwiazdki.setStyle("-fx-background-color: #668844;");
        gwiazdki.getChildren().addAll(new Label("***************"), new Label("***************"), new Label("***************"), new Label("***************"), new Label("***************"));

        VBox bledy = new VBox();
        bledy.setSpacing(30);
//kolor        bledy.setStyle("-fx-background-color: #44AA66;");
        bledy.getChildren().add(new Label("xddxdxd")); //to jest wypełniane po kliknięciu guzika

        columnThree.getChildren().addAll(gwiazdki, bledy);



        Button wprowadzDane = new Button("Wprowadź Dane");
        wprowadzDane.setOnAction(e -> {
            container.getChildren().add(columnTwo);
            columnOne.getChildren().remove(wprowadzDane);
            container.getChildren().remove(columnThree);
        });

        next.setOnAction(e -> {

            container.getChildren().remove(columnTwo);
            columnOne.getChildren().add(wprowadzDane);
            container.getChildren().add(columnThree);

            bledy.getChildren().clear();


            PeselValidator pV = new PeselValidator(peselInput.getText());
            if (!pV.isValid())
                bledy.getChildren().add(new Label("Błąd"));
            else
                bledy.getChildren().add(new Label("Dane poprawne"));

            if(!miastoInput.getText().matches("[A-z]+"))
                bledy.getChildren().add(new Label("Błąd"));
            else
                bledy.getChildren().add(new Label("Dane poprawne"));

            if(!kodInput.getText().matches("[0-9]{2}-[0-9]{3}"))
                bledy.getChildren().add(new Label("Błąd"));
            else
                bledy.getChildren().add(new Label("Dane poprawne"));

            if(!telefonInput.getText().matches("\\(\\+48\\)-[0-9]{3}-[0-9]{3}-[0-9]{3}"))
                bledy.getChildren().add(new Label("Błąd"));
            else
                bledy.getChildren().add(new Label("Dane poprawne"));

            if(!adresInput.getText().matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]" +
                    "+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x" +
                    "0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|" +
                    "\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|" +
                    "[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\" +
                    "x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"))
                bledy.getChildren().add(new Label("Błąd         "));
            else
                bledy.getChildren().add(new Label("Dane poprawne"));

        });



//SCENA
        VBox mainContainer = new VBox();
        mainContainer.getChildren().addAll(buttons, container);

        scena.initStyle(StageStyle.UNDECORATED);
        scena.setScene(new Scene(mainContainer, 700, 400));
        scena.setTitle("Apka");
        scena.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
