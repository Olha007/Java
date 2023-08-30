package lessson13;

import java.util.Comparator;

class ShapeAreaComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape shape1, Shape shape2) {
        double area1 = shape1.calcArea();
        double area2 = shape2.calcArea();

        if (area1 < area2) {
            return -1;
        } else if (area1 > area2) {
            return 1;
        } else {
            return 0;
        }

    }
}



