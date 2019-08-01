import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    private String[] nouns = {"chinchilla", "paper", "ferret", "mausoleum", "pachyderm", "apparatus", "pepperoni", "Constantinople", "salary", "celery", "banana", "door"};
    private String[] adjectives;

    private static String randomElement(String[] strings) {
        Random wordRandom = new Random();
//        Random adjRandom = new Random();
//        int randomNumber1 = wordRandom.nextInt(nouns.length);
//        int randomNumber2 = Random.nextInt(adjectives.length);

        int sng = wordRandom.nextInt(strings.length);
        return strings[sng];
    }


    public ServerNameGenerator() {
        adjectives = new String[12];
        adjectives[0] = "big";
        adjectives[1] = "bad";
        adjectives[2] = "icy";
        adjectives[3] = "icky";
        adjectives[4] = "savvy";
        adjectives[5] = "superfluous";
        adjectives[6] = "destructive";
        adjectives[7] = "buoyant";
        adjectives[8] = "french";
        adjectives[9] = "facetious";
        adjectives[10] = "valiant";
        adjectives[11] = "aggressive";
    }

    public static void main(String[] args) {
        ServerNameGenerator sng = new ServerNameGenerator();
//        System.out.println(sng.nouns);
//        System.out.println(Arrays.toString(sng.nouns));
//        System.out.println(Arrays.toString(sng.adjectives));
        for (int i = 0;i<10;i++)
            System.err.printf("%s-%s%n", randomElement(sng.adjectives), randomElement(sng.nouns));
    }
}
