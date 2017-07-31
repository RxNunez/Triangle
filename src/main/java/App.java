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

            System.out.println("Enter length of Triangle Side A.");
            String inputSideA = bufferedReader.readLine();
            int SideA = Integer.parseInt(inputSideA);
            System.out.println(SideA);

            System.out.println("Enter length of Triangle Side B.");
            String inputSideB = bufferedReader.readLine();
            int SideB = Integer.parseInt(inputSideB);
            System.out.println(SideB);

            System.out.println("Enter length of Triangle Side C.");
            String inputSideC = bufferedReader.readLine();
            int SideC = Integer.parseInt(inputSideC);
            System.out.println(SideC);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
