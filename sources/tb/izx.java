package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class izx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ScheduledThreadPoolExecutor f21670a;
    public static volatile ScheduledThreadPoolExecutor b;
    public static volatile ScheduledThreadPoolExecutor c;

    static {
        t2o.a(499122199);
    }

    public static ScheduledThreadPoolExecutor a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("f6ff4fcf", new Object[0]);
        }
        if (c == null) {
            c = of.a(1, "alive-main");
        }
        return c;
    }

    public static ScheduledThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("111ace6e", new Object[0]);
        }
        if (f21670a == null) {
            f21670a = of.a(3, "alive-schedule");
        }
        return f21670a;
    }
}
