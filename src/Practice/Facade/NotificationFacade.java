package Practice.Facade;

import Practice.Facade.Requirements.AuthToken;
import Practice.Facade.Requirements.Connection;
import Practice.Facade.Requirements.Message;

public class NotificationFacade {
    public void send(String message, String username, String password){
        NotificationService notificationService = new NotificationService();
        Connection connection = notificationService.connect();
        AuthToken authToken = notificationService.authenticate(username,password);
        notificationService.send(authToken,new Message(message));
        connection.disconnect();
    }
}
