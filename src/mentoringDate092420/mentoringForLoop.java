package mentoringDate092420;

public class mentoringForLoop {

    /*
    The for loop is used to repeat a task a set number of times.
    For loop has three parts {just like the other loops}
    #1 Variable declaration
    #2 Condition - decides were the loop will continue running or not
    #3 Iteration - This statement is the part which will stop the loop
     */


    public static void main(String[] args) {

        /*
        FOR LOOP Syntax:
        for (variable declaration, condition, iteration) {
        Code to be executed;
        }
         */
        String a = "*";
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");

            }
        }
        for (int b = 0; b < 10; b++) {

            for (int c = 0; c <= 4 - b; c++) {
                System.out.print(a + " ");

            }
            System.out.println("");

        }

        /*

        1 2 3 4
        5 6 7
        8 9
        10
         */
                    /*

                    1
                    2 3
                    4 5 6
                    7 8 9 10

                     */
    }
}

