class Box {
    private double width;
    private double heigh;
    private double depth;
    private double mass;
    private double density;

    Box(double width, double heigh, double depth) {
        this.width = width;
        this.heigh = heigh;
        this.depth = depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        density = mass / (width*heigh*depth);
        return density;
    }
}
