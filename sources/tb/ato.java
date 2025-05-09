package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.exception.FluidException;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ato implements wfc, zod {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f15994a;
    public final olk<wfc> b = new olk<>();
    public final olk<zod> c = new olk<>();

    static {
        t2o.a(468714757);
        t2o.a(468714755);
        t2o.a(468714754);
        t2o.a(468714756);
    }

    public ato(FluidContext fluidContext) {
        this.f15994a = fluidContext;
    }

    @Override // tb.zod
    public void a(pep pepVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111b582b", new Object[]{this, pepVar});
            return;
        }
        ir9.b("SceneConfigChangedManager", "场景配置 SessionParams 发生变化");
        List<zod> b = this.c.b();
        if (!(b == null || b.isEmpty())) {
            for (zod zodVar : b) {
                try {
                    zodVar.a(pepVar);
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.f15994a, zodVar, "onSessionParamsChanged", e);
                }
            }
        }
    }

    @Override // tb.wfc
    public void b(FluidInstanceConfig fluidInstanceConfig, pep pepVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a84556", new Object[]{this, fluidInstanceConfig, pepVar});
            return;
        }
        ir9.b("SceneConfigChangedManager", "场景配置 FluidInstanceConfig 发生变化：\n视频流原始链接：" + fluidInstanceConfig.getFluidOriginUrl() + "\n视频流唤端链接：" + fluidInstanceConfig.getFluidUrl() + "\n视频流父容器 PageInterface: " + fluidInstanceConfig.getHostPageInterface());
        List<wfc> b = this.b.b();
        if (!(b == null || b.isEmpty())) {
            for (wfc wfcVar : b) {
                try {
                    wfcVar.b(fluidInstanceConfig, pepVar);
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.f15994a, wfcVar, "onInstanceConfigChanged", e);
                }
            }
        }
    }

    public void c(wfc wfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f907f64f", new Object[]{this, wfcVar});
        } else if (wfcVar != null) {
            this.b.a(wfcVar);
        }
    }

    public void d(zod zodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94481887", new Object[]{this, zodVar});
        } else if (zodVar != null) {
            this.c.a(zodVar);
        }
    }

    public void e(wfc wfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aecc918c", new Object[]{this, wfcVar});
        } else if (wfcVar != null) {
            this.b.e(wfcVar);
        }
    }

    public void f(zod zodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48045f04", new Object[]{this, zodVar});
        } else if (zodVar != null) {
            this.c.e(zodVar);
        }
    }
}
