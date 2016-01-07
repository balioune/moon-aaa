package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;authorization-schema&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/authorization-schema.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container output {
 *     leaf authorization-response {
 *         type authorization-response-type;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;authorization-schema/req-authorization/output&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationOutputBuilder
 *
 */
public interface ReqAuthorizationOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authz:ds","2014-07-22","output"));

    AuthorizationResponseType getAuthorizationResponse();

}

