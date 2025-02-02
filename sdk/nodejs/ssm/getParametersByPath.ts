// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides SSM Parameters by path.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const foo = aws.ssm.getParametersByPath({
 *     path: "/foo",
 * });
 * ```
 *
 * > **Note:** The data source is currently following the behavior of the [SSM API](https://docs.aws.amazon.com/sdk-for-go/api/service/ssm/#Parameter) to return a string value, regardless of parameter type. For type `StringList`, we can use the built-in split() function to get values in a list. Example: `split(",", data.aws_ssm_parameter.subnets.value)`
 */
export function getParametersByPath(args: GetParametersByPathArgs, opts?: pulumi.InvokeOptions): Promise<GetParametersByPathResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ssm/getParametersByPath:getParametersByPath", {
        "path": args.path,
        "recursive": args.recursive,
        "withDecryption": args.withDecryption,
    }, opts);
}

/**
 * A collection of arguments for invoking getParametersByPath.
 */
export interface GetParametersByPathArgs {
    /**
     * Prefix path of the parameter.
     */
    path: string;
    /**
     * Whether to recursively return parameters under `path`. Defaults to `false`.
     */
    recursive?: boolean;
    /**
     * Whether to return decrypted `SecureString` value. Defaults to `true`.
     */
    withDecryption?: boolean;
}

/**
 * A collection of values returned by getParametersByPath.
 */
export interface GetParametersByPathResult {
    readonly arns: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly names: string[];
    readonly path: string;
    readonly recursive?: boolean;
    readonly types: string[];
    readonly values: string[];
    readonly withDecryption?: boolean;
}
/**
 * Provides SSM Parameters by path.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const foo = aws.ssm.getParametersByPath({
 *     path: "/foo",
 * });
 * ```
 *
 * > **Note:** The data source is currently following the behavior of the [SSM API](https://docs.aws.amazon.com/sdk-for-go/api/service/ssm/#Parameter) to return a string value, regardless of parameter type. For type `StringList`, we can use the built-in split() function to get values in a list. Example: `split(",", data.aws_ssm_parameter.subnets.value)`
 */
export function getParametersByPathOutput(args: GetParametersByPathOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetParametersByPathResult> {
    return pulumi.output(args).apply((a: any) => getParametersByPath(a, opts))
}

/**
 * A collection of arguments for invoking getParametersByPath.
 */
export interface GetParametersByPathOutputArgs {
    /**
     * Prefix path of the parameter.
     */
    path: pulumi.Input<string>;
    /**
     * Whether to recursively return parameters under `path`. Defaults to `false`.
     */
    recursive?: pulumi.Input<boolean>;
    /**
     * Whether to return decrypted `SecureString` value. Defaults to `true`.
     */
    withDecryption?: pulumi.Input<boolean>;
}
