import java.util.ArrayList;
import java.util.List;

public class NewsSubscriptionUpdates {
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        Subscriber chris = new Subscriber();
        chris.setSubscriberName("Chris");
        newsAgency.subscribe(chris);

        Subscriber daniel = new Subscriber();
        daniel.setSubscriberName("Daniel");
        newsAgency.subscribe(daniel);

        newsAgency.setNewsCategory("CHURCH NEWS");
        newsAgency.setNewsContent("Iglesia Ni Cristo in Toronto gives 1 00 care packages, 2,500 lbs of food, monetary donations to local organizations\n");

        newsAgency.sentNews();

        newsAgency.unsubscribe(chris);
        newsAgency.setNewsCategory("MEOW NEWS");
        newsAgency.setNewsContent("Adorable Cat Takes the Internet by Storm with Impromptu Piano Concerto!  " +
                "\nInternet Pawsitively Obsessed with the Feline Maestro's Musical Talent!\"\n");

        Subscriber cayabyab = new Subscriber();
        cayabyab.setSubscriberName("Cayabyab");
        newsAgency.subscribe(cayabyab);

        newsAgency.sentNews();

        Subscriber dan = new Subscriber();
        dan.setSubscriberName("Dan");
    }
}
