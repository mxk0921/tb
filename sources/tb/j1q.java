package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class j1q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "mytaobao";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f21703a = false;
    public static long b = 0;

    static {
        t2o.a(745538213);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0fe60de", new Object[0])).booleanValue();
        }
        f21703a = FestivalMgr.i().v("mytaobao");
        b = System.currentTimeMillis();
        return f21703a;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ab680a3", new Object[0])).booleanValue();
        }
        if (System.currentTimeMillis() - b < 1000) {
            return f21703a;
        }
        return a();
    }
}
