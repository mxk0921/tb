package tb;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.Downgrade;
import com.taobao.downgrade.DowngradeStrategy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class l3p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final l3p INSTANCE = new l3p();

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23096a;
    public static boolean b;

    static {
        t2o.a(815792241);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (tb.sr3.a(r6, tb.yak.f31939a) != false) goto L_0x002a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.l3p.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "357469c0"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            boolean r2 = tb.rv6.a()
            if (r2 == 0) goto L_0x002b
            tb.yko r2 = tb.yak.f31939a     // Catch: Exception -> 0x002a
            boolean r2 = tb.sr3.a(r6, r2)     // Catch: Exception -> 0x002a
            if (r2 == 0) goto L_0x002b
        L_0x002a:
            return r0
        L_0x002b:
            boolean r6 = tb.o4p.f1(r6)
            if (r6 == 0) goto L_0x0032
            return r1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.l3p.a(java.lang.String):boolean");
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8924ba89", new Object[]{this})).booleanValue();
        }
        if (!Localization.o() || !o4p.s2()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[]{this})).booleanValue();
        }
        return b;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0596413", new Object[]{this})).booleanValue();
        }
        return f23096a;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55e93947", new Object[]{this})).booleanValue();
        }
        return a("tbsearch_fps_perf_v1");
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a9a9bf9", new Object[]{this})).booleanValue();
        }
        return a("tbsearch_dynamic_pic_degraded");
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12705782", new Object[]{this})).booleanValue();
        }
        return a("tbsearch_non_intelligent_end");
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21578b34", new Object[]{this})).booleanValue();
        }
        return a("tbsearch_non_video");
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e36543f", new Object[]{this})).booleanValue();
        }
        return !ckf.b("degrade", Downgrade.getInstance().getDowngradeStrategy("search").getTacticsPerformance()) || !e();
    }

    public final void j() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ccc611", new Object[]{this});
            return;
        }
        DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy("search");
        if (ckf.b("degrade", downgradeStrategy.getTacticsPerformance()) && o4p.g1()) {
            z = true;
        }
        f23096a = z;
        b = ckf.b("degrade", downgradeStrategy.getTacticsPerformance());
    }
}
