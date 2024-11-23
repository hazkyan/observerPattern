import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject {
    private List<Subscriber> subscribers;
    private String latestNews;

    public NewsAgency() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getName() + " has subscribed.");
    }

    @Override
    public void detach(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getName() + " has unsubscribed.");
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.updateNews(latestNews);
        }
    }

    public void publishNews(String news) {
        this.latestNews = news;
        System.out.println("\nNewsAgency: Publishing news -> " + news);
        notifySubscribers();
    }
}