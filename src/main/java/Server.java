import org.eclipse.californium.core.CoapServer;

import java.util.concurrent.Executors;


public class Server {

    static public void main(String[] args) {
        CoapServer server = new CoapServer();
        Executors.newSingleThreadExecutor().execute(server::start);
    }
}
