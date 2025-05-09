package com.alibaba.triver.triver_shop.newShop.ext;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.rpp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$monitorRouteData$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $goToShop;
    public final /* synthetic */ String $industryShop;
    public final /* synthetic */ boolean $isNativeFrameWork;
    public final /* synthetic */ boolean $match3Rules;
    public final /* synthetic */ String $originalUrl;
    public final /* synthetic */ String $renderStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$monitorRouteData$1(boolean z, boolean z2, String str, String str2, boolean z3, String str3) {
        super(0);
        this.$match3Rules = z;
        this.$goToShop = z2;
        this.$originalUrl = str;
        this.$industryShop = str2;
        this.$isNativeFrameWork = z3;
        this.$renderStyle = str3;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$monitorRouteData$1 shopExtKt$monitorRouteData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$monitorRouteData$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "match3Rules", (String) Boolean.valueOf(this.$match3Rules));
            jSONObject.put((JSONObject) "goToShopFrame", (String) Boolean.valueOf(this.$goToShop));
            jSONObject.put((JSONObject) "routeUrl", this.$originalUrl);
            jSONObject.put((JSONObject) "industryShop", this.$industryShop);
            jSONObject.put((JSONObject) "isNativeFrameWork", (String) Boolean.valueOf(this.$isNativeFrameWork));
            jSONObject.put((JSONObject) "renderStyle", this.$renderStyle);
            rpp.a("Shop", "route", jSONObject, new JSONObject(), null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
