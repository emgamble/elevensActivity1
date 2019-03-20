package com.company;

public class CardTester {
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        Card a = new Card("A", "Giraffes", 5);
        Card b = new Card("B", "Lions", 4);
        Card c = new Card("C", "Giraffes", 2);
        System.out.println(a.rank());
        System.out.println(b.suit());
        System.out.println(c.pointValue());

        Card d = new Card("A", "Giraffes", 5);
        System.out.println(d.matches(a));
        System.out.println(c.matches(b));
    }
}
