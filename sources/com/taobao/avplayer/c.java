package com.taobao.avplayer;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWHighPerformanceInstanceNew;
import com.taobao.avplayer.d;
import com.taobao.media.DWViewUtil;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import com.taobao.taobaoavsdk.InterfaceUsageCounter;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.asc;
import tb.aub;
import tb.b75;
import tb.d75;
import tb.dub;
import tb.eub;
import tb.fsc;
import tb.jgi;
import tb.k95;
import tb.nj9;
import tb.qtb;
import tb.r65;
import tb.t2o;
import tb.tfb;
import tb.v85;
import tb.y95;
import tb.ytb;
import tb.z75;
import tb.z95;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final com.taobao.avplayer.d f10150a;
    public final DWHighPerformanceInstanceNew b;
    public final int c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements asc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ytb f10151a;

        public a(c cVar, ytb ytbVar) {
            this.f10151a = ytbVar;
        }

        @Override // tb.asc
        public void onMediaClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71919eba", new Object[]{this});
            } else {
                this.f10151a.onVideoClose();
            }
        }

        @Override // tb.asc
        public void onMediaComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            } else {
                this.f10151a.onVideoComplete();
            }
        }

        @Override // tb.asc
        public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            } else {
                this.f10151a.onVideoError(iMediaPlayer, i, i2);
            }
        }

        @Override // tb.asc
        public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            } else {
                this.f10151a.onVideoInfo(iMediaPlayer, j, j2, j3, obj);
            }
        }

        @Override // tb.asc
        public void onMediaPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            } else {
                this.f10151a.onVideoPause(z);
            }
        }

        @Override // tb.asc
        public void onMediaPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            } else {
                this.f10151a.onVideoPlay();
            }
        }

        @Override // tb.asc
        public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
            } else {
                this.f10151a.onVideoPrepared(iMediaPlayer);
            }
        }

        @Override // tb.asc
        public void onMediaProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                this.f10151a.onVideoProgressChanged(i, i2, i3);
            }
        }

        @Override // tb.asc
        public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
            } else if (mediaPlayScreenType == MediaPlayScreenType.NORMAL) {
                this.f10151a.onVideoScreenChanged(DWVideoScreenType.NORMAL);
            } else if (mediaPlayScreenType == MediaPlayScreenType.LANDSCAPE_FULL_SCREEN) {
                this.f10151a.onVideoScreenChanged(DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
            } else if (mediaPlayScreenType == MediaPlayScreenType.PORTRAIT_FULL_SCREEN) {
                this.f10151a.onVideoScreenChanged(DWVideoScreenType.PORTRAIT_FULL_SCREEN);
            }
        }

        @Override // tb.asc
        public void onMediaSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
            } else {
                this.f10151a.onVideoSeekTo(i);
            }
        }

        @Override // tb.asc
        public void onMediaStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f694024", new Object[]{this});
            } else {
                this.f10151a.onVideoStart();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements fsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ eub f10152a;

        public b(c cVar, eub eubVar) {
            this.f10152a = eubVar;
        }

        @Override // tb.fsc
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f38cbe1d", new Object[]{this});
                return;
            }
            eub eubVar = this.f10152a;
            if (eubVar != null) {
                eubVar.onVideoRecycled();
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.avplayer.c$c  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class C0535c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final d f10153a;

        static {
            t2o.a(451936269);
        }

        public C0535c(Activity activity) {
            d dVar = new d();
            this.f10153a = dVar;
            dVar.b = activity;
            dVar.C = 1;
            dVar.B = 1;
        }

        public C0535c A(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("ffb21e61", new Object[]{this, str});
            }
            this.f10153a.h = str;
            return this;
        }

        public C0535c B(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("ea5b9b76", new Object[]{this, new Boolean(z)});
            }
            this.f10153a.r = z;
            return this;
        }

        public C0535c C(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("2865c7e1", new Object[]{this, str});
            }
            this.f10153a.n = str;
            return this;
        }

        public C0535c D(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("97dd095f", new Object[]{this, str});
            }
            this.f10153a.d = str;
            return this;
        }

        public C0535c E(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("58f58cee", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = DWViewUtil.getScreenWidth();
            }
            this.f10153a.u = i;
            return this;
        }

        public c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("9bc586da", new Object[]{this});
            }
            return new c(this.f10153a);
        }

        public C0535c b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("b908e459", new Object[]{this, new Boolean(z)});
            }
            this.f10153a.G = z;
            return this;
        }

        public C0535c c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("c4a8c324", new Object[]{this, new Boolean(z)});
            }
            this.f10153a.s = z;
            return this;
        }

        public C0535c d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("3fe6d0f7", new Object[]{this, str});
            }
            this.f10153a.e = str;
            return this;
        }

        public C0535c e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("7363d4b8", new Object[]{this, str});
            }
            this.f10153a.z = str;
            return this;
        }

        public C0535c f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("f9d16d23", new Object[]{this, str});
            }
            this.f10153a.getClass();
            return this;
        }

        public C0535c g(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("b89aa5bb", new Object[]{this, hashMap});
            }
            this.f10153a.g = hashMap;
            return this;
        }

        public C0535c h(DWInstanceType dWInstanceType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("ff213434", new Object[]{this, dWInstanceType});
            }
            this.f10153a.w = dWInstanceType;
            return this;
        }

        public C0535c i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("df091ae5", new Object[]{this, new Boolean(z)});
            }
            this.f10153a.H = z;
            return this;
        }

        public C0535c j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("a72ac326", new Object[]{this, new Boolean(z)});
            }
            this.f10153a.I = z;
            return this;
        }

        public C0535c k(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("430ac893", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = DWViewUtil.getRealPxByWidth(600.0f);
            }
            this.f10153a.v = i;
            return this;
        }

        public C0535c l(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("3d3527cb", new Object[]{this, new Boolean(z)});
            }
            this.f10153a.p = z;
            return this;
        }

        public C0535c m(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("ae897665", new Object[]{this, jSONObject});
            }
            this.f10153a.x = jSONObject;
            return this;
        }

        public C0535c n(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("53145d94", new Object[]{this, new Boolean(z)});
            }
            this.f10153a.c = z;
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "DWInstancePlus Builder, sbt=" + this.f10153a.e + ", setMute=" + this.f10153a.c);
            return this;
        }

        public C0535c o(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("3c1e0064", new Object[]{this, new Boolean(z)});
            }
            this.f10153a.q = z;
            return this;
        }

        public C0535c p(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("3ccc7500", new Object[]{this, new Boolean(z)});
            }
            this.f10153a.t = z;
            return this;
        }

        public C0535c q(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("f17ffc86", new Object[]{this, hashMap});
            }
            this.f10153a.f = hashMap;
            return this;
        }

        public C0535c r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("18c08bf8", new Object[]{this, str});
            }
            this.f10153a.m = str;
            return this;
        }

        public C0535c s(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("88c2def4", new Object[]{this, new Boolean(z)});
            }
            this.f10153a.l = z;
            return this;
        }

        public C0535c t(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("935ead6", new Object[]{this, new Integer(i)});
            }
            this.f10153a.f10154a = i;
            return this;
        }

        public C0535c u(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("c27c714b", new Object[]{this, new Boolean(z)});
            }
            this.f10153a.D = z;
            return this;
        }

        public C0535c v(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("a9955f7e", new Object[]{this, new Integer(i)});
            }
            this.f10153a.y = i;
            return this;
        }

        public C0535c x(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("18eb77a1", new Object[]{this, hashMap});
            }
            this.f10153a.o = hashMap;
            return this;
        }

        public C0535c y(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("124cd3b2", new Object[]{this, new Boolean(z)});
            }
            this.f10153a.k = z;
            return this;
        }

        public C0535c z(DWAspectRatio dWAspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0535c) ipChange.ipc$dispatch("36be1a00", new Object[]{this, dWAspectRatio});
            }
            this.f10153a.i = dWAspectRatio;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d {
        public boolean G;
        public boolean H;
        public boolean I;
        public Activity b;
        public String d;
        public String e;
        public HashMap<String, String> f;
        public HashMap<String, String> g;
        public String h;
        public DWAspectRatio i;
        public String m;
        public String n;
        public HashMap<String, String> o;
        public boolean p;
        public boolean r;
        public int u;
        public int v;
        public JSONObject x;
        public String z;

        /* renamed from: a  reason: collision with root package name */
        public int f10154a = 2;
        public boolean c = true;
        public boolean k = false;
        public boolean l = true;
        public boolean q = true;
        public boolean s = false;
        public boolean t = false;
        public DWInstanceType w = DWInstanceType.VIDEO;
        public int y = 0;
        public final int A = 3;
        public int B = 0;
        public int C = 0;
        public boolean D = true;
        public final boolean E = true;
        public final boolean F = true;

        static {
            t2o.a(451936270);
        }

        public d() {
            IpChange ipChange = DWVideoScreenType.$ipChange;
        }
    }

    static {
        t2o.a(451936265);
    }

    public c(d dVar) {
        this.c = 2;
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + "Enter Creat DWInstancePlus ");
        int i = dVar.f10154a;
        if (i == 0 || i == 1) {
            d.a aVar = new d.a(dVar.b);
            aVar.F("dwplus");
            aVar.y(dVar.f10154a);
            aVar.f(dVar.z);
            aVar.k(dVar.h);
            aVar.p(null);
            aVar.c(String.valueOf(0L));
            aVar.E(null);
            aVar.e(dVar.e);
            aVar.C(false);
            aVar.v(dVar.A);
            aVar.i(dVar.B);
            aVar.h(dVar.C);
            aVar.z(dVar.D);
            aVar.A(dVar.E);
            aVar.l(dVar.F);
            aVar.H(dVar.d);
            aVar.q(dVar.c);
            aVar.G(dVar.i);
            aVar.B(dVar.o);
            aVar.t(dVar.f);
            aVar.g(dVar.g);
            aVar.x(null);
            aVar.u(dVar.m);
            aVar.d(dVar.G);
            aVar.s(dVar.q);
            aVar.r(true);
            aVar.E(String.valueOf(0L));
            aVar.o(new z95());
            aVar.n(new y95());
            aVar.m(new b75());
            aVar.D(dVar.k);
            aVar.w(dVar.l);
            aVar.j(null);
            com.taobao.avplayer.d a2 = aVar.a();
            this.f10150a = a2;
            if (dVar.H) {
                HashMap hashMap = new HashMap();
                hashMap.put(MediaConstant.CMD_DISABLE_SURFACE_VIEW, "1");
                a2.j(hashMap);
            }
        } else if (i == 2) {
            DWHighPerformanceInstanceNew.h hVar = new DWHighPerformanceInstanceNew.h(dVar.b);
            hVar.Y("dwplus");
            hVar.f0(dVar.d);
            hVar.x(dVar.p);
            hVar.q(dVar.w);
            hVar.b0(dVar.h);
            hVar.c0(dVar.r);
            hVar.d0(dVar.n);
            hVar.g0(dVar.u);
            hVar.t(dVar.v);
            hVar.P(null);
            hVar.p(null);
            hVar.u(null);
            hVar.v(null);
            hVar.g(dVar.e);
            hVar.T(dVar.o);
            hVar.K(dVar.f);
            hVar.m(dVar.g);
            hVar.j(null);
            hVar.k(null);
            hVar.o(null);
            hVar.A(dVar.c);
            hVar.G(false);
            hVar.e0(null);
            hVar.X(null);
            hVar.L(dVar.m);
            hVar.Z(dVar.i);
            hVar.f(dVar.s);
            hVar.J(dVar.t);
            hVar.y(dVar.x);
            hVar.Q(dVar.y);
            hVar.c(dVar.G);
            hVar.R(null);
            hVar.r(dVar.H);
            hVar.s(dVar.I);
            hVar.V(dVar.k);
            hVar.M(dVar.l);
            hVar.F(false);
            if (r65.b == null) {
                r65.b = new b75();
            }
            hVar.j(r65.b);
            hVar.k(new d75());
            hVar.u(new DWNetworkAdapter());
            hVar.v(new z95());
            hVar.o(new k95());
            hVar.H(new v85());
            hVar.p(new z75(dVar.b));
            hVar.X(new y95());
            this.b = hVar.a();
        }
        this.c = dVar.f10154a;
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_DWInstancePlus);
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + "End Creat DWInstancePlus ");
    }

    public void A(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652e1840", new Object[]{this, onPreparedListener});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_registerOnPreparedListener);
        int i = this.c;
        if (i == 0 || i == 1) {
            this.f10150a.A(onPreparedListener);
        }
    }

    public void B(TaoLiveVideoView.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f636bfa", new Object[]{this, nVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_registerOnStartListener);
        int i = this.c;
        if (i == 0 || i == 1) {
            this.f10150a.B(nVar);
        }
    }

    public void C(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_seekTo);
        if (this.c == 2) {
            this.b.d0(i);
        }
    }

    public void D(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3275fcb", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_seekTo2);
        if (this.c == 2) {
            this.b.e0(i, z);
        }
    }

    public void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setBizCode);
        int i = this.c;
        if (i == 2) {
            this.b.i0(str);
        } else if (i == 0 || i == 1) {
            this.f10150a.I(str);
        }
    }

    public void F(nj9 nj9Var) {
        DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setFirstRenderAdapter);
        int i = this.c;
        if (i == 0 || i == 1) {
            com.taobao.avplayer.d dVar = this.f10150a;
            if (dVar != null) {
                dVar.D(nj9Var);
            }
        } else if (i == 2 && (dWHighPerformanceInstanceNew = this.b) != null) {
            dWHighPerformanceInstanceNew.k0(nj9Var);
        }
    }

    public void G(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2487bd12", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setFrame);
        if (this.c == 2) {
            this.b.m0(i, i2);
        }
    }

    public void H(aub aubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9a1d45", new Object[]{this, aubVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setIVideoLoopCompleteListener);
        if (this.c == 2) {
            this.b.q0(aubVar);
        }
    }

    public void I(dub dubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f202f393", new Object[]{this, dubVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setIVideoPreCompleteListener);
        if (this.c == 2) {
            this.b.r0(dubVar);
        }
    }

    public void J(DWInstanceType dWInstanceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a28ef3f", new Object[]{this, dWInstanceType});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setInstanceType);
        if (this.c == 2) {
            this.b.t0(dWInstanceType);
        }
    }

    public void K(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148ee5c2", new Object[]{this, new Long(j)});
        }
    }

    public void L(MediaLiveInfo mediaLiveInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a36608c", new Object[]{this, mediaLiveInfo, str});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setMediaInfoData);
        int i = this.c;
        if (i == 0 || i == 1) {
            this.f10150a.E(mediaLiveInfo, str);
        }
    }

    public void M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c8d232e", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setNeedCloseUT);
        int i = this.c;
        if (i == 2) {
            this.b.v0(z);
        } else if (i == 0 || i == 1) {
            this.f10150a.G(z);
        }
    }

    public void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cac726", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setOpenVolumeFadeIn);
        DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew = this.b;
        if (dWHighPerformanceInstanceNew != null) {
            dWHighPerformanceInstanceNew.w0(z);
        }
    }

    public void O(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab315d39", new Object[]{this, imageView});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setPicImageView);
        if (this.c == 2) {
            this.b.x0(imageView);
        }
    }

    public void P(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb970df4", new Object[]{this, qtbVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setPicViewClickListener);
        if (this.c == 2) {
            this.b.y0(qtbVar);
        }
    }

    public void Q(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ad02c0", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setPlayExpUTParams);
        int i = this.c;
        if (i == 2) {
            this.b.p(hashMap);
        } else if (i == 0 || i == 1) {
            this.f10150a.h(hashMap);
        }
    }

    public void R(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setPlayRate);
        if (this.c == 2) {
            this.b.z0(f);
        }
    }

    public void S(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1ec190", new Object[]{this, qtbVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setRootViewClickListener);
        if (this.c == 2) {
            this.b.C0(qtbVar);
        }
    }

    public void T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409a031b", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setShowNoWifiToast);
        int i = this.c;
        if (i == 0 || i == 1) {
            this.f10150a.H(z);
        }
    }

    public void U(HashMap<String, String> hashMap) {
        com.taobao.avplayer.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e7be85", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setUTParams);
        int i = this.c;
        if (i == 2) {
            DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew = this.b;
            if (dWHighPerformanceInstanceNew != null) {
                dWHighPerformanceInstanceNew.D0(hashMap);
            }
        } else if ((i == 0 || i == 1) && (dVar = this.f10150a) != null) {
            dVar.J(hashMap);
        }
    }

    public void V(ytb ytbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd04dc4a", new Object[]{this, ytbVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setVideoLifecycleListener2);
        int i = this.c;
        if (i == 2) {
            this.b.p0(new a(this, ytbVar));
        } else if (i == 0 || i == 1) {
            this.f10150a.K(ytbVar);
        }
    }

    public void W(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setVideoLoop);
        if (this.c == 2) {
            this.b.I0(z);
        }
    }

    public void Y(eub eubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c5800a", new Object[]{this, eubVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setVideoRecycleListener);
        DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew = this.b;
        if (dWHighPerformanceInstanceNew != null) {
            dWHighPerformanceInstanceNew.L0(new b(this, eubVar));
        }
    }

    public void Z(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setVolume);
        DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew = this.b;
        if (dWHighPerformanceInstanceNew != null) {
            dWHighPerformanceInstanceNew.M0(f);
            return;
        }
        com.taobao.avplayer.d dVar = this.f10150a;
        if (dVar != null) {
            dVar.L(f);
        }
    }

    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bcd334", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_addCustomParams);
        if (this.c == 2) {
            this.b.o(hashMap);
        }
    }

    public void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_setup2);
        int i = this.c;
        if (i == 0 || i == 1) {
            this.f10150a.M();
        }
    }

    public void b(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b65ae46", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_addUtParams);
        int i = this.c;
        if (i == 2) {
            this.b.q(hashMap);
        } else if (i == 0 || i == 1) {
            this.f10150a.i(hashMap);
        }
    }

    public void c(Map<String, String> map) {
        DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f07861", new Object[]{this, map});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_callWithMsg);
        int i = this.c;
        if (i == 0 || i == 1) {
            com.taobao.avplayer.d dVar = this.f10150a;
            if (dVar != null) {
                dVar.j(map);
            }
        } else if (i == 2 && (dWHighPerformanceInstanceNew = this.b) != null) {
            dWHighPerformanceInstanceNew.s(map);
        }
    }

    public void c0(String str, boolean z, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a4ec07", new Object[]{this, str, new Boolean(z), hashMap});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_switchPlayerScene);
        DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew = this.b;
        if (dWHighPerformanceInstanceNew != null) {
            dWHighPerformanceInstanceNew.Q0(str, z, hashMap);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_closeVideo);
        int i = this.c;
        if (i == 2) {
            this.b.u();
        } else if (i == 0 || i == 1) {
            this.f10150a.C();
        }
    }

    public boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b343e7c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void e() {
        DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_commitEndForMultiplexing);
        if (this.c == 2 && (dWHighPerformanceInstanceNew = this.b) != null) {
            dWHighPerformanceInstanceNew.w();
        }
    }

    public void e0(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b519e6c9", new Object[]{this, onCompletionListener});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_unregisterOnCompletionListener);
        int i = this.c;
        if (i == 0 || i == 1) {
            this.f10150a.P(onCompletionListener);
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f22ae", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_controlAudioFocus);
        if (this.c == 2) {
            this.b.x(z);
        }
    }

    public void f0(IMediaPlayer.OnErrorListener onErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4965fab1", new Object[]{this, onErrorListener});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_unregisterOnErrorListener);
        int i = this.c;
        if (i == 0 || i == 1) {
            this.f10150a.Q(onErrorListener);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_destroy);
        int i = this.c;
        if (i == 2) {
            this.b.y();
        } else if (i == 0 || i == 1) {
            this.f10150a.n();
        }
    }

    public void g0(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cd01a5", new Object[]{this, onInfoListener});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_unregisterOnInfoListener);
        int i = this.c;
        if (i == 0 || i == 1) {
            this.f10150a.R(onInfoListener);
        }
    }

    public void h0(TaoLiveVideoView.m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ea3b01", new Object[]{this, mVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_unregisterOnPauseListener);
        int i = this.c;
        if (i == 0 || i == 1) {
            this.f10150a.S(mVar);
        }
    }

    public long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_getDuration);
        if (this.c == 2) {
            return this.b.C();
        }
        return 0L;
    }

    public void i0(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff10fa07", new Object[]{this, onPreparedListener});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_unregisterOnPreparedListener);
        int i = this.c;
        if (i == 0 || i == 1) {
            this.f10150a.T(onPreparedListener);
        }
    }

    public String j() {
        DWContext dWContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b0754e", new Object[]{this});
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_getLogToken);
        DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew = this.b;
        if (dWHighPerformanceInstanceNew == null || (dWContext = dWHighPerformanceInstanceNew.d) == null) {
            return null;
        }
        return dWContext.getPlayToken();
    }

    public void j0(TaoLiveVideoView.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d19c81", new Object[]{this, nVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_unregisterOnStartListener);
        int i = this.c;
        if (i == 0 || i == 1) {
            this.f10150a.U(nVar);
        }
    }

    public jgi k() {
        MediaPlayCenter o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jgi) ipChange.ipc$dispatch("8b32bcbe", new Object[]{this});
        }
        com.taobao.avplayer.d dVar = this.f10150a;
        if (dVar == null || (o = dVar.o()) == null) {
            return null;
        }
        jgi jgiVar = new jgi(o);
        this.f10150a.O();
        return jgiVar;
    }

    public void k0(float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f6043f", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_volumeFadeInWithCustomParams);
        DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew = this.b;
        if (dWHighPerformanceInstanceNew != null) {
            dWHighPerformanceInstanceNew.S0(f, f2, i, i2);
        }
    }

    public Map<String, String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_getPlayerQos);
        int i = this.c;
        if (i == 2) {
            return this.b.F();
        }
        if (i == 0 || i == 1) {
            return this.f10150a.p();
        }
        return null;
    }

    public void l0(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        com.taobao.avplayer.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dfca00", new Object[]{this, mediaLiveWarmupConfig});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_warmupLiveStream);
        if (this.c == 0 && (dVar = this.f10150a) != null) {
            dVar.V(new MediaLiveWarmupConfig());
        }
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_getVideoState);
        int i = this.c;
        if (i == 2) {
            return this.b.H();
        }
        if (i == 0 || i == 1) {
            return this.f10150a.r();
        }
        return 0;
    }

    public ViewGroup p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_getView);
        int i = this.c;
        if (i == 2) {
            return this.b.K();
        }
        if (i == 0 || i == 1) {
            return (ViewGroup) this.f10150a.t();
        }
        return null;
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_mute);
        int i = this.c;
        if (i == 2) {
            this.b.V(z);
        } else if (i == 0 || i == 1) {
            this.f10150a.F(z);
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_pauseVideo);
        int i = this.c;
        if (i == 2) {
            this.b.W();
        } else if (i == 0 || i == 1) {
            this.f10150a.v();
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_playVideo);
        if (this.c == 2) {
            this.b.O0();
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_prepareToFirstFrame);
        if (this.c == 2) {
            this.b.a0();
        }
    }

    public void w(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9b4082", new Object[]{this, onCompletionListener});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_registerOnCompletionListener);
        int i = this.c;
        if (i == 0 || i == 1) {
            this.f10150a.w(onCompletionListener);
        }
    }

    public void x(IMediaPlayer.OnErrorListener onErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6077aa", new Object[]{this, onErrorListener});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_registerOnErrorListener);
        int i = this.c;
        if (i == 0 || i == 1) {
            this.f10150a.x(onErrorListener);
        }
    }

    public void y(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0468de", new Object[]{this, onInfoListener});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_registerOnInfoListener);
        int i = this.c;
        if (i == 0 || i == 1) {
            this.f10150a.y(onInfoListener);
        }
    }

    public void z(TaoLiveVideoView.m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7c0a7a", new Object[]{this, mVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_registerOnPauseListener);
        int i = this.c;
        if (i == 0 || i == 1) {
            this.f10150a.z(mVar);
        }
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dwplus_start);
        int i = this.c;
        if (i == 2) {
            this.b.O0();
        } else if (i == 0 || i == 1) {
            this.f10150a.N();
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("tbplayer_start_time", String.valueOf(System.currentTimeMillis()));
        Q(hashMap);
    }
}
