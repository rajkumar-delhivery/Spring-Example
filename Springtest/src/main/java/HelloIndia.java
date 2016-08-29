/**
 * Created by delhivery on 25/8/16.
 */

public class HelloIndia extends HelloWorld{
    private String message1;
    private String message2;
    private String message3;
@Override
// override the setMessage1(String message) of superclass and the set the value of message1
    public void setMessage1(String message){
        this.message1  = message;
    }

@Override
    //override the setMessage2(String message) of superclass and the set the value of message1
    public void setMessage2(String message){
        this.message2  = message;
    }

    //the set the value of message3
    public void setMessage3(String message){
        this.message3  = message;
    }

    public void getMessage1(){
        System.out.println("India Message1 : " + message1);
    }

    public void getMessage2(){
        System.out.println("India Message2 : " + message2);
    }

    public void getMessage3(){
        System.out.println("India Message3 : " + message3);
    }
}