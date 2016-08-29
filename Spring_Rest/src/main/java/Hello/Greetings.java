package Hello;

/**
 * Created by delhivery on 26/8/16.
 */
public class Greetings {
    private final long id;
    private final String content;

    //constructor to initialize the id and message or content
    public Greetings(long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }
}
