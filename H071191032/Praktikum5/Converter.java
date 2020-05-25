abstract class Converter {
    public abstract void start();
    public abstract void stop();
}

interface Data {
    long teraToGiga(long value);
    long teraToMega(long value);
    long teraToKilo(long value);
}

interface Distance {
    double metreToKilo(double value);
    double metreToMilli(double value);
    double inchToMetre(double value);
}

interface Temperature {
    double celciusToFahrenheit(double value);
    double celciusToKelvin(double value);
}

class ConverterData extends Converter implements Data {

    @Override
    public long teraToGiga(long value) {
        return value * 1024;
    }

    @Override
    public long teraToMega(long value) {
        return this.teraToGiga(value) * 1024;
    }

    @Override
    public long teraToKilo(long value) {
        return this.teraToMega(value) * 1024;
    }

    @Override
    public void start() {
        System.out.println("Converter Data is started");
    }

    @Override
    public void stop() {
        System.out.println("Converter Data is terminated");
    }
}

class ConverterDistance extends Converter implements Distance {

    @Override
    public double metreToKilo(double value) {
        return value / 1000;
    }

    @Override
    public double metreToMilli(double value) {
        return value * 1000;
    }

    @Override
    public double inchToMetre(double value) {
        return (2.54 / 100) * value;
    }

    @Override
    public void start() {
        System.out.println("Converter Distance is started");
    }

    @Override
    public void stop() {
        System.out.println("Converter Distance is terminated");
    }
}

class ConverterTemperature extends Converter implements Temperature {

    @Override
    public double celciusToFahrenheit(double value) {
        return (double) 9/5 * value + 32;
    }

    @Override
    public double celciusToKelvin(double value) {
        return value + 273.15;
    }

    @Override
    public void start() {
        System.out.println("Converter Temperature is started");
    }

    @Override
    public void stop() {
        System.out.println("Converter Temperature is terminated");
    }
}