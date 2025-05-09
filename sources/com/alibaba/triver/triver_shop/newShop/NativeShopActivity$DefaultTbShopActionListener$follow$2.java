package com.alibaba.triver.triver_shop.newShop;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.ShopMoreUtils;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NativeShopActivity$DefaultTbShopActionListener$follow$2 extends Lambda implements g1a<JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NativeShopActivity this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.newShop.NativeShopActivity$DefaultTbShopActionListener$follow$2$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean $shopStarStatus;
        public final /* synthetic */ NativeShopActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NativeShopActivity nativeShopActivity, boolean z) {
            super(0);
            this.this$0 = nativeShopActivity;
            this.$shopStarStatus = z;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$DefaultTbShopActionListener$follow$2$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            ShopMoreUtils shopMoreUtils = ShopMoreUtils.INSTANCE;
            NativeShopActivity nativeShopActivity = this.this$0;
            ShopDataParser I3 = NativeShopActivity.I3(nativeShopActivity);
            if (I3 != null) {
                String N0 = I3.N0();
                boolean z = this.$shopStarStatus;
                ShopDataParser I32 = NativeShopActivity.I3(this.this$0);
                if (I32 != null) {
                    shopMoreUtils.j(nativeShopActivity, N0, z, I32);
                } else {
                    ckf.y("shopDataParser");
                    throw null;
                }
            } else {
                ckf.y("shopDataParser");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.newShop.NativeShopActivity$DefaultTbShopActionListener$follow$2$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass2 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NativeShopActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NativeShopActivity nativeShopActivity) {
            super(0);
            this.this$0 = nativeShopActivity;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$DefaultTbShopActionListener$follow$2$2");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                NativeShopActivity.q4(this.this$0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$DefaultTbShopActionListener$follow$2(NativeShopActivity nativeShopActivity) {
        super(1);
        this.this$0 = nativeShopActivity;
    }

    public static /* synthetic */ Object ipc$super(NativeShopActivity$DefaultTbShopActionListener$follow$2 nativeShopActivity$DefaultTbShopActionListener$follow$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$DefaultTbShopActionListener$follow$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
            return;
        }
        boolean b = ckf.b((jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null) ? null : jSONObject2.getString("result"), "BIND");
        NativeShopActivity nativeShopActivity = this.this$0;
        AnonymousClass1 r2 = new AnonymousClass1(nativeShopActivity, b);
        ShopDataParser I3 = NativeShopActivity.I3(this.this$0);
        if (I3 != null) {
            ShopExtKt.h0(nativeShopActivity, b, r2, I3, new AnonymousClass2(this.this$0));
        } else {
            ckf.y("shopDataParser");
            throw null;
        }
    }
}
