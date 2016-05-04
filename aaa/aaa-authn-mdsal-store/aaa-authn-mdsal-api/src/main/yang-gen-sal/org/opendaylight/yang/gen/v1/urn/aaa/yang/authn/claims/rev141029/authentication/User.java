package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.Authentication;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>aaa-authn-model</b>
 * <br>(Source path: <i>META-INF/yang/aaa-authn-model.yang</i>):
 * <pre>
 * list user {
 *     key "userid"
 *     leaf userid {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf enabled {
 *         type boolean;
 *     }
 *     leaf email {
 *         type string;
 *     }
 *     leaf password {
 *         type string;
 *     }
 *     leaf salt {
 *         type string;
 *     }
 *     leaf domainid {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>aaa-authn-model/authentication/user</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.UserBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.UserBuilder
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.UserKey
 *
 */
public interface User
    extends
    ChildOf<Authentication>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User>,
    Identifiable<UserKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authn:claims",
        "2014-10-29", "user").intern();

    java.lang.String getUserid();
    
    java.lang.String getName();
    
    java.lang.String getDescription();
    
    java.lang.Boolean isEnabled();
    
    java.lang.String getEmail();
    
    java.lang.String getPassword();
    
    java.lang.String getSalt();
    
    java.lang.String getDomainid();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     */
    UserKey getKey();

}

