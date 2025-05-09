package com.alibaba.triver.triver_shop.newShop.ext;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$parseBarIndexFromWeexTab$fountMainIndexBlock$1 extends Lambda implements d1a<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONArray $tabData;
    public final /* synthetic */ String $weexShopTab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$parseBarIndexFromWeexTab$fountMainIndexBlock$1(JSONArray jSONArray, String str) {
        super(0);
        this.$tabData = jSONArray;
        this.$weexShopTab = str;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$parseBarIndexFromWeexTab$fountMainIndexBlock$1 shopExtKt$parseBarIndexFromWeexTab$fountMainIndexBlock$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$parseBarIndexFromWeexTab$fountMainIndexBlock$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // tb.d1a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer invoke() {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$parseBarIndexFromWeexTab$fountMainIndexBlock$1.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "7560ccf2"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r8
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L_0x0019:
            com.alibaba.fastjson.JSONArray r2 = r8.$tabData
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0046
            r3 = 0
        L_0x0022:
            int r4 = r3 + 1
            com.alibaba.fastjson.JSONArray r5 = r8.$tabData
            java.lang.Object r5 = r5.get(r3)
            boolean r6 = r5 instanceof com.alibaba.fastjson.JSONObject
            if (r6 != 0) goto L_0x002f
            goto L_0x0041
        L_0x002f:
            java.lang.String r6 = r8.$weexShopTab
            com.alibaba.fastjson.JSONObject r5 = (com.alibaba.fastjson.JSONObject) r5
            java.lang.String r7 = "name"
            java.lang.Object r5 = r5.get(r7)
            boolean r5 = tb.ckf.b(r6, r5)
            if (r5 == 0) goto L_0x0041
            return r3
        L_0x0041:
            if (r4 < r2) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r3 = r4
            goto L_0x0022
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$parseBarIndexFromWeexTab$fountMainIndexBlock$1.invoke():int");
    }
}
