// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.outputs;

import com.pulumi.aws.opsworks.outputs.PhpAppLayerLoadBasedAutoScalingDownscaling;
import com.pulumi.aws.opsworks.outputs.PhpAppLayerLoadBasedAutoScalingUpscaling;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PhpAppLayerLoadBasedAutoScaling {
    private @Nullable PhpAppLayerLoadBasedAutoScalingDownscaling downscaling;
    private @Nullable Boolean enable;
    private @Nullable PhpAppLayerLoadBasedAutoScalingUpscaling upscaling;

    private PhpAppLayerLoadBasedAutoScaling() {}
    public Optional<PhpAppLayerLoadBasedAutoScalingDownscaling> downscaling() {
        return Optional.ofNullable(this.downscaling);
    }
    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }
    public Optional<PhpAppLayerLoadBasedAutoScalingUpscaling> upscaling() {
        return Optional.ofNullable(this.upscaling);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PhpAppLayerLoadBasedAutoScaling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PhpAppLayerLoadBasedAutoScalingDownscaling downscaling;
        private @Nullable Boolean enable;
        private @Nullable PhpAppLayerLoadBasedAutoScalingUpscaling upscaling;
        public Builder() {}
        public Builder(PhpAppLayerLoadBasedAutoScaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.downscaling = defaults.downscaling;
    	      this.enable = defaults.enable;
    	      this.upscaling = defaults.upscaling;
        }

        @CustomType.Setter
        public Builder downscaling(@Nullable PhpAppLayerLoadBasedAutoScalingDownscaling downscaling) {
            this.downscaling = downscaling;
            return this;
        }
        @CustomType.Setter
        public Builder enable(@Nullable Boolean enable) {
            this.enable = enable;
            return this;
        }
        @CustomType.Setter
        public Builder upscaling(@Nullable PhpAppLayerLoadBasedAutoScalingUpscaling upscaling) {
            this.upscaling = upscaling;
            return this;
        }
        public PhpAppLayerLoadBasedAutoScaling build() {
            final var o = new PhpAppLayerLoadBasedAutoScaling();
            o.downscaling = downscaling;
            o.enable = enable;
            o.upscaling = upscaling;
            return o;
        }
    }
}
