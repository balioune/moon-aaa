/*
* Generated file
*
* Generated from: yang module name: aaa-authz-service-impl yang module local name: aaa-authz-service
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Thu Jan 07 19:24:20 CET 2016
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.config.aaa_authz.srv;
public interface AuthzSrvModuleMXBean {
    public javax.management.ObjectName getDomBroker();

    public void setDomBroker(javax.management.ObjectName domBroker);

    public javax.management.ObjectName getDataBroker();

    public void setDataBroker(javax.management.ObjectName dataBroker);

    public org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ResourceType getResource();

    public void setResource(org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ResourceType resource);

    public java.lang.String getAction();

    /**
    * String representation of enum authzs:action-type expecting following values create, read, update, delete, execute, subscribe, any
    */
    public void setAction(java.lang.String action);

    public org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ServiceType getService();

    public void setService(org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ServiceType service);

    public org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.RoleType getRole();

    public void setRole(org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.RoleType role);

    public java.lang.String getAuthzRole();

    public void setAuthzRole(java.lang.String authzRole);

    public java.util.List<org.opendaylight.controller.config.yang.config.aaa_authz.srv.Policies> getPolicies();

    public void setPolicies(java.util.List<org.opendaylight.controller.config.yang.config.aaa_authz.srv.Policies> policies);

}