package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import java.util.HashMap;
import java.util.Map;
import tb.tz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class tq9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f28881a;
    public final sy8 e;
    public sy8 f;
    public final Map<String, qz8> d = new HashMap();
    public final tz8 b = FalcoGlobalTracer.get();
    public final boolean c = true;

    static {
        t2o.a(468713847);
        t2o.a(468713852);
    }

    public tq9(FluidContext fluidContext, sy8 sy8Var) {
        this.f28881a = fluidContext;
        this.e = sy8Var;
        c();
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("576da6b9", new Object[]{this});
        }
        return "全链路监控，场景：ShortVideoPage_" + ((FluidInstanceAnalysis) this).h();
    }

    public void b(String str) {
        sy8 sy8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3935f4e", new Object[]{this, str});
        } else if (((FluidInstanceAnalysis) this).g() && this.c && (sy8Var = this.f) != null) {
            sy8Var.t(str);
            ir9.b("FluidAnalysis", a() + " Span 结束, 状态：" + str);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd4003bf", new Object[]{this});
        } else if (this.b == null) {
            ir9.b("FluidAnalysis", a() + " FalcoTracer 为空");
        } else {
            FluidInstanceAnalysis fluidInstanceAnalysis = (FluidInstanceAnalysis) this;
            if (fluidInstanceAnalysis.g()) {
                tz8.a d = this.b.d("ShortVideoPage", "ShortVideoPage_" + fluidInstanceAnalysis.h());
                sy8 sy8Var = this.e;
                if (sy8Var != null) {
                    d.f(sy8Var);
                }
                this.f = d.i();
                for (String str : fluidInstanceAnalysis.i()) {
                    ((HashMap) this.d).put(str, this.f.n(str));
                }
                ir9.b("FluidAnalysis", a() + " Span 开始");
            }
        }
    }

    public void d(String str, ar9 ar9Var) {
        qz8 qz8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64587b6b", new Object[]{this, str, ar9Var});
            return;
        }
        FluidInstanceAnalysis fluidInstanceAnalysis = (FluidInstanceAnalysis) this;
        if (fluidInstanceAnalysis.g() && this.c && (qz8Var = (qz8) ((HashMap) this.d).get(str)) != null) {
            this.f.t("failed");
            qz8Var.a(null, ar9Var.c());
            fluidInstanceAnalysis.h();
            FluidException.throwException(this.f28881a, ar9Var);
            ir9.b("FluidAnalysis", a() + " Stage：" + str + " 失败");
        }
    }

    public void e(String str) {
        qz8 qz8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e12aa3", new Object[]{this, str});
            return;
        }
        FluidInstanceAnalysis fluidInstanceAnalysis = (FluidInstanceAnalysis) this;
        if (fluidInstanceAnalysis.g() && this.c && (qz8Var = (qz8) ((HashMap) this.d).get(str)) != null) {
            qz8Var.c(null);
            fluidInstanceAnalysis.h();
            ir9.b("FluidAnalysis", a() + " Stage：" + str + " 成功");
        }
    }

    public void f(String str) {
        qz8 qz8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba46df95", new Object[]{this, str});
        } else if (((FluidInstanceAnalysis) this).g() && this.c && (qz8Var = (qz8) ((HashMap) this.d).get(str)) != null) {
            qz8Var.b(null);
            ir9.b("FluidAnalysis", a() + " Stage：" + str + " 开始");
        }
    }
}
