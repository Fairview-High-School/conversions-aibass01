import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Miles/Hour to Meters/Second");
        System.out.println("8. Meters/Second to Miles/Hour");
        System.out.println("9. Meters/s^2 to Gs");
        System.out.println("10. Gs to Meters/s^2");

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1) {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit.");
        } else if (selection == 2) {
            System.out.println("Enter Farenheit: ");
            double farenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (farenheit - 32) * (5.0/9.0);
            System.out.println(farenheit + " degrees farenheit is " + String.format("%.2f", celsius) + " degrees celsius.");
        } else if (selection == 3) {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet * 0.3048;
            System.out.println(feet + " feet is " + String.format("%.2f", meters) + " meters.");
        } else if (selection == 4) {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters / 0.3048;
            System.out.println(meters + " meters is " + String.format("%.2f", feet) + " feet.");
        } else if (selection == 5) {
            System.out.println("Enter Ounces: ");
            double oz = keyboard.nextDouble();
            keyboard.nextLine();
            double ml = oz * 29.5735;
            System.out.println(oz + " ounces is " + String.format("%.2f", ml) + " mililiters.");
        } else if (selection == 6) {
            System.out.println("Enter Mililiters: ");
            double ml = keyboard.nextDouble();
            keyboard.nextLine();
            double oz = ml / 29.5735;
            System.out.println(ml + " mililiters is " + String.format("%.2f", oz) + " ounces.");
        } 
    }
}