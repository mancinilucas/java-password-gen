package application;

import entities.Alphabet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many characters do you want in your new password? ");
        int n = sc.nextInt();
        System.out.println("Do you want to use uppercase characters? (y/n) ");
        char upperc = sc.next().charAt(0);
        boolean uppercaseIncluded = upperc == 'y';
        System.out.println("Do you want to use lowercase characters? (y/n) ");
        char lowerc = sc.next().charAt(0);
        boolean lowercaseIncluded = lowerc == 'y';
        System.out.println("Do you want to use numbers? (y/n) ");
        char numbers = sc.next().charAt(0);
        boolean numberInclude = numbers == 'y';
        System.out.println("Do you want to use special characters? (y/n) ");
        char specialChar = sc.next().charAt(0);
        boolean specialCharactersIncluded = specialChar == 'y';

        Alphabet alp = new Alphabet(uppercaseIncluded, lowercaseIncluded, numberInclude, specialCharactersIncluded);
        int elementsLength = alp.getAlphabet().length();

        String newPassword = passwordGenerator(elementsLength, alp, n);

        System.out.println();
        System.out.println("The new generated password is: " + newPassword);

        sc.close();
    }

    public static String passwordGenerator(int elementsLength, Alphabet alp, int n){
        StringBuilder pass = new StringBuilder("");

        int max = elementsLength - 1;
        int min = 0;
        int range = max - min + 1;

        for (int i = 0; i < n; i++) {
            int index = (int) (Math.random() * range) + min;
            pass.append(alp.getAlphabet().charAt(index));
        }

        String newPassword = pass.toString();
        return newPassword;
    }
}
