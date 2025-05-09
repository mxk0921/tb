package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e85 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f18349a;
    public final prp b;
    public atb c;
    public boolean d;

    static {
        t2o.a(468714070);
        t2o.a(468714514);
    }

    public e85(prp prpVar) {
        this.f18349a = prpVar.U();
        this.b = prpVar;
    }

    public boolean a() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12077e58", new Object[]{this})).booleanValue();
        }
        this.c = d();
        StringBuilder sb = new StringBuilder("canReuseIdwInstance:");
        if (this.c != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        ir9.b("DWInstancePreCreateManager", sb.toString());
        atb atbVar = this.c;
        if (atbVar == null || atbVar.getView() == null) {
            return false;
        }
        ntm ntmVar = (ntm) this.c.getView().getTag(R.id.fluid_sdk_tag_preloadVideo);
        if (ntmVar != null) {
            return ntmVar.a(this.b.R());
        }
        if (this.c.getView().getContext() == this.b.R()) {
            return true;
        }
        return false;
    }

    public atb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("26b6f08b", new Object[]{this});
        }
        return c();
    }

    public final atb c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("d6a5cd69", new Object[]{this});
        }
        atb atbVar = this.c;
        if (atbVar == null) {
            return null;
        }
        ir9.b("DWInstancePreCreateManager", "PickPreloadController VideoProcess ShortVideoCard.onRequestMediaPlayer (idwInstance != null)?true");
        this.b.F1().S(atbVar.getView());
        ((ITrackService) this.f18349a.getService(ITrackService.class)).setFirstSetAdapter(false);
        this.d = true;
        this.c = atbVar;
        boolean isFirstSetUTParams = ((ITrackService) this.f18349a.getService(ITrackService.class)).isFirstSetUTParams();
        if (isFirstSetUTParams) {
            int f = this.b.T().f();
            atbVar.e(this.b.A1().n(this.b.D1()));
            atbVar.c(d5w.k(this.b.U(), f, this.b.D1().f7800a, isFirstSetUTParams, true));
            ((ITrackService) this.f18349a.getService(ITrackService.class)).setFirstSetUTParams(false);
        }
        f();
        return this.c;
    }

    public final atb d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("244dbe58", new Object[]{this});
        }
        return ij9.j(this.b.U());
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63e9e988", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final void f() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f86385de", new Object[]{this});
        } else if (this.c != null && ((IMediaService) this.f18349a.getService(IMediaService.class)).isUseDefaultValueCreateDW()) {
            this.b.T1(true);
            pep sessionParams = ((ISceneConfigService) this.b.U().getService(ISceneConfigService.class)).getSessionParams();
            if (sessionParams != null) {
                this.c.setBizCode(sessionParams.c);
            }
            if (this.b.G1().c().k == 0) {
                i = this.b.G1().c().c;
            } else {
                i = this.b.G1().c().k;
            }
            this.c.f(this.b.G1().c().d, i);
            this.c.c(d5w.v(true));
        }
    }
}
