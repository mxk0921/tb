package tb;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.intelligence.IIntelligenceService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e59 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713520);
    }

    public static LruCache<String, f59> a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("581003c6", new Object[]{fluidContext});
        }
        if (c()) {
            return ((IIntelligenceService) fluidContext.getService(IIntelligenceService.class)).getConfig().b();
        }
        return null;
    }

    public static zmh b(d59 d59Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zmh) ipChange.ipc$dispatch("743239d6", new Object[]{d59Var});
        }
        return d59Var.b;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f176699d", new Object[0])).booleanValue();
        }
        return nwv.o(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("enableVideoFeedback", "false"), false);
    }

    public static void d(FluidContext fluidContext, d59 d59Var, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38887f71", new Object[]{fluidContext, d59Var, aVar});
        } else if (c()) {
            zmh zmhVar = new zmh(fluidContext);
            d59Var.b = zmhVar;
            try {
                zmhVar.b(aVar.e().K().a(), aVar.e().K());
            } catch (Throwable th) {
                ir9.c("LruFeedBack", "", th);
            }
        }
    }

    public static void e(d59 d59Var, int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b48ea2a", new Object[]{d59Var, new Integer(i), aVar});
            return;
        }
        zmh b = b(d59Var);
        if (b != null) {
            try {
                b.c(aVar.e().K().a(), i);
            } catch (Throwable th) {
                ir9.c("LruFeedBack", "", th);
            }
        }
    }

    public static void f(d59 d59Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e62b83", new Object[]{d59Var});
            return;
        }
        zmh b = b(d59Var);
        if (b != null) {
            b.f(false);
            b.g();
        }
    }
}
