package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class uca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29291a;
    public static final ConcurrentHashMap<String, ns2<?>> b = new ConcurrentHashMap<>();

    public static <T> Pair<Boolean, T> a(String str) {
        Pair<Boolean, T> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{str});
        }
        gwt gwtVar = new gwt();
        if (f29291a) {
            ns2<?> ns2Var = b.get(str);
            if (ns2Var != null) {
                Pair<Boolean, T> pair2 = (Pair<Boolean, T>) ns2Var.a(gwtVar);
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                gwt.b(gwtVar, timeUnit, "Cache", "auto got " + str + " :");
                return pair2;
            }
            TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
            gwt.d(gwtVar, timeUnit2, "Cache", "auto missing " + str + " :");
            return new Pair<>(Boolean.FALSE, null);
        }
        ConcurrentHashMap<String, ns2<?>> concurrentHashMap = b;
        synchronized (concurrentHashMap) {
            try {
                ns2<?> ns2Var2 = concurrentHashMap.get(str);
                if (ns2Var2 != null) {
                    pair = (Pair<Boolean, T>) ns2Var2.a(gwtVar);
                    TimeUnit timeUnit3 = TimeUnit.MICROSECONDS;
                    gwt.b(gwtVar, timeUnit3, "Cache", "auto got " + str + " :");
                } else {
                    TimeUnit timeUnit4 = TimeUnit.MICROSECONDS;
                    gwt.d(gwtVar, timeUnit4, "Cache", "auto missing " + str + " :");
                    pair = new Pair<>(Boolean.FALSE, null);
                }
            } finally {
            }
        }
        return pair;
    }

    public static <V> void b(os2<V> os2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47897a9", new Object[]{os2Var});
        } else if (f29291a) {
            ns2<?> b2 = ns2.b(os2Var);
            if (b.putIfAbsent(os2Var.f25610a, b2) == null) {
                b2.e();
                pgh.i("Cache", "ValueCache: +" + b2);
            }
        } else {
            ConcurrentHashMap<String, ns2<?>> concurrentHashMap = b;
            synchronized (concurrentHashMap) {
                try {
                    if (concurrentHashMap.get(os2Var.f25610a) == null) {
                        ns2<?> b3 = ns2.b(os2Var);
                        concurrentHashMap.put(b3.c, b3);
                        b3.e();
                        pgh.i("Cache", "ValueCache: +" + b3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static <T> T c(String str) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6e4e661f", new Object[]{str});
        }
        Pair a2 = a(str);
        if (((Boolean) a2.first).booleanValue()) {
            return (T) a2.second;
        }
        return null;
    }
}
