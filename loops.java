import java.util.Scanner;
public class loops {
    public static void main(String[] args) {

    /* Syntax of for loop
    for( initialization ; condition ; increment/decrement){
         //body
       }
     */
        // Q. Print numbers from 1 to 5
        for(int num = 1; num<=5; num+=1)
            System.out.println(num);

        // Q . print number from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n  ; i++) {
            System.out.println(i);

        }

    }
}
