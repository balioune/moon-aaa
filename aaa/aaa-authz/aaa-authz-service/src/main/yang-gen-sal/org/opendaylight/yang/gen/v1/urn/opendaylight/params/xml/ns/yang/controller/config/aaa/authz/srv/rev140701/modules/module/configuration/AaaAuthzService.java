package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.aaa.authz.srv.rev140701.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.aaa.authz.srv.rev140701.modules.module.configuration.aaa.authz.service.DomBroker;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.aaa.authz.srv.rev140701.modules.module.configuration.aaa.authz.service.Policies;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ResourceType;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.RoleType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ServiceType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.aaa.authz.srv.rev140701.modules.module.configuration.aaa.authz.service.DataBroker;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;aaa-authz-service-impl&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/aaa-authz-service-impl.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * case aaa-authz-service {
 *     container dom-broker {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:aaa-authz:srv?revision=2014-07-01)type {
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
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:aaa-authz:srv?revision=2014-07-01)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     leaf authz-role {
 *         type string;
 *     }
 *     leaf service {
 *         type service-type;
 *     }
 *     leaf action {
 *         type string;
 *     }
 *     leaf resource {
 *         type resource-type;
 *     }
 *     leaf role {
 *         type role-type;
 *     }
 *     list policies {
 *         key "service"
 *         leaf service {
 *             type service-type;
 *         }
 *         leaf action {
 *             type string;
 *         }
 *         leaf resource {
 *             type resource-type;
 *         }
 *         leaf role {
 *             type role-type;
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;aaa-authz-service-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:aaa-authz:srv?revision=2014-07-01)aaa-authz-service&lt;/i&gt;
 *
 */
public interface AaaAuthzService
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.aaa.authz.srv.rev140701.modules.module.configuration.AaaAuthzService>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:aaa-authz:srv","2014-07-01","aaa-authz-service"));

    DomBroker getDomBroker();
    
    DataBroker getDataBroker();
    
    java.lang.String getAuthzRole();
    
    ServiceType getService();
    
    /**
     * String representation of enum authzs:action-type expecting following values 
     * create, read, update, delete, execute, subscribe, any
     *
     */
    java.lang.String getAction();
    
    ResourceType getResource();
    
    RoleType getRole();
    
    List<Policies> getPolicies();

}

