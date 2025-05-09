package com.meizu.cloud.pushsdk.c;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.f.g.e;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.util.HashMap;
import java.util.Map;
import tb.k68;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5772a = "b";
    private final HashMap<String, String> b;
    private final HashMap<String, Object> c;
    private final HashMap<String, Object> d;

    /* compiled from: Taobao */
    /* renamed from: com.meizu.cloud.pushsdk.c.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0275b {

        /* renamed from: a  reason: collision with root package name */
        private Context f5773a = null;

        public C0275b a(Context context) {
            this.f5773a = context;
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    private b(C0275b bVar) {
        this.b = new HashMap<>();
        this.c = new HashMap<>();
        this.d = new HashMap<>();
        d();
        if (bVar.f5773a != null) {
            d(bVar.f5773a);
            c(bVar.f5773a);
            b(bVar.f5773a);
            a(bVar.f5773a);
        }
        DebugLogger.i(f5772a, "Subject created successfully.");
    }

    private void d() {
        a("br", Build.BRAND);
        a("dc", Build.MODEL);
        a("ot", Build.VERSION.RELEASE);
        a("ov", Build.DISPLAY);
        a("ll", MzSystemUtils.getCurrentLanguage());
    }

    public Map<String, Object> a() {
        return this.c;
    }

    public Map<String, String> b() {
        return this.b;
    }

    public Map<String, Object> c() {
        return this.d;
    }

    private void a(Context context) {
        a("pn", (Object) context.getPackageName());
        a("pv", (Object) MzSystemUtils.getAppVersionName(context));
        a("pvc", Integer.valueOf(MzSystemUtils.getAppVersionCode(context)));
        a("st", Integer.valueOf(!TextUtils.isEmpty(MzSystemUtils.findReceiver(context, "com.meizu.ups.push.intent.MESSAGE", context.getPackageName())) ? 1 : 0));
    }

    private void b(Context context) {
        b("nt", MzSystemUtils.getNetWorkType(context));
    }

    private void d(Context context) {
        a(k68.KEY_OP, e.c(context));
    }

    public void c(Context context) {
        Point b = e.b(context);
        if (b == null) {
            DebugLogger.e(f5772a, "screen information not available.");
        } else {
            a(EnvironmentSwitcher.SPKEY_SS, b.x, b.y);
        }
    }

    private void a(String str, int i, int i2) {
        this.b.put(str, i + "." + i2);
    }

    private void b(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (!(obj instanceof String) || !((String) obj).isEmpty()) {
                this.d.put(str, obj);
            }
        }
    }

    private void a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (!(obj instanceof String) || !((String) obj).isEmpty()) {
                this.c.put(str, obj);
            }
        }
    }

    private void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.b.put(str, str2);
        }
    }
}
