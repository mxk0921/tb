package tb;

import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class p5m implements o5m {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, m5m> f25892a = new HashMap();

    static {
        t2o.a(945815807);
        t2o.a(945815806);
    }

    public m5m a(String str) {
        return (m5m) ((HashMap) this.f25892a).get(str);
    }

    public boolean c(String str, m5m m5mVar) {
        ((HashMap) this.f25892a).put(str, m5mVar);
        return true;
    }

    public static void b() {
    }
}
