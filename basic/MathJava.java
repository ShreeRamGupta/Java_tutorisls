package basic;

public class MathJava {
    //globale veriable
    static int x;
    static int y;

    public static void main(String[] args) {
        float z=-4.94f;
        System.out.println("Static gloable veriable "+x);
        x=6; y =7;
        System.out.println("local veriable ="+z);

        System.out.println(Math.max(x, z));
        System.out.println(Math.min(y, z));

        System.out.println(Math.sqrt(y));

        System.out.println(Math.abs(z));

        System.out.println("random="+Math.random());
        int rend = (int) (Math.random()*101);
        System.out.println(rend);



    }


}
