package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.tao.util.ImageStrategyDecider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xv4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714001);
    }

    public static String a(String str, r8e r8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b8de2d2", new Object[]{str, r8eVar});
        }
        if (str == null || str.startsWith("/storage")) {
            return str;
        }
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(r8eVar.d), Integer.valueOf(r8eVar.c), FluidSDK.getImageAdapter().getImageStrategyConfig(r8eVar));
    }

    public static String b(FluidContext fluidContext, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afbd51e", new Object[]{fluidContext, aVar});
        }
        if (aVar == null || aVar.e() == null || !aVar.e().C()) {
            return null;
        }
        return aVar.e().K().f(fluidContext);
    }

    public static void c(a.e eVar) {
        String e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("595d432c", new Object[]{eVar});
        } else if (eVar != null && TextUtils.isEmpty(eVar.g()) && (e = eVar.e()) != null) {
            if (e.startsWith("/storage")) {
                eVar.s(e);
            } else {
                eVar.s(FluidSDK.getImageAdapter().decideUrl(e, eVar.x(), eVar.n()));
            }
        }
    }
}
