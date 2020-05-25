public class Box {
    double width, height, depth, mass, density;
    

    public Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //setter
    public void setWidth(double widht) {
        this.width = widht;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    //getter
    public double getDensity() {
        return this.mass / getVolume();
    }

    public double getVolume() {
        return this.width * this.height * this.depth;
    }
    
}