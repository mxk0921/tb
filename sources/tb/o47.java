package tb;

import android.text.TextUtils;
import io.unicorn.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class o47 {
    public static volatile o47 b = null;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, m5m> f25135a;

    static {
        t2o.a(945815801);
    }

    public o47() {
        HashMap hashMap = new HashMap();
        this.f25135a = hashMap;
        hashMap.put("input", new n5m());
    }

    public static o47 a() {
        if (b == null) {
            synchronized (o47.class) {
                try {
                    if (b == null) {
                        b = new o47();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void b(o5m o5mVar, FlutterJNI flutterJNI) {
        u8x.a("registerPlatformView");
        for (Map.Entry entry : ((HashMap) this.f25135a).entrySet()) {
            ((p5m) o5mVar).c((String) entry.getKey(), (m5m) entry.getValue());
            flutterJNI.registerPlatformView((String) entry.getKey());
        }
        for (String str : ivu.a()) {
            if (!TextUtils.isEmpty(str)) {
                flutterJNI.registerPlatformView(str);
            }
        }
        u8x.b("registerPlatformView");
    }
}
