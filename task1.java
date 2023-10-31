import java.util.Scanner;
public class task1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please tell me the start:");
        int start = input.nextInt();
        System.out.print("Please tell me the end:");
        int end = input.nextInt();

        if (start >= end){
            System.out.println("Errors occur!");
        
        }
        else{
            int sum = 0;
            do{
                sum += start++;
            }while (start <= end);
            System.out.printf("The result is %d%n",sum);
        }
    }
}
