public class Subscriber implements SubscriberObserver{

    private String subscriberName;

    public void setSubscriberName(String subscriberName){
        this.subscriberName = subscriberName;
    }
    public String getSubscriberName(){
        return subscriberName;
    }
    @Override
    public void notifySubscribers(NewsAgency newsAgency) {
        System.out.println("Notifying: " + getSubscriberName());}
}
