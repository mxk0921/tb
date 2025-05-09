package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.list.render.ListRenderManager;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class yre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_ENTER_IMMERSIVE_VIDEO = "1";
    public static final String TYPE_EXIT_IMMERSIVE_VIDEO = "2";
    public static final String TYPE_PAUSE_EXIT = "3";
    public static final String TYPE_RECOVER_PLAY_ENTER = "4";
    public static final String TYPE_VIDEO_AMPLIFY = "5";

    static {
        t2o.a(468714360);
    }

    public static void a(FluidContext fluidContext, d5n d5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa1c16c", new Object[]{fluidContext, d5nVar});
        } else if (d69.f(fluidContext) && d5nVar != null) {
            ((ListRenderManager.f) d5nVar).a();
        }
    }

    public static void b(FluidContext fluidContext, int i, String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2af2804b", new Object[]{fluidContext, new Integer(i), str, new Boolean(z), new Boolean(z2)});
        } else if (pto.i(fluidContext)) {
            if (((IDataService) fluidContext.getService(IDataService.class)).isTab3CacheEnable()) {
                i--;
            }
            if (i > 0 || ((i == 0 && z) || (i == 0 && z2))) {
                c(fluidContext, "1", null, String.valueOf(i), null, str);
                return;
            }
            ir9.b("ImmersiveVideoHelper", "首坑不进入发送进入沉浸式消息，index:" + i + ",needScaleMediaCard:" + z);
        }
    }

    public static void c(FluidContext fluidContext, String str, String str2, String str3, String str4, String str5) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10596e4", new Object[]{fluidContext, str, str2, str3, str4, str5});
        } else if (pto.i(fluidContext) && ((IHostTNodeService) fluidContext.getService(IHostTNodeService.class)).getTab2ServiceDelegate() != null) {
            if (!Objects.equals(str, "1") && !Objects.equals(str, "4") && !Objects.equals(str, "5")) {
                z = false;
            }
            ir9.b("ImmersiveVideoHelper", "sendImmersiveVideoMsg,type=" + str);
            d(fluidContext, z);
        }
    }

    public static void d(FluidContext fluidContext, boolean z) {
        h3e tab2ServiceDelegate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0cc397", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        ir9.b("ImmersiveVideoHelper", "setImmersiveForNativeTab2,  enterImmersive=" + z);
        if (fluidContext != null && (tab2ServiceDelegate = ((IHostTNodeService) fluidContext.getService(IHostTNodeService.class)).getTab2ServiceDelegate()) != null) {
            if (z) {
                tab2ServiceDelegate.p(true);
                tab2ServiceDelegate.A(false, true);
                return;
            }
            tab2ServiceDelegate.p(false);
            tab2ServiceDelegate.A(true, true);
        }
    }
}
