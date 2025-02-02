// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogFileFormatArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecLoggingAccessLogFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecLoggingAccessLogFileArgs Empty = new VirtualGatewaySpecLoggingAccessLogFileArgs();

    /**
     * The specified format for the logs.
     * 
     */
    @Import(name="format")
    private @Nullable Output<VirtualGatewaySpecLoggingAccessLogFileFormatArgs> format;

    /**
     * @return The specified format for the logs.
     * 
     */
    public Optional<Output<VirtualGatewaySpecLoggingAccessLogFileFormatArgs>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * File path to write access logs to. You can use `/dev/stdout` to send access logs to standard out. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return File path to write access logs to. You can use `/dev/stdout` to send access logs to standard out. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    private VirtualGatewaySpecLoggingAccessLogFileArgs() {}

    private VirtualGatewaySpecLoggingAccessLogFileArgs(VirtualGatewaySpecLoggingAccessLogFileArgs $) {
        this.format = $.format;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualGatewaySpecLoggingAccessLogFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewaySpecLoggingAccessLogFileArgs $;

        public Builder() {
            $ = new VirtualGatewaySpecLoggingAccessLogFileArgs();
        }

        public Builder(VirtualGatewaySpecLoggingAccessLogFileArgs defaults) {
            $ = new VirtualGatewaySpecLoggingAccessLogFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param format The specified format for the logs.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<VirtualGatewaySpecLoggingAccessLogFileFormatArgs> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format The specified format for the logs.
         * 
         * @return builder
         * 
         */
        public Builder format(VirtualGatewaySpecLoggingAccessLogFileFormatArgs format) {
            return format(Output.of(format));
        }

        /**
         * @param path File path to write access logs to. You can use `/dev/stdout` to send access logs to standard out. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path File path to write access logs to. You can use `/dev/stdout` to send access logs to standard out. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public VirtualGatewaySpecLoggingAccessLogFileArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
