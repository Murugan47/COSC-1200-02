public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to calculator project");

        Calculator ABC = new Calculator();

        System.out.println("Your number added is " + ABC.add(5,5));
        System.out.println("Your number subtracted is " + ABC.subtract(5,5));
        System.out.println("Your number divided is " + ABC.divide(5,5));
        System.out.println("Your number multiplied is " + ABC.multiply(5,5));

    }

}