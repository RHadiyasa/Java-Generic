package com.rafi.generic;

public class Main {
    public static void main(String[] args) {
        Data dataString = new Data("Rafi Hadiyasa");
//        String name = dataString.getName(); // Error karena tidak diparsing
        String value = (String) dataString.getName(); // Parsing Data Type
        System.out.println(value);
        System.out.println(dataString.getName());

        dataString.setName(123);
        String value2 = String.valueOf(dataString.getName()); // Konfersi 123 menjadi String
        System.out.println(value2);
    }
}
