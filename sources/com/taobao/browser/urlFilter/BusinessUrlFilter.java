package com.taobao.browser.urlFilter;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.urlFilter.UrlFilter;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BusinessUrlFilter implements UrlFilter.URLFilterinterface {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BusinessUrlFilter";
    private Handler mhandler;

    static {
        t2o.a(619708626);
        t2o.a(619708629);
    }

    public BusinessUrlFilter(Handler handler) {
        this.mhandler = handler;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    @Override // com.taobao.browser.urlFilter.UrlFilter.URLFilterinterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean doFilter(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.browser.urlFilter.BusinessUrlFilter.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "ebc59a6c"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001f:
            java.lang.String r2 = "m.taobao.com/ww/"
            int r2 = r7.indexOf(r2)
            if (r2 < 0) goto L_0x002f
            android.app.Activity r6 = (android.app.Activity) r6
            boolean r6 = com.taobao.browser.urlFilter.WXUtilsProxy.parseWwURl(r6, r7)
            return r6
        L_0x002f:
            tb.d9b r2 = new tb.d9b
            r2.<init>()
            boolean r2 = r2.a(r7, r6)
            if (r2 == 0) goto L_0x003b
            return r0
        L_0x003b:
            boolean r2 = r6 instanceof android.app.Activity     // Catch: Exception -> 0x0061
            if (r2 == 0) goto L_0x0062
            r2 = r6
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: Exception -> 0x0061
            android.content.Intent r3 = r2.getIntent()     // Catch: Exception -> 0x0061
            if (r3 == 0) goto L_0x0062
            android.content.Intent r3 = r2.getIntent()     // Catch: Exception -> 0x0061
            android.os.Bundle r3 = r3.getExtras()     // Catch: Exception -> 0x0061
            if (r3 == 0) goto L_0x0062
            android.content.Intent r2 = r2.getIntent()     // Catch: Exception -> 0x0061
            android.os.Bundle r2 = r2.getExtras()     // Catch: Exception -> 0x0061
            java.lang.String r3 = "AppLinkISOnNewIntent"
            boolean r2 = r2.getBoolean(r3)     // Catch: Exception -> 0x0061
            goto L_0x0063
        L_0x0061:
        L_0x0062:
            r2 = 0
        L_0x0063:
            if (r2 == 0) goto L_0x006c
            tb.gm2 r2 = tb.fm2.commonConfig
            boolean r2 = r2.k
            if (r2 == 0) goto L_0x006c
            return r1
        L_0x006c:
            com.taobao.tao.shop.common.ShopUrlFilter r2 = new com.taobao.tao.shop.common.ShopUrlFilter
            r2.<init>()
            boolean r2 = r2.b(r7, r6)
            if (r2 == 0) goto L_0x0078
            return r0
        L_0x0078:
            android.content.res.Resources r6 = r6.getResources()
            int r2 = com.taobao.taobao.R.string.settings_url_keyword
            java.lang.String r6 = r6.getString(r2)
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto L_0x0092
            android.os.Handler r6 = r5.mhandler
            r7 = 1102(0x44e, float:1.544E-42)
            r1 = 800(0x320, double:3.953E-321)
            r6.sendEmptyMessageDelayed(r7, r1)
            return r0
        L_0x0092:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.urlFilter.BusinessUrlFilter.doFilter(android.content.Context, java.lang.String):boolean");
    }
}
