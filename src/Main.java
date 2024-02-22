//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1: 0 to 30 step 1

        System.out.println("Task 1:");//Telling user which task it is

        for(int count = 0; count < 31; count++){ //for loop that starts at 0 and counts by 1 while the number is less than 31
            System.out.println(count);//outputs the number
        }
        //Task 2: 30 to 0 step -1

        System.out.println("Task 2:");//Telling user which task it is

        for(int count = 30; count > -1; count--){//for loop that starts at 30 and counts by -1 while number is greater than -1
            System.out.println(count);//outputs the number
        }
        //Task 3: 0 to 18 step 3

        System.out.println("Task 3:");//Telling user which task it is

        for(int count = 0; count < 19; count+=3){//for loop that starts at 0 and counts by 3 while number is less than 19
            System.out.println(count);//outputs the number
        }
        //Task 4: 10 to 0 step -2

        System.out.println("Task 4:");//Telling user which task it is

        for(int count = 10; count > -1; count-=2){//for loop that starts at 10 and counts by -2 while number is greater than -1
            System.out.println(count);//outputs the number
        }
        System.out.println("Task 5:");//Telling user which task it is
        for(int col = 1; col <= 5; col++){ //making all five columns
            for(int row = 1; row <= col; row++){ //adding one * to each line
                System.out.print("*"); //printing *
            }
            System.out.println();//adding another line
        }
        System.out.println("Task 6:");//Telling user which task it is
        for(int col = 1; col <= 5; col++){ //making all five columns
            for(int row = 5; row >= col; row--){ //adding one * to each line
                System.out.print("*"); //printing *
            }
            System.out.println(); //adding another line
        }
        System.out.println("Task 7:");//Telling user which task it is
        for(int col = 1; col <= 5; col++){ //making all five colums
            for(int row = 5; row == 5; row++){ 
                System.out.print("*****"); //printing the 5 *
            }
            System.out.println(); //adding another line
        }
    }
}
