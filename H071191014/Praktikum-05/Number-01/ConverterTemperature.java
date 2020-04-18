class ConverterTemperature extends Converter implements Temperature{

    @Override
    public double celciusToFahrenheit(double value) {
        double result = (9 * value)/5 + 32;
        return result;
    }

    @Override
    public double celciusToKelvin(double value) {
        double result = value + 273.15;
        return result;
    }

    @Override
    void start() {
        System.out.println("Temperature Converter is started");
    }

    @Override
    void stop() {
        System.out.println("Temperature Converter is terminated");
    }

}