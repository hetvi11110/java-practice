class Bubble_sort{

  public static void bubbleSort(int[] nums) {

    int temp = 0;
    int n = nums.length;
    int flag = 0;
    for(int j=0; j < n-1; j++) {
      for(int i=0; i < n-1-j; i++) {
        if(nums[i] > nums[i+1] ) {
          temp = nums[i];
          nums[i] = nums[i+1];
          nums[i+1] = temp;
          flag = 1;
        }
      }
      if(flag == 0){
        System.out.println("Alerady sorted:");
        break;
      }
    }

  }

  public static void printArre(int[] nums){
    for (int i : nums) {
      System.out.println(i);
    }
  }

    public static void main(String[] args) {
        
        // int[] myNum = {1,2,3,4,5};
        int[] myNum = {3,60,35,2,45,320,5};
        System.out.println("Array before bubble sort:");
        printArre(myNum);
        bubbleSort(myNum);
        System.out.println("Array after bubble sort:");
        printArre(myNum);

      }

}