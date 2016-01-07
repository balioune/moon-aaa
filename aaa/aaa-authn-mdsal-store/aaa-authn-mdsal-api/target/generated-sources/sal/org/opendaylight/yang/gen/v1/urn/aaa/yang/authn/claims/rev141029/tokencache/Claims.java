package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.Tokencache;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;aaa-authn-model&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/aaa-authn-model.yang&lt;/i&gt;):
 * &lt;pre&gt;
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
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;aaa-authn-model/tokencache/claims&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.ClaimsBuilder}.
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



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authn:claims","2014-10-29","claims"));

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

