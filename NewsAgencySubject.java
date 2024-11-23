public interface NewsAgencySubject {
    void attach(Subscriber subscriber);

    void detach(Subscriber subscriber);

    void notifySubscribers();
}