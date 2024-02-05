package school.learn;

public class Director {
    public Director() {
    }

    public void makeSUV(Builder builder) {
        builder.reset();
    }

    public void makeSportsCar(Builder builder) {
        builder.reset();
        builder.setEngine("V8");
        builder.setGPS("New gen GPS");
        builder.setTripComputer();
    }
}
