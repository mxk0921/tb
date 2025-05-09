package com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.dun;
import tb.mzf;
import tb.qjg;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\t\b\u0001\u0018\u0000 \u001c2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001dB\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR;\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ItemListTrackData;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "isDetail$delegate", "Ltb/qjg;", "isDetail", "()Ljava/lang/String;", "setDetail", "(Ljava/lang/String;)V", "isSizeItem$delegate", "isSizeItem", "setSizeItem", "isSuperItem$delegate", "isSuperItem", "setSuperItem", "", "", "liveItemTags$delegate", "getLiveItemTags", "()Ljava/util/List;", "setLiveItemTags", "(Ljava/util/List;)V", "liveItemTags", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ItemListTrackData extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg isDetail$delegate = new qjg(null, this, ItemListTrackData$isDetail$2.INSTANCE);
    private final qjg isSizeItem$delegate = new qjg(null, this, ItemListTrackData$isSizeItem$2.INSTANCE);
    private final qjg isSuperItem$delegate = new qjg(null, this, ItemListTrackData$isSuperItem$2.INSTANCE);
    private final qjg liveItemTags$delegate = new qjg(null, this, ItemListTrackData$liveItemTags$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536151);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(ItemListTrackData itemListTrackData, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ItemListTrackData");
    }

    public final List<Object> getLiveItemTags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2d9ea2d2", new Object[]{this});
        }
        return (List) this.liveItemTags$delegate.b(this, $$delegatedProperties[3]);
    }

    public final String isDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c7913be", new Object[]{this});
        }
        return (String) this.isDetail$delegate.b(this, $$delegatedProperties[0]);
    }

    public final String isSizeItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d55ebbb", new Object[]{this});
        }
        return (String) this.isSizeItem$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String isSuperItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b58e255", new Object[]{this});
        }
        return (String) this.isSuperItem$delegate.b(this, $$delegatedProperties[2]);
    }

    public final void setDetail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("629919a4", new Object[]{this, str});
        } else {
            this.isDetail$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    public final void setLiveItemTags(List<? extends Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3318cad2", new Object[]{this, list});
        } else {
            this.liveItemTags$delegate.a(this, $$delegatedProperties[3], list);
        }
    }

    public final void setSizeItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e395347", new Object[]{this, str});
        } else {
            this.isSizeItem$delegate.a(this, $$delegatedProperties[1], str);
        }
    }

    public final void setSuperItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca9a5c7d", new Object[]{this, str});
        } else {
            this.isSuperItem$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    static {
        t2o.a(1004536150);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ItemListTrackData.class, "isDetail", "isDetail()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(ItemListTrackData.class, "isSizeItem", "isSizeItem()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(ItemListTrackData.class, "isSuperItem", "isSuperItem()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(ItemListTrackData.class, "liveItemTags", "getLiveItemTags()Ljava/util/List;", 0);
        dun.f(mutablePropertyReference1Impl4);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4};
    }
}
