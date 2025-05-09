package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.undermode.IUnderageModeService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class kgv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final kgv INSTANCE = new kgv();
    public static final String TAG = "UnderageModeHelper";

    static {
        t2o.a(468713547);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5bed81b", new Object[]{this})).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableSystemMinorsProtect", false);
    }

    public final int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2be8977b", new Object[]{this, context})).intValue();
        }
        ckf.g(context, "context");
        int s = xpr.s(context);
        ir9.b("UnderageModeHelper", "getMinorsAgeLevel minorsAgeLevel:" + s);
        return s;
    }

    public final void c(FluidContext fluidContext, Activity activity) {
        lgv config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b797881", new Object[]{this, fluidContext, activity});
            return;
        }
        ckf.g(fluidContext, "fluidContext");
        ckf.g(activity, "activity");
        ir9.b("UnderageModeHelper", "handleClosingLimitDialog, activity=" + activity);
        if (a()) {
            xpr.n(activity);
        } else {
            qxr.d(activity);
        }
        mgv.INSTANCE.d();
        IUnderageModeService iUnderageModeService = (IUnderageModeService) fluidContext.getService(IUnderageModeService.class);
        if (iUnderageModeService != null && (config = iUnderageModeService.getConfig()) != null) {
            config.d(false);
        }
    }

    public final boolean f(FluidContext fluidContext) {
        Boolean bool;
        lgv config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("297f5fac", new Object[]{this, fluidContext})).booleanValue();
        }
        ckf.g(fluidContext, "fluidContext");
        Context context = fluidContext.getContext();
        ckf.f(context, "fluidContext.context");
        boolean h = h(context);
        IUnderageModeService iUnderageModeService = (IUnderageModeService) fluidContext.getService(IUnderageModeService.class);
        if (iUnderageModeService == null || (config = iUnderageModeService.getConfig()) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(config.b());
        }
        if (!h || !nwv.o(bool, false)) {
            return false;
        }
        mgv mgvVar = mgv.INSTANCE;
        Application a2 = p91.a();
        ckf.f(a2, "AppUtils.getApplication()");
        boolean a3 = mgvVar.a(a2);
        ir9.b("UnderageModeHelper", "isForbiddenVideoPlayInUnderageMode isVideoForbidden:" + bool + "; isTimeLockClosed:" + a3);
        return !a3;
    }

    public final boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df23cbce", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "context");
        boolean A = xpr.A(context);
        ir9.b("UnderageModeHelper", "isUnderageMode isSystemMinors:" + A);
        return A;
    }

    public final boolean h(Context context) {
        String str;
        a3w queryCurrentVersionInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("624d0df1", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "context");
        if (a()) {
            boolean y = xpr.y(context);
            ir9.b("UnderageModeHelper", "isUnderageMode enableSystemMinors=true, isMinors:" + y);
            return y;
        }
        t1c t1cVar = (t1c) n78.a(t1c.class);
        if (t1cVar == null || (queryCurrentVersionInfo = t1cVar.queryCurrentVersionInfo()) == null) {
            str = null;
        } else {
            str = queryCurrentVersionInfo.c;
        }
        ir9.b("UnderageModeHelper", "isUnderageMode enableSystemMinors=false,versionCode:" + str);
        return ckf.b("children_version", str);
    }

    public final void d(FluidContext fluidContext, Activity activity, String str) {
        lgv config;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7afc92bd", new Object[]{this, fluidContext, activity, str});
            return;
        }
        ckf.g(fluidContext, "fluidContext");
        ckf.g(activity, "activity");
        ckf.g(str, "mode");
        boolean a2 = a();
        if (!a2) {
            qxr.f(activity, "tab2", str);
        } else if (xpr.E(activity, "tab2", str) == -1) {
            z = true;
        }
        ir9.b("UnderageModeHelper", "handlePoppingLimitDialog -。enableSystemMonitors = " + a2 + ", interceptBySystemMinors=" + z + ",  activity=" + activity);
        if (!z) {
            mgv.INSTANCE.b(fluidContext, activity);
            vrp vrpVar = new vrp("VSMSG_pausePlayer", pcw.i(fluidContext), null);
            IMessageService iMessageService = (IMessageService) fluidContext.getService(IMessageService.class);
            if (iMessageService != null) {
                iMessageService.sendMessage(vrpVar);
            }
            IUnderageModeService iUnderageModeService = (IUnderageModeService) fluidContext.getService(IUnderageModeService.class);
            if (iUnderageModeService != null && (config = iUnderageModeService.getConfig()) != null) {
                config.d(true);
            }
        }
    }

    public final boolean e(FluidContext fluidContext) {
        lgv config;
        Boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("458edc5f", new Object[]{this, fluidContext})).booleanValue();
        }
        ckf.g(fluidContext, "fluidContext");
        IUnderageModeService iUnderageModeService = (IUnderageModeService) fluidContext.getService(IUnderageModeService.class);
        if (iUnderageModeService == null || (config = iUnderageModeService.getConfig()) == null || (a2 = config.a()) == null) {
            return false;
        }
        boolean booleanValue = a2.booleanValue();
        Context context = fluidContext.getContext();
        ckf.f(context, "fluidContext.context");
        boolean h = h(context);
        ir9.b("UnderageModeHelper", "isCurrentModeChanged isUnderageModeNow:" + h + "，currentDataIsUnderageMode=" + booleanValue);
        return h != booleanValue;
    }
}
