package com.alibaba.triver.triver_shop.newShop.ext;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$sendAsyncDataPrefetch$3 extends Lambda implements g1a<String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$sendAsyncDataPrefetch$3(Context context) {
        super(1);
        this.$context = context;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$sendAsyncDataPrefetch$3 shopExtKt$sendAsyncDataPrefetch$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$sendAsyncDataPrefetch$3");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(String str) {
        invoke2(str);
        return xhv.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2(java.lang.String r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$sendAsyncDataPrefetch$3.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "2c25509"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            java.lang.String r0 = "prefetchResult"
            tb.ckf.g(r5, r0)
            android.content.Context r0 = r4.$context
            java.lang.String r1 = "TYPE_HIT"
            boolean r1 = tb.ckf.b(r5, r1)     // Catch: all -> 0x002e
            if (r1 != 0) goto L_0x0030
            java.lang.String r1 = "TYPE_MERGE"
            boolean r5 = tb.ckf.b(r5, r1)     // Catch: all -> 0x002e
            if (r5 == 0) goto L_0x0060
            goto L_0x0030
        L_0x002e:
            r5 = move-exception
            goto L_0x0067
        L_0x0030:
            java.lang.String r5 = "async data prefetch hit"
            tb.npp$a r1 = tb.npp.Companion     // Catch: all -> 0x002e
            r1.b(r5)     // Catch: all -> 0x002e
            tb.rop r1 = tb.rop.INSTANCE     // Catch: all -> 0x002e
            com.alibaba.triver.triver_shop.newShop.manager.SingleActivityInstanceController r1 = r1.a()     // Catch: all -> 0x002e
            android.app.Activity r1 = r1.m()     // Catch: all -> 0x002e
            if (r1 != 0) goto L_0x0044
            goto L_0x0058
        L_0x0044:
            boolean r2 = r1 instanceof tb.iop     // Catch: all -> 0x002e
            if (r2 == 0) goto L_0x0058
            tb.iop r1 = (tb.iop) r1     // Catch: all -> 0x002e
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser r1 = r1.d0()     // Catch: all -> 0x002e
            if (r1 != 0) goto L_0x0051
            goto L_0x0058
        L_0x0051:
            java.lang.String r2 = "asyncDataPrefetchHit"
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: all -> 0x002e
            r1.Y2(r2, r3)     // Catch: all -> 0x002e
        L_0x0058:
            com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$sendAsyncDataPrefetch$3$1$2 r1 = new com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$sendAsyncDataPrefetch$3$1$2     // Catch: all -> 0x002e
            r1.<init>(r0, r5)     // Catch: all -> 0x002e
            tb.r54.H(r1)     // Catch: all -> 0x002e
        L_0x0060:
            tb.xhv r5 = tb.xhv.INSTANCE     // Catch: all -> 0x002e
            java.lang.Object r5 = kotlin.Result.m1108constructorimpl(r5)     // Catch: all -> 0x002e
            goto L_0x006f
        L_0x0067:
            java.lang.Object r5 = kotlin.b.a(r5)
            java.lang.Object r5 = kotlin.Result.m1108constructorimpl(r5)
        L_0x006f:
            java.lang.Throwable r5 = kotlin.Result.m1111exceptionOrNullimpl(r5)
            if (r5 != 0) goto L_0x0076
            goto L_0x007d
        L_0x0076:
            tb.npp$a r0 = tb.npp.Companion
            java.lang.String r1 = "catching block has error"
            r0.c(r1, r5)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$sendAsyncDataPrefetch$3.invoke2(java.lang.String):void");
    }
}
