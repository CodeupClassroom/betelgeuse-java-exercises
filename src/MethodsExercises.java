public class MethodsExercises {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, int b) {
        //return a * b;
        //using loop for repeated addition
//        double result = 0;
//        for (int i = 0; i< b; i++) {
//            result += a;
//        }
//        return result;

        //using recursion for repeated addition
        if (b <= 0) return 0;
        return a + multiply(a, b-1);
    }
    public static double divide(double a, double b) {
        return a / b;
    }
    public static double modulus(double a, double b) {
        return a % b;
    }

//    [visibility ownership] ReturnType methodName(ParamType paramName, ...) {
//        // yada yada
//        ReturnType something;
//        return something;
//    }

    public static void main(String[] args) {
        System.out.println(add(3,17)); //expected 20
        System.out.println(subtract(10.1,2.7)); //expected 7.4
        System.out.println(multiply(.5, 5)); // expected 2.5
        System.out.println(divide(15,3.0)); // expected 5.0
        System.out.println(modulus(17.0, 5)); // expected 2
        System.out.println(divide(9,0));
    }
}
