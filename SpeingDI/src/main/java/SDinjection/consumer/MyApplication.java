package SDinjection.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import services.MessageService;

/**
 * Created by delhivery on 3/10/16.
 */
@Component
public class MyApplication {

    private MessageService messageService;

    @Autowired
    public void setService(MessageService svc){
        messageService = svc;
    }

    public boolean processMessage(String msg, String rec){
        return messageService.sendMessage(msg,rec);

    }
}
