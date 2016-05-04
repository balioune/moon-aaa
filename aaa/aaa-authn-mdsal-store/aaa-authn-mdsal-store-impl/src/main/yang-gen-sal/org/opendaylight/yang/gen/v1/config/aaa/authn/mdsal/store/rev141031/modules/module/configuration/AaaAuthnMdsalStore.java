package org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration;
import org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.aaa.authn.mdsal.store.DomBroker;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.aaa.authn.mdsal.store.DataBroker;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.math.BigInteger;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>aaa-authn-mdsal-store-cfg</b>
 * <br>(Source path: <i>META-INF/yang/aaa-authn-mdsal-store-cfg.yang</i>):
 * <pre>
 * case aaa-authn-mdsal-store {
 *     container dom-broker {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (config:aaa:authn:mdsal:store?revision=2014-10-31)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container data-broker {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (config:aaa:authn:mdsal:store?revision=2014-10-31)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     leaf timeToLive {
 *         type timeToLive;
 *     }
 *     leaf timeToWait {
 *         type timeToWait;
 *     }
 *     leaf password {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>aaa-authn-mdsal-store-cfg/modules/module/configuration/(config:aaa:authn:mdsal:store?revision=2014-10-31)aaa-authn-mdsal-store</i>
 *
 */
public interface AaaAuthnMdsalStore
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("config:aaa:authn:mdsal:store",
        "2014-10-31", "aaa-authn-mdsal-store").intern();

    DomBroker getDomBroker();
    
    DataBroker getDataBroker();
    
    /**
     * Time to live for tokens. When set to 0 = never expire
     *
     */
    BigInteger getTimeToLive();
    
    /**
     * Time to wait for future from data store. 10 by default = never expire
     *
     */
    java.lang.Integer getTimeToWait();
    
    /**
     * Encryption password for the Store
     *
     */
    java.lang.String getPassword();

}

