
public class Main {
    public static void main(String[] args) {
        String name = "Betelgeuse";

        String name2 = "Be";
        name2 += "tel";
        name2 += "geuse";

        if (name == name2)
            System.out.println("Same reference");

        if (name.equals(name2))
            System.out.println("Same value");
        // like 2 copies of the same file
    }

}
