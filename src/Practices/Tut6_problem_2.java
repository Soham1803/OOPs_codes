package Practices;

public class Tut6_problem_2 {

    public static void main(String args[]){

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        if(m == 3){
            if(d < 20 || d > 31) System.out.println(false);
            else System.out.println(true);
        }

        if(m == 4){
            if(d < 1 || d > 30) System.out.println(false);
            else System.out.println(true);
        }

        if(m == 5){
            if(d < 1 || d > 31) System.out.println(false);
            else System.out.println(true);
        }

        if(m == 6){
            if(d < 1 || d > 20) System.out.println(false);
            else System.out.println(true);
        }
    }
}
