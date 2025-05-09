package com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.dun;
import tb.mzf;
import tb.qjg;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0001\u0018\u0000 \u001b2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR/\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/DynamicRender;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "h5DynamicRenderUrl$delegate", "Ltb/qjg;", "getH5DynamicRenderUrl", "()Ljava/lang/String;", "setH5DynamicRenderUrl", "(Ljava/lang/String;)V", "h5DynamicRenderUrl", "h5DynamicRenderVersion$delegate", "getH5DynamicRenderVersion", "setH5DynamicRenderVersion", "h5DynamicRenderVersion", "weexDynamicRenderUrl$delegate", "getWeexDynamicRenderUrl", "setWeexDynamicRenderUrl", "weexDynamicRenderUrl", "weexDynamicRenderUrl4LandScape$delegate", "getWeexDynamicRenderUrl4LandScape", "setWeexDynamicRenderUrl4LandScape", "weexDynamicRenderUrl4LandScape", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DynamicRender extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg h5DynamicRenderUrl$delegate = new qjg(null, this, DynamicRender$h5DynamicRenderUrl$2.INSTANCE);
    private final qjg h5DynamicRenderVersion$delegate = new qjg(null, this, DynamicRender$h5DynamicRenderVersion$2.INSTANCE);
    private final qjg weexDynamicRenderUrl$delegate = new qjg(null, this, DynamicRender$weexDynamicRenderUrl$2.INSTANCE);
    private final qjg weexDynamicRenderUrl4LandScape$delegate = new qjg(null, this, DynamicRender$weexDynamicRenderUrl4LandScape$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004535993);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(DynamicRender dynamicRender, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/DynamicRender");
    }

    public final String getH5DynamicRenderUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0072fbc", new Object[]{this});
        }
        return (String) this.h5DynamicRenderUrl$delegate.b(this, $$delegatedProperties[0]);
    }

    public final String getH5DynamicRenderVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6dc0af3", new Object[]{this});
        }
        return (String) this.h5DynamicRenderVersion$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getWeexDynamicRenderUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82518288", new Object[]{this});
        }
        return (String) this.weexDynamicRenderUrl$delegate.b(this, $$delegatedProperties[2]);
    }

    public final String getWeexDynamicRenderUrl4LandScape() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9031161", new Object[]{this});
        }
        return (String) this.weexDynamicRenderUrl4LandScape$delegate.b(this, $$delegatedProperties[3]);
    }

    public final void setH5DynamicRenderUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b0833a", new Object[]{this, str});
        } else {
            this.h5DynamicRenderUrl$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    public final void setH5DynamicRenderVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1fa8e3", new Object[]{this, str});
        } else {
            this.h5DynamicRenderVersion$delegate.a(this, $$delegatedProperties[1], str);
        }
    }

    public final void setWeexDynamicRenderUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2876ee", new Object[]{this, str});
        } else {
            this.weexDynamicRenderUrl$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    public final void setWeexDynamicRenderUrl4LandScape(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc13a435", new Object[]{this, str});
        } else {
            this.weexDynamicRenderUrl4LandScape$delegate.a(this, $$delegatedProperties[3], str);
        }
    }

    static {
        t2o.a(1004535992);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(DynamicRender.class, "h5DynamicRenderUrl", "getH5DynamicRenderUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(DynamicRender.class, "h5DynamicRenderVersion", "getH5DynamicRenderVersion()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(DynamicRender.class, "weexDynamicRenderUrl", "getWeexDynamicRenderUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(DynamicRender.class, "weexDynamicRenderUrl4LandScape", "getWeexDynamicRenderUrl4LandScape()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl4);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4};
    }
}
