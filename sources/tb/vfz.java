package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.falco.m;
import com.taobao.falco.u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final fuq f29993a;
    public int b = -2;
    public String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29994a;

        public a(String str) {
            this.f29994a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            vfz.a(vfz.this);
            d9j.c("MultiTabFalcoRumNavigator", "切tab后选中，当前的tabId是：" + this.f29994a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.falco.m.a
        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
                return;
            }
            vfz vfzVar = vfz.this;
            mVar.Z(vfz.c(vfzVar, vfz.b(vfzVar)));
        }
    }

    static {
        t2o.a(729809489);
    }

    public vfz(fuq fuqVar) {
        this.f29993a = fuqVar;
    }

    public static /* synthetic */ void a(vfz vfzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("952ee727", new Object[]{vfzVar});
        } else {
            vfzVar.h();
        }
    }

    public static /* synthetic */ String b(vfz vfzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce75cf9a", new Object[]{vfzVar});
        }
        return vfzVar.c;
    }

    public static /* synthetic */ String c(vfz vfzVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc10a991", new Object[]{vfzVar, str});
        }
        return vfzVar.e(str);
    }

    public final u f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("24067b09", new Object[]{this});
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var != null) {
            return tz8Var.h();
        }
        d9j.d("MultiTabFalcoRumNavigator", "[function] error: tracer is null", null);
        return null;
    }

    public void g(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15da4480", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (this.b != i) {
            m5a.a().e(new a(str));
        }
        this.c = str;
        this.b = i;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730c1fbb", new Object[]{this});
            return;
        }
        u f = f();
        if (f == null) {
            d9j.c("MultiTabFalcoRumNavigator", "onPageCreateEnd viewNavigator == null");
            return;
        }
        u.a d = d();
        f.e(d);
        f.b(d);
        f.c(d, new b());
    }

    public final u.a d() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u.a) ipChange.ipc$dispatch("3d24d5f0", new Object[]{this});
        }
        u.a aVar = new u.a();
        View w = this.f29993a.w(this.b);
        if (w != null) {
            aVar.f10480a = w.hashCode();
        }
        aVar.b = "HomepageFragment." + this.c + "." + this.b;
        aVar.d = "tabSelected";
        if (this.f29993a.u(this.c) == this.f29993a.n()) {
            z = true;
        }
        aVar.e = z;
        return aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
        if (r4.equals(com.taobao.tao.infoflow.multitab.nativetab.NativeContainerProvider.DX_CONTAINER) == false) goto L_0x004d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.vfz.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "10610aea"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x0018:
            tb.fuq r3 = r6.f29993a
            int r7 = r3.u(r7)
            r3 = 0
            if (r7 >= 0) goto L_0x0022
            return r3
        L_0x0022:
            tb.fuq r4 = r6.f29993a
            java.lang.String r4 = r4.j(r7)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x0042
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MultiTabPerformance setTechStack containerType null position:"
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "MultiTabFalcoRumNavigator"
            tb.d9j.c(r0, r7)
            return r3
        L_0x0042:
            r4.hashCode()
            r7 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case -139919088: goto L_0x007c;
                case 179717709: goto L_0x0073;
                case 514841930: goto L_0x0067;
                case 989204668: goto L_0x005b;
                case 1463130501: goto L_0x004f;
                default: goto L_0x004d;
            }
        L_0x004d:
            r0 = -1
            goto L_0x0086
        L_0x004f:
            java.lang.String r0 = "hourlyDelivery"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0059
            goto L_0x004d
        L_0x0059:
            r0 = 4
            goto L_0x0086
        L_0x005b:
            java.lang.String r0 = "recommend"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0065
            goto L_0x004d
        L_0x0065:
            r0 = 3
            goto L_0x0086
        L_0x0067:
            java.lang.String r0 = "subscribe"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0071
            goto L_0x004d
        L_0x0071:
            r0 = 2
            goto L_0x0086
        L_0x0073:
            java.lang.String r1 = "dxContainer"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0086
            goto L_0x004d
        L_0x007c:
            java.lang.String r0 = "campaign"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0085
            goto L_0x004d
        L_0x0085:
            r0 = 0
        L_0x0086:
            switch(r0) {
                case 0: goto L_0x008e;
                case 1: goto L_0x008a;
                case 2: goto L_0x008a;
                case 3: goto L_0x008a;
                case 4: goto L_0x008a;
                default: goto L_0x0089;
            }
        L_0x0089:
            goto L_0x0091
        L_0x008a:
            java.lang.String r4 = "native"
            goto L_0x0091
        L_0x008e:
            java.lang.String r4 = "h5"
        L_0x0091:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vfz.e(java.lang.String):java.lang.String");
    }
}
