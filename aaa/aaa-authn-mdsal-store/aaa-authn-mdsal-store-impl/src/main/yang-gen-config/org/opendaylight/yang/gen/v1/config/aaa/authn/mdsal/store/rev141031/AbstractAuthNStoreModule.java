/*
* Generated file
*
* Generated from: yang module name: aaa-authn-mdsal-store-cfg yang module local name: aaa-authn-mdsal-store
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Thu Jan 07 19:23:50 CET 2016
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2014-10-31", name = "aaa-authn-mdsal-store-cfg", namespace = "config:aaa:authn:mdsal:store")

public abstract class AbstractAuthNStoreModule extends org.opendaylight.controller.config.spi.AbstractModule<AbstractAuthNStoreModule> implements org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.AuthNStoreModuleMXBean,org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.TokenStoreServiceInterface {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.AbstractAuthNStoreModule.class);

    //attributes start

    public static final org.opendaylight.controller.config.api.JmxAttribute timeToWaitJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("TimeToWait");
    private java.lang.Integer timeToWait = new java.lang.Integer("10");

    public static final org.opendaylight.controller.config.api.JmxAttribute domBrokerJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("DomBroker");
    private javax.management.ObjectName domBroker; // mandatory

    public static final org.opendaylight.controller.config.api.JmxAttribute dataBrokerJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("DataBroker");
    private javax.management.ObjectName dataBroker; // mandatory

    public static final org.opendaylight.controller.config.api.JmxAttribute passwordJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Password");
    private java.lang.String password;

    public static final org.opendaylight.controller.config.api.JmxAttribute timeToLiveJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("TimeToLive");
    private java.math.BigInteger timeToLive = new java.math.BigInteger("360000");

    //attributes end

    public AbstractAuthNStoreModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public AbstractAuthNStoreModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractAuthNStoreModule oldModule,java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void validate() {
        dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.md.sal.dom.BrokerServiceInterface.class, domBroker, domBrokerJmxAttribute);
        dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.md.sal.binding.DataBrokerServiceInterface.class, dataBroker, dataBrokerJmxAttribute);

        customValidation();
    }

    protected void customValidation() {
    }

    private org.opendaylight.controller.sal.core.api.Broker domBrokerDependency;
    protected final org.opendaylight.controller.sal.core.api.Broker getDomBrokerDependency(){
        return domBrokerDependency;
    }private org.opendaylight.controller.md.sal.binding.api.DataBroker dataBrokerDependency;
    protected final org.opendaylight.controller.md.sal.binding.api.DataBroker getDataBrokerDependency(){
        return dataBrokerDependency;
    }

    protected final void resolveDependencies() {
        dataBrokerDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.md.sal.binding.api.DataBroker.class, dataBroker, dataBrokerJmxAttribute);
        domBrokerDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.sal.core.api.Broker.class, domBroker, domBrokerJmxAttribute);
    }

    public boolean canReuseInstance(AbstractAuthNStoreModule oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractAuthNStoreModule other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }
        if (java.util.Objects.deepEquals(timeToWait, other.timeToWait) == false) {
            return false;
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
        if (java.util.Objects.deepEquals(password, other.password) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(timeToLive, other.timeToLive) == false) {
            return false;
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractAuthNStoreModule that = (AbstractAuthNStoreModule) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters
    @Override
    public java.lang.Integer getTimeToWait() {
        return timeToWait;
    }

    /**
    * Time to wait for future from data store. 10 by default = never expire
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "Time to wait for future from data store. 10 by default = never expire")
    public void setTimeToWait(java.lang.Integer timeToWait) {
        this.timeToWait = timeToWait;
    }

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
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.binding.DataBrokerServiceInterface.class)
    public void setDataBroker(javax.management.ObjectName dataBroker) {
        this.dataBroker = dataBroker;
    }

    @Override
    public java.lang.String getPassword() {
        return password;
    }

    /**
    * Encryption password for the Store
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "Encryption password for the Store")
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    @Override
    public java.math.BigInteger getTimeToLive() {
        return timeToLive;
    }

    /**
    * Time to live for tokens. When set to 0 = never expire
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "Time to live for tokens. When set to 0 = never expire")
    public void setTimeToLive(java.math.BigInteger timeToLive) {
        this.timeToLive = timeToLive;
    }

    public org.slf4j.Logger getLogger() {
        return LOGGER;
    }

}
