package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class m0v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INTENT_CONFIG_CHANGE = "com.alibaba.analytics.config.change";
    public static final String INTENT_EXTRA_KEY = "key";
    public static final String INTENT_EXTRA_VALUE = "value";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f23704a = new HashMap();

    static {
        t2o.a(962592833);
    }

    public static synchronized void a() {
        synchronized (m0v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af74316d", new Object[0]);
                return;
            }
            for (Map.Entry entry : ((HashMap) f23704a).entrySet()) {
                b((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public static synchronized void b(String str, String str2) {
        synchronized (m0v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10d55640", new Object[]{str, str2});
            } else if (u51.k(vyp.i().g())) {
                Context g = o2w.k().g();
                if (g == null) {
                    g = wu3.c().b();
                }
                if (g != null) {
                    if (TextUtils.isEmpty(str2) || str2.length() <= 100000) {
                        ((HashMap) f23704a).put(str, str2);
                        String packageName = g.getPackageName();
                        nhh.f("UTConfigMgr", "postServerConfig packageName", packageName, "key", str, "value", str2);
                        Intent intent = new Intent(INTENT_CONFIG_CHANGE);
                        intent.setPackage(packageName);
                        intent.putExtra("key", str);
                        intent.putExtra("value", str2);
                        g.sendBroadcast(intent);
                    }
                }
            }
        }
    }
}
