package Observable;

import Observer.NotificationObserver;

public interface NotifcationObservable {
    void addObserver(NotificationObserver observer);
    void removeObserver(NotificationObserver observer);
    void notifyObservers();
}
