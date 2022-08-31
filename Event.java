

public class Event {
    String eventName, ownerName;
    Integer attendeesCount;

    Event(String eventName, Integer attendeesCount, String ownerName){
        this.eventName = eventName;
        this.attendeesCount = attendeesCount;
        this.ownerName = ownerName;
    }
}
