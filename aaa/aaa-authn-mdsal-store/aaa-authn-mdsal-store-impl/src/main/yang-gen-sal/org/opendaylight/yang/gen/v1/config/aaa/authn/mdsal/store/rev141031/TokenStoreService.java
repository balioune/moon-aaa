package org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceType;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>aaa-authn-mdsal-store-cfg</b>
 * <br>(Source path: <i>META-INF/yang/aaa-authn-mdsal-store-cfg.yang</i>):
 * <pre>
 * identity token-store-service {
 *     base "()IdentityEffectiveStatementImpl[base=null, qname=(urn:opendaylight:params:xml:ns:yang:controller:config?revision=2013-04-05)service-type]";
 *     status CURRENT;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>aaa-authn-mdsal-store-cfg/token-store-service</i>
 *
 */
public abstract class TokenStoreService extends ServiceType
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("config:aaa:authn:mdsal:store",
        "2014-10-31", "token-store-service").intern();


    public TokenStoreService() {
    
    
    }
    






}

