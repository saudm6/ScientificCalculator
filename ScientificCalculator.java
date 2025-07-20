import java.util.Objects;
import java.util.Scanner;


public class ScientificCalculator {

    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        while(true){
            displayMenu();
            }
        }


    public static void displayMenu() {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("""
                Function = (type this to perform the action)\
                
                1 = Addition\
                
                2 = Subtraction\
                
                3 = Multiplication\
                
                4 = Division\
                
                5 = Power\
                
                6 = Sin\
                
                7 = Cosine\
                
                8 = Tangent\
                
                9 = Natural log\
                
                10 = log base 10\
                
                11 = Absolute value\
                
                12 = Round\
                
                13 = Ceiling\
                
                14 = Floor\
                
                15 = Minimum\
                
                16 = Maximum\
                
                17 = Helper Operations\
                
                18 = Exit\
                
                Enter the operation you want to run:\s""");

        String userInput = inputReader.nextLine();
        if(Objects.equals(userInput, "1")){
            add();
        } else if (Objects.equals(userInput, "2")) {
            minus();
        }else if (Objects.equals(userInput, "3")) {
            multiply();
        } else {
            System.out.println("\nEnter a valid response\n");
        }
    }
    public static void add(){
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1 = inputReader.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = inputReader.nextDouble();
        System.out.println(num1 + num2 + "\n\n");
    }

    public static void minus(){
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1 = inputReader.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = inputReader.nextDouble();
        System.out.println(num1 - num2 + "\n\n");
    }

    public static void multiply(){
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1 = inputReader.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = inputReader.nextDouble();
        System.out.println(num1 * num2 + "\n\n");
    }

}


