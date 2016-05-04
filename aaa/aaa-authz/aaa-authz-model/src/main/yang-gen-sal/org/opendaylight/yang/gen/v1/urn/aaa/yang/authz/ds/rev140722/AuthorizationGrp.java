package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.authorization.grp.Policies;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>authorization-schema</b>
 * <br>(Source path: <i>META-INF/yang/authorization-schema.yang</i>):
 * <pre>
 * grouping authorization-grp {
 *     list policies {
 *         key "service"
 *         leaf service {
 *             type service-type;
 *         }
 *         leaf action {
 *             type action-type;
 *         }
 *         leaf resource {
 *             type resource-type;
 *         }
 *         leaf role {
 *             type role-type;
 *         }
 *         leaf authorization {
 *             type authorization-response-type;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>authorization-schema/authorization-grp</i>
 *
 */
public interface AuthorizationGrp
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:aaa:yang:authz:ds",
        "2014-07-22", "authorization-grp").intern();

    List<Policies> getPolicies();

}

