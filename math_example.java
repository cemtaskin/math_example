
public class math_example {
    
    public static void main(String[] args) {
        int a=10,b=100;
        System.out.println("Two numbers : " + a  + " - " + b);
        System.out.println("The highest one : "  + Math.max(a, b));
        System.out.println("The lowest one : "  + Math.min(a, b));
        System.out.println("Square value of first one : "  + Math.sqrt(a));
        System.out.println("Square value of second one : "  + Math.sqrt(b));
        System.out.println("Square value of second one : "  + Math.sqrt(b));
        double randomNumber = Math.random()*101;

        System.out.println("Random number between 0 - 100: "  + ((int)randomNumber));
        

    }
}
