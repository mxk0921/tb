package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f92 implements o6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Boolean b = null;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f19110a;

    static {
        t2o.a(468713518);
        t2o.a(468714445);
    }

    public f92(FluidContext fluidContext) {
        this.f19110a = fluidContext;
        ((ILifecycleService) fluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7f7e10e", new Object[0])).booleanValue();
        }
        if (b == null) {
            b = Boolean.valueOf(nwv.o(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("enableBehaviorX", "true"), false));
        }
        return b.booleanValue();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9393d5b9", new Object[]{this});
            return;
        }
        try {
            if (j()) {
                g00 a2 = wl0.a();
                pep sessionParams = ((ISceneConfigService) this.f19110a.getService(ISceneConfigService.class)).getSessionParams();
                if (sessionParams != null) {
                    String str = sessionParams.d;
                    if (str == null) {
                        str = "";
                    }
                    a2.commitEnter("Page_videointeract", str, this.f19110a.getContext(), hqv.d(sessionParams.f26046a));
                }
            }
        } catch (Throwable th) {
            ir9.c("BehaviorXManager", "", th);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29bd1618", new Object[]{this});
            return;
        }
        try {
            if (j()) {
                g00 a2 = wl0.a();
                pep sessionParams = ((ISceneConfigService) this.f19110a.getService(ISceneConfigService.class)).getSessionParams();
                if (sessionParams != null) {
                    String str = sessionParams.d;
                    if (str == null) {
                        str = "";
                    }
                    a2.commitLeave("Page_videointeract", str, this.f19110a.getContext(), new String[0]);
                }
            }
        } catch (Throwable th) {
            ir9.c("BehaviorXManager", "", th);
        }
    }

    @Override // tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            b();
        }
    }

    @Override // tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            a();
        }
    }

    @Override // tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }
}
