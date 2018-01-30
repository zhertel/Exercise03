package com.hertel.excercise03;

import java.util.Scanner;

public class Main {

    public static double getUserTemp() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is today's temperature in degrees Fahrenheit?: ");
        double temperature = input.nextInt();
        return temperature;
    }

    public static double convertFToC(double fahrenheit) {
        double celsius = (fahrenheit - 32)/1.8;
        return celsius;
    }

    public static void displayCelsiusTemp(double celsius) {
        System.out.println("Today's temperature in Celsius is " + celsius + " degrees.");
    }

    public static void main(String[] args) {
        double temperatureInFahrenheit = getUserTemp();
        displayCelsiusTemp(convertFToC(temperatureInFahrenheit));
    }
}
