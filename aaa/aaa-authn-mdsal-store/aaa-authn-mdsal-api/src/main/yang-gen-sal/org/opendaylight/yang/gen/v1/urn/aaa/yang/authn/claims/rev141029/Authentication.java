package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.Grant;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.Domain;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.Role;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>aaa-authn-model</b>
 * <br>(Source path: <i>META-INF/yang/aaa-authn-model.yang</i>):
 * <pre>
 * container authentication {
 *     list domain {
 *         key "domainid"
 *         leaf domainid {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf enabled {
 *             type boolean;
 *         }
 *     }
 *     list user {
 *         key "userid"
 *         leaf userid {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf enabled {
 *             type boolean;
 *         }
 *         leaf email {
 *             type string;
 *         }
 *         leaf password {
 *             type string;
 *         }
 *         leaf salt {
 *             type string;
 *         }
 *         leaf domainid {
 *             type string;
 *         }
 *     }
 *     list role {
 *         key "roleid"
 *         leaf roleid {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf domainid {
 *             type string;
 *         }
 *     }
 *     list grant {
 *         key "grantid"
 *         leaf grantid {
 *             type string;
 *         }
 *         leaf domainid {
 *             type string;
 *         }
 *         leaf userid {
 *             type string;
 *         }
 *         leaf roleid {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>aaa-authn-model/authentication</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.AuthenticationBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.AuthenticationBuilder
 *
 */
public interface Authentication
    extends
    ChildOf<AaaAuthnModelData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.Authentication>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authn:claims",
        "2014-10-29", "authentication").intern();

    List<Domain> getDomain();
    
    List<User> getUser();
    
    List<Role> getRole();
    
    List<Grant> getGrant();

}

