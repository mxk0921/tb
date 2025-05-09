package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.tmall.android.dai.compute.DAIComputeService;
import com.tmall.android.dai.model.DAIModelTriggerType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class iwt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static iwt d;

    /* renamed from: a  reason: collision with root package name */
    public boolean f21621a = false;
    public final List<a> b = new ArrayList();
    public volatile boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f21622a = false;
        public zxi b;

        static {
            t2o.a(1034944612);
        }

        public a(zxi zxiVar) {
            this.b = zxiVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (!this.f21622a) {
                    iwt iwtVar = iwt.this;
                    iwt.b(iwtVar, iwt.c(iwtVar));
                    if (!iwt.a(iwt.this)) {
                        if (vzu.getInstance().isInForeground()) {
                            DAIComputeService e = kzo.c().e();
                            zxi zxiVar = this.b;
                            e.h(zxiVar.f33074a, null, DAIComputeService.TaskPriority.NORMAL, null, zxiVar.c);
                        }
                        u45 d = iwt.d(iwt.this, this.b);
                        if (slo.VALUE_YES.equals(d.b)) {
                            xdt.b(1003, this, Integer.parseInt(d.c) * 1000);
                        }
                    }
                }
            } catch (Throwable unused) {
                Log.e("TimingTrigger", "something wrong when TimingRunnable.compute");
            }
        }
    }

    static {
        t2o.a(1034944611);
    }

    public static /* synthetic */ boolean a(iwt iwtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65750ce4", new Object[]{iwtVar})).booleanValue();
        }
        return iwtVar.f21621a;
    }

    public static /* synthetic */ boolean b(iwt iwtVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd5b9cb6", new Object[]{iwtVar, new Boolean(z)})).booleanValue();
        }
        iwtVar.f21621a = z;
        return z;
    }

    public static /* synthetic */ boolean c(iwt iwtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66438b65", new Object[]{iwtVar})).booleanValue();
        }
        return iwtVar.g();
    }

    public static /* synthetic */ u45 d(iwt iwtVar, zxi zxiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u45) ipChange.ipc$dispatch("36d0b36", new Object[]{iwtVar, zxiVar});
        }
        return iwtVar.f(zxiVar);
    }

    public static iwt e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iwt) ipChange.ipc$dispatch("a5e6dfed", new Object[0]);
        }
        if (d == null) {
            synchronized (iwt.class) {
                try {
                    if (d == null) {
                        d = new iwt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.u45 f(tb.zxi r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.iwt.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "29ad6065"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            tb.u45 r5 = (tb.u45) r5
            return r5
        L_0x0018:
            r0 = 0
            tb.l45 r5 = r5.b     // Catch: Exception -> 0x0045
            tb.u45 r5 = (tb.u45) r5     // Catch: Exception -> 0x0045
            if (r5 == 0) goto L_0x0046
            java.lang.String r1 = "YES"
            java.lang.String r2 = r5.b     // Catch: Exception -> 0x0045
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: Exception -> 0x0045
            if (r1 == 0) goto L_0x002d
            r1 = r0
            r0 = r5
            r5 = r1
            goto L_0x0048
        L_0x002d:
            java.lang.String r1 = "NO"
            java.lang.String r2 = r5.b     // Catch: Exception -> 0x0045
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: Exception -> 0x0045
            if (r1 == 0) goto L_0x0046
            java.lang.String r1 = r5.c     // Catch: all -> 0x0042
            long r1 = java.lang.Long.parseLong(r1)     // Catch: all -> 0x0042
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: all -> 0x0042
            goto L_0x0048
        L_0x0042:
            r1 = r0
            goto L_0x0048
        L_0x0045:
        L_0x0046:
            r5 = r0
            r1 = r5
        L_0x0048:
            if (r0 == 0) goto L_0x004f
            if (r1 == 0) goto L_0x0052
            r0.d = r1
            goto L_0x0052
        L_0x004f:
            if (r5 == 0) goto L_0x0052
            r0 = r5
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.iwt.f(tb.zxi):tb.u45");
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36db62d7", new Object[]{this})).booleanValue();
        }
        boolean parseBoolean = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "stopTTask", "false"));
        this.f21621a = parseBoolean;
        return parseBoolean;
    }

    public int i(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb0a3524", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    public synchronized void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd91ab41", new Object[]{this});
        } else if (this.c) {
            List<a> list = this.b;
            if (list != null && ((ArrayList) list).size() > 0) {
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).f21622a = true;
                }
                xdt.f(1003);
                ((ArrayList) this.b).clear();
            }
            if (!this.f21621a) {
                Set<zxi> c = kzo.c().e().c(DAIModelTriggerType.Timing);
                if (c != null && c.size() > 0) {
                    for (zxi zxiVar : c) {
                        ((ArrayList) this.b).add(new a(zxiVar));
                    }
                    j();
                }
            }
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0f160e", new Object[]{this});
            return;
        }
        try {
            List<a> list = this.b;
            if (list != null && ((ArrayList) list).size() > 0) {
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    u45 f = f(aVar.b);
                    if (f != null) {
                        long i = i(0, Integer.parseInt(f.c) * 1000);
                        Long l = f.d;
                        if (l != null) {
                            i = l.longValue() * 1000;
                        }
                        xdt.b(1003, aVar, i);
                    }
                }
                return;
            }
            Log.e("TimingTrigger", "no task to be executed ~~");
        } catch (Throwable unused) {
            Log.e("TimingTrigger", "something wrong when onModelUpadated");
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c416f8", new Object[]{this});
            return;
        }
        try {
            if (this.c) {
                Log.e("TimingTrigger", "already initialized ~");
                return;
            }
            this.c = true;
            boolean g = g();
            this.f21621a = g;
            if (!g) {
                h();
            }
        } catch (Throwable unused) {
            Log.e("TimingTrigger", "something wrong when startTimingTask");
        }
    }
}
