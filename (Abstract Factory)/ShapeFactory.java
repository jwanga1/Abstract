public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        Shape retShape = null;
        shapeType = shapeType.toUpperCase();
        switch (shapeType) {
            case "CIRCLE":
                retShape = new Circle();
                break;
            case "SQUARE":
                retShape = new Square();
                break;
            case "RECTANGLE":
                retShape = new Rectangle();
                break;
        }
        return retShape;
    }
}
