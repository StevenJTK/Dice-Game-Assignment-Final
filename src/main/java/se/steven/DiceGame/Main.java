package se.steven.DiceGame;

public class Main {
    public static void main(String[] args) {

        Dice dice = new Dice();


        System.out.println("Welcome to the Dice Game! ");

        dice.gameStart();
        dice.firstRoll();
        dice.secondRoll();
        dice.gameScore();

    }
}