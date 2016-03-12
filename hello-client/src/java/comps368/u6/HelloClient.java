package comps368.u6;
import javax.ejb.EJB;
/** Hello session bean, client class using DI */
public class HelloClient {
    @EJB
    private static HelloRemote helloBean;
    public static void main(String[] args) {
        System.out.println(helloBean.greet());
    }
    
}
