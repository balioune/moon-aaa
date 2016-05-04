/*
* Generated file
*
* Generated from: yang module name: aaa-h2-store yang module local name: aaa-h2-store
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Wed May 04 16:37:49 CEST 2016
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2015-11-28", name = "aaa-h2-store", namespace = "config:aaa:authn:h2:store")

public abstract class AbstractAAAH2StoreModule extends org.opendaylight.controller.config.spi.AbstractModule<AbstractAAAH2StoreModule> implements org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.AAAH2StoreModuleMXBean {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.AbstractAAAH2StoreModule.class);

    //attributes start

    //attributes end

    public AbstractAAAH2StoreModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public AbstractAAAH2StoreModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractAAAH2StoreModule oldModule,java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void validate() {

        customValidation();
    }

    protected void customValidation() {
    }

    protected final void resolveDependencies() {
    }

    public boolean canReuseInstance(AbstractAAAH2StoreModule oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractAAAH2StoreModule other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
    if (this == o) { return true; }
    if (o == null || getClass() != o.getClass()) { return false; }
        AbstractAAAH2StoreModule that = (AbstractAAAH2StoreModule) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters

    public org.slf4j.Logger getLogger() {
        return LOGGER;
    }

}
