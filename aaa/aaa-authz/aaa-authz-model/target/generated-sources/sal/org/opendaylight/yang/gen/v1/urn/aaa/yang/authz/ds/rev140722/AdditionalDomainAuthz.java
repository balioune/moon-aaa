package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.additional.domain.authz.Domains;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;authorization-schema&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/authorization-schema.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container additional-domain-authz {
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
 *         uses authorization-grp;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;authorization-schema/additional-domain-authz&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthzBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthzBuilder
 *
 */
public interface AdditionalDomainAuthz
    extends
    ChildOf<AuthorizationSchemaData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authz:ds","2014-07-22","additional-domain-authz"));

    List<Domains> getDomains();

}
