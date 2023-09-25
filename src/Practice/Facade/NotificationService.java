package Practice.Facade;

import Practice.Facade.Requirements.AuthToken;
import Practice.Facade.Requirements.Connection;
import Practice.Facade.Requirements.Message;

public class NotificationService {
    //connect -> connection
    public Connection connect(){
        return new Connection();
    }
    //authenticate -> AuthToken
    public AuthToken authenticate(String username, String password){
        return new AuthToken();
    }
    //send -> void
    public void send(AuthToken authToken, Message message){
        //sending
    }
}
