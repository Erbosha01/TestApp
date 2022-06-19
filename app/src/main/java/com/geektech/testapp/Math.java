package com.geektech.testapp;

public class Math {
    public String add(String a, String b) {
        String result;
        if (a == null || b == null) {
            result = "You can not use null";
        } else {
            if (a.contains(".") || b.contains(".")) {
                result = "You can use only whole numbers";
            } else {
                if (a.contains(" ") || b.contains(" ")) {
                    result = "You can not use empty spaces";
                } else {
                    if (isNumeric(a) && isNumeric(b)) {
                        int num1 = Integer.parseInt(a);
                        int num2 = Integer.parseInt(b);
                        if (num1 < 0 || num2 < 0) {
                            result = "You can not use negative numbers";
                        } else {
                            result = String.valueOf(num1 + num2);
                        }
                    } else {
                        result = "You can not plus letters";
                    }
                }
            }
        }
        return result;
    }

    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String divide(String a, String b) {
        String result;
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        if (num1 == 0 || num2 == 0) {
            result = "You can not divide to zero";
        } else {
            result = String.valueOf(num1 / num2);
        }
        return result;
    }
}
