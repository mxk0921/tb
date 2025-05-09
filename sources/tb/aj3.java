package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class aj3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final aj3 INSTANCE = new aj3();

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, hrs> f15771a = new HashMap<>();

    static {
        t2o.a(815793541);
    }

    public final hrs a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hrs) ipChange.ipc$dispatch("3ad6f5cc", new Object[]{this, str});
        }
        ckf.g(str, "channelSrp");
        return f15771a.get(str);
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a80f83b", new Object[]{this, str});
            return;
        }
        ckf.g(str, "channelSrp");
        f15771a.remove(str);
    }

    public final void c(String str, hrs hrsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdad3adb", new Object[]{this, str, hrsVar});
            return;
        }
        ckf.g(str, "channelSrp");
        ckf.g(hrsVar, "tabPromotionBean");
        f15771a.put(str, hrsVar);
    }
}
