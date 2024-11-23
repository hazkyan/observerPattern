public class Main {
    public static void main(String[] args) {
        // Create a NewsAgency instance
        NewsAgency newsAgency = new NewsAgency();

        // Create Subscribers
        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");
        Subscriber charlie = new Subscriber("Charlie");

        // Add subscribers to the NewsAgency
        newsAgency.attach(alice);
        newsAgency.attach(bob);

        // Publish breaking news
        newsAgency.publishNews("Elections Results: Candidate A wins!");

        // Dynamic subscription updates
        newsAgency.detach(bob); // Bob unsubscribes
        newsAgency.attach(charlie); // Charlie subscribes

        // Publish another news update
        newsAgency.publishNews("Weather Alert: Heavy rains expected tomorrow!");
    }
}