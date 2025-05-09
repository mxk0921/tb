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
import tb.v4s;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 .2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001/B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR/\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR/\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR/\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\t\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\rR/\u0010)\u001a\u0004\u0018\u00010#2\b\u0010\u0007\u001a\u0004\u0018\u00010#8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\t\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R/\u0010-\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\t\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\r¨\u00060"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/PersonalityData;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "goodsSubscribeStatus$delegate", "Ltb/qjg;", "getGoodsSubscribeStatus", "()Ljava/lang/String;", "setGoodsSubscribeStatus", "(Ljava/lang/String;)V", "goodsSubscribeStatus", "promotionPrice$delegate", "getPromotionPrice", "setPromotionPrice", "promotionPrice", "promotionPriceDesc$delegate", "getPromotionPriceDesc", "setPromotionPriceDesc", "promotionPriceDesc", "publicPromotionPrice$delegate", "getPublicPromotionPrice", "setPublicPromotionPrice", "publicPromotionPrice", "singlePromotionPriceAll$delegate", "getSinglePromotionPriceAll", "setSinglePromotionPriceAll", "singlePromotionPriceAll", "skuId$delegate", "getSkuId", "setSkuId", q2q.KEY_SKU_ID, "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/SpfPlayVideo;", "spfPlayVideo$delegate", "getSpfPlayVideo", "()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/SpfPlayVideo;", "setSpfPlayVideo", "(Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/SpfPlayVideo;)V", "spfPlayVideo", "stage$delegate", "getStage", "setStage", v4s.PARAM_UPLOAD_STAGE, "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PersonalityData extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg goodsSubscribeStatus$delegate = new qjg(null, this, PersonalityData$goodsSubscribeStatus$2.INSTANCE);
    private final qjg promotionPrice$delegate = new qjg(null, this, PersonalityData$promotionPrice$2.INSTANCE);
    private final qjg promotionPriceDesc$delegate = new qjg(null, this, PersonalityData$promotionPriceDesc$2.INSTANCE);
    private final qjg publicPromotionPrice$delegate = new qjg(null, this, PersonalityData$publicPromotionPrice$2.INSTANCE);
    private final qjg singlePromotionPriceAll$delegate = new qjg(null, this, PersonalityData$singlePromotionPriceAll$2.INSTANCE);
    private final qjg skuId$delegate = new qjg(null, this, PersonalityData$skuId$2.INSTANCE);
    private final qjg spfPlayVideo$delegate = new qjg(null, this, PersonalityData$spfPlayVideo$2.INSTANCE);
    private final qjg stage$delegate = new qjg(null, this, PersonalityData$stage$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536417);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(PersonalityData personalityData, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/PersonalityData");
    }

    public final String getGoodsSubscribeStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74e7185d", new Object[]{this});
        }
        return (String) this.goodsSubscribeStatus$delegate.b(this, $$delegatedProperties[0]);
    }

    public final String getPromotionPrice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24c4a11d", new Object[]{this});
        }
        return (String) this.promotionPrice$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getPromotionPriceDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec27c50c", new Object[]{this});
        }
        return (String) this.promotionPriceDesc$delegate.b(this, $$delegatedProperties[2]);
    }

    public final String getPublicPromotionPrice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90b49674", new Object[]{this});
        }
        return (String) this.publicPromotionPrice$delegate.b(this, $$delegatedProperties[3]);
    }

    public final String getSinglePromotionPriceAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ecb66d5c", new Object[]{this});
        }
        return (String) this.singlePromotionPriceAll$delegate.b(this, $$delegatedProperties[4]);
    }

    public final String getSkuId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c61a6d7", new Object[]{this});
        }
        return (String) this.skuId$delegate.b(this, $$delegatedProperties[5]);
    }

    public final SpfPlayVideo getSpfPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpfPlayVideo) ipChange.ipc$dispatch("22941d53", new Object[]{this});
        }
        return (SpfPlayVideo) this.spfPlayVideo$delegate.b(this, $$delegatedProperties[6]);
    }

    public final String getStage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a4ae2b1", new Object[]{this});
        }
        return (String) this.stage$delegate.b(this, $$delegatedProperties[7]);
    }

    public final void setGoodsSubscribeStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c459bb9", new Object[]{this, str});
        } else {
            this.goodsSubscribeStatus$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    public final void setPromotionPrice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("849ba3f9", new Object[]{this, str});
        } else {
            this.promotionPrice$delegate.a(this, $$delegatedProperties[1], str);
        }
    }

    public final void setPromotionPriceDesc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fca297ea", new Object[]{this, str});
        } else {
            this.promotionPriceDesc$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    public final void setPublicPromotionPrice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a27e082", new Object[]{this, str});
        } else {
            this.publicPromotionPrice$delegate.a(this, $$delegatedProperties[3], str);
        }
    }

    public final void setSinglePromotionPriceAll(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4575f02", new Object[]{this, str});
        } else {
            this.singlePromotionPriceAll$delegate.a(this, $$delegatedProperties[4], str);
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

    public final void setSpfPlayVideo(SpfPlayVideo spfPlayVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5fbf01", new Object[]{this, spfPlayVideo});
        } else {
            this.spfPlayVideo$delegate.a(this, $$delegatedProperties[6], spfPlayVideo);
        }
    }

    public final void setStage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbea094d", new Object[]{this, str});
        } else {
            this.stage$delegate.a(this, $$delegatedProperties[7], str);
        }
    }

    static {
        t2o.a(1004536416);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(PersonalityData.class, "goodsSubscribeStatus", "getGoodsSubscribeStatus()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(PersonalityData.class, "promotionPrice", "getPromotionPrice()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(PersonalityData.class, "promotionPriceDesc", "getPromotionPriceDesc()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(PersonalityData.class, "publicPromotionPrice", "getPublicPromotionPrice()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl4);
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(PersonalityData.class, "singlePromotionPriceAll", "getSinglePromotionPriceAll()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl5);
        MutablePropertyReference1Impl mutablePropertyReference1Impl6 = new MutablePropertyReference1Impl(PersonalityData.class, q2q.KEY_SKU_ID, "getSkuId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl6);
        MutablePropertyReference1Impl mutablePropertyReference1Impl7 = new MutablePropertyReference1Impl(PersonalityData.class, "spfPlayVideo", "getSpfPlayVideo()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/SpfPlayVideo;", 0);
        dun.f(mutablePropertyReference1Impl7);
        MutablePropertyReference1Impl mutablePropertyReference1Impl8 = new MutablePropertyReference1Impl(PersonalityData.class, v4s.PARAM_UPLOAD_STAGE, "getStage()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl8);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5, mutablePropertyReference1Impl6, mutablePropertyReference1Impl7, mutablePropertyReference1Impl8};
    }
}
