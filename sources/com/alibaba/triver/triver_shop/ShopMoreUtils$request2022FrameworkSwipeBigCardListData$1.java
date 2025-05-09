package com.alibaba.triver.triver_shop;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.BizExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.jpu;
import tb.npp;
import tb.u1a;
import tb.upx;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopMoreUtils$request2022FrameworkSwipeBigCardListData$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopDataParser $shopData;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.ShopMoreUtils$request2022FrameworkSwipeBigCardListData$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements g1a<JSONObject, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ShopDataParser $shopData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShopDataParser shopDataParser) {
            super(1);
            this.$shopData = shopDataParser;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/ShopMoreUtils$request2022FrameworkSwipeBigCardListData$1$1");
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(JSONObject jSONObject) {
            invoke2(jSONObject);
            return xhv.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
                return;
            }
            String str = null;
            this.$shopData.O2(jSONObject == null ? null : jSONObject.getJSONObject("data"));
            npp.a aVar = npp.Companion;
            if (jSONObject != null) {
                str = jSONObject.toString();
            }
            aVar.b(ckf.p("request2022FrameworkSwipeBigCardListData success : ", str));
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.ShopMoreUtils$request2022FrameworkSwipeBigCardListData$1$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass2 extends Lambda implements u1a<Integer, String, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/ShopMoreUtils$request2022FrameworkSwipeBigCardListData$1$2");
        }

        @Override // tb.u1a
        public /* bridge */ /* synthetic */ xhv invoke(Integer num, String str) {
            invoke(num.intValue(), str);
            return xhv.INSTANCE;
        }

        public final void invoke(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5563eae", new Object[]{this, new Integer(i), str});
                return;
            }
            npp.a aVar = npp.Companion;
            aVar.b("request2022FrameworkSwipeBigCardListData failed : " + i + ' ' + ((Object) str));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopMoreUtils$request2022FrameworkSwipeBigCardListData$1(ShopDataParser shopDataParser) {
        super(0);
        this.$shopData = shopDataParser;
    }

    public static /* synthetic */ Object ipc$super(ShopMoreUtils$request2022FrameworkSwipeBigCardListData$1 shopMoreUtils$request2022FrameworkSwipeBigCardListData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/ShopMoreUtils$request2022FrameworkSwipeBigCardListData$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        Pair a2 = jpu.a("sceneName", "shopHomepageCard");
        Pair a3 = jpu.a("pageSize", "10");
        Pair a4 = jpu.a(upx.PAGE_NUMBER, "1");
        Pair a5 = jpu.a("sellerId", this.$shopData.N0());
        JSONObject R0 = this.$shopData.R0();
        String str = null;
        if (!(R0 == null || (jSONObject = R0.getJSONObject("bizParams")) == null)) {
            str = jSONObject.toString();
        }
        BizExtKt.h(this.$shopData.Q(), "mtop.taobao.minishop.material.feeds.list", "1.0", a.k(a2, a3, a4, a5, jpu.a("bizParams", str)), new AnonymousClass1(this.$shopData), AnonymousClass2.INSTANCE, false, false, false, null, false, null, null, 8128, null);
    }
}
