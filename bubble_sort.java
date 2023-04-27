class Bubble_sort{

  public static void bubbleSort(int[] nums) {

    int temp = 0;
    int n = nums.length;
    for(int i=0; i < n-1; i++) {
      if(nums[i] > nums[i+1] ) {
        temp = nums[i];
        nums[i] = nums[i+1];
        nums[i+1] = temp;
      }
    }
  }

  public static void printArre(int[] nums){
    for (int i : nums) {
      System.out.println(i);
    }
  }

    public static void main(String[] args) {
        
        int[] myNum = {40, 20, 30};
        System.out.println("Array before bubble sort:");
        printArre(myNum);
        bubbleSort(myNum);
        System.out.println("Array after bubble sort:");
        printArre(myNum);
      }

}