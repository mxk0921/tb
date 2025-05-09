package com.taobao.browser.urlFilter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserActivity;
import com.taobao.tao.shop.common.ShopUrlFilter;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bho;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WVShopUrlFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708637);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String shopFilter(java.lang.String r5, android.content.Intent r6, android.os.Handler r7, final android.content.Context r8, java.util.HashMap<java.lang.String, java.lang.String> r9) {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.browser.urlFilter.WVShopUrlFilter.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0024
            java.lang.String r2 = "8b140089"
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r0 = 1
            r3[r0] = r5
            r5 = 2
            r3[r5] = r6
            r5 = 3
            r3[r5] = r7
            r5 = 4
            r3[r5] = r8
            r5 = 5
            r3[r5] = r9
            java.lang.Object r5 = r1.ipc$dispatch(r2, r3)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x0024:
            android.os.Bundle r7 = r6.getExtras()     // Catch: Exception -> 0x0035
            if (r7 == 0) goto L_0x0036
            android.os.Bundle r6 = r6.getExtras()     // Catch: Exception -> 0x0035
            java.lang.String r7 = "AppLinkISOnNewIntent"
            boolean r6 = r6.getBoolean(r7)     // Catch: Exception -> 0x0035
            goto L_0x0037
        L_0x0035:
        L_0x0036:
            r6 = 0
        L_0x0037:
            if (r6 != 0) goto L_0x0057
            com.taobao.tao.shop.common.ShopUrlFilter r6 = new com.taobao.tao.shop.common.ShopUrlFilter
            r6.<init>()
            boolean r6 = r6.b(r5, r8)
            if (r6 == 0) goto L_0x0056
            tb.lq6 r6 = tb.lq6.a()
            java.lang.String r7 = "afc"
            r6.e(r7, r9)
            boolean r6 = r8 instanceof android.app.Activity
            if (r6 == 0) goto L_0x0056
            android.app.Activity r8 = (android.app.Activity) r8
            r8.finish()
        L_0x0056:
            return r5
        L_0x0057:
            com.taobao.tao.shop.common.ShopUrlFilter r6 = new com.taobao.tao.shop.common.ShopUrlFilter
            r6.<init>()
            java.util.concurrent.atomic.AtomicBoolean r7 = new java.util.concurrent.atomic.AtomicBoolean
            r7.<init>(r0)
            com.taobao.browser.urlFilter.WVShopUrlFilter$1 r9 = new com.taobao.browser.urlFilter.WVShopUrlFilter$1
            r9.<init>()
            boolean r6 = r6.c(r5, r8, r9)
            r7.set(r6)
            boolean r6 = r7.get()
            if (r6 == 0) goto L_0x0075
            java.lang.String r5 = "about:blank"
        L_0x0075:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.urlFilter.WVShopUrlFilter.shopFilter(java.lang.String, android.content.Intent, android.os.Handler, android.content.Context, java.util.HashMap):java.lang.String");
    }

    public boolean urlHitWithCallback(String str, final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f280d8c", new Object[]{this, str, context})).booleanValue();
        }
        ShopUrlFilter shopUrlFilter = new ShopUrlFilter();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        atomicBoolean.set(shopUrlFilter.c(str, context, new bho() { // from class: com.taobao.browser.urlFilter.WVShopUrlFilter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bho
            public void routerFinished() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("722e01e2", new Object[]{this});
                } else if (atomicBoolean.get()) {
                    Context context2 = context;
                    if (context2 instanceof BrowserActivity) {
                        ((BrowserActivity) context2).finish(true);
                    }
                }
            }
        }));
        if (atomicBoolean.get()) {
            return true;
        }
        return false;
    }
}
