package ru.dolgov.mathMean.main;

/**
 * This programm calculate arithmetic average and geomethric average of list of number.
 * Created by Dolgov on 14.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        if (args.length >= 2 && (args[0].equals("am") || args[0].equals("gm"))) {
            double[] numbers = new double[args.length - 1];
            try {
                for (int i = 1; i < args.length; i++) {
                    numbers[i - 1] = Float.parseFloat(args[i]);
                    if (numbers[i - 1] < 0) {
                        throw new NumberFormatException();
                    }
                }
                if (args[0].equals("am")) {
                    System.out.println(calcArithmeticAveragedValue(numbers));
                }
                if (args[0].equals("gm")) {
                    System.out.println(calcGeomethricAveragedValue(numbers));
                }
            } catch (NumberFormatException ex) {
                printReadme();
            }
        } else {
            printReadme();
        }
    }

    public static double calcArithmeticAveragedValue(double[] inputArray) {
        double averagedValue = 0;
        for (int i = 0; i < inputArray.length; i++) {
            averagedValue = averagedValue + inputArray[i];
        }
        averagedValue = averagedValue / inputArray.length;
        return averagedValue;
    }

    public static double calcGeomethricAveragedValue(double[] inputArray) {
        double averagedValue = 1;
        for (int i = 0; i < inputArray.length; i++) {
            averagedValue = averagedValue * inputArray[i];
        }
        averagedValue = Math.exp(Math.log(averagedValue) / inputArray.length);
        return averagedValue;
    }

    private static void printReadme() {
        System.out.println("Вы ввели неправильные аргументы");
        System.out.println("Пожалуйста, вызовите программу с одним из следующих аргументов:");
        System.out.println("-am <список чисел> - вычисляет среднее арифметичсеские для списка чисел.");
        System.out.println("Разрешаются только положительные числа. Например, -am 1 2 3 4 5");
        System.out.println("-gm <список чисел> - вычисляет среднее геометрическое для списка чисел.");
        System.out.println("Разрешаются только положительные числа. Например, -gm 3 3 3");
    }

}
