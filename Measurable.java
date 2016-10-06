
import java.util.ArrayList;

/**
 * Describes any class whose objects can be measured.
 *
 * @param <T>
 */
//abstract public class Measurable<T extends Measurable> {
abstract public class Measurable<T> {

    /**
     * Computes the measure of the object.
     *
     * @return the measure
     */
    abstract public double getMeasure();

    public static <T extends Measurable> double getLargest(ArrayList<T> objects) {

        T largest = objects.get(0);
        for (int i = 1; i < objects.size(); i++) {
            T obj = objects.get(i);
            if (obj.getMeasure() > largest.getMeasure()) {
                largest = obj;
            }
        }
        return largest.getMeasure();
    }
}
