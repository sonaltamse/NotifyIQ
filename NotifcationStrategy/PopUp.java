package NotifcationStrategy;

public class PopUp implements NotifyStrategy{
    @Override
    public void notifyUser(String message) {
        System.out.println("Pop-up notification: " + message);
    }
}
