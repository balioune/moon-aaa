package org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.aaa.authn.mdsal.store;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;aaa-authn-mdsal-store-cfg&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/aaa-authn-mdsal-store-cfg.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container data-broker {
 *     leaf type {
 *         type leafref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (config:aaa:authn:mdsal:store?revision=2014-10-31)type {
 *             leaf type {
 *                 type leafref;
 *             }
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;aaa-authn-mdsal-store-cfg/modules/module/configuration/(config:aaa:authn:mdsal:store?revision=2014-10-31)aaa-authn-mdsal-store/data-broker&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.aaa.authn.mdsal.store.DataBrokerBuilder}.
 * @see org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.aaa.authn.mdsal.store.DataBrokerBuilder
 *
 */
public interface DataBroker
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.aaa.authn.mdsal.store.DataBroker>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("config:aaa:authn:mdsal:store","2014-10-31","data-broker"));


}

