package basic;

import java.util.ArrayList;

public class testForeach {
    public static void main(String[] args) {

        int arr[] = {2,4,6,7,8,7};
        ArrayList list = new ArrayList<Integer>();

        list.add(45);
        list.add(34);
        list.add(23);
        list.add(34);
        
        list.forEach((n)->{
            System.out.println(n);
        });
        for (int arr2 : arr) {
            System.out.print(arr2);
        }
       
        }
    }

