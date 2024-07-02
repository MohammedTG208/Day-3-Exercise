import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Start role of the user
        //1.Write a program that checks the role of the user
        Scanner role = new Scanner(System.in);
        System.out.println("=== Task 1===");
        System.out.print("Enter your role: ");
        String user = role.nextLine();
        System.out.println();
        if (user.toLowerCase() == "admin") {
            System.out.println("welcome " + user);
        } else if (user.toLowerCase() == "superuser") {
            System.out.println("welcome " + user);
        } else {
            System.out.println("welcome " + user);
        }
        /*
        * Output:
        * Enter your role: Admin
        * welcome Admin
        * */
        //end role of the user

        //Start  print the greatest number
        //2.Take three numbers from the user and print the greatest number.
        System.out.println("===Task 2===");
        Scanner biger = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int num1 = biger.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = biger.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = biger.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("greatest: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("greatest: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("greatest: " + num3);
        }
        /*
        * Output:
        * Input the 1st number: 25
        * Input the 2nd number: 78
        * Input the 3rd number: 87
        * greatest: 87
        * */
        //end print the greatest number

        //start displays the name of the weekday.
        //3.Write a Java program that generates an integer between 1 and 7 and
        //displays the name of the weekday.
        System.out.println("===Task 3==");
        Scanner weekday=new Scanner(System.in);
        System.out.println("Enter number between 1 and 7");
        int day= weekday.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("between 1 and 7");
                break;
        }
        /*
        * Output:
        * Enter number between 1 and 7
        * 4
        * Thursday
        * */
        //End weekday

        //Start grade
        //4. Write a program that takes a numeric score as input and prints the
        //corresponding letter grade using the following grading scale:
        System.out.println("===Task 4==");
        Scanner grade=new Scanner(System.in);
        System.out.println("A: 90-100 \n B: 80-89 \nC: 70-79 \nD: 60-69\nF: 0-59 ");
        System.out.print("Enter your numeric score: ");
        int score= grade.nextInt();
        if(score<101){
            if(score>=90){
                System.out.println("Numeric Score: "+score);
                System.out.println("Letter Grade: A");
            } else if (score>=80) {
                System.out.println("Numeric Score: "+score);
                System.out.println("Letter Grade: B");
            } else if (score>=70) {
                System.out.println("Numeric Score: "+score);
                System.out.println("Letter Grade: C");
            } else if (score>=60) {
                System.out.println("Numeric Score: "+score);
                System.out.println("Letter Grade: C");
            } else {
                System.out.println("Numeric Score: "+score);
                System.out.println("Letter Grade: F");
            }
        }else {
            System.out.println("Enter between 0 to 100");
        }
        /*
        * Output:
        * Enter your numeric score: 84
         * Numeric Score: 84
         * Letter Grade: B
         * */
        //End grade

        //start age categories
        //5. Write a Java program that takes a person's age as input and
        //categorizes them into one of three age categories: "Child,"
        //"Teenager," or "Adult" using an if statement.
        System.out.println("===Task 5==");
        System.out.print("Enter your age: ");
        Scanner categories=new Scanner(System.in);
        int age=categories.nextInt();
        if(age<13){
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        }else{
            System.out.println("Adult");
        }
        /*
        * Output:
        * Enter your age: 25
        * Adult
         * */
        //End age categories
    }
}
