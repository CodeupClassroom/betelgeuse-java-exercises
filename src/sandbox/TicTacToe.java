package sandbox;

public class TicTacToe {

    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (char n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }
        System.out.println("+---+---+---+");

    }

    public static void main(String[] args) {

//        int[] ourArray = {5,10,21,4,-40,3,12};
////        for (int item : ourArray)
////            System.out.println(item);
//        Arrays.fill(ourArray, 17);
////        for (int item : ourArray)
////            System.out.println(item);
//
//        int[] ourNewArray = Arrays.copyOf(ourArray, 8);
//        for (int item : ourNewArray)
//            System.out.println(item);
//
//        System.out.println(Arrays.toString(ourNewArray));
//        Arrays.sort(ourNewArray);
//        System.out.println(Arrays.toString(ourNewArray));
        char[][] tictactoe = {
                {' ',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '}
        };

        tictactoe[2][1] = 'X';

        tictactoe[2][2] = 'O';

        tictactoe[1][0] = 'X';

        tictactoe[0][2] = 'O';

        tictactoe[1][2] = 'X';

        tictactoe[1][1] = 'O';

        tictactoe[0][0] = 'X';

        tictactoe[2][0] = 'O';

        printBoard(tictactoe);
    }

}
