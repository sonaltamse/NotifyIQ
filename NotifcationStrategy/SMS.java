package NotifcationStrategy;

public class SMS implements NotifyStrategy {
    private String phoneNumber;
    public SMS(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS notification to " + phoneNumber + ": " + message);
    }
}
