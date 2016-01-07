package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.aaa.credential.store.rev150226;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.aaa.credential.store.rev150226.credential.store.Credential;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;credential-store&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/credential-model.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container credential-store {
 *     list credential {
 *         key "id"
 *         leaf id {
 *             type string;
 *         }
 *         leaf type {
 *             type identityref;
 *         }
 *         choice value {
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;credential-store/credential-store&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.aaa.credential.store.rev150226.CredentialStoreBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.aaa.credential.store.rev150226.CredentialStoreBuilder
 *
 */
public interface CredentialStore
    extends
    ChildOf<CredentialStoreData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.aaa.credential.store.rev150226.CredentialStore>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:aaa:credential-store","2015-02-26","credential-store"));

    List<Credential> getCredential();

}

