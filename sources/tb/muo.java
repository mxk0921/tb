package tb;

import android.os.Looper;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class muo<T, R> implements fft<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long c = 0;
    public long d = -1;
    public long e = -1;
    public int f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Queue<vct<T, R>> f24318a = new LinkedBlockingDeque(1);
    public final boolean b = true;

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd3330a", new Object[]{this})).longValue();
        }
        long j = this.e;
        if (j == -1) {
            return 0L;
        }
        return j - this.d;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203e517", new Object[]{this, str});
            return;
        }
        Dispatchers.a("CurrentStage", str);
        Dispatchers.a("EnterStage_" + str, String.valueOf(SystemClock.uptimeMillis()));
        whh.a("SchedulerDeffer", "enter stage " + str);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606a9d8", new Object[]{this, str});
            return;
        }
        Dispatchers.a("CurrentStage", str + "Leave");
        StringBuilder sb = new StringBuilder("LeaveStage_");
        sb.append(str);
        Dispatchers.a(sb.toString(), String.valueOf(SystemClock.uptimeMillis()));
        whh.a("SchedulerDeffer", "leave stage " + str);
    }

    public boolean d(vct<T, R> vctVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7874e61e", new Object[]{this, vctVar})).booleanValue();
        }
        return ((LinkedBlockingDeque) this.f24318a).offer(vctVar);
    }

    public void e(vct<T, R> vctVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e468c279", new Object[]{this, vctVar});
        } else {
            ((LinkedBlockingDeque) this.f24318a).offer(vctVar);
        }
    }

    public void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9422f161", new Object[]{this, new Long(j)});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        this.d = uptimeMillis;
        this.e = uptimeMillis;
        this.c = j;
    }

    public vct<T, R> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vct) ipChange.ipc$dispatch("81ce6653", new Object[]{this});
        }
        return (vct) ((LinkedBlockingDeque) this.f24318a).poll();
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52b7d389", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void i(ExecutorService executorService, Collection<T> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67bd323e", new Object[]{this, executorService, collection});
            return;
        }
        long a2 = a();
        whh.a("SchedulerDeffer", "{ timeoutCount=" + this.f + ", elapsedTimeMillis=" + a2 + "ms, taskPollStatus=" + executorService + ", processingTasks=" + collection + " }");
        StringBuilder sb = new StringBuilder();
        sb.append(a2);
        sb.append("ms");
        Dispatchers.a("ElapsedTimeMillis", sb.toString());
        Dispatchers.a("PendingTasks", collection.toString());
        Dispatchers.a("SchedulerPool", executorService.toString());
        Dispatchers.a("TimeoutCount", String.valueOf(this.f));
        if (a2 >= 2000) {
            i7n.g(Looper.getMainLooper(), "SchedulerDeffer", "SUMMARY-LOOPER-CURRENT: ");
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afb3c4bc", new Object[]{this})).booleanValue();
        }
        if (this.e == -1) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.e < this.c) {
            return false;
        }
        this.e = uptimeMillis;
        this.f++;
        return true;
    }
}
