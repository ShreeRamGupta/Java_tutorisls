package basic;

import java.util.Arrays;

public class FindAddEven {
    //Check wather number is Odd or even without using % modules Ops
    public static void main(String[] args) {
        int n=2;

        if((n&1)==0){
            System.out.println(n + " is Even");

        }else{
            System.out.println(n + " is Odd");

        }

        String s = "Java";

        char [] c = s.toCharArray();
        System.out.println(""+Arrays.toString(c));
        System.out.println(c[0]+c[3]);
        s = s+ s.charAt(n);
        System.out.println(s);
        FindAddEven findAddEven = new FindAddEven();
        System.out.println(findAddEven.addString("ab", "pqrkkj"));
        
    }

    String addString(String word1, String word2){
        int n = 0;

        if(word1.length()<=word2.length()){
            n = word2.length();
        }else{
            n=word1.length();
        }
        System.out.println(n);
        String marg="";
        for(int i=0;i<n;i++){
            if(i<word1.length()){
                marg+=word1.charAt(i);
            }
            if(i<word2.length()){
                marg +=word2.charAt(i);
            }
            System.out.println(marg);
        }

        return marg;
        
    }

    
    
}
