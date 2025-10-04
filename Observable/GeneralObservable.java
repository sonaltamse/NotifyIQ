package Observable;

import NotificationDesign.Notification;
import Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class GeneralObservable implements NotifcationObservable{
    private List<NotificationObserver> observers = new ArrayList<>();
    private Notification currentNotification=null;

    @Override
    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(NotificationObserver observer : observers){
            observer.update();
        }
    }

    public void setNotification(Notification notification){
        this.currentNotification = notification;
        notifyObservers();
    }

    public Notification getNotification(){
        return currentNotification;
    }

    public String getNotificationDetails(){
        return currentNotification.getNotificationContent();
    }
}
