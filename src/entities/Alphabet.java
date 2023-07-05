package entities;

public class Alphabet {
    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "1234567890";
    public static final String SYMBOLS = "!@#$%^&*()-_=+\\/~?";

    private final StringBuilder poolElements;

    public Alphabet(boolean uppercaseIncluded, boolean lowercaseIncluded, boolean numbersIncluded, boolean specialCharactersIncluded) {

        poolElements = new StringBuilder();

        if (uppercaseIncluded) poolElements.append(UPPERCASE_LETTERS);
        if (lowercaseIncluded) poolElements.append(LOWERCASE_LETTERS);
        if (numbersIncluded) poolElements.append(NUMBERS);
        if (specialCharactersIncluded) poolElements.append(SYMBOLS);

    }

    public String getAlphabet() {
        return poolElements.toString();
    }
}
