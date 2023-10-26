package hr.algebra.lovropavlov.rummylovropavlov.Controller;

import hr.algebra.lovropavlov.rummylovropavlov.Model.Card;
import hr.algebra.lovropavlov.rummylovropavlov.Model.Deck;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.TextAlignment;

import java.util.ArrayList;

public class HelloController {

    @FXML
    private Button btnStock;
    @FXML
    private Button btnDiscard;
    @FXML
    private StackPane spPlayer1Cards;
    @FXML
    private StackPane spPlayer2Cards;
    @FXML
    private StackPane spStockPile;
    @FXML
    private StackPane spDiscardPile;
    @FXML
    private StackPane spPile1;
    @FXML
    private StackPane spPile2;
    @FXML
    private StackPane spPile3;
    @FXML
    private StackPane spPile4;
    @FXML
    private StackPane spPile5;
    @FXML
    private StackPane spPile6;
    @FXML
    private Label lbStockAmount;
    @FXML
    private Label lbDiscardAmount;
    @FXML
    private Label lbPlayer1Points;
    @FXML
    private Label lbPlayer2Points;

    public int turn;
    public int player1points;
    public int player2points;

    public ArrayList<Card> player1Cards = new ArrayList<>();
    public ArrayList<Card> player2Cards = new ArrayList<>();
    public Deck deck;
    public Label topOfStock = new Label();
    public Label topOfDiscard = new Label();

    public Card stockCard = new Card();
    public Card disCard = new Card();
    public Label test = new Label();

    public void initialize(){
        turn = 0;
        deck = new Deck();
        player1points = 0;
        player2points = 0;
        lbPlayer1Points.setText(player1points + " points");
        lbPlayer2Points.setText(player2points + " points");
        setPlayer1Cards();
        setPlayer2Cards();

        stockCard = deck.getRandomCard();
        String topString = stockCard.getValue() + " " + stockCard.getSuit();
        topOfStock.setText(topString);
        spStockPile.getChildren().add(topOfStock);
        lbStockAmount.setText("Cards left: " + deck.getSize());


        disCard = deck.getRandomCard();
        String botString = disCard.getValue() + " " + disCard.getSuit();
        topOfDiscard.setText(botString);
        spDiscardPile.getChildren().add(topOfDiscard);
        lbDiscardAmount.setText("Cards left: " + (53-deck.getSize()));
    }


    private void setPlayer1Cards() {
        for(int i = 0; i<6;i++) {
            player1Cards.add(deck.getRandomCard());
            Card botCard = player1Cards.get(i);

            Label test = new Label();
            String botString = botCard.getValue() + " " + botCard.getSuit();
            test.setText(botString);
            test.setTranslateX(50 * i);
            test.setTranslateY(14 * i);
            test.setTextAlignment(TextAlignment.LEFT);
            spPlayer1Cards.getChildren().add(test);
        }
    }
    private void setPlayer2Cards() {
        for(int i = 0; i<6;i++) {
            player2Cards.add(deck.getRandomCard());
            Card botCard = player2Cards.get(i);

            Label test = new Label();
            String botString = botCard.getValue() + " " + botCard.getSuit();
            test.setText(botString);
            test.setTranslateX(-50 * i);
            test.setTranslateY(14 * i);
            test.setTextAlignment(TextAlignment.RIGHT);
            spPlayer2Cards.getChildren().add(test);
        }
    }

    public void buttonPressed(Event event){
        Button buttonPressed = (Button) event.getSource();
        buttonPressed.setText("bok");
    }

}