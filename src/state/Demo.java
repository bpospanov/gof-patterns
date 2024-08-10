package state;

public class Demo {
    public static void show() {
        var directionService = new DirectionService();
        directionService.getEta();
        directionService.getDirection();

        directionService.setTravelType(new BicyclingTravelType());
        directionService.getEta();
        directionService.getDirection();
    }
}
