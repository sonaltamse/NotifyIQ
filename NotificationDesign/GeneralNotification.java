package NotificationDesign;

public class GeneralNotification implements Notification{
    String content;
    public GeneralNotification(String content){
        this.content = content;
    }

    @Override
    public String getNotificationContent() {
        return content;
    }
}
