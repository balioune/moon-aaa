/*
 * Copyright (c) 2014, 2015 Hewlett-Packard Development Company, L.P. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.aaa;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoonAuthn {

    private static final Logger LOG = LoggerFactory.getLogger(MoonAuthn.class);
    public JSONObject keystoneAuthenticate(String username, String password, String domain){

        String output = "";
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        JSONTokener tokener;
        JSONObject object =null;

        String server = System.getenv("MOON_SERVER_ADDR");
        String port = System.getenv("MOON_SERVER_PORT");
        String URL = "http://" +server+ ":" +port+ "/v2.0/tokens";
        LOG.info("Moon server is at: {} ", server);
        WebResource webResource = client.resource(URL);
        String input = "{\"auth\": {\"tenantName\": "+ "\"" + domain+ "\"," +" \"passwordCredentials\": {\"username\": " + "\"" + username + "\"," + "\"password\":" + "\"" + password + "\"" +"}}}";
        ClientResponse response = webResource.type("application/json").post(ClientResponse.class, input);
        output = response.getEntity(String.class);
        tokener = new JSONTokener(output);
        object = new JSONObject(tokener);
        return object;
    }

}
