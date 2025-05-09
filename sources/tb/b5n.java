package tb;

import androidx.collection.ArrayMap;
import androidx.core.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.base.monitor.MonitorManager;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.MsgMonitor;
import com.taobao.tao.powermsg.model.Request;
import java.util.concurrent.TimeUnit;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b5n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PullManager";

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayMap<String, w4n> f16190a = new ArrayMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements vxx<sxx> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Request f16192a;
        public final /* synthetic */ lkd b;

        public b(Request request, lkd lkdVar) {
            this.f16192a = request;
            this.b = lkdVar;
        }

        /* renamed from: a */
        public void accept(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2712411b", new Object[]{this, sxxVar});
            } else {
                MsgRouter.e().a().c(this.f16192a.header.f, this.b);
            }
        }
    }

    static {
        t2o.a(628097284);
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2170cede", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == 3 || i == 5) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void b(String str, long j, int i, int i2, String str2, int i3, int i4, lkd lkdVar, String str3, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7537310", new Object[]{str, new Long(j), new Integer(i), new Integer(i2), str2, new Integer(i3), new Integer(i4), lkdVar, str3, l});
        } else {
            c(str, j, i, i2, str2, i3, i4, lkdVar, str3, l);
        }
    }

    public synchronized void e(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd68162", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        w4n w4nVar = f16190a.get(w4n.b(str, str2));
        if (w4nVar != null) {
            w4nVar.j.set(i);
        }
    }

    public static void d(w4n w4nVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df1b84f", new Object[]{w4nVar});
        } else if (w4nVar.d != 1) {
            w4nVar.m.set(0);
            int a2 = jg4.a("pull_timeout", 20);
            sxx sxxVar = w4nVar.n;
            if (sxxVar == null || sxxVar.b()) {
                if (a(w4nVar.d)) {
                    i = w4nVar.e;
                }
                w4nVar.n = l5y.f(i, 1L, TimeUnit.SECONDS).I(gay.a()).K(new a(w4nVar, a2));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
        r0.d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized int f(int r10, java.lang.String r11, java.lang.String r12, int r13, int r14) {
        /*
            r9 = this;
            r0 = 3
            r1 = 1
            monitor-enter(r9)
            com.android.alibaba.ip.runtime.IpChange r2 = tb.b5n.$ipChange     // Catch: all -> 0x0039
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x0039
            if (r3 == 0) goto L_0x003b
            java.lang.String r3 = "6b3a3a82"
            java.lang.Integer r4 = new java.lang.Integer     // Catch: all -> 0x0039
            r4.<init>(r10)     // Catch: all -> 0x0039
            java.lang.Integer r10 = new java.lang.Integer     // Catch: all -> 0x0039
            r10.<init>(r13)     // Catch: all -> 0x0039
            java.lang.Integer r13 = new java.lang.Integer     // Catch: all -> 0x0039
            r13.<init>(r14)     // Catch: all -> 0x0039
            r14 = 6
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch: all -> 0x0039
            r5 = 0
            r14[r5] = r9     // Catch: all -> 0x0039
            r14[r1] = r4     // Catch: all -> 0x0039
            r1 = 2
            r14[r1] = r11     // Catch: all -> 0x0039
            r14[r0] = r12     // Catch: all -> 0x0039
            r11 = 4
            r14[r11] = r10     // Catch: all -> 0x0039
            r10 = 5
            r14[r10] = r13     // Catch: all -> 0x0039
            java.lang.Object r10 = r2.ipc$dispatch(r3, r14)     // Catch: all -> 0x0039
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: all -> 0x0039
            int r10 = r10.intValue()     // Catch: all -> 0x0039
            monitor-exit(r9)
            return r10
        L_0x0039:
            r10 = move-exception
            goto L_0x0097
        L_0x003b:
            if (r14 > 0) goto L_0x0052
            boolean r14 = a(r13)     // Catch: all -> 0x0039
            if (r14 == 0) goto L_0x004b
            java.lang.String r14 = "push_aside_pull_duration"
            int r14 = tb.jg4.a(r14, r0)     // Catch: all -> 0x0039
            goto L_0x0052
        L_0x004b:
            java.lang.String r14 = "pull_duration"
            int r14 = tb.jg4.a(r14, r1)     // Catch: all -> 0x0039
        L_0x0052:
            java.lang.String r6 = tb.w4n.b(r11, r12)     // Catch: all -> 0x0039
            androidx.collection.ArrayMap<java.lang.String, tb.w4n> r7 = tb.b5n.f16190a     // Catch: all -> 0x0039
            java.lang.Object r0 = r7.get(r6)     // Catch: all -> 0x0039
            tb.w4n r0 = (tb.w4n) r0     // Catch: all -> 0x0039
            if (r1 != r13) goto L_0x006a
            if (r0 == 0) goto L_0x0068
            r0.d()     // Catch: all -> 0x0039
            r7.remove(r6)     // Catch: all -> 0x0039
        L_0x0068:
            monitor-exit(r9)
            return r1
        L_0x006a:
            if (r0 == 0) goto L_0x007a
            boolean r1 = r0.a()     // Catch: all -> 0x0039
            if (r1 == 0) goto L_0x0073
            goto L_0x007a
        L_0x0073:
            com.taobao.tao.powermsg.managers.a.n(r11, r12, r13, r14)     // Catch: all -> 0x0039
            int r10 = r0.d     // Catch: all -> 0x0039
            monitor-exit(r9)
            return r10
        L_0x007a:
            if (r0 == 0) goto L_0x007f
            r0.d()     // Catch: all -> 0x0039
        L_0x007f:
            tb.w4n r8 = new tb.w4n     // Catch: all -> 0x0039
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: all -> 0x0039
            r7.put(r6, r8)     // Catch: all -> 0x0039
            com.taobao.tao.powermsg.managers.a.n(r11, r12, r13, r14)     // Catch: all -> 0x0039
            d(r8)     // Catch: all -> 0x0039
            int r10 = r8.d     // Catch: all -> 0x0039
            monitor-exit(r9)
            return r10
        L_0x0097:
            monitor-exit(r9)     // Catch: all -> 0x0039
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.b5n.f(int, java.lang.String, java.lang.String, int, int):int");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements vxx<Long> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w4n f16191a;
        public final /* synthetic */ int b;

        public a(w4n w4nVar, int i) {
            this.f16191a = w4nVar;
            this.b = i;
        }

        /* renamed from: a */
        public void accept(Long l) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4e4afce", new Object[]{this, l});
                return;
            }
            try {
                if (this.f16191a.a()) {
                    w4n w4nVar = this.f16191a;
                    MsgLog.i(b5n.TAG, "last pull", "topic:", w4nVar.b, l2o.COL_BTAG, w4nVar.c);
                    sxx sxxVar = this.f16191a.n;
                    if (sxxVar != null) {
                        sxxVar.b_();
                    }
                    String a2 = MonitorManager.a(null, null);
                    w4n w4nVar2 = this.f16191a;
                    l2o l2oVar = new l2o(a2, 5, w4nVar2.f30452a, w4nVar2.b, w4nVar2.c, -1, w4nVar2.d);
                    l2oVar.f = 2;
                    l2oVar.h = "" + this.f16191a.f;
                    MonitorManager.k(l2oVar);
                } else if (!b5n.a(this.f16191a.d) || this.f16191a.j.get() != 1) {
                    w4n w4nVar3 = this.f16191a;
                    int i = w4nVar3.e;
                    if (i > 0) {
                        int i2 = w4nVar3.h;
                        if (i2 > 0) {
                            w4nVar3.h = i2 + 1;
                            if (i2 < i) {
                                return;
                            }
                        }
                        if (w4nVar3.m.get() != -1) {
                            w4n w4nVar4 = this.f16191a;
                            Pair<Integer, Integer> d = com.taobao.tao.powermsg.managers.a.d(w4nVar4.b, w4nVar4.c);
                            this.f16191a.c(d.first.intValue(), d.second.intValue());
                            if (this.f16191a.h == 0) {
                                String a3 = MonitorManager.a(null, null);
                                w4n w4nVar5 = this.f16191a;
                                l2o l2oVar2 = new l2o(a3, 5, w4nVar5.f30452a, w4nVar5.b, w4nVar5.c, 1, w4nVar5.d);
                                l2oVar2.f = 2;
                                l2oVar2.h = "" + this.f16191a.f;
                                MonitorManager.k(l2oVar2);
                            }
                            w4n w4nVar6 = this.f16191a;
                            w4nVar6.h = 1;
                            w4nVar6.g = Long.valueOf(System.nanoTime());
                            this.f16191a.m.set(-1);
                            w4n w4nVar7 = this.f16191a;
                            b5n.b(w4nVar7.b, w4nVar7.f, w4nVar7.e, w4nVar7.f30452a, w4nVar7.c, w4nVar7.d, this.b, w4nVar7.o, null, w4nVar7.g);
                        }
                    }
                } else {
                    this.f16191a.j.set(0);
                    w4n w4nVar8 = this.f16191a;
                    w4nVar8.f = 0L;
                    if (w4nVar8.h > 1) {
                        w4nVar8.h = 1;
                    }
                }
            } catch (Throwable th) {
                w4n w4nVar9 = this.f16191a;
                MsgLog.f(b5n.TAG, th, "pull_interval_error", "topic:", w4nVar9.b, l2o.COL_BTAG, w4nVar9.c);
                MsgMonitor.b("MKT", "pull_interval_error", th.getMessage(), vu3.b.GEO_NOT_SUPPORT);
            }
        }
    }

    public static void c(String str, long j, int i, int i2, String str2, int i3, int i4, lkd lkdVar, String str3, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33590bd1", new Object[]{str, new Long(j), new Integer(i), new Integer(i2), str2, new Integer(i3), new Integer(i4), lkdVar, str3, l});
            return;
        }
        MsgLog.i(TAG, "pullMsgInterval >", Integer.valueOf(i3), "offset:", Long.valueOf(j), "duration:", Integer.valueOf(i), "timeout:", Integer.valueOf(i4), "topic:", str, l2o.COL_BTAG, str2);
        Request create = Request.create();
        create.bizCode = i2;
        dva dvaVar = create.header;
        dvaVar.f18091a = str;
        dvaVar.g = 405;
        bh2 bh2Var = create.body;
        bh2Var.f16382a = j;
        bh2Var.b = i;
        bh2Var.c = i3;
        create.setBizTag(str2);
        ikl iklVar = new ikl(create);
        iklVar.l = i4;
        iklVar.n = l;
        l5y.m(iklVar).F(new b(create, lkdVar)).a(MsgRouter.e().j());
    }
}
