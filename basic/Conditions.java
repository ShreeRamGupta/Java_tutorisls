package basic;

public class Conditions {
   
    Conditions(){
        System.out.println("main method check");
    }
    public static void main(String[] args) {
        int time=20;
        String result = (time>18)? "gerter then condtion":"Less then condition";
        System.out.println(result);

        Conditions conditions = new Conditions();
        result = conditions.checkMyHealth(45,5,30)?"he is well fit":"Sorry for he\'s health";
        System.out.println(result);


    }
    

    boolean checkMyHealth(int age,int heigth, int weight ){
        boolean helth=false;
        if(age<50 && age>18){
            if(heigth < 7){
                if(weight>50){
                    helth = true;
                }else{
                    helth = false;
                }
            }
        }else{
            return false;
        }
        return helth;
    }
}
