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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 72\u00020\u00012\u00060\u0002j\u0002`\u0003:\u00018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R/\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR/\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR/\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\rR;\u0010)\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\t\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R/\u0010-\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\t\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\rR/\u00101\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\t\u001a\u0004\b/\u0010\u000b\"\u0004\b0\u0010\rR;\u00106\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\"2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\"8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\t\u001a\u0004\b4\u0010&\"\u0004\b5\u0010(¨\u00069"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ItemExtData;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "showPriority$delegate", "Ltb/qjg;", "getShowPriority", "()Ljava/lang/String;", "setShowPriority", "(Ljava/lang/String;)V", "showPriority", "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ItemListTrackData;", "itemListTrackData$delegate", "getItemListTrackData", "()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ItemListTrackData;", "setItemListTrackData", "(Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ItemListTrackData;)V", "itemListTrackData", "enableSku$delegate", "getEnableSku", "setEnableSku", "enableSku", "enableCart$delegate", "getEnableCart", "setEnableCart", "enableCart", "enableDrawer$delegate", "getEnableDrawer", "setEnableDrawer", "enableDrawer", "", "", "commonItemBenefits$delegate", "getCommonItemBenefits", "()Ljava/util/List;", "setCommonItemBenefits", "(Ljava/util/List;)V", "commonItemBenefits", "cacheExpire$delegate", "getCacheExpire", "setCacheExpire", "cacheExpire", "enableBuy$delegate", "getEnableBuy", "setEnableBuy", "enableBuy", "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ItemBenefitLabel;", "itemBenefitLabels$delegate", "getItemBenefitLabels", "setItemBenefitLabels", "itemBenefitLabels", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ItemExtData extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg showPriority$delegate = new qjg(null, this, ItemExtData$showPriority$2.INSTANCE);
    private final qjg itemListTrackData$delegate = new qjg(null, this, ItemExtData$itemListTrackData$2.INSTANCE);
    private final qjg enableSku$delegate = new qjg(null, this, ItemExtData$enableSku$2.INSTANCE);
    private final qjg enableCart$delegate = new qjg(null, this, ItemExtData$enableCart$2.INSTANCE);
    private final qjg enableDrawer$delegate = new qjg(null, this, ItemExtData$enableDrawer$2.INSTANCE);
    private final qjg commonItemBenefits$delegate = new qjg(null, this, ItemExtData$commonItemBenefits$2.INSTANCE);
    private final qjg cacheExpire$delegate = new qjg(null, this, ItemExtData$cacheExpire$2.INSTANCE);
    private final qjg enableBuy$delegate = new qjg(null, this, ItemExtData$enableBuy$2.INSTANCE);
    private final qjg itemBenefitLabels$delegate = new qjg(null, this, ItemExtData$itemBenefitLabels$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536140);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(ItemExtData itemExtData, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ItemExtData");
    }

    public final String getCacheExpire() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a83dce", new Object[]{this});
        }
        return (String) this.cacheExpire$delegate.b(this, $$delegatedProperties[6]);
    }

    public final List<Object> getCommonItemBenefits() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d9320670", new Object[]{this});
        }
        return (List) this.commonItemBenefits$delegate.b(this, $$delegatedProperties[5]);
    }

    public final String getEnableBuy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11baf1cc", new Object[]{this});
        }
        return (String) this.enableBuy$delegate.b(this, $$delegatedProperties[7]);
    }

    public final String getEnableCart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c224960", new Object[]{this});
        }
        return (String) this.enableCart$delegate.b(this, $$delegatedProperties[3]);
    }

    public final String getEnableDrawer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4573026f", new Object[]{this});
        }
        return (String) this.enableDrawer$delegate.b(this, $$delegatedProperties[4]);
    }

    public final String getEnableSku() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cdce8795", new Object[]{this});
        }
        return (String) this.enableSku$delegate.b(this, $$delegatedProperties[2]);
    }

    public final List<ItemBenefitLabel> getItemBenefitLabels() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fb54f53", new Object[]{this});
        }
        return (List) this.itemBenefitLabels$delegate.b(this, $$delegatedProperties[8]);
    }

    public final ItemListTrackData getItemListTrackData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemListTrackData) ipChange.ipc$dispatch("6f76f507", new Object[]{this});
        }
        return (ItemListTrackData) this.itemListTrackData$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getShowPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27be0922", new Object[]{this});
        }
        return (String) this.showPriority$delegate.b(this, $$delegatedProperties[0]);
    }

    public final void setCacheExpire(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d316aad0", new Object[]{this, str});
        } else {
            this.cacheExpire$delegate.a(this, $$delegatedProperties[6], str);
        }
    }

    public final void setCommonItemBenefits(List<? extends Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf4ae1f4", new Object[]{this, list});
        } else {
            this.commonItemBenefits$delegate.a(this, $$delegatedProperties[5], list);
        }
    }

    public final void setEnableBuy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7e10392", new Object[]{this, str});
        } else {
            this.enableBuy$delegate.a(this, $$delegatedProperties[7], str);
        }
    }

    public final void setEnableCart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f106a16", new Object[]{this, str});
        } else {
            this.enableCart$delegate.a(this, $$delegatedProperties[3], str);
        }
    }

    public final void setEnableDrawer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f98bbfe7", new Object[]{this, str});
        } else {
            this.enableDrawer$delegate.a(this, $$delegatedProperties[4], str);
        }
    }

    public final void setEnableSku(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4026e9", new Object[]{this, str});
        } else {
            this.enableSku$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    public final void setItemBenefitLabels(List<ItemBenefitLabel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d715fbd9", new Object[]{this, list});
        } else {
            this.itemBenefitLabels$delegate.a(this, $$delegatedProperties[8], list);
        }
    }

    public final void setItemListTrackData(ItemListTrackData itemListTrackData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4b2d6f", new Object[]{this, itemListTrackData});
        } else {
            this.itemListTrackData$delegate.a(this, $$delegatedProperties[1], itemListTrackData);
        }
    }

    public final void setShowPriority(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a18f94", new Object[]{this, str});
        } else {
            this.showPriority$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    static {
        t2o.a(1004536139);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ItemExtData.class, "showPriority", "getShowPriority()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(ItemExtData.class, "itemListTrackData", "getItemListTrackData()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ItemListTrackData;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(ItemExtData.class, "enableSku", "getEnableSku()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(ItemExtData.class, "enableCart", "getEnableCart()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl4);
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(ItemExtData.class, "enableDrawer", "getEnableDrawer()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl5);
        MutablePropertyReference1Impl mutablePropertyReference1Impl6 = new MutablePropertyReference1Impl(ItemExtData.class, "commonItemBenefits", "getCommonItemBenefits()Ljava/util/List;", 0);
        dun.f(mutablePropertyReference1Impl6);
        MutablePropertyReference1Impl mutablePropertyReference1Impl7 = new MutablePropertyReference1Impl(ItemExtData.class, "cacheExpire", "getCacheExpire()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl7);
        MutablePropertyReference1Impl mutablePropertyReference1Impl8 = new MutablePropertyReference1Impl(ItemExtData.class, "enableBuy", "getEnableBuy()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl8);
        MutablePropertyReference1Impl mutablePropertyReference1Impl9 = new MutablePropertyReference1Impl(ItemExtData.class, "itemBenefitLabels", "getItemBenefitLabels()Ljava/util/List;", 0);
        dun.f(mutablePropertyReference1Impl9);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5, mutablePropertyReference1Impl6, mutablePropertyReference1Impl7, mutablePropertyReference1Impl8, mutablePropertyReference1Impl9};
    }
}
