package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.falco.m;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e21 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public m f18220a;
    public long b = 0;
    public long c = 0;
    public String d;
    public String e;

    static {
        t2o.a(729809209);
    }

    public e21() {
        try {
            this.f18220a = FalcoGlobalTracer.get().d(m.MODULE, "tap").g(this.b).e();
        } catch (Exception e) {
            d9j.d("MultiTabPerformance", "ApmPerfMonitor init error", e);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            return;
        }
        if (a()) {
            this.f18220a.finish();
            c();
        }
        this.c = 0L;
        this.e = "";
        this.d = "";
        this.b = 0L;
        this.f18220a = null;
    }

    public m d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("7bb09e0", new Object[]{this});
        }
        return this.f18220a;
    }

    public final <T> T e(String str, T t) {
        Map<String, ?> j0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7528ee34", new Object[]{this, str, t});
        }
        try {
            j0 = this.f18220a.j0();
        } catch (Exception e) {
            d9j.d("MultiTabPerformance", "ApmPerfMonitor getSpanValue error", e);
        }
        if (j0 == null) {
            return t;
        }
        T t2 = (T) j0.get(str);
        if (t2 == null) {
            return t;
        }
        if (t instanceof String) {
            return t2;
        }
        if (t instanceof Long) {
            return t2;
        }
        if (t instanceof Integer) {
            return t2;
        }
        return t;
    }

    public void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("376616a7", new Object[]{this, new Long(j)});
            return;
        }
        m mVar = this.f18220a;
        if (mVar != null) {
            mVar.r(Long.valueOf(j));
        }
    }

    public void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f49ef59", new Object[]{this, new Long(j)});
            return;
        }
        m mVar = this.f18220a;
        if (mVar != null) {
            mVar.D(Long.valueOf(j));
        }
    }

    public void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4df053f", new Object[]{this, new Long(j)});
            return;
        }
        m mVar = this.f18220a;
        if (mVar != null) {
            mVar.q0(Long.valueOf(j));
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e424317", new Object[]{this, str});
            return;
        }
        m mVar = this.f18220a;
        if (mVar != null) {
            mVar.Q("HomepageFragment_" + str);
        }
    }

    public void j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2bb9f2f", new Object[]{this, new Long(j)});
            return;
        }
        m mVar = this.f18220a;
        if (mVar != null) {
            mVar.u(Long.valueOf(j));
        }
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2bf183", new Object[]{this, new Boolean(z)});
            return;
        }
        m mVar = this.f18220a;
        if (mVar != null) {
            mVar.M(z);
        }
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96e88712", new Object[]{this, new Boolean(z)});
            return;
        }
        m mVar = this.f18220a;
        if (mVar != null) {
            mVar.p(z);
        }
    }

    public void m(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f75fa4a", new Object[]{this, new Long(j)});
            return;
        }
        m mVar = this.f18220a;
        if (mVar != null) {
            mVar.E(Long.valueOf(j));
        }
    }

    public void n(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b759d2fc", new Object[]{this, new Long(j)});
            return;
        }
        m mVar = this.f18220a;
        if (mVar != null) {
            mVar.e0(Long.valueOf(j));
        }
    }

    public void o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b2c2ea5", new Object[]{this, new Long(j)});
            return;
        }
        m mVar = this.f18220a;
        if (mVar != null) {
            mVar.K(Long.valueOf(j));
        }
    }

    public void p(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63100757", new Object[]{this, new Long(j)});
            return;
        }
        m mVar = this.f18220a;
        if (mVar != null) {
            mVar.c0(Long.valueOf(j));
        }
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
        } else if (this.f18220a != null && TextUtils.isEmpty(this.d)) {
            this.d = str;
            m mVar = this.f18220a;
            mVar.y("HomepageFragment_" + str);
        }
    }

    public void r(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d669b7bf", new Object[]{this, new Long(j)});
            return;
        }
        m mVar = this.f18220a;
        if (mVar != null && this.c == 0) {
            this.c = j;
            mVar.U(Long.valueOf(j));
        }
    }

    public void s(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4d9071", new Object[]{this, new Long(j)});
            return;
        }
        m mVar = this.f18220a;
        if (mVar != null) {
            mVar.V(Long.valueOf(j));
        }
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d0cde1", new Object[]{this, str});
            return;
        }
        m mVar = this.f18220a;
        if (mVar != null) {
            mVar.Z(str);
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
            return;
        }
        m mVar = this.f18220a;
        if (mVar != null) {
            mVar.h0(str);
        }
    }

    public void v(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b9a3f8b", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132e82a8", new Object[]{this, str});
        } else if (this.f18220a != null && TextUtils.isEmpty(this.e)) {
            this.e = str;
            this.f18220a.t0(str);
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("777f70da", new Object[]{this})).booleanValue();
        }
        m mVar = this.f18220a;
        if (mVar == null || mVar.j0() == null) {
            return false;
        }
        try {
            String str = (String) e("pageName", "");
            long longValue = ((Long) e("fcp", 0L)).longValue();
            long longValue2 = ((Long) e("pageCreateS", 0L)).longValue();
            long longValue3 = ((Long) e("pageCreateE", 0L)).longValue();
            d9j.c("MultiTabPerformance", "ApmPerfMonitor " + this.f18220a.getFalcoId() + ",checkInvalid pageName：" + str + ",fcp:" + longValue + ",pageCreateS:" + longValue2 + ",pageCreateE:" + longValue3);
            if (TextUtils.isEmpty(str) || longValue <= 0) {
                return false;
            }
            return (this.b <= 0 || longValue2 == 0 || longValue3 == 0) ? false : true;
        } catch (Exception e) {
            d9j.d("MultiTabPerformance", "ApmPerfMonitor checkInvalid error", e);
            return false;
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b62fd0e", new Object[]{this});
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String str = (String) e("pageName", "");
        String str2 = (String) e("transition", "");
        String str3 = (String) e("fromPageName", "");
        String str4 = (String) e("techStack", "");
        String str5 = (String) e("isFirstLoad", "0");
        String str6 = (String) e("isHitCache", "0");
        Long l = "0";
        long longValue = ((Long) e(IMultiTabPerformanceListener.ON_ROUTE_END, 0L)).longValue() - ((Long) e(IMultiTabPerformanceListener.ON_ROUTE_START, 0L)).longValue();
        long longValue2 = ((Long) e("pageCreateE", 0L)).longValue() - ((Long) e("pageCreateS", 0L)).longValue();
        long longValue3 = ((Long) e(IMultiTabPerformanceListener.ON_CONTAINER_INIT_END, 0L)).longValue() - ((Long) e(IMultiTabPerformanceListener.ON_CONTAINER_INIT_START, 0L)).longValue();
        long longValue4 = ((Long) e(IMultiTabPerformanceListener.ON_REQUEST_END, 0L)).longValue() - ((Long) e(IMultiTabPerformanceListener.ON_REQUEST_START, 0L)).longValue();
        long longValue5 = ((Long) e("fcp", 0L)).longValue();
        long longValue6 = ((Long) e("fsp", 0L)).longValue();
        concurrentHashMap.put("fromPageName", str3);
        concurrentHashMap.put("techStack", str4);
        concurrentHashMap.put("isFirstLoad", str5);
        concurrentHashMap.put("isHitCache", str6);
        concurrentHashMap.put("route", String.valueOf(longValue));
        concurrentHashMap.put(RenderTrackUtils.pageCreate, String.valueOf(longValue2));
        concurrentHashMap.put("containerInit", String.valueOf(longValue3 < 0 ? l : Long.valueOf(longValue3)));
        if (longValue4 >= 0) {
            l = Long.valueOf(longValue4);
        }
        concurrentHashMap.put("mainDocRequest", String.valueOf(l));
        concurrentHashMap.put("fcp", String.valueOf(longValue5));
        concurrentHashMap.put("fsp", String.valueOf(longValue6));
        d9j.c("MultiTabPerformance", "ApmPerfMonitor " + this.f18220a.getFalcoId() + ",commit提交 -> fromPageName:" + str3 + ",pageName:" + str + ",transition:" + str2 + "，isFirstLoad:" + str5 + "，isHitCache:" + str6 + "，techStack:" + str4 + "，route:" + longValue + ",pageCreate:" + longValue2 + ",containerInit:" + longValue3 + ",mainDocRequest:" + longValue4 + ",fcp:" + longValue5 + ",fsp:" + longValue6);
        d9j.b(str, str2, concurrentHashMap);
    }
}
