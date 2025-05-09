package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.monitor.Monitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class q19 implements Monitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Monitor f26444a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static final q19 INSTANCE = new q19();

        static {
            t2o.a(407896105);
        }
    }

    static {
        t2o.a(407896103);
        t2o.a(407896106);
    }

    public static q19 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q19) ipChange.ipc$dispatch("3a5c467b", new Object[0]);
        }
        return b.INSTANCE;
    }

    public Monitor a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Monitor) ipChange.ipc$dispatch("afa8d2d3", new Object[]{this});
        }
        return this.f26444a;
    }

    public void c(Monitor monitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26aa467", new Object[]{this, monitor});
        } else if (monitor == null) {
            uhh.f(new IllegalArgumentException("monitor is null"));
        } else {
            this.f26444a = monitor;
        }
    }

    @Override // com.taobao.android.boutique.fastsp.monitor.Monitor
    public void commit(String str, String str2, String str3, String str4, String str5, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f21ad414", new Object[]{this, str, str2, str3, str4, str5, new Long(j)});
            return;
        }
        uhh.b("FastSpMonitor", str, str2, str3, str4, str5, Long.valueOf(j));
        this.f26444a.commit(str, str2, str3, str4, str5, j);
    }

    public q19() {
        this.f26444a = new m19();
    }
}
