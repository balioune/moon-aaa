package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;authorization-schema&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/authorization-schema.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container input {
 *     leaf domain-name {
 *         type domain-type;
 *     }
 *     leaf service {
 *         type service-type;
 *     }
 *     leaf action {
 *         type action-type;
 *     }
 *     leaf resource {
 *         type resource-type;
 *     }
 *     leaf role {
 *         type role-type;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;authorization-schema/req-authorization/input&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInputBuilder
 *
 */
public interface ReqAuthorizationInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authz:ds","2014-07-22","input"));

    DomainType getDomainName();
    
    ServiceType getService();
    
    ActionType getAction();
    
    ResourceType getResource();
    
    RoleType getRole();

}

