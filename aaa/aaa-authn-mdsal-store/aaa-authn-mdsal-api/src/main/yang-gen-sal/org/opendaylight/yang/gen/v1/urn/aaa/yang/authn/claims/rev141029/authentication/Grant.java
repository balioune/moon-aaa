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
 * list grant {
 *     key "grantid"
 *     leaf grantid {
 *         type string;
 *     }
 *     leaf domainid {
 *         type string;
 *     }
 *     leaf userid {
 *         type string;
 *     }
 *     leaf roleid {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>aaa-authn-model/authentication/grant</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.GrantBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.GrantBuilder
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.GrantKey
 *
 */
public interface Grant
    extends
    ChildOf<Authentication>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.Grant>,
    Identifiable<GrantKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authn:claims",
        "2014-10-29", "grant").intern();

    java.lang.String getGrantid();
    
    java.lang.String getDomainid();
    
    java.lang.String getUserid();
    
    java.lang.String getRoleid();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     */
    GrantKey getKey();

}

