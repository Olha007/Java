package lessson13;

abstract class Shape implements Comparable<Shape> {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calcArea();

    public void draw() {
        System.out.println(this + " - area: " + calcArea());
    }

    @Override
    public String toString() {
        return "color is: " + color;
    }

    @Override
    public int compareTo(Shape other) {
        double thisArea = this.calcArea();
        double otherArea = other.calcArea();

        if (thisArea < otherArea) {
            return -1;
        } else if (thisArea > otherArea) {
            return 1;
        } else {
            return 0;
        }
    }

    public static Shape parseShape(String input) throws InvalidShapeStringException {
        String[] parts = input.split(":");

        if (parts.length < 3) {
            throw new InvalidShapeStringException("Invalid input format");
        }

        String shapeType = parts[0];
        String color = parts[1];

        String[] dimensionsStr = parts[2].split(",");
        double[] dimensions = new double[dimensionsStr.length];
        for (int i = 0; i < dimensionsStr.length; i++) {
            try {
                dimensions[i] = Double.parseDouble(dimensionsStr[i].trim());
            } catch (NumberFormatException e) {
                throw new InvalidShapeStringException("Invalid dimension format");
            }
        }

        switch (shapeType) {
            case "Прямокутник":
                if (dimensions.length != 2) {
                    throw new InvalidShapeStringException("Invalid dimensions for Прямокутник (Rectangle)");
                }
                return new Rectangle(color, dimensions[0], dimensions[1]);
            case "Трикутник":
                if (dimensions.length != 3) {
                    throw new InvalidShapeStringException("Invalid dimensions for Трикутник (Triangle)");
                }
                return new Triangle(color, dimensions[0], dimensions[1], dimensions[2]);
            case "Коло":
                if (dimensions.length != 1) {
                    throw new InvalidShapeStringException("Invalid dimensions for Коло (Circle)");
                }
                return new Circle(color, dimensions[0]);
            default:
                throw new InvalidShapeStringException("Unknown shape type: " + shapeType);
        }
    }
}