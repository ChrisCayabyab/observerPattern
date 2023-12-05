import java.util.ArrayList;
import java.util.List;

public class NewsSubscriptionUpdates {
    public static void main(String[] args) {
        Subscriber chris = new Subscriber();
        chris.setSubscriberName("Chris");

        Subscriber daniel = new Subscriber();
        chris.setSubscriberName("Daniel");

        Subscriber cayabyab = new Subscriber();
        chris.setSubscriberName("Cayabyab");

        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(chris);
        subscriberList.add(daniel);
        subscriberList.add(cayabyab);

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.setNewsCategory("CHURCH NEWS");
        newsAgency.setNewsContent("Iglesia Ni Cristo in Toronto gives 1 00 care packages, 2,500 lbs of food, monetary donations to local organizations\n\n");
        newsAgency.setSubscriberList(subscriberList);

        System.out.println(newsAgency.notifySubscriber());

        subscriberList.remove(daniel);

        Subscriber dan = new Subscriber();
        dan.setSubscriberName("Dan");
        subscriberList.add(dan);

        System.out.println(newsAgency.notifySubscriber());
    }
}
