// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafRegional.Inputs
{

    public sealed class RuleGroupActivatedRuleActionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// e.g., `BLOCK`, `ALLOW`, or `COUNT`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public RuleGroupActivatedRuleActionArgs()
        {
        }
        public static new RuleGroupActivatedRuleActionArgs Empty => new RuleGroupActivatedRuleActionArgs();
    }
}
