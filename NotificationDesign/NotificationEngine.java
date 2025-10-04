package NotificationDesign;

import NotifcationStrategy.NotifyStrategy;
import Observable.GeneralObservable;
import Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class NotificationEngine implements NotificationObserver {
    private final GeneralObservable observable;
    private List<NotifyStrategy> notifyStrategies = new ArrayList<>();

    public NotificationEngine() {
        this.observable = NotificationService.getInstance().getObservable();
        observable.addObserver(this);
    }

   public NotificationEngine(GeneralObservable observable){
        this.observable = observable;
   }

   public void addNotificationStrategy(NotifyStrategy strategy){
        notifyStrategies.add(strategy);
   }

   @Override
   public void update() {
       notifyStrategies.forEach(strategy -> strategy.notifyUser(observable.getNotificationDetails()));
   }
}
