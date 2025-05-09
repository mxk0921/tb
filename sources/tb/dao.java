package tb;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class dao {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Float> f17685a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final dao f17686a = new dao();

        static {
            t2o.a(813694992);
        }
    }

    static {
        t2o.a(813694990);
    }

    public static dao b() {
        return b.f17686a;
    }

    public float a(String str) {
        Float f = (Float) ((ConcurrentHashMap) this.f17685a).get(str);
        if (f != null) {
            return Math.min(f.floatValue(), 1.0f);
        }
        return 1.0f;
    }

    public void c(String str, float f) {
        Map<String, Float> map = this.f17685a;
        if (f < 0.0f || f > 1.0f) {
            ((ConcurrentHashMap) map).put(str, Float.valueOf(1.0f));
            return;
        }
        ((ConcurrentHashMap) map).put(str, Float.valueOf(f));
    }

    public dao() {
        this.f17685a = new ConcurrentHashMap();
    }
}
