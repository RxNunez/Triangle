import triangle.Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 7/31/17.
 */
public class App {
    public static void main(String[] args) {

        try{

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter length of Triangle Side 1.");
            String inputSide1 = bufferedReader.readLine();
            int side1 = Integer.parseInt(inputSide1);
            System.out.println(side1);

            System.out.println("Enter length of Triangle Side 2.");
            String inputSide2 = bufferedReader.readLine();
            int side2 = Integer.parseInt(inputSide2);
            System.out.println(side2);

            System.out.println("Enter length of Triangle Side 3.");
            String inputSide3 = bufferedReader.readLine();
            int side3 = Integer.parseInt(inputSide3);
            System.out.println(side3);

            Triangle allSides = new Triangle(side1, side2, side3);

            String result = allSides.TriangleTracker();
            if (result.equals("not a valid triangle")) {
                System.out.println(" This is " + result);
            } else {
                System.out.println("This is " + result);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
