package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VThread;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uiw<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final WeakHashMap<Thread, HashMap<uiw<?>, Object>> f29408a = new WeakHashMap<>();

    static {
        t2o.a(969932817);
    }

    public T a() {
        HashMap<uiw<?>, Object> hashMap;
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
        }
        Thread currentVirtualThread = VThread.currentVirtualThread();
        WeakHashMap<Thread, HashMap<uiw<?>, Object>> weakHashMap = f29408a;
        synchronized (weakHashMap) {
            hashMap = weakHashMap.get(currentVirtualThread);
        }
        if (hashMap == null || (t = (T) hashMap.get(this)) == null) {
            return e();
        }
        return t;
    }

    public T b() {
        throw null;
    }

    public void c() {
        HashMap<uiw<?>, Object> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41689b0b", new Object[]{this});
            return;
        }
        Thread currentVirtualThread = VThread.currentVirtualThread();
        WeakHashMap<Thread, HashMap<uiw<?>, Object>> weakHashMap = f29408a;
        synchronized (weakHashMap) {
            hashMap = weakHashMap.get(currentVirtualThread);
        }
        if (hashMap != null) {
            hashMap.remove(this);
        }
    }

    public void d(T t) {
        HashMap<uiw<?>, Object> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6236785", new Object[]{this, t});
            return;
        }
        Thread currentVirtualThread = VThread.currentVirtualThread();
        WeakHashMap<Thread, HashMap<uiw<?>, Object>> weakHashMap = f29408a;
        synchronized (weakHashMap) {
            try {
                hashMap = weakHashMap.get(currentVirtualThread);
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    weakHashMap.put(currentVirtualThread, hashMap);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        hashMap.put(this, t);
    }

    public final T e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ec5fbedc", new Object[]{this});
        }
        T b = b();
        d(b);
        return b;
    }
}
