package application;

import entities.Alphabet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Length: ");
        int n = sc.nextInt();
        System.out.println("Uppercase (true/false): ");
        boolean uppercaseIncluded = sc.nextBoolean();
        System.out.println("Lowercase (true/false): ");
        boolean lowercaseIncluded = sc.nextBoolean();
        System.out.println("Number (true/false): ");
        boolean numberInclude = sc.nextBoolean();
        System.out.println("Special Char (true/false): ");
        boolean specialCharactersIncluded = sc.nextBoolean();

        Alphabet alp = new Alphabet(uppercaseIncluded, lowercaseIncluded, numberInclude, specialCharactersIncluded);
        int elementsLength = alp.getAlphabet().length();

        StringBuilder pass = new StringBuilder("");

        int max = elementsLength - 1;
        int min = 0;
        int range = max - min + 1;

        for (int i = 0; i < n; i++) {
            int index = (int) (Math.random() * range) + min;
            pass.append(alp.getAlphabet().charAt(index));
        }

        String newPassword = pass.toString();

        System.out.println();
        System.out.println("The new password is: " + newPassword);

        sc.close();
    }
}
