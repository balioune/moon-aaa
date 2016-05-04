package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>authorization-schema</b>
 * <br>(Source path: <i>META-INF/yang/authorization-schema.yang</i>):
 * <pre>
 * container domain-authorization {
 *     list domains {
 *         key "domain-name"
 *         leaf domain-name {
 *             type domain-type;
 *         }
 *         list policies {
 *             key "service"
 *             leaf service {
 *                 type service-type;
 *             }
 *             leaf action {
 *                 type action-type;
 *             }
 *             leaf resource {
 *                 type resource-type;
 *             }
 *             leaf role {
 *                 type role-type;
 *             }
 *             leaf authorization {
 *                 type authorization-response-type;
 *             }
 *         }
 *         list authz-domain-chain {
 *             key "priority"
 *             leaf priority {
 *                 type uint32;
 *             }
 *             leaf domain-name {
 *                 type leafref;
 *             }
 *         }
 *         uses authorization-grp;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>authorization-schema/domain-authorization</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.DomainAuthorizationBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.DomainAuthorizationBuilder
 *
 */
public interface DomainAuthorization
    extends
    ChildOf<AuthorizationSchemaData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.DomainAuthorization>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authz:ds",
        "2014-07-22", "domain-authorization").intern();

    List<Domains> getDomains();

}

