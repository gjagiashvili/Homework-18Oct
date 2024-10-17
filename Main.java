public class Main {
    public static void main(String[] args) {
        // ცელსიუსიდან ფარენჰეიტში
        int celsius = 5;
        int fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " Celsius is = " + fahrenheit + " Fahrenheit");

        // ფარენჰეიტიდან ცელსიუსში
        fahrenheit = 5;
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " Fahrenheit is = " + celsius + " Celsius");

        // ნაკიანი წელის შემოწმება
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is a normal year.");
        }

        // სააკორდინატო სიბრტყე
        int x = 3;
        int y = 3;

        if (x > 0 && y > 0) {
            System.out.println("კოორდინატი (" + x + ", " + y + ") არის პირველ სააკორდინატო სიბრტყეში");
        } else if (x < 0 && y > 0) {
            System.out.println("კოორდინატი (" + x + ", " + y + ") არის მეორე სააკორდინატო სიბრტყეში");
        } else if (x < 0 && y < 0) {
            System.out.println("კოორდინატი (" + x + ", " + y + ") არის მესამე სააკორდინატო სიბრტყეში");
        } else if (x > 0 && y < 0) {
            System.out.println("კოორდინატი (" + x + ", " + y + ") არის მეოთხე სააკორდინატო სიბრტყეში");
        } else {
            System.out.println("Point is on an axis.");
        }

        // კალკულატორი
        String operator = "+";
        int number1 = 10;
        int number2 = 5;
        int result = 0;


        if (operator.equals("+")) {
            result = number1 + number2;
        } else if (operator.equals("-")) {
            result = number1 - number2;
        } else if (operator.equals("*")) {
            result = number1 * number2;
        } else if (operator.equals("/")) {
            if (number2 != 0) {
                result = number1 / number2;
            } else {
                System.out.println("You can't divide by zero.");
            }
        } else {
            System.out.println("Not valid. Only +, -, *, /");
        }


        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || (operator.equals("/") && number2 != 0)) {
            System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
        }
    }
}
