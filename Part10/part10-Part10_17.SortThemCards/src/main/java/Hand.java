
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MatheusPC
 */
public class Hand implements Comparable<Hand> {

    private List<Card> cardsOnHand;

    public Hand() {
        this.cardsOnHand = new ArrayList<>();
    }

    public void add(Card card) {
        if (card == null) {
            return;
        }

        this.cardsOnHand.add(card);
    }

    public void print() {
        if (this.cardsOnHand.isEmpty()) {
            return;
        }

        this.cardsOnHand.stream().forEach(cards -> System.out.println(cards));
    }

    public void sort() {
        if (this.cardsOnHand.isEmpty()) {
            return;
        }
        Collections.sort(cardsOnHand);
    }

    public int valueHand() {

        return this.cardsOnHand.stream()
                .mapToInt(value -> value.getValue())
                .sum();
    }

    @Override
    public int compareTo(Hand o) {
        return this.valueHand() - o.valueHand();
    }

    public void sortBySuit() {
        Collections.sort(cardsOnHand, (Card c1, Card c2) -> {
            if (c1.getSuit().ordinal() - c2.getSuit().ordinal() == 0) {
                return c1.getValue() - c2.getValue();
            }

            return c1.getSuit().ordinal() - c2.getSuit().ordinal();
        });
    }

}
