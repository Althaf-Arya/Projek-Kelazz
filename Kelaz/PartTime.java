package Kelaz;

public class PartTime extends Teacher {
    int houseWork;

    public PartTime(String n, int a, String s, int hw) {
        super(n, a, s);
        houseWork = hw;
    }

    public int getHouseWork() {
        return this.houseWork;
    }

    public void setHouseWork(int houseWork) {
        this.houseWork = houseWork;
    }

    int setSalary = houseWork * 50000;

    public void print() {
        super.print();
        System.out.println("Gaji Per jam: Rp." + setSalary);
    }

    
}
