package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class bzn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Object f16741a = new Object();
    public static final dgd b = new yc8();
    public static volatile dgd c;
    public static volatile boolean d;

    static {
        try {
            System.out.println("RemoteSo.Initializer.name=".concat(z8f.class.getName()));
        } catch (Throwable th) {
            System.err.println("RemoteSo.Initializer not available.\n" + th);
            d = true;
        }
    }

    public static dgd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dgd) ipChange.ipc$dispatch("8c50eac3", new Object[0]);
        }
        if (d) {
            return b;
        }
        dgd dgdVar = c;
        if (dgdVar != null) {
            return dgdVar;
        }
        synchronized (f16741a) {
            try {
                dgd dgdVar2 = c;
                if (dgdVar2 != null) {
                    return dgdVar2;
                }
                dgd a2 = z8f.a();
                if (a2 == null) {
                    return b;
                }
                c = a2;
                return a2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static dbn b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dbn) ipChange.ipc$dispatch("7be8c776", new Object[0]);
        }
        return a().a();
    }

    public static dgd c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dgd) ipChange.ipc$dispatch("2711eab", new Object[0]);
        }
        return a();
    }

    public static hbn d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hbn) ipChange.ipc$dispatch("88ace186", new Object[0]);
        }
        return a().c();
    }
}
