package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.aaa.credential.store.rev150226;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * Defines and extensible model for storing various types of security credentials.
 *
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;credential-store&lt;/b&gt;
 * &lt;br&gt;Source path: &lt;i&gt;META-INF/yang/credential-model.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * module credential-store {
 *     yang-version 1;
 *     namespace "urn:opendaylight:params:xml:ns:yang:aaa:credential-store";
 *     prefix "cs";
 *
 *     revision 2015-02-26 {
 *         description "Defines and extensible model for storing various types of security credentials.
 *         ";
 *     }
 *
 *     container credential-store {
 *         list credential {
 *             key "id"
 *             leaf id {
 *                 type string;
 *             }
 *             leaf type {
 *                 type identityref;
 *             }
 *             choice value {
 *             }
 *         }
 *     }
 *
 *     identity credential-type {
 *         description
 *             "Credential base type.  All credential types must be derived from this identity.";
 *         status CURRENT;
 *     }
 * }
 * &lt;/pre&gt;
 *
 */
public interface CredentialStoreData
    extends
    DataRoot
{




    CredentialStore getCredentialStore();

}

