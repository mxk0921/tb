package tb;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ea7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final x0s b;
    public final i1r c;
    public final koq d;

    /* renamed from: a  reason: collision with root package name */
    public String f18404a = null;
    public final opi e = new opi();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f18405a;
        public final String b;

        public a(int i, String str) {
            this.f18405a = i;
            this.b = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f18406a;
        public final b b;
        public final juo c;

        public c(int i, b bVar, juo juoVar) {
            this.f18406a = i;
            this.b = bVar;
            this.c = juoVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f18406a--;
            a a2 = ea7.a(ea7.this);
            if (a2.f18405a == 1) {
                ((yz0) this.b).a(true, a2.b);
            } else if (this.f18406a > 0) {
                suo.c(this).a(500L).d(this.c).b();
            } else {
                ((yz0) this.b).a(false, "Not found anr info");
            }
        }
    }

    public ea7(x0s x0sVar, koq koqVar) {
        this.b = x0sVar;
        this.c = o1r.a(x0sVar.g());
        this.d = koqVar;
    }

    public static /* synthetic */ a a(ea7 ea7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b2cc10e6", new Object[]{ea7Var});
        }
        return ea7Var.d();
    }

    public static ea7 b(x0s x0sVar, koq koqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ea7) ipChange.ipc$dispatch("db3d24d0", new Object[]{x0sVar, koqVar});
        }
        return new ea7(x0sVar, koqVar);
    }

    public final void c(b bVar) {
        juo juoVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b76fb48", new Object[]{this, bVar});
            return;
        }
        if (Looper.myLooper() != null) {
            juoVar = new tsa();
        } else {
            juoVar = suo.sScheduler;
        }
        suo.c(new c(20, bVar, juoVar)).d(juoVar).b();
    }

    public final a d() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c03db5d2", new Object[]{this});
        }
        ActivityManager activityManager = (ActivityManager) this.b.g().getSystemService("activity");
        if (activityManager == null) {
            return new a(-1, "STATUS_UNKNOWN");
        }
        try {
            processesInErrorState = activityManager.getProcessesInErrorState();
        } catch (Throwable th) {
            ehh.d(th);
        }
        if (processesInErrorState == null) {
            return new a(2, "STATUS_OTHER");
        }
        for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
            if (processErrorStateInfo.pid == Process.myPid() && processErrorStateInfo.condition == 2 && !TextUtils.equals(this.f18404a, processErrorStateInfo.longMsg)) {
                String str = processErrorStateInfo.longMsg;
                this.f18404a = str;
                return new a(1, str);
            }
        }
        return new a(2, "STATUS_OTHER");
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e6c244a", new Object[]{this})).booleanValue();
        }
        Message a2 = this.e.a();
        if (a2 == null) {
            return false;
        }
        long when = a2.getWhen();
        if (when < 100) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = 5000;
        if (this.c.b("LongMainThreadDuration", this.d.defaultValue()) && !hj9.a()) {
            j = 20000;
        }
        if (uptimeMillis - when >= j) {
            return true;
        }
        return false;
    }

    public void f(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23035101", new Object[]{this, bVar});
        } else if (bVar != null) {
            try {
                if (e()) {
                    m4s.b("DelayAnrChecker", "isMainThreadBlocked");
                    ((yz0) bVar).a(true, "Main thread blocked");
                    return;
                }
                bgg.b(this.b).d();
                c(bVar);
            } catch (Exception unused) {
            }
        }
    }
}
