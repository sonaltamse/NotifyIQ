package NotificationDesign;

import Observable.GeneralObservable;
import Observable.NotifcationObservable;
import Observer.NotificationObserver;

public class Logger implements NotificationObserver {
    private GeneralObservable generalObservable;

    public Logger() {
        this.generalObservable = NotificationService.getInstance().getObservable();
        generalObservable.addObserver(this);
    }
    public void addObserver(GeneralObservable observable) {
        generalObservable.addObserver(this);
        this.generalObservable  = observable;
    }

    @Override
    public void update() {
        System.out.println("Logger: Received message: " + generalObservable.getNotificationDetails());
    }
}
