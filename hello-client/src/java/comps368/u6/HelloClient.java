package comps368.u6;
import javax.ejb.EJB;
/** Hello session bean, client class using DI */
public class HelloClient {
    /** @EJB: Dependency injection */
    //container searches the server for an EJB
    //according to the type of helloBean, 
    //ie HelloRemote. It locates the Hello bean,
    //with the remote interface HelloRemote that
    //matches the type of the helloBean variable.
    //Then, it injects the reference of a Hello bean
    //instance to the helloBean variable before executing
    //the  main method. You may think of the container as
    //initializing the helloBean variable to be safely used
    //in the main method
    @EJB
    private static HelloRemote helloBean;
    public static void main(String[] args) {
        System.out.println(helloBean.greet());
    }
    
}
