package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.f9e;
import tb.vlc;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r83 implements wlb, o6d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String j = "CardMonitor";
    private static final String k = "blackScreen";
    private static final String l = "playerState";
    private static final String m = "noPermission";
    private static final String n = "playerError";
    private static final String o = "noPlayer";
    private static final String p = "multiPlayer";
    private static final String q = "emptyPlayerSize";
    private static final String r = "errorCardType";
    private static final int s = akt.w2("ShortVideo.checkPlayStateTimeout", 1000);
    private static final String[] t = akt.H2("ShortVideo.excludedErrorCode", "-10604").split(",");

    /* renamed from: a  reason: collision with root package name */
    private FluidContext f27180a;
    private ici b;
    private boolean e;
    private boolean h;
    private int c = 0;
    private int d = 0;
    private Set<String> f = new HashSet();
    private Handler g = new Handler(Looper.getMainLooper());
    private Runnable i = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends f9e.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 1836096032) {
                super.onVideoProgressChanged((uq9) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/analysis/monitor/CardMonitor$2");
        }

        @Override // tb.f9e.a, tb.f9e
        public void onVideoProgressChanged(uq9 uq9Var, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d709a20", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            super.onVideoProgressChanged(uq9Var, i, i2, i3);
            r83.F(r83.this, true);
        }

        @Override // tb.f9e.a, tb.f9e
        public void onVideoError(uq9 uq9Var, Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bdec3e0", new Object[]{this, uq9Var, obj, new Integer(i), new Integer(i2)});
                return;
            }
            r83.v(r83.this);
            if (!r83.x(r83.this)) {
                r83.I(r83.this);
                if (r83.G(r83.this) > 1) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("what", Integer.valueOf(i));
                    hashMap.put("extra", Integer.valueOf(i2));
                    r83.o(r83.this, "playerError", hashMap);
                }
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("what", Integer.valueOf(i));
            hashMap2.put("extra", Integer.valueOf(i2));
            r83.M(r83.this, "playerError", hashMap2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends vlc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -1255073443) {
                return new Boolean(super.onInfo((uq9) objArr[0], (IMediaPlayer) objArr[1], ((Number) objArr[2]).longValue(), ((Number) objArr[3]).longValue(), ((Number) objArr[4]).longValue(), objArr[5]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/analysis/monitor/CardMonitor$3");
        }

        @Override // tb.vlc.a, tb.vlc
        public boolean onInfo(uq9 uq9Var, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b531195d", new Object[]{this, uq9Var, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            if (3 == j) {
                r83.F(r83.this, true);
            }
            return super.onInfo(uq9Var, iMediaPlayer, j, j2, j3, obj);
        }

        @Override // tb.vlc.a, tb.vlc
        public boolean onError(uq9 uq9Var, IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9aa6fc07", new Object[]{this, uq9Var, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (r83.N(r83.this, i)) {
                return false;
            }
            if (!r83.x(r83.this)) {
                HashMap hashMap = new HashMap();
                hashMap.put("what", Integer.valueOf(i));
                hashMap.put("extra", Integer.valueOf(i2));
                r83.o(r83.this, "playerError", hashMap);
            }
            r83.v(r83.this);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("what", Integer.valueOf(i));
            hashMap2.put("extra", Integer.valueOf(i2));
            r83.M(r83.this, "playerError", hashMap2);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((ILifecycleService) r83.O(r83.this).getService(ILifecycleService.class)).addPageLifecycleListener(r83.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((ILifecycleService) r83.O(r83.this).getService(ILifecycleService.class)).removePageLifecycleListener(r83.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((ILifecycleService) r83.O(r83.this).getService(ILifecycleService.class)).removePageLifecycleListener(r83.this);
            }
        }
    }

    static {
        t2o.a(468713859);
        t2o.a(468713934);
        t2o.a(468714445);
    }

    public r83(FluidContext fluidContext, ici iciVar) {
        boolean p2 = akt.p2("ShortVideo.enableCardMonitor", true);
        this.h = p2;
        this.f27180a = fluidContext;
        this.b = iciVar;
        if (p2) {
            iciVar.N().addCardLifecycleListener(this);
            iciVar.F0().addVideoPlayerListener((f9e.a) new b());
            iciVar.F0().addLivePlayerListener((vlc.a) new c());
        }
    }

    public static /* synthetic */ boolean F(r83 r83Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99d241bf", new Object[]{r83Var, new Boolean(z)})).booleanValue();
        }
        r83Var.e = z;
        return z;
    }

    public static /* synthetic */ int G(r83 r83Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2676bcd", new Object[]{r83Var})).intValue();
        }
        return r83Var.c;
    }

    public static /* synthetic */ int I(r83 r83Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("796a70c5", new Object[]{r83Var})).intValue();
        }
        int i = r83Var.c;
        r83Var.c = 1 + i;
        return i;
    }

    public static /* synthetic */ void M(r83 r83Var, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a953ee2", new Object[]{r83Var, str, map});
        } else {
            r83Var.T(str, map);
        }
    }

    public static /* synthetic */ boolean N(r83 r83Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("289e506f", new Object[]{r83Var, new Integer(i)})).booleanValue();
        }
        return r83Var.Q(i);
    }

    public static /* synthetic */ FluidContext O(r83 r83Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("bb47a771", new Object[]{r83Var});
        }
        return r83Var.f27180a;
    }

    private void P(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7684e4", new Object[]{this, map});
            return;
        }
        map.put("type", Integer.valueOf(this.b.J()));
        map.put("contentId", this.b.Y().f());
        map.put("position", Integer.valueOf(this.b.M()));
        map.put("bizType", this.f27180a.getInstanceConfig().getBizType());
        pep sessionParams = ((ISceneConfigService) this.f27180a.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams != null) {
            Map<String, String> a2 = sessionParams.a();
            if (a2 != null) {
                map.put("sceneSource", a2.get("sceneSource"));
            }
            map.put("source", sessionParams.c);
            map.put("sessionType", sessionParams.b);
        }
    }

    private boolean Q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e5bf8e5", new Object[]{this, new Integer(i)})).booleanValue();
        }
        for (String str : t) {
            if (TextUtils.equals(str, String.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    private void R(ViewGroup viewGroup, List<ViewGroup> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9faf63e", new Object[]{this, viewGroup, list});
            return;
        }
        if (viewGroup.getTag(R.id.fluid_sdk_tag_is_video_view) != null) {
            list.add(viewGroup);
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                R((ViewGroup) viewGroup.getChildAt(i), list);
            }
        }
    }

    private void S(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c7efbd", new Object[]{this, str, map});
            return;
        }
        if (this.b != null) {
            str = str + "_" + this.b.P();
        }
        if (!this.f.contains(str)) {
            this.f.add(str);
            if (map == null) {
                map = new HashMap();
            }
            P(map);
            ((ITrackService) this.f27180a.getService(ITrackService.class)).commitTintFail(k, str, map, this.b);
            ir9.b(j, "reportBlackScreen:" + str + " args:" + map);
        }
    }

    private void T(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecabadf8", new Object[]{this, str, map});
            return;
        }
        if (map == null) {
            map = new HashMap();
        }
        P(map);
        map.put("hasFirstFrame", Boolean.valueOf(this.e));
        map.put("count", Integer.valueOf(this.d));
        ((ITrackService) this.f27180a.getService(ITrackService.class)).commitTintFail(l, str, map, this.b);
        ir9.b(j, "reportBlackScreen:" + str + " args:" + map);
    }

    public static /* synthetic */ ici l(r83 r83Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ici) ipChange.ipc$dispatch("1ea042ee", new Object[]{r83Var});
        }
        return r83Var.b;
    }

    public static /* synthetic */ void m(r83 r83Var, ViewGroup viewGroup, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4093d8e", new Object[]{r83Var, viewGroup, list});
        } else {
            r83Var.R(viewGroup, list);
        }
    }

    public static /* synthetic */ void o(r83 r83Var, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c76b2de", new Object[]{r83Var, str, map});
        } else {
            r83Var.S(str, map);
        }
    }

    public static /* synthetic */ int v(r83 r83Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74d50707", new Object[]{r83Var})).intValue();
        }
        int i = r83Var.d;
        r83Var.d = 1 + i;
        return i;
    }

    public static /* synthetic */ boolean x(r83 r83Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("301cb6ff", new Object[]{r83Var})).booleanValue();
        }
        return r83Var.e;
    }

    @Override // tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
            return;
        }
        nwv.y0(new d());
        a.d Y = uq9Var.Y();
        if (Y == null || Y.D() || ((ICollectionService) this.f27180a.getService(ICollectionService.class)).isCollectionPage()) {
            ici iciVar = this.b;
            if ((iciVar instanceof prp) || (iciVar instanceof k5h)) {
                this.g.postDelayed(this.i, s);
            }
        } else {
            S(m, null);
        }
        if (this.b instanceof pj0) {
            S(r, null);
        }
    }

    @Override // tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
        }
    }

    @Override // tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
        }
    }

    @Override // tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
            return;
        }
        this.c = 0;
        this.e = false;
        this.d = 0;
        this.g.removeCallbacks(this.i);
        nwv.y0(new e());
    }

    @Override // tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.g.removeCallbacks(this.i);
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

    @Override // tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
        } else {
            nwv.y0(new f());
        }
    }

    @Override // tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ici iciVar = this.b;
        if ((iciVar instanceof prp) || (iciVar instanceof k5h)) {
            this.g.removeCallbacks(this.i);
            this.g.postDelayed(this.i, s);
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

    @Override // tb.wlb
    public void onWillActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ArrayList arrayList = new ArrayList();
            r83.m(r83.this, (ViewGroup) r83.l(r83.this).W(), arrayList);
            if (arrayList.size() == 0) {
                r83.o(r83.this, r83.o, null);
            } else if (arrayList.size() > 1) {
                r83.o(r83.this, r83.p, null);
            } else if (arrayList.size() == 1) {
                ViewGroup viewGroup = (ViewGroup) arrayList.get(0);
                if (viewGroup.getWidth() == 0 || viewGroup.getHeight() == 0) {
                    r83.o(r83.this, r83.q, null);
                }
            }
        }
    }

    @Override // tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
        }
    }
}
