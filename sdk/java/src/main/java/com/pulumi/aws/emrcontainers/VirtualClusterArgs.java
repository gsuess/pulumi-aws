// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emrcontainers;

import com.pulumi.aws.emrcontainers.inputs.VirtualClusterContainerProviderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualClusterArgs Empty = new VirtualClusterArgs();

    /**
     * Configuration block for the container provider associated with your cluster.
     * 
     */
    @Import(name="containerProvider", required=true)
    private Output<VirtualClusterContainerProviderArgs> containerProvider;

    /**
     * @return Configuration block for the container provider associated with your cluster.
     * 
     */
    public Output<VirtualClusterContainerProviderArgs> containerProvider() {
        return this.containerProvider;
    }

    /**
     * Name of the virtual cluster.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the virtual cluster.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
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

    private VirtualClusterArgs() {}

    private VirtualClusterArgs(VirtualClusterArgs $) {
        this.containerProvider = $.containerProvider;
        this.name = $.name;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualClusterArgs $;

        public Builder() {
            $ = new VirtualClusterArgs();
        }

        public Builder(VirtualClusterArgs defaults) {
            $ = new VirtualClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerProvider Configuration block for the container provider associated with your cluster.
         * 
         * @return builder
         * 
         */
        public Builder containerProvider(Output<VirtualClusterContainerProviderArgs> containerProvider) {
            $.containerProvider = containerProvider;
            return this;
        }

        /**
         * @param containerProvider Configuration block for the container provider associated with your cluster.
         * 
         * @return builder
         * 
         */
        public Builder containerProvider(VirtualClusterContainerProviderArgs containerProvider) {
            return containerProvider(Output.of(containerProvider));
        }

        /**
         * @param name Name of the virtual cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the virtual cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
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

        public VirtualClusterArgs build() {
            $.containerProvider = Objects.requireNonNull($.containerProvider, "expected parameter 'containerProvider' to be non-null");
            return $;
        }
    }

}
