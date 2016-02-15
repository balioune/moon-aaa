package org.opendaylight.aaa;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.json.JSONObject;
import org.json.JSONTokener;

/**
 * authentication with keystone 
 * for federated authentication between ODL and openStack
 * @author alioune ba 
 * 
 */

public class MoonProxy {
	
	private static final Logger LOG = LoggerFactory.getLogger(MoonProxy.class);
    
    public JSONObject keystoneAunthenticate(String username, String password, String domain){
    	
        String output = "";

        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        JSONTokener tokener;
        JSONObject object =null;
        
        String server = System.getenv("MOON_SERVER_ADDR");
        String port = System.getenv("MOON_SERVER_PORT");
        String URL = "http://" +server+ ":" +port+ "/v2.0/tokens";
        LOG.info("Moon server is at: "+ server);
        LOG.info("Moon port is at: "+ port);
        LOG.info("If clause is commmented ");
        WebResource webResource = client.resource(URL);
        
        String input = "{\"auth\": {\"tenantName\": "+ "\"" + domain+ "\"," +" \"passwordCredentials\": {\"username\": " + "\"" + username + "\"," + "\"password\":" + "\"" + password + "\""  +"}}}";
        ClientResponse response = webResource.type("application/json").post(ClientResponse.class, input);

        output = response.getEntity(String.class);
        tokener = new JSONTokener(output);
        object = (JSONObject)new JSONObject(tokener);
            
        return object;
    }

}
