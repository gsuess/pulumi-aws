// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Fsx.Outputs
{

    [OutputType]
    public sealed class OntapVolumeTieringPolicy
    {
        public readonly int? CoolingPeriod;
        /// <summary>
        /// Specifies the tiering policy for the ONTAP volume for moving data to the capacity pool storage. Valid values are `SNAPSHOT_ONLY`, `AUTO`, `ALL`, `NONE`. Default value is `SNAPSHOT_ONLY`.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private OntapVolumeTieringPolicy(
            int? coolingPeriod,

            string? name)
        {
            CoolingPeriod = coolingPeriod;
            Name = name;
        }
    }
}
