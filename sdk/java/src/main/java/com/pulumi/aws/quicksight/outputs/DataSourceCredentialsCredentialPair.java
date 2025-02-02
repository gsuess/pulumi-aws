// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataSourceCredentialsCredentialPair {
    /**
     * @return Password, maximum length of 1024 characters.
     * 
     */
    private String password;
    /**
     * @return User name, maximum length of 64 characters.
     * 
     */
    private String username;

    private DataSourceCredentialsCredentialPair() {}
    /**
     * @return Password, maximum length of 1024 characters.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return User name, maximum length of 64 characters.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceCredentialsCredentialPair defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String password;
        private String username;
        public Builder() {}
        public Builder(DataSourceCredentialsCredentialPair defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public DataSourceCredentialsCredentialPair build() {
            final var o = new DataSourceCredentialsCredentialPair();
            o.password = password;
            o.username = username;
            return o;
        }
    }
}
