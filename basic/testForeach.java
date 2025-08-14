import java.util.ArrayList;

public class testForeach {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<Integer>();

        list.add(45);
        list.add(34);
        list.add(23);
        list.add(34);
        
        if(list.isEmpty()){
            list.forEach(n -> System.out.println(n));

            System.out.println("Even elements of the arraylist");

            list.forEach(n ->{
                if(n/2 == 0)
                System.out.println(n);
            });
        }
    }
}
