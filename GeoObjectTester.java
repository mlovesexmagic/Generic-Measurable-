/*Zhipeng (Adrian) Mei
  Sept 19, 2016 
  Purpose: This program creating geometric objects for Inheritance, polymorphism and interface practice.
  Inputs: This program does not ask use for any input.
  Output: Dimension, area and perimeter of geometric objects.
 */
import java.util.ArrayList;
import java.util.Collections;

public class GeoObjectTester {

    public static void main(String[] args) {

        //creating a new array list
        ArrayList<Measurable> gList = new ArrayList<Measurable>();

        gList.add(new Circle());
        gList.add(new Circle(3.0));
        gList.add(new Circle(6.0));
        gList.add(new Circle(11.0));

        gList.add(new Rectangle());
        gList.add(new Rectangle(3.0, 4.0));
        gList.add(new Rectangle(4.0, 5.0));

        gList.add(new Triangle());
        gList.add(new Triangle(3.0, 4.0, 5.0));

        for (int i = 0; i < gList.size(); i++) {
            //shape reference to a sigle element            
            Measurable shape = gList.get(i);
            //print out the current object
            System.out.println(shape);
        }
        System.out.println("\nExprected largest area is " + gList.get(3));
        System.out.println("Largeset is " + Measurable.getLargest(gList));

        Collections.sort(gList);
        System.out.println("\nSorted ArrayList: " + gList);

    }//end main

}//end GeoObjectTester
