package com.company;

public class Textmanipulation {
    public static int findNumberOfSentence(String input)
    {
        int len=0;
        if(input.trim().length()==0)
        {
            len=0;
        }
        else
        {
            int count=0;
            for(int inc=0;inc<input.length();inc++)
            {

                char ch = input.charAt(inc);
                if (ch == '.')
                    count++;
                len = count;

            }
        }
        return len;
    }

    public static int count (String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        int wordCount = 0;

        boolean isWord = false;
        int endOfLine = input.length() - 1;
        char[] characters = input.toCharArray();

        for (int i = 0; i < characters.length; i++) {

            // if the char is a letter, word = true.
            if (Character.isLetter(characters[i]) && i != endOfLine) {
                isWord = true;

                // if char isn't a letter and there have been letters before,
                // counter goes up.
            } else if (!Character.isLetter(characters[i]) && isWord) {
                wordCount++;
                isWord = false;

                // last word of String; if it doesn't end with a non letter, it
                // wouldn't count without this.
            } else if (Character.isLetter(characters[i]) && i == endOfLine) {
                wordCount++;
            }
        }

        return wordCount;
    }
    public static int demo(String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i)))
                count++;
        }
        return count;
    }


    public static void vowelcons(String input) {
        int vowels = 0, consonants = 0;
        input = input.toLowerCase();
        for(int i = 0; i < input.length(); ++i)
        {
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }

        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    public static void findlongest(String input) {
        String[] word = input.split(" ");
        String maxlethWord = "";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() >= maxlethWord.length()) {
                maxlethWord = word[i];
            }
        }
        System.out.println("The longest word is '"+maxlethWord+"'");
    }
}