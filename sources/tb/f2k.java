package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.DataVersionManager;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class f2k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468714593);
        }

        public a() {
        }

        @JvmStatic
        public final int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3b59b6d", new Object[]{this, new Integer(i)})).intValue();
            }
            if (i > 0) {
                return 0;
            }
            return d();
        }

        @JvmStatic
        public final int b(Context context, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("601953b2", new Object[]{this, context, new Boolean(z)})).intValue();
            }
            ckf.g(context, "context");
            return pr9.h(context);
        }

        @JvmStatic
        public final int c(FluidContext fluidContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("632be418", new Object[]{this, fluidContext})).intValue();
            }
            ckf.g(fluidContext, "fluidContext");
            Context context = fluidContext.getContext();
            ckf.f(context, "fluidContext.context");
            return b(context, f(fluidContext));
        }

        public final int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1918858", new Object[]{this})).intValue();
            }
            return FluidSDK.getRemoteConfigAdapter().getOrangeIntConfig("progressBarBottomGapMore", 84);
        }

        @JvmStatic
        public final boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
            }
            return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableNewUI0217", true);
        }

        @JvmStatic
        public final boolean f(FluidContext fluidContext) {
            String str;
            ISceneConfigService iSceneConfigService;
            pep sessionParams;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("956f024", new Object[]{this, fluidContext})).booleanValue();
            }
            if (fluidContext == null || (iSceneConfigService = (ISceneConfigService) fluidContext.getService(ISceneConfigService.class)) == null || (sessionParams = iSceneConfigService.getSessionParams()) == null) {
                str = null;
            } else {
                str = sessionParams.b;
            }
            return g(str);
        }

        @JvmStatic
        public final boolean g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1efd03c", new Object[]{this, str})).booleanValue();
            }
            int f = DataVersionManager.Companion.f(str);
            boolean h = h(Integer.valueOf(f));
            ir9.b("NewUIConfig", "isEnableNewUI: sessionType:" + str + " , dataVersion:" + f + ", result:" + h);
            return h;
        }

        public final boolean h(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e024f3d0", new Object[]{this, num})).booleanValue();
            }
            if (num == null || num.intValue() < 1) {
                return false;
            }
            return true;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(468714592);
    }

    @JvmStatic
    public static final int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b59b6d", new Object[]{new Integer(i)})).intValue();
        }
        return Companion.a(i);
    }

    @JvmStatic
    public static final int b(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("601953b2", new Object[]{context, new Boolean(z)})).intValue();
        }
        return Companion.b(context, z);
    }

    @JvmStatic
    public static final int c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("632be418", new Object[]{fluidContext})).intValue();
        }
        return Companion.c(fluidContext);
    }

    @JvmStatic
    public static final boolean d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("956f024", new Object[]{fluidContext})).booleanValue();
        }
        return Companion.f(fluidContext);
    }
}
