package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bu3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f16634a = 0;

    static {
        t2o.a(806355849);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52efe4a5", new Object[0])).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - f16634a;
        if (0 < j && j < 1000) {
            return true;
        }
        f16634a = currentTimeMillis;
        return false;
    }
}
