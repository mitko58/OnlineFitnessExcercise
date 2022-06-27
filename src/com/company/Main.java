package com.company;

public class Main {

    public static void main(String[] args) {


        Topic topic = new Topic();
        Observer obs1 = new TopicSubscriber("Ivan");
        Observer obs2 = new TopicSubscriber("Georgi");
        Observer obs3 = new TopicSubscriber("Petar");

        Positions positions = new Positions();
        Command layDownCommand = new LayDownCommand(positions);
        Command standUpCommand = new StandUpCommand(positions);

        RemoteController remote = new RemoteController();

        remote.setCommand(layDownCommand);
        remote.pressButton();
        topic.subscribe(obs1);
        topic.subscribe(obs2);
        topic.subscribe(obs3);
        topic.setTopic("change position to 'LayDown'");

        remote.setCommand(standUpCommand);
        remote.pressButton();
        topic.setTopic("change position to 'StandUp'");

    }
}
