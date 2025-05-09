package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dng {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f17965a = new AtomicBoolean(false);
    public static long b = 0;
    public static long c = 0;
    public static long d = 0;
    public static long e = 0;

    static {
        t2o.a(939524116);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3221b837", new Object[0]);
            return;
        }
        d = 0L;
        e = 0L;
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9a5059b", new Object[0])).longValue();
        }
        return d;
    }

    public static long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1835dabb", new Object[0])).longValue();
        }
        return e - d;
    }

    public static long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9e80769", new Object[0])).longValue();
        }
        return e;
    }

    public static long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f56412", new Object[0])).longValue();
        }
        return b;
    }

    public static long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62db97a0", new Object[0])).longValue();
        }
        return c;
    }

    public static void g(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else {
            j();
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66c5fe4", new Object[0]);
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f17965a;
            if (!atomicBoolean.get()) {
                d = System.currentTimeMillis();
                System.loadLibrary("ultron");
                e = System.currentTimeMillis();
                atomicBoolean.set(true);
                new StringBuilder("LibUtils.innerLoadLibUltron,cost:").append(e - d);
            } else {
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b38aa394", new Object[0])).booleanValue();
        }
        return f17965a.get();
    }

    public static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205bb79a", new Object[0]);
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f17965a;
            if (!atomicBoolean.get()) {
                b = System.currentTimeMillis();
                System.loadLibrary("ultron");
                c = System.currentTimeMillis();
                atomicBoolean.set(true);
                new StringBuilder("LibUtils.loadLibUltron,cost:").append(c - b);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
