package org.opendaylight.aaa;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import org.json.JSONObject;
import org.json.JSONTokener;

/**
 * authentication with keystone 
 * for federated authentication between ODL and openStack
 * @author alioune ba 
 * 
 */

public class MoonProxy {
	
	//my add
    public JSONObject keystoneAunthenticate(String username, String password, String domain){
    	
        String output = "";

        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        JSONTokener tokener;
        JSONObject object =null;
        
        String server = System.getenv("MOON_SERVER_ADDR");
        System.out.println("moon server "+ server);
        String URL = "http://"+server+":5000/v2.0/tokens";
        
        WebResource webResource = client.resource(URL);
        System.out.println("UserNanme "+ username);
        System.out.println("password "+ password);
        System.out.println("domain "+ domain);
        
        String input = "{\"auth\": {\"tenantName\": "+ "\"" + domain+ "\"," +" \"passwordCredentials\": {\"username\": " + "\"" + username + "\"," + "\"password\":" + "\"" + password + "\""  +"}}}";
        ClientResponse response = webResource.type("application/json").post(ClientResponse.class, input);

        if (response.getStatus() == 200) {
        	
            //throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            output = response.getEntity(String.class);
            tokener = new JSONTokener(output);
            object = (JSONObject)new JSONObject(tokener);
            
            return object;
        }

        return object;
    }

}
