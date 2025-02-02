// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketArgs Empty = new BucketArgs();

    /**
     * Name of the bucket.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return Name of the bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Identifier of the Outpost to contain this bucket.
     * 
     */
    @Import(name="outpostId", required=true)
    private Output<String> outpostId;

    /**
     * @return Identifier of the Outpost to contain this bucket.
     * 
     */
    public Output<String> outpostId() {
        return this.outpostId;
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

    private BucketArgs() {}

    private BucketArgs(BucketArgs $) {
        this.bucket = $.bucket;
        this.outpostId = $.outpostId;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketArgs $;

        public Builder() {
            $ = new BucketArgs();
        }

        public Builder(BucketArgs defaults) {
            $ = new BucketArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket Name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket Name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param outpostId Identifier of the Outpost to contain this bucket.
         * 
         * @return builder
         * 
         */
        public Builder outpostId(Output<String> outpostId) {
            $.outpostId = outpostId;
            return this;
        }

        /**
         * @param outpostId Identifier of the Outpost to contain this bucket.
         * 
         * @return builder
         * 
         */
        public Builder outpostId(String outpostId) {
            return outpostId(Output.of(outpostId));
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

        public BucketArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.outpostId = Objects.requireNonNull($.outpostId, "expected parameter 'outpostId' to be non-null");
            return $;
        }
    }

}
