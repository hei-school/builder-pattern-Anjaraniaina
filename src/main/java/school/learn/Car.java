package school.learn;

public class Car {
  int seat;
  String engine;

  String GPS;

  public int getSeat() {
    return seat;
  }

  public void setSeat(int seat) {
    this.seat = seat;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public String getGPS() {
    return GPS;
  }

  public void setGPS(String GPS) {
    this.GPS = GPS;
  }

  public boolean haveTripComputer() {
    return haveTripComputer;
  }

  public void setHaveTripComputer(boolean haveTripComputer) {
    this.haveTripComputer = haveTripComputer;
  }

  boolean haveTripComputer;
}
