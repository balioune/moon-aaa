package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>authorization-schema</b>
 * <br>(Source path: <i>META-INF/yang/authorization-schema.yang</i>):
 * <pre>
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
 * </pre>
 * The schema path to identify an instance is
 * <i>authorization-schema/req-authorization/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInputBuilder
 *
 */
public interface ReqAuthorizationInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authz:ds",
        "2014-07-22", "input").intern();

    DomainType getDomainName();
    
    ServiceType getService();
    
    ActionType getAction();
    
    ResourceType getResource();
    
    RoleType getRole();

}

