package multithreading;

import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Actions = List.of(Action.SCISSORS, Action.PAPER, Action.SCISSORS);
        List<Action> friend2Actions = List.of(Action.STONE, Action.STONE, Action.STONE);

        new BestFriend("Ivan", friend1Actions, exchanger);
        new BestFriend("Petr", friend2Actions, exchanger);
    }
}

enum Action {
    STONE, SCISSORS, PAPER;
}

class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if (myAction == Action.STONE && friendsAction == Action.SCISSORS) {
            System.out.println(name + " WINS!!!");
        }

        if (myAction == Action.SCISSORS && friendsAction == Action.PAPER) {
            System.out.println(name + " WINS!!!");
        }

        if (myAction == Action.PAPER && friendsAction == Action.STONE) {
            System.out.println(name + " WINS!!!");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action: myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}