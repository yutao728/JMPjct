import java.io.*;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;


public class Plugin_Ehcache extends Plugin_Base {
    private Ehcache cache;
    
    public void init(Proxy context) {
        //this.cache = CacheManager.create();
    }
    
    public void read_handshake(Proxy context) {
    }
    
    public void read_auth(Proxy context) {
    }
    
    public void read_auth_result(Proxy context) {
    }
    
    public void read_query(Proxy context) {
    }
    
    public void read_query_result(Proxy context) {
    }
    
    public void send_query_result(Proxy context) {
    }
    
    public void cleanup(Proxy context) {
    }
}
