package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;authorization-schema&lt;/b&gt;
 * &lt;br&gt;Source path: &lt;i&gt;META-INF/yang/authorization-schema.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * module authorization-schema {
 *     yang-version 1;
 *     namespace "urn:aaa:yang:authz:ds";
 *     prefix "authz";
 *
 *     revision 2014-07-22 {
 *         description "";
 *     }
 *
 *     container simple-authorization {
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
 *     container domain-authorization {
 *         list domains {
 *             key "domain-name"
 *             leaf domain-name {
 *                 type domain-type;
 *             }
 *             list policies {
 *                 key "service"
 *                 leaf service {
 *                     type service-type;
 *                 }
 *                 leaf action {
 *                     type action-type;
 *                 }
 *                 leaf resource {
 *                     type resource-type;
 *                 }
 *                 leaf role {
 *                     type role-type;
 *                 }
 *                 leaf authorization {
 *                     type authorization-response-type;
 *                 }
 *             }
 *             list authz-domain-chain {
 *                 key "priority"
 *                 leaf priority {
 *                     type uint32;
 *                 }
 *                 leaf domain-name {
 *                     type leafref;
 *                 }
 *             }
 *             uses authorization-grp;
 *         }
 *     }
 *     container additional-domain-authz {
 *         list domains {
 *             key "domain-name"
 *             leaf domain-name {
 *                 type domain-type;
 *             }
 *             list policies {
 *                 key "service"
 *                 leaf service {
 *                     type service-type;
 *                 }
 *                 leaf action {
 *                     type action-type;
 *                 }
 *                 leaf resource {
 *                     type resource-type;
 *                 }
 *                 leaf role {
 *                     type role-type;
 *                 }
 *                 leaf authorization {
 *                     type authorization-response-type;
 *                 }
 *             }
 *             uses authorization-grp;
 *         }
 *     }
 *
 *     grouping authorization-grp {
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
 *     }
 *
 *     rpc req-authorization {
 *         "Check Authorization for a given combination of action and role.
 *                 A not-authorized  will be returned if unsuccessful.";
 *         input {
 *             leaf domain-name {
 *                 type domain-type;
 *             }
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
 *         }
 *         
 *         output {
 *             leaf authorization-response {
 *                 type authorization-response-type;
 *             }
 *         }
 *         status CURRENT;
 *     }
 * }
 * &lt;/pre&gt;
 *
 */
public interface AuthorizationSchemaData
    extends
    DataRoot
{




    SimpleAuthorization getSimpleAuthorization();
    
    DomainAuthorization getDomainAuthorization();
    
    AdditionalDomainAuthz getAdditionalDomainAuthz();

}

