// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudsearch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainServiceAccessPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final DomainServiceAccessPolicyState Empty = new DomainServiceAccessPolicyState();

    /**
     * The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
     * 
     */
    @Import(name="accessPolicy")
    private @Nullable Output<String> accessPolicy;

    /**
     * @return The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
     * 
     */
    public Optional<Output<String>> accessPolicy() {
        return Optional.ofNullable(this.accessPolicy);
    }

    /**
     * The CloudSearch domain name the policy applies to.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The CloudSearch domain name the policy applies to.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    private DomainServiceAccessPolicyState() {}

    private DomainServiceAccessPolicyState(DomainServiceAccessPolicyState $) {
        this.accessPolicy = $.accessPolicy;
        this.domainName = $.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainServiceAccessPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainServiceAccessPolicyState $;

        public Builder() {
            $ = new DomainServiceAccessPolicyState();
        }

        public Builder(DomainServiceAccessPolicyState defaults) {
            $ = new DomainServiceAccessPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicy The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicy(@Nullable Output<String> accessPolicy) {
            $.accessPolicy = accessPolicy;
            return this;
        }

        /**
         * @param accessPolicy The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicy(String accessPolicy) {
            return accessPolicy(Output.of(accessPolicy));
        }

        /**
         * @param domainName The CloudSearch domain name the policy applies to.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The CloudSearch domain name the policy applies to.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        public DomainServiceAccessPolicyState build() {
            return $;
        }
    }

}
