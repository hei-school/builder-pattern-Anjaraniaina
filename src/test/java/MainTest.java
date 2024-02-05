import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import school.learn.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void create_a_sport_car() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.makeSportsCar(carBuilder);

        assertEquals(Car.class, carBuilder.getResult().getClass());
        Assertions.assertTrue(carBuilder.getResult().haveTripComputer());
    }

    @Test
    public void create_a_manual_for_suv() {
        Director director = new Director();
        CarManualBuilder carManualBuilder = new CarManualBuilder();

        director.makeSUV(carManualBuilder);

        assertEquals(CarManual.class, carManualBuilder.getResult().getClass());
        Assertions.assertTrue(carManualBuilder.getResult().haveTripComputer());
    }
}
