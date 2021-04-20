package lab3;

public class Circle implements Shape {

    private static final String NUME_CONSTANTA = "Circle";

    private String fillColor;
    private int borderWidth;
    private int radius;
    private HexColorValidator validateColor;
    private ShapeDimension validateDimension;

    public Circle(String fillColor, int borderWidth, int radius) {
        this.fillColor = fillColor;
        this.borderWidth = borderWidth;
        this.radius = radius;
        this.validateColor = new HexColorValidator();
        this.validateDimension = new ShapeDimension();
    }

    public double getArea() {
        boolean ok = validateDimension.validateCircle(radius);
        if (ok == true)
            return (3.14 * radius * radius);
        return 0;
    }

    public String getName() {
        return NUME_CONSTANTA;
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    public String getHexFillColor() {
        boolean ok = validateColor.validate(fillColor);
        if (ok == true)
            return fillColor;
        return "errorColorCircle";
    }

    public void draw() {
        int posX = 10;
        int posY = 10;

        for (int i = 0; i <= posX + radius; i++) {
            for (int j = 1; j <= posY + radius; j++) {
                int xSquared = (i - posX) * (i - posX);
                int ySquared = (j - posY) * (j - posY);
                if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }




}
