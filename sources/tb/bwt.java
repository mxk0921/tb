package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bwt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile long f16689a = a();

    static {
        t2o.a(404750758);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        return (System.currentTimeMillis() * 1000) - (System.nanoTime() / 1000);
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6af642d7", new Object[0])).longValue();
        }
        long nanoTime = f16689a + (System.nanoTime() / 1000);
        if (Math.abs(nanoTime - (System.currentTimeMillis() * 1000)) <= 2000) {
            return nanoTime;
        }
        f16689a = a();
        return f16689a + (System.nanoTime() / 1000);
    }
}
