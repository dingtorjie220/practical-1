
//prctical 1 q1

/*import java.util.Scanner;

public class Practical{
    public static void main (String[] args){
        String name;
        int year;
        float target;

        Scanner scan = new Scanner(System.in);


        System.out.print("Enter Name : ");
        name = scan.nextLine();

        System.out.print("\nEnter your year of study: ");
        year = scan.nextInt();

        System.out.print("\nWhat is your target GPA for this semester? ");
        target = scan.nextFloat();

        System.out.print("\nHello : " + name +"!");
        System.out.print("\nWork hard to achieve your target GPA of "+ target + " this semester of Year "+ year + ".");
    }
}
*/

//prctical 1 q2
/*
import java.util.Scanner;

public class Practical{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int age;
        System.out.print("Enter your age (years): ");
        age = s.nextInt();

        System.out.print("Age in Years: "+age+" years.\n");
        System.out.print("Age in days: "+ age * 365 + " days.\n");
        System.out.print("Age in seconds: "+ age *365 *24 *60 *60 + " seconds.\n");
    }
}
*/

//prctical 1 q3
/*
import java.util.Scanner;

public class Practical {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String creditNumber;
        int sum = 0, sum2 = 0;
        int total;

        System.out.print("Enter credit card No.: ");
        creditNumber = s.nextLine();

        for (int x = 7; x>=0; x-=2){
            int temp = creditNumber.charAt(x) - '0';
            sum += temp;
            System.out.print(temp+"+");
        }
        System.out.print("\b ");       
        System.out.print("= " + sum + "\n");

        for (int x = 6; x>=0; x-=2 ){
            int temp = creditNumber.charAt(x)-'0';
            System.out.print(temp * 2 +" " );
        }

        System.out.print("\n");
        for (int x = 6; x>=0; x-=2 ){
            int temp = creditNumber.charAt(x)-'0';
            int value = temp * 2;
            int no1 = value % 10;
            int no2 = value / 10;

            sum2 += no1 + no2;
            System.out.print(no2+"+"+no1+"+");

        }
        System.out.print("\b ");
        System.out.print("=" + sum2);
        System.out.print("\n");

        total = sum + sum2;
        System.out.print(sum + "+" + sum2 + "=" + total + "\n");

    }
}
*/

//tutorial q5
/*
import java.util.Scanner;

public class Practical {

    static void showOddNumber(){       
        //Declarations
        int minNum, maxNum;
        int sumNum = 0;
        Scanner s = new Scanner(System.in);

        //Input
        System.out.print("Enter Min Value: ");
        minNum = s.nextInt();

        System.out.print("Enter Max Value: ");
        maxNum = s.nextInt();

        //Process
        for(int x = minNum; x <= maxNum; x++){
            if(x == 0){
                System.out.print("Number Can't Start With 0!!\n");
                break;
            }
            else if(x == 1){
                System.out.print(x + " ");
                sumNum += x;
            }
            else if(x % 2 != 0){
                System.out.print(x + " ");
                sumNum += x;

            }

        }
        System.out.print("\n");


    }

    public static void main(String[] args){
       showOddNumber();
    }

}
*/