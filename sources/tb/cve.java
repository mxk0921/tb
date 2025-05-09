package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Boolean f17348a;
    public static volatile Boolean b;

    static {
        t2o.a(491782855);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60bb16ca", new Object[0])).booleanValue();
        }
        if (f17348a == null) {
            synchronized (bve.class) {
                try {
                    if (f17348a == null) {
                        f17348a = Boolean.valueOf(mve.a("disableVideoServiceOptimize", false));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17348a.booleanValue();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[0])).booleanValue();
        }
        return TextUtils.equals("l", m0b.d());
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e71b266d", new Object[0])).booleanValue();
        }
        if (b == null) {
            synchronized (bve.class) {
                try {
                    if (b == null) {
                        b = Boolean.valueOf(mve.a("enableUiRefreshAddView", true));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b.booleanValue();
    }
}
