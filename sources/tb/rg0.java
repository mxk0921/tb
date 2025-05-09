package tb;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rg0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION = "action";
    public static final String APPKEY = "appkey";
    public static final String COLDBOOT = "coldBoot";
    public static final String CURRENT_KEY = "currentAppKey";
    public static final String CURRENT_PACKAGE_NAME = "currentPN";
    public static final String H5_URL = "h5Url";
    public static final String JUMP_URL = "jumpUrl";
    public static final String LAUNCHTYPE = "launchType";
    public static final String LINK_MANAGER_SDK = "lmSDK";
    public static final String LINK_MANAGER_SDK_VERSION = "lmSDKV";
    public static final String MODULE = "module";
    public static final String SOURCE = "source";
    public static final String SOURCE_KEY = "sourceAppKey";
    public static final String SOURCE_PACKAGE_NAME = "sourcePN";
    public static final String SOURCE_SDK_VERSION = "sourceSDKV";
    public static final String SOURCE_VC = "sourceVC";
    public static final String TARGET_URL = "targetUrl";
    public static final String UNKNOWN = "unknown";
    public static final String USERID = "userid";

    static {
        t2o.a(467664935);
    }

    public static String a(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c55b1454", new Object[]{qg0Var});
        }
        Map<String, String> map = qg0Var.l;
        if (map != null) {
            return map.get(SOURCE_VC);
        }
        return null;
    }

    public static Map<String, String> b(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d1963702", new Object[]{qg0Var});
        }
        HashMap hashMap = new HashMap();
        if (qg0Var == null) {
            return hashMap;
        }
        String str = "unknown";
        hashMap.put(SOURCE_PACKAGE_NAME, !TextUtils.isEmpty(qg0.D) ? qg0.D : str);
        hashMap.put(CURRENT_PACKAGE_NAME, AfcUtils.m(AfcCustomSdk.h().f10563a));
        Uri uri = qg0Var.m;
        hashMap.put("targetUrl", uri != null ? uri.toString() : str);
        String str2 = qg0Var.h;
        if (str2 == null) {
            str2 = str;
        }
        hashMap.put("source", str2);
        String str3 = qg0Var.f26733a;
        if (str3 == null) {
            str3 = str;
        }
        hashMap.put("sourceAppKey", str3);
        hashMap.put(CURRENT_KEY, AfcCustomSdk.h().b != null ? AfcCustomSdk.h().b : str);
        String a2 = a(qg0Var);
        if (a2 == null) {
            a2 = str;
        }
        hashMap.put(SOURCE_VC, a2);
        hashMap.put(LINK_MANAGER_SDK_VERSION, AfcCustomSdk.SDK_VERSION);
        hashMap.put(SOURCE_SDK_VERSION, qg0Var.c);
        hashMap.put("userid", TextUtils.isEmpty(qg0Var.t) ? str : qg0Var.t);
        hashMap.put(COLDBOOT, TextUtils.isEmpty(qg0Var.u) ? str : qg0Var.u);
        if (!TextUtils.isEmpty(qg0Var.v)) {
            str = qg0Var.v;
        }
        hashMap.put("launchType", str);
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0047;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        tb.vp9.a("linkx", "AfcDataManager === getVisa === visa=" + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(android.content.Intent r4) {
        /*
            java.lang.String r0 = "visa"
            com.android.alibaba.ip.runtime.IpChange r1 = tb.rg0.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r0 = "9cc95685"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r1.ipc$dispatch(r0, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0018:
            java.lang.String r1 = ""
            if (r4 != 0) goto L_0x001d
            return r1
        L_0x001d:
            java.lang.String r2 = r4.getDataString()     // Catch: all -> 0x0030
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: all -> 0x0030
            if (r3 != 0) goto L_0x0032
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: all -> 0x0030
            java.lang.String r1 = r2.getQueryParameter(r0)     // Catch: all -> 0x0030
            goto L_0x0032
        L_0x0030:
            r2 = move-exception
            goto L_0x003d
        L_0x0032:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0047
        L_0x0038:
            java.lang.String r1 = r4.getStringExtra(r0)
            goto L_0x0047
        L_0x003d:
            r2.printStackTrace()     // Catch: all -> 0x005c
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0047
            goto L_0x0038
        L_0x0047:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "AfcDataManager === getVisa === visa="
            r4.<init>(r0)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "linkx"
            tb.vp9.a(r0, r4)
            return r1
        L_0x005c:
            r2 = move-exception
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0066
            r4.getStringExtra(r0)
        L_0x0066:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rg0.c(android.content.Intent):java.lang.String");
    }

    public static void d(Application application, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a690f8f7", new Object[]{application, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appkey", str);
        hashMap.put("fcSDKVersion", str2);
        hashMap.put("appVersion", AfcCustomSdk.h().c);
        hashMap.put(CURRENT_PACKAGE_NAME, AfcUtils.m(application));
        hashMap.put(TBImageFlowMonitor.DATA_FROM_DIMEN, LINK_MANAGER_SDK);
        ah0.d(ah0.ALIBC_FLOWCUSTOMS_INIT, "", "", hashMap);
    }

    public static void e(String str, qg0 qg0Var) {
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18e2c13a", new Object[]{str, qg0Var});
        } else if (qg0Var != null) {
            Map<String, String> b = b(qg0Var);
            if (TextUtils.isEmpty(qg0Var.f26733a)) {
                str2 = "unknown";
            } else {
                str2 = qg0Var.f26733a;
            }
            b.put("appkey", str2);
            if (TextUtils.isEmpty(qg0Var.d)) {
                str3 = "unknown";
            } else {
                str3 = qg0Var.d;
            }
            b.put("action", str3);
            String str5 = u9p.module;
            if (TextUtils.isEmpty(str5)) {
                str5 = "unknown";
            }
            b.put("module", str5);
            if (TextUtils.isEmpty(qg0Var.f)) {
                str4 = "unknown";
            } else {
                str4 = qg0Var.f;
            }
            b.put("h5Url", str4);
            if (TextUtils.isEmpty(str)) {
                str = "unknown";
            }
            b.put(hq9.VISA, str);
            ah0.d(ah0.APPLINK_GATEWAY, "", "", b);
        }
    }
}
