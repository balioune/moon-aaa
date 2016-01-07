package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;aaa-authn-model&lt;/b&gt;
 * &lt;br&gt;Source path: &lt;i&gt;META-INF/yang/aaa-authn-model.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * module aaa-authn-model {
 *     yang-version 1;
 *     namespace "urn:aaa:yang:authn:claims";
 *     prefix "authn";
 *
 *     revision 2014-10-29 {
 *         description "";
 *     }
 *
 *     container tokencache {
 *         list claims {
 *             key "token"
 *             leaf token {
 *                 type string;
 *             }
 *             leaf clientId {
 *                 type string;
 *             }
 *             leaf userId {
 *                 type string;
 *             }
 *             leaf user {
 *                 type string;
 *             }
 *             leaf domain {
 *                 type string;
 *             }
 *             leaf-list roles {
 *                 type string;
 *             }
 *         }
 *     }
 *     container token_cache_times {
 *         list token_list {
 *             key "userId"
 *             leaf userId {
 *                 type string;
 *             }
 *             list user_tokens {
 *                 key "tokenid"
 *                 leaf tokenid {
 *                     type leafref;
 *                 }
 *                 leaf timestamp {
 *                     type uint64;
 *                 }
 *                 leaf expiration {
 *                     type int64;
 *                 }
 *             }
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 *
 */
public interface AaaAuthnModelData
    extends
    DataRoot
{




    Tokencache getTokencache();
    
    TokenCacheTimes getTokenCacheTimes();

}
