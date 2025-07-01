package basic;

public class PatternPrint {
    public static void main(String[] args) {
        PatternPrint patternPrint = new PatternPrint();
        //patternPrint.plainPattern(5);
        //patternPrint.incresTringal(7);
        //patternPrint.decreseTringal(7);
        //patternPrint.righttringal(6);
        //patternPrint.leftDTringal(6);
        patternPrint.piramidPatter(7);
    }

    public void piramidPatter(int n){
        for(int i=0;i<n;i++){
            //decreasing
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            
            //increasing
            for(int j=0;j<i-1;j++){
                System.out.print("* ");
            }

            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void leftDTringal(int n) {
       for(int i =0;i<n;i++){
        //increasing traigal
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            //decresing tringal
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    public void righttringal(int n){
        for(int i =0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }

            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void decreseTringal(int n ){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void incresTringal(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void plainPattern(int n){
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
