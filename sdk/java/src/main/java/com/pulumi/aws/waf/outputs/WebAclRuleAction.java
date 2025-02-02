// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclRuleAction {
    /**
     * @return Specifies how you want AWS WAF to respond to requests that don&#39;t match the criteria in any of the `rules`.
     * e.g., `ALLOW` or `BLOCK`
     * 
     */
    private String type;

    private WebAclRuleAction() {}
    /**
     * @return Specifies how you want AWS WAF to respond to requests that don&#39;t match the criteria in any of the `rules`.
     * e.g., `ALLOW` or `BLOCK`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        public Builder() {}
        public Builder(WebAclRuleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public WebAclRuleAction build() {
            final var o = new WebAclRuleAction();
            o.type = type;
            return o;
        }
    }
}
