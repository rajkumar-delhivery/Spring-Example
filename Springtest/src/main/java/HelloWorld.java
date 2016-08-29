/**
 * Created by delhivery on 25/8/16.
 */
public class HelloWorld {
    private String message1, message2;
    // set the value of message1
    public void setMessage1(String message1){
        this.message1  = message1;
    }

    // print the value of message1
    public void getMessage1(){
        System.out.println("Your Message1 : " + message1);
    }

    // set the value of message2
    public void setMessage2(String message2){
        this.message2  = message2;
    }

    // print set the value of message1
    public void getMessage2(){
        System.out.println("Your Message2 : " + message2);
    }

    //function called at the initilization of parametre in xml
//   public void init(){
//	      System.out.println("Bean is going through init.");
//	   }

    // function called pre-destruction
//   public void destro(){
//	      System.out.println("Bean will destroy now.");
//	   }
}