package tb;

import android.util.Pair;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.r;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class obf implements o6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f25280a;
    public final prp b;
    public boolean c = false;
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewParent f25281a;

        public a(ViewParent viewParent) {
            this.f25281a = viewParent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ViewParent viewParent = this.f25281a;
            if (viewParent instanceof ViewGroup) {
                ((ViewGroup) viewParent).removeView(obf.a(obf.this).B1().Q());
                ir9.a("InsideContinuedPlayManager", "coverViewGoneForSharePlayerStillVideo 移除mCoverImageView延迟");
            }
        }
    }

    static {
        t2o.a(468714046);
        t2o.a(468714045);
        t2o.a(468714445);
    }

    public obf(prp prpVar) {
        this.f25280a = prpVar.U();
        this.b = prpVar;
        u();
    }

    public static /* synthetic */ prp a(obf obfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (prp) ipChange.ipc$dispatch("549f534e", new Object[]{obfVar});
        }
        return obfVar.b;
    }

    public void b(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf1221a", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        String o = o();
        if (z2 && ogi.e().j()) {
            ir9.a("InsideContinuedPlayManager", "clearSharePlayer 清空数据");
            g7m.o().e(true, ogi.e().h(o));
            ogi.e().c();
        } else if (z && l9f.f().m()) {
            l9f.f().d(o);
        }
    }

    public atb k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("26b6f08b", new Object[]{this});
        }
        return p();
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c6308e", new Object[]{this})).booleanValue();
        }
        boolean m = m();
        atb p = p();
        if (!m || p == null || p.getVideoState() == 7) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afbf9518", new Object[]{this})).booleanValue();
        }
        l9f f = l9f.f();
        String o = o();
        if (this.b.D1() != null) {
            str = this.b.D1().t();
        } else {
            str = "";
        }
        return f.b(o, str);
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("baca22bd", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.enableTab3RestAlbumSharePlayerFlag", true);
    }

    public final String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe2dfd1b", new Object[]{this});
        }
        return this.f25280a.getInstanceConfig().getPreCoverKey();
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
            return;
        }
        String o = o();
        l9f.f().s(false);
        r i = ogi.e().i(o);
        boolean b = ogi.e().b(o);
        if (i != null && b) {
            i.V(ogi.e().l(o));
            g7m.o().e(true, ogi.e().h(o));
            ogi.e().p(false);
            ogi.e().c();
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
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        ir9.b("InsideContinuedPlayManager", "PageLifecycle video ShortVideoCard.onStart ");
        l9f f = l9f.f();
        prp prpVar = this.b;
        f.q(prpVar, prpVar.j0(), this.b.h0());
    }

    @Override // tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public final atb p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("7411e278", new Object[]{this});
        }
        return l9f.f().i(o());
    }

    public boolean t() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb42a3e8", new Object[]{this})).booleanValue();
        }
        if (this.b.n1().Y() || !s() || this.b.n1().getDWInstance() == null || this.b.n1().getDWInstance().o() == null || nwv.t(this.b.n1().getDWInstance().o().get("first_frame_rendering_time"), -1) <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (ogi.e().k(o()) || z) {
            return true;
        }
        return false;
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9344b335", new Object[]{this});
        } else {
            ((ILifecycleService) this.b.U().getService(ILifecycleService.class)).addPageLifecycleListener(this);
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebacbb7d", new Object[]{this});
            return;
        }
        ogi.e().p(false);
        l9f.f().s(false);
        this.c = false;
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f68409f9", new Object[]{this})).booleanValue();
        }
        boolean orangeBooleanConfig = FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableCheckFirstFrameRender", true);
        tfs.d("根据qos获取首帧时间判断首帧是否渲染的开关：orange开关打开：" + orangeBooleanConfig);
        return orangeBooleanConfig;
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7410b348", new Object[]{this, new Boolean(z)});
        } else if (chi.c()) {
            String o = o();
            boolean m = ogi.e().m(o);
            if (ogi.e().b(o) && m) {
                if (this.b.B1().Q() != null) {
                    ViewParent parent = this.b.B1().Q().getParent();
                    if (parent != null) {
                        Pair<Integer, Integer> r = r(this.f25280a);
                        int i = 30;
                        int i2 = 40;
                        if (r != null) {
                            try {
                                i = ((Integer) r.first).intValue();
                                i2 = ((Integer) r.second).intValue();
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                        ir9.a("InsideContinuedPlayManager", " 移除mCoverImageView延迟来自进度条回调：" + z + "，时间配置，firstFrameRemoveDelayTime：" + i + "，processRemoveDelayTime：" + i2);
                        this.b.B1().Q().postDelayed(new a(parent), z ? i2 : i);
                    } else {
                        return;
                    }
                }
                b(false, true);
            }
        }
    }

    @Override // tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ir9.b("InsideContinuedPlayManager", "PageLifecycle video page ShortVideoCard.onResume " + this.b.M());
        if (!pto.g(this.b.U())) {
            l9f f = l9f.f();
            prp prpVar = this.b;
            f.p(prpVar, prpVar.j0(), this.b.h0(), true);
        } else if (this.b.j0() && this.b.h0()) {
            boolean e = oau.e();
            if (n()) {
                l9f f2 = l9f.f();
                prp prpVar2 = this.b;
                f2.p(prpVar2, prpVar2.j0(), this.b.h0(), true ^ e);
            }
            if (e) {
                ir9.a("PickPreloadController", "onResume(),起播");
                this.b.V0(false);
                return;
            }
            this.b.p1().removeMessages(0);
            if (this.b.L1()) {
                this.b.R1(false);
                this.b.V0(false);
            }
        }
    }

    public final Pair<Integer, Integer> r(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("557d935a", new Object[]{this, fluidContext});
        }
        try {
            Pair<Integer, Integer> b = ((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).getConfig().b();
            if (b != null) {
                return b;
            }
            String[] split = FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("removeFirstFrameDelayTime", "30,40").split(",");
            Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
            ((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).getConfig().d(pair);
            return pair;
        } catch (Throwable th) {
            ir9.c("InsideContinuedPlayManager", "", th);
            return Pair.create(30, 40);
        }
    }

    public void v(atb atbVar, boolean z, boolean z2) {
        String str;
        int i;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a491710c", new Object[]{this, atbVar, new Boolean(z), new Boolean(z2)});
        } else if (atbVar != null) {
            ir9.b("InsideContinuedPlayManager", "onRequestMediaByViewSharePlayer 创建续播mDWInstance");
            int f = this.b.T().f();
            if (this.b.D1() != null) {
                str = this.b.D1().t();
            } else {
                str = "";
            }
            VideoControllerManager.q(str, true);
            boolean isFirstSetUTParams = ((ITrackService) this.f25280a.getService(ITrackService.class)).isFirstSetUTParams();
            ((ITrackService) this.f25280a.getService(ITrackService.class)).setFirstSetUTParams(false);
            this.b.A1().u(f);
            this.c = true;
            if (z2) {
                l9f.f().s(true);
                ((ISharePlayerService) this.b.U().getService(ISharePlayerService.class)).setHasShowInnerSharePlayerPV(true);
                l9f.f().t(true);
            } else {
                ogi.e().p(true);
            }
            xau.t(this.b.U(), this.c);
            ((ISharePlayerService) this.b.U().getService(ISharePlayerService.class)).setEnableSharePlayer(this.c);
            xau.s(this.b.U(), 0);
            this.b.n1().r();
            if (pto.h(this.b.U())) {
                HashMap<String, String> hashMap = new HashMap<>(1);
                hashMap.put("bizGroup", "guangguang_fullscreen");
                this.b.n1().getDWInstance().p(hashMap);
            }
            HashMap<String, String> hashMap2 = new HashMap<>(1);
            hashMap2.put("optSourcerPipeSize", "true");
            this.b.n1().getDWInstance().p(hashMap2);
            ((IMediaService) this.f25280a.getService(IMediaService.class)).getConfig().f(true);
            this.b.n1().getDWInstance().i(DWInstanceType.VIDEO);
            ((ISharePlayerService) this.b.U().getService(ISharePlayerService.class)).setHasCreateDWInstance(true);
            long currentTimeMillis = System.currentTimeMillis();
            s0j.i(this.b.U(), currentTimeMillis - this.b.A1().l());
            this.b.A1().t(currentTimeMillis);
            boolean m = ogi.e().m(this.b.U().getInstanceConfig().getPreCoverKey());
            boolean c = ((ISharePlayerService) this.b.U().getService(ISharePlayerService.class)).getConfig().c();
            boolean c2 = chi.c();
            ir9.a("InsideContinuedPlayManager", "updateView，全屏页收到双列流是否首帧渲染完成：开关是否关闭：" + c + "，开关是否打开：" + chi.c());
            if (z2 || (z && (!m || !c2))) {
                ViewParent parent = this.b.B1().Q().getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.b.B1().Q());
                    ir9.a("InsideContinuedPlayManager", "onRequestMediaByViewSharePlayer 移除mCoverImageView");
                }
                if (m && z) {
                    ir9.a("InsideContinuedPlayManager", "onRequestMediaByViewSharePlayer 没有播起来的视频设置picImageView");
                    this.b.n1().getDWInstance().s(this.b.B1().Q());
                }
            }
            this.b.n1().p();
            this.b.G1().g("reuse-shareplayer", false);
            if (this.b.G1().c().k == 0) {
                i = this.b.G1().c().c;
            } else {
                i = this.b.G1().c().k;
            }
            this.b.n1().getDWInstance().f(this.b.G1().c().d, i);
            this.b.F1().V(this.b.n1().getDWInstance().getView());
            if (this.b.F1().R() != null) {
                if (this.b.F1().R().getParent() != null) {
                    ((ViewGroup) this.b.F1().R().getParent()).removeView(this.b.F1().R());
                }
                ir9.a("InsideContinuedPlayManager", "onRequestMediaByViewSharePlayer 增加videoView");
                this.b.F1().U(this.b.F1().R(), this.b.G1().b());
            }
            prp prpVar = this.b;
            s19.x(prpVar, prpVar.n1().getDWInstance().t());
            prp prpVar2 = this.b;
            prpVar2.E.put("totalTime", String.valueOf(prpVar2.D1().d() / 1000));
            this.b.E.put(tmu.CURRENT_TIME, "0");
            long currentTimeMillis2 = System.currentTimeMillis();
            s0j.m(this.b.U(), currentTimeMillis2 - this.b.A1().l());
            this.b.A1().t(currentTimeMillis2);
            this.b.y1().x0(this.b.D1().d());
            d6w.t++;
            ir9.a(prp.TAG, "video count=" + d6w.t);
            this.b.t1().a();
            this.b.T().r(false);
            this.b.n1().getDWInstance().p(d5w.k(this.b.U(), f, this.b.D1().f7800a, isFirstSetUTParams, true));
            this.b.n1().getDWInstance().c(d5w.w(true));
            HashMap hashMap3 = new HashMap(1);
            hashMap3.put(sj4.KEY_VIDEO_UPDATE_PARAMS, "videoActionType=sharePlayer");
            this.b.n1().getDWInstance().v(hashMap3);
            if (!((IQuickOpenService) this.f25280a.getService(IQuickOpenService.class)).isQuickOpenMode()) {
                this.b.n1().E();
            }
            if (!z2) {
                if (!z) {
                    return;
                }
                if (m && c2) {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("clearSharePlayer 清空数据，是否是播放起来的视频：");
            sb.append(z && !m);
            sb.append("双列流首帧是否已经渲染完成：");
            if (!z || !c) {
                z3 = false;
            }
            sb.append(z3);
            ir9.a("InsideContinuedPlayManager", sb.toString());
            b(z2, z);
        }
    }
}
