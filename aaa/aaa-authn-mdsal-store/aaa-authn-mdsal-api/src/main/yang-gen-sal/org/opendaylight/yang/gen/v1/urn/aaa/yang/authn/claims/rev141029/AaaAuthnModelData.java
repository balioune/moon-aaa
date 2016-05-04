package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>aaa-authn-model</b>
 * <br>Source path: <i>META-INF/yang/aaa-authn-model.yang</i>):
 * <pre>
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
 *     container authentication {
 *         list domain {
 *             key "domainid"
 *             leaf domainid {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf enabled {
 *                 type boolean;
 *             }
 *         }
 *         list user {
 *             key "userid"
 *             leaf userid {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf enabled {
 *                 type boolean;
 *             }
 *             leaf email {
 *                 type string;
 *             }
 *             leaf password {
 *                 type string;
 *             }
 *             leaf salt {
 *                 type string;
 *             }
 *             leaf domainid {
 *                 type string;
 *             }
 *         }
 *         list role {
 *             key "roleid"
 *             leaf roleid {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf domainid {
 *                 type string;
 *             }
 *         }
 *         list grant {
 *             key "grantid"
 *             leaf grantid {
 *                 type string;
 *             }
 *             leaf domainid {
 *                 type string;
 *             }
 *             leaf userid {
 *                 type string;
 *             }
 *             leaf roleid {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface AaaAuthnModelData
    extends
    DataRoot
{




    Tokencache getTokencache();
    
    TokenCacheTimes getTokenCacheTimes();
    
    Authentication getAuthentication();

}

