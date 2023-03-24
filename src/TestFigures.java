import figure.Figure;
import figures.Circle;
import figures.Rectangle;
import figures.Triangle;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println("Периметр всех красных фигур = "
                + calculateRedPerimeter(figures));

        System.out.println("Площадь всех красных фигур = "
                + calculateRedArea(figures));

    }

    public static double calculateRedPerimeter(Figure[] figures){
        double perimeter = 0;

        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor().equals("Red"))
                perimeter += figures[i].perimeter();
        }
        return perimeter;
    }

    public static double calculateRedArea(Figure[] figures){
        double area = 0;

        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor().equals("Red"))
                area += figures[i].area();
        }
        return area;
    }

}
