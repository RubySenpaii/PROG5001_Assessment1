import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

/**
 * Write a description of class Grades here.
 *
 * @author Jan Jemi Gerwayne Tiu
 * @version September 12, 2022
 */
public class Grades
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please input unit name: ");
        String unitName = scan.next();
        
        ArrayList<Integer> marks = new ArrayList<>();
        System.out.println("Please input 25 student marks:");
        for (int i = 1; i <= 25; i++) {
            System.out.println(i + ": ");
            String value = "";
            try {
                value = scan.next();
                int input = Integer.parseInt(value);
                if (input >= 0 && input <= 100) {
                    marks.add(input);
                } else {
                    System.out.println("Invalid input " + value);
                    i--;
                }
            } catch (Exception x) {
                System.out.println("Invalid input " + value);
                i--;
            }
        }
        
        System.out.println("Unit Name: " + unitName);
        System.out.println("Marks:");
        
        int total = 0, highest = marks.get(0), lowest = marks.get(0);
        for (Integer mark: marks) {
            System.out.println(mark);
            total += mark;
            if (highest < mark)
                highest = mark;
            if (lowest > mark)
                lowest = mark;
        }
        
        System.out.println("Highest value " + highest);
        System.out.println("Lowest value " + lowest);
        
        double avg = total / marks.size();
        double standardDeviation = 0;
        for (Integer mark: marks) {
            standardDeviation += Math.pow((mark - avg), 2);
        }
        standardDeviation /= marks.size();
        standardDeviation = Math.sqrt(standardDeviation);
            
        System.out.println("Mean: " + avg);
        System.out.println("Standard deviation: " + standardDeviation);
    }
}
