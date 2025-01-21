public class Utilisateur implements Observer {
    private int message;

    @Override
    public void recevoirNotification(String message) {
        System.out.println("Notificatons updated to: " + message);
    }

    public int getNotifications() {
        return this.message;
    }
}
