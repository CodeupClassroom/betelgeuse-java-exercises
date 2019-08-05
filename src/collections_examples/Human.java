package collections_examples;

public class Human {

    private boolean speak;
    private boolean logic;
    private String name;

    public Human(boolean speak, boolean logic, String name) {
        this.speak = speak;
        this.logic = logic;
        this.name = name;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSpeak() {
        return speak;
    }

    public void setSpeak(boolean speak) {
        this.speak = speak;
    }

    public boolean isLogic() {
        return logic;
    }

    public void setLogic(boolean logic) {
        this.logic = logic;
    }
}
