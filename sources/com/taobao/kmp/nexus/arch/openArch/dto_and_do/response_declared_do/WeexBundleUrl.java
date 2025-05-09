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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b7\b\u0001\u0018\u0000 ;2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001<B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR/\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR/\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR/\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\t\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\rR/\u0010&\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\t\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR/\u0010*\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\t\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\rR/\u0010.\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\t\u001a\u0004\b,\u0010\u000b\"\u0004\b-\u0010\rR/\u00102\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\t\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\rR/\u00106\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\t\u001a\u0004\b4\u0010\u000b\"\u0004\b5\u0010\rR/\u0010:\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010\t\u001a\u0004\b8\u0010\u000b\"\u0004\b9\u0010\r¨\u0006="}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/WeexBundleUrl;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "goodsListHost$delegate", "Ltb/qjg;", "getGoodsListHost", "()Ljava/lang/String;", "setGoodsListHost", "(Ljava/lang/String;)V", "goodsListHost", "landscapeBundle$delegate", "getLandscapeBundle", "setLandscapeBundle", "landscapeBundle", "hostToolsPortrait$delegate", "getHostToolsPortrait", "setHostToolsPortrait", "hostToolsPortrait", "goodsList$delegate", "getGoodsList", "setGoodsList", "goodsList", "goodsListV2$delegate", "getGoodsListV2", "setGoodsListV2", "goodsListV2", "goodsListLandscape$delegate", "getGoodsListLandscape", "setGoodsListLandscape", "goodsListLandscape", "goodsListClient$delegate", "getGoodsListClient", "setGoodsListClient", "goodsListClient", "hostDashboard$delegate", "getHostDashboard", "setHostDashboard", "hostDashboard", "liveHostInteractive$delegate", "getLiveHostInteractive", "setLiveHostInteractive", "liveHostInteractive", "preBundle$delegate", "getPreBundle", "setPreBundle", "preBundle", "goodsListPortrait$delegate", "getGoodsListPortrait", "setGoodsListPortrait", "goodsListPortrait", "hostToolsPortraitV2$delegate", "getHostToolsPortraitV2", "setHostToolsPortraitV2", "hostToolsPortraitV2", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class WeexBundleUrl extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg goodsListHost$delegate = new qjg(null, this, WeexBundleUrl$goodsListHost$2.INSTANCE);
    private final qjg landscapeBundle$delegate = new qjg(null, this, WeexBundleUrl$landscapeBundle$2.INSTANCE);
    private final qjg hostToolsPortrait$delegate = new qjg(null, this, WeexBundleUrl$hostToolsPortrait$2.INSTANCE);
    private final qjg goodsList$delegate = new qjg(null, this, WeexBundleUrl$goodsList$2.INSTANCE);
    private final qjg goodsListV2$delegate = new qjg(null, this, WeexBundleUrl$goodsListV2$2.INSTANCE);
    private final qjg goodsListLandscape$delegate = new qjg(null, this, WeexBundleUrl$goodsListLandscape$2.INSTANCE);
    private final qjg goodsListClient$delegate = new qjg(null, this, WeexBundleUrl$goodsListClient$2.INSTANCE);
    private final qjg hostDashboard$delegate = new qjg(null, this, WeexBundleUrl$hostDashboard$2.INSTANCE);
    private final qjg liveHostInteractive$delegate = new qjg(null, this, WeexBundleUrl$liveHostInteractive$2.INSTANCE);
    private final qjg preBundle$delegate = new qjg(null, this, WeexBundleUrl$preBundle$2.INSTANCE);
    private final qjg goodsListPortrait$delegate = new qjg(null, this, WeexBundleUrl$goodsListPortrait$2.INSTANCE);
    private final qjg hostToolsPortraitV2$delegate = new qjg(null, this, WeexBundleUrl$hostToolsPortraitV2$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536491);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(WeexBundleUrl weexBundleUrl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/WeexBundleUrl");
    }

    public final String getGoodsList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2deb635b", new Object[]{this});
        }
        return (String) this.goodsList$delegate.b(this, $$delegatedProperties[3]);
    }

    public final String getGoodsListClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc52e2d0", new Object[]{this});
        }
        return (String) this.goodsListClient$delegate.b(this, $$delegatedProperties[6]);
    }

    public final String getGoodsListHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b396593", new Object[]{this});
        }
        return (String) this.goodsListHost$delegate.b(this, $$delegatedProperties[0]);
    }

    public final String getGoodsListLandscape() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d421f51c", new Object[]{this});
        }
        return (String) this.goodsListLandscape$delegate.b(this, $$delegatedProperties[5]);
    }

    public final String getGoodsListPortrait() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3e07480", new Object[]{this});
        }
        return (String) this.goodsListPortrait$delegate.b(this, $$delegatedProperties[10]);
    }

    public final String getGoodsListV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3977c1bf", new Object[]{this});
        }
        return (String) this.goodsListV2$delegate.b(this, $$delegatedProperties[4]);
    }

    public final String getHostDashboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4a04aa3", new Object[]{this});
        }
        return (String) this.hostDashboard$delegate.b(this, $$delegatedProperties[7]);
    }

    public final String getHostToolsPortrait() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af793ce1", new Object[]{this});
        }
        return (String) this.hostToolsPortrait$delegate.b(this, $$delegatedProperties[2]);
    }

    public final String getHostToolsPortraitV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ef551c5", new Object[]{this});
        }
        return (String) this.hostToolsPortraitV2$delegate.b(this, $$delegatedProperties[11]);
    }

    public final String getLandscapeBundle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1f3ec72", new Object[]{this});
        }
        return (String) this.landscapeBundle$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getLiveHostInteractive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e905bfa1", new Object[]{this});
        }
        return (String) this.liveHostInteractive$delegate.b(this, $$delegatedProperties[8]);
    }

    public final String getPreBundle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67e28c0a", new Object[]{this});
        }
        return (String) this.preBundle$delegate.b(this, $$delegatedProperties[9]);
    }

    public final void setGoodsList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bec3e3", new Object[]{this, str});
        } else {
            this.goodsList$delegate.a(this, $$delegatedProperties[3], str);
        }
    }

    public final void setGoodsListClient(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48314c0e", new Object[]{this, str});
        } else {
            this.goodsListClient$delegate.a(this, $$delegatedProperties[6], str);
        }
    }

    public final void setGoodsListHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20932eab", new Object[]{this, str});
        } else {
            this.goodsListHost$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    public final void setGoodsListLandscape(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ee69da", new Object[]{this, str});
        } else {
            this.goodsListLandscape$delegate.a(this, $$delegatedProperties[5], str);
        }
    }

    public final void setGoodsListPortrait(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ad235e", new Object[]{this, str});
        } else {
            this.goodsListPortrait$delegate.a(this, $$delegatedProperties[10], str);
        }
    }

    public final void setGoodsListV2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d37a4ff", new Object[]{this, str});
        } else {
            this.goodsListV2$delegate.a(this, $$delegatedProperties[4], str);
        }
    }

    public final void setHostDashboard(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e408eb9b", new Object[]{this, str});
        } else {
            this.hostDashboard$delegate.a(this, $$delegatedProperties[7], str);
        }
    }

    public final void setHostToolsPortrait(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d2d671d", new Object[]{this, str});
        } else {
            this.hostToolsPortrait$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    public final void setHostToolsPortraitV2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178a61b9", new Object[]{this, str});
        } else {
            this.hostToolsPortraitV2$delegate.a(this, $$delegatedProperties[11], str);
        }
    }

    public final void setLandscapeBundle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b176ac", new Object[]{this, str});
        } else {
            this.landscapeBundle$delegate.a(this, $$delegatedProperties[1], str);
        }
    }

    public final void setLiveHostInteractive(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff87af5d", new Object[]{this, str});
        } else {
            this.liveHostInteractive$delegate.a(this, $$delegatedProperties[8], str);
        }
    }

    public final void setPreBundle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16acb114", new Object[]{this, str});
        } else {
            this.preBundle$delegate.a(this, $$delegatedProperties[9], str);
        }
    }

    static {
        t2o.a(1004536490);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(WeexBundleUrl.class, "goodsListHost", "getGoodsListHost()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(WeexBundleUrl.class, "landscapeBundle", "getLandscapeBundle()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(WeexBundleUrl.class, "hostToolsPortrait", "getHostToolsPortrait()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(WeexBundleUrl.class, "goodsList", "getGoodsList()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl4);
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(WeexBundleUrl.class, "goodsListV2", "getGoodsListV2()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl5);
        MutablePropertyReference1Impl mutablePropertyReference1Impl6 = new MutablePropertyReference1Impl(WeexBundleUrl.class, "goodsListLandscape", "getGoodsListLandscape()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl6);
        MutablePropertyReference1Impl mutablePropertyReference1Impl7 = new MutablePropertyReference1Impl(WeexBundleUrl.class, "goodsListClient", "getGoodsListClient()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl7);
        MutablePropertyReference1Impl mutablePropertyReference1Impl8 = new MutablePropertyReference1Impl(WeexBundleUrl.class, "hostDashboard", "getHostDashboard()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl8);
        MutablePropertyReference1Impl mutablePropertyReference1Impl9 = new MutablePropertyReference1Impl(WeexBundleUrl.class, "liveHostInteractive", "getLiveHostInteractive()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl9);
        MutablePropertyReference1Impl mutablePropertyReference1Impl10 = new MutablePropertyReference1Impl(WeexBundleUrl.class, "preBundle", "getPreBundle()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl10);
        MutablePropertyReference1Impl mutablePropertyReference1Impl11 = new MutablePropertyReference1Impl(WeexBundleUrl.class, "goodsListPortrait", "getGoodsListPortrait()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl11);
        MutablePropertyReference1Impl mutablePropertyReference1Impl12 = new MutablePropertyReference1Impl(WeexBundleUrl.class, "hostToolsPortraitV2", "getHostToolsPortraitV2()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl12);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5, mutablePropertyReference1Impl6, mutablePropertyReference1Impl7, mutablePropertyReference1Impl8, mutablePropertyReference1Impl9, mutablePropertyReference1Impl10, mutablePropertyReference1Impl11, mutablePropertyReference1Impl12};
    }
}
