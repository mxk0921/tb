package tb;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kti;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gw4 extends ae1<ew4> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ysg f20265a;
    public final Handler b;
    public boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final long f20266a;
        private final List<WeakReference<Thread>> c;
        private final zd1<ew4> d;
        private final ew4 e;
        private int b = 0;
        public Map<String, List<StackTraceElement[]>> f = new HashMap();

        public a(long j, List<WeakReference<Thread>> list, zd1<ew4> zd1Var, ew4 ew4Var) {
            this.f20266a = j;
            this.c = list;
            this.d = zd1Var;
            this.e = ew4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (5 > this.b + 1) {
                gw4.h(gw4.this).postDelayed(this, this.f20266a);
            }
            this.b++;
            Iterator<WeakReference<Thread>> it = this.c.iterator();
            while (it.hasNext()) {
                Thread thread = it.next().get();
                if (thread == null) {
                    it.remove();
                } else {
                    List<StackTraceElement[]> list = this.f.get(thread.getName());
                    if (list == null) {
                        list = new ArrayList<>();
                        this.f.put(thread.getName(), list);
                    }
                    list.add(thread.getStackTrace());
                }
            }
            if (5 == this.b) {
                ((kti.a) this.d).d(new ew4(this.e, this.f));
                gw4.i(gw4.this, false);
            }
            if (this.c.isEmpty()) {
                gw4.h(gw4.this).removeCallbacks(this);
                ((kti.a) this.d).d(new ew4(this.e, this.f));
                gw4.i(gw4.this, false);
            }
        }
    }

    public gw4(Application application, Handler handler) {
        this.b = handler;
        this.f20265a = new ysg(application.getPackageName());
    }

    public static /* synthetic */ Handler h(gw4 gw4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("78ba42de", new Object[]{gw4Var});
        }
        return gw4Var.b;
    }

    public static /* synthetic */ boolean i(gw4 gw4Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32331d73", new Object[]{gw4Var, new Boolean(z)})).booleanValue();
        }
        gw4Var.c = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(gw4 gw4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/collector/cpu/CpuAbnormalCollector");
    }

    @Override // tb.ae1, tb.k04
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51db1d5f", new Object[]{this});
        }
    }

    @Override // tb.ae1
    public void e(final int i, final Map<String, ?> map, final zd1<ew4> zd1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c23f26e", new Object[]{this, new Integer(i), map, zd1Var});
        } else if (!this.c) {
            this.c = true;
            final long[] d = bx4.d();
            final jft e = this.f20265a.e();
            final List<jft> g = this.f20265a.g();
            this.b.postDelayed(new Runnable() { // from class: tb.fw4
                @Override // java.lang.Runnable
                public final void run() {
                    gw4.this.j(g, zd1Var, i, map, d, e);
                }
            }, 20000L);
        }
    }

    @Override // tb.ae1
    public Handler f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("eed12309", new Object[]{this});
        }
        return this.b;
    }

    public final /* synthetic */ void j(List list, zd1 zd1Var, int i, Map map, long[] jArr, jft jftVar) {
        boolean z;
        Exception e;
        List<jft> list2;
        Thread[] threadArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6ee5dc", new Object[]{this, list, zd1Var, new Integer(i), map, jArr, jftVar});
            return;
        }
        long[] d = bx4.d();
        jft e2 = this.f20265a.e();
        List<jft> g = this.f20265a.g();
        List<jft> a2 = ysg.a(list, g);
        Collections.sort(a2);
        List<jft> subList = a2.subList(0, Math.min(a2.size(), (int) 3));
        try {
            Thread thread = Looper.getMainLooper().getThread();
            ThreadGroup threadGroup = thread.getThreadGroup();
            if (threadGroup == null) {
                ((kti.a) zd1Var).c("ThreadGroup get fail.");
                return;
            }
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
            }
            int activeCount = threadGroup.activeCount();
            Thread[] threadArr2 = new Thread[activeCount + (activeCount / 2)];
            int enumerate = threadGroup.enumerate(threadArr2);
            ArrayList arrayList = new ArrayList();
            StackTraceElement[] stackTraceElementArr = null;
            Thread thread2 = null;
            int i2 = 0;
            while (i2 < subList.size()) {
                String str = subList.get(i2).d;
                long j = subList.get(i2).c;
                if (!TextUtils.isEmpty(str)) {
                    int i3 = 0;
                    while (i3 < enumerate) {
                        Thread thread3 = threadArr2[i3];
                        if (thread3 == null) {
                            threadArr = threadArr2;
                            list2 = subList;
                        } else {
                            threadArr = threadArr2;
                            String name = thread3.getName();
                            if (!TextUtils.isEmpty(name) && name.startsWith(str)) {
                                list2 = subList;
                                arrayList.add(new WeakReference(thread3));
                                if (thread3.isAlive() && (stackTraceElementArr == null || stackTraceElementArr.length == 0)) {
                                    stackTraceElementArr = thread3.getStackTrace();
                                    thread2 = thread3;
                                }
                                i2++;
                                g = g;
                                threadArr2 = threadArr;
                                subList = list2;
                            }
                            list2 = subList;
                            if (j == kw4.pid && thread3 == thread) {
                                arrayList.add(new WeakReference(thread3));
                                if (thread3.isAlive()) {
                                    stackTraceElementArr = thread3.getStackTrace();
                                    thread2 = thread3;
                                }
                                i2++;
                                g = g;
                                threadArr2 = threadArr;
                                subList = list2;
                            }
                        }
                        i3++;
                        threadArr2 = threadArr;
                        subList = list2;
                    }
                }
                threadArr = threadArr2;
                list2 = subList;
                i2++;
                g = g;
                threadArr2 = threadArr;
                subList = list2;
            }
            ew4 ew4Var = new ew4(i, map, jArr, d, jftVar, e2, list, g, stackTraceElementArr, thread2);
            z = false;
            try {
                this.b.postDelayed(new a(500L, arrayList, zd1Var, ew4Var), 500L);
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                ((kti.a) zd1Var).c(e.getMessage());
                this.c = z;
            }
        } catch (Exception e4) {
            e = e4;
            z = false;
        }
    }
}
