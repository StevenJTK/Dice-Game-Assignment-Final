package se.steven.DiceGame;

public class Main {
    public static void main(String[] args) {

        Dice dice = new Dice();


        System.out.println("Welcome to the Dice Game! ");

        dice.gameStart();
        dice.firstRoll();
        dice.playerTwo();
        dice.secondRoll();
        dice.gameScore();

        System.out.println("Thanks for playing!");
    }
}