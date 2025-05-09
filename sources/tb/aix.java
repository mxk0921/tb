package tb;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class aix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, WVCallBackContext> f15769a = new HashMap();

    static {
        t2o.a(817889335);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r9, boolean r10, boolean r11, boolean r12, com.alibaba.fastjson.JSONObject r13, android.taobao.windvane.jsbridge.WVCallBackContext r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.aix.a(java.lang.String, boolean, boolean, boolean, com.alibaba.fastjson.JSONObject, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }

    public static synchronized void commentCallback(String str, boolean z, boolean z2, boolean z3, JSONObject jSONObject) {
        synchronized (aix.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb199f1", new Object[]{str, new Boolean(z), new Boolean(z2), new Boolean(z3), jSONObject});
            } else if (!TextUtils.isEmpty(str)) {
                Map<String, WVCallBackContext> map = f15769a;
                WVCallBackContext wVCallBackContext = (WVCallBackContext) ((HashMap) map).get(str);
                if (wVCallBackContext != null) {
                    a(str, z, z2, z3, jSONObject, wVCallBackContext);
                    if (!z || (z && !z2)) {
                        ((HashMap) map).remove(str);
                    }
                }
            }
        }
    }

    public static synchronized void registerListener(String str, WVCallBackContext wVCallBackContext) {
        synchronized (aix.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4d90f05", new Object[]{str, wVCallBackContext});
            } else {
                ((HashMap) f15769a).put(str, wVCallBackContext);
            }
        }
    }

    public static synchronized void release(String str) {
        synchronized (aix.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8699358", new Object[]{str});
            } else {
                ((HashMap) f15769a).remove(str);
            }
        }
    }

    public static Pair<String, Uri> sureSessionId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("858cb857", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return new Pair<>(String.valueOf(System.currentTimeMillis()), null);
        }
        return sureSessionId(Uri.parse(str));
    }

    public static synchronized boolean callback(String str, boolean z, boolean z2, JSONObject jSONObject) {
        String str2;
        synchronized (aix.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1695bf9e", new Object[]{str, new Boolean(z), new Boolean(z2), jSONObject})).booleanValue();
            } else if (TextUtils.isEmpty(str)) {
                return false;
            } else {
                WVCallBackContext wVCallBackContext = (WVCallBackContext) ((HashMap) f15769a).get(str);
                if (wVCallBackContext == null) {
                    return false;
                }
                nsw nswVar = new nsw();
                if (z) {
                    str2 = "HY_SUCCESS";
                } else {
                    str2 = "HY_FAILED";
                }
                nswVar.j(str2);
                try {
                    nswVar.b("sessionId", str);
                    if (jSONObject != null && !jSONObject.isEmpty()) {
                        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                            nswVar.a(entry.getKey(), entry.getValue());
                        }
                    }
                } catch (Exception unused) {
                }
                if (!z) {
                    wVCallBackContext.error(nswVar);
                } else if (z2) {
                    wVCallBackContext.successAndKeepAlive(nswVar.m());
                } else {
                    wVCallBackContext.success(nswVar);
                }
                if (!z || (z && !z2)) {
                    ((HashMap) f15769a).remove(str);
                }
                return true;
            }
        }
    }

    public static Pair<String, Uri> sureSessionId(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("cf24c4ae", new Object[]{uri});
        }
        if (uri == null) {
            return new Pair<>(String.valueOf(System.currentTimeMillis()), null);
        }
        String str = vyv.b(uri).get("sessionId");
        if (TextUtils.isEmpty(str)) {
            str = String.valueOf(System.currentTimeMillis());
            uri = uri.buildUpon().appendQueryParameter("sessionId", str).build();
        }
        return new Pair<>(str, uri);
    }
}
