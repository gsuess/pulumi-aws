// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codeartifact;

import com.pulumi.aws.codeartifact.inputs.RepositoryExternalConnectionsArgs;
import com.pulumi.aws.codeartifact.inputs.RepositoryUpstreamArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryArgs Empty = new RepositoryArgs();

    /**
     * The description of the repository.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the repository.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The domain that contains the created repository.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The domain that contains the created repository.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The account number of the AWS account that owns the domain.
     * 
     */
    @Import(name="domainOwner")
    private @Nullable Output<String> domainOwner;

    /**
     * @return The account number of the AWS account that owns the domain.
     * 
     */
    public Optional<Output<String>> domainOwner() {
        return Optional.ofNullable(this.domainOwner);
    }

    /**
     * An array of external connections associated with the repository. Only one external connection can be set per repository. see External Connections.
     * 
     */
    @Import(name="externalConnections")
    private @Nullable Output<RepositoryExternalConnectionsArgs> externalConnections;

    /**
     * @return An array of external connections associated with the repository. Only one external connection can be set per repository. see External Connections.
     * 
     */
    public Optional<Output<RepositoryExternalConnectionsArgs>> externalConnections() {
        return Optional.ofNullable(this.externalConnections);
    }

    /**
     * The name of the repository to create.
     * 
     */
    @Import(name="repository", required=true)
    private Output<String> repository;

    /**
     * @return The name of the repository to create.
     * 
     */
    public Output<String> repository() {
        return this.repository;
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
     * A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
     * 
     */
    @Import(name="upstreams")
    private @Nullable Output<List<RepositoryUpstreamArgs>> upstreams;

    /**
     * @return A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
     * 
     */
    public Optional<Output<List<RepositoryUpstreamArgs>>> upstreams() {
        return Optional.ofNullable(this.upstreams);
    }

    private RepositoryArgs() {}

    private RepositoryArgs(RepositoryArgs $) {
        this.description = $.description;
        this.domain = $.domain;
        this.domainOwner = $.domainOwner;
        this.externalConnections = $.externalConnections;
        this.repository = $.repository;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.upstreams = $.upstreams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryArgs $;

        public Builder() {
            $ = new RepositoryArgs();
        }

        public Builder(RepositoryArgs defaults) {
            $ = new RepositoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the repository.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the repository.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param domain The domain that contains the created repository.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain that contains the created repository.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param domainOwner The account number of the AWS account that owns the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainOwner(@Nullable Output<String> domainOwner) {
            $.domainOwner = domainOwner;
            return this;
        }

        /**
         * @param domainOwner The account number of the AWS account that owns the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainOwner(String domainOwner) {
            return domainOwner(Output.of(domainOwner));
        }

        /**
         * @param externalConnections An array of external connections associated with the repository. Only one external connection can be set per repository. see External Connections.
         * 
         * @return builder
         * 
         */
        public Builder externalConnections(@Nullable Output<RepositoryExternalConnectionsArgs> externalConnections) {
            $.externalConnections = externalConnections;
            return this;
        }

        /**
         * @param externalConnections An array of external connections associated with the repository. Only one external connection can be set per repository. see External Connections.
         * 
         * @return builder
         * 
         */
        public Builder externalConnections(RepositoryExternalConnectionsArgs externalConnections) {
            return externalConnections(Output.of(externalConnections));
        }

        /**
         * @param repository The name of the repository to create.
         * 
         * @return builder
         * 
         */
        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository The name of the repository to create.
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
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
         * @param upstreams A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
         * 
         * @return builder
         * 
         */
        public Builder upstreams(@Nullable Output<List<RepositoryUpstreamArgs>> upstreams) {
            $.upstreams = upstreams;
            return this;
        }

        /**
         * @param upstreams A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
         * 
         * @return builder
         * 
         */
        public Builder upstreams(List<RepositoryUpstreamArgs> upstreams) {
            return upstreams(Output.of(upstreams));
        }

        /**
         * @param upstreams A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
         * 
         * @return builder
         * 
         */
        public Builder upstreams(RepositoryUpstreamArgs... upstreams) {
            return upstreams(List.of(upstreams));
        }

        public RepositoryArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.repository = Objects.requireNonNull($.repository, "expected parameter 'repository' to be non-null");
            return $;
        }
    }

}
