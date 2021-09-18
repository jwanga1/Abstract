public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String colorType) {
        Color retColor = null;
        colorType = colorType.toUpperCase();
        switch (colorType) {
            case "RED":
                retColor = new Red();
                break;
            case "GREEN":
                retColor = new Green();
                break;
            case "BLUE":
                retColor = new Blue();
                break;
        }
        return retColor;
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }
}


