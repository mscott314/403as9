import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Controller {
    public Circle racer1;
    public Line track1;

    public Circle racer2;
    public Line track2;

    public Circle racer3;
    public Line track3;

    public void StartClicked() {

        RaceCar race1 = new RaceCar(this, racer1, track1, "Racer1");
        race1.start();

        RaceCar race2 = new RaceCar(this, racer2, track2, "Racer2");
        race2.start();

        RaceCar race3 = new RaceCar(this, racer3, track3, "Racer3");
        race3.start();

    }

}