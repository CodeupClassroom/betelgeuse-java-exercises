package interfaces_examples;

public interface WritesCode {

    public abstract Bug[] writesCode(int numOfLines);

    boolean debug(Bug bug);

    void drinkCoffee();

    // could return null!
//    StackOverflowLink searchForAnswer(Bug bug);
//
//    BrokenKeyboard smashKeyboard(Keyboard k);

}
