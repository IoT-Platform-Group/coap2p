import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapHandler;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.Utils;

import java.util.concurrent.Executors;

public class Client {
    static public void main(String[] args) {
        String URI = "coap://localhost:5683";
        CoapClient client = new CoapClient(URI);

        Executors.newSingleThreadExecutor().execute(() -> client.get(new CoapHandler() {
            @Override
            public void onLoad(CoapResponse coapResponse) {
                System.out.println(Utils.prettyPrint(coapResponse));
            }

            @Override
            public void onError() {

            }
        }));
    }
}
