package com.example.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //TextBox exercise
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.getText());

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.getText());

        //Getting user input exercise
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " +name + "," + age + " years old");

        //UIControl
        var textBox = new TextBox();
        textBox.setText("Hello World");
        System.out.println(textBox);

        //Point
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);
        System.out.println(point1 == point2); //False(== compares addresses in memory)
        System.out.println(point1.equals(point2));//True (.equals method when overridden compares values)

        //Checkbox
         UIControl[] controls = {new TextBox(), new Checkbox()};
         for(var control : controls)
             control.render();

        //TaxCalculator
        var callculator = new TaxCalculator2018(100_000);
        var report = new TaxReport(callculator);
        report.show();

        report.setCalculator(new TaxCalculator2019());
        report.show();

        //Mortgage calculator exercise
        int principal =(int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period(Years): ", 1, 30);

        var calculator = new MortgageCalculator((byte) principal, annualInterest, years);

        var report1 = new MortgageReport(calculator);
        report1.printMortgage();
        report1.printPaymentSchedule();
    }

}
