import java.util.*;


public class Main {
    public static void main(String[] args) {
        String input = "Betelgeuse Rocks!!!";
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userInput = scan.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
        Sandbox.fizzBuzz(16);
        Sandbox beach = new Sandbox();
//        Sandbox squareSandbox = new Sandbox("square");
        Sandbox hexSandbox = new Sandbox("hexagon");
//        sandbox.shape = "hexagon";
//        sandbox.shape = "circle";
        System.out.println(beach.shape);
        System.out.println(hexSandbox.shape);
        beach.play();
        hexSandbox.play();
    }
}
