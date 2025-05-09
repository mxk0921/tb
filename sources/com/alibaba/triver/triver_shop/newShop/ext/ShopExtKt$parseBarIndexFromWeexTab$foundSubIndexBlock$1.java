package com.alibaba.triver.triver_shop.newShop.ext;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$parseBarIndexFromWeexTab$foundSubIndexBlock$1 extends Lambda implements d1a<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $foundMainIndex;
    public final /* synthetic */ JSONArray $tabBarViewModelArray;
    public final /* synthetic */ String $weexSubShopTab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$parseBarIndexFromWeexTab$foundSubIndexBlock$1(int i, JSONArray jSONArray, String str) {
        super(0);
        this.$foundMainIndex = i;
        this.$tabBarViewModelArray = jSONArray;
        this.$weexSubShopTab = str;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$parseBarIndexFromWeexTab$foundSubIndexBlock$1 shopExtKt$parseBarIndexFromWeexTab$foundSubIndexBlock$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$parseBarIndexFromWeexTab$foundSubIndexBlock$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // tb.d1a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer invoke() {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$parseBarIndexFromWeexTab$foundSubIndexBlock$1.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "7560ccf2"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r9
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L_0x0019:
            int r2 = r9.$foundMainIndex
            com.alibaba.fastjson.JSONArray r3 = r9.$tabBarViewModelArray
            int r3 = r3.size()
            if (r2 < r3) goto L_0x0024
            return r0
        L_0x0024:
            com.alibaba.fastjson.JSONArray r2 = r9.$tabBarViewModelArray
            int r3 = r9.$foundMainIndex
            java.lang.Object r2 = r2.get(r3)
            boolean r3 = r2 instanceof com.alibaba.fastjson.JSONArray
            if (r3 != 0) goto L_0x0031
            return r0
        L_0x0031:
            com.alibaba.fastjson.JSONArray r2 = (com.alibaba.fastjson.JSONArray) r2
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x005c
            r4 = 0
        L_0x003a:
            int r5 = r4 + 1
            java.lang.Object r6 = r2.get(r4)
            boolean r7 = r6 instanceof com.alibaba.fastjson.JSONObject
            if (r7 != 0) goto L_0x0045
            goto L_0x0057
        L_0x0045:
            java.lang.String r7 = r9.$weexSubShopTab
            com.alibaba.fastjson.JSONObject r6 = (com.alibaba.fastjson.JSONObject) r6
            java.lang.String r8 = "name"
            java.lang.Object r6 = r6.get(r8)
            boolean r6 = tb.ckf.b(r7, r6)
            if (r6 == 0) goto L_0x0057
            return r4
        L_0x0057:
            if (r5 < r3) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            r4 = r5
            goto L_0x003a
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$parseBarIndexFromWeexTab$foundSubIndexBlock$1.invoke():int");
    }
}
