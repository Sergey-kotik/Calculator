import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            NumbersAndOperand.hello();
            System.out.println("");
            String enterString = scanner.nextLine();
            if (NumbersAndOperand.exitAreCancel(enterString).equals("s")) {
                System.out.println("Заходи еще, пока =)");
                break;
            } else if (NumbersAndOperand.exitAreCancel(enterString).equals("c")) {
                enterString = scanner.nextLine();
                System.out.println("Давай еще раз!");
            }
            System.out.println("");
            System.out.println("Сейчас решим что тут у тебя.");
            System.out.println("");
            solution(NumbersAndOperand.numberOne(enterString), NumbersAndOperand.operand(enterString),
                    NumbersAndOperand.numberTwo(enterString));

        }
    }
    public static int solution(String num1, String operand, String num2) {
        int resuil = 0;
        switch (operand) {
            case "+":
                resuil = Integer.parseInt(num1) + Integer.parseInt(num2);
                System.out.println("У нас получается: " + resuil);
                System.out.println("");
                break;
            case "-":
                resuil = Integer.parseInt(num1) - Integer.parseInt(num2);
                System.out.println("У нас получается: " + resuil);
                System.out.println("");
                break;
            case "*":
                resuil = Integer.parseInt(num1) * Integer.parseInt(num2);
                System.out.println("У нас получается: " + resuil);
                System.out.println("");
                break;
            case "/":
                resuil = Integer.parseInt(num1) / Integer.parseInt(num2);
                System.out.println("У нас получается: " + resuil);
                System.out.println("");
                break;
        }
        return resuil;
    }
}
