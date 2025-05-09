package com.taobao.falco;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.util.ALog;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.falco.FalcoEnvironmentImpl;
import java.util.Map;
import tb.c21;
import tb.crt;
import tb.sg0;
import tb.u11;
import tb.uz8;
import tb.v11;
import tb.ytc;
import tb.yy8;
import tb.z61;
import tb.zxv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class v implements sg0.c, v11, u11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FalcoEnvironmentImpl f10481a;
    public volatile e b;
    public volatile boolean c;
    public volatile boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                v.c(v.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f10483a;

        public b(Map map) {
            this.f10483a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                v.e(v.this, this.f10483a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f10484a;

        public c(long j) {
            this.f10484a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                v.f(v.this, this.f10484a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f10485a;
        public final /* synthetic */ int b;
        public final /* synthetic */ long c;

        public d(int i, int i2, long j) {
            this.f10485a = i;
            this.b = i2;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                v.g(v.this, this.f10485a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f10486a = uz8.a();
        public final com.taobao.falco.e b;
        public final q c;
        public final l d;
        public final k e;

        public e(com.taobao.falco.e eVar, q qVar, l lVar, k kVar) {
            this.b = eVar;
            this.c = qVar;
            this.d = lVar;
            this.e = kVar;
        }
    }

    public v(FalcoEnvironmentImpl falcoEnvironmentImpl) {
        com.taobao.falco.e eVar = new com.taobao.falco.e();
        eVar.c = Build.MODEL;
        eVar.d = Build.BRAND;
        l lVar = new l();
        lVar.f10471a = "COLD";
        lVar.e = 1;
        lVar.f = 0;
        this.f10481a = falcoEnvironmentImpl;
        this.b = new e(eVar, new q(), lVar, new k());
    }

    public static /* synthetic */ void c(v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5073f6b2", new Object[]{vVar});
        } else {
            vVar.s();
        }
    }

    public static /* synthetic */ void e(v vVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb37394", new Object[]{vVar, map});
        } else {
            vVar.i(map);
        }
    }

    public static /* synthetic */ void f(v vVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888e33d4", new Object[]{vVar, new Long(j)});
        } else {
            vVar.j(j);
        }
    }

    public static /* synthetic */ void g(v vVar, int i, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38719df5", new Object[]{vVar, new Integer(i), new Integer(i2), new Long(j)});
        } else {
            vVar.k(i, i2, j);
        }
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87f8d9b0", new Object[0]);
        }
        int deviceLevel = SceneIdentifier.getDeviceLevel();
        if (deviceLevel == 1) {
            return "high";
        }
        if (deviceLevel == 2) {
            return "middle";
        }
        if (deviceLevel != 3) {
            return "";
        }
        return "low";
    }

    public static String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f6238e4", new Object[0]);
        }
        Context a2 = yy8.a();
        if (a2 == null) {
            return "";
        }
        if (TBDeviceUtils.p(a2)) {
            return ytc.TYPE_FOLD;
        }
        if (TBDeviceUtils.m(a2)) {
            return "flip";
        }
        if (TBDeviceUtils.P(a2)) {
            return "pad";
        }
        return "phone";
    }

    public static q q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("757fa6a9", new Object[0]);
        }
        String b2 = uz8.b(yy8.a());
        q qVar = new q();
        qVar.f10476a = SceneIdentifier.getProcessId();
        if (b2 == null) {
            b2 = "";
        }
        qVar.b = b2;
        qVar.c = SceneIdentifier.getProcessStartTime();
        return qVar;
    }

    @Override // tb.sg0.c
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283ab0d4", new Object[]{this, map});
        }
    }

    @Override // tb.sg0.c
    public void b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ea9b13", new Object[]{this, map});
        } else if (map == null) {
            ALog.e(FalcoEnvironmentImpl.TAG, "[onFlowEnter] params is null", null, new Object[0]);
        } else {
            crt.d(new b(map));
        }
    }

    @Override // com.taobao.application.common.IAppLaunchListener
    public void d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cba989", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i2 == 1) {
            crt.d(new d(i, i2, System.currentTimeMillis()));
        }
    }

    public com.taobao.falco.e h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.falco.e) ipChange.ipc$dispatch("20a13e24", new Object[]{this});
        }
        return this.b.b;
    }

    public final void j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba3fc42d", new Object[]{this, new Long(j)});
            return;
        }
        e eVar = this.b;
        l lVar = eVar.d;
        l lVar2 = new l();
        lVar2.f10471a = lVar.f10471a;
        lVar2.b = lVar.b;
        lVar2.c = j;
        lVar2.d = lVar.d;
        lVar2.e = lVar.e;
        lVar2.g = lVar.g;
        lVar2.h = lVar.h;
        lVar2.f = 1;
        e eVar2 = new e(eVar.b, eVar.c, lVar2, eVar.e);
        t(eVar2, "LaunchVisit Update|falcoId=" + eVar2.f10486a + ", launchLeave=" + lVar2.c);
        this.f10481a.r(lVar2);
    }

    public final void k(int i, int i2, long j) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c4ec79", new Object[]{this, new Integer(i), new Integer(i2), new Long(j)});
            return;
        }
        e eVar = this.b;
        boolean equals = "COLD".equals(FalcoLifecycleActionMonitor.A);
        if (equals) {
            this.f10481a.v("env_last_cold_launch_time", j);
        }
        l lVar = new l();
        lVar.f10471a = FalcoLifecycleActionMonitor.A;
        lVar.b = FalcoLifecycleActionMonitor.B;
        lVar.d = SceneIdentifier.getInstallType();
        lVar.e = equals ? 1 : 0;
        lVar.f = SceneIdentifier.isAppBackground() ? 1 : 0;
        lVar.g = FalcoLifecycleActionMonitor.C ? 1 : 0;
        lVar.h = eVar.d.h;
        com.taobao.falco.e eVar2 = eVar.b;
        if (TextUtils.isEmpty(eVar2.f10462a) || TextUtils.isEmpty(eVar2.b)) {
            com.taobao.falco.e eVar3 = new com.taobao.falco.e();
            if (TextUtils.isEmpty(eVar2.f10462a)) {
                str = p();
            } else {
                str = eVar2.f10462a;
            }
            eVar3.f10462a = str;
            if (TextUtils.isEmpty(eVar2.b)) {
                str2 = o();
            } else {
                str2 = eVar2.b;
            }
            eVar3.b = str2;
            eVar3.c = eVar2.c;
            eVar3.d = eVar2.d;
            eVar2 = eVar3;
            z = true;
        } else {
            z = false;
        }
        q qVar = eVar.c;
        if (qVar.f10476a <= 0 || TextUtils.isEmpty(qVar.b) || qVar.c <= 0 || qVar.d < 0) {
            qVar = q();
            qVar.d = FalcoLifecycleActionMonitor.D ? 1 : 0;
            z2 = true;
        } else {
            z2 = false;
        }
        e eVar4 = new e(eVar2, qVar, lVar, eVar.e);
        t(eVar4, "LaunchVisit Update|falcoId=" + eVar4.f10486a + ", " + lVar);
        this.f10481a.r(lVar);
        if (z) {
            FalcoEnvironmentImpl falcoEnvironmentImpl = this.f10481a;
            falcoEnvironmentImpl.p("DevicePortrait Update|falcoId=" + eVar4.f10486a + ", " + eVar2);
            this.f10481a.r(eVar2);
        }
        if (z2) {
            FalcoEnvironmentImpl falcoEnvironmentImpl2 = this.f10481a;
            falcoEnvironmentImpl2.p("ProcessVisit Update|falcoId=" + eVar4.f10486a + ", " + qVar);
            this.f10481a.r(qVar);
        }
    }

    public k l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("d6fa3250", new Object[]{this});
        }
        return this.b.e;
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcf041d", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d = z;
        crt.d(new a());
        c21.d(this);
        c21.c(this);
        sg0.d(this);
    }

    public l n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("a496d050", new Object[]{this});
        }
        return this.b.d;
    }

    @Override // tb.u11, com.taobao.application.common.IApmEventListener
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            crt.d(new c(System.currentTimeMillis()));
        }
    }

    public q r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("e620ff8e", new Object[]{this});
        }
        q qVar = this.b.c;
        if (qVar.d < 0) {
            qVar.d = FalcoLifecycleActionMonitor.D ? 1 : 0;
        }
        return qVar;
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8cb61d3", new Object[]{this});
            return;
        }
        e eVar = this.b;
        k kVar = eVar.e;
        com.taobao.falco.e eVar2 = eVar.b;
        com.taobao.falco.e eVar3 = new com.taobao.falco.e();
        eVar3.f10462a = p();
        eVar3.b = o();
        eVar3.c = eVar2.c;
        eVar3.d = eVar2.d;
        l lVar = new l();
        lVar.f10471a = "COLD";
        lVar.b = SceneIdentifier.getProcessStartTime();
        lVar.d = SceneIdentifier.getInstallType();
        lVar.e = 1;
        lVar.f = SceneIdentifier.isAppBackground() ? 1 : 0;
        lVar.h = this.f10481a.n("env_last_cold_launch_time");
        e eVar4 = new e(eVar3, q(), lVar, kVar);
        FalcoEnvironmentImpl falcoEnvironmentImpl = this.f10481a;
        falcoEnvironmentImpl.p("DevicePortrait Init|falcoId=" + eVar4.f10486a + ", " + eVar4.b);
        FalcoEnvironmentImpl falcoEnvironmentImpl2 = this.f10481a;
        falcoEnvironmentImpl2.p("ProcessVisit Init|falcoId=" + eVar4.f10486a + ", " + eVar4.c);
        FalcoEnvironmentImpl falcoEnvironmentImpl3 = this.f10481a;
        falcoEnvironmentImpl3.p("LaunchVisit Init|falcoId=" + eVar4.f10486a + ", " + eVar4.d);
        t(eVar4, "");
        this.f10481a.r(eVar4.b, eVar4.c, eVar4.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "FlowSession Update|falcoId="
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.falco.v.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0017
            java.lang.String r2 = "5d17e7ea"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r8
            r4[r0] = r9
            r3.ipc$dispatch(r2, r4)
            return
        L_0x0017:
            r3 = 0
            java.lang.String r4 = "afc_id"
            java.lang.Object r4 = r9.get(r4)     // Catch: all -> 0x004c
            java.lang.String r4 = (java.lang.String) r4     // Catch: all -> 0x004c
            java.lang.String r5 = "source_url"
            java.lang.Object r9 = r9.get(r5)     // Catch: all -> 0x004c
            java.lang.String r9 = (java.lang.String) r9     // Catch: all -> 0x004c
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: all -> 0x004c
            if (r5 == 0) goto L_0x0031
            r5 = r3
            goto L_0x0037
        L_0x0031:
            java.lang.String r5 = "\\^"
            java.lang.String[] r5 = r4.split(r5)     // Catch: all -> 0x004c
        L_0x0037:
            com.taobao.falco.k r6 = new com.taobao.falco.k     // Catch: all -> 0x004c
            r6.<init>()     // Catch: all -> 0x004c
            java.lang.String r7 = ""
            if (r4 != 0) goto L_0x0041
            r4 = r7
        L_0x0041:
            r6.f10470a = r4     // Catch: all -> 0x004c
            if (r5 == 0) goto L_0x004e
            int r4 = r5.length     // Catch: all -> 0x004c
            if (r4 != 0) goto L_0x0049
            goto L_0x004e
        L_0x0049:
            r4 = r5[r1]     // Catch: all -> 0x004c
            goto L_0x004f
        L_0x004c:
            r9 = move-exception
            goto L_0x0086
        L_0x004e:
            r4 = r7
        L_0x004f:
            r6.b = r4     // Catch: all -> 0x004c
            if (r9 != 0) goto L_0x0054
            r9 = r7
        L_0x0054:
            r6.c = r9     // Catch: all -> 0x004c
            com.taobao.falco.v$e r9 = r8.b     // Catch: all -> 0x004c
            com.taobao.falco.v$e r4 = new com.taobao.falco.v$e     // Catch: all -> 0x004c
            com.taobao.falco.e r5 = r9.b     // Catch: all -> 0x004c
            com.taobao.falco.q r7 = r9.c     // Catch: all -> 0x004c
            com.taobao.falco.l r9 = r9.d     // Catch: all -> 0x004c
            r4.<init>(r5, r7, r9, r6)     // Catch: all -> 0x004c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: all -> 0x004c
            r9.<init>(r2)     // Catch: all -> 0x004c
            java.lang.String r2 = r4.f10486a     // Catch: all -> 0x004c
            r9.append(r2)     // Catch: all -> 0x004c
            java.lang.String r2 = ", "
            r9.append(r2)     // Catch: all -> 0x004c
            r9.append(r6)     // Catch: all -> 0x004c
            java.lang.String r9 = r9.toString()     // Catch: all -> 0x004c
            r8.t(r4, r9)     // Catch: all -> 0x004c
            com.taobao.falco.FalcoEnvironmentImpl r9 = r8.f10481a     // Catch: all -> 0x004c
            com.taobao.falco.f$a[] r0 = new com.taobao.falco.f.a[r0]     // Catch: all -> 0x004c
            r0[r1] = r6     // Catch: all -> 0x004c
            r9.r(r0)     // Catch: all -> 0x004c
            goto L_0x008f
        L_0x0086:
            java.lang.String r0 = "[doUpdateFlowSession] error."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "falco.env"
            anet.channel.util.ALog.e(r2, r0, r3, r9, r1)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.falco.v.i(java.util.Map):void");
    }

    public final void t(e eVar, String str) {
        e eVar2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1218efd", new Object[]{this, eVar, str});
            return;
        }
        this.b = eVar;
        if (this.d) {
            if (!this.c) {
                this.c = true;
                MeasureSet create = MeasureSet.create();
                create.addMeasure("processId");
                create.addMeasure("processStart");
                create.addMeasure("launchStart");
                create.addMeasure("launchLeave");
                create.addMeasure("isFirstLaunch");
                create.addMeasure("launchStatus");
                create.addMeasure("systemRecovery");
                create.addMeasure("lastColdStart");
                str2 = "launchLeave";
                DimensionSet create2 = DimensionSet.create();
                create2.addDimension("falcoId");
                create2.addDimension("afcId");
                create2.addDimension("afcType");
                create2.addDimension("processName");
                create2.addDimension("launchType");
                create2.addDimension("launchURL");
                create2.addDimension("installation");
                str4 = "launchURL";
                str6 = "falco_visit";
                str5 = FalcoEnvironmentImpl.MONITOR_MODULE;
                str3 = "launchType";
                z61.i(str5, str6, create, create2, true);
            } else {
                str2 = "launchLeave";
                str4 = "launchURL";
                str6 = "falco_visit";
                str5 = FalcoEnvironmentImpl.MONITOR_MODULE;
                str3 = "launchType";
            }
            MeasureValueSet create3 = MeasureValueSet.create();
            eVar2 = eVar;
            create3.setValue("processId", eVar2.c.f10476a);
            create3.setValue("processStart", eVar2.c.c);
            create3.setValue("launchStart", eVar2.d.b);
            create3.setValue(str2, eVar2.d.c);
            create3.setValue("isFirstLaunch", eVar2.d.e);
            create3.setValue("launchStatus", eVar2.d.f);
            create3.setValue("systemRecovery", eVar2.d.g);
            create3.setValue("lastColdStart", eVar2.d.h);
            DimensionValueSet create4 = DimensionValueSet.create();
            create4.setValue("falcoId", eVar2.f10486a);
            create4.setValue("afcId", zxv.c(eVar2.e.f10470a));
            create4.setValue("afcType", eVar2.e.b);
            create4.setValue("processName", eVar2.c.b);
            create4.setValue(str3, eVar2.d.f10471a);
            create4.setValue(str4, zxv.c(eVar2.e.c));
            create4.setValue("installation", eVar2.d.d);
            z61.f(str5, str6, create4, create3);
        } else {
            eVar2 = eVar;
        }
        this.f10481a.p(str);
        this.f10481a.u(FalcoEnvironmentImpl.Category.FLOW_LINE, eVar2.f10486a);
    }
}
