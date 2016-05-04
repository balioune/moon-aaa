package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.Tokencache;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>aaa-authn-model</b>
 * <br>(Source path: <i>META-INF/yang/aaa-authn-model.yang</i>):
 * <pre>
 * list claims {
 *     key "token"
 *     leaf token {
 *         type string;
 *     }
 *     leaf clientId {
 *         type string;
 *     }
 *     leaf userId {
 *         type string;
 *     }
 *     leaf user {
 *         type string;
 *     }
 *     leaf domain {
 *         type string;
 *     }
 *     leaf-list roles {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>aaa-authn-model/tokencache/claims</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.ClaimsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.ClaimsBuilder
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.ClaimsKey
 *
 */
public interface Claims
    extends
    ChildOf<Tokencache>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims>,
    Identifiable<ClaimsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authn:claims",
        "2014-10-29", "claims").intern();

    /**
     * Token
     *
     */
    java.lang.String getToken();
    
    /**
     * id of the authorized client, or null if anonymous
     *
     */
    java.lang.String getClientId();
    
    /**
     * Unique user-id. User IDs are system-created
     *
     */
    java.lang.String getUserId();
    
    /**
     * User name
     *
     */
    java.lang.String getUser();
    
    /**
     * Fully-qualified domain name
     *
     */
    java.lang.String getDomain();
    
    /**
     * Assigned user roles
     *
     */
    List<java.lang.String> getRoles();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     */
    ClaimsKey getKey();

}

