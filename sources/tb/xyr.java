package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xyr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714427);
    }

    public static int a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2db37", new Object[]{context, new Integer(i)})).intValue();
        }
        int t = s6o.t(context) - i;
        if (vyr.a()) {
            int e = p91.e();
            ir9.b("TBVideoListUtils", "PickPreloadControllerNew,测量组件宽高时适配底部虚拟导航栏，tabBarParentHeight：" + e);
            if (e > 0) {
                t = e - i;
            } else {
                ir9.b("TBVideoListUtils", "--温启动时序问题，架构组tabBar高度返回为零");
            }
        }
        ir9.b("TBVideoListUtils", "PickPreloadControllerNew,测量组件宽高结果，availableHeight：" + t);
        return t;
    }

    public static JSONObject d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8747ddac", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("extParams");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        try {
            return JSON.parseObject(queryParameter);
        } catch (Exception e) {
            ir9.b("TBVideoListUtils", "PickPreloadControllerNew,parseExtParams" + e.getMessage());
            return null;
        }
    }

    public static boolean b(Uri uri, String str, String str2, String str3) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eac3f9f2", new Object[]{uri, str, str2, str3})).booleanValue();
        }
        if (uri == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.equals(str, "more")) {
            JSONObject d = d(uri);
            if (!sz3.b(d) && TextUtils.equals(nwv.I(d.get("tabItemId"), null), sj4.TAB2_CONTAINER_TYPE_LIVE_LARGE)) {
                z = true;
            }
            if (TextUtils.equals(str2, sj4.TAB2_CONTAINER_TYPE_LIVE_LARGE)) {
                z = true;
            }
        }
        if (TextUtils.equals(str, sj4.TAB2_CONTAINER_TYPE_LIVE_LARGE)) {
            return true;
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
        if (r8.equals("video") == false) goto L_0x003f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(java.lang.String r7, java.lang.String r8) {
        /*
            r0 = 1
            r1 = 2
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.xyr.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "e4ba1f96"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            r1[r0] = r8
            java.lang.Object r7 = r3.ipc$dispatch(r4, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001c:
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 != 0) goto L_0x0070
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r3 = "tabid"
            java.lang.String r3 = r7.getQueryParameter(r3)
            java.lang.String r4 = "tabItemId"
            java.lang.String r4 = r7.getQueryParameter(r4)
            r8.hashCode()
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -972678799: goto L_0x0057;
                case 112202875: goto L_0x004d;
                case 1020444111: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            r0 = -1
            goto L_0x0062
        L_0x0041:
            java.lang.String r0 = "livelarge"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x004b
            goto L_0x003f
        L_0x004b:
            r0 = 2
            goto L_0x0062
        L_0x004d:
            java.lang.String r1 = "video"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0062
            goto L_0x003f
        L_0x0057:
            java.lang.String r0 = "newFollow"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0061
            goto L_0x003f
        L_0x0061:
            r0 = 0
        L_0x0062:
            switch(r0) {
                case 0: goto L_0x006b;
                case 1: goto L_0x006b;
                case 2: goto L_0x0066;
                default: goto L_0x0065;
            }
        L_0x0065:
            goto L_0x0070
        L_0x0066:
            boolean r7 = b(r7, r3, r4, r8)
            return r7
        L_0x006b:
            boolean r7 = android.text.TextUtils.equals(r3, r8)
            return r7
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xyr.c(java.lang.String, java.lang.String):boolean");
    }
}
