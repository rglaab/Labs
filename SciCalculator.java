//worked with Vish

import java.util.Scanner;

public class SciCalculator {
    public static void main(String[] args) {
        int operation = 1;
        double result = 0;
        int numCalc = 0;
        double runningTotal = 0;
        int stopGap = 0;
        double math;

        Scanner myscanner = new Scanner(System.in);
        //push
        while (operation != 0) {
            //stopGap stops the menus and result printing when option 7 is chosen
            if (stopGap != 1) {
                System.out.println("Current Result: " + result);

                System.out.println("Calculator Menu\n ---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n" +
                        "4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average  ");
            }
            //resets stopGap if it was turned on
            stopGap = 0;

            System.out.print("Enter Menu Selection: ");

            operation = myscanner.nextInt();

            //breaks the loop if 0 is chosen
            /*if (operation == 0) {
                break;
            }*/
            double operand1 = 0.0;
            double operand2 = 0.0;
            if (operation < 7 && operation > 0) {
                System.out.println();
                System.out.print("Enter first operand: ");

                //this block does the bonus part
                String input1;
                input1 = myscanner.next();
                if (input1.equals("RESULT")) {
                    operand1 = result;
                } else {
                    operand1 = Double.parseDouble(input1);
                }

                System.out.print("Enter second operand: ");
                String input2;
                input2 = myscanner.next();
                if (input2.equals("RESULT")) {
                    operand2 = result;
                } else {
                    operand2 = Double.parseDouble(input2);
                }
            }

            System.out.println();

            switch (operation) {
                case 0:
                    break;
                case 1:
                    math = operand1 + operand2;
                    result = math;
                    numCalc += 1;
                    //keeps track of the sum of operations for choice 7
                    runningTotal += result;
                    break;
                case 2:
                    math = operand1 - operand2;
                    result = math;
                    numCalc += 1;
                    runningTotal += result;
                    break;
                case 3:
                    math = operand1 * operand2;
                    result = math;
                    numCalc += 1;
                    runningTotal += result;
                    break;
                case 4:
                    math = operand1 / operand2;
                    result = math;
                    numCalc += 1;
                    runningTotal += result;
                    break;
                case 5:
                    math = Math.pow(operand1, operand2);
                    result = math;
                    numCalc += 1;
                    runningTotal += result;
                    break;
                case 6:
                    math = Math.log(operand2) / Math.log(operand1);
                    result = math;
                    numCalc += 1;
                    runningTotal += result;
                    break;
                case 7:
                    math = runningTotal / numCalc;
                    if (numCalc == 0) {
                        System.out.println("Error: No calculations yet to average!");
                    } else {
                        System.out.println("Sum of calculations: " + runningTotal);
                        System.out.println("Number of calculations: " + numCalc);
                        //outputs the final statement to two decimal places
                        math *= 100;
                        int m = Math.round((float) (math));
                        math = (double) m / 100;

                        System.out.println("Average of calculations: " + math);
                    }
                    stopGap = 1;
                    break;
                default:
                    System.out.println("Error: Invalid selection!");
                    stopGap = 1;
                    break;
            }
        }
        System.out.println("Thanks for using this calculator. Goodbye! ");


    }
}

