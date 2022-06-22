import java.util.*;

public class sample {
    public static void main(String[] args) {
        //Reading the array from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array that is to be created: ");
        int size = scanner.nextInt();
        int [] myArray = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            myArray[i] = scanner.nextInt();
        }
        //Reading the number
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("The array created is: "+Arrays.toString(myArray));
        System.out.println("Indices of the element whose sum is: "+num);
        for(int i=0;i<myArray.length;i++){
            for (int j=i;j<myArray.length;j++){
                if(myArray[i]+myArray[j] == num && i!=j){
                    System.out.println(i+", "+j);
                }
            }
        }
    }
}
