abstract class ShapeExample {
    public abstract double getArea();
    public abstract double getCircum();
}

class Rect extends ShapeExample {
    int width;
    int height;

    public double getArea() {
        return width * height;
    }

    public double getCircum() {
        return 2 * (width + height);
    }
}

class Circle extends ShapeExample {
    int r;

    public double getArea() {
        return 3.14 * r * r;
    }

    public double getCircum() {
        return 2 * 3.14 * r;
    }
}

public class ShapeUser {
    public static void main(String args[]) {
        Rect aa = new Rect();
        Circle bb = new Circle();

        aa.width = 10;
        aa.height = 10;

        bb.r = 10;

        System.out.println("사각형의 넓이는 " + aa.getArea() + "입니다.");
        System.out.println("사각형의 둘레는 " + aa.getCircum() + "입니다.");
        System.out.println("원의 넓이는 " + bb.getArea() + "입니다.");
        System.out.println("원의 넓이는 " + bb.getCircum() + "입니다.");
    }
}
