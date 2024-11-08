package com.ulcdia.experiment_2.pick_card;

public class PickCard {
    public static void main(String[] args) {
        final String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int card = (int) (Math.random() * 52);
        System.out.println("The Card you picked is " + ranks[card % 13] + " of " + suits[card / 13] + ".");
    }
}
