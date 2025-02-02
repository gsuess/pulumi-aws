// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sesv2;

import com.pulumi.aws.sesv2.inputs.ConfigurationSetDeliveryOptionsArgs;
import com.pulumi.aws.sesv2.inputs.ConfigurationSetReputationOptionsArgs;
import com.pulumi.aws.sesv2.inputs.ConfigurationSetSendingOptionsArgs;
import com.pulumi.aws.sesv2.inputs.ConfigurationSetSuppressionOptionsArgs;
import com.pulumi.aws.sesv2.inputs.ConfigurationSetTrackingOptionsArgs;
import com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationSetArgs Empty = new ConfigurationSetArgs();

    /**
     * The name of the configuration set.
     * 
     */
    @Import(name="configurationSetName", required=true)
    private Output<String> configurationSetName;

    /**
     * @return The name of the configuration set.
     * 
     */
    public Output<String> configurationSetName() {
        return this.configurationSetName;
    }

    /**
     * An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set.
     * 
     */
    @Import(name="deliveryOptions")
    private @Nullable Output<ConfigurationSetDeliveryOptionsArgs> deliveryOptions;

    /**
     * @return An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set.
     * 
     */
    public Optional<Output<ConfigurationSetDeliveryOptionsArgs>> deliveryOptions() {
        return Optional.ofNullable(this.deliveryOptions);
    }

    /**
     * An object that defines whether or not Amazon SES collects reputation metrics for the emails that you send that use the configuration set.
     * 
     */
    @Import(name="reputationOptions")
    private @Nullable Output<ConfigurationSetReputationOptionsArgs> reputationOptions;

    /**
     * @return An object that defines whether or not Amazon SES collects reputation metrics for the emails that you send that use the configuration set.
     * 
     */
    public Optional<Output<ConfigurationSetReputationOptionsArgs>> reputationOptions() {
        return Optional.ofNullable(this.reputationOptions);
    }

    /**
     * An object that defines whether or not Amazon SES can send email that you send using the configuration set.
     * 
     */
    @Import(name="sendingOptions")
    private @Nullable Output<ConfigurationSetSendingOptionsArgs> sendingOptions;

    /**
     * @return An object that defines whether or not Amazon SES can send email that you send using the configuration set.
     * 
     */
    public Optional<Output<ConfigurationSetSendingOptionsArgs>> sendingOptions() {
        return Optional.ofNullable(this.sendingOptions);
    }

    /**
     * An object that contains information about the suppression list preferences for your account.
     * 
     */
    @Import(name="suppressionOptions")
    private @Nullable Output<ConfigurationSetSuppressionOptionsArgs> suppressionOptions;

    /**
     * @return An object that contains information about the suppression list preferences for your account.
     * 
     */
    public Optional<Output<ConfigurationSetSuppressionOptionsArgs>> suppressionOptions() {
        return Optional.ofNullable(this.suppressionOptions);
    }

    /**
     * A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * An object that defines the open and click tracking options for emails that you send using the configuration set.
     * 
     */
    @Import(name="trackingOptions")
    private @Nullable Output<ConfigurationSetTrackingOptionsArgs> trackingOptions;

    /**
     * @return An object that defines the open and click tracking options for emails that you send using the configuration set.
     * 
     */
    public Optional<Output<ConfigurationSetTrackingOptionsArgs>> trackingOptions() {
        return Optional.ofNullable(this.trackingOptions);
    }

    /**
     * An object that defines the VDM settings that apply to emails that you send using the configuration set.
     * 
     */
    @Import(name="vdmOptions")
    private @Nullable Output<ConfigurationSetVdmOptionsArgs> vdmOptions;

    /**
     * @return An object that defines the VDM settings that apply to emails that you send using the configuration set.
     * 
     */
    public Optional<Output<ConfigurationSetVdmOptionsArgs>> vdmOptions() {
        return Optional.ofNullable(this.vdmOptions);
    }

    private ConfigurationSetArgs() {}

    private ConfigurationSetArgs(ConfigurationSetArgs $) {
        this.configurationSetName = $.configurationSetName;
        this.deliveryOptions = $.deliveryOptions;
        this.reputationOptions = $.reputationOptions;
        this.sendingOptions = $.sendingOptions;
        this.suppressionOptions = $.suppressionOptions;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.trackingOptions = $.trackingOptions;
        this.vdmOptions = $.vdmOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationSetArgs $;

        public Builder() {
            $ = new ConfigurationSetArgs();
        }

        public Builder(ConfigurationSetArgs defaults) {
            $ = new ConfigurationSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationSetName The name of the configuration set.
         * 
         * @return builder
         * 
         */
        public Builder configurationSetName(Output<String> configurationSetName) {
            $.configurationSetName = configurationSetName;
            return this;
        }

        /**
         * @param configurationSetName The name of the configuration set.
         * 
         * @return builder
         * 
         */
        public Builder configurationSetName(String configurationSetName) {
            return configurationSetName(Output.of(configurationSetName));
        }

        /**
         * @param deliveryOptions An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set.
         * 
         * @return builder
         * 
         */
        public Builder deliveryOptions(@Nullable Output<ConfigurationSetDeliveryOptionsArgs> deliveryOptions) {
            $.deliveryOptions = deliveryOptions;
            return this;
        }

        /**
         * @param deliveryOptions An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set.
         * 
         * @return builder
         * 
         */
        public Builder deliveryOptions(ConfigurationSetDeliveryOptionsArgs deliveryOptions) {
            return deliveryOptions(Output.of(deliveryOptions));
        }

        /**
         * @param reputationOptions An object that defines whether or not Amazon SES collects reputation metrics for the emails that you send that use the configuration set.
         * 
         * @return builder
         * 
         */
        public Builder reputationOptions(@Nullable Output<ConfigurationSetReputationOptionsArgs> reputationOptions) {
            $.reputationOptions = reputationOptions;
            return this;
        }

        /**
         * @param reputationOptions An object that defines whether or not Amazon SES collects reputation metrics for the emails that you send that use the configuration set.
         * 
         * @return builder
         * 
         */
        public Builder reputationOptions(ConfigurationSetReputationOptionsArgs reputationOptions) {
            return reputationOptions(Output.of(reputationOptions));
        }

        /**
         * @param sendingOptions An object that defines whether or not Amazon SES can send email that you send using the configuration set.
         * 
         * @return builder
         * 
         */
        public Builder sendingOptions(@Nullable Output<ConfigurationSetSendingOptionsArgs> sendingOptions) {
            $.sendingOptions = sendingOptions;
            return this;
        }

        /**
         * @param sendingOptions An object that defines whether or not Amazon SES can send email that you send using the configuration set.
         * 
         * @return builder
         * 
         */
        public Builder sendingOptions(ConfigurationSetSendingOptionsArgs sendingOptions) {
            return sendingOptions(Output.of(sendingOptions));
        }

        /**
         * @param suppressionOptions An object that contains information about the suppression list preferences for your account.
         * 
         * @return builder
         * 
         */
        public Builder suppressionOptions(@Nullable Output<ConfigurationSetSuppressionOptionsArgs> suppressionOptions) {
            $.suppressionOptions = suppressionOptions;
            return this;
        }

        /**
         * @param suppressionOptions An object that contains information about the suppression list preferences for your account.
         * 
         * @return builder
         * 
         */
        public Builder suppressionOptions(ConfigurationSetSuppressionOptionsArgs suppressionOptions) {
            return suppressionOptions(Output.of(suppressionOptions));
        }

        /**
         * @param tags A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param trackingOptions An object that defines the open and click tracking options for emails that you send using the configuration set.
         * 
         * @return builder
         * 
         */
        public Builder trackingOptions(@Nullable Output<ConfigurationSetTrackingOptionsArgs> trackingOptions) {
            $.trackingOptions = trackingOptions;
            return this;
        }

        /**
         * @param trackingOptions An object that defines the open and click tracking options for emails that you send using the configuration set.
         * 
         * @return builder
         * 
         */
        public Builder trackingOptions(ConfigurationSetTrackingOptionsArgs trackingOptions) {
            return trackingOptions(Output.of(trackingOptions));
        }

        /**
         * @param vdmOptions An object that defines the VDM settings that apply to emails that you send using the configuration set.
         * 
         * @return builder
         * 
         */
        public Builder vdmOptions(@Nullable Output<ConfigurationSetVdmOptionsArgs> vdmOptions) {
            $.vdmOptions = vdmOptions;
            return this;
        }

        /**
         * @param vdmOptions An object that defines the VDM settings that apply to emails that you send using the configuration set.
         * 
         * @return builder
         * 
         */
        public Builder vdmOptions(ConfigurationSetVdmOptionsArgs vdmOptions) {
            return vdmOptions(Output.of(vdmOptions));
        }

        public ConfigurationSetArgs build() {
            $.configurationSetName = Objects.requireNonNull($.configurationSetName, "expected parameter 'configurationSetName' to be non-null");
            return $;
        }
    }

}
