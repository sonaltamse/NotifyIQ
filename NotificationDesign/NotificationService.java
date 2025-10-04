package NotificationDesign;

import Observable.GeneralObservable;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private GeneralObservable observable;
    private static NotificationService instance = null;
    private List<Notification> notifications = new ArrayList<>();

    private NotificationService() {
        observable = new GeneralObservable();
    }

    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public GeneralObservable getObservable() {
        return observable;
    }

    public void sendNotification(Notification notification) {
        notifications.add(notification);
        observable.setNotification(notification);
    }
}
