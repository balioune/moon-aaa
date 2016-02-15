package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.aaa.credential.store.rev150226.credential.store;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.aaa.credential.store.rev150226.credential.store.credential.Value;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.aaa.credential.store.rev150226.CredentialStore;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;credential-store&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/credential-model.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * list credential {
 *     key "id"
 *     leaf id {
 *         type string;
 *     }
 *     leaf type {
 *         type identityref;
 *     }
 *     choice value {
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;credential-store/credential-store/credential&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.aaa.credential.store.rev150226.credential.store.CredentialBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.aaa.credential.store.rev150226.credential.store.CredentialBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.aaa.credential.store.rev150226.credential.store.CredentialKey
 *
 */
public interface Credential
    extends
    ChildOf<CredentialStore>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.aaa.credential.store.rev150226.credential.store.Credential>,
    Identifiable<CredentialKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:aaa:credential-store","2015-02-26","credential"));

    /**
     * Unique identifier for this credential entry.
     *
     */
    java.lang.String getId();
    
    /**
     * The type of credential represented in this entry.
     *
     */
    java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.aaa.credential.store.rev150226.CredentialType> getType();
    
    /**
     * Extension point. Contains the data specific to the credential type.
     *
     */
    Value getValue();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     */
    CredentialKey getKey();

}

