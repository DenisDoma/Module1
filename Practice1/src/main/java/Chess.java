import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текующее положение фигуры");
        String presentValue = scanner.nextLine();
        System.out.print("Введите точку для хода фигуры");
        String desiredValue = scanner.nextLine();
        System.out.println(makeMoveOrNot(presentValue, desiredValue));

    }

    private static boolean makeMoveOrNot(String presentValue, String desiredValue) {
        char[] actualtValue = presentValue.toCharArray();
        char[] expectedValue = desiredValue.toCharArray();
        boolean moveFigure = false;

        int letter = Math.abs(actualtValue[0] - expectedValue[0]);
        int num = Math.abs(actualtValue[1] - expectedValue[1]);
        if ((letter == 2 && num == 1) || (letter == 1 && num == 2)) {
            moveFigure = true;
        }
        return moveFigure;
    }
}
