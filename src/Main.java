public class Main {
    public static void main(String[] args) {
        int myFavoriteNumber;
        myFavoriteNumber = 144000;
        System.out.println(myFavoriteNumber);

        String myString = "Betelgeuse";
        System.out.println(myString);

        double myNumber = 3.14;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        Integer three = (Integer) o;
//        int three = (int) "three";

        int y = 4;
        y += 5;

        int a = 3;
        int b = 4;
        b *= a;
        // b = b * a

        int c = 10;
        int d = 2;
        //c = c / d;
        c /= d;
        //d = d - c;
        d -= c;

        int max = Integer.MAX_VALUE;
        System.out.println(max);
//        max+= 10;
        System.out.println(max);

        byte little = (byte)max;
        System.out.println(little);
    }
}
