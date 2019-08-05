package collections_examples;

public class Instructor extends Human implements Tasks {

    private boolean job;
    private double experience;

    public Instructor(boolean speak, boolean logic, String name) {
        super(speak, logic, name);
    }

    public boolean isJob() {
        return job;
    }

    public void setJob(boolean job) {
        this.job = job;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public String[] teach() {

//        list of subjects

        String[] subjects = new String[5];
        subjects[0] = "mysql";
        subjects[1] = "java";
        subjects[2] = "js";
        subjects[3] = "spring";
        subjects[4] = "jquery";

        if(getName().equalsIgnoreCase("Daniel")){
            subjects[4] = "react";
        }

        return subjects;
    }

    @Override
    public String answerQuestion(String question) {
        return "answer";
    }
}
