// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.identitystore.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupExternalId {
    /**
     * @return The identifier issued to this resource by an external identity provider.
     * 
     */
    private String id;
    /**
     * @return The issuer for an external identifier.
     * 
     */
    private String issuer;

    private GetGroupExternalId() {}
    /**
     * @return The identifier issued to this resource by an external identity provider.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The issuer for an external identifier.
     * 
     */
    public String issuer() {
        return this.issuer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupExternalId defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String issuer;
        public Builder() {}
        public Builder(GetGroupExternalId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.issuer = defaults.issuer;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public GetGroupExternalId build() {
            final var o = new GetGroupExternalId();
            o.id = id;
            o.issuer = issuer;
            return o;
        }
    }
}
