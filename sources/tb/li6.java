package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class li6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f23352a = true;
    public final a b = new a(this);
    public List<ki6> c;
    public final long d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<li6> f23353a;
        public long b;

        static {
            t2o.a(444597059);
        }

        public a(li6 li6Var) {
            super(Looper.getMainLooper());
            this.f23353a = new WeakReference<>(li6Var);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/timer/DXTimerManager$DXHandlerTimer");
        }

        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ecaeb838", new Object[]{this, new Long(j)});
            } else {
                this.b = j;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            li6 li6Var = this.f23353a.get();
            if (li6Var != null && !li6.a(li6Var)) {
                li6Var.e();
                sendMessageDelayed(obtainMessage(1), li6.b(li6Var) - ((SystemClock.elapsedRealtime() - this.b) % li6.b(li6Var)));
            }
        }
    }

    static {
        t2o.a(444597058);
    }

    public li6(long j) {
        this.d = j;
    }

    public static /* synthetic */ boolean a(li6 li6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f531851", new Object[]{li6Var})).booleanValue();
        }
        return li6Var.f23352a;
    }

    public static /* synthetic */ long b(li6 li6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94e72142", new Object[]{li6Var})).longValue();
        }
        return li6Var.d;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.f23352a = true;
        this.b.removeMessages(1);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        List<ki6> list = this.c;
        if (list != null) {
            ((CopyOnWriteArrayList) list).clear();
        }
        c();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1879e2a3", new Object[]{this});
            return;
        }
        List<ki6> list = this.c;
        if (list == null || ((CopyOnWriteArrayList) list).size() == 0) {
            c();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ki6 ki6Var = (ki6) it.next();
            int i = (int) ((elapsedRealtime - ki6Var.c) / ki6Var.b);
            if (i >= ki6Var.d + 1) {
                ki6Var.f22687a.h();
                ki6Var.d = i;
            }
        }
    }

    public void f(ji6 ji6Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769db409", new Object[]{this, ji6Var, new Long(j)});
        } else if (ji6Var != null && j > 0) {
            if (this.c == null) {
                this.c = new CopyOnWriteArrayList();
            }
            Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
            while (it.hasNext()) {
                if (((ki6) it.next()).f22687a == ji6Var) {
                    return;
                }
            }
            ki6 ki6Var = new ki6();
            ki6Var.f22687a = ji6Var;
            long j2 = this.d;
            if (j <= j2) {
                j = j2;
            }
            ki6Var.b = j;
            ki6Var.c = SystemClock.elapsedRealtime();
            ((CopyOnWriteArrayList) this.c).add(ki6Var);
            g();
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.f23352a) {
            this.f23352a = false;
            this.b.a(SystemClock.elapsedRealtime());
            a aVar = this.b;
            aVar.sendMessage(aVar.obtainMessage(1));
        }
    }

    public void h(ji6 ji6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85dd162", new Object[]{this, ji6Var});
        } else if (ji6Var != null) {
            List<ki6> list = this.c;
            if (list == null) {
                c();
                return;
            }
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ki6 ki6Var = (ki6) it.next();
                if (ki6Var.f22687a == ji6Var) {
                    ((CopyOnWriteArrayList) this.c).remove(ki6Var);
                    break;
                }
            }
            if (((CopyOnWriteArrayList) this.c).size() == 0) {
                c();
            }
        }
    }
}
