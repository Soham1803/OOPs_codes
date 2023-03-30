/*Implementing “Multiple Inheritance”. Create a two interfaces Account containing methods set ()
and display () And interface Person containing methods store () and disp(). Derive a class
Customer from Person and Account. Accept the name, account number, balance and display all
the information related to account along with the interest.*/


package Practices;

interface Accout{

    void set(String name, int accountNum, int balance);
    void display();
}

interface Person{
    void store();
    void disp();
}

class Customer implements Accout, Person{

    String name;
    int accoutNum;
    int balance;

    @Override
    public void set(String name, int accountNum, int balance) {
        this.name = name;
        this.accoutNum = accountNum;
        this.balance = balance;
    }

    @Override
    public void store() {

    }

    @Override
    public void display() {
        System.out.println("Name: "+this.name);
        System.out.println("Account number: "+this.accoutNum);
    }

    @Override
    public void disp() {

    }
}

public class Tut9_problem_2 {

    public static void main(String[] args) {
        Accout obj = new Customer();
        /*obj.print();*/
    }
}
