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
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2014-07-01", name = "aaa-authz-service-impl", namespace = "urn:opendaylight:params:xml:ns:yang:controller:config:aaa-authz:srv")

public abstract class AbstractAuthzSrvModule extends org.opendaylight.controller.config.spi.AbstractModule<AbstractAuthzSrvModule> implements org.opendaylight.controller.config.yang.config.aaa_authz.srv.AuthzSrvModuleMXBean,org.opendaylight.controller.config.yang.md.sal.dom.BrokerServiceInterface {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(org.opendaylight.controller.config.yang.config.aaa_authz.srv.AbstractAuthzSrvModule.class);

    //attributes start

    public static final org.opendaylight.controller.config.api.JmxAttribute domBrokerJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("DomBroker");
    private javax.management.ObjectName domBroker; // mandatory

    public static final org.opendaylight.controller.config.api.JmxAttribute dataBrokerJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("DataBroker");
    private javax.management.ObjectName dataBroker; // mandatory

    public static final org.opendaylight.controller.config.api.JmxAttribute resourceJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Resource");
    private org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ResourceType resource;

    public static final org.opendaylight.controller.config.api.JmxAttribute actionJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Action");
    private java.lang.String action;

    public static final org.opendaylight.controller.config.api.JmxAttribute serviceJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Service");
    private org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ServiceType service;

    public static final org.opendaylight.controller.config.api.JmxAttribute roleJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Role");
    private org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.RoleType role;

    public static final org.opendaylight.controller.config.api.JmxAttribute authzRoleJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("AuthzRole");
    private java.lang.String authzRole;

    public static final org.opendaylight.controller.config.api.JmxAttribute policiesJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Policies");
    private java.util.List<org.opendaylight.controller.config.yang.config.aaa_authz.srv.Policies> policies = new java.util.ArrayList<org.opendaylight.controller.config.yang.config.aaa_authz.srv.Policies>();

    //attributes end

    public AbstractAuthzSrvModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public AbstractAuthzSrvModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractAuthzSrvModule oldModule,java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void validate() {
        dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.md.sal.dom.BrokerServiceInterface.class, domBroker, domBrokerJmxAttribute);
        dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.md.sal.binding.DataProviderServiceServiceInterface.class, dataBroker, dataBrokerJmxAttribute);

        customValidation();
    }

    protected void customValidation() {
    }

    private org.opendaylight.controller.sal.core.api.Broker domBrokerDependency;
    protected final org.opendaylight.controller.sal.core.api.Broker getDomBrokerDependency(){
        return domBrokerDependency;
    }private org.opendaylight.controller.sal.binding.api.data.DataProviderService dataBrokerDependency;
    protected final org.opendaylight.controller.sal.binding.api.data.DataProviderService getDataBrokerDependency(){
        return dataBrokerDependency;
    }

    protected final void resolveDependencies() {
        domBrokerDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.sal.core.api.Broker.class, domBroker, domBrokerJmxAttribute);
        dataBrokerDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.sal.binding.api.data.DataProviderService.class, dataBroker, dataBrokerJmxAttribute);
        if (policies!=null){
            for(org.opendaylight.controller.config.yang.config.aaa_authz.srv.Policies candidate : policies) {
                candidate.injectDependencyResolver(dependencyResolver);
            }
        }
    }

    public boolean canReuseInstance(AbstractAuthzSrvModule oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractAuthzSrvModule other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }
        if (java.util.Objects.deepEquals(domBroker, other.domBroker) == false) {
            return false;
        }
        if(domBroker!= null) {
            if (!dependencyResolver.canReuseDependency(domBroker, domBrokerJmxAttribute)) { // reference to dependency must be reusable as well
                return false;
            }
        }
        if (java.util.Objects.deepEquals(dataBroker, other.dataBroker) == false) {
            return false;
        }
        if(dataBroker!= null) {
            if (!dependencyResolver.canReuseDependency(dataBroker, dataBrokerJmxAttribute)) { // reference to dependency must be reusable as well
                return false;
            }
        }
        if (java.util.Objects.deepEquals(resource, other.resource) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(action, other.action) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(service, other.service) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(role, other.role) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(authzRole, other.authzRole) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(policies, other.policies) == false) {
            return false;
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractAuthzSrvModule that = (AbstractAuthzSrvModule) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters
    @Override
    public javax.management.ObjectName getDomBroker() {
        return domBroker;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.dom.BrokerServiceInterface.class)
    public void setDomBroker(javax.management.ObjectName domBroker) {
        this.domBroker = domBroker;
    }

    @Override
    public javax.management.ObjectName getDataBroker() {
        return dataBroker;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.binding.DataProviderServiceServiceInterface.class)
    public void setDataBroker(javax.management.ObjectName dataBroker) {
        this.dataBroker = dataBroker;
    }

    @Override
    public org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ResourceType getResource() {
        return resource;
    }

    @Override
    public void setResource(org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ResourceType resource) {
        this.resource = resource;
    }

    @Override
    public java.lang.String getAction() {
        return action;
    }

    /**
    * String representation of enum authzs:action-type expecting following values create, read, update, delete, execute, subscribe, any
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "String representation of enum authzs:action-type expecting following values create, read, update, delete, execute, subscribe, any")
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    @Override
    public org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ServiceType getService() {
        return service;
    }

    @Override
    public void setService(org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ServiceType service) {
        this.service = service;
    }

    @Override
    public org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.RoleType getRole() {
        return role;
    }

    @Override
    public void setRole(org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.RoleType role) {
        this.role = role;
    }

    @Override
    public java.lang.String getAuthzRole() {
        return authzRole;
    }

    @Override
    public void setAuthzRole(java.lang.String authzRole) {
        this.authzRole = authzRole;
    }

    @Override
    public java.util.List<org.opendaylight.controller.config.yang.config.aaa_authz.srv.Policies> getPolicies() {
        return policies;
    }

    @Override
    public void setPolicies(java.util.List<org.opendaylight.controller.config.yang.config.aaa_authz.srv.Policies> policies) {
        this.policies = policies;
    }

    public org.slf4j.Logger getLogger() {
        return LOGGER;
    }

}
