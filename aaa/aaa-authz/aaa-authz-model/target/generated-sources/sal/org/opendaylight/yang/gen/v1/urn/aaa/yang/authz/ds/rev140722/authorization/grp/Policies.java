package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.authorization.grp;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AuthorizationResponseType;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ResourceType;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ActionType;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.RoleType;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ServiceType;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AuthorizationGrp;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;authorization-schema&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/authorization-schema.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * list policies {
 *     key "service"
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
 *     leaf authorization {
 *         type authorization-response-type;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;authorization-schema/authorization-grp/policies&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.authorization.grp.PoliciesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.authorization.grp.PoliciesBuilder
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.authorization.grp.PoliciesKey
 *
 */
public interface Policies
    extends
    ChildOf<AuthorizationGrp>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.authorization.grp.Policies>,
    Identifiable<PoliciesKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authz:ds","2014-07-22","policies"));

    ServiceType getService();
    
    ActionType getAction();
    
    ResourceType getResource();
    
    RoleType getRole();
    
    AuthorizationResponseType getAuthorization();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     */
    PoliciesKey getKey();

}

