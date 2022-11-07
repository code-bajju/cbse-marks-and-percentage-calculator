import java.util.Scanner;

public class cbse_calculator {

    int a;

    public static void main(String[] args) {
        System.out.println("Your marks will be converted into the Percentage");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of 1st Subject ");
        float a = sc.nextFloat();
        System.out.println("Enter the marks of 2nd Subject");
        float b = sc.nextFloat();
        System.out.println("Enter the marks of 3rd Subject");
        float c = sc.nextFloat();
        System.out.println("Enter the marks of 4th Subject");
        float d = sc.nextFloat();
        System.out.println("Enter the marks of 5th Subject");
        float e = sc.nextFloat();
        System.out.println("Enter the total marks");
        float ttl_mark = sc.nextFloat();

        char operator;
        System.out.println("Enter your choice:\n Choose 1 for percantage \n Input 2 for Total Obtained Marks");
       operator = sc.next().charAt(0);

        switch(operator){
            case '1':
            System.out.print("Your % : ");
        System.out.print(((a+b+c+d+e)/(ttl_mark))*100+"%");
        break;
        case '2':
            System.out.print("Total Obtained Marks is : "+(a+b+c+d+e));
        
      break;
      default:
      System.out.printf("%c is wrong choice",operator);
    }

    sc.close();
    }

}
