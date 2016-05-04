package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.additional.domain.authz;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.DomainType;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AuthorizationGrp;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>authorization-schema</b>
 * <br>(Source path: <i>META-INF/yang/authorization-schema.yang</i>):
 * <pre>
 * list domains {
 *     key "domain-name"
 *     leaf domain-name {
 *         type domain-type;
 *     }
 *     list policies {
 *         key "service"
 *         leaf service {
 *             type service-type;
 *         }
 *         leaf action {
 *             type action-type;
 *         }
 *         leaf resource {
 *             type resource-type;
 *         }
 *         leaf role {
 *             type role-type;
 *         }
 *         leaf authorization {
 *             type authorization-response-type;
 *         }
 *     }
 *     uses authorization-grp;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>authorization-schema/additional-domain-authz/domains</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.additional.domain.authz.DomainsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.additional.domain.authz.DomainsBuilder
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.additional.domain.authz.DomainsKey
 *
 */
public interface Domains
    extends
    ChildOf<AdditionalDomainAuthz>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.additional.domain.authz.Domains>,
    AuthorizationGrp,
    Identifiable<DomainsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authz:ds",
        "2014-07-22", "domains").intern();

    DomainType getDomainName();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     */
    DomainsKey getKey();

}

