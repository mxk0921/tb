package com.taobao.android.fluid.business.usertrack.track.ut.videotracker;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.akt;
import tb.atb;
import tb.hqv;
import tb.ir9;
import tb.nwv;
import tb.pep;
import tb.t2o;
import tb.uq9;
import tb.uyr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FluidContext f7701a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;

        public a(FluidContext fluidContext, String str, String str2, long j) {
            this.f7701a = fluidContext;
            this.b = str;
            this.c = str2;
            this.d = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            VideoTracker a2 = b.a(this.f7701a);
            if (a2 != null) {
                a2.J(this.b, this.c, this.d);
            }
        }
    }

    static {
        t2o.a(468713645);
    }

    public static void A(FluidContext fluidContext, pep pepVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f631d0a5", new Object[]{fluidContext, pepVar});
        } else if (i()) {
            a.b bVar = new a.b();
            bVar.e = ((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).isEnableSharePlayer() ? 1 : 0;
            ((ITrackService) fluidContext.getService(ITrackService.class)).setVideoTrackerPageInfo(bVar);
            VideoTracker videoTracker = new VideoTracker(fluidContext, null);
            ((ITrackService) fluidContext.getService(ITrackService.class)).setPageVideoTracker(videoTracker);
            if (pepVar != null) {
                videoTracker.t(pepVar.b);
                str = hqv.k(pepVar.f26046a);
            } else {
                str = "";
            }
            videoTracker.B(str);
        }
    }

    public static String C(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8524ae5", new Object[]{new Integer(i)});
        }
        if (i == -1) {
            return null;
        }
        return String.valueOf(i);
    }

    public static void D(FluidContext fluidContext, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23dee0f2", new Object[]{fluidContext, str});
            return;
        }
        ir9.a("changfeng", "videotrack tab3 cache=");
        VideoTracker e = e(fluidContext);
        if (e != null) {
            if (((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionExtParams().f()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            e.P(str, str2);
        }
    }

    public static void E(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f95accb", new Object[]{fluidContext, str});
            return;
        }
        ir9.a("changfeng", "videotrack tab3CacheScene=");
        VideoTracker e = e(fluidContext);
        if (e != null) {
            ir9.b("PickPreloadController", "PickPreloadController,当前tab3缓存场景:" + str);
            e.O(str);
        }
    }

    public static void F(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("952f7e68", new Object[]{fluidContext, str});
            return;
        }
        ir9.a("changfeng", "videotrack tab3IsColdRed=");
        VideoTracker e = e(fluidContext);
        if (e != null) {
            ir9.b("VideoTrackUtil", "PickPreloadController,tab3IsColdRed:" + str);
            e.Q(str);
        }
    }

    public static void G(FluidContext fluidContext, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9235aaf7", new Object[]{fluidContext, new Boolean(z), new Boolean(z2)});
            return;
        }
        VideoTracker e = e(fluidContext);
        if (e != null) {
            e.R(z, z2);
        }
    }

    public static void H(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972a26f6", new Object[]{fluidContext, str});
            return;
        }
        ir9.a("changfeng", "videotrack usePreloadDW=");
        VideoTracker e = e(fluidContext);
        if (e != null) {
            ir9.b("VideoTrackUtil", "PickPreloadController,usePreloadDW:" + str);
            e.S(str);
        }
    }

    public static void I(uq9 uq9Var, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b331cd", new Object[]{uq9Var, str, str2, str3, str4, str5});
            return;
        }
        VideoTracker f = f(uq9Var);
        if (f != null) {
            f.D(str, str2, str3, str4, str5);
        }
    }

    public static void J(FluidContext fluidContext, String str, String str2, int i, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83ac7f9", new Object[]{fluidContext, str, str2, new Integer(i), str3, new Long(j)});
            return;
        }
        VideoTracker e = e(fluidContext);
        if (e != null) {
            e.v(str, str2, i, str3, j);
        }
    }

    public static void K(FluidContext fluidContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3551578", new Object[]{fluidContext, str, str2});
            return;
        }
        VideoTracker e = e(fluidContext);
        if (e != null) {
            e.w(str, str2);
        }
    }

    public static void L(FluidContext fluidContext, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e748db94", new Object[]{fluidContext, str, str2, new Long(j)});
            return;
        }
        VideoTracker e = e(fluidContext);
        if (e != null) {
            e.x(str, str2, j);
        }
    }

    public static void M(FluidContext fluidContext, String str, MtopResponse mtopResponse, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4a6cdc", new Object[]{fluidContext, str, mtopResponse, new Long(j), new Integer(i)});
        } else {
            N(fluidContext, str, mtopResponse, j, i, null);
        }
    }

    public static void N(FluidContext fluidContext, String str, MtopResponse mtopResponse, long j, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f3897a6", new Object[]{fluidContext, str, mtopResponse, new Long(j), new Integer(i), str2});
            return;
        }
        VideoTracker e = e(fluidContext);
        if (e != null) {
            e.y(str, mtopResponse, j, C(i), h(fluidContext), str2);
        }
    }

    public static void O(FluidContext fluidContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f502e838", new Object[]{fluidContext, str, str2});
        } else {
            P(fluidContext, str, str2, -1);
        }
    }

    public static void P(FluidContext fluidContext, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab5a91cb", new Object[]{fluidContext, str, str2, new Integer(i)});
        } else {
            Q(fluidContext, str, str2, i, null);
        }
    }

    public static void Q(FluidContext fluidContext, String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6318fed5", new Object[]{fluidContext, str, str2, new Integer(i), str3});
            return;
        }
        VideoTracker e = e(fluidContext);
        if (e != null) {
            e.z(str, str2, C(i), str3);
        }
    }

    public static void R(FluidContext fluidContext, String str, MtopResponse mtopResponse, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf077b9", new Object[]{fluidContext, str, mtopResponse, new Long(j)});
        } else {
            S(fluidContext, str, mtopResponse, j, -1);
        }
    }

    public static void S(FluidContext fluidContext, String str, MtopResponse mtopResponse, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221ef26a", new Object[]{fluidContext, str, mtopResponse, new Long(j), new Integer(i)});
        } else {
            T(fluidContext, str, mtopResponse, j, i, null);
        }
    }

    public static void U(FluidContext fluidContext, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b020ba1", new Object[]{fluidContext, str, str2, str3, str4, str5});
            return;
        }
        VideoTracker e = e(fluidContext);
        if (e != null) {
            e.D(str, str2, str3, str4, str5);
        }
    }

    public static void V(FluidContext fluidContext, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd73219", new Object[]{fluidContext, str, str2, new Long(j)});
        } else {
            nwv.y0(new a(fluidContext, str, str2, j));
        }
    }

    public static void W(uq9 uq9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("581bf372", new Object[]{uq9Var, str});
            return;
        }
        VideoTracker f = f(uq9Var);
        if (f != null) {
            f.E(str);
        }
    }

    public static void X(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63631b1a", new Object[]{uq9Var});
            return;
        }
        VideoTracker f = f(uq9Var);
        if (f != null) {
            f.U();
        }
    }

    public static /* synthetic */ VideoTracker a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoTracker) ipChange.ipc$dispatch("73b40af3", new Object[]{fluidContext});
        }
        return e(fluidContext);
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7273b16", new Object[]{runnable});
            return;
        }
        try {
            if (!j()) {
                runnable.run();
            } else {
                uyr.b(runnable, 0);
            }
        } catch (Exception unused) {
        }
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca318c0", new Object[]{runnable});
        } else if (runnable != null) {
            b(runnable);
        }
    }

    public static String d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f210d8b2", new Object[]{fluidContext});
        }
        a.b videoTrackerPageInfo = ((ITrackService) fluidContext.getService(ITrackService.class)).getVideoTrackerPageInfo();
        if (videoTrackerPageInfo == null) {
            return null;
        }
        return videoTrackerPageInfo.d;
    }

    public static VideoTracker e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoTracker) ipChange.ipc$dispatch("3f0ed510", new Object[]{fluidContext});
        }
        return ((ITrackService) fluidContext.getService(ITrackService.class)).getPageVideoTracker();
    }

    public static VideoTracker f(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoTracker) ipChange.ipc$dispatch("5a74ba62", new Object[]{uq9Var});
        }
        if (uq9Var == null || uq9Var.T() == null) {
            return null;
        }
        return uq9Var.T().e();
    }

    public static Map g(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2be5799a", new Object[]{fluidContext, str});
        }
        ir9.a("changfeng", "videotrack gettab3CachePoint=");
        HashMap hashMap = new HashMap();
        VideoTracker e = e(fluidContext);
        return e != null ? e.d(fluidContext, str) : hashMap;
    }

    public static String h(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26df6258", new Object[]{fluidContext});
        }
        if (((ILifecycleService) fluidContext.getService(ILifecycleService.class)).getPageState() == 5) {
            return "1";
        }
        return "0";
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5d7a9b5", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableVideoTracker", false);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6775f", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableVideoTrackerThread", true);
    }

    public static void k(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91698e4d", new Object[]{uq9Var});
            return;
        }
        VideoTracker f = f(uq9Var);
        if (f != null) {
            f.K(true);
            f.E("cell_active");
        }
    }

    public static void l(FluidContext fluidContext, uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f38100", new Object[]{fluidContext, uq9Var});
        } else if (i()) {
            VideoTracker videoTracker = new VideoTracker(fluidContext, uq9Var);
            pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
            if (sessionParams != null) {
                videoTracker.t(sessionParams.b);
            }
            videoTracker.k(((IDataService) fluidContext.getService(IDataService.class)).getPreloadUseCacheValue());
            uq9Var.T().n(videoTracker);
        }
    }

    public static void m(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f72213d", new Object[]{uq9Var});
            return;
        }
        VideoTracker f = f(uq9Var);
        if (f != null) {
            f.q();
            f.p();
            f.e();
            f.n();
            f.K(false);
        }
    }

    public static void n(uq9 uq9Var, a.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b18c3a", new Object[]{uq9Var, eVar});
        } else {
            f(uq9Var);
        }
    }

    public static void o(uq9 uq9Var, atb atbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14aed78d", new Object[]{uq9Var, atbVar});
            return;
        }
        ir9.a("changfeng", "videotrack video onVideoDestroy ");
        VideoTracker f = f(uq9Var);
        if (f != null) {
            if (atbVar != null) {
                ir9.a("changfeng", "videotrack video videoQoS ");
                f.I(atbVar.o());
            }
            f.G();
            f.E("destroy_player");
        }
    }

    public static void p(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c082d83", new Object[]{uq9Var, new Boolean(z)});
            return;
        }
        ir9.a("changfeng", "videotrack video onVideoFirstFrame");
        VideoTracker f = f(uq9Var);
        if (f != null) {
            a.C0413a b = f.b();
            if (z) {
                b.o(0L);
            }
            long g = uq9Var.T().g();
            if (g > 0) {
                f.T(g);
            }
            f.F("first_frame_rendered", b);
            f.u(z);
        }
    }

    public static void q(uq9 uq9Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ecdd033", new Object[]{uq9Var, new Integer(i)});
            return;
        }
        ir9.a("changfeng", "videotrack video onVideoPlayError code=" + i);
        VideoTracker f = f(uq9Var);
        if (f != null) {
            f.H("error", i);
        }
    }

    public static void s(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc645798", new Object[]{uq9Var});
            return;
        }
        ir9.a("changfeng", "videotrack onVideoReplay video onVideoPreComplete");
        VideoTracker f = f(uq9Var);
        if (f != null) {
            f.E("end");
        }
    }

    public static void u(uq9 uq9Var, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d709a20", new Object[]{uq9Var, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        VideoTracker f = f(uq9Var);
        if (f != null) {
            f.l(i, i2, i3);
        }
    }

    public static void w(uq9 uq9Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d36cf7", new Object[]{uq9Var, new Integer(i)});
            return;
        }
        ir9.a("changfeng", "videotrack video onVideoSeekTo=" + i);
        VideoTracker f = f(uq9Var);
        if (f != null) {
            f.r(i);
        }
    }

    public static void x(uq9 uq9Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ba535", new Object[]{uq9Var, new Long(j)});
            return;
        }
        ir9.a("changfeng", "videotrack video onVideoStallEnd duration=" + j);
        VideoTracker f = f(uq9Var);
        if (f != null) {
            f.g(j);
        }
    }

    public static void y(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86cb9e36", new Object[]{uq9Var});
            return;
        }
        ir9.a("changfeng", "videotrack video onVideoStallStart");
        VideoTracker f = f(uq9Var);
        if (f != null) {
            f.h();
        }
    }

    public static void z(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8634a87e", new Object[]{uq9Var});
            return;
        }
        ir9.a("changfeng", "videotrack video onVideoStart name=");
        VideoTracker f = f(uq9Var);
        if (f != null) {
            f.i();
        }
    }

    public static void B(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12e40cc2", new Object[]{fluidContext});
            return;
        }
        ir9.a("changfeng", "videotrack video enter ");
        if (((ITrackService) fluidContext.getService(ITrackService.class)).isPageFirstEnter()) {
            ((ITrackService) fluidContext.getService(ITrackService.class)).setPageFirstEnter(true);
            VideoTracker e = e(fluidContext);
            if (e != null) {
                e.j();
            }
        }
    }

    public static void r(uq9 uq9Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99a92bd", new Object[]{uq9Var, new Integer(i)});
            return;
        }
        ir9.a("changfeng", "videotrack video onVideoPlayFail code=" + i);
        VideoTracker f = f(uq9Var);
        if (f != null) {
            f.H("fail", i);
            f.N(false);
            f.U();
            f.m();
            f.E("play");
        }
    }

    public static void t(uq9 uq9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f3019b", new Object[]{uq9Var, str});
            return;
        }
        ir9.a("changfeng", "videotrack video onVideoPrepared name=");
        VideoTracker f = f(uq9Var);
        if (f != null) {
            f.L(str);
            f.M(true);
        }
    }

    public static void T(FluidContext fluidContext, String str, MtopResponse mtopResponse, long j, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25815b4", new Object[]{fluidContext, str, mtopResponse, new Long(j), new Integer(i), str2});
            return;
        }
        VideoTracker e = e(fluidContext);
        if (e != null && mtopResponse != null) {
            String str3 = "";
            if ("videoinfo_mtop_end".equals(str)) {
                long detailMtopCost = ((IDataService) fluidContext.getService(IDataService.class)).getDetailMtopCost();
                Long valueOf = Long.valueOf(detailMtopCost);
                if (detailMtopCost > 0) {
                    str3 = String.valueOf(valueOf);
                }
            } else if ("detail_mtop_end".equals(str) || "rec_mtop_end".equals(str)) {
                str3 = String.valueOf(((IInteractionService) fluidContext.getService(IInteractionService.class)).getConfig().e());
            }
            e.A(str, mtopResponse.getApi(), j, str3, C(i), h(fluidContext), str2);
        }
    }

    public static void v(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e08a3b", new Object[]{uq9Var});
            return;
        }
        ir9.a("changfeng", "videotrack video onVideoReplay");
        VideoTracker f = f(uq9Var);
        if (f != null) {
            f.M(false);
            f.U();
            f.m();
            f.E("replay");
        }
        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) uq9Var.U().getService(IDataService.class)).getCurrentMediaSetData();
        String str = null;
        a.d e = currentMediaSetData != null ? currentMediaSetData.e() : null;
        if (e != null) {
            str = e.O();
        }
        if (str == null) {
            return;
        }
        if (str.equals(((ITrackService) uq9Var.U().getService(ITrackService.class)).getRecordContentId())) {
            ((ITrackService) uq9Var.U().getService(ITrackService.class)).setRecordCount(((ITrackService) uq9Var.U().getService(ITrackService.class)).getRecordCount() + 1);
            return;
        }
        ((ITrackService) uq9Var.U().getService(ITrackService.class)).setRecordContentId(str);
        ((ITrackService) uq9Var.U().getService(ITrackService.class)).setRecordCount(1);
    }
}
