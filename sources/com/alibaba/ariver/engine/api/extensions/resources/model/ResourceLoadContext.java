package com.alibaba.ariver.engine.api.extensions.resources.model;

import android.net.Uri;
import com.alibaba.ariver.kernel.api.node.Node;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ResourceLoadContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int WEBTYPE_IS_NOT_WEBVIEW = 4;
    public static int WEBTYPE_RN_VIEW = 3;
    public static int WEBTYPE_SYSTEM_BUILD_IN = 1;
    public static int WEBTYPE_THIRD_PARTY = 2;
    public boolean canAsyncFallback;
    public boolean canDegradeGlobalPackage;
    public boolean canUseFallback;
    public boolean isMainDoc;
    public String originUrl;
    public Node sourceNode;
    public Uri uri;
    @Deprecated
    public int webType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean canUseFallback;
        public String originUrl;
        public Node sourceNode;
        public Uri uri;
        public boolean canAsyncFallback = false;
        public boolean canDegradeGlobalPackage = true;
        public boolean isMainDoc = false;
        public int webType = ResourceLoadContext.WEBTYPE_IS_NOT_WEBVIEW;

        public ResourceLoadContext build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResourceLoadContext) ipChange.ipc$dispatch("32442321", new Object[]{this});
            }
            return new ResourceLoadContext(this);
        }

        public Builder canAsyncFallback(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d8d0c700", new Object[]{this, new Boolean(z)});
            }
            this.canAsyncFallback = z;
            return this;
        }

        public Builder canDegradeGlobalPackage(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c117896f", new Object[]{this, new Boolean(z)});
            }
            this.canDegradeGlobalPackage = z;
            return this;
        }

        public Builder canUseFallback(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3f81734b", new Object[]{this, new Boolean(z)});
            }
            this.canUseFallback = z;
            return this;
        }

        public Builder isMainDoc(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("44d590e7", new Object[]{this, new Boolean(z)});
            }
            this.isMainDoc = z;
            return this;
        }

        public Builder originUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ec0c6005", new Object[]{this, str});
            }
            this.originUrl = str;
            return this;
        }

        public Builder sourceNode(Node node) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9e607e2d", new Object[]{this, node});
            }
            this.sourceNode = node;
            return this;
        }

        public Builder uri(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c664b4cb", new Object[]{this, uri});
            }
            this.uri = uri;
            return this;
        }

        public Builder webType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e2c36b51", new Object[]{this, new Integer(i)});
            }
            this.webType = i;
            return this;
        }
    }

    public ResourceLoadContext() {
        this.canDegradeGlobalPackage = true;
    }

    public static Builder newBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Builder) ipChange.ipc$dispatch("7958a5d", new Object[0]);
        }
        return new Builder();
    }

    public ResourceLoadContext(Builder builder) {
        String str = builder.originUrl;
        this.originUrl = str;
        Uri uri = builder.uri;
        if (uri == null) {
            this.uri = Uri.parse(str);
        } else {
            this.uri = uri;
        }
        this.canUseFallback = builder.canUseFallback;
        this.canAsyncFallback = builder.canAsyncFallback;
        this.isMainDoc = builder.isMainDoc;
        this.webType = builder.webType;
        this.canDegradeGlobalPackage = builder.canDegradeGlobalPackage;
    }
}
