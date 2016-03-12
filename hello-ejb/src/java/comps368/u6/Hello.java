package comps368.u6;
import javax.ejb.Stateless;

/** Hello session bean, implementation class  */
@Stateless
public class Hello implements HelloRemote {

    //@Override
    public String greet() {
        return "Hello EJB!";
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
