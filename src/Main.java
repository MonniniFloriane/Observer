public class Main {
    SujetNotification sujetNotification = new SujetNotification();
    Utilisateur user1 = new Utilisateur();
    Utilisateur user2 = new Utilisateur();

        SujetNotification.add(user1);
        SujetNotification.add(user2);

        SujetNotification.recevoirNotification("message1");

        System.out.println(user1.getNotifications());
        System.out.println(user2.getNotifications());

        SujetNotification.recevoirNotification("message2");

        System.out.println(user1.getNotifications());
        System.out.println(user2.getNotifications());
}