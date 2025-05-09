package tb;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.IpChange;
import tb.tnp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class unp implements tnp.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ShopDataParser f29518a;

    static {
        t2o.a(766509310);
        t2o.a(766509309);
    }

    public unp(ShopDataParser shopDataParser) {
        ckf.g(shopDataParser, "shopDataParser");
        this.f29518a = shopDataParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // tb.tnp.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.unp.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "c3d9affa"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            java.lang.String r0 = "data"
            tb.ckf.g(r5, r0)
            com.alibaba.fastjson.JSONObject r5 = com.alibaba.fastjson.JSON.parseObject(r5)     // Catch: all -> 0x0077
            java.lang.String r1 = "shopId"
            java.lang.Object r1 = r5.get(r1)     // Catch: all -> 0x0077
            r2 = 0
            if (r1 != 0) goto L_0x002a
            r1 = r2
            goto L_0x002e
        L_0x002a:
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x0077
        L_0x002e:
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser r3 = r4.b()     // Catch: all -> 0x0077
            java.lang.String r3 = r3.W0()     // Catch: all -> 0x0077
            boolean r1 = tb.ckf.b(r1, r3)     // Catch: all -> 0x0077
            if (r1 == 0) goto L_0x0079
            java.lang.String r1 = "sellerId"
            java.lang.Object r1 = r5.get(r1)     // Catch: all -> 0x0077
            if (r1 != 0) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            java.lang.String r2 = r1.toString()     // Catch: all -> 0x0077
        L_0x004a:
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser r1 = r4.b()     // Catch: all -> 0x0077
            java.lang.String r1 = r1.N0()     // Catch: all -> 0x0077
            boolean r1 = tb.ckf.b(r2, r1)     // Catch: all -> 0x0077
            if (r1 != 0) goto L_0x0059
            goto L_0x0079
        L_0x0059:
            com.alibaba.fastjson.JSONObject r0 = r5.getJSONObject(r0)     // Catch: all -> 0x0077
            if (r0 != 0) goto L_0x0060
            goto L_0x0081
        L_0x0060:
            java.lang.String r1 = "eventType"
            java.lang.Object r5 = r5.get(r1)     // Catch: all -> 0x0077
            java.lang.String r1 = "shop.behavior.sequence"
            boolean r5 = tb.ckf.b(r5, r1)     // Catch: all -> 0x0077
            if (r5 == 0) goto L_0x0081
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser r5 = r4.b()     // Catch: all -> 0x0077
            com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt.X(r5, r0)     // Catch: all -> 0x0077
            goto L_0x0081
        L_0x0077:
            r5 = move-exception
            goto L_0x0088
        L_0x0079:
            tb.npp$a r5 = tb.npp.Companion     // Catch: all -> 0x0077
            java.lang.String r0 = "incompatible shopId or sellerId, return"
            r5.a(r0)     // Catch: all -> 0x0077
        L_0x0081:
            tb.xhv r5 = tb.xhv.INSTANCE     // Catch: all -> 0x0077
            java.lang.Object r5 = kotlin.Result.m1108constructorimpl(r5)     // Catch: all -> 0x0077
            goto L_0x0090
        L_0x0088:
            java.lang.Object r5 = kotlin.b.a(r5)
            java.lang.Object r5 = kotlin.Result.m1108constructorimpl(r5)
        L_0x0090:
            java.lang.Throwable r5 = kotlin.Result.m1111exceptionOrNullimpl(r5)
            if (r5 != 0) goto L_0x0097
            goto L_0x009e
        L_0x0097:
            tb.npp$a r0 = tb.npp.Companion
            java.lang.String r1 = "catching block has error"
            r0.c(r1, r5)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.unp.a(java.lang.String):void");
    }

    public final ShopDataParser b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("cba13806", new Object[]{this});
        }
        return this.f29518a;
    }
}
