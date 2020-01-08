package com.company;
import com.company.Textmanipulation;

public class Main {

    public static void main(String[] args) {
        var word = "Aladdin is an impoverished young man who is recruited by a sorcerer, who convinces Aladdin and his mother of his goodwill " +
                "by apparently making arrangements to set up the lad as a wealthy merchant. The sorcerer's real motive is to persuade young Aladdin " +
                "to retrieve a wonderful oil lamp from a booby-trapped magic cave of wonder. After the sorcerer attempts to double-cross him, Aladdin " +
                "finds himself trapped in the cave. Fortunately, Aladdin retains a magic ring lent to him by the sorcerer as protection. When he rubs " +
                "his hands in despair, he inadvertently rubs the ring, and a jinn, or genie, appears, who takes him home to his mother. Aladdin is still " +
                "carrying the lamp, and when his mother tries to clean it, a second, far more powerful genie appears, who is bound to do the bidding of " +
                "the person holding the lamp.";

        System.out.println("The number of words is equal to "+ Textmanipulation.count(word));
        System.out.println("The number of sentences is equal to "+ Textmanipulation.findNumberOfSentence(word));
        System.out.println("The number of letters is equal to "+ Textmanipulation.demo(word));
        Textmanipulation.vowelcons(word);
        Textmanipulation.findlongest(word);
    }

}
