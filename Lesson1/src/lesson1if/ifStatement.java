package lesson1if;

public class ifStatement {
    public static void main(String[] args) {

                //decision making statement
                //loop Statement
                //jump Statement

                /**
                 * decision making statement (2types)
                 * if statement and switch statement
                 */
                //if(condition){} =>if true do something

                int a = 10;
                int b = 9;

                if(a > b){
                    System.out.println(a + " is greater than 9");
                }

                //if -> else
                //if(condition){} else{}
                if(a<b) {
                    System.out.println(b + "is greater than " + a);
                }else{
                    System.out.println(a+" is greater than " +b);
                }
                /**
                 * if => else if => else
                 *
                 * if(condition){}else if(condition){}else{}
                 *
                 */
                int mark = 90;

                if(mark < 40) {
                    System.out.println("fail");
                }else if(mark >= 40 && mark < 80){
                    System.out.println("pass");
                }else {
                    System.out.println("D");
                }

            }
        }



