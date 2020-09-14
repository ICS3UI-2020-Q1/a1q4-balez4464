import java.util.Scanner;

/**This program will calculate the slope of the users choosing
 *
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    // tells and allows user to input first x point
    System.out.print("Please enter in the x coordinate of the first point");

    double xa = input.nextDouble();

    // tells and allows user to input first y point
    System.out.print("Please enter in the y coordinate of the first point");

    double ya = input.nextDouble();

    //tells and allows user to input second x point
    System.out.println("Please enter in the x coordinate of the second point");

    double xb = input.nextDouble();

    //tells and allows user to input second y point
    System.out.println("Please enter in the y coordinate of the second point");

    double yb = input.nextDouble();

    //Tells and calculates users slope
    double slope = (yb - ya)/(xb - xa);

    System.out.println("The slope of your line would be " + slope + ".");
  }
}
