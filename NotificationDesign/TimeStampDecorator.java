package NotificationDesign;

import java.time.Instant;

public class TimeStampDecorator extends NotificationDecorator  {
    public TimeStampDecorator(Notification notification) {
        super(notification);
    }
    @Override
    public String getNotificationContent() {
        return notification.getNotificationContent() + "\nTimestamp: "+ Instant.now();
    }
}
