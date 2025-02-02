// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoScalingConfigurationVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoScalingConfigurationVersionArgs Empty = new AutoScalingConfigurationVersionArgs();

    /**
     * Name of the auto scaling configuration.
     * 
     */
    @Import(name="autoScalingConfigurationName", required=true)
    private Output<String> autoScalingConfigurationName;

    /**
     * @return Name of the auto scaling configuration.
     * 
     */
    public Output<String> autoScalingConfigurationName() {
        return this.autoScalingConfigurationName;
    }

    /**
     * Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
     * 
     */
    @Import(name="maxConcurrency")
    private @Nullable Output<Integer> maxConcurrency;

    /**
     * @return Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
     * 
     */
    public Optional<Output<Integer>> maxConcurrency() {
        return Optional.ofNullable(this.maxConcurrency);
    }

    /**
     * Maximal number of instances that App Runner provisions for your service.
     * 
     */
    @Import(name="maxSize")
    private @Nullable Output<Integer> maxSize;

    /**
     * @return Maximal number of instances that App Runner provisions for your service.
     * 
     */
    public Optional<Output<Integer>> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }

    /**
     * Minimal number of instances that App Runner provisions for your service.
     * 
     */
    @Import(name="minSize")
    private @Nullable Output<Integer> minSize;

    /**
     * @return Minimal number of instances that App Runner provisions for your service.
     * 
     */
    public Optional<Output<Integer>> minSize() {
        return Optional.ofNullable(this.minSize);
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private AutoScalingConfigurationVersionArgs() {}

    private AutoScalingConfigurationVersionArgs(AutoScalingConfigurationVersionArgs $) {
        this.autoScalingConfigurationName = $.autoScalingConfigurationName;
        this.maxConcurrency = $.maxConcurrency;
        this.maxSize = $.maxSize;
        this.minSize = $.minSize;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoScalingConfigurationVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoScalingConfigurationVersionArgs $;

        public Builder() {
            $ = new AutoScalingConfigurationVersionArgs();
        }

        public Builder(AutoScalingConfigurationVersionArgs defaults) {
            $ = new AutoScalingConfigurationVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoScalingConfigurationName Name of the auto scaling configuration.
         * 
         * @return builder
         * 
         */
        public Builder autoScalingConfigurationName(Output<String> autoScalingConfigurationName) {
            $.autoScalingConfigurationName = autoScalingConfigurationName;
            return this;
        }

        /**
         * @param autoScalingConfigurationName Name of the auto scaling configuration.
         * 
         * @return builder
         * 
         */
        public Builder autoScalingConfigurationName(String autoScalingConfigurationName) {
            return autoScalingConfigurationName(Output.of(autoScalingConfigurationName));
        }

        /**
         * @param maxConcurrency Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrency(@Nullable Output<Integer> maxConcurrency) {
            $.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * @param maxConcurrency Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrency(Integer maxConcurrency) {
            return maxConcurrency(Output.of(maxConcurrency));
        }

        /**
         * @param maxSize Maximal number of instances that App Runner provisions for your service.
         * 
         * @return builder
         * 
         */
        public Builder maxSize(@Nullable Output<Integer> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        /**
         * @param maxSize Maximal number of instances that App Runner provisions for your service.
         * 
         * @return builder
         * 
         */
        public Builder maxSize(Integer maxSize) {
            return maxSize(Output.of(maxSize));
        }

        /**
         * @param minSize Minimal number of instances that App Runner provisions for your service.
         * 
         * @return builder
         * 
         */
        public Builder minSize(@Nullable Output<Integer> minSize) {
            $.minSize = minSize;
            return this;
        }

        /**
         * @param minSize Minimal number of instances that App Runner provisions for your service.
         * 
         * @return builder
         * 
         */
        public Builder minSize(Integer minSize) {
            return minSize(Output.of(minSize));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public AutoScalingConfigurationVersionArgs build() {
            $.autoScalingConfigurationName = Objects.requireNonNull($.autoScalingConfigurationName, "expected parameter 'autoScalingConfigurationName' to be non-null");
            return $;
        }
    }

}
