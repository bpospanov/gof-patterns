package state;

public class DirectionService {
    private TravelType currentTravelType;

    public DirectionService() {
        this.currentTravelType = new WalkingTravelType();
    }
    public Object getEta() {
        return currentTravelType.getEta();
    }

    public Object getDirection() {
        return currentTravelType.getDirection();
    }

    public TravelType getTravelType() {
        return currentTravelType;
    }
    public void setTravelType(TravelType travelType) {
        this.currentTravelType = travelType;
    }
}
