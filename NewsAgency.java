import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject{

    public String getNewsCategory() {
        return newsCategory;
    }

    public void setNewsCategory(String newsCategory) {
        this.newsCategory = newsCategory;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    public void sentNews(){
        System.out.println("(" + getNewsCategory() + ")\n" +getNewsContent());
        this.notifySubscriber();
    }

    private String newsCategory;
    private String newsContent;
    private List<Subscriber> subscriberList = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        System.out.println("-Notifying subscribers-");
        for(Subscriber subscriber : subscriberList){
            subscriber.notifySubscribers(this);
        }
        System.out.println("-Subscribers notified-\n");
    }
}