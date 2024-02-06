// https://youtu.be/6wVmqY-CrGM

public class Account {
    String name;
    int age;

    // without using any print lines
    public void printall () {
        System.out.println(name +":"+age);
    }

    // using getter and setter
    public void setAge (int age) {
        this.age = age;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return this.age;
    }

    public String getName () {
        return this.name;
    }

    public static void main (String[] args) {
        // without using setters and getters
        Account a = new Account();
        a.age = 34;
        a.name = "Pablo";
        // We want to print it
        // Instead of using:
        // System.out.println(a.name +":"+a.age);
        // Let's make a print function that can do that for us
        a.printall();
        // Notice we didn't had to use a.name and a.age in the function printall

        // with using setters and getters
        Account b = new Account();
        b.age = 44;
        b.name = "Somani";
        b.printall();
    }
}