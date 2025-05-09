package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.lp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final tms f28808a = new tms();

        static {
            t2o.a(329252912);
        }

        public static /* synthetic */ tms a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tms) ipChange.ipc$dispatch("a8dc36cd", new Object[0]);
            }
            return f28808a;
        }
    }

    static {
        t2o.a(329252910);
    }

    public static tms b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tms) ipChange.ipc$dispatch("d4776628", new Object[0]);
        }
        return b.a();
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac2ef56f", new Object[]{this})).longValue();
        }
        lp0.d e = lp0.d().e();
        return e.c - e.d;
    }

    public tms() {
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e7d012b", new Object[]{this})).booleanValue();
        }
        String e = zms.e(wms.TS_MEMORY_THRESHOLD, "");
        if (TextUtils.isEmpty(e)) {
            zdh.a("TS.TScheduleMonitor", "isTaskCanPerform[true] >> tsMemoryThreshold is empty");
            return true;
        }
        long a2 = a();
        if (a2 > Long.parseLong(e)) {
            zdh.a("TS.TScheduleMonitor", "isTaskCanPerform[true] >> available memory is " + a2 + ", tsMemoryThreshold is " + e);
            return true;
        }
        zdh.a("TS.TScheduleMonitor", "isTaskCanPerform[false] >> available memory is " + a2 + ", tsMemoryThreshold is " + e);
        return false;
    }
}
