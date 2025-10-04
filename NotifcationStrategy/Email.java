package NotifcationStrategy;

public class Email implements NotifyStrategy{
    private final String emailId;
    public Email(String emailId) {
        this.emailId = emailId;
    }
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending email to " + emailId + ": " + message);
    }
}
