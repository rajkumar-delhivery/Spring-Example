package services;

/**
 * Created by delhivery on 3/10/16.
 */
public class TwitterService implements MessageService {

    public boolean sendMessage(String msg, String rec){
        System.out.println("Twitter message Sent to "+rec+ " with Message="+msg);
        return true;
    }
}
