import java.util.Objects;
import java.util.Scanner;


public class ScientificCalculator {

    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        while(displayMenu(true)){
            displayMenu(true);
            }
        }

    public static boolean displayMenu(boolean b) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("""
                ====== Scientific Calculator ======\
                
                1 = Addition\
                
                2 = Subtraction\
                
                3 = Multiplication\
                
                4 = Division\
                
                5 = Square root\
                
                6 = Power\
                
                7 = Sine\
                
                8 = Cosine\
                
                9 = Tangent\
                
                10 = Natural log\
                
                11 = log base 10\
                
                12 = Absolute value\
                
                13 = Round\
                
                14 = Ceiling\
                
                15 = Floor\
                
                16 = Minimum\
                
                17 = Maximum\
                
                18 = Exit\

                Enter the operation you want to run:\s""");

        String userInput = inputReader.nextLine();
        if(Objects.equals(userInput, "1")){
            add();
        } else if (Objects.equals(userInput, "2")) {
            minus();
        }else if (Objects.equals(userInput, "3")) {
            multiply();
        } else if (Objects.equals(userInput, "4")) {
            division();
        } else if (Objects.equals(userInput, "5")) {
            squareRoot();
        } else if (Objects.equals(userInput, "6")) {
            power();
        } else if (Objects.equals(userInput, "7")) {
            sine();
        } else if (Objects.equals(userInput, "8")) {
            cosine();
        } else if (Objects.equals(userInput, "9")) {
            tangent();
        } else if (Objects.equals(userInput, "10")) {
            naturalLog();
        } else if (Objects.equals(userInput, "11")) {
            base10();
        } else if (Objects.equals(userInput, "12")) {
            absolute();
        } else if (Objects.equals(userInput, "13")) {
            round();
        } else if (Objects.equals(userInput, "14")) {
            ceil();
        } else if (Objects.equals(userInput, "15")) {
            floor();
        } else if (Objects.equals(userInput, "16")) {
            min();
        } else if (Objects.equals(userInput, "17")) {
            max();
        } else if (Objects.equals(userInput, "18")) {
            return false;
        } else {
            System.out.println("\nEnter a valid response\n");
        }
        return displayMenu(true);
    }
    public static void add(){
        Scanner inputReader = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;

        while (true){
            System.out.print("Enter number 1: ");
            if (inputReader.hasNextDouble()){
                num1 = inputReader.nextDouble();
                break;
            }
            else {
                System.out.println("ENTER A VALID NUMBER");
                inputReader.next();
            }
        }

        while (true){
            System.out.print("Enter number 2: ");
            if (inputReader.hasNextDouble()){
                num2 = inputReader.nextDouble();
                break;
            }
            else {
                System.out.println("ENTER A VALID NUMBER");
                inputReader.next();
            }
        }

        System.out.println(num1 + num2 + "\n\n");
    }

    public static void minus(){
        Scanner inputReader = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;

        while (true){
            System.out.print("Enter number 1: ");
            if (inputReader.hasNextDouble()){
                num1 = inputReader.nextDouble();
                break;
            }
            else {
                System.out.println("ENTER A VALID NUMBER");
                inputReader.next();
            }
        }

        while (true){
            System.out.print("Enter number 2: ");
            if (inputReader.hasNextDouble()){
                num2 = inputReader.nextDouble();
                break;
            }
            else {
                System.out.println("ENTER A VALID NUMBER");
                inputReader.next();
            }
        }

        System.out.println(num1 - num2 + "\n\n");
    }

    public static void multiply(){
        Scanner inputReader = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;

        while (true){
            System.out.print("Enter number 1: ");
            if (inputReader.hasNextDouble()){
                num1 = inputReader.nextDouble();
                break;
            }
            else {
                System.out.println("ENTER A VALID NUMBER");
                inputReader.next();
            }
        }

        while (true){
            System.out.print("Enter number 2: ");
            if (inputReader.hasNextDouble()){
                num2 = inputReader.nextDouble();
                break;
            }
            else {
                System.out.println("ENTER A VALID NUMBER");
                inputReader.next();
            }
        }

        System.out.println(num1 * num2 + "\n\n");
    }

    public static void division(){
        Scanner inputReader = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;

        while (true){
            System.out.print("Enter number 1: ");
            if (inputReader.hasNextDouble()){
                num1 = inputReader.nextDouble();
                break;
            }
            else {
                System.out.println("ENTER A VALID NUMBER");
                inputReader.next();
            }
        }

        while (true){
            System.out.print("Enter number 2: ");
            if (inputReader.hasNextDouble()){
                num2 = inputReader.nextDouble();
                break;
            }
            else {
                System.out.println("ENTER A VALID NUMBER");
                inputReader.next();
            }
        }

        System.out.println(num1 / num2 + "\n\n");
    }

    public static void squareRoot(){
        double num = 0;
        Scanner inputReader = new Scanner(System.in);
        while (true){
            System.out.print("Enter number: ");
            if (inputReader.hasNextDouble()){
                num = inputReader.nextDouble();
                System.out.print(Math.sqrt(num) + "\n\n");
                break;
            }
            else {
                System.out.print("ENTER A VALID NUMBER " + "\n");
                inputReader.next();

            }
        }
    }

    public static void power(){
        Scanner inputReader = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;

        while (true){
            System.out.print("Enter base: ");
            if (inputReader.hasNextDouble()){
                num1 = inputReader.nextDouble();
                break;
            }
            else {
                System.out.println("ENTER A VALID NUMBER");
                inputReader.next();
            }
        }

        while (true){
            System.out.print("Enter exponent: ");
            if (inputReader.hasNextDouble()){
                num2 = inputReader.nextDouble();
                break;
            }
            else {
                System.out.println("ENTER A VALID NUMBER");
                inputReader.next();
            }
        }

        System.out.println(Math.pow(num1, num2) + "\n\n");
    }

    public static void sine(){
        double num = 0;
        Scanner inputReader = new Scanner(System.in);
        while (true){
            System.out.print("Enter number: ");
            if (inputReader.hasNextDouble()){
                num = inputReader.nextDouble();
                System.out.print(Math.sin(num) + "\n\n");
                break;
            }
            else {
                System.out.print("ENTER A VALID NUMBER " + "\n");
                inputReader.next();

            }
        }
    }

    public static void cosine(){
        double num = 0;
        Scanner inputReader = new Scanner(System.in);
        while (true){
            System.out.print("Enter number: ");
            if (inputReader.hasNextDouble()){
                num = inputReader.nextDouble();
                System.out.print(Math.cos(num) + "\n\n");
                break;
            }
            else {
                System.out.print("ENTER A VALID NUMBER " + "\n");
                inputReader.next();

            }
        }
    }

    public static void tangent(){
        double num = 0;
        Scanner inputReader = new Scanner(System.in);
        while (true){
            System.out.print("Enter number: ");
            if (inputReader.hasNextDouble()){
                num = inputReader.nextDouble();
                System.out.print(Math.tan(num) + "\n\n");
                break;
            }
            else {
                System.out.print("ENTER A VALID NUMBER " + "\n");
                inputReader.next();

            }
        }
    }

    public static void naturalLog(){
        double num = 0;
        Scanner inputReader = new Scanner(System.in);
        while (true){
            System.out.print("Enter number: ");
            if (inputReader.hasNextDouble()){
                num = inputReader.nextDouble();
                System.out.print(Math.log(num) + "\n\n");
                break;
            }
            else {
                System.out.print("ENTER A VALID NUMBER " + "\n");
                inputReader.next();

            }
        }
    }

    public static void base10(){
        double num = 0;
        Scanner inputReader = new Scanner(System.in);
        while (true){
            System.out.print("Enter number: ");
            if (inputReader.hasNextDouble()){
                num = inputReader.nextDouble();
                System.out.print(Math.log10(num) + "\n\n");
                break;
            }
            else {
                System.out.print("ENTER A VALID NUMBER " + "\n");
                inputReader.next();

            }
        }
    }

    public static void absolute(){
        double num = 0;
        Scanner inputReader = new Scanner(System.in);
        while (true){
            System.out.print("Enter number: ");
            if (inputReader.hasNextDouble()){
                num = inputReader.nextDouble();
                System.out.print(Math.abs(num) + "\n\n");
                break;
            }
            else {
                System.out.print("ENTER A VALID NUMBER " + "\n");
                inputReader.next();

            }
        }
    }

    public static void round(){
        double num = 0;
        Scanner inputReader = new Scanner(System.in);
        while (true){
            System.out.print("Enter number: ");
            if (inputReader.hasNextDouble()){
                num = inputReader.nextDouble();
                System.out.print(Math.round(num) + "\n\n");
                break;
            }
            else {
                System.out.print("ENTER A VALID NUMBER " + "\n");
                inputReader.next();

            }
        }
    }

    public static void ceil(){
        double num = 0;
        Scanner inputReader = new Scanner(System.in);
        while (true){
            System.out.print("Enter number: ");
            if (inputReader.hasNextDouble()){
                num = inputReader.nextDouble();
                System.out.print(Math.ceil(num) + "\n\n");
                break;
            }
            else {
                System.out.print("ENTER A VALID NUMBER " + "\n");
                inputReader.next();

            }
        }
    }

    public static void floor(){
        double num = 0;
        Scanner inputReader = new Scanner(System.in);
        while (true){
            System.out.print("Enter number: ");
            if (inputReader.hasNextDouble()){
                num = inputReader.nextDouble();
                System.out.print(Math.floor(num) + "\n\n");
                break;
            }
            else {
                System.out.print("ENTER A VALID NUMBER " + "\n");
                inputReader.next();

            }
        }
    }

    public static void min(){
        Scanner inputReader = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;

        while (true){
            System.out.print("Enter number 1: ");
            if (inputReader.hasNextDouble()){
                num1 = inputReader.nextDouble();
                break;
            }
            else {
                System.out.println("ENTER A VALID NUMBER");
                inputReader.next();
            }
        }

        while (true){
            System.out.print("Enter number 2: ");
            if (inputReader.hasNextDouble()){
                num2 = inputReader.nextDouble();
                break;
            }
            else {
                System.out.println("ENTER A VALID NUMBER");
                inputReader.next();
            }
        }

        System.out.println(Math.min(num1, num2) + "\n\n");
    }

    public static void max(){
        Scanner inputReader = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;

        while (true){
            System.out.print("Enter number 1: ");
            if (inputReader.hasNextDouble()){
                num1 = inputReader.nextDouble();
                break;
            }
            else {
                System.out.println("ENTER A VALID NUMBER");
                inputReader.next();
            }
        }

        while (true){
            System.out.print("Enter number 2: ");
            if (inputReader.hasNextDouble()){
                num2 = inputReader.nextDouble();
                break;
            }
            else {
                System.out.println("ENTER A VALID NUMBER");
                inputReader.next();
            }
        }

        System.out.println(Math.max(num1, num2) + "\n\n");
    }

}


