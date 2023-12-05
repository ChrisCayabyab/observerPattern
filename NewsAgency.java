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

    private String newsCategory;
    private String newsContent;
    private List<Subscriber> subscriberList;

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public String notifySubscriber() {
        String output = new String();
        for(Subscriber subscriber : subscriberList){
            output += "Notifying: " + subscriber.getSubscriberName() + "\n";
            output += "-----" + newsCategory + "----- " +  "\n" + newsContent;
        }
        return output;
    }
}