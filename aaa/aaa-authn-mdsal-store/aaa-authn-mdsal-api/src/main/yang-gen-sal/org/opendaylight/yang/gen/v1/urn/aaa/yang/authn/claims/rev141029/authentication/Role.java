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
 * list role {
 *     key "roleid"
 *     leaf roleid {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf domainid {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>aaa-authn-model/authentication/role</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.RoleBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.RoleBuilder
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.RoleKey
 *
 */
public interface Role
    extends
    ChildOf<Authentication>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.Role>,
    Identifiable<RoleKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authn:claims",
        "2014-10-29", "role").intern();

    java.lang.String getRoleid();
    
    java.lang.String getName();
    
    java.lang.String getDescription();
    
    java.lang.String getDomainid();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     */
    RoleKey getKey();

}

