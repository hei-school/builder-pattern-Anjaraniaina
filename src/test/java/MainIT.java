import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import school.learn.Car;
import school.learn.CarBuilder;
import school.learn.CarManual;
import school.learn.CarManualBuilder;
import school.learn.Director;

public class MainIT {
  @Test
  public void create_a_sport_car() {
    Director director = new Director();
    CarBuilder carBuilder = new CarBuilder();

    director.makeSportsCar(carBuilder);

    assertEquals(Car.class, carBuilder.getResult().getClass());
    assertTrue(carBuilder.getResult().haveTripComputer());
  }

  @Test
  public void create_a_manual_for_suv() {
    Director director = new Director();
    CarManualBuilder carManualBuilder = new CarManualBuilder();

    director.makeSUV(carManualBuilder);

    assertEquals(CarManual.class, carManualBuilder.getResult().getClass());
    assertTrue(carManualBuilder.getResult().haveTripComputer());
  }
}
