package tb;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g5v {

    /* renamed from: a  reason: collision with root package name */
    public static volatile g5v f19743a;
    public static boolean b;

    public static g5v c() {
        if (f19743a == null) {
            synchronized (g5v.class) {
                try {
                    if (f19743a == null) {
                        f19743a = new g5v();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19743a;
    }

    public static boolean d() {
        return b;
    }

    public final gs2 a(Context context, String str, String str2) {
        ws2 b2 = ws2.b(context.getApplicationContext());
        gs2 a2 = b2.a("KEY_CACHE_UAID_TRACKER");
        if (a2 != null) {
            return a2;
        }
        return b2.d("KEY_CACHE_UAID_TRACKER", new rlp(1, false, "UAID_TRACKER_DATA", str2 + str));
    }

    public String b(Context context, String str, String str2) {
        String a2 = a(context, str, str2).a();
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a2);
            long j = jSONObject.getLong("expiredTime");
            boolean z = jSONObject.getBoolean("isUsable");
            if (j > System.currentTimeMillis() && !z) {
                return jSONObject.getJSONObject("tokens").toString();
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public void e(boolean z) {
        b = z;
    }

    public void g(Context context, String str, String str2) {
        gs2 a2 = a(context, str, str2);
        try {
            JSONObject jSONObject = new JSONObject(a2.a());
            jSONObject.put("isUsable", true);
            a2.b(jSONObject.toString());
        } catch (JSONException unused) {
        }
    }

    public void f(String str, String str2, String str3) {
    }
}
