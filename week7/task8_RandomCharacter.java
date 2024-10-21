package week7;

public class task8_RandomCharacter {
    // Generate a random character between chi and ch2
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    // Generate a random Lowercase letter
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    // Generate a random lowercase letter
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A', 'Z');
    }
}