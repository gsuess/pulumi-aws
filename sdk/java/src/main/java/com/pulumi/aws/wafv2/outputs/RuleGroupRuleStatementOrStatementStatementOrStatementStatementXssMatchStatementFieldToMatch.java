// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookies;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchHeader;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchJsonBody;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch {
    /**
     * @return Inspect all query arguments.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody body;
    /**
     * @return Inspect the cookies in the web request. See Cookies below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookies cookies;
    /**
     * @return Inspect the request headers. See Headers below for details.
     * 
     */
    private @Nullable List<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchHeader> headers;
    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchJsonBody jsonBody;
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod method;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString queryString;
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath uriPath;

    private RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch() {}
    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Inspect the cookies in the web request. See Cookies below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookies> cookies() {
        return Optional.ofNullable(this.cookies);
    }
    /**
     * @return Inspect the request headers. See Headers below for details.
     * 
     */
    public List<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchJsonBody> jsonBody() {
        return Optional.ofNullable(this.jsonBody);
    }
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody body;
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookies cookies;
        private @Nullable List<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchHeader> headers;
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchJsonBody jsonBody;
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod method;
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString queryString;
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath uriPath;
        public Builder() {}
        public Builder(RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.cookies = defaults.cookies;
    	      this.headers = defaults.headers;
    	      this.jsonBody = defaults.jsonBody;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        @CustomType.Setter
        public Builder allQueryArguments(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        @CustomType.Setter
        public Builder body(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder cookies(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookies cookies) {
            this.cookies = cookies;
            return this;
        }
        @CustomType.Setter
        public Builder headers(@Nullable List<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchHeader> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchHeader... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder jsonBody(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchJsonBody jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder queryString(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        @CustomType.Setter
        public Builder singleHeader(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        @CustomType.Setter
        public Builder singleQueryArgument(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        @CustomType.Setter
        public Builder uriPath(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch build() {
            final var o = new RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch();
            o.allQueryArguments = allQueryArguments;
            o.body = body;
            o.cookies = cookies;
            o.headers = headers;
            o.jsonBody = jsonBody;
            o.method = method;
            o.queryString = queryString;
            o.singleHeader = singleHeader;
            o.singleQueryArgument = singleQueryArgument;
            o.uriPath = uriPath;
            return o;
        }
    }
}
