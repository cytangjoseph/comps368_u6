package comps368.u6;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
/** Hello session bean, client class using JDNI */
public class HelloClient2 {
    public static void main(String[] args) throws NamingException {
        Context context = new InitialContext();
        //"java:global//hello-ejb/Hello" is the Hello ejb's portable JDNI name 
        HelloRemote helloBean = (HelloRemote) 
                context.lookup("java:global/hello-ejb/Hello");
        System.out.println("uisng JDNI");
        System.out.println(helloBean.greet());
    }    
}
