package com.mohamed.company;
public class Main {
    public static void main(String[] args) {
        System.out.println("The Password is :" + getPassword(9));
    }
    public static String getPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789#$%&?";
        char [] password = new char[length];
        for (int i=0;i<length;i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
        }
    }

