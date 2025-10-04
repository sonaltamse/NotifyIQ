package NotificationDesign;

public class SignatureDecorator extends NotificationDecorator{
    private String signature;
    public SignatureDecorator(Notification notification, String signature) {
        super(notification);
        this.signature = signature;
    }

    @Override
    public String getNotificationContent() {
        return notification.getNotificationContent()+"\n --> "+signature+"\n";
    }
}
