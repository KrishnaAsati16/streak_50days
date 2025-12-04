public class array14 {
    // Approach 1
    public static void main(String[] args) {
        int arr[] = {4,8,10,2,5,7,5,2,6,6,12,0};
        int target = 12;
        System.out.println("Pairs = " + target + ":");
          
        for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr.length;j++){
            if(arr[i]+arr[j]==target) 
                System.out.println(arr[i] + ", " + arr[j]);
                
            }

          }
        }
    }
    
