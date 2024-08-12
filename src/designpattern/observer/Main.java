package designpattern.observer;

public class Main {
    public static void main(String[] args) {
        Topic topic = new Topic();
        Observer a = new TopicSubscriber("A", topic);
        Observer b = new TopicSubscriber("B", topic);
        Observer c = new TopicSubscriber("C", topic);
        topic.register(a);
        topic.register(b);
        topic.register(c);

        topic.postMessage("amumu is op chapmion!");
    }
}