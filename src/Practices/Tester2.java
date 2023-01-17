package Practices;


import java.util.Arrays;

class Demo{
    int[] array;
    public Demo(int[] arre){
        this.array = arre;
    }

    public int[] disp(){
        int[] newArray = new int[this.array.length];

        int j = this.array.length-1;
        for(int i = 0; i < this.array.length; i++){
            newArray[j] = this.array[i];
            j--;
        }
        return newArray;
    }
}
public class Tester2 {

    public static void main(String args[]) {
        int[] arre = {1, 2, 4, 3, 5, 6};
        Demo obj = new Demo(arre);
        System.out.println(Arrays.toString(obj.disp()));
    }

}
