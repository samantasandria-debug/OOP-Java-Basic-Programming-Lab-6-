public class NotificationSystem {

    // Method 1: Default system broadcast
    public void sendNotification(String message) {
        System.out.println("Broadcast Alert: " + message);
    }

    // Method 2: Targeted email alert
    public void sendNotification(String message, String email) {
        System.out.println("Email sent to " + email + " -> " + message);
    }

    // Method 3: SMS text alert
    public void sendNotification(String message, long phoneNumber) {
        System.out.println("SMS sent to +" + phoneNumber + " -> " + message);
    }

    public static void main(String[] args) {
        NotificationSystem ns = new NotificationSystem();
        
        ns.sendNotification("Server restart in 5 mins.");
        ns.sendNotification("Your OTP is 4432", "user@test.com");
        ns.sendNotification("Package delivered!", 15550199L);
    }
}
