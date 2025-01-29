package com.kalpna.learning.core.datatype;

public class CharacterUnicode {

    public static void main(String[] args){
        char ch = 123;
        System.out.println("Character:"+ch);

        char unicodeChar2 = '\u03A9';
        System.out.println("Character:"+unicodeChar2);

        String smileEmoji = "\uD83D\uDE0A";// smile emoji
        System.out.println("Character:"+smileEmoji);


    }

}
