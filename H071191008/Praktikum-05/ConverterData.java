class ConverterData extends Converter implements Data{

    @Override
    public long teraToGiga(long value) {
        long result = value * 1024;
        return result;
    }

    @Override
    public long teraToMega(long value) {
        long result = value * 1024 * 1024; 
        return result;
    }

    @Override
    public long teraToKilo(long value) {
        long result = value * 1024 * 1024 * 1024;
        return result;
    }

    @Override
    void start() {
        System.out.println("Data Converter is started");
    }

    @Override
    void stop() {
        System.out.println("Data Converter is terminated");
    }

}