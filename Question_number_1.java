import java.util.*;

// Find the sum of the multiples of 3 or 5 below the provided parameter value number.
// Question number 1(Project Euler)
public class Question_number_1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your limit here: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i<n; i++){
            if (i%3==0 || i%5==0){
                sum = sum + i;
            }
        }
        System.out.print("Your sum value is: " + sum);

    }
}
