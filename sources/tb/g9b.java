package tb;

import android.content.DialogInterface;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zoloz.hummer.common.TaskTracker;
import com.zoloz.zhub.common.factor.model.FactorNextResponse;
import com.zoloz.zhub.common.factor.model.FactorNextResponseInner;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ea8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class g9b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "HummerCore";

    /* renamed from: a  reason: collision with root package name */
    public f9b f19808a;
    public final Map<Integer, TaskTracker> b = new HashMap();
    public int c = 0;
    public odc d;
    public dfb e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements dfb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f19809a;

        public a(boolean z) {
            this.f19809a = z;
        }

        @Override // tb.dfb
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ee5ec4b", new Object[]{this});
            } else if (this.f19809a) {
                g9b.a(g9b.this);
            }
        }

        @Override // tb.dfb
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97c8cf5e", new Object[]{this, new Boolean(z)});
            } else if (z) {
                g9b.b(g9b.this);
            } else if (g9b.c(g9b.this) != null) {
                ga8 ga8Var = new ga8();
                String str = g9b.c(g9b.this).f19115a;
                ga8Var.f19831a = 1003;
                g9b.c(g9b.this).a("hummer_response", "context", ga8Var);
                g9b.e(g9b.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements qzd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.qzd
        public void a(f9b f9bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c2ac5b9", new Object[]{this, f9bVar, new Integer(i)});
                return;
            }
            g9b.d(g9b.this, f9bVar);
            g9b.f(g9b.this, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements qzd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.qzd
        public void a(f9b f9bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c2ac5b9", new Object[]{this, f9bVar, new Integer(i)});
                return;
            }
            g9b.d(g9b.this, f9bVar);
            g9b.f(g9b.this, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements qzd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.qzd
        public void a(f9b f9bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c2ac5b9", new Object[]{this, f9bVar, new Integer(i)});
                return;
            }
            g9b.d(g9b.this, f9bVar);
            g9b.f(g9b.this, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements bld {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.bld
        public void a(sho shoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8be185d9", new Object[]{this, shoVar});
            } else {
                g9b.g(g9b.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(g9b g9bVar) {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g implements bld {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.bld
        public void a(sho shoVar) {
            List<FactorNextResponseInner> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8be185d9", new Object[]{this, shoVar});
                return;
            }
            vk0.e().d();
            if (g9b.c(g9b.this) != null && shoVar != null) {
                FactorNextResponse factorNextResponse = shoVar.f28058a;
                if (factorNextResponse == null || "network_exception".equals(shoVar.b)) {
                    vk0.e().b(g9b.h(g9b.this));
                } else if ("exception".equals(shoVar.b) || (list = factorNextResponse.response) == null || list.size() <= 0) {
                    g9b.c(g9b.this).p(g9b.TAG, "Z7022");
                    vk0.e().c(g9b.h(g9b.this));
                } else {
                    String str = factorNextResponse.versionToken;
                    if (!StringUtil.isNullorEmpty(str)) {
                        g9b.c(g9b.this).a("versionToken", "context", str);
                    }
                    g9b.c(g9b.this).m(shoVar.f28058a.zStack);
                    FactorNextResponseInner factorNextResponseInner = factorNextResponse.response.get(0);
                    if (!"SYSTEM_SUCCESS".equals(factorNextResponseInner.retCode)) {
                        g9b.c(g9b.this).p(g9b.TAG, factorNextResponseInner.retCodeSub);
                        vk0.e().c(g9b.h(g9b.this));
                        return;
                    }
                    if (factorNextResponse.response.get(0).outParams != null) {
                        for (Map.Entry<String, Object> entry : factorNextResponse.response.get(0).outParams.entrySet()) {
                            g9b.c(g9b.this).a(entry.getKey(), "serverResponse", entry.getValue());
                        }
                    }
                    g9b.i(g9b.this);
                }
            }
        }
    }

    static {
        t2o.a(245366831);
    }

    public static /* synthetic */ void a(g9b g9bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d588c5a3", new Object[]{g9bVar});
        } else {
            g9bVar.j();
        }
    }

    public static /* synthetic */ void b(g9b g9bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f005342", new Object[]{g9bVar});
        } else {
            g9bVar.m();
        }
    }

    public static /* synthetic */ f9b c(g9b g9bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f9b) ipChange.ipc$dispatch("d009187d", new Object[]{g9bVar});
        }
        return g9bVar.f19808a;
    }

    public static /* synthetic */ f9b d(g9b g9bVar, f9b f9bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f9b) ipChange.ipc$dispatch("6cccb057", new Object[]{g9bVar, f9bVar});
        }
        g9bVar.f19808a = f9bVar;
        return f9bVar;
    }

    public static /* synthetic */ void e(g9b g9bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef6e80", new Object[]{g9bVar});
        } else {
            g9bVar.n();
        }
    }

    public static /* synthetic */ void f(g9b g9bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b178fac4", new Object[]{g9bVar, new Integer(i)});
        } else {
            g9bVar.r(i);
        }
    }

    public static /* synthetic */ void g(g9b g9bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74de89be", new Object[]{g9bVar});
        } else {
            g9bVar.k();
        }
    }

    public static /* synthetic */ dfb h(g9b g9bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dfb) ipChange.ipc$dispatch("c0747317", new Object[]{g9bVar});
        }
        return g9bVar.e;
    }

    public static /* synthetic */ void i(g9b g9bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cda4fc", new Object[]{g9bVar});
        } else {
            g9bVar.l();
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        f9b f9bVar = this.f19808a;
        if (f9bVar != null) {
            int d2 = f9bVar.d();
            if (d2 == 0) {
                this.f19808a.p(TAG, "Z7034");
                k();
                return;
            }
            jho.d().h(new e(), jho.d().c(this.f19808a, d2, false));
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4af73f", new Object[]{this});
            return;
        }
        nzw.c().b();
        if (this.f19808a != null) {
            ga8 ga8Var = new ga8();
            ga8Var.f19831a = 1003;
            f9b f9bVar = this.f19808a;
            String str = f9bVar.f19115a;
            f9bVar.a("hummer_response", "context", ga8Var);
        }
        n();
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        this.c = 0;
        f9b f9bVar = this.f19808a;
        if (f9bVar != null) {
            f9bVar.s(null);
        }
        nzw.c().b();
        odc odcVar = this.d;
        if (odcVar != null) {
            ((ea8.b) odcVar).a(this.f19808a);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6896bb61", new Object[]{this});
            return;
        }
        BioLog.i("HummerCore forceQuit");
        this.c = 0;
        for (TaskTracker taskTracker : ((HashMap) this.b).values()) {
            BioLog.i("HummerCore forceQuit task");
            taskTracker.forceQuit();
        }
        ((HashMap) this.b).clear();
        f9b f9bVar = this.f19808a;
        if (f9bVar != null) {
            f9bVar.c();
        }
    }

    public TaskTracker p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskTracker) ipChange.ipc$dispatch("1cc07eb1", new Object[]{this});
        }
        return (TaskTracker) ((HashMap) this.b).get(Integer.valueOf(this.f19808a.e().index));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r4.equals("serverTask") == false) goto L_0x004b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.g9b.q():void");
    }

    public final void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be93b352", new Object[]{this, new Integer(i)});
            return;
        }
        f9b f9bVar = this.f19808a;
        if (f9bVar != null) {
            f9bVar.a("currentTaskName", "context", TAG);
            this.f19808a.a(vqx.ZIM_IDENTIFY_NEXTINDEX, "context", Integer.valueOf(i));
            if (i == -1) {
                l();
            } else if (i == 0 || i < -1) {
                this.f19808a.p(TAG, "Z7028");
                vk0.e().c(this.e);
            } else {
                this.c = i;
                q();
            }
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.c = 0;
        for (TaskTracker taskTracker : ((HashMap) this.b).values()) {
            taskTracker.release();
        }
        ((HashMap) this.b).clear();
        f9b f9bVar = this.f19808a;
        if (f9bVar != null) {
            f9bVar.q();
            this.f19808a = null;
        }
        this.d = null;
        this.e = null;
    }

    public void t(f9b f9bVar, odc odcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71cd738", new Object[]{this, f9bVar, odcVar, new Boolean(z)});
            return;
        }
        BioLog.i("HummerCore schedule called");
        this.f19808a = f9bVar;
        if (f9bVar != null) {
            f9bVar.a("currentTaskName", "context", TAG);
        }
        this.d = odcVar;
        this.e = new a(z);
        this.c = this.f19808a.g.clientStartIndex;
        q();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r3.equals(com.taobao.login4android.qrcode.result.Result.MSG_SUCCESS) == false) goto L_0x0036;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.g9b.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "81677ea5"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            tb.ga8 r2 = new tb.ga8
            r2.<init>()
            tb.f9b r3 = r6.f19808a
            if (r3 == 0) goto L_0x00a7
            java.lang.String r4 = r3.f19115a
            java.lang.String r4 = "EKYC_STATUS"
            java.lang.Object r3 = r3.o(r4)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = com.alipay.mobile.security.bio.utils.StringUtil.isNullorEmpty(r3)
            if (r4 != 0) goto L_0x007c
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -202516509: goto L_0x004e;
                case 578079082: goto L_0x0043;
                case 982065527: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            r0 = -1
            goto L_0x0057
        L_0x0038:
            java.lang.String r0 = "Pending"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0041
            goto L_0x0036
        L_0x0041:
            r0 = 2
            goto L_0x0057
        L_0x0043:
            java.lang.String r0 = "Failure"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x004c
            goto L_0x0036
        L_0x004c:
            r0 = 1
            goto L_0x0057
        L_0x004e:
            java.lang.String r1 = "Success"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0057
            goto L_0x0036
        L_0x0057:
            switch(r0) {
                case 0: goto L_0x0077;
                case 1: goto L_0x0072;
                case 2: goto L_0x006d;
                default: goto L_0x005a;
            }
        L_0x005a:
            tb.f9b r0 = r6.f19808a
            java.lang.String r1 = "HummerCore"
            java.lang.String r2 = "Z7024"
            r0.p(r1, r2)
            tb.vk0 r0 = tb.vk0.e()
            tb.dfb r1 = r6.e
            r0.c(r1)
            return
        L_0x006d:
            r0 = 3000(0xbb8, float:4.204E-42)
            r2.f19831a = r0
            goto L_0x009a
        L_0x0072:
            r0 = 2006(0x7d6, float:2.811E-42)
            r2.f19831a = r0
            goto L_0x009a
        L_0x0077:
            r0 = 1000(0x3e8, float:1.401E-42)
            r2.f19831a = r0
            goto L_0x009a
        L_0x007c:
            tb.f9b r0 = r6.f19808a
            java.lang.String r1 = "zimResponse"
            java.lang.Object r0 = r0.o(r1)
            if (r0 == 0) goto L_0x0096
            tb.f9b r0 = r6.f19808a
            java.lang.Object r0 = r0.o(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.f19831a = r0
            goto L_0x009a
        L_0x0096:
            r0 = 1003(0x3eb, float:1.406E-42)
            r2.f19831a = r0
        L_0x009a:
            tb.f9b r0 = r6.f19808a
            java.lang.String r1 = "hummer_response"
            java.lang.String r3 = "context"
            r0.a(r1, r3, r2)
            r6.n()
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.g9b.l():void");
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25a231f", new Object[]{this});
            return;
        }
        vk0.e().h("", false, new f(this), true);
        jho d2 = jho.d();
        g gVar = new g();
        jho d3 = jho.d();
        f9b f9bVar = this.f19808a;
        d2.h(gVar, d3.c(f9bVar, ((Integer) f9bVar.o(vqx.ZIM_IDENTIFY_NEXTINDEX)).intValue(), true));
    }
}
