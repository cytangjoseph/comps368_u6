package comps368.u6;
import javax.ejb.Remote;
/** Hello session bean, remote business interface */
@Remote
public interface HelloRemote {
    String greet();   
}
