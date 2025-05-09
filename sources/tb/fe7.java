package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fe7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f19232a;
    public static ITrackAdapter b;

    public static ITrackAdapter a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrackAdapter) ipChange.ipc$dispatch("22f4c448", new Object[0]);
        }
        return b;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[0])).booleanValue();
        }
        return f19232a;
    }

    public static void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("499035db", new Object[]{new Boolean(z)});
        } else {
            f19232a = z;
        }
    }

    public static void d(ITrackAdapter iTrackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf672aa", new Object[]{iTrackAdapter});
        } else {
            b = iTrackAdapter;
        }
    }
}
