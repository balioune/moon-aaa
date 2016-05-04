package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>authorization-schema</b>
 * <br>(Source path: <i>META-INF/yang/authorization-schema.yang</i>):
 * <pre>
 * container output {
 *     leaf authorization-response {
 *         type authorization-response-type;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>authorization-schema/req-authorization/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationOutputBuilder
 *
 */
public interface ReqAuthorizationOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authz:ds",
        "2014-07-22", "output").intern();

    AuthorizationResponseType getAuthorizationResponse();

}

