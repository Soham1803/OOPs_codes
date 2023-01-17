package Assignments;

import java.util.Arrays;
import java.util.Scanner;

class Adder{
    int[] array;
    int targetSum;

    public void getData(int[] array, int targetSum){
        this.array = array;
        this.targetSum = targetSum;
    }

    public int[] numSum(int targetSum){
        Arrays.sort(this.array);

        int i = 0, j = this.array.length-1;

        while(i < j){
            if(this.array[i] + this.array[j] < targetSum) i++;
            else if(this.array[i] + this.array[j] == targetSum)
                return new int[]{this.array[i], this.array[j]};
            else j--;
        }

        /*for(int i = 0; i < this.array.length-1; i++){
            for(int j = i; j < this.array.length; j++){
                if(this.array[i] + this.array[j] == targetSum)
                    return new int[]{this.array[i], this.array[j]};
            }
        }*/
        return new int[]{};
    }
}

public class Assign2 {
    public static void main(String args[]){
        /*int[] arre = {3, 3, 4, 2, 5, 6, 3, 0};*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values in the array: ");
        int length = sc.nextInt();
        int[] arre = new int[length];

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < arre.length; i++){
            boolean flag = true;
            if(i == 0) arre[i] = sc.nextInt();
            else{
                int entry = sc.nextInt();
                for(int j = 0; j < i; j++){
                    if(arre[j] == entry){
                        System.out.println("This element already exists in an array, enter any other input...");
                        i--;
                        flag = false;
                    }
                }
                if(flag == false) continue;
                else{
                    arre[i] = entry;
                }
            }
        }

        System.out.println("Enter target: ");
        int target = sc.nextInt();
        Adder obj = new Adder();
        obj.getData(arre, target);
        System.out.println(Arrays.toString(obj.numSum(target)));
    }
}
