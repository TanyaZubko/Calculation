public class Main {

    public static void main(String[] args) {
        System.out.println("Сумма равна: " + sum(2, 3));
        System.out.println("Разница равна: " + sub(2, 3));
        System.out.println("Умножение равно: " + mul(2, 3));
        System.out.println("Деление равно: " + div(2, 3));

        System.out.println("Число делится на 3 без остатка:" + divisionByThreeChecker(50));

        System.out.println("Сумма равна: " + sum2(2, 3));


    }

    static public int sum2(int a,int b){
        int sum = a + b;
        return sum;
    }

    private static double sum(double a, double b){
        return a + b;
    }

    private static double div(double a, double b){
        return a / b;
    }

    private static double mul(double a, double b){
        return a * b;
    }

    private static double sub(double a, double b){
        return a - b;
    }

    private static boolean divisionByThreeChecker(int a){
        if (a%3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}


