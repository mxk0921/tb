package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sh7 implements agd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final RSoLog.a d = RSoLog.e("dev-puller");

    /* renamed from: a  reason: collision with root package name */
    public final agd f28051a;
    public final cgd b;
    public volatile long c = -1;

    public sh7(agd agdVar, cgd cgdVar) {
        this.f28051a = agdVar;
        this.b = cgdVar;
    }

    @Override // tb.agd
    public void a(String str, nan nanVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202931b2", new Object[]{this, str, nanVar});
            return;
        }
        e(str, 2);
        this.f28051a.a(str, nanVar);
    }

    @Override // tb.agd
    public pan b(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("74404968", new Object[]{this, str});
        }
        e(str, 0);
        return this.f28051a.b(str);
    }

    @Override // tb.agd
    public pan c(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("f3fef1e3", new Object[]{this, str});
        }
        e(str, 1);
        f(str);
        return this.f28051a.c(str);
    }

    public final long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf5bc27b", new Object[]{this})).longValue();
        }
        if (this.c == -1) {
            this.c = Looper.getMainLooper().getThread().getId();
            RSoLog.a aVar = d;
            aVar.a("lazyGetMainThreadId, id = " + this.c);
        }
        return this.c;
    }

    public final void e(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe3edf3", new Object[]{this, str, new Integer(i)});
            return;
        }
        String d2 = this.b.d("key_dev_track_call_stack_libs", "");
        if (!trq.c(d2)) {
            if (!d2.contains(str + "_" + i)) {
                if (!d2.contains(str + "_all")) {
                    return;
                }
            }
            Thread a2 = qbn.a();
            String a3 = uos.a(a2.getStackTrace());
            RSoLog.a aVar = d;
            aVar.a("trackCallStack_" + str + "," + a2.getName() + "=" + a3);
        }
    }

    public final void f(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c898ddd", new Object[]{this, str});
            return;
        }
        Thread a2 = qbn.a();
        if (a2.getId() == d()) {
            String d2 = this.b.d("key_dev_main_sync_monitor_libs", "");
            if (!trq.c(d2)) {
                if (trq.a(d2, str) || trq.a(d2, "all")) {
                    if (this.b.a("key_dev_main_sync_stacktrace_enabled", false)) {
                        str2 = uos.a(a2.getStackTrace());
                    } else {
                        str2 = "release_skipped";
                    }
                    rbn.e("trackMainThreadCall_" + str, a2.getName() + "=" + str2);
                }
            }
        }
    }
}
