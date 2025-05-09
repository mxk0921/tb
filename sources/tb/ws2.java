package tb;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ws2 {
    public static volatile ws2 c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f30885a;
    public final Map<String, gs2> b = new ConcurrentHashMap();

    public ws2(Context context) {
        this.f30885a = context;
    }

    public static ws2 b(Context context) {
        if (c == null) {
            synchronized (ws2.class) {
                try {
                    if (c == null) {
                        c = new ws2(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public gs2 a(String str) {
        return (gs2) ((ConcurrentHashMap) this.b).get(str);
    }

    public gs2 c(String str, it2 it2Var) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        if (!concurrentHashMap.containsKey(str)) {
            gs2 gs2Var = new gs2(it2Var);
            concurrentHashMap.put(str, gs2Var);
            return gs2Var;
        }
        throw new IllegalStateException("Handler key [" + str + "] has been contained!");
    }

    public <T extends z2o> gs2 d(String str, T t) {
        if (t instanceof rlp) {
            return c(str, new qlp((rlp) t, this.f30885a));
        }
        throw new IllegalArgumentException("Unsupported template!");
    }
}
