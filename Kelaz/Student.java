package Kelaz;

public class Student extends Person {
    private int number;
    private int score;
    private String major;

    public Student(String n, int a, int u, int s, String m) {
        super(n, a);
        this.number = u;
        this.score = s;
        this.major = m;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void print() {
        super.print();
        System.out.println("Number:" + number);
        System.out.println("Score:" + score);
        System.out.println("Major:" + major);
    }

}
