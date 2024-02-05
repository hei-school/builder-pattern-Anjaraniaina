package school.learn;

public class CarBuilder implements Builder {
  private Car car;

  @Override
  public void reset() {
    this.car = new Car();
  }

  @Override
  public void setSeats(int number) {
    this.car.setSeat(number);
  }

  @Override
  public void setTripComputer() {
    this.car.setHaveTripComputer(true);
  }

  @Override
  public void setGPS(String gps) {
    this.car.setGPS(gps);
  }

  @Override
  public void setEngine(String engine) {}

  public Car getResult() {
    return this.car;
  }
}
