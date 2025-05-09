package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cjz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17107a = false;
    public static boolean b = true;

    static {
        t2o.a(442499268);
    }

    public static synchronized boolean a() {
        synchronized (cjz.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2b09f28b", new Object[0])).booleanValue();
            }
            if (!f17107a) {
                b = o2q.d("disable_sku_native", true);
                f17107a = true;
            }
            return b;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c91e4365", new Object[0])).booleanValue();
        }
        return !a();
    }
}
