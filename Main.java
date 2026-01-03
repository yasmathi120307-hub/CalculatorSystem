import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface user1 = new User();
        int []value1=user1.getNum();//putting array address into a value
        Scanner scanner = new Scanner(System.in);
        System.out.println("USER1");
        //num1
        System.out.println("Enter the num1:");
        BigInteger inputNum1=new BigInteger(scanner.nextLine());
        value1[0]=inputNum1.intValue();
        //num2
        System.out.println("Enter the num2:");
        BigInteger inputNum2=new BigInteger(scanner.nextLine());
        value1[1]=inputNum2.intValue();//it is stored in th place of the array address so we dont need to say to the user as user knowns himself
        //num3
        System.out.println("Enter the num3:");
        BigInteger inputNum3=new BigInteger(scanner.nextLine());
        value1[2]=inputNum3.intValue();
        //calculatorType
        System.out.println("calculatorType:");
        String type=scanner.nextLine();
        user1.setCalculatorType(type);


        UserInterface user2 = new User();
        int []value2=user2.getNum();
        System.out.println("USER2");
        //num1
        System.out.println("Enter the num1:");
        BigInteger num1=new BigInteger(scanner.nextLine());
        value2[0]=num1.intValue();
        //num2
        System.out.println("Enter the num2:");
        BigInteger num2=new BigInteger(scanner.nextLine());
        value2[1]=num2.intValue();
        //num3
        System.out.println("Enter the num3:");
        BigInteger num3=new BigInteger(scanner.nextLine());
        value2[2]=num3.intValue();
        //calculatorType
        System.out.println("calculatorType:");
        String cType=scanner.nextLine();
        user2.setCalculatorType(cType);

        if(user1.getCalculatorType().equals("Add")){
            AdderInterface add=new Adder("AS123",user1);
            add.compute();
        }
        else if(user1.getCalculatorType().equals("Multiple")) {
            MultiplierInterface multiplier=new Multiplier("df123",user1);
            multiplier.compute();
        }
        else{
            System.out.println("Not valid calculatorType");
        }

        if(user2.getCalculatorType().equals("Add")){
            AdderInterface add=new Adder("AS123",user2);
            add.compute();
        }
        else if(user2.getCalculatorType().equals("Multiple")) {
            MultiplierInterface multiplier=new Multiplier("df123",user2);
            multiplier.compute();

        }
        else{
            System.out.println("Not valid calculatorType");
        }

    }

}