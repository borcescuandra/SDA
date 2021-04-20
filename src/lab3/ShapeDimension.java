package lab3;

public class ShapeDimension {
    Boolean validateSquare(int size) {

        Boolean ok = true;

        if (size < 0) {
            ok = false;
            throw new IllegalArgumentException("The size must be greater then 0!");

        }

        return ok;
    }

    Boolean validateRectangle(int width, int height) {

        Boolean ok = true;

        if (width < 0 || height < 0) {
            ok = false;
            throw new IllegalArgumentException("The width/height must be greater then 0!");

        }

        return ok;
    }

    Boolean validateCircle(int radius) {

        Boolean ok = true;
        if (radius < 0) {
            ok = false;
            throw new IllegalArgumentException("The radius must be greater then 0!");

        }

        return ok;

} }

