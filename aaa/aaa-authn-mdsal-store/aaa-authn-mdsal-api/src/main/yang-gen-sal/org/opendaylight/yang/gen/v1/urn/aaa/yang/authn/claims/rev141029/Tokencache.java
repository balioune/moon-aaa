package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>aaa-authn-model</b>
 * <br>(Source path: <i>META-INF/yang/aaa-authn-model.yang</i>):
 * <pre>
 * container tokencache {
 *     list claims {
 *         key "token"
 *         leaf token {
 *             type string;
 *         }
 *         leaf clientId {
 *             type string;
 *         }
 *         leaf userId {
 *             type string;
 *         }
 *         leaf user {
 *             type string;
 *         }
 *         leaf domain {
 *             type string;
 *         }
 *         leaf-list roles {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>aaa-authn-model/tokencache</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.TokencacheBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.TokencacheBuilder
 *
 */
public interface Tokencache
    extends
    ChildOf<AaaAuthnModelData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.Tokencache>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authn:claims",
        "2014-10-29", "tokencache").intern();

    List<Claims> getClaims();

}

