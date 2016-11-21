package ComponentScanIncludeNExcludeFilterExmple.FilterTypeAssignable.service;

/**
 * Created by delhivery on 25/10/16.
 */
public class UserService implements IUserService{

    public String getUserRole(){
        return "ADMIN";
    }
}
