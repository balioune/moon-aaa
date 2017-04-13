/*
 * Copyright (c) 2015 Brocade Communications Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.aaa.shiro.filters;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoonHttpAthFilter extends ODLHttpAuthenticationFilter{
    private static final Logger LOG = LoggerFactory.getLogger(MoonHttpAthFilter.class);

    public MoonHttpAthFilter(){
        super();
        LOG.info("Creating the MoonHttpAthFilter");
    }

    protected boolean isLoginAttempt(String authzHeader) {
        LOG.info("Try to filter with MoonHttpAthFilter");
        return super.isLoginAttempt(authzHeader);
    }

    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response,
            Object mappedValue) {
        LOG.info("Try to filter with MoonHttpAthFilter");
        return super.isAccessAllowed(request, response, mappedValue);
    }
}
