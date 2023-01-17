package Practices;

class ArrayOps{

    public int minEl(int[] arre){
        int min = 100;

        for(int i = 0; i < arre.length; i++){
            if(arre[i] < min){
                min = arre[i];
            }
        }
        return min;
    }
}

public class Tester3 {
    public static void main(String args[]){
        ArrayOps obj1 = new ArrayOps();

        int[] arre = {4, 2, 4, 5, 6};
        System.out.println(obj1.minEl(arre));
    }
}
