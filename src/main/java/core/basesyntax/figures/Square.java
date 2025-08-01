package core.basesyntax.figures;

public class Square extends Figure {
    private final String color;
    private final int side;

    public Square(String color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square, area: %1$.2f sq.units, "
                        + "side: %2$d units, color: %3$s%n",
                this.getArea(), side, color);
    }
}
