class Rectangle {
    double height;
    double width;

    public double getArea() {
        return this.height * this.width;
    }    
}

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.height = 10;
        rec.width = 15;
        System.out.println("Luas = " + rec.getArea());

    }
}