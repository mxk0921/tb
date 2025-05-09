package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.hostapp.IHostAppService;
import com.taobao.android.fluid.framework.preload.IPreCacheService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.uc.webview.export.media.CommandID;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.f9e;
import tb.fe8;
import tb.trc;
import tb.wlb;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class d5w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f17603a;
    public final prp b;
    public long c;
    public int d;
    public boolean e;
    public boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends wlb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/usertrack/track/ut/card/videocard/VideoCardTrackManager$1");
        }

        @Override // tb.wlb.a, tb.wlb
        public void onActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
                return;
            }
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.k(d5w.a(d5w.this));
            xau.D(d5w.a(d5w.this).U(), ((ITrackService) d5w.a(d5w.this).U().getService(ITrackService.class)).getThisCardCommonTrack(d5w.a(d5w.this)));
        }

        @Override // tb.wlb.a, tb.wlb
        public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
                return;
            }
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.l(d5w.a(d5w.this).U(), d5w.a(d5w.this));
            RenderTrackUtils.a(d5w.a(d5w.this).U(), "renderStart");
            s0j.a(s0j.TRACE_VIDEOTAB_SHORTVIDEOCARD_ONBINDDATA);
        }

        @Override // tb.wlb.a, tb.wlb
        public void onDisActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
            } else {
                com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.m(d5w.a(d5w.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends f9e.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/usertrack/track/ut/card/videocard/VideoCardTrackManager$2");
        }

        @Override // tb.f9e.a, tb.f9e
        public void onVideoPause(uq9 uq9Var, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15aa0002", new Object[]{this, uq9Var, new Boolean(z)});
            } else {
                com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.W(d5w.a(d5w.this), "pause");
            }
        }

        @Override // tb.f9e.a, tb.f9e
        public void onVideoSeekTo(uq9 uq9Var, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("160bdd7c", new Object[]{this, uq9Var, new Integer(i)});
                return;
            }
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.w(d5w.a(d5w.this), i);
            s19.d(d5w.a(d5w.this), "seek");
            IPreCacheService iPreCacheService = (IPreCacheService) d5w.a(d5w.this).U().getService(IPreCacheService.class);
            if (iPreCacheService != null) {
                iPreCacheService.commitLabel(d5w.a(d5w.this).E1(), CommandID.seekTo, Integer.valueOf(i));
            }
        }

        @Override // tb.f9e.a, tb.f9e
        public void onVideoStart(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8634a87e", new Object[]{this, uq9Var});
                return;
            }
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.z(d5w.a(d5w.this));
            s0j.l(d5w.a(d5w.this).U());
        }

        @Override // tb.f9e.a, tb.f9e
        public void onVideoError(uq9 uq9Var, Object obj, int i, int i2) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bdec3e0", new Object[]{this, uq9Var, obj, new Integer(i), new Integer(i2)});
                return;
            }
            if (obj instanceof TaobaoMediaPlayer) {
                str = ((TaobaoMediaPlayer) obj).getPlayUrl();
            } else {
                str = "";
            }
            ir9.b("VideoCardTrackManager", "APMdata videoplaystate IDWVideoLifecycleListener onVideoError,; videoid=" + d5w.a(d5w.this).P() + "; videoUrl=" + str);
            prp a2 = d5w.a(d5w.this);
            s19.d(a2, "error(" + i + f7l.BRACKET_END_STR);
            zpm.g().m(uq9Var.U(), d5w.a(d5w.this).P(), d5w.a(d5w.this).M(), String.valueOf(i));
            boolean p = d5w.this.p();
            if (d5w.a(d5w.this).n1().B().contains(d5w.a(d5w.this).n1().getDWInstance()) || !p) {
                s0j.s(d5w.a(d5w.this).U(), System.currentTimeMillis() - d5w.b(d5w.this), false);
                com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.q(d5w.a(d5w.this), i);
                s19.w(d5w.a(d5w.this), String.valueOf(i), "");
            } else {
                d5w.a(d5w.this).n1().B().add(d5w.a(d5w.this).n1().getDWInstance());
                com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.r(d5w.a(d5w.this), i);
                atb dWInstance = d5w.a(d5w.this).n1().getDWInstance();
                if (dWInstance != null) {
                    dWInstance.start();
                }
                s19.d(d5w.a(d5w.this), "retry");
            }
            s0j.o(d5w.c(d5w.this), new fe8.b().o(d5w.a(d5w.this).R()).s(d5w.a(d5w.this).n1().getDWInstance()).p(i).q(i2).z(d5w.a(d5w.this).P()).A(str).n());
        }

        @Override // tb.f9e.a, tb.f9e
        public void onVideoPrepared(uq9 uq9Var, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2371c7ad", new Object[]{this, uq9Var, obj});
                return;
            }
            atb dWInstance = d5w.a(d5w.this).n1().getDWInstance();
            prp a2 = d5w.a(d5w.this);
            if (dWInstance != null) {
                str = dWInstance.t();
            } else {
                str = "";
            }
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.t(a2, str);
            s19.d(d5w.a(d5w.this), "prepared");
            long currentTimeMillis = System.currentTimeMillis();
            s0j.n(d5w.a(d5w.this).U(), currentTimeMillis - d5w.b(d5w.this));
            s0j.s(d5w.a(d5w.this).U(), currentTimeMillis - d5w.b(d5w.this), true);
        }

        @Override // tb.f9e.a, tb.f9e
        public void onVideoProgressChanged(uq9 uq9Var, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d709a20", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            if (d5w.a(d5w.this).s1().t()) {
                s0j.o(d5w.c(d5w.this), new fe8.b().o(d5w.a(d5w.this).R()).s(d5w.a(d5w.this).n1().getDWInstance()).x(true).u(0L).v(0L).w(0L).n());
            }
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.u(d5w.a(d5w.this), i, i3, i2);
            if (!d5w.f(d5w.this) && ((ISharePlayerService) d5w.a(d5w.this).U().getService(ISharePlayerService.class)).isEnableSharePlayer() && !d5w.a(d5w.this).s1().d) {
                ir9.b("VideoCardTrackManager", "videotrack video againReportFirstFrame ");
                com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.p(d5w.a(d5w.this), true);
                d5w.g(d5w.this, true);
            }
            if (d5w.a(d5w.this).z1().d != i / 1000) {
                xau.s(d5w.a(d5w.this).U(), d5w.a(d5w.this).z1().d);
            }
            IPreCacheService iPreCacheService = (IPreCacheService) d5w.a(d5w.this).U().getService(IPreCacheService.class);
            if (iPreCacheService != null) {
                iPreCacheService.onVideoProgressChanged(d5w.a(d5w.this), i, i3, i2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x02a4  */
        @Override // tb.f9e.a, tb.f9e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onVideoInfo(tb.uq9 r23, java.lang.Object r24, long r25, long r27, long r29, java.lang.Object r31) {
            /*
                Method dump skipped, instructions count: 865
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.d5w.b.onVideoInfo(tb.uq9, java.lang.Object, long, long, long, java.lang.Object):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends trc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/usertrack/track/ut/card/videocard/VideoCardTrackManager$3");
        }

        @Override // tb.trc.a, tb.trc
        public void onDataUpdate(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18deb5ea", new Object[]{this, uq9Var});
            } else {
                com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.n(d5w.a(d5w.this), d5w.a(d5w.this).D1());
            }
        }

        @Override // tb.trc.a, tb.trc
        public void onRecyclePlayer(uq9 uq9Var, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b871be7", new Object[]{this, uq9Var, new Boolean(z)});
            } else {
                com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.o(d5w.a(d5w.this), d5w.a(d5w.this).n1().getDWInstance());
            }
        }

        @Override // tb.trc.a, tb.trc
        public void onRequestMediaPlayer(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac0a2eed", new Object[]{this, uq9Var});
                return;
            }
            ryr.b(d5w.a(d5w.this).R(), pto.b(d5w.a(d5w.this).U()), "gg_videoMutiTab_createDWInstance");
            s19.f(d5w.a(d5w.this), d5w.a(d5w.this).D1().t());
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.X(d5w.a(d5w.this));
            xau.t(d5w.a(d5w.this).U(), false);
            ((ISharePlayerService) d5w.a(d5w.this).U().getService(ISharePlayerService.class)).setEnableSharePlayer(false);
            ir9.b("VideoCardTrackManager", "创建播放器，width:" + d5w.a(d5w.this).G1().c().d + ",height:" + d5w.a(d5w.this).G1().c().f27190a + ",id:" + d5w.a(d5w.this).P());
            xau.s(d5w.a(d5w.this).U(), 0);
        }
    }

    static {
        t2o.a(468713606);
    }

    public d5w(FluidContext fluidContext, prp prpVar) {
        this.f17603a = fluidContext;
        this.b = prpVar;
        i(prpVar);
        j(prpVar);
        h(prpVar);
    }

    public static /* synthetic */ prp a(d5w d5wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (prp) ipChange.ipc$dispatch("4a533c66", new Object[]{d5wVar});
        }
        return d5wVar.b;
    }

    public static /* synthetic */ long b(d5w d5wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("576f750d", new Object[]{d5wVar})).longValue();
        }
        return d5wVar.c;
    }

    public static /* synthetic */ FluidContext c(d5w d5wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("58062210", new Object[]{d5wVar});
        }
        return d5wVar.f17603a;
    }

    public static /* synthetic */ boolean d(d5w d5wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5ce0d5b", new Object[]{d5wVar})).booleanValue();
        }
        return d5wVar.f;
    }

    public static /* synthetic */ boolean e(d5w d5wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3362b863", new Object[]{d5wVar, new Boolean(z)})).booleanValue();
        }
        d5wVar.f = z;
        return z;
    }

    public static /* synthetic */ boolean f(d5w d5wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acfd597a", new Object[]{d5wVar})).booleanValue();
        }
        return d5wVar.e;
    }

    public static /* synthetic */ boolean g(d5w d5wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("521cf024", new Object[]{d5wVar, new Boolean(z)})).booleanValue();
        }
        d5wVar.e = z;
        return z;
    }

    public static void s(FluidContext fluidContext, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c99e992", new Object[]{fluidContext, new Integer(i), new Integer(i2)});
            return;
        }
        if (i2 == 0) {
            if (!((IDataService) fluidContext.getService(IDataService.class)).isTab3FirstCellIconStreamRequestDetail()) {
                ((ITrackService) fluidContext.getService(ITrackService.class)).getConfig().j(-1);
            } else {
                ((ITrackService) fluidContext.getService(ITrackService.class)).getConfig().j(i);
            }
        }
        if (((ITrackService) fluidContext.getService(ITrackService.class)).getConfig().a() <= 0) {
            ((ITrackService) fluidContext.getService(ITrackService.class)).getConfig().i(i);
        }
    }

    public static HashMap<String, String> v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a464a63c", new Object[]{new Boolean(z)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(atb.EXP_KEY_COMMON_PRELOAD_PLAY, String.valueOf(z));
        hashMap.put(atb.EXP_KEY_PRELOAD_REAL_PLAY, String.valueOf(z));
        return hashMap;
    }

    public static HashMap<String, String> w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1942044b", new Object[]{new Boolean(z)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(atb.EXP_KEY_COMMON_PRELOAD_PLAY, String.valueOf(z));
        return hashMap;
    }

    public final void h(prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a931e27e", new Object[]{this, prpVar});
        } else {
            prpVar.N().addCardLifecycleListener((wlb) new a());
        }
    }

    public final void i(prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37620945", new Object[]{this, prpVar});
        } else {
            prpVar.F0().addVideoPlayerListener((f9e.a) new b());
        }
    }

    public final void j(prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c1e24c", new Object[]{this, prpVar});
        } else {
            prpVar.E0().addMediaLifecycleListener((trc) new c());
        }
    }

    public long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e823bf4", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bcb95c1", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public HashMap<String, String> n(a.e eVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("67e14587", new Object[]{this, eVar});
        }
        HashMap<String, String> i = xq9.i(this.f17603a, this.b.T().f(), this.b, eVar.f7800a, eVar.t(), eVar.a(), false, true);
        i.put("isFromLauncher", String.valueOf(pto.l(this.f17603a)));
        if (oau.g(this.f17603a)) {
            str = "1";
        } else {
            str = "0";
        }
        i.put("processLauncherFlag", str);
        String c2 = ((ISceneConfigService) this.f17603a.getService(ISceneConfigService.class)).getSessionExtParams().c();
        if (!TextUtils.isEmpty(c2)) {
            i.put("launcherNodeUrl", c2);
        }
        if (eVar.f7800a.z()) {
            i.put("isLocalPreCacheVideo", "true");
        }
        if (eVar.f7800a.x()) {
            i.put("isCache", "true");
        }
        return i;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f701db90", new Object[]{this})).booleanValue();
        }
        try {
            return gwj.e(this.b.R());
        } catch (Throwable th) {
            ir9.c("VideoCardTrackManager", "", th);
            return false;
        }
    }

    public void q(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6950ef02", new Object[]{this, new Long(j)});
            return;
        }
        ir9.b("VideoCardTrackManager", "videoplaystate oprogressloading onVideoLoadingEnd " + j + " ; id=" + this.b.P());
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.x(this.b, j);
        s19.d(this.b, "stallend");
        zpm.g().k(this.b.U(), this.b.P(), this.b.M(), j);
        IPreCacheService iPreCacheService = (IPreCacheService) this.b.U().getService(IPreCacheService.class);
        if (iPreCacheService != null) {
            iPreCacheService.onVideoLoadingEnd(j);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("254b2009", new Object[]{this});
            return;
        }
        ir9.b("VideoCardTrackManager", "videoplaystate oprogressloading onVideoLoadingStart ; id=" + this.b.P());
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.y(this.b);
        s19.d(this.b, "stall");
        IPreCacheService iPreCacheService = (IPreCacheService) this.b.U().getService(IPreCacheService.class);
        if (iPreCacheService != null) {
            iPreCacheService.onVideoLoadingStart();
        }
    }

    public void t(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e49c2138", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a42c01", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public static HashMap<String, String> k(FluidContext fluidContext, int i, a.d dVar, boolean z, boolean z2) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1d2c4762", new Object[]{fluidContext, new Integer(i), dVar, new Boolean(z), new Boolean(z2)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (dVar == null) {
            return hashMap;
        }
        String str3 = "Android_" + dVar.f() + "_" + UUID.randomUUID();
        if (((IHostAppService) fluidContext.getService(IHostAppService.class)).getCurrentTabIndex() == 1) {
            str = "follow";
        } else {
            str = "recommend";
        }
        hashMap.put(atb.EXP_KEY_FULL_PAGE_UID, str3);
        hashMap.put(atb.EXP_KEY_FULL_PAGE_TITLE, dVar.I());
        hashMap.put(atb.EXP_KEY_FULL_PAGE_INDEX, String.valueOf(i));
        hashMap.put(atb.EXP_KEY_FULL_PAGE_TAB_NAME, str);
        hashMap.put(atb.EXP_KEY_FULL_PAGE_CONTENT_TYPE, dVar.N());
        hashMap.put("isFromLauncher", String.valueOf(pto.l(fluidContext)));
        if (oau.g(fluidContext)) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        hashMap.put("processLauncherFlag", str2);
        String c2 = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionExtParams().c();
        if (!TextUtils.isEmpty(c2)) {
            hashMap.put("launcherNodeUrl", c2);
        }
        Map<String, String> tintAllTrackInfoWithDetail = ((ITrackService) fluidContext.getService(ITrackService.class)).getTintAllTrackInfoWithDetail(dVar);
        if (tintAllTrackInfoWithDetail != null) {
            hashMap.putAll(tintAllTrackInfoWithDetail);
        }
        hashMap.put(atb.EXP_KEY_COMMON_PRELOAD_PLAY, String.valueOf(false));
        String e = n5h.e();
        if (!TextUtils.isEmpty(e)) {
            hashMap.put(atb.EXP_KEY_GG_LIVE_WARMUP_BUCKET_ID, e);
        }
        if (dVar.z()) {
            hashMap.put("isLocalPreCacheVideo", "true");
        }
        String h = zpm.g().h(dVar.O());
        if (h != null) {
            hashMap.put("predictInfo", h);
        }
        if (z2) {
            String detailRequestRefreshType = ((IDataService) fluidContext.getService(IDataService.class)).getDetailRequestRefreshType();
            boolean o = o(fluidContext, detailRequestRefreshType);
            ir9.b("VideoCardTrackManager", "wrapExpUtParamsWithFirstFrame,refreshType: " + detailRequestRefreshType + ", isFromRefresh: " + o);
            if (o) {
                hashMap.put("videoActionType", sj4.VIDEO_ACTION_TYPE_REFRESH_INIT);
            } else if (z) {
                ij9.f(fluidContext, hashMap);
                hashMap.put("videoActionType", "init");
            } else {
                hashMap.put("videoActionType", sj4.VIDEO_ACTION_TYPE_UPDOWNSWITCH);
            }
        }
        hashMap.put("fluid_data_version", String.valueOf(dVar.g() == null ? -1 : dVar.g().currentDataVersion));
        return hashMap;
    }

    public static boolean o(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1426c222", new Object[]{fluidContext, str})).booleanValue();
        }
        try {
            if (((IContainerService) fluidContext.getService(IContainerService.class)).isFirstCardFromRefresh() && !TextUtils.equals(str, "normal")) {
                ((IContainerService) fluidContext.getService(IContainerService.class)).setFirstCardFromRefresh(false);
                return true;
            }
        } catch (Throwable th) {
            ir9.c("VideoCardTrackManager", "isFirstCardFromRefresh error", th);
        }
        return false;
    }
}
