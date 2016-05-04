package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>authorization-schema</b>
 * <br>(Source path: <i>META-INF/yang/authorization-schema.yang</i>):
 * <pre>
 * rpc req-authorization {
 *     "Check Authorization for a given combination of action and role.
 *           A not-authorized  will be returned if unsuccessful.";
 *     input {
 *         leaf domain-name {
 *             type domain-type;
 *         }
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
 *     }
 *     
 *     output {
 *         leaf authorization-response {
 *             type authorization-response-type;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface AuthorizationSchemaService
    extends
    RpcService
{




    /**
     * Check Authorization for a given combination of action and role. A not-authorized
     * will be returned if unsuccessful.
     *
     */
    Future<RpcResult<ReqAuthorizationOutput>> reqAuthorization(ReqAuthorizationInput input);

}

