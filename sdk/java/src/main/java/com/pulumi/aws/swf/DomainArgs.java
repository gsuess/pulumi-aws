// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.swf;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * The domain description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The domain description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the domain. If omitted, this provider will assign a random, unique name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the domain. If omitted, this provider will assign a random, unique name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    /**
     * Length of time that SWF will continue to retain information about the workflow execution after the workflow execution is complete, must be between 0 and 90 days.
     * 
     */
    @Import(name="workflowExecutionRetentionPeriodInDays", required=true)
    private Output<String> workflowExecutionRetentionPeriodInDays;

    /**
     * @return Length of time that SWF will continue to retain information about the workflow execution after the workflow execution is complete, must be between 0 and 90 days.
     * 
     */
    public Output<String> workflowExecutionRetentionPeriodInDays() {
        return this.workflowExecutionRetentionPeriodInDays;
    }

    private DomainArgs() {}

    private DomainArgs(DomainArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.workflowExecutionRetentionPeriodInDays = $.workflowExecutionRetentionPeriodInDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainArgs $;

        public Builder() {
            $ = new DomainArgs();
        }

        public Builder(DomainArgs defaults) {
            $ = new DomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The domain description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The domain description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the domain. If omitted, this provider will assign a random, unique name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the domain. If omitted, this provider will assign a random, unique name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        /**
         * @param workflowExecutionRetentionPeriodInDays Length of time that SWF will continue to retain information about the workflow execution after the workflow execution is complete, must be between 0 and 90 days.
         * 
         * @return builder
         * 
         */
        public Builder workflowExecutionRetentionPeriodInDays(Output<String> workflowExecutionRetentionPeriodInDays) {
            $.workflowExecutionRetentionPeriodInDays = workflowExecutionRetentionPeriodInDays;
            return this;
        }

        /**
         * @param workflowExecutionRetentionPeriodInDays Length of time that SWF will continue to retain information about the workflow execution after the workflow execution is complete, must be between 0 and 90 days.
         * 
         * @return builder
         * 
         */
        public Builder workflowExecutionRetentionPeriodInDays(String workflowExecutionRetentionPeriodInDays) {
            return workflowExecutionRetentionPeriodInDays(Output.of(workflowExecutionRetentionPeriodInDays));
        }

        public DomainArgs build() {
            $.workflowExecutionRetentionPeriodInDays = Objects.requireNonNull($.workflowExecutionRetentionPeriodInDays, "expected parameter 'workflowExecutionRetentionPeriodInDays' to be non-null");
            return $;
        }
    }

}
