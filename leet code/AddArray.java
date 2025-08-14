public class AddArray {
    
    public static void main(String[] args) {
        AddArray addArray = new AddArray();
        int [] a = {1,2,3,0,0,0};
        int [] b = {2,5,6};
        addArray.addTwoArray(a, 3, b, 3);

    }

    void addTwoArray(int [] nums1, int m,int[] nums2,int n){
        int a=0;
        System.out.println(nums1[1]=5);
        System.out.println();
        while(a<n){
            for(int i =0;i<nums1.length;i++){ 
                if(nums1[i]>=nums2[a]){
                    if(nums1[i+1]>= nums2[a]){
                        System.out.println(nums1[i].to);
                        int temp = nums1[i+1];
                        nums1[i+1] = nums2[a];
                        nums1[i+2] = temp;
                        
                        break;
                    }
                }            
            
            }a++;
            System.out.println(nums1);
        }
    }


}
