package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.DomainType;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;authorization-schema&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/authorization-schema.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * list authz-domain-chain {
 *     key "priority"
 *     leaf priority {
 *         type uint32;
 *     }
 *     leaf domain-name {
 *         type leafref;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;authorization-schema/domain-authorization/domains/authz-domain-chain&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChainBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChainBuilder
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChainKey
 *
 */
public interface AuthzDomainChain
    extends
    ChildOf<Domains>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain>,
    Identifiable<AuthzDomainChainKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authz:ds","2014-07-22","authz-domain-chain"));

    java.lang.Long getPriority();
    
    DomainType getDomainName();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     */
    AuthzDomainChainKey getKey();

}

