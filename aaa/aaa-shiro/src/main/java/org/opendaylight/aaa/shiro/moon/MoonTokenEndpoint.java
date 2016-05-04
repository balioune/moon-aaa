/*
 * Copyright (c) 2015 Brocade Communications Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.aaa.shiro.moon;


import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoonTokenEndpoint extends HttpServlet{

    private static final long serialVersionUID = 4980356362831585417L;
    static final String TOKEN_GRANT_ENDPOINT = "/token";
    static final String TOKEN_REVOKE_ENDPOINT = "/revoke";
    static final String TOKEN_VALIDATE_ENDPOINT = "/validate";
    private static final Logger LOG = LoggerFactory.getLogger(MoonTokenEndpoint.class);

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        LOG.info("MoonTokenEndpoint Servlet doPost method");
        try {
            if (req.getServletPath().equals(TOKEN_GRANT_ENDPOINT)) {
                //createAccessToken(req, resp);
            } else if (req.getServletPath().equals(TOKEN_REVOKE_ENDPOINT)) {
                //deleteAccessToken(req, resp);
            } else if (req.getServletPath().equals(TOKEN_VALIDATE_ENDPOINT)) {
                //validateToken(req, resp);
            }
        } catch (Exception e) {
            //error(resp, e);
        }
    }

}
