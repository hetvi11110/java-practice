class Bubble_sort{

  public static void bubbleSort(int[] nums) {

    int temp = 0;

    temp = nums[1];
    nums[1] = nums[2];
    nums[2] = temp;
    
  }

  public static void printArre(int[] nums){
    for (int i : nums) {
      System.out.println(i);
    }
  }

    public static void main(String[] args) {
        
        int[] myNum = {10, 20, 30, 40};
        System.out.println("Array before bubble sort:");
        printArre(myNum);
        bubbleSort(myNum);
        System.out.println("Array after bubble sort:");
        printArre(myNum);
      }

}