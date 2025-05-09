package com.taobao.taolive.room.player.preload.instance;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.playcontrol.observe.RoomPlayerObserver;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import tb.cdr;
import tb.cjr;
import tb.dba;
import tb.fnr;
import tb.jgi;
import tb.scd;
import tb.t2o;
import tb.ufi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PreloadParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13202a;
    public final ufi b;
    public final MediaData c;
    public final scd d;
    public final long e;
    public final int f;
    public final int g;
    public final boolean h;
    public final cjr i;
    public final cdr j;
    public final dba k;
    public final jgi l;
    public final String m;
    public final Uri n;
    public final SimpleLiveInfo o;
    public final String p;
    public final long q;
    public final RoomPlayerObserver r;
    public final Map<String, String> s;
    public final VideoInfo t;
    public final String u;
    public final fnr v;
    public final Rect w;
    public final String x;
    public final ViewGroup y;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface PlayerType {
        public static final String LIVE_ZOOM_WINDOW_TYPE = "LiveZoomWindow";
        public static final String TB_LIVE_VIDEO_MANAGER_TYPE = "TBLiveVideoManager";
        public static final String TB_LIVE_VIEW_TYPE = "TBLiveView";
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface ScenarioType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean A;
        public fnr B;
        public Rect C;
        public String D;
        public ViewGroup E;

        /* renamed from: a  reason: collision with root package name */
        public final Context f13203a;
        public ufi b;
        public MediaData c;
        public scd d;
        public int f;
        public cjr i;
        public boolean j;
        public boolean k;
        public boolean l;
        public cdr m;
        public dba n;
        public jgi o;
        public String p;
        public Uri q;
        public SimpleLiveInfo r;
        public String s;
        public long t;
        public RoomPlayerObserver u;
        public Map<String, String> v;
        public VideoInfo w;
        public boolean y;
        public String z;
        public long e = 1000;
        public int g = 0;
        public boolean h = true;
        public int x = -1;

        static {
            t2o.a(779093113);
        }

        public a(Context context) {
            this.f13203a = context;
        }

        public static /* synthetic */ int A(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("34f634f8", new Object[]{aVar})).intValue();
            }
            return aVar.f;
        }

        public static /* synthetic */ int B(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4df78697", new Object[]{aVar})).intValue();
            }
            return aVar.g;
        }

        public static /* synthetic */ boolean C(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("66f8d847", new Object[]{aVar})).booleanValue();
            }
            return aVar.h;
        }

        public static /* synthetic */ cjr D(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cjr) ipChange.ipc$dispatch("7ad3ef96", new Object[]{aVar});
            }
            return aVar.i;
        }

        public static /* synthetic */ boolean E(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("98fb7b85", new Object[]{aVar})).booleanValue();
            }
            return aVar.j;
        }

        public static /* synthetic */ Context a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("be0e5de2", new Object[]{aVar});
            }
            return aVar.f13203a;
        }

        public static /* synthetic */ ufi b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ufi) ipChange.ipc$dispatch("a7ff7bd", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("458544df", new Object[]{aVar})).booleanValue();
            }
            return aVar.k;
        }

        public static /* synthetic */ boolean d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5e86967e", new Object[]{aVar})).booleanValue();
            }
            return aVar.l;
        }

        public static /* synthetic */ cdr e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cdr) ipChange.ipc$dispatch("8a1df323", new Object[]{aVar});
            }
            return aVar.m;
        }

        public static /* synthetic */ dba f(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dba) ipChange.ipc$dispatch("6754033c", new Object[]{aVar});
            }
            return aVar.n;
        }

        public static /* synthetic */ jgi g(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jgi) ipChange.ipc$dispatch("f1af174d", new Object[]{aVar});
            }
            return aVar.o;
        }

        public static /* synthetic */ String h(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d090e26a", new Object[]{aVar});
            }
            return aVar.p;
        }

        public static /* synthetic */ Uri i(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("50912dcc", new Object[]{aVar});
            }
            return aVar.q;
        }

        public static /* synthetic */ SimpleLiveInfo j(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SimpleLiveInfo) ipChange.ipc$dispatch("beca78a6", new Object[]{aVar});
            }
            return aVar.r;
        }

        public static /* synthetic */ String k(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4963a32d", new Object[]{aVar});
            }
            return aVar.s;
        }

        public static /* synthetic */ long l(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("26912366", new Object[]{aVar})).longValue();
            }
            return aVar.t;
        }

        public static /* synthetic */ MediaData m(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaData) ipChange.ipc$dispatch("49fba2c8", new Object[]{aVar});
            }
            return aVar.c;
        }

        public static /* synthetic */ RoomPlayerObserver n(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RoomPlayerObserver) ipChange.ipc$dispatch("d3bf999", new Object[]{aVar});
            }
            return aVar.u;
        }

        public static /* synthetic */ Map o(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("3a3627b0", new Object[]{aVar});
            }
            return aVar.v;
        }

        public static /* synthetic */ VideoInfo p(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoInfo) ipChange.ipc$dispatch("27951457", new Object[]{aVar});
            }
            return aVar.w;
        }

        public static /* synthetic */ int q(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97b21bec", new Object[]{aVar})).intValue();
            }
            return aVar.x;
        }

        public static /* synthetic */ boolean r(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b0b36d9c", new Object[]{aVar})).booleanValue();
            }
            return aVar.y;
        }

        public static /* synthetic */ String s(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b112aa49", new Object[]{aVar});
            }
            return aVar.z;
        }

        public static /* synthetic */ boolean t(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e2b610da", new Object[]{aVar})).booleanValue();
            }
            return aVar.A;
        }

        public static /* synthetic */ fnr u(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fnr) ipChange.ipc$dispatch("55d4e8c3", new Object[]{aVar});
            }
            return aVar.B;
        }

        public static /* synthetic */ Rect v(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("d8587e5d", new Object[]{aVar});
            }
            return aVar.C;
        }

        public static /* synthetic */ String w(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("522bab4d", new Object[]{aVar});
            }
            return aVar.D;
        }

        public static /* synthetic */ scd x(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (scd) ipChange.ipc$dispatch("80bd8d8d", new Object[]{aVar});
            }
            return aVar.d;
        }

        public static /* synthetic */ ViewGroup y(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("c754d818", new Object[]{aVar});
            }
            return aVar.E;
        }

        public static /* synthetic */ long z(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1bf4e35a", new Object[]{aVar})).longValue();
            }
            return aVar.e;
        }

        public a F(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1c24fa62", new Object[]{this, str});
            }
            this.s = str;
            return this;
        }

        public PreloadParams G() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PreloadParams) ipChange.ipc$dispatch("5dbc391d", new Object[]{this});
            }
            return new PreloadParams(this);
        }

        public a H(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2fbc9d8", new Object[]{this, new Long(j)});
            }
            this.e = j;
            return this;
        }

        public a I(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c5b069c5", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public a J(cdr cdrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2b235300", new Object[]{this, cdrVar});
            }
            this.m = cdrVar;
            return this;
        }

        public a K(dba dbaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2ab27d2e", new Object[]{this, dbaVar});
            }
            this.n = dbaVar;
            return this;
        }

        public a L(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8fc82361", new Object[]{this, uri});
            }
            this.q = uri;
            return this;
        }

        public a M(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5f4755eb", new Object[]{this, new Boolean(z)});
            }
            this.k = z;
            return this;
        }

        public a N(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b902a1b", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public a O(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("59294a1b", new Object[]{this, new Boolean(z)});
            }
            this.l = z;
            return this;
        }

        public a P(cjr cjrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4fc6294", new Object[]{this, cjrVar});
            }
            this.i = cjrVar;
            return this;
        }

        public a Q(MediaData mediaData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e856310c", new Object[]{this, mediaData});
            }
            this.c = mediaData;
            return this;
        }

        public a R(jgi jgiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("eb52d93f", new Object[]{this, jgiVar});
            }
            this.o = jgiVar;
            return this;
        }

        public a S(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("23da3eb", new Object[]{this, str});
            }
            this.p = str;
            return this;
        }

        public a T(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5f6dd3dd", new Object[]{this, str});
            }
            this.z = str;
            return this;
        }

        public a U(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a41123fd", new Object[]{this, str});
            }
            this.D = str;
            return this;
        }

        public a V(scd scdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d6b86993", new Object[]{this, scdVar});
            }
            this.d = scdVar;
            return this;
        }

        public a W(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("170df45a", new Object[]{this, new Integer(i)});
            }
            this.x = i;
            return this;
        }

        public a X(RoomPlayerObserver roomPlayerObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c3740f85", new Object[]{this, roomPlayerObserver});
            }
            this.u = roomPlayerObserver;
            return this;
        }

        public a Y(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3232871e", new Object[]{this, viewGroup});
            }
            this.E = viewGroup;
            return this;
        }

        public a Z(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("43dbc023", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public a a0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d3ccdd7e", new Object[]{this, new Boolean(z)});
            }
            this.A = z;
            return this;
        }

        public a b0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("29e05e13", new Object[]{this, new Integer(i)});
            }
            this.f = i;
            return this;
        }

        public a c0(SimpleLiveInfo simpleLiveInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dd2b3608", new Object[]{this, simpleLiveInfo});
            }
            this.r = simpleLiveInfo;
            return this;
        }

        public a d0(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2ed39590", new Object[]{this, new Long(j)});
            }
            this.t = j;
            return this;
        }

        public a e0(fnr fnrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1655707a", new Object[]{this, fnrVar});
            }
            this.B = fnrVar;
            return this;
        }

        public a f0(ufi ufiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7adc0341", new Object[]{this, ufiVar});
            }
            this.b = ufiVar;
            return this;
        }

        public a g0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7c7c59cf", new Object[]{this, new Boolean(z)});
            }
            this.y = z;
            return this;
        }

        public a h0(VideoInfo videoInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6524ca2e", new Object[]{this, videoInfo});
            }
            this.w = videoInfo;
            return this;
        }

        public a i0(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("21b93952", new Object[]{this, rect});
            }
            this.C = rect;
            return this;
        }

        public a j0(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4bf3d7a6", new Object[]{this, map});
            }
            this.v = map;
            return this;
        }
    }

    static {
        t2o.a(779093112);
    }

    public PreloadParams(a aVar) {
        this.f13202a = a.a(aVar);
        this.b = a.b(aVar);
        this.c = a.m(aVar);
        this.d = a.x(aVar);
        this.e = a.z(aVar);
        this.f = a.A(aVar);
        this.g = a.B(aVar);
        a.C(aVar);
        this.i = a.D(aVar);
        this.h = a.E(aVar);
        a.c(aVar);
        a.d(aVar);
        this.j = a.e(aVar);
        this.k = a.f(aVar);
        this.l = a.g(aVar);
        this.m = a.h(aVar);
        this.n = a.i(aVar);
        this.o = a.j(aVar);
        this.p = a.k(aVar);
        this.q = a.l(aVar);
        this.r = a.n(aVar);
        this.s = a.o(aVar);
        this.t = a.p(aVar);
        a.q(aVar);
        a.r(aVar);
        this.u = a.s(aVar);
        a.t(aVar);
        this.v = a.u(aVar);
        this.w = a.v(aVar);
        this.x = a.w(aVar);
        this.y = a.y(aVar);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.p;
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f13202a;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ff61ffb", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public cdr d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cdr) ipChange.ipc$dispatch("52a2fd", new Object[]{this});
        }
        return this.j;
    }

    public dba e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dba) ipChange.ipc$dispatch("e5829e7f", new Object[]{this});
        }
        return this.k;
    }

    public Uri f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d2c1138", new Object[]{this});
        }
        return this.n;
    }

    public cjr g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cjr) ipChange.ipc$dispatch("5edc81ab", new Object[]{this});
        }
        return this.i;
    }

    public MediaData h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("8f7a415f", new Object[]{this});
        }
        return this.c;
    }

    public jgi i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jgi) ipChange.ipc$dispatch("ea26e464", new Object[]{this});
        }
        return this.l;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1528253a", new Object[]{this});
        }
        return this.m;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31feaeb4", new Object[]{this});
        }
        return this.u;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b8459e8", new Object[]{this});
        }
        return this.x;
    }

    public scd m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (scd) ipChange.ipc$dispatch("7e3e6870", new Object[]{this});
        }
        return this.d;
    }

    public RoomPlayerObserver n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RoomPlayerObserver) ipChange.ipc$dispatch("6900104c", new Object[]{this});
        }
        return this.r;
    }

    public ViewGroup o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("26a69771", new Object[]{this});
        }
        return this.y;
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e47195da", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfc9bb3e", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public SimpleLiveInfo r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleLiveInfo) ipChange.ipc$dispatch("3d4bd971", new Object[]{this});
        }
        return this.o;
    }

    public long s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7060d6f", new Object[]{this})).longValue();
        }
        return this.q;
    }

    public fnr t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnr) ipChange.ipc$dispatch("2f3d1859", new Object[]{this});
        }
        return this.v;
    }

    public ufi u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ufi) ipChange.ipc$dispatch("2e8bd5dc", new Object[]{this});
        }
        return this.b;
    }

    public VideoInfo v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("5c4fa617", new Object[]{this});
        }
        return this.t;
    }

    public Rect w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("cc69c90b", new Object[]{this});
        }
        return this.w;
    }

    public Map<String, String> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ebcbe53b", new Object[]{this});
        }
        return this.s;
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        return this.h;
    }
}
