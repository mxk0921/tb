package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.falco.m;
import com.taobao.falco.s;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wfz implements IMultiTabPerformanceListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UNDER_LINE = "_";

    /* renamed from: a  reason: collision with root package name */
    public final vfz f30671a;
    public e21 b = null;
    public final Map<String, e21> c = new ConcurrentHashMap();
    public final fuq d;

    static {
        t2o.a(729809492);
        t2o.a(729809467);
    }

    public wfz(fuq fuqVar) {
        this.d = fuqVar;
        this.f30671a = new vfz(fuqVar);
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c33edfbe", new Object[]{this});
        }
        return "";
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public void b(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4f37ac", new Object[]{this, str, new Long(j), str2});
        } else if (!TextUtils.equals(str2, IMultiTabPerformanceListener.TAB_SCROLL_SELECT)) {
            this.b = l(str);
            if (j("onPageCreateEnd")) {
                this.b.o(j);
            }
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public void c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ea05e7", new Object[]{this, str, new Integer(i)});
            return;
        }
        e21 e21Var = this.b;
        e21Var.i(str + "_" + i);
        Map<String, e21> map = this.c;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(i);
        d9j.c("MultiTabPerformance", "MultiTabPerformance onTabUnSelect tabId:" + str + ",position:" + i);
        k((e21) ((ConcurrentHashMap) map).get(sb.toString()));
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public m d(String str) {
        e21 e21Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("a09ba216", new Object[]{this, str});
        }
        if (j("getSpan") && (e21Var = (e21) ((ConcurrentHashMap) this.c).get(str)) != null) {
            return e21Var.d();
        }
        return null;
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96e88712", new Object[]{this, new Boolean(z)});
        } else if (j("setIsHitCache")) {
            this.b.l(z);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132e82a8", new Object[]{this, str});
        } else if (j("setTransition")) {
            this.b.w(str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r7.equals(com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener.ON_FCP_END) == false) goto L_0x0040;
     */
    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(java.lang.String r7, long r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = tb.wfz.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001d
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r8)
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r2] = r6
            r8[r1] = r7
            r8[r0] = r5
            java.lang.String r7 = "43194197"
            r4.ipc$dispatch(r7, r8)
            return
        L_0x001d:
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 == 0) goto L_0x002b
            java.lang.String r7 = "MultiTabPerformance"
            java.lang.String r8 = "MultiTabPerformance onRenderState ApmBuilder or stage null"
            tb.d9j.c(r7, r8)
            return
        L_0x002b:
            java.lang.String r4 = "onRenderState"
            boolean r4 = r6.j(r4)
            if (r4 != 0) goto L_0x0035
            return
        L_0x0035:
            r7.hashCode()
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1258252939: goto L_0x007a;
                case -1258252925: goto L_0x006e;
                case -1030542692: goto L_0x0064;
                case 114956972: goto L_0x0058;
                case 835168564: goto L_0x004d;
                case 835168578: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            r0 = -1
            goto L_0x0085
        L_0x0042:
            java.lang.String r0 = "containerInitS"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x004b
            goto L_0x0040
        L_0x004b:
            r0 = 5
            goto L_0x0085
        L_0x004d:
            java.lang.String r0 = "containerInitE"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0056
            goto L_0x0040
        L_0x0056:
            r0 = 4
            goto L_0x0085
        L_0x0058:
            java.lang.String r0 = "fspRenderE"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0062
            goto L_0x0040
        L_0x0062:
            r0 = 3
            goto L_0x0085
        L_0x0064:
            java.lang.String r1 = "fcpRenderE"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0085
            goto L_0x0040
        L_0x006e:
            java.lang.String r0 = "mainDocRequestS"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0078
            goto L_0x0040
        L_0x0078:
            r0 = 1
            goto L_0x0085
        L_0x007a:
            java.lang.String r0 = "mainDocRequestE"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0084
            goto L_0x0040
        L_0x0084:
            r0 = 0
        L_0x0085:
            switch(r0) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x00a1;
                case 2: goto L_0x009b;
                case 3: goto L_0x0095;
                case 4: goto L_0x008f;
                case 5: goto L_0x0089;
                default: goto L_0x0088;
            }
        L_0x0088:
            goto L_0x00ac
        L_0x0089:
            tb.e21 r7 = r6.b
            r7.g(r8)
            goto L_0x00ac
        L_0x008f:
            tb.e21 r7 = r6.b
            r7.f(r8)
            goto L_0x00ac
        L_0x0095:
            tb.e21 r7 = r6.b
            r7.j(r8)
            goto L_0x00ac
        L_0x009b:
            tb.e21 r7 = r6.b
            r7.h(r8)
            goto L_0x00ac
        L_0x00a1:
            tb.e21 r7 = r6.b
            r7.n(r8)
            goto L_0x00ac
        L_0x00a7:
            tb.e21 r7 = r6.b
            r7.m(r8)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wfz.h(java.lang.String, long):void");
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public void i(String str, int i) {
        s e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15da4480", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.f30671a.g(str, i);
        this.b = l(str);
        if (j("onTabSelect")) {
            d9j.c("MultiTabPerformance", "MultiTabPerformance onTabSelect tabId:" + str + ",position:" + i + ",span:" + this.b.d());
            e21 e21Var = this.b;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(i);
            e21Var.q(sb.toString());
            n(i);
            long currentTimeMillis = System.currentTimeMillis();
            try {
                tz8 tz8Var = FalcoGlobalTracer.get();
                if (!(tz8Var == null || (e = tz8Var.e()) == null)) {
                    currentTimeMillis = e.z();
                }
            } catch (Exception e2) {
                d9j.d("MultiTabPerformance", "MultiTabPerformance labelOnTabSelect touchStartTime get error:", e2);
            }
            this.b.v(currentTimeMillis);
            this.b.s(currentTimeMillis);
        }
    }

    public final boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63850b7a", new Object[]{this, str})).booleanValue();
        }
        if (this.b != null) {
            return true;
        }
        d9j.c("MultiTabPerformance", "MultiTabPerformance " + str + "-> checkApmMonitorAvailable mCurrentApmPerfMonitor null");
        return false;
    }

    public final void k(e21 e21Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22dd415e", new Object[]{this, e21Var});
        } else if (e21Var == null) {
            d9j.c("MultiTabPerformance", "MultiTabPerformance commit apmPerfMonitor null:");
        } else {
            d9j.c("MultiTabPerformance", "MultiTabPerformance commit span:" + e21Var.d());
            e21Var.b();
            for (Map.Entry entry : ((ConcurrentHashMap) this.c).entrySet()) {
                if (entry.getValue() == e21Var) {
                    ((ConcurrentHashMap) this.c).remove(entry.getKey());
                }
            }
        }
    }

    public final e21 l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e21) ipChange.ipc$dispatch("90a175b0", new Object[]{this, str});
        }
        int u = this.d.u(str);
        Map<String, e21> map = this.c;
        e21 e21Var = (e21) ((ConcurrentHashMap) map).get(str + "_" + u);
        if (e21Var == null) {
            e21Var = new e21();
        }
        Map<String, e21> map2 = this.c;
        ((ConcurrentHashMap) map2).put(str + "_" + u, e21Var);
        return e21Var;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        d9j.c("MultiTabPerformance", "MultiTabPerformance onStop commit:");
        k(this.b);
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else if (j("setTopic")) {
            this.b.u(str);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public void f(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73d5585", new Object[]{this, str, new Long(j), str2});
        } else if (!TextUtils.equals(str2, IMultiTabPerformanceListener.TAB_SCROLL_SELECT)) {
            this.b = l(str);
            if (j("onPageCreateStart")) {
                this.b.r(j);
                this.b.p(j);
                this.b.k(true);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r3.equals(com.taobao.tao.infoflow.multitab.nativetab.NativeContainerProvider.DX_CONTAINER) == false) goto L_0x004f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(int r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.wfz.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001a
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r6)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r5
            r6[r0] = r4
            java.lang.String r0 = "8cb9a20c"
            r3.ipc$dispatch(r0, r6)
            return
        L_0x001a:
            java.lang.String r3 = "setTechStack"
            boolean r3 = r5.j(r3)
            if (r3 != 0) goto L_0x0024
            return
        L_0x0024:
            tb.fuq r3 = r5.d
            java.lang.String r3 = r3.j(r6)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0044
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MultiTabPerformance setTechStack containerType null position:"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "MultiTabPerformance"
            tb.d9j.c(r0, r6)
            return
        L_0x0044:
            r3.hashCode()
            r6 = -1
            int r4 = r3.hashCode()
            switch(r4) {
                case -139919088: goto L_0x007e;
                case 179717709: goto L_0x0075;
                case 514841930: goto L_0x0069;
                case 989204668: goto L_0x005d;
                case 1463130501: goto L_0x0051;
                default: goto L_0x004f;
            }
        L_0x004f:
            r0 = -1
            goto L_0x0088
        L_0x0051:
            java.lang.String r0 = "hourlyDelivery"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x005b
            goto L_0x004f
        L_0x005b:
            r0 = 4
            goto L_0x0088
        L_0x005d:
            java.lang.String r0 = "recommend"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0067
            goto L_0x004f
        L_0x0067:
            r0 = 3
            goto L_0x0088
        L_0x0069:
            java.lang.String r0 = "subscribe"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0073
            goto L_0x004f
        L_0x0073:
            r0 = 2
            goto L_0x0088
        L_0x0075:
            java.lang.String r1 = "dxContainer"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0088
            goto L_0x004f
        L_0x007e:
            java.lang.String r0 = "campaign"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0087
            goto L_0x004f
        L_0x0087:
            r0 = 0
        L_0x0088:
            switch(r0) {
                case 0: goto L_0x0090;
                case 1: goto L_0x008c;
                case 2: goto L_0x008c;
                case 3: goto L_0x008c;
                case 4: goto L_0x008c;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x0093
        L_0x008c:
            java.lang.String r3 = "native"
            goto L_0x0093
        L_0x0090:
            java.lang.String r3 = "h5"
        L_0x0093:
            tb.e21 r6 = r5.b
            r6.t(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wfz.n(int):void");
    }
}
