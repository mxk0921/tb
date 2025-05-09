package tb;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.mute.IMuteService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.c;
import com.taobao.kirinvideoengine.model.ConfigModel;
import com.taobao.kirinvideoengine.model.EngineModel;
import com.taobao.kirinvideoengine.model.MediaModel;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.HashMap;
import tb.b85;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hxg implements trc, IMediaPlayer.OnErrorListener, qtb, IMediaPlayer.OnPreparedListener, TaoLiveVideoView.n, IMediaPlayer.OnInfoListener, ric {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f20942a;
    public final k5h b;
    public atb c;
    public boolean d;
    public boolean e;
    public xxc f;
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements nj9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f20943a;

        public a(boolean z) {
            this.f20943a = z;
        }

        @Override // tb.nj9
        public long getStartTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
            }
            if (this.f20943a) {
                return hxg.c(hxg.this).h1().T();
            }
            return hxg.c(hxg.this).n1().g();
        }
    }

    static {
        t2o.a(468713976);
        t2o.a(468714525);
        t2o.a(774898020);
        t2o.a(452985045);
        t2o.a(774898025);
        t2o.a(774897986);
        t2o.a(774898021);
        t2o.a(500170807);
    }

    public hxg(k5h k5hVar) {
        this.f20942a = k5hVar.U();
        this.b = k5hVar;
        h();
    }

    public static /* synthetic */ k5h c(hxg hxgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k5h) ipChange.ipc$dispatch("f2361beb", new Object[]{hxgVar});
        }
        return hxgVar.b;
    }

    @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.n
    public void I(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
            return;
        }
        ir9.b("DWInstanceManager", "[liveCallback]onStart()  iMediaPlayer=" + iMediaPlayer + " mIDWInstance=" + this.c);
        atb atbVar = this.c;
        if (atbVar != null) {
            this.b.h1().O(atbVar.getView());
        }
    }

    public HashMap<String, String> e(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("47f932da", new Object[]{this, cVar});
        }
        return xq9.i(this.f20942a, this.b.T().f(), this.b, cVar.f7800a, null, cVar.a(), false, false);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("591bc57", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18387dbf", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public atb getDWInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("3f62c678", new Object[]{this});
        }
        return this.c;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9344b335", new Object[]{this});
        } else {
            this.b.E0().addMediaLifecycleListener(this);
        }
    }

    @Override // tb.qtb
    public boolean hook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
        }
        ir9.b("DWInstanceManager", "[liveCallback]hook()");
        this.b.F0().hook(this.b);
        this.b.G0().hook(this.b);
        return false;
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4c56c63", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d50839b7", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    @Override // tb.trc
    public void onDataUpdate(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18deb5ea", new Object[]{this, uq9Var});
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        ir9.b("DWInstanceManager", "[liveCallback]onError() i=" + i + " i1=" + i2 + "; iMediaPlayer=" + iMediaPlayer + " ;mIDWInstance=" + this.c);
        this.b.F0().onError(this.b, iMediaPlayer, i, i2);
        this.b.G0().onError(this.b, iMediaPlayer, i, i2);
        atb atbVar = this.c;
        if (atbVar != null) {
            this.b.m0(atbVar.getView());
        }
        return false;
    }

    @Override // tb.trc
    public void onPauseMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460321a5", new Object[]{this, uq9Var});
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
            return;
        }
        ir9.b("DWInstanceManager", "[liveCallback]onPrepared()  iMediaPlayer=" + iMediaPlayer + " mIDWInstance=" + this.c);
        this.b.F0().onPrepared(this.b, iMediaPlayer);
        this.b.G0().onPrepared(this.b, iMediaPlayer);
    }

    @Override // tb.trc
    public void onRecyclePlayer(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b871be7", new Object[]{this, uq9Var, new Boolean(z)});
        }
    }

    @Override // tb.trc
    public void onRequestMediaPlayer(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0a2eed", new Object[]{this, uq9Var});
        } else if (this.c == null && this.b.l1() != null) {
            ir9.b("DWInstanceManager", "[liveCallback]onRequestMediaPlayer()," + this.b.X());
            d();
            this.b.h1().Y(this.c.getView(), this.b.h1().R());
            this.b.n1().i();
            s19.x(this.b, this.c.t());
            this.f = mfj.y(this.b.U(), this.b.k1().getDWInstance());
        }
    }

    @Override // tb.trc
    public void onShowCover(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b0cef3", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.trc
    public void onShowFirstCover(uq9 uq9Var, int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7e3629", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), drawable, str});
        }
    }

    @Override // tb.trc
    public void onStartMedia(uq9 uq9Var, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4fe1f9", new Object[]{this, uq9Var, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // tb.trc
    public void onStopMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd05673b", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.trc
    public void onUTPairsUpdate(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55533c7c", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.ric
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // tb.ric
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // tb.ric
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        } else {
            onError((IMediaPlayer) obj, i, i2);
        }
    }

    @Override // tb.ric
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        } else {
            onInfo((IMediaPlayer) obj, j, j2, j3, obj2);
        }
    }

    @Override // tb.ric
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.ric
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        }
    }

    @Override // tb.ric
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        } else {
            onPrepared((IMediaPlayer) obj);
        }
    }

    @Override // tb.ric
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.ric
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // tb.ric
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ric
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        } else {
            I(null);
        }
    }

    public void i(k5h k5hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6813a276", new Object[]{this, k5hVar});
            return;
        }
        ir9.b("DWInstanceManager", "释放直播播放器：" + this.c);
        atb atbVar = this.c;
        if (atbVar != null) {
            ViewGroup view = atbVar.getView();
            if (!n5h.d()) {
                k5hVar.h1().Q().removeView(view);
            } else if (view != null && (view.getParent() instanceof ViewGroup)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (!c5g.c("live") || !c5g.d("live")) {
                this.c.a();
                this.c.destroy();
            } else {
                ir9.b("DWInstanceManager", "标准化播放器销毁 delayDestroy = " + this.g);
                if (this.g) {
                    this.c.k(1000);
                } else {
                    this.c.destroy();
                }
            }
            if (!(this.f == null || this.f20942a.getService(IMuteService.class) == null)) {
                ((IMuteService) this.f20942a.getService(IMuteService.class)).removeMuteFlagChangedListener(this.f);
            }
            this.c = null;
            k5hVar.R0(false);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3c16cb", new Object[]{this});
            return;
        }
        boolean isFirstSetAdapter = ((ITrackService) this.f20942a.getService(ITrackService.class)).isFirstSetAdapter();
        ((ITrackService) this.f20942a.getService(ITrackService.class)).setFirstSetAdapter(false);
        pep sessionParams = ((ISceneConfigService) this.f20942a.getService(ISceneConfigService.class)).getSessionParams();
        boolean c = c5g.c("live");
        ir9.b("DWInstanceManager", "live enableKirin=" + c);
        if (c) {
            EngineModel engineModel = new EngineModel();
            ConfigModel.a aVar = new ConfigModel.a();
            boolean d = c5g.d("live");
            ir9.b("DWInstanceManager", "live enableKirin enableStandard=" + d);
            aVar.l(d);
            engineModel.configModel = aVar.i();
            MediaModel.b bVar = new MediaModel.b(this.b.P());
            bVar.H("guangguang").e0("TBLive").c0(this.f20942a.getInstanceConfig().getPlayScenes()).J(this.b.P()).T("live").R(vwg.S(this.b.l1())).O(false).I(true).Z(bbw.f(this.b.l1().e(), this.b.o1().e()));
            if (kfj.b(this.f20942a)) {
                bVar.P(Boolean.TRUE);
            }
            if (sessionParams != null) {
                bVar.W(sessionParams.c).Y(sessionParams.b);
            }
            engineModel.mediaModel = bVar.G();
            engineModel.utParams = e(this.b.l1());
            engineModel.playExpUTParams = d5w.k(this.f20942a, this.b.T().f(), this.b.l1().f7800a, isFirstSetAdapter, true);
            i5g i5gVar = new i5g(this.f20942a.getContext());
            qic m = i5gVar.m(engineModel, ((IMediaService) this.f20942a.getService(IMediaService.class)).getKirinEngineDelegate());
            if (m instanceof d85) {
                d85 d85Var = (d85) m;
                d85Var.F(vwg.S(this.b.l1()), null);
                d85Var.G();
            }
            this.c = new d5g(m, i5gVar, engineModel);
            m.d(this);
            m.E(this);
        } else {
            c.C0535c cVar = new c.C0535c((Activity) this.b.R());
            cVar.t(0).e("TBLive").d(sessionParams.c).x(e(this.b.l1())).q(d5w.k(this.f20942a, this.b.T().f(), this.b.l1().f7800a, isFirstSetAdapter, true)).r(((ISceneConfigService) this.f20942a.getService(ISceneConfigService.class)).getSessionExtParams().e()).z(bbw.f(this.b.l1().e(), this.b.o1().e()));
            if (kfj.b(this.f20942a)) {
                cVar.y(true);
                cVar.s(false);
            }
            cVar.i(true);
            c a2 = cVar.a();
            this.c = new b85.b((Activity) this.b.R()).d(a2);
            a2.T(false);
            a2.L(vwg.S(this.b.l1()), null);
            a2.x(this);
            a2.P(this);
            a2.B(this);
            a2.A(this);
            a2.y(this);
            a2.a0();
        }
        if (sessionParams != null) {
            this.c.setBizCode(sessionParams.c);
        }
        this.c.l(new a(isFirstSetAdapter));
        this.b.m1().m(this.c);
        boolean f1 = this.b.f1();
        ir9.b("DWInstanceManager", "预热标识，canUseLivWarmup = " + f1);
        if (f1 && this.b.l1() != null && n5h.d()) {
            ir9.b("DWInstanceManager", "开始预热");
            this.c.u(null);
            this.d = true;
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        atb atbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        ir9.b("DWInstanceManager", "[liveCallback]onInfo() what=" + j + " extra=" + j2 + " ext=" + j3 + " obj=" + obj + "; iMediaPlayer=" + iMediaPlayer);
        this.b.F0().onInfo(this.b, iMediaPlayer, j, j2, j3, obj);
        this.b.G0().onInfo(this.b, iMediaPlayer, j, j2, j3, obj);
        if (3 == j && (atbVar = this.c) != null) {
            this.b.m0(atbVar.getView());
        } else if (12000 == j) {
            ir9.b("DWInstanceManager", "预热成功");
            this.e = true;
        }
        return false;
    }
}
