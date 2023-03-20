import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        double number1=0, number2=0, rezult = 0;
        char operand;
        System.out.print("Введіть перше число: ");
        number1 = scInput.nextDouble();

        System.out.print("Введіть друге число: ");
        number2 = scInput.nextDouble();

        System.out.print("Введіть математичну операцію: ");
        operand = scInput.next().charAt(0);

        //Зробити логіку калькулятора

        System.out.printf("Результат рівняння %1$s %2$s %3$s = %4$s %n", number1, operand, number2, rezult);
    }
}