package com.alibaba.triver.triver_shop.newShop;

import com.alibaba.ariver.app.api.App;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.ShopMoreUtils;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.aqp;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NativeShopActivity$DefaultTbShopActionListener$share$1 extends Lambda implements g1a<JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ App $homePageApp;
    public final /* synthetic */ NativeShopActivity this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.newShop.NativeShopActivity$DefaultTbShopActionListener$share$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements g1a<JSONObject, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ App $homePageApp;
        public final /* synthetic */ boolean $shopStarStatus;
        public final /* synthetic */ NativeShopActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NativeShopActivity nativeShopActivity, boolean z, App app) {
            super(1);
            this.this$0 = nativeShopActivity;
            this.$shopStarStatus = z;
            this.$homePageApp = app;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$DefaultTbShopActionListener$share$1$1");
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(JSONObject jSONObject) {
            invoke2(jSONObject);
            return xhv.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(JSONObject jSONObject) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
                return;
            }
            Boolean bool = null;
            if (jSONObject == null) {
                str = null;
            } else {
                JSONObject jSONObject2 = new JSONObject();
                Object obj = jSONObject.get("data");
                if (obj instanceof JSONObject) {
                    jSONObject2 = obj;
                }
                str = jSONObject2.getString("value");
            }
            boolean b = ckf.b("true", str);
            ShopDataParser I3 = NativeShopActivity.I3(this.this$0);
            if (I3 != null) {
                String M3 = NativeShopActivity.M3(this.this$0);
                String X4 = this.this$0.X4();
                if (jSONObject != null) {
                    bool = Boolean.valueOf(b);
                }
                ShopMoreUtils.INSTANCE.w(this.this$0, I3, M3, X4, bool, Boolean.valueOf(this.$shopStarStatus), this.$homePageApp);
                return;
            }
            ckf.y("shopDataParser");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$DefaultTbShopActionListener$share$1(NativeShopActivity nativeShopActivity, App app) {
        super(1);
        this.this$0 = nativeShopActivity;
        this.$homePageApp = app;
    }

    public static /* synthetic */ Object ipc$super(NativeShopActivity$DefaultTbShopActionListener$share$1 nativeShopActivity$DefaultTbShopActionListener$share$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$DefaultTbShopActionListener$share$1");
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
        if (aqp.Companion.H()) {
            ShopMoreUtils shopMoreUtils = ShopMoreUtils.INSTANCE;
            NativeShopActivity nativeShopActivity = this.this$0;
            ShopDataParser I3 = NativeShopActivity.I3(nativeShopActivity);
            if (I3 != null) {
                shopMoreUtils.r(nativeShopActivity, I3.N0(), new AnonymousClass1(this.this$0, b, this.$homePageApp));
            } else {
                ckf.y("shopDataParser");
                throw null;
            }
        } else {
            ShopDataParser I32 = NativeShopActivity.I3(this.this$0);
            if (I32 != null) {
                ShopMoreUtils.INSTANCE.w(this.this$0, I32, NativeShopActivity.M3(this.this$0), this.this$0.X4(), null, Boolean.valueOf(b), this.$homePageApp);
            } else {
                ckf.y("shopDataParser");
                throw null;
            }
        }
    }
}
