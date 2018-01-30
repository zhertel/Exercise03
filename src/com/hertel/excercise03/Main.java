package com.hertel.excercise03;

import java.util.Scanner;

public class Main {

    public static double getUserTemp() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a temperature in degrees Fahrenheit?: ");
        double temperature = input.nextInt();
        return temperature;
    }

    public static double convertFToC(double fahrenheit) {
        double celsius = (fahrenheit - 32)/1.8;
        return celsius;
    }

    public static void displayCelsiusTemp(double celsius) {
        System.out.println("In Celsius, that temperature is " + celsius + " degrees.");
    }

    public static void main(String[] args) {
        int ABSOLUTEZERO = -460;
        double temperatureInFahrenheit = getUserTemp();
        while(temperatureInFahrenheit >= ABSOLUTEZERO) {
            displayCelsiusTemp(convertFToC(temperatureInFahrenheit));
            temperatureInFahrenheit = getUserTemp();
        }
        System.out.println("That temperature is below Absolute Zero.");
    }
}
