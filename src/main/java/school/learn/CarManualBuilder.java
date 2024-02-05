package school.learn;

public class CarManualBuilder implements Builder{
    private CarManual carManual;
    @Override
    public void reset() {
        this.carManual = new CarManual();
    }

    @Override
    public void setSeats(int number) {

    }
    @Override
    public void setTripComputer() {
        this.carManual.setHaveTripComputer(true);
    }

    @Override
    public void setGPS(String gps) {

    }

    @Override
    public void setEngine(String engine) {

    }

    public CarManual getResult() {
        return this.carManual;
    }
}
