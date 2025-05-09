package com.alibaba.wireless.aliprivacy;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.security.realidentity.g4;
import com.alibaba.wireless.aliprivacy.PrivacyAuthGetParam;
import com.alibaba.wireless.aliprivacy.PrivacyAuthSetParam;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.cr3;
import tb.cxe;
import tb.eu4;
import tb.ezc;
import tb.g01;
import tb.jpb;
import tb.m8d;
import tb.osk;
import tb.rfp;
import tb.rzl;
import tb.ut4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AliPrivacyCore {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQUEST_CODE_OPEN_AUTH_SETTINGS = 19999;
    public static final String SETTINGS_CONFIG_KEY = "openSettings";
    public static final String STATUS_CONFIG_KEY = "checkStatus";

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f3382a = new HashSet();

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d03946", new Object[]{str, str2});
            return;
        }
        String str3 = str + "_" + str2;
        List g = g();
        if (g == null) {
            g = new ArrayList();
        }
        if (!g.contains(str3)) {
            g.add(str3);
            rzl.d().l(ut4.g(g));
        }
    }

    public static String b(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e58ff54a", new Object[]{context});
        }
        try {
            str = UTDevice.getUtdid(context);
        } catch (Throwable th) {
            g01.b("AliPrivacyCore", "getCurrentLoginUserId error", th);
            str = null;
        }
        return TextUtils.isEmpty(str) ? "nonUtdId" : str;
    }

    public static AuthStatus c(Activity activity, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthStatus) ipChange.ipc$dispatch("bcad1fe0", new Object[]{activity, strArr});
        }
        g01.a("AliPrivacyCore", "getAuthStatus:" + activity);
        return o(activity, strArr, "activity is null");
    }

    public static AuthStatus d(Context context, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthStatus) ipChange.ipc$dispatch("2b844d08", new Object[]{context, strArr});
        }
        return o(context, strArr, "context is null");
    }

    public static String e(Context context) {
        ClipData.Item f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6b6cf78", new Object[]{context});
        }
        if (context == null || (f = f(context)) == null || f.getText() == null) {
            return null;
        }
        return f.getText().toString();
    }

    public static List<String> g() {
        List<String> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c1140e49", new Object[0]);
        }
        String f2 = rzl.d().f();
        if (!TextUtils.isEmpty(f2) && (f = ut4.f(f2)) != null && !f.isEmpty()) {
            return f;
        }
        return null;
    }

    public static void h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4139cc3b", new Object[]{context, str});
        } else if (context != null && !TextUtils.isEmpty(str)) {
            g01.a("AliPrivacyCore", "Scene auth data:" + str);
            Map e = ut4.e(str);
            if (e != null && !e.isEmpty()) {
                t(context, e);
            }
        }
    }

    public static void i(Context context, jpb jpbVar, ezc ezcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdad1fcf", new Object[]{context, jpbVar, ezcVar});
        } else if (!ut4.c(context, "context is null") && !ut4.c(jpbVar, "configAdapter is null")) {
            rfp.b(context, new cxe.b(jpbVar).b(ezcVar).a());
            g01.a("AliPrivacyCore", "AliPrivacyCore init success");
        }
    }

    public static boolean j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5e96c55", new Object[]{context, str})).booleanValue();
        }
        x(context);
        return ((HashSet) f3382a).contains(str);
    }

    public static boolean k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f4a9019", new Object[]{str, str2})).booleanValue();
        }
        String str3 = str + "_" + str2;
        List<String> g = g();
        if (g == null) {
            return false;
        }
        return g.contains(str3);
    }

    public static void l(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943a89b4", new Object[]{map});
            return;
        }
        rfp.c(map.get(SETTINGS_CONFIG_KEY));
        cr3.c(map.get("checkStatus"));
    }

    public static void m(Context context, osk oskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508c6464", new Object[]{context, oskVar});
        } else {
            rfp.i(context, 19999, oskVar);
        }
    }

    public static boolean n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d49d0205", new Object[]{context})).booleanValue();
        }
        return rzl.d().b();
    }

    public static Map<String, Boolean> p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ee84bfeb", new Object[]{str});
        }
        String e = rzl.d().e(str);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        return ut4.e(e);
    }

    public static Map<String, AuthStatus> r(Context context, PrivacyAuthGetParam.a aVar) {
        AuthStatus authStatus;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("87ef4dc6", new Object[]{context, aVar});
        }
        HashMap hashMap = new HashMap();
        Map<String, Boolean> p = p(aVar.b());
        if (p == null || p.isEmpty()) {
            String[] a2 = aVar.a();
            int length = a2.length;
            while (i < length) {
                hashMap.put(a2[i], AuthStatus.DEFAULT);
                i++;
            }
            return hashMap;
        }
        String[] a3 = aVar.a();
        int length2 = a3.length;
        while (i < length2) {
            String str = a3[i];
            if (j(context, str)) {
                Boolean bool = p.get(str);
                if (!p.containsKey(str) || bool == null) {
                    hashMap.put(str, AuthStatus.DEFAULT);
                } else {
                    if (bool.booleanValue()) {
                        authStatus = AuthStatus.GRANTED;
                    } else {
                        authStatus = AuthStatus.DENIED;
                    }
                    hashMap.put(str, authStatus);
                }
            } else {
                hashMap.put(str, AuthStatus.DENIED);
            }
            i++;
        }
        return hashMap;
    }

    public static void s(Map<String, JSONArray> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c1a7ab", new Object[]{map});
            return;
        }
        for (String str : map.keySet()) {
            String str2 = "android.permission." + str;
            JSONArray jSONArray = map.get(str);
            if (jSONArray != null && !jSONArray.isEmpty()) {
                for (Object obj : jSONArray.toArray()) {
                    a((String) obj, str2);
                }
            }
        }
    }

    public static boolean u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e4083", new Object[]{new Boolean(z)})).booleanValue();
        }
        return rzl.d().k(z);
    }

    public static PrivacyCode v(Context context, PrivacyAuthSetParam privacyAuthSetParam, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrivacyCode) ipChange.ipc$dispatch("526f8de9", new Object[]{context, privacyAuthSetParam, str});
        }
        if (context == null || privacyAuthSetParam == null || privacyAuthSetParam.getAuthSetParams() == null || privacyAuthSetParam.getAuthSetParams().isEmpty()) {
            PrivacyCode privacyCode = PrivacyCode.ERROR_INPUT_PARAMS;
            w(context, true, privacyCode, ut4.g(privacyAuthSetParam), str);
            return privacyCode;
        }
        for (PrivacyAuthParam privacyAuthParam : privacyAuthSetParam.getAuthSetParams()) {
            if (TextUtils.isEmpty(privacyAuthParam.getSceneCode())) {
                PrivacyCode privacyCode2 = PrivacyCode.ERROR_EMPTY_SCENE_CODE;
                w(context, true, privacyCode2, ut4.g(privacyAuthSetParam), str);
                return privacyCode2;
            }
            Map<String, Boolean> p = p(privacyAuthParam.getSceneCode());
            if (p != null && !p.isEmpty()) {
                Map d = ut4.d(p, privacyAuthParam.getPermissions());
                if (d == null) {
                    PrivacyCode privacyCode3 = PrivacyCode.ERROR_EMPTY_PERMISSIONS;
                    w(context, true, privacyCode3, ut4.g(privacyAuthSetParam), str);
                    return privacyCode3;
                } else if (!rzl.d().j(privacyAuthParam.getSceneCode(), ut4.g(d))) {
                    PrivacyCode privacyCode4 = PrivacyCode.ERROR_WRITE_CACHE;
                    w(context, true, privacyCode4, ut4.g(privacyAuthSetParam), str);
                    return privacyCode4;
                }
            } else if (!rzl.d().j(privacyAuthParam.getSceneCode(), ut4.g(privacyAuthParam.getPermissions()))) {
                PrivacyCode privacyCode5 = PrivacyCode.ERROR_WRITE_CACHE;
                w(context, true, privacyCode5, ut4.g(privacyAuthSetParam), str);
                return privacyCode5;
            }
        }
        PrivacyCode privacyCode6 = PrivacyCode.SUCCESS;
        w(context, true, privacyCode6, ut4.g(privacyAuthSetParam), str);
        return privacyCode6;
    }

    public static void w(Context context, boolean z, PrivacyCode privacyCode, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e1531", new Object[]{context, new Boolean(z), privacyCode, str, str2});
        } else if (z) {
            eu4.c(str2, str, privacyCode.getCode(), b(context));
        } else {
            eu4.a(str2, str, b(context));
        }
    }

    public static synchronized void x(Context context) {
        synchronized (AliPrivacyCore.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5d0bfd0", new Object[]{context});
                return;
            }
            Set<String> set = f3382a;
            if (((HashSet) set).isEmpty()) {
                set.addAll(Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions));
            }
        }
    }

    public static ClipData.Item f(Context context) {
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClipData.Item) ipChange.ipc$dispatch("aa14d185", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            if (n(context) && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() > 0) {
                return primaryClip.getItemAt(0);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static List<PrivacyAuthResult> q(Context context, PrivacyAuthGetParam privacyAuthGetParam, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f6aefc66", new Object[]{context, privacyAuthGetParam, str});
        }
        if (privacyAuthGetParam == null || privacyAuthGetParam.getAuthListParams() == null || privacyAuthGetParam.getAuthListParams().isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (PrivacyAuthGetParam.a aVar : privacyAuthGetParam.getAuthListParams()) {
            if (aVar.a() != null && !TextUtils.isEmpty(aVar.b())) {
                PrivacyAuthResult privacyAuthResult = new PrivacyAuthResult();
                privacyAuthResult.setSceneCode(aVar.b());
                privacyAuthResult.setPermissions(r(context, aVar));
                arrayList.add(privacyAuthResult);
            }
        }
        w(context, false, PrivacyCode.SUCCESS, ut4.g(arrayList), str);
        return arrayList;
    }

    public static AuthStatus o(Context context, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthStatus) ipChange.ipc$dispatch("da49b266", new Object[]{context, strArr, str});
        }
        if (ut4.c(context, str)) {
            return AuthStatus.UNKNOWN;
        }
        if (strArr == null || strArr.length == 0) {
            return AuthStatus.UNKNOWN;
        }
        g01.a("AliPrivacyCore", "permission:" + Arrays.toString(strArr));
        m8d b = cr3.a().b();
        for (String str2 : strArr) {
            AuthStatus a2 = b.a(context, str2);
            if (a2 != AuthStatus.GRANTED) {
                return a2;
            }
        }
        return AuthStatus.GRANTED;
    }

    public static void t(Context context, Map<String, JSONArray> map) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e72458b", new Object[]{context, map});
        } else if (map != null && !map.isEmpty()) {
            PrivacyAuthSetParam.a aVar = new PrivacyAuthSetParam.a();
            for (String str : map.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    String str2 = "android.permission." + str;
                    if (d(context, new String[]{str2}) == AuthStatus.GRANTED && (jSONArray = map.get(str)) != null && !jSONArray.isEmpty()) {
                        for (Object obj : jSONArray.toArray()) {
                            String str3 = (String) obj;
                            List<PrivacyAuthResult> q = q(context, new PrivacyAuthGetParam.b().b(str3, new String[]{str2}).c(), g4.a.f2721a);
                            if (q != null && !q.isEmpty()) {
                                for (PrivacyAuthResult privacyAuthResult : q) {
                                    if (!k(str3, str2) && privacyAuthResult.getPermissions().get(str2) == AuthStatus.DEFAULT) {
                                        aVar.b(str3, new HashMap<String, Boolean>(str2) { // from class: com.alibaba.wireless.aliprivacy.AliPrivacyCore.2
                                            public final /* synthetic */ String val$localAndroidPermission;

                                            {
                                                this.val$localAndroidPermission = str2;
                                                put(str2, Boolean.TRUE);
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    }
                }
            }
            s(map);
            if (!aVar.d()) {
                eu4.b(g4.a.f2721a, ut4.g(aVar.c()), v(context, aVar.c(), g4.a.f2721a).getCode(), b(context));
            }
        }
    }
}
