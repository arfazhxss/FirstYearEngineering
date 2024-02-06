public class payRate {
    private int hrsPerWeek;
    private double wagePerHour;
    public payRate() {
        hrsPerWeek = 0;
        wagePerHour = 0.0;
        System.out.println("A");
    }
    public payRate(int hrsPerWeek, double wagePerHour) { this.hrsPerWeek = hrsPerWeek;
    this.wagePerHour = wagePerHour; System.out.println("B");
    }
        public void setHours(int hrsPerWeek) {
            this.hrsPerWeek = hrsPerWeek;
    }
        public int getHours() {
            return this.hrsPerWeek;
    }
    public void setWage(double wagePerHour) { this.wagePerHour = wagePerHour;
    }
        public double getWage() {
            return this.wagePerHour;
    }
    public int getSalary() {
    return (hrsPerWeek * (int) wagePerHour * 52);
    }
        public boolean equals(payRate pr) {
            return this.getSalary() == pr.getSalary();
    }
    public String toString() {
    return hrsPerWeek + "*" + wagePerHour + " per week";
    }
    public void giveRaise(int percent) {
        this.setWage(((this.getWage()*((double)percent/100))+this.getWage()));
    }
    public static void main(String[] args) {
        payRate prate1;
        payRate prate2; System.out.println("C:");
        payRate prate3 = new payRate();
        System.out.println("D:" + prate3.getWage());
        payRate prate4 = prate3;
        prate1 = new payRate(20, 40.97);
        prate2 = new payRate(40, 15.90); System.out.println("E:" + prate2);
        prate3 = prate2;
        prate3.setWage(20.27);
        System.out.println("F:" + prate1.getWage());
        System.out.println("G:" + prate2.getWage());
        System.out.println("H:" + prate3.getWage());
        System.out.println("I:" + prate4.getWage());
        System.out.println("J:" + prate1.equals(prate4));
        System.out.println("K:" + prate1.equals(prate3));
        System.err.println("Before:\t"+prate1.getWage());
        prate1.giveRaise(50);
        System.err.println("After:\t"+prate1.getWage());
    }
}