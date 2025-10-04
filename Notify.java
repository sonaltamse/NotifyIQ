import NotifcationStrategy.Email;
import NotifcationStrategy.PopUp;
import NotifcationStrategy.SMS;
import NotificationDesign.*;

public class Notify {
    public static void main(String[] args) {
        NotificationService service = NotificationService.getInstance();
        Logger logger = new Logger();
        NotificationEngine notificationEngine = new NotificationEngine();

        notificationEngine.addNotificationStrategy(new Email("ayrton@f1experiences.com"));
        notificationEngine.addNotificationStrategy(new SMS("+55 11 3095-8600"));
        notificationEngine.addNotificationStrategy(new PopUp());

        Notification notification = new GeneralNotification("Your F1 gear is on the grid! \uD83C\uDFCE\uFE0F");
        notification = new TimeStampDecorator(notification);
        notification = new SignatureDecorator(notification, "F1 Experiences");

        service.sendNotification(notification);
    }
}
