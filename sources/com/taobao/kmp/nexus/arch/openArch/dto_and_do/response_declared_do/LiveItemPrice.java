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
import tb.q2q;
import tb.qjg;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0001\u0018\u0000 #2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001$B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR/\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR/\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR/\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\t\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\r¨\u0006%"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/LiveItemPrice;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "itemId$delegate", "Ltb/qjg;", "getItemId", "()Ljava/lang/String;", "setItemId", "(Ljava/lang/String;)V", "itemId", "liveId$delegate", "getLiveId", "setLiveId", "liveId", "promotionPrice$delegate", "getPromotionPrice", "setPromotionPrice", "promotionPrice", "promotionPriceDesc$delegate", "getPromotionPriceDesc", "setPromotionPriceDesc", "promotionPriceDesc", "publicPromotionPrice$delegate", "getPublicPromotionPrice", "setPublicPromotionPrice", "publicPromotionPrice", "skuId$delegate", "getSkuId", "setSkuId", q2q.KEY_SKU_ID, "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class LiveItemPrice extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg itemId$delegate = new qjg(null, this, LiveItemPrice$itemId$2.INSTANCE);
    private final qjg liveId$delegate = new qjg(null, this, LiveItemPrice$liveId$2.INSTANCE);
    private final qjg promotionPrice$delegate = new qjg(null, this, LiveItemPrice$promotionPrice$2.INSTANCE);
    private final qjg promotionPriceDesc$delegate = new qjg(null, this, LiveItemPrice$promotionPriceDesc$2.INSTANCE);
    private final qjg publicPromotionPrice$delegate = new qjg(null, this, LiveItemPrice$publicPromotionPrice$2.INSTANCE);
    private final qjg skuId$delegate = new qjg(null, this, LiveItemPrice$skuId$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536359);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(LiveItemPrice liveItemPrice, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/LiveItemPrice");
    }

    public final String getItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return (String) this.itemId$delegate.b(this, $$delegatedProperties[0]);
    }

    public final String getLiveId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
        }
        return (String) this.liveId$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getPromotionPrice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24c4a11d", new Object[]{this});
        }
        return (String) this.promotionPrice$delegate.b(this, $$delegatedProperties[2]);
    }

    public final String getPromotionPriceDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec27c50c", new Object[]{this});
        }
        return (String) this.promotionPriceDesc$delegate.b(this, $$delegatedProperties[3]);
    }

    public final String getPublicPromotionPrice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90b49674", new Object[]{this});
        }
        return (String) this.publicPromotionPrice$delegate.b(this, $$delegatedProperties[4]);
    }

    public final String getSkuId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c61a6d7", new Object[]{this});
        }
        return (String) this.skuId$delegate.b(this, $$delegatedProperties[5]);
    }

    public final void setItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7375121", new Object[]{this, str});
        } else {
            this.itemId$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    public final void setLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        } else {
            this.liveId$delegate.a(this, $$delegatedProperties[1], str);
        }
    }

    public final void setPromotionPrice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("849ba3f9", new Object[]{this, str});
        } else {
            this.promotionPrice$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    public final void setPromotionPriceDesc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fca297ea", new Object[]{this, str});
        } else {
            this.promotionPriceDesc$delegate.a(this, $$delegatedProperties[3], str);
        }
    }

    public final void setPublicPromotionPrice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a27e082", new Object[]{this, str});
        } else {
            this.publicPromotionPrice$delegate.a(this, $$delegatedProperties[4], str);
        }
    }

    public final void setSkuId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cabc9e7", new Object[]{this, str});
        } else {
            this.skuId$delegate.a(this, $$delegatedProperties[5], str);
        }
    }

    static {
        t2o.a(1004536358);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(LiveItemPrice.class, "itemId", "getItemId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(LiveItemPrice.class, "liveId", "getLiveId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(LiveItemPrice.class, "promotionPrice", "getPromotionPrice()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(LiveItemPrice.class, "promotionPriceDesc", "getPromotionPriceDesc()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl4);
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(LiveItemPrice.class, "publicPromotionPrice", "getPublicPromotionPrice()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl5);
        MutablePropertyReference1Impl mutablePropertyReference1Impl6 = new MutablePropertyReference1Impl(LiveItemPrice.class, q2q.KEY_SKU_ID, "getSkuId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl6);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5, mutablePropertyReference1Impl6};
    }
}
