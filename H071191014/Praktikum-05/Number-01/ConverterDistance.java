class ConverterDistance extends Converter implements Distance{

    @Override
    public double metreToKilo(double value) {
        double result = value * 0.001;
        return result;
    }

    @Override
    public double metreToMilli(double value) {
        double result = value * 1000;
        return result;
    }

    @Override
    public double inchToMetre(double value) {
        double result = value * 0.0254;
        return result;
    }

    @Override
    void start() {
        System.out.println("Distance Converter is started");
    }

    @Override
    void stop() {
        System.out.println("Distance Converter is terminated");
    }
    
}