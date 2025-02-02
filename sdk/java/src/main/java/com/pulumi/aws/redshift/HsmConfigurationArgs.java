// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HsmConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final HsmConfigurationArgs Empty = new HsmConfigurationArgs();

    /**
     * A text description of the HSM configuration to be created.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return A text description of the HSM configuration to be created.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * The identifier to be assigned to the new Amazon Redshift HSM configuration.
     * 
     */
    @Import(name="hsmConfigurationIdentifier", required=true)
    private Output<String> hsmConfigurationIdentifier;

    /**
     * @return The identifier to be assigned to the new Amazon Redshift HSM configuration.
     * 
     */
    public Output<String> hsmConfigurationIdentifier() {
        return this.hsmConfigurationIdentifier;
    }

    /**
     * The IP address that the Amazon Redshift cluster must use to access the HSM.
     * 
     */
    @Import(name="hsmIpAddress", required=true)
    private Output<String> hsmIpAddress;

    /**
     * @return The IP address that the Amazon Redshift cluster must use to access the HSM.
     * 
     */
    public Output<String> hsmIpAddress() {
        return this.hsmIpAddress;
    }

    /**
     * The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
     * 
     */
    @Import(name="hsmPartitionName", required=true)
    private Output<String> hsmPartitionName;

    /**
     * @return The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
     * 
     */
    public Output<String> hsmPartitionName() {
        return this.hsmPartitionName;
    }

    /**
     * The password required to access the HSM partition.
     * 
     */
    @Import(name="hsmPartitionPassword", required=true)
    private Output<String> hsmPartitionPassword;

    /**
     * @return The password required to access the HSM partition.
     * 
     */
    public Output<String> hsmPartitionPassword() {
        return this.hsmPartitionPassword;
    }

    /**
     * The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
     * 
     */
    @Import(name="hsmServerPublicCertificate", required=true)
    private Output<String> hsmServerPublicCertificate;

    /**
     * @return The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
     * 
     */
    public Output<String> hsmServerPublicCertificate() {
        return this.hsmServerPublicCertificate;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private HsmConfigurationArgs() {}

    private HsmConfigurationArgs(HsmConfigurationArgs $) {
        this.description = $.description;
        this.hsmConfigurationIdentifier = $.hsmConfigurationIdentifier;
        this.hsmIpAddress = $.hsmIpAddress;
        this.hsmPartitionName = $.hsmPartitionName;
        this.hsmPartitionPassword = $.hsmPartitionPassword;
        this.hsmServerPublicCertificate = $.hsmServerPublicCertificate;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HsmConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HsmConfigurationArgs $;

        public Builder() {
            $ = new HsmConfigurationArgs();
        }

        public Builder(HsmConfigurationArgs defaults) {
            $ = new HsmConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A text description of the HSM configuration to be created.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A text description of the HSM configuration to be created.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param hsmConfigurationIdentifier The identifier to be assigned to the new Amazon Redshift HSM configuration.
         * 
         * @return builder
         * 
         */
        public Builder hsmConfigurationIdentifier(Output<String> hsmConfigurationIdentifier) {
            $.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
            return this;
        }

        /**
         * @param hsmConfigurationIdentifier The identifier to be assigned to the new Amazon Redshift HSM configuration.
         * 
         * @return builder
         * 
         */
        public Builder hsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
            return hsmConfigurationIdentifier(Output.of(hsmConfigurationIdentifier));
        }

        /**
         * @param hsmIpAddress The IP address that the Amazon Redshift cluster must use to access the HSM.
         * 
         * @return builder
         * 
         */
        public Builder hsmIpAddress(Output<String> hsmIpAddress) {
            $.hsmIpAddress = hsmIpAddress;
            return this;
        }

        /**
         * @param hsmIpAddress The IP address that the Amazon Redshift cluster must use to access the HSM.
         * 
         * @return builder
         * 
         */
        public Builder hsmIpAddress(String hsmIpAddress) {
            return hsmIpAddress(Output.of(hsmIpAddress));
        }

        /**
         * @param hsmPartitionName The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
         * 
         * @return builder
         * 
         */
        public Builder hsmPartitionName(Output<String> hsmPartitionName) {
            $.hsmPartitionName = hsmPartitionName;
            return this;
        }

        /**
         * @param hsmPartitionName The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
         * 
         * @return builder
         * 
         */
        public Builder hsmPartitionName(String hsmPartitionName) {
            return hsmPartitionName(Output.of(hsmPartitionName));
        }

        /**
         * @param hsmPartitionPassword The password required to access the HSM partition.
         * 
         * @return builder
         * 
         */
        public Builder hsmPartitionPassword(Output<String> hsmPartitionPassword) {
            $.hsmPartitionPassword = hsmPartitionPassword;
            return this;
        }

        /**
         * @param hsmPartitionPassword The password required to access the HSM partition.
         * 
         * @return builder
         * 
         */
        public Builder hsmPartitionPassword(String hsmPartitionPassword) {
            return hsmPartitionPassword(Output.of(hsmPartitionPassword));
        }

        /**
         * @param hsmServerPublicCertificate The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
         * 
         * @return builder
         * 
         */
        public Builder hsmServerPublicCertificate(Output<String> hsmServerPublicCertificate) {
            $.hsmServerPublicCertificate = hsmServerPublicCertificate;
            return this;
        }

        /**
         * @param hsmServerPublicCertificate The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
         * 
         * @return builder
         * 
         */
        public Builder hsmServerPublicCertificate(String hsmServerPublicCertificate) {
            return hsmServerPublicCertificate(Output.of(hsmServerPublicCertificate));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public HsmConfigurationArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.hsmConfigurationIdentifier = Objects.requireNonNull($.hsmConfigurationIdentifier, "expected parameter 'hsmConfigurationIdentifier' to be non-null");
            $.hsmIpAddress = Objects.requireNonNull($.hsmIpAddress, "expected parameter 'hsmIpAddress' to be non-null");
            $.hsmPartitionName = Objects.requireNonNull($.hsmPartitionName, "expected parameter 'hsmPartitionName' to be non-null");
            $.hsmPartitionPassword = Objects.requireNonNull($.hsmPartitionPassword, "expected parameter 'hsmPartitionPassword' to be non-null");
            $.hsmServerPublicCertificate = Objects.requireNonNull($.hsmServerPublicCertificate, "expected parameter 'hsmServerPublicCertificate' to be non-null");
            return $;
        }
    }

}
