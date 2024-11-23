
public class Subscriber implements SubscriberObserver {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void updateNews(String news) {
        System.out.println("Breaking News for " + name + ": " + news);
    }
}