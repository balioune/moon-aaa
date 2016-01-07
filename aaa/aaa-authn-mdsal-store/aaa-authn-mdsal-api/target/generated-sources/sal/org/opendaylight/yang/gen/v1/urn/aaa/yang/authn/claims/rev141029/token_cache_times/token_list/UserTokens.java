package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.token_cache_times.token_list;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.token_cache_times.TokenList;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;aaa-authn-model&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/aaa-authn-model.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * list user_tokens {
 *     key "tokenid"
 *     leaf tokenid {
 *         type leafref;
 *     }
 *     leaf timestamp {
 *         type uint64;
 *     }
 *     leaf expiration {
 *         type int64;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;aaa-authn-model/token_cache_times/token_list/user_tokens&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.token_cache_times.token_list.UserTokensBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.token_cache_times.token_list.UserTokensBuilder
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.token_cache_times.token_list.UserTokensKey
 *
 */
public interface UserTokens
    extends
    ChildOf<TokenList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.token_cache_times.token_list.UserTokens>,
    Identifiable<UserTokensKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authn:claims","2014-10-29","user_tokens"));

    java.lang.String getTokenid();
    
    BigInteger getTimestamp();
    
    /**
     * Expiration milliseconds since start of UTC epoch
     *
     */
    java.lang.Long getExpiration();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     */
    UserTokensKey getKey();

}

