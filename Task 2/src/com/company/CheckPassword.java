package com.company;

public class CheckPassword {
    public static String checkIsValidPassword(String password) {
        String validPassword = null;
        if (checkIsDigitsMoreThanThreeNumbers(password)&& checkIsContainsSpecialCharacter(password)&&checkIsContainsUppercaseCharacter(password))
        {
            validPassword = password;
        }
        return validPassword;
    }


    public static boolean checkIsDigitsMoreThanThreeNumbers(String pass) {
        boolean check = false;
        int quantity = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
                quantity++;
            }
            if (quantity >= 3) {
                check = true;
            }
        }
        return check;
    }

    public static boolean checkIsContainsSpecialCharacter(String pass) {
        boolean check = false;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) == '#' || pass.charAt(i) == '!' || pass.charAt(i) == '%') {
                check = true;
            }
        }
        return check;
    }

    public static boolean checkIsContainsUppercaseCharacter(String pass) {
        boolean check = false;
        int quantity = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
                quantity++;
            }
        }
        if (quantity >= 1) {
            check = true;
        }
        return check;
    }

}
