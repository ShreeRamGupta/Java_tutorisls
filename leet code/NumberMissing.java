//missing number
public class NumberMissing {
    
    public static void main(String []args){
        NumberMissing numberMissing = new NumberMissing();
        int [] ab ={2,5,3,8,9,4} ;

        System.out.println(numberMissing.missingNum(ab));
    }
    int missingNum(int arr[]) {
        // code here
        int n = arr.length+1;
        
        for(int i =1;i<=n;i++){
            boolean check = false;
            for(int j =0;j<n-1;j++){
                if(arr[j]==i){
                    check = true;
                    break;
                }
            }
            
            //if number if not present
            if(!check){
                return i;
            }
        }
        return -1;
    }
}
