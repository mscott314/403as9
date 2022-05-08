import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.util.Random;

public class RaceCar extends Thread {
    Controller controller;
    Circle racer;
    Line track;
    String name;

    RaceCar(Controller controller, Circle racer, Line track, String name) {
        this.controller = controller;
        this.racer = racer;
        this.track = track;
        this.name = name;
    }

    @Override
    public void run() {
        try {

            Random r = new Random();

            double racer_location = racer.getCenterX();
            double track_size = (track.getEndX() - track.getStartX());

            while (racer_location < track_size) {

                int random_number = r.nextInt(3);
                racer_location += random_number;
                sleep(10);
                racer.setTranslateX(racer_location);

            }

            System.out.println("Race results: " + name);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}