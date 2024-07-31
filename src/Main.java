import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        System.out.println(calc(inputLine));
    }

    public static String calc(String input) throws Exception {
        String expression[] = input.split(" ");
        if (expression.length != 3) throw new Exception("Wrong input line format");

        int leftOperand = Validation.validateAndParse(expression[0]);
        int rightOperand = Validation.validateAndParse(expression[2]);
        String operator = expression[1];

        return String.valueOf(Calculator.calculation(leftOperand,rightOperand,operator));
    }
}
