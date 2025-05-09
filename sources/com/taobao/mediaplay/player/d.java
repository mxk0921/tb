package com.taobao.mediaplay.player;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.DWViewUtil;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.media.MediaSystemUtils;
import com.taobao.mediaplay.MediaContext;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.mediaplay.model.PlayerQualityItem;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.mediaplay.player.a;
import com.taobao.mediaplay.player.c;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.taobao.vpm.VPMManagerInstance;
import com.uc.webview.export.media.CommandID;
import com.uc.webview.export.media.MessageID;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.c2v;
import tb.cot;
import tb.cq;
import tb.ct2;
import tb.dot;
import tb.dq;
import tb.ew0;
import tb.f7l;
import tb.feh;
import tb.gf4;
import tb.gov;
import tb.hsc;
import tb.isc;
import tb.izq;
import tb.ja1;
import tb.jsr;
import tb.nfi;
import tb.nj9;
import tb.oxw;
import tb.pgi;
import tb.r7t;
import tb.rb;
import tb.rgi;
import tb.sdi;
import tb.sj4;
import tb.sx1;
import tb.t2o;
import tb.t7w;
import tb.tfb;
import tb.tkt;
import tb.wei;
import tb.x3r;
import tv.danmaku.ijk.media.player.AbstractMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;
import tv.danmaku.ijk.media.player.NativeMediaPlayer;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d extends com.taobao.mediaplay.player.b implements rgi.a, a.AbstractC0594a, IMediaPlayer.OnLoopCompletionListener, Handler.Callback, nj9, c.a, InnerStartFuncListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int G1 = 200;
    public static int H1 = 21;
    public static final HashMap<String, Integer> I1 = new HashMap<>();
    public nj9 A0;
    public boolean A1;
    public WeakReference<InnerStartFuncListener> B0;
    public c.b B1;
    public final boolean C0;
    public boolean C1;
    public boolean D;
    public int D0;
    public float D1;
    public int E;
    public final boolean E0;
    public boolean E1;
    public int F;
    public final boolean F0;
    public boolean F1;
    public boolean G;
    public isc G0;
    public com.taobao.mediaplay.player.c H;
    public isc H0;
    public boolean I;
    public String I0;
    public boolean J;
    public String J0;
    public boolean J1;
    public boolean K;
    public int K0;
    public String K1;
    public boolean L;
    public final boolean L0;
    public boolean L1;
    public boolean M;
    public final boolean M0;
    public final boolean N;
    public final boolean N0;
    public boolean O;
    public boolean O0;
    public boolean P;
    public boolean P0;
    public int Q;
    public boolean Q0;
    public String R;
    public boolean R0;
    public String S;
    public final List<View> S0;
    public String T;
    public int T0;
    public boolean U;
    public final boolean U0;
    public boolean V;
    public Bitmap V0;
    public com.taobao.mediaplay.player.c W;
    public boolean W0;
    public boolean X;
    public boolean X0;
    public boolean Y;
    public boolean Y0;
    public boolean Z;
    public boolean Z0;
    public long a0;
    public final int a1;
    public boolean b0;
    public final long b1;
    public int c0;
    public long c1;
    public c.b d0;
    public boolean d1;
    public int e0;
    public boolean e1;
    public int f0;
    public boolean f1;
    public int g0;
    public WeakReference<Activity> g1;
    public int h0;
    public boolean h1;
    public final Handler i0;
    public final boolean i1;
    public hsc j0;
    public boolean j1;
    public boolean k0;
    public boolean k1;
    public Map<TaobaoMediaPlayer, List<jsr>> l0;
    public int l1;
    public Map<TaobaoMediaPlayer, jsr> m0;
    public int m1;
    public final Object n0;
    public boolean n1;
    public final AudioManager o0;
    public long o1;
    public com.taobao.mediaplay.player.a p0;
    public long p1;
    public long q0;
    public long q1;
    public long r0;
    public long r1;
    public String s0;
    public long s1;
    public boolean t0;
    public boolean t1;
    public boolean u0;
    public boolean u1;
    public boolean v0;
    public final boolean v1;
    public boolean w0;
    public final Bitmap[] w1;
    public boolean x0;
    public final feh x1;
    public View y0;
    public boolean y1;
    public TaoLiveVideoView.p z0;
    public boolean z1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73eec4d2", new Object[]{this});
            } else {
                AVSDKLog.e(d.x0(d.this), "updateCoverBitMapFromSurfaceView onBitmapFailed");
            }
        }

        public void b(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7efc152", new Object[]{this, bitmap});
                return;
            }
            feh x0 = d.x0(d.this);
            AVSDKLog.e(x0, "updateCoverBitMapFromSurfaceView onBitmapReady bitmap=" + bitmap);
            if (bitmap != null) {
                d.this.w1[0] = bitmap;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements PixelCopy.OnPixelCopyFinishedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f11028a;
        public final /* synthetic */ Bitmap b;

        public b(g gVar, Bitmap bitmap) {
            this.f11028a = gVar;
            this.b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e30dbf8e", new Object[]{this, new Integer(i)});
            } else if (i == 0) {
                AVSDKLog.e(d.x0(d.this), "getCurrentFrame getBitmapFromSurfaceView success");
                ((a) this.f11028a).b(this.b);
            } else {
                feh x0 = d.x0(d.this);
                AVSDKLog.e(x0, "getCurrentFrame getBitmapFromSurfaceView error=" + i);
                ((a) this.f11028a).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            feh x0 = d.x0(d.this);
            AVSDKLog.e(x0, "clearKeepScreenOn " + d.this.l + ", clearFlags");
            ((Activity) d.this.l).getWindow().clearFlags(128);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.mediaplay.player.d$d  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class RunnableC0595d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0595d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            feh x0 = d.x0(d.this);
            AVSDKLog.e(x0, "clearKeepScreenOn " + d.this.l + ", clearFlags");
            ((Activity) d.this.m).getWindow().clearFlags(128);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements IMediaPlayer.OnSeekCompletionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompletionListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a9f3179", new Object[]{this, iMediaPlayer});
            } else {
                d.A0(d.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class f {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$mediaplay$player$MediaAspectRatio;

        static {
            int[] iArr = new int[MediaAspectRatio.values().length];
            $SwitchMap$com$taobao$mediaplay$player$MediaAspectRatio = iArr;
            try {
                iArr[MediaAspectRatio.DW_FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$mediaplay$player$MediaAspectRatio[MediaAspectRatio.DW_CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$mediaplay$player$MediaAspectRatio[MediaAspectRatio.DW_FIT_X_Y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface g {
    }

    static {
        t2o.a(774897802);
        t2o.a(774897931);
        t2o.a(774897783);
        t2o.a(774898022);
        t2o.a(774897668);
        t2o.a(774897790);
        t2o.a(774898030);
    }

    public d(MediaContext mediaContext, String str) {
        super(mediaContext.getContext());
        AbstractMediaPlayer abstractMediaPlayer;
        this.D = false;
        this.I = true;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = false;
        this.N = true;
        this.O = true;
        this.P = false;
        this.Q = 0;
        this.R = "";
        this.S = "";
        this.T = "";
        this.U = false;
        this.V = false;
        this.X = false;
        this.Y = true;
        this.Z = false;
        this.b0 = false;
        this.c0 = 200;
        this.n0 = new Object();
        this.q0 = 0L;
        this.r0 = 0L;
        this.w0 = false;
        this.x0 = true;
        this.C0 = true;
        this.D0 = 0;
        this.E0 = true;
        this.F0 = true;
        this.G0 = null;
        this.H0 = null;
        this.J0 = "";
        this.L0 = true;
        this.M0 = false;
        this.N0 = false;
        this.O0 = false;
        this.P0 = false;
        this.Q0 = false;
        this.R0 = false;
        this.T0 = 0;
        this.U0 = true;
        this.J1 = false;
        this.W0 = false;
        this.X0 = false;
        this.Y0 = false;
        this.Z0 = false;
        this.a1 = 15;
        this.e1 = false;
        this.f1 = false;
        this.g1 = null;
        this.i1 = true;
        this.k1 = false;
        this.l1 = 0;
        this.m1 = 0;
        this.n1 = true;
        this.o1 = 0L;
        this.p1 = 0L;
        this.q1 = 0L;
        this.r1 = 0L;
        this.s1 = -1L;
        this.t1 = false;
        this.K1 = "";
        this.u1 = false;
        this.v1 = true;
        this.w1 = new Bitmap[1];
        this.y1 = false;
        this.z1 = false;
        this.A1 = false;
        this.B1 = null;
        this.C1 = false;
        this.D1 = 0.0f;
        this.L1 = false;
        this.p = mediaContext;
        feh fehVar = new feh(toString(), this.p.mPlayToken);
        this.x1 = fehVar;
        AVSDKLog.e(fehVar, "TextureVideoView created, video_token: " + str);
        MediaContext mediaContext2 = this.p;
        if (!(mediaContext2 == null || mediaContext2.getExternSurface() == null)) {
            this.j = this.p.getExternSurface();
            this.i = true;
            AVSDKLog.e(fehVar, "AVSDK TextureVideoView initRender: extern " + this.j);
        }
        this.b1 = System.currentTimeMillis();
        this.Z0 = izq.i(this.l, this.p.mPlayToken).c();
        boolean b2 = izq.i(this.l, this.p.mPlayToken).b(this.l, this.p.mMediaPlayContext.mFrom);
        boolean d = izq.i(this.l, this.p.mPlayToken).d();
        if (!this.Z0 || !b2 || !d) {
            this.Z0 = false;
        } else {
            this.Z0 = true;
        }
        if (this.p.getControlParams() != null && !TextUtils.isEmpty(this.p.getControlParams().get("LiveRoomInit"))) {
            this.z1 = ew0.s(this.p.getControlParams().get("LiveRoomInit"));
            AVSDKLog.e(fehVar, "TextureVideoView init: get LiveRoomInit=" + this.z1 + " from mMediaContext.getControlParams() ");
        }
        if (this.Z0 && !izq.m && this.z1) {
            this.Z0 = false;
        }
        if (this.Z0 && this.p.mDisableSurfaceView) {
            AVSDKLog.e(fehVar, "set disable SurfaceView by client with callWithMsg");
            this.Z0 = false;
            izq.i(this.l, this.p.mPlayToken).a(1);
        }
        if (this.p.mMediaPlayContext.mForceUseSurfaceView) {
            this.Z0 = true;
            AVSDKLog.e(fehVar, "set enable SurfaceView by client with out interface");
        }
        if ((ja1.g0() && !ja1.J0) || this.p.mIsPlayBackScenario) {
            this.Z0 = false;
        }
        if (ew0.s(ja1.K(this.l, "DWInteractive", "testOrangeMock", "false"))) {
            AVSDKLog.e(fehVar, "test orange mock success");
        }
        MediaContext mediaContext3 = this.p;
        B0(mediaContext3.mMediaPlayContext, izq.i(this.l, mediaContext3.mPlayToken).g(), izq.i(this.l, this.p.mPlayToken).f(), izq.i(this.l, this.p.mPlayToken).h());
        String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_SURFACEVIEW_MODEL_LIST, "[\"2311DRK48C\",\"23078RKD5C\",\"2407FRK8EC\",\"23090RA98C\"]");
        String str2 = Build.MODEL;
        if (ew0.n(str2, config)) {
            AVSDKLog.e(fehVar, "disable surfaceView by model: " + str2);
            this.Z0 = false;
        }
        if (!ja1.q()) {
            AVSDKLog.e(fehVar, "disable surfaceView for egl unavailable");
            this.Z0 = false;
        }
        if (this.Z0) {
            String config2 = OrangeConfig.getInstance().getConfig("DWInteractive", TaobaoMediaPlayer.ORANGE_ENABLE_SURFACEVIEW_REBUILD_BUSINESSTYPE_LIST, "[\"LiveCard\",\"homepageLiveCard\"]");
            AVSDKLog.e(fehVar, "mEnableRebuildWhenSurfaceViewAttach=false because from=" + this.p.mMediaPlayContext.mFrom);
            if (ew0.n(this.p.mMediaPlayContext.mFrom, config2)) {
                this.h1 = true;
            }
        }
        W0();
        MediaContext mediaContext4 = this.p;
        if (!mediaContext4.mMediaPlayContext.mTBLive) {
            H1 = 18;
        }
        this.o0 = (AudioManager) mediaContext4.getContext().getApplicationContext().getSystemService("audio");
        this.i0 = new Handler(this);
        this.s0 = str;
        String d2 = TextUtils.isEmpty(str) ? ew0.d() : str;
        if (this.p.mMediaPlayContext.mTBLive) {
            this.n = wei.n().f(d2, this);
        } else {
            this.n = pgi.n().f(d2, this);
        }
        rgi rgiVar = this.n;
        if (!(rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null || !(abstractMediaPlayer instanceof TaobaoMediaPlayer))) {
            ((TaobaoMediaPlayer) abstractMediaPlayer).setReuseFlag(true);
            AVSDKLog.e(fehVar, "TextureVideoView##contruct: reuse TaobaoMediaPlayer and url is " + ((TaobaoMediaPlayer) this.n.f).getPlayUrl());
        }
        this.M0 = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_REBUILD_RENDER_VIEW_WHEN_REUSE, "false"));
        if (this.Z0) {
            this.N0 = false;
            this.M0 = true;
        } else {
            this.N0 = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enableRebuildViewByAB", "true"));
        }
        if (this.S0 == null) {
            this.S0 = new ArrayList();
        }
        i1();
    }

    public static /* synthetic */ void A0(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb174e0", new Object[]{dVar});
        } else {
            dVar.C1();
        }
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/player/TextureVideoView");
    }

    public static /* synthetic */ feh x0(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("6f855118", new Object[]{dVar});
        }
        return dVar.x1;
    }

    public static /* synthetic */ void y0(d dVar, AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95ea81d1", new Object[]{dVar, abstractMediaPlayer});
        } else {
            dVar.l1(abstractMediaPlayer);
        }
    }

    public static /* synthetic */ boolean z0(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9139017", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        dVar.D = z;
        return z;
    }

    @Override // com.taobao.mediaplay.player.b
    public boolean A() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63f2d892", new Object[]{this})).booleanValue();
        }
        rgi rgiVar = this.n;
        if (rgiVar.f == null || (i = rgiVar.e) == 0 || i == 8 || i == 3 || i == 6) {
            return false;
        }
        return true;
    }

    public void A1(AbstractMediaPlayer abstractMediaPlayer, long j) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d0aefeb", new Object[]{this, abstractMediaPlayer, new Long(j)});
            return;
        }
        MediaContext mediaContext = this.p;
        MediaPlayControlContext mediaPlayControlContext = mediaContext.mMediaPlayContext;
        if ((!mediaPlayControlContext.mTBLive && !mediaPlayControlContext.mEmbed) || mediaContext.mScenarioType == 2) {
            z = false;
        }
        if (!TextUtils.isEmpty(this.g)) {
            if (this.g.contains(".flv")) {
                return;
            }
            if (z && this.g.contains(".m3u8")) {
                return;
            }
        }
        z1(abstractMediaPlayer, j);
    }

    public void B0(MediaPlayControlContext mediaPlayControlContext, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e5f5c4", new Object[]{this, mediaPlayControlContext, new Long(j), new Long(j2), new Long(j3)});
        } else if (mediaPlayControlContext != null) {
            HashSet<Long> hashSet = mediaPlayControlContext.mExperienceIdSet;
            if (!(hashSet == null || j == 0)) {
                hashSet.add(Long.valueOf(j));
            }
            HashSet<Long> hashSet2 = mediaPlayControlContext.mExperienceBucketIdSet;
            if (!(hashSet2 == null || j2 == 0)) {
                hashSet2.add(Long.valueOf(j2));
            }
            HashSet<Long> hashSet3 = mediaPlayControlContext.mExperienceReleaseIdSet;
            if (hashSet3 != null && j3 != 0) {
                hashSet3.add(Long.valueOf(j3));
            }
        }
    }

    public final void B1(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8536d9", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            return;
        }
        int i2 = this.n.e;
        if (i2 == 5 || i2 == 2 || i2 == 4 || i2 == 1) {
            if (i > k()) {
                i = k();
            }
            AbstractMediaPlayer abstractMediaPlayer = this.n.f;
            if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
                ((TaobaoMediaPlayer) abstractMediaPlayer).seekTo(i, z, z2);
            }
            this.n.f.setOnSeekCompleteListener(new dot(this));
        }
    }

    public boolean C0(jsr jsrVar) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89570f5a", new Object[]{this, jsrVar})).booleanValue();
        }
        if (ja1.j0(this.p.getContext()) && ja1.q() && (abstractMediaPlayer = this.n.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) abstractMediaPlayer;
            Map<TaobaoMediaPlayer, List<jsr>> map = this.l0;
            if (map == null) {
                this.l0 = new HashMap();
                this.m0 = new HashMap();
                ArrayList arrayList = new ArrayList();
                arrayList.add(jsrVar);
                this.l0.put(taobaoMediaPlayer, arrayList);
                taobaoMediaPlayer.enableOnRenderCallback();
                return true;
            }
            List<jsr> list = map.get(taobaoMediaPlayer);
            if (list != null && !list.contains(jsrVar)) {
                list.add(jsrVar);
                this.l0.put(taobaoMediaPlayer, list);
                return true;
            } else if (list == null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(jsrVar);
                this.l0.put(taobaoMediaPlayer, arrayList2);
                taobaoMediaPlayer.enableOnRenderCallback();
            }
        }
        return false;
    }

    public final void C1() {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f260b5ea", new Object[]{this});
        } else if (v() != 3 && v() != 6 && v() != 4 && (handler = this.i0) != null) {
            handler.removeCallbacksAndMessages(null);
            this.i0.sendEmptyMessageDelayed(0, G1);
        }
    }

    public void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c335f2", new Object[]{this});
            return;
        }
        if (this.p != null) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "asyncPrepareVideo##PlayState:" + this.n.e);
        }
        this.F1 = false;
        this.A = true;
        this.t = 8;
        v1();
        rgi rgiVar = this.n;
        rgiVar.b = 0;
        if (rgiVar.d) {
            rgiVar.c = 5;
            U0();
            this.u0 = false;
        } else if (z(rgiVar.e) && !TextUtils.isEmpty(this.g)) {
            T0();
            if (TextUtils.isEmpty(this.s0)) {
                rgi rgiVar2 = this.n;
                rgiVar2.e = 8;
                rgiVar2.d = false;
            }
        }
    }

    public void D1(MediaAspectRatio mediaAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31b348f", new Object[]{this, mediaAspectRatio});
        } else if (this.W != null && mediaAspectRatio != null) {
            int i = f.$SwitchMap$com$taobao$mediaplay$player$MediaAspectRatio[mediaAspectRatio.ordinal()];
            if (i == 1) {
                this.W.setAspectRatio(0);
            } else if (i == 2) {
                this.W.setAspectRatio(1);
            } else if (i == 3) {
                this.W.setAspectRatio(3);
            }
        }
    }

    public void E0() {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450701c0", new Object[]{this});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) abstractMediaPlayer).audioOff();
        }
    }

    public final void E1(int i) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31af42d9", new Object[]{this, new Integer(i)});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) abstractMediaPlayer)._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_EXTEND_VIDEO_ASPECT_RATIO, i);
        }
    }

    public void F0() {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13155a5c", new Object[]{this});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) abstractMediaPlayer).audioOn();
        }
    }

    public void F1(int i, String str, int i2) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12bef9d2", new Object[]{this, new Integer(i), str, new Integer(i2)});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) abstractMediaPlayer).setAuthInfoResult(i, i2);
        }
    }

    public final void G0(IMediaPlayer iMediaPlayer, c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c482522", new Object[]{this, iMediaPlayer, bVar});
        } else if (iMediaPlayer != null) {
            if (bVar == null) {
                iMediaPlayer.setSurface(null);
            } else {
                bVar.a(iMediaPlayer);
            }
        }
    }

    public void G1(int i, String str) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318e63c5", new Object[]{this, new Integer(i), str});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) abstractMediaPlayer).setDegradeCode(i, str);
        }
    }

    public void H0(Map<String, String> map) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f07861", new Object[]{this, map});
        } else if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                I0(entry.getKey(), entry.getValue());
            }
            rgi rgiVar = this.n;
            if (!(rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null || !(abstractMediaPlayer instanceof TaobaoMediaPlayer))) {
                ((TaobaoMediaPlayer) abstractMediaPlayer).callWithMsg(map);
            }
        }
    }

    public void H1(int i) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a07335c", new Object[]{this, new Integer(i)});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) abstractMediaPlayer).setDegradeFlvReason(i);
        }
    }

    public final void I0(String str, String str2) {
        rgi rgiVar;
        AbstractMediaPlayer abstractMediaPlayer;
        rgi rgiVar2;
        AbstractMediaPlayer abstractMediaPlayer2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9002b4d4", new Object[]{this, str, str2});
        } else if (MediaConstant.CMD_SET_ENABLE_ADAPTIVE_LIVE_SWITCH.equals(str)) {
            if ("1".equals(str2) && this.P && this.O && this.N && (rgiVar2 = this.n) != null && (abstractMediaPlayer2 = rgiVar2.f) != null && (abstractMediaPlayer2 instanceof TaobaoMediaPlayer)) {
                MediaPlayControlContext mediaPlayControlContext = this.p.mMediaPlayContext;
                ((TaobaoMediaPlayer) this.n.f).startRtcAdaption(mediaPlayControlContext.getRtcSwitchLiveInfo(mediaPlayControlContext.mMediaLiveInfo));
            }
        } else if (MediaConstant.CMD_REPLACE_FORCE_OF_NEW_DEFINITION.equals(str)) {
            if ("1".equals(str2) && this.O && this.N && (rgiVar = this.n) != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
                ((TaobaoMediaPlayer) abstractMediaPlayer).stopRtcAdaption();
                MediaPlayControlContext mediaPlayControlContext2 = this.p.mMediaPlayContext;
                ((TaobaoMediaPlayer) this.n.f).startRtcAdaption(mediaPlayControlContext2.getRtcSwitchLiveInfo(mediaPlayControlContext2.mMediaLiveInfo));
            }
        } else if (MediaConstant.CMD_ENABLE_AUTO_PAUSE_IN_BACKGROUND.equals(str) && !TextUtils.isEmpty(str2)) {
            if ("1".equals(str2)) {
                this.p.mMediaPlayContext.mEnableAutoPauseInBackground = true;
            } else if ("0".equals(str2)) {
                this.p.mMediaPlayContext.mEnableAutoPauseInBackground = false;
            }
        }
    }

    public void I1(long j) {
        rgi rgiVar;
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("962cd696", new Object[]{this, new Long(j)});
        } else if (this.x0 && (rgiVar = this.n) != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            HashMap hashMap = new HashMap();
            String str = MediaConstant.CMD_SET_FIRST_FRAME_UPDATE_TIME;
            hashMap.put(str, "" + j);
            ((TaobaoMediaPlayer) abstractMediaPlayer).callWithMsg(hashMap);
            this.x0 = false;
        }
    }

    public void J1(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
        } else {
            this.A0 = nj9Var;
        }
    }

    public void K0() {
        Context context;
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0265704", new Object[]{this});
            return;
        }
        MediaContext mediaContext = this.p;
        if (mediaContext == null || mediaContext.getControlParams().get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM) == null || !ew0.s(this.p.getControlParams().get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM))) {
            try {
                feh fehVar = this.x1;
                AVSDKLog.e(fehVar, "clearKeepScreenOn " + this.l + ", " + ja1.L());
                if (this.i1) {
                    if (this.j1) {
                        this.j1 = false;
                        ja1.r();
                        if (ja1.L() == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    Context context3 = this.l;
                    if (context3 != null && (context3 instanceof Activity) && ja1.L() == 0) {
                        feh fehVar2 = this.x1;
                        AVSDKLog.e(fehVar2, "clearKeepScreenOn " + this.l + ", clearFlags");
                        ((Activity) this.l).getWindow().clearFlags(128);
                    }
                    if (this.E0 && (context2 = this.m) != null && (context2 instanceof Activity) && ja1.L() == 0) {
                        ((Activity) this.m).getWindow().clearFlags(128);
                        return;
                    }
                    return;
                }
                Context context4 = this.l;
                if (context4 != null && (context4 instanceof Activity) && ja1.L() == 0) {
                    new Handler(Looper.getMainLooper()).post(new c());
                }
                if (this.E0 && (context = this.m) != null && (context instanceof Activity) && ja1.L() == 0) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0595d());
                }
            } catch (Throwable unused) {
            }
        } else {
            AVSDKLog.e(this.x1, "clearKeepScreenOn do nothing");
        }
    }

    public void K1(isc iscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6509b308", new Object[]{this, iscVar});
            return;
        }
        feh fehVar = this.x1;
        AVSDKLog.e(fehVar, "setIMediaSwitchInnerListener:" + iscVar);
        this.H0 = iscVar;
    }

    public final Bitmap L0(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("36fb36ea", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        feh fehVar = this.x1;
        AVSDKLog.e(fehVar, "createAlphaBitmapInner width=" + i + ", height=" + i2 + ",roundRectWidth=" + i3 + ", roundRectHeight=" + i4);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        Paint paint = new Paint();
        paint.setColor(-16777216);
        canvas.drawRoundRect(rectF, (float) i3, (float) i4, paint);
        return createBitmap;
    }

    public void L1(isc iscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ad0854", new Object[]{this, iscVar});
            return;
        }
        feh fehVar = this.x1;
        AVSDKLog.e(fehVar, "setIMediaSwitchListener:" + iscVar);
        this.G0 = iscVar;
    }

    public boolean M0(int i, int i2, int i3, int i4) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42d7cdd6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).booleanValue();
        }
        rgi rgiVar = this.n;
        if (rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null || !(abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            return false;
        }
        return N0(abstractMediaPlayer, i, i2, i3, i4);
    }

    public void M1(InnerStartFuncListener innerStartFuncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805c05a7", new Object[]{this, innerStartFuncListener});
        } else if (innerStartFuncListener != null) {
            this.B0 = new WeakReference<>(innerStartFuncListener);
        }
    }

    public void N1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d128a9", new Object[]{this, new Boolean(z)});
        } else if (this.K) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "setLiveDefinitionAutoSwitch rtcLiveAutoSwitch: " + this.L + " => " + z);
            this.L = z;
            rgi rgiVar = this.n;
            if (rgiVar != null) {
                AbstractMediaPlayer abstractMediaPlayer = rgiVar.f;
                if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
                    ((TaobaoMediaPlayer) abstractMediaPlayer).setLiveDefinitionAutoSwitch(z);
                }
            }
        }
    }

    public final AbstractMediaPlayer O0(r7t r7tVar) {
        NativeMediaPlayer nativeMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractMediaPlayer) ipChange.ipc$dispatch("743d08c5", new Object[]{this, r7tVar});
        }
        if (this.p != null) {
            AVSDKLog.e(this.x1, "degradeMediaPlayer called.");
        }
        if (this.p == null || MediaAdapteManager.mConfigAdapter == null) {
            nativeMediaPlayer = new NativeMediaPlayer(this.l);
        } else {
            nativeMediaPlayer = new NativeMediaPlayer(this.l, MediaAdapteManager.mConfigAdapter);
        }
        this.p.mMediaPlayContext.setHardwareAvc(true);
        this.p.mMediaPlayContext.setHardwareHevc(true);
        r7tVar.h = 1;
        r7tVar.g = 1;
        this.p.mMediaPlayContext.setPlayerType(2);
        if (!TextUtils.isEmpty(this.p.mMediaPlayContext.getBackupVideoUrl()) && this.p.mMediaPlayContext.isH265()) {
            String backupVideoUrl = this.p.mMediaPlayContext.getBackupVideoUrl();
            this.g = backupVideoUrl;
            this.p.mMediaPlayContext.setVideoUrl(backupVideoUrl);
            MediaPlayControlContext mediaPlayControlContext = this.p.mMediaPlayContext;
            mediaPlayControlContext.setVideoDefinition(mediaPlayControlContext.getBackupVideoDefinition());
            MediaPlayControlContext mediaPlayControlContext2 = this.p.mMediaPlayContext;
            mediaPlayControlContext2.setCacheKey(mediaPlayControlContext2.getBackupCacheKey());
            r7tVar.D = this.p.mMediaPlayContext.getBackupVideoDefinition();
            r7tVar.r = this.p.mMediaPlayContext.getBackupCacheKey();
        }
        return nativeMediaPlayer;
    }

    public final void O1(AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a438f2d1", new Object[]{this, abstractMediaPlayer});
            return;
        }
        try {
            abstractMediaPlayer.registerOnPreparedListener(this);
            abstractMediaPlayer.setOnVideoSizeChangedListener(this);
            abstractMediaPlayer.registerOnCompletionListener(this);
            abstractMediaPlayer.registerOnErrorListener(this);
            abstractMediaPlayer.setOnBufferingUpdateListener(this);
            abstractMediaPlayer.registerOnInfoListener(this);
            abstractMediaPlayer.registerOnLoopCompletionListener(this);
            abstractMediaPlayer.setScreenOnWhilePlaying(true);
            abstractMediaPlayer.registerOnVFPluginListener(this);
        } catch (Throwable unused) {
        }
    }

    public void P0(SurfaceView surfaceView, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec605ec3", new Object[]{this, surfaceView, gVar});
        } else if (Build.VERSION.SDK_INT < 24 || surfaceView.getWidth() <= 0 || surfaceView.getHeight() <= 0) {
            ((a) gVar).a();
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
            PixelCopy.request(surfaceView, createBitmap, new b(gVar, createBitmap), new Handler(Looper.getMainLooper()));
        }
    }

    public View Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("61e26bd8", new Object[]{this});
        }
        if (this.W != null) {
            return null;
        }
        this.W = new MediaTextureView(this.l, this.x1.b());
        feh fehVar = this.x1;
        AVSDKLog.e(fehVar, "SeamlessSwitch change render callback one " + this.W);
        this.W.setBackground(true);
        this.W.addRenderCallback(this);
        this.W.setVideoRotation(this.E);
        D1(this.p.getVideoAspectRatio());
        return this.W.getView();
    }

    public void Q1(boolean z, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b6875c", new Object[]{this, new Boolean(z), new Integer(i), new Boolean(z2)});
            return;
        }
        this.Y = z2;
        AbstractMediaPlayer abstractMediaPlayer = this.n.f;
        if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
            ((TaobaoMediaPlayer) abstractMediaPlayer).setSeamlessSwitchOption(z, i, z2);
        }
    }

    public List<jsr> R0(IMediaPlayer iMediaPlayer) {
        Map<TaobaoMediaPlayer, List<jsr>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("79494845", new Object[]{this, iMediaPlayer});
        }
        if (iMediaPlayer == null || (map = this.l0) == null || ((HashMap) map).size() == 0) {
            return null;
        }
        List<jsr> list = (List) ((HashMap) this.l0).get(iMediaPlayer);
        if (list == null || list.size() != 0) {
            return list;
        }
        return null;
    }

    public void R1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53919393", new Object[]{this, str});
            return;
        }
        AbstractMediaPlayer abstractMediaPlayer = this.n.f;
        if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
            ((TaobaoMediaPlayer) abstractMediaPlayer).setSeamlessSwitchUrl(str);
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void S(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d799c2e", new Object[]{this, mediaPlayScreenType});
        } else {
            O(mediaPlayScreenType);
        }
    }

    public void S1(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("630e1e9d", new Object[]{this, str, str2});
        } else if (this.n.f instanceof TaobaoMediaPlayer) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "setSeamlessSwitchUrl: " + str + ", selectName=" + str2);
            ((TaobaoMediaPlayer) this.n.f).setSeamlessSwitchUrl(str, str2);
        }
    }

    public final void T0() {
        rgi rgiVar;
        MediaContext mediaContext;
        rgi rgiVar2;
        MediaContext mediaContext2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23416bc", new Object[]{this});
        } else if (this.g != null && this.l != null) {
            rgi rgiVar3 = this.n;
            if (rgiVar3 != null && rgiVar3.e == 3) {
                String str = rgiVar3.f27360a;
                if (!this.p.mMediaPlayContext.mTBLive) {
                    this.n = pgi.n().f(str, this);
                } else if ((ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, "false")) || ja1.C0) && (mediaContext2 = this.p) != null && mediaContext2.getWarmupFlag() && oxw.n().a(str)) {
                    this.n = oxw.n().f(str, this);
                } else {
                    this.n = wei.n().f(str, this);
                }
                dq.b().submit(new cot(this, this.n.f));
                this.n.f = null;
                this.X0 = false;
            }
            String str2 = this.n.f27360a;
            if ((ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, "false")) || ja1.C0) && (mediaContext = this.p) != null && mediaContext.getWarmupFlag() && oxw.n().a(str2)) {
                if (this.p.mMediaPlayContext.mTBLive) {
                    rgiVar2 = oxw.n().f(str2, this);
                } else {
                    rgiVar2 = pgi.n().f(str2, this);
                }
                this.n = rgiVar2;
            } else {
                if (this.p.mMediaPlayContext.mTBLive) {
                    rgiVar = wei.n().f(str2, this);
                } else {
                    rgiVar = pgi.n().f(str2, this);
                }
                this.n = rgiVar;
            }
            float f2 = this.D1;
            if (f2 > 0.0f) {
                this.n.i = f2;
                this.D1 = 0.0f;
            }
            if (this.p.mMediaPlayContext.isMute()) {
                s0(0.0f);
            }
            rgi rgiVar4 = this.n;
            if (rgiVar4.f == null) {
                rgiVar4.e = 0;
                rgiVar4.f = V0();
            }
            Surface surface = this.j;
            if (surface != null && this.i) {
                X1(this.n.f, surface);
            }
            if (!TextUtils.isEmpty(this.s0)) {
                AVSDKLog.e(this.x1, "TextureVideoView setSurface in initMediaPlayer");
                if (p() != null) {
                    X1(this.n.f, p());
                } else {
                    G0(this.n.f, l());
                }
                q1(this.n.f);
            }
            O1(this.n.f);
            this.n.f.setLooping(this.k0);
            g0(this.p.getVideoAspectRatio());
            rgi rgiVar5 = this.n;
            if (rgiVar5 != null) {
                int i = rgiVar5.e;
                if ((i == 5 || i == 8 || i == 4 || i == 2 || i == 1) && this.I) {
                    rgiVar5.f.start();
                    Q();
                    C1();
                }
            }
        }
    }

    public void U0() {
        rgi rgiVar;
        MediaContext mediaContext;
        rgi rgiVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77cf44f3", new Object[]{this});
            return;
        }
        rgi rgiVar3 = this.n;
        if (rgiVar3.e != 8) {
            rgiVar3.e = 0;
        }
        if ((ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, "false")) || ja1.C0) && (mediaContext = this.p) != null && mediaContext.getWarmupFlag() && oxw.n().a(this.n.f27360a)) {
            if (this.p.mMediaPlayContext.mTBLive) {
                rgiVar2 = oxw.n().g(this.n);
            } else {
                rgiVar2 = pgi.n().g(this.n);
            }
            this.n = rgiVar2;
        } else {
            if (this.p.mMediaPlayContext.mTBLive) {
                rgiVar = wei.n().g(this.n);
            } else {
                rgiVar = pgi.n().g(this.n);
            }
            this.n = rgiVar;
        }
        rgi rgiVar4 = this.n;
        AbstractMediaPlayer abstractMediaPlayer = rgiVar4.f;
        if (abstractMediaPlayer == null) {
            rgiVar4.f = V0();
            this.n.e = 8;
        } else {
            O1(abstractMediaPlayer);
        }
        if (p() != null) {
            X1(this.n.f, p());
        }
        if (l() != null) {
            G0(this.n.f, l());
        }
        this.n.f.setLooping(this.k0);
    }

    public final void U1() {
        com.taobao.mediaplay.player.c cVar;
        rgi rgiVar;
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1f0115", new Object[]{this});
        } else if (this.e1 && (cVar = this.H) != null && (rgiVar = this.n) != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) abstractMediaPlayer;
            if (this.Z0) {
                taobaoMediaPlayer.setShowViewParent((ViewGroup) ((MediaSurfaceView) cVar).getParent());
            } else {
                taobaoMediaPlayer.setShowViewParent((ViewGroup) ((MediaTextureView) cVar).getParent());
            }
        }
    }

    public void V1(hsc hscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd224379", new Object[]{this, hscVar});
        } else {
            this.j0 = hscVar;
        }
    }

    public final void W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21fca992", new Object[]{this});
            return;
        }
        if (this.Z0) {
            MediaSurfaceView mediaSurfaceView = new MediaSurfaceView(this.l, this.x1.b());
            this.W0 = true;
            this.Y0 = true;
            mediaSurfaceView.setUseCrop(false);
            this.H = mediaSurfaceView;
        } else {
            MediaTextureView mediaTextureView = new MediaTextureView(this.l, this.x1.b());
            if (ja1.y() >= 0) {
                mediaTextureView.setBackgroundColor(tkt.DEFAULT_LINK_COLOR);
            }
            this.H = mediaTextureView;
        }
        feh fehVar = this.x1;
        AVSDKLog.e(fehVar, "initRenderView " + this.H);
        this.H.addRenderCallback(this);
        this.H.setVideoRotation(this.E);
        g0(this.p.getVideoAspectRatio());
        this.y0 = this.H.getView();
    }

    public final void W1() {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44b67df", new Object[]{this});
        } else if (!this.d1) {
            this.d1 = true;
            rgi rgiVar = this.n;
            if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
                HashMap hashMap = new HashMap();
                String str = MediaConstant.CMD_SET_SURFACE_TIME;
                hashMap.put(str, "" + (this.c1 - this.b1));
                ((TaobaoMediaPlayer) abstractMediaPlayer).callWithMsg(hashMap);
            }
        }
    }

    public void X0(AbstractMediaPlayer abstractMediaPlayer, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd1b3ed0", new Object[]{this, abstractMediaPlayer, new Long(j)});
        } else if (abstractMediaPlayer != null) {
            abstractMediaPlayer.instantSeekTo(j);
        }
    }

    public final void X1(IMediaPlayer iMediaPlayer, Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf33cffc", new Object[]{this, iMediaPlayer, surface});
        } else {
            iMediaPlayer.setSurface(surface);
        }
    }

    public boolean Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue();
        }
        if (this.p.getAudioOnly()) {
            return true;
        }
        com.taobao.mediaplay.player.c cVar = this.H;
        if (cVar != null) {
            return cVar.isAvailable();
        }
        com.taobao.mediaplay.player.c cVar2 = this.W;
        if (cVar2 != null) {
            return cVar2.isAvailable();
        }
        return false;
    }

    public void a1() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd09697", new Object[]{this});
            return;
        }
        MediaContext mediaContext = this.p;
        if (mediaContext == null || mediaContext.getControlParams().get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM) == null || !ew0.s(this.p.getControlParams().get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM))) {
            try {
                feh fehVar = this.x1;
                AVSDKLog.e(fehVar, "keepScreenOn " + this.l + ", " + ja1.L());
                if (this.i1) {
                    if (!this.j1) {
                        this.j1 = true;
                        ja1.R();
                    } else {
                        return;
                    }
                }
                Context context2 = this.l;
                if (context2 != null && (context2 instanceof Activity) && ja1.L() > 0) {
                    feh fehVar2 = this.x1;
                    AVSDKLog.e(fehVar2, "keepScreenOn " + this.l + ", addFlags");
                    ((Activity) this.l).getWindow().addFlags(128);
                }
                if (this.E0 && (context = this.m) != null && (context instanceof Activity) && ja1.L() > 0) {
                    ((Activity) this.m).getWindow().addFlags(128);
                }
            } catch (Throwable unused) {
            }
        } else {
            AVSDKLog.e(this.x1, "KeepScreeon do nothing");
        }
    }

    public final void a2() {
        com.taobao.mediaplay.player.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f0e456", new Object[]{this});
            return;
        }
        Context context = this.l;
        if (context != null && (aVar = this.p0) != null) {
            aVar.b((Application) context.getApplicationContext());
            this.p0 = null;
        }
    }

    public void b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fdf5e2f", new Object[]{this});
        } else {
            I(null, 12102L, System.currentTimeMillis(), 0L, null);
        }
    }

    public final void b2(AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32f80ab", new Object[]{this, abstractMediaPlayer});
            return;
        }
        try {
            abstractMediaPlayer.setOnVideoSizeChangedListener(null);
            abstractMediaPlayer.setOnBufferingUpdateListener(null);
            abstractMediaPlayer.unregisterOnPreparedListener(this);
            abstractMediaPlayer.unregisterOnVideoSizeChangedListener(this);
            abstractMediaPlayer.unregisterOnCompletionListener(this);
            abstractMediaPlayer.unregisterOnErrorListener(this);
            abstractMediaPlayer.unregisterOnBufferingUpdateListener(this);
            abstractMediaPlayer.unregisterOnInfoListener(this);
            abstractMediaPlayer.unregisterOnLoopCompletionListener(this);
        } catch (Throwable th) {
            if (this.p != null) {
                feh fehVar = this.x1;
                AVSDKLog.e(fehVar, "unregisterMediaplayerListener##error:" + th.getMessage());
            }
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void c0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            n1();
            e0(i, false);
            int i2 = this.n.e;
            if ((i2 == 5 || i2 == 2 || i2 == 4 || i2 == 1) && !this.F1) {
                P(i);
            }
        }
    }

    public final void c1(String str, String str2, String str3, String str4) {
        isc iscVar;
        isc iscVar2;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1718875a", new Object[]{this, str, str2, str3, str4});
        } else if (this.G0 != null || this.H0 != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(rb.RESULT_KEY, str);
            hashMap.put("newDefinition", str2);
            hashMap.put("protocol", str3);
            hashMap.put("detail", str4);
            hashMap.put("reason", "" + this.K0);
            if (this.K) {
                if (this.L) {
                    str5 = "1";
                } else {
                    str5 = "0";
                }
                hashMap.put("autoSwitch", str5);
            }
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "notifySwitchInfo result: " + hashMap);
            if (this.z && (iscVar2 = this.G0) != null) {
                iscVar2.A(hashMap);
            }
            if (!this.z && (iscVar = this.H0) != null) {
                iscVar.A(hashMap);
                this.H0 = null;
            }
        }
    }

    public final void c2(int i, int i2, int i3, int i4) {
        rgi rgiVar;
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abbe0f5f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            if (this.W0 && this.V0 != null && (rgiVar = this.n) != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer) && i > 0 && i2 > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                AVSDKLog.e(this.x1, "start updateAlphaImageIfNeeded");
                Bitmap L0 = L0(i, i2, i3, i4);
                this.V0 = L0;
                ((TaobaoMediaPlayer) this.n.f).updateAlphaBitmap(L0);
                feh fehVar = this.x1;
                AVSDKLog.e(fehVar, "finish updateAlphaImageIfNeeded mAlphaBitmap=" + this.V0 + ", time=" + (System.currentTimeMillis() - currentTimeMillis));
            }
        } catch (Throwable unused) {
            AVSDKLog.e(this.x1, "updateAlphaImageIfNeeded exception");
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void d0(int i, boolean z, boolean z2) {
        rgi rgiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c54c69", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else if (i >= 0 && (rgiVar = this.n) != null && rgiVar.f != null) {
            n1();
            B1(i, z, z2);
            if (z) {
                this.n.e = 2;
            }
            int i2 = this.n.e;
            if ((i2 == 5 || i2 == 2 || i2 == 4 || i2 == 1) && !this.F1) {
                P(i);
            }
        }
    }

    public void d2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9206512", new Object[]{this});
            return;
        }
        View view = this.y0;
        if (view instanceof SurfaceView) {
            try {
                P0((SurfaceView) view, new a());
            } catch (Exception e2) {
                feh fehVar = this.x1;
                AVSDKLog.e(fehVar, "getCurrentFrame surfaceview failed " + e2.toString());
            }
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void e0(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5fb7a56", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        int i2 = this.n.e;
        if (i2 == 5 || i2 == 2 || i2 == 4 || i2 == 1) {
            if (i > k()) {
                i = k();
            }
            if (z) {
                X0(this.n.f, i);
            } else {
                z1(this.n.f, i);
            }
            this.n.f.setOnSeekCompleteListener(new e());
        }
    }

    public final void e1(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585dc8d0", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.p != null) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, " notifyVideoError called, errorCode=" + i + ", extra=" + i2);
        }
        try {
            H(null, i, i2);
        } catch (Throwable unused) {
        }
    }

    public void e2(boolean z) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f886473e", new Object[]{this, new Boolean(z)});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            try {
                ((TaobaoMediaPlayer) abstractMediaPlayer).updateMuteNodes(z);
            } catch (Throwable unused) {
                AVSDKLog.e(this.x1, "updateMuteNodes error.");
            }
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void f() {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        if (this.p != null) {
            AVSDKLog.e(this.x1, "close called.");
        }
        if (!this.F1) {
            this.F1 = true;
            this.O0 = true;
            this.R0 = true;
            K0();
            Handler handler = this.i0;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            if (this.Z) {
                t1();
                this.W = null;
                Handler handler2 = this.i0;
                if (handler2 != null) {
                    handler2.removeMessages(1);
                }
            }
            try {
                if (this.o0 != null && this.t0) {
                    this.t0 = false;
                    MediaContext mediaContext = this.p;
                    if (mediaContext != null) {
                        x3r.j(mediaContext.getContext()).k(this.p.mAudioFocusChangeListener);
                        this.p.mAudioFocusChangeListener = null;
                        this.m1++;
                    }
                }
            } catch (Throwable unused) {
            }
            rgi rgiVar = this.n;
            if (!(rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null)) {
                b2(abstractMediaPlayer);
            }
            this.G0 = null;
            if (!TextUtils.isEmpty(this.s0) && 1 == this.n.e) {
                U(true);
            }
            String str = this.n.f27360a;
            if (this.p.mMediaPlayContext.mTBLive) {
                wei.n().i(str, this);
            } else {
                pgi.n().i(str, this);
                if (this.p.mMediaPlayContext.mTBLive) {
                    wei.n().i(str, this);
                } else {
                    pgi.n().i(str, this);
                }
                this.p.mMediaPlayContext.resumeFrameLock();
            }
            this.n.b = 0;
            this.t = 0;
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void f0(String str) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a617f7", new Object[]{this, str});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
            if (((MonitorMediaPlayer) abstractMediaPlayer).getConfig() != null) {
                ((MonitorMediaPlayer) this.n.f).getConfig().C = str;
            }
            if (((MonitorMediaPlayer) this.n.f).getCloneConfig() != null) {
                ((MonitorMediaPlayer) this.n.f).getCloneConfig().C = str;
            }
        }
    }

    public final void f2() {
        rgi rgiVar;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb0f9d", new Object[]{this});
        } else if (Y0() && (rgiVar = this.n) != null) {
            int i2 = rgiVar.e;
            if (i2 == 1 || (this.D && i2 == 2)) {
                this.D = false;
                int currentPosition = getCurrentPosition();
                if (currentPosition >= 0) {
                    int k = k();
                    if (k > 0) {
                        i = r();
                    }
                    R(currentPosition, i, k);
                }
            }
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void g0(MediaAspectRatio mediaAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f4294", new Object[]{this, mediaAspectRatio});
        } else if (this.H != null && mediaAspectRatio != null) {
            int i = f.$SwitchMap$com$taobao$mediaplay$player$MediaAspectRatio[mediaAspectRatio.ordinal()];
            if (i == 1) {
                this.H.setAspectRatio(0);
                E1(0);
            } else if (i == 2) {
                this.H.setAspectRatio(1);
                E1(1);
            } else if (i == 3) {
                this.H.setAspectRatio(3);
                E1(3);
            }
        }
    }

    public void g1(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a117dde9", new Object[]{this, context});
            return;
        }
        this.m = context;
        this.l = context;
    }

    @Override // com.taobao.mediaplay.player.b, tb.rgi.a
    public int getCurrentPosition() {
        int i;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        rgi rgiVar = this.n;
        if (rgiVar == null || (i = rgiVar.e) == 8 || i == 6 || i == 3) {
            return this.e;
        }
        AbstractMediaPlayer abstractMediaPlayer = rgiVar.f;
        if (abstractMediaPlayer == null) {
            j = this.e;
        } else {
            j = abstractMediaPlayer.getCurrentPosition();
        }
        int i2 = (int) j;
        this.e = i2;
        return i2;
    }

    @Override // tb.rgi.a
    public int getDestoryState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d805014d", new Object[]{this})).intValue();
        }
        return 6;
    }

    @Override // tv.danmaku.ijk.media.player.InnerStartFuncListener
    public long getInnerStartTime() {
        InnerStartFuncListener innerStartFuncListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c800e8a", new Object[]{this})).longValue();
        }
        WeakReference<InnerStartFuncListener> weakReference = this.B0;
        if (weakReference == null) {
            innerStartFuncListener = null;
        } else {
            innerStartFuncListener = weakReference.get();
        }
        if (innerStartFuncListener != null) {
            return innerStartFuncListener.getInnerStartTime();
        }
        return 0L;
    }

    @Override // tb.nj9
    public long getStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
        }
        if (this.A0 == null || this.p == null) {
            if (this.p != null) {
                feh fehVar = this.x1;
                AVSDKLog.e(fehVar, "getStartTime from mStartTime=" + this.q0);
            }
            return this.q0;
        }
        feh fehVar2 = this.x1;
        AVSDKLog.e(fehVar2, "getStartTime from mFirstRenderAdapter time=" + this.A0.getStartTime());
        return this.A0.getStartTime();
    }

    public void h2(int i) {
        long j;
        int i2;
        String str;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dcf64ed", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.K1)) {
                this.K1 += "_";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(f7l.BRACKET_START_STR);
            if (this.r0 > 0) {
                j = System.currentTimeMillis() - this.r0;
            } else {
                j = -1;
            }
            sb.append(j);
            sb.append("#");
            if (this.p1 <= 0) {
                i3 = 0;
            }
            sb.append(i3);
            sb.append("#");
            if (TextUtils.isEmpty(this.g)) {
                i2 = -1;
            } else {
                i2 = this.g.indexOf(63);
            }
            if (i2 != -1) {
                str = this.g.substring(0, i2);
            } else {
                str = this.g;
            }
            sb.append(str);
            sb.append(f7l.BRACKET_END_STR);
            this.K1 += sb.toString();
        } catch (Throwable unused) {
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 0) {
            f2();
            if (!(v() == 3 || v() == 6 || v() == 6 || v() == 4 || (handler = this.i0) == null)) {
                handler.sendEmptyMessageDelayed(0, G1);
            }
        } else if (i == 1) {
            S0();
        }
        return false;
    }

    @Override // com.taobao.mediaplay.player.b
    public float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b371754", new Object[]{this})).floatValue();
        }
        return this.H.getDisplayAspectRatio();
    }

    @Override // com.taobao.mediaplay.player.b
    public void i0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c734b1", new Object[]{this, new Boolean(z)});
        } else {
            this.k0 = z;
        }
    }

    public final void i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d7907d", new Object[]{this});
        } else if (this.l != null && this.p0 == null) {
            this.p0 = new com.taobao.mediaplay.player.a(this, (Application) this.l.getApplicationContext());
        }
    }

    @Override // com.taobao.mediaplay.player.b, tb.rgi.a
    public boolean isPlaying() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        rgi rgiVar = this.n;
        AbstractMediaPlayer abstractMediaPlayer = rgiVar.f;
        if (abstractMediaPlayer == null || (i = rgiVar.e) == 0 || i == 8 || i == 3 || i == 6) {
            return false;
        }
        return abstractMediaPlayer.isPlaying();
    }

    @Override // tb.rgi.a
    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        Rect rect = new Rect();
        View view = this.y0;
        if (view == null) {
            return false;
        }
        if (view.getVisibility() == 0 || this.y0.getGlobalVisibleRect(rect)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.mediaplay.player.b
    public Bitmap j() {
        com.taobao.mediaplay.player.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        AVSDKLog.e(this.x1, "getCurrentFrame begin");
        if (!this.C0) {
            return null;
        }
        feh fehVar = this.x1;
        AVSDKLog.e(fehVar, "getCurrentFrame mEnableCapture mMediaPlayerRecycler=" + this.n + ", mRenderUIView=" + this.y0);
        rgi rgiVar = this.n;
        if (!(rgiVar == null || rgiVar.f == null || (cVar = this.H) == null || !cVar.isAvailable())) {
            View view = this.y0;
            if (view instanceof TextureView) {
                AVSDKLog.e(this.x1, "getCurrentFrame with TextureView");
                return ((TextureView) this.y0).getBitmap();
            } else if (this.v1 && (view instanceof SurfaceView)) {
                d2();
                if (this.w1[0] != null) {
                    feh fehVar2 = this.x1;
                    AVSDKLog.e(fehVar2, "getCurrentFrame success return bitmap=" + this.w1[0] + "by before getCurrentFrame");
                    return this.w1[0];
                }
            }
        }
        feh fehVar3 = this.x1;
        AVSDKLog.e(fehVar3, "getCurrentFrame failed with mMediaPlayerRecycler=" + this.n + ",renderView=" + this.H);
        return null;
    }

    @Override // com.taobao.mediaplay.player.b
    public void j0(String str) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1608c02e", new Object[]{this, str});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
            if (((MonitorMediaPlayer) abstractMediaPlayer).getConfig() != null) {
                ((MonitorMediaPlayer) this.n.f).getConfig().B = str;
            }
            if (((MonitorMediaPlayer) this.n.f).getCloneConfig() != null) {
                ((MonitorMediaPlayer) this.n.f).getCloneConfig().B = str;
            }
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public int k() {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        rgi rgiVar = this.n;
        int i = rgiVar.e;
        if ((i == 5 || i == 1 || i == 4 || i == 2) && (abstractMediaPlayer = rgiVar.f) != null) {
            this.F = (int) abstractMediaPlayer.getDuration();
        }
        return this.F;
    }

    @Override // com.taobao.mediaplay.player.b
    public void k0(String str) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b423788", new Object[]{this, str});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
            if (((MonitorMediaPlayer) abstractMediaPlayer).getConfig() != null) {
                ((MonitorMediaPlayer) this.n.f).getConfig().F = str;
            }
            if (((MonitorMediaPlayer) this.n.f).getCloneConfig() != null) {
                ((MonitorMediaPlayer) this.n.f).getCloneConfig().F = str;
            }
        }
    }

    public final void k1(AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5602ba16", new Object[]{this, abstractMediaPlayer});
        } else if (abstractMediaPlayer != null) {
            try {
                abstractMediaPlayer.release();
            } catch (Throwable unused) {
            }
        }
    }

    public final void l1(AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e788b980", new Object[]{this, abstractMediaPlayer});
        } else if (abstractMediaPlayer != null) {
            try {
                abstractMediaPlayer.stop();
                abstractMediaPlayer.release();
            } catch (Throwable th) {
                AVSDKLog.e(this.x1, th.getMessage());
            }
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public Map<String, String> m() {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        rgi rgiVar = this.n;
        if (rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null) {
            return null;
        }
        return abstractMediaPlayer.getQos();
    }

    @Override // com.taobao.mediaplay.player.b
    public void m0(float f2) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f2)});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
            abstractMediaPlayer.setPlayRate(f2);
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void n0(int i, float f2) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c3a069", new Object[]{this, new Integer(i), new Float(f2)});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null) {
            if (this.s == null) {
                this.s = new SparseArray<>();
            }
            this.s.put(i, Float.valueOf(f2));
        } else if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
            ((TaobaoMediaPlayer) abstractMediaPlayer)._setPropertyFloat(i, f2);
        }
    }

    public final void n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca38426e", new Object[]{this});
            return;
        }
        Handler handler = this.i0;
        if (handler != null) {
            handler.removeMessages(0);
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void o0(int i, long j) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5ff41b", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null) {
            if (this.r == null) {
                this.r = new SparseArray<>();
            }
            this.r.put(i, Long.valueOf(j));
        } else if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
            ((TaobaoMediaPlayer) abstractMediaPlayer)._setPropertyLong(i, j);
        }
    }

    public boolean o1(jsr jsrVar) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6285d7d", new Object[]{this, jsrVar})).booleanValue();
        }
        Map<TaobaoMediaPlayer, List<jsr>> map = this.l0;
        if (!(map == null || ((HashMap) map).size() == 0)) {
            rgi rgiVar = this.n;
            if (rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null) {
                for (Map.Entry entry : ((HashMap) this.l0).entrySet()) {
                    TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list != null && list.contains(jsrVar)) {
                        synchronized (this.n0) {
                            ((HashMap) this.m0).put(taobaoMediaPlayer, jsrVar);
                        }
                        list.remove(jsrVar);
                        if (list.size() == 0) {
                            ((HashMap) this.l0).remove(taobaoMediaPlayer);
                            taobaoMediaPlayer.disableOnRenderCallback();
                        } else {
                            ((HashMap) this.l0).put(taobaoMediaPlayer, list);
                        }
                        return true;
                    }
                }
            } else {
                TaobaoMediaPlayer taobaoMediaPlayer2 = (TaobaoMediaPlayer) abstractMediaPlayer;
                List list2 = (List) ((HashMap) this.l0).get(taobaoMediaPlayer2);
                if (list2 != null && list2.contains(jsrVar)) {
                    synchronized (this.n0) {
                        ((HashMap) this.m0).put(taobaoMediaPlayer2, jsrVar);
                    }
                    list2.remove(jsrVar);
                    if (list2.size() == 0) {
                        ((HashMap) this.l0).remove(taobaoMediaPlayer2);
                        taobaoMediaPlayer2.disableOnRenderCallback();
                    } else {
                        ((HashMap) this.l0).put(taobaoMediaPlayer2, list2);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f723554e", new Object[]{this, iMediaPlayer, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        rgi rgiVar;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
        } else if (!this.F1 && (rgiVar = this.n) != null && rgiVar.f != null) {
            int i2 = rgiVar.e;
            if (i2 == 1 || i2 == 4) {
                K0();
                pgi.n().j();
                long k = k();
                if (k >= 0) {
                    long k2 = k();
                    if (k2 > 0) {
                        i = r();
                    }
                    R((int) k, i, (int) k2);
                }
                G();
                n1();
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        boolean z;
        MediaLiveInfo mediaLiveInfo;
        int i;
        int i2;
        boolean z2;
        com.taobao.mediaplay.player.c cVar;
        com.taobao.mediaplay.player.c cVar2;
        long j4;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (MediaSystemUtils.isApkDebuggable() && j != 740) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, " onInfo >>> what: " + j + ", extra :" + j2);
        }
        if (3 == j) {
            if ((this.M0 || this.N0) && this.O0 && ((ArrayList) this.S0).size() > 0) {
                m1();
            }
            if (this.p1 == 0) {
                this.p1 = System.currentTimeMillis();
            }
            if (this.t1 && this.r1 > 0) {
                feh fehVar = this.x1;
                AVSDKLog.e(fehVar, "shengjian::mMaxRenderInterval4 before" + this.s1);
                this.s1 = Math.max(this.s1, System.currentTimeMillis() - this.r1);
                feh fehVar2 = this.x1;
                AVSDKLog.e(fehVar2, "shengjian::mMaxRenderInterval4 after" + this.s1);
                this.r1 = 0L;
                this.t1 = false;
            }
            if (this.v0) {
                return true;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("RENDER_START_TIME", Long.valueOf(this.q0));
            if (this.q0 != 0) {
                j4 = j2 > 0 ? j2 : System.currentTimeMillis();
                z3 = true;
            } else {
                z3 = true;
                j4 = 0;
            }
            this.v0 = z3;
            hashMap.put("RENDER_END_TIME", Long.valueOf(j4));
            I(iMediaPlayer, j, j2, j3, hashMap);
            feh fehVar3 = this.x1;
            AVSDKLog.e(fehVar3, "video_rendering_start firstframe " + this.j0 + ", " + this.Z0);
            F();
            return true;
        } else if (740 == j) {
            this.q1 = System.currentTimeMillis();
            F();
            return true;
        } else {
            if (711 == j && MediaSystemUtils.isApkDebuggable()) {
                feh fehVar4 = this.x1;
                AVSDKLog.e(fehVar4, "-->commitMediaPlayerRender open file time:" + j2 + " file_find_stream_info_time:" + j3);
            } else if (10001 == j) {
                int i3 = (int) j2;
                this.E = i3;
                com.taobao.mediaplay.player.c cVar3 = this.H;
                if (cVar3 != null) {
                    cVar3.setVideoRotation(i3);
                }
            } else if (715 == j) {
                this.q = (String) obj;
            } else if (10003 == j && v() == 1) {
                String str = this.n.f27360a;
                if (this.p.mMediaPlayContext.mTBLive) {
                    wei.n().i(str, this);
                } else {
                    pgi.n().i(str, this);
                }
                t0();
            } else if (723 == j) {
                int i4 = this.c0;
                if (i4 == 0) {
                    S0();
                } else {
                    this.i0.sendEmptyMessageDelayed(1, i4);
                }
                if (MediaSystemUtils.isApkDebuggable()) {
                    Context context = this.p.getContext();
                    Toast.makeText(context, "切成功流耗时" + j2 + " ms", 1).show();
                }
            } else {
                String str2 = "";
                Pair<String, String> pair = null;
                if (747 == j) {
                    if (MediaSystemUtils.isApkDebuggable()) {
                        Toast.makeText(this.p.getContext(), "切流超时失败", 1).show();
                    }
                    if (this.L0 && this.Z) {
                        ((TaobaoMediaPlayer) this.n.f).updateSeamlessSwitchStatus(2, str2 + (System.currentTimeMillis() - this.a0));
                        this.Z = false;
                        this.a0 = 0L;
                        this.b0 = false;
                        this.X = false;
                        if (!TextUtils.isEmpty(this.I0)) {
                            c1("-1", this.I0, this.p.mMediaPlayContext.mSeamlessSwitchingSelectName, "{\"msg\":\"rtc switch fail\", \"error\":-4}");
                            this.I0 = null;
                            this.p.mMediaPlayContext.mSwitchingPlayerQualityItem = null;
                        }
                        this.p.mMediaPlayContext.mSeamlessSwitchingSelectName = null;
                    }
                } else if (724 == j) {
                    if (MediaSystemUtils.isApkDebuggable()) {
                        Toast.makeText(this.p.getContext(), "切流超时失败", 1).show();
                    }
                    if (!(this.H == null || (cVar2 = this.W) == null)) {
                        cVar2.getView().setVisibility(4);
                        com.taobao.mediaplay.player.c cVar4 = this.W;
                        if (cVar4 instanceof MediaTextureView) {
                            ((ViewGroup) ((MediaTextureView) cVar4).getParent()).removeView(this.W.getView());
                        } else if (cVar4 instanceof MediaSurfaceView) {
                            ((ViewGroup) ((MediaSurfaceView) cVar4).getParent()).removeView(this.W.getView());
                        }
                        this.W = null;
                        this.d0 = null;
                    }
                    ((TaobaoMediaPlayer) this.n.f).updateSeamlessSwitchStatus(2, str2 + (System.currentTimeMillis() - this.a0));
                    this.p.mMediaPlayContext.mSeamlessSwitchingSelectName = null;
                    this.Z = false;
                    this.a0 = 0L;
                    this.b0 = false;
                    this.X = false;
                    if (!TextUtils.isEmpty(this.I0)) {
                        c1("-1", this.I0, this.p.mMediaPlayContext.mSeamlessSwitchingSelectName, "{\"msg\":\"error when switch fail\", \"error\":-4}");
                        this.I0 = null;
                        this.p.mMediaPlayContext.mSwitchingPlayerQualityItem = null;
                    }
                } else if (j == 727) {
                    if (this.Z) {
                        this.e0 = (int) j2;
                        this.f0 = (int) j3;
                    }
                } else if (j == 728) {
                    if (this.Z && (cVar = this.W) != null) {
                        cVar.setVideoRotation((int) j2);
                    }
                } else if (j == 729) {
                    if (this.Z) {
                        this.g0 = (int) j2;
                        this.h0 = (int) j3;
                        r1();
                    }
                } else if (TextUtils.isEmpty(this.g) || (!((i2 = this.p.mScenarioType) == 0 || i2 == 1) || this.g.contains(".m3u8") || this.g.contains(gov.SUFFIX_MP4) || (!(10004 == j || 10009 == j) || (!(v() == 1 || v() == 8 || v() == 5) || MediaAdapteManager.mConfigAdapter == null || !(z2 = this.p.mMediaPlayContext.mTBLive))))) {
                    if (!TextUtils.isEmpty(this.g) && (((i = this.p.mScenarioType) == 0 || i == 1) && ((10005 == j || 10006 == j) && ((v() == 1 || v() == 8 || v() == 5) && this.p.mMediaPlayContext.mTBLive)))) {
                        wei.n().i(this.n.f27360a, this);
                        AVSDKLog.e(this.x1, "degradeEGLRender.");
                        t0();
                    } else if (12110 == j) {
                        String str3 = (String) obj;
                        boolean z4 = (!MediaConstant.DEFINITION_UD.equals(str3) && !MediaConstant.DEFINITION_UD_60.equals(str3)) || (this.M && !this.U);
                        boolean w0 = w0(str3);
                        if (!TextUtils.isEmpty(str3) && z4 && (mediaLiveInfo = this.p.mMediaPlayContext.mMediaLiveInfo) != null && mediaLiveInfo.liveUrlList != null) {
                            if (iMediaPlayer != null && (iMediaPlayer instanceof TaobaoMediaPlayer)) {
                                str2 = ((TaobaoMediaPlayer) iMediaPlayer).getPlayingLiveDefinition();
                            }
                            HashMap hashMap2 = new HashMap();
                            for (int i5 = 0; i5 < mediaLiveInfo.liveUrlList.size(); i5++) {
                                QualityLiveItem qualityLiveItem = mediaLiveInfo.liveUrlList.get(i5);
                                if (str3.equals(qualityLiveItem.newDefinition)) {
                                    hashMap2.put("recomDefinition", str3);
                                    hashMap2.put("recomDefinitionName", qualityLiveItem.newName);
                                }
                                if (!TextUtils.isEmpty(str2) && str2.equals(qualityLiveItem.newDefinition) && !this.V) {
                                    hashMap2.put("currentDefinition", str2);
                                    hashMap2.put("currentDefinitionName", qualityLiveItem.newName);
                                }
                            }
                            if (hashMap2.containsKey("recomDefinition")) {
                                feh fehVar5 = this.x1;
                                AVSDKLog.e(fehVar5, "SwitchLiveLevel currentDefinition=" + str2 + ", recomDefinition=" + str3 + ", rtcAutoSwitch:" + this.L + ", reason:" + j2);
                                boolean z5 = this.K && this.L;
                                if (iMediaPlayer != null && (iMediaPlayer instanceof TaobaoMediaPlayer)) {
                                    ((TaobaoMediaPlayer) iMediaPlayer).updateAbrRequestSwitchCount(w0, z5);
                                }
                                if (z5 && iMediaPlayer != null && (iMediaPlayer instanceof TaobaoMediaPlayer)) {
                                    ((TaobaoMediaPlayer) iMediaPlayer).monitorRtcLiveAbrReason((int) j2);
                                }
                                if (z5) {
                                    hashMap2.put("reasonCode", String.valueOf(j2));
                                    I(iMediaPlayer, 12003L, w0 ? 1L : -1L, 0L, hashMap2);
                                    Z1(1, str3);
                                    return true;
                                }
                                I(iMediaPlayer, 12001L, w0 ? 1L : -1L, 0L, hashMap2);
                            }
                        }
                        return true;
                    } else {
                        z = true;
                        if (j == 12002) {
                            if (iMediaPlayer == null || !(iMediaPlayer instanceof TaobaoMediaPlayer)) {
                                return true;
                            }
                            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) iMediaPlayer;
                            int i6 = (int) j2;
                            int i7 = -1;
                            if (i6 == 1 || i6 == -1) {
                                if (this.F0) {
                                    long vPMSessioinId = taobaoMediaPlayer.getVPMSessioinId();
                                    if (vPMSessioinId > 0) {
                                        HashMap<String, String> hAMetrics = VPMManagerInstance.getInstance().getHAMetrics(vPMSessioinId, "RefNetSpeed");
                                        int min = hAMetrics.containsKey("last_media_speed_mean") ? (int) Math.min(ew0.t(hAMetrics.get("last_media_speed_mean")) * 8.0f, 2147483647L) : -1;
                                        if (hAMetrics.containsKey("last_media_speed_max")) {
                                            i7 = (int) Math.min(ew0.t(hAMetrics.get("last_media_speed_max")) * 8.0f, 2147483647L);
                                        }
                                        if (min > 0 && i7 > 0) {
                                            pair = this.p.mMediaPlayContext.getNewDefintionByNetSpeed(i6, min, i7);
                                        }
                                    }
                                } else {
                                    pair = this.p.mMediaPlayContext.getNewDefintionByIndex(i6);
                                }
                                if (pair == null) {
                                    AVSDKLog.e(this.x1, "SwitchLiveLevel can't find switch level.");
                                    return true;
                                }
                                taobaoMediaPlayer.useAdaptiveLiveDeciseResult();
                                if (this.M || MediaConstant.DEFINITION_HD.equals(pair.first) || MediaConstant.DEFINITION_HD_60.equals(pair.first)) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("recomDefinition", pair.first);
                                    hashMap3.put("recomDefinitionName", pair.second);
                                    feh fehVar6 = this.x1;
                                    AVSDKLog.e(fehVar6, "SwtichLiveLevel switchLevel=" + i6 + ", eventObject=" + hashMap3);
                                    I(iMediaPlayer, 12001L, (long) i6, 0L, hashMap3);
                                }
                            }
                            return true;
                        }
                        I(iMediaPlayer, j, j2, j3, obj);
                        return z;
                    }
                } else if (z2) {
                    wei.n().i(this.n.f27360a, this);
                    ja1.f = false;
                    this.p.mMediaPlayContext.setHardwareHevc(false);
                    this.p.mMediaPlayContext.setHardwareAvc(false);
                    AVSDKLog.e(this.x1, " degrade to Software because MEDIA_INFO_VIDEO_MEDIACODEC_DECODE_ERROR");
                    this.D1 = this.n.i;
                    t0();
                }
            }
            z = true;
            I(iMediaPlayer, j, j2, j3, obj);
            return z;
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnLoopCompletionListener
    public void onLoopCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce872948", new Object[]{this, iMediaPlayer});
        } else {
            J();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVFPluginListener
    public void onRenderFinish(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f3c571", new Object[]{this, iMediaPlayer});
            return;
        }
        synchronized (this.n0) {
            try {
                jsr jsrVar = (jsr) ((HashMap) this.m0).get(iMediaPlayer);
                if (jsrVar == null) {
                    List<jsr> R0 = R0(iMediaPlayer);
                    if (R0 != null) {
                        for (jsr jsrVar2 : R0) {
                            jsrVar2.a();
                        }
                    }
                } else {
                    jsrVar.a();
                    ((HashMap) this.m0).remove(iMediaPlayer);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVFPluginListener
    public int onRenderOes(IMediaPlayer iMediaPlayer, int i, int i2, int i3, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f244b50", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2), new Integer(i3), fArr})).intValue();
        }
        List<jsr> R0 = R0(iMediaPlayer);
        if (R0 == null) {
            return -1;
        }
        t7w t7wVar = new t7w(4, i2, i3);
        t7wVar.a(i);
        t7wVar.b(fArr);
        for (jsr jsrVar : R0) {
            jsrVar.b(t7wVar);
        }
        return -1;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVFPluginListener
    public int onRenderYUV(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6efa8548", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue();
        }
        List<jsr> R0 = R0(iMediaPlayer);
        if (R0 == null) {
            return -1;
        }
        t7w t7wVar = new t7w(3, i4, i5);
        t7wVar.c(i, i2, i3);
        for (jsr jsrVar : R0) {
            jsrVar.b(t7wVar);
        }
        return -1;
    }

    @Override // com.taobao.mediaplay.player.c.a
    public void onWindowVisibilityChanged(int i) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            String str = "0";
            if (this.p != null) {
                AVSDKLog.e(this.x1, "onWindowVisibilityChanged visibility=".concat(i == 0 ? "1" : str));
            }
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this.n.f;
            HashMap hashMap = new HashMap();
            String str2 = MediaConstant.CMD_SET_VIEW_VISIBLE;
            if (i == 0) {
                str = "1";
            }
            hashMap.put(str2, str);
            taobaoMediaPlayer.callWithMsg(hashMap);
        }
    }

    public final void p1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76f36e62", new Object[]{this, str});
            return;
        }
        try {
            if (this.n.i != 0.0f && this.o0 != null) {
                String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_LONG_AUDIO_FOCUS_SBT, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
                String str2 = this.p.mMediaPlayContext.mFrom;
                if (!TextUtils.isEmpty(config)) {
                    if (!TextUtils.isEmpty(str2)) {
                        if (!ew0.n(str2, config)) {
                        }
                        AVSDKLog.e(this.x1, str + ", sbt=" + str2 + " only request short AudioFocus with mVolume: " + this.n.i);
                        x3r.j(this.p.getContext()).h(this.p.mAudioFocusChangeListener, 2);
                        this.l1++;
                        this.t0 = true;
                    }
                }
                if (!this.p.mMediaPlayContext.mRequestShortAudioFocus) {
                    AVSDKLog.e(this.x1, str + ", sbt=" + str2 + " request long AudioFocus with mVolume: " + this.n.i);
                    x3r.j(this.p.getContext()).h(this.p.mAudioFocusChangeListener, 1);
                    this.k1 = true;
                    this.l1++;
                    this.t0 = true;
                }
                AVSDKLog.e(this.x1, str + ", sbt=" + str2 + " only request short AudioFocus with mVolume: " + this.n.i);
                x3r.j(this.p.getContext()).h(this.p.mAudioFocusChangeListener, 2);
                this.l1++;
                this.t0 = true;
            }
        } catch (Throwable th) {
            AVSDKLog.e(this.x1, str + " RequestAudioFocus error" + th.getMessage());
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void q0(TaoLiveVideoView.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b06e5b", new Object[]{this, pVar});
        } else {
            this.z0 = pVar;
        }
    }

    public final void q1(IMediaPlayer iMediaPlayer) {
        com.taobao.mediaplay.player.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491db11f", new Object[]{this, iMediaPlayer});
            return;
        }
        this.f11026a = iMediaPlayer.getVideoWidth();
        int videoHeight = iMediaPlayer.getVideoHeight();
        this.b = videoHeight;
        if (this.f11026a > 0 && videoHeight > 0) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "SeamlessSwitch set renderView w=" + this.f11026a + ", h=" + this.b);
            if (this.H != null) {
                feh fehVar2 = this.x1;
                AVSDKLog.e(fehVar2, "SeamlessSwitch set mRenderView renderView w=" + this.f11026a + ", h=" + this.b);
                this.H.setVideoSize(this.f11026a, this.b);
            }
            int videoSarNum = iMediaPlayer.getVideoSarNum();
            int videoSarDen = iMediaPlayer.getVideoSarDen();
            if (videoSarNum > 0 && videoSarDen > 0 && (cVar = this.H) != null) {
                cVar.setVideoSampleAspectRatio(videoSarNum, videoSarDen);
            }
            com.taobao.mediaplay.player.c cVar2 = this.H;
            if (cVar2 != null) {
                cVar2.requestLayout();
            }
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public int r() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62eff19a", new Object[]{this})).intValue();
        }
        rgi rgiVar = this.n;
        if (!(rgiVar == null || rgiVar.f == null || (i = rgiVar.e) == 8 || i == 6 || i == 3 || k() <= 0)) {
            this.D0 = (int) (((this.n.f.getCurCachePosition() * 1000.0f) * 100.0f) / k());
        }
        return this.D0;
    }

    @Override // com.taobao.mediaplay.player.b
    public void r0(String str) {
        int i;
        rgi rgiVar;
        MediaContext mediaContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f405b10f", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (!this.F1 || TextUtils.isEmpty(this.g) || this.g.equals(str) || this.s0 == null || (rgiVar = this.n) == null || rgiVar.f == null) {
                this.g = str;
                if (this.u1) {
                    this.u1 = false;
                    return;
                }
                rgi rgiVar2 = this.n;
                if ((rgiVar2 != null && z(rgiVar2.e) && !this.F1 && (((i = this.t) == 1 || i == 8) && !TextUtils.isEmpty(this.g) && !this.n.d)) || (this.P0 && this.z)) {
                    if (this.t == 1 || (this.P0 && this.z)) {
                        t0();
                    } else if (this.p.getPrepareToFirstFrame()) {
                        W();
                    } else {
                        D0();
                    }
                }
            } else {
                this.g = str;
                this.s0 = null;
                this.G = false;
                this.E = 0;
                this.u0 = false;
                this.v0 = false;
                MediaContext mediaContext2 = this.p;
                mediaContext2.mMediaPlayContext.mSeekWhenPrepared = 0;
                mediaContext2.setPrepareToFirstFrame(false);
                this.p.genPlayToken(true);
                MediaContext mediaContext3 = this.p;
                String str2 = mediaContext3.mPlayToken;
                if (!mediaContext3.mMediaPlayContext.mTBLive) {
                    this.n = pgi.n().f(str2, this);
                } else if ((ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, "false")) || ja1.C0) && (mediaContext = this.p) != null && mediaContext.getWarmupFlag() && oxw.n().a(str2)) {
                    this.n = oxw.n().f(str2, this);
                } else {
                    this.n = wei.n().f(str2, this);
                }
            }
        }
    }

    public final void r1() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa35fad", new Object[]{this});
        } else if (this.e0 > 0 && this.f0 > 0 && this.W != null && this.p != null) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "SeamlessSwitch requestVideoLayoutForSwitchSurface set mChangeStreamRenderView renderView w=" + this.e0 + ", h=" + this.f0);
            this.W.setVideoSize(this.e0, this.f0);
            int i2 = this.g0;
            if (i2 > 0 && (i = this.h0) > 0) {
                this.W.setVideoSampleAspectRatio(i2, i);
            }
            this.W.requestLayout();
        }
    }

    public final void t1() {
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919a7cb8", new Object[]{this});
            return;
        }
        MediaContext mediaContext = this.p;
        if (!(mediaContext == null || (mediaPlayControlContext = mediaContext.mMediaPlayContext) == null)) {
            mediaPlayControlContext.mSelectedUrlName = mediaPlayControlContext.mSeamlessSwitchingSelectName;
            String str = mediaPlayControlContext.mSeamlessSwitchingVideoPath;
            this.g = str;
            mediaPlayControlContext.mSeamlessSwitchingSelectName = null;
            mediaPlayControlContext.setVideoUrl(str);
        }
        this.Z = false;
        this.a0 = 0L;
        this.b0 = false;
        this.X = false;
    }

    @Override // com.taobao.mediaplay.player.b
    public float u() {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f9486ab", new Object[]{this})).floatValue();
        }
        rgi rgiVar = this.n;
        if (rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null) {
            return this.f;
        }
        float videoRenderPts = abstractMediaPlayer.getVideoRenderPts();
        this.f = videoRenderPts;
        return videoRenderPts;
    }

    public void u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5ca86b8", new Object[]{this});
        } else {
            this.g = "";
        }
    }

    public void v1() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caef570", new Object[]{this});
            return;
        }
        rgi rgiVar = this.n;
        rgiVar.j = true;
        int i2 = rgiVar.c;
        if (i2 != 2) {
            i = i2;
        }
        rgiVar.c = i;
    }

    public boolean w1() {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bbad7ba", new Object[]{this})).booleanValue();
        }
        rgi rgiVar = this.n;
        if (!(rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null)) {
            int i = rgiVar.c;
            if (i == 2) {
                A1(abstractMediaPlayer, rgiVar.b);
                return true;
            } else if (i == 4) {
                A1(abstractMediaPlayer, rgiVar.b);
                return true;
            } else if (i == 1) {
                A1(abstractMediaPlayer, rgiVar.b);
                this.n.f.start();
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.mediaplay.player.b
    public View x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.H.getView();
    }

    public void x1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c8f62a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.g = str;
            rgi rgiVar = this.n;
            rgiVar.e = 1;
            AbstractMediaPlayer abstractMediaPlayer = rgiVar.f;
            if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
                ((TaobaoMediaPlayer) abstractMediaPlayer).switchStreamSeamless(str);
            }
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    public void z1(AbstractMediaPlayer abstractMediaPlayer, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17ad09f4", new Object[]{this, abstractMediaPlayer, new Long(j)});
        } else if (abstractMediaPlayer != null) {
            abstractMediaPlayer.seekTo(j);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AbstractMediaPlayer f11032a;

        static {
            t2o.a(774897812);
        }

        private h() {
            this.f11032a = d.this.n.f;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AbstractMediaPlayer abstractMediaPlayer = this.f11032a;
            if (abstractMediaPlayer != null) {
                d.y0(d.this, abstractMediaPlayer);
            }
        }

        public /* synthetic */ h(d dVar, a aVar) {
            this();
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09ecf87", new Object[]{this});
            return;
        }
        hsc hscVar = this.j0;
        if (hscVar != null && this.Z0 && this.v0) {
            if (!this.z1 || !(this.y0 instanceof SurfaceView)) {
                ((sdi.g) hscVar).a(this, true);
                if (!this.w0) {
                    this.o1 = System.currentTimeMillis();
                    if (this.p != null) {
                        feh fehVar = this.x1;
                        AVSDKLog.e(fehVar, "notifySurfaceTextureUpdate with surfaceView and mFirstFrameUpdateTs=" + System.currentTimeMillis());
                    }
                    I1(this.o1);
                    this.w0 = true;
                    I(null, 12101L, this.o1, 0L, null);
                    return;
                }
                return;
            }
            ((sdi.g) hscVar).a(this, this.y1);
            if (this.y1 && !this.w0) {
                this.o1 = System.currentTimeMillis();
                if (this.p != null) {
                    feh fehVar2 = this.x1;
                    AVSDKLog.e(fehVar2, "notifySurfaceTextureUpdate with surfaceView and mFirstFrameUpdateTs=" + System.currentTimeMillis());
                }
                I1(this.o1);
                this.w0 = true;
                I(null, 12101L, this.o1, 0L, null);
            }
        }
    }

    public void Y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6621cb5d", new Object[]{this});
        } else if (this.Z) {
            AVSDKLog.e(this.x1, "stopSwitch.");
            this.b0 = true;
            this.i0.removeMessages(1);
            if (MediaSystemUtils.isApkDebuggable()) {
                Toast.makeText(this.p.getContext(), "切流停止", 1).show();
            }
            AbstractMediaPlayer abstractMediaPlayer = this.n.f;
            if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
                ((TaobaoMediaPlayer) abstractMediaPlayer).stopSwitch();
            }
        }
    }

    @Override // com.taobao.mediaplay.player.c.a
    public void b(c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747ddf29", new Object[]{this, bVar});
            return;
        }
        if (this.v0 && !this.w0) {
            this.o1 = System.currentTimeMillis();
            if (this.p != null) {
                feh fehVar = this.x1;
                AVSDKLog.e(fehVar, "onSurfaceUpdate and mFirstFrameUpdateTs=" + System.currentTimeMillis());
            }
            I1(this.o1);
            this.w0 = true;
            I(null, 12101L, this.o1, 0L, null);
        }
        hsc hscVar = this.j0;
        if (hscVar != null) {
            ((sdi.g) hscVar).a(this, true);
        }
    }

    public final void m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d09e45", new Object[]{this});
            return;
        }
        while (((ArrayList) this.S0).size() > 0) {
            View view = (View) ((ArrayList) this.S0).get(0);
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "removeOldView:" + view);
            if (view != null) {
                if (this.Z0) {
                    ((ViewGroup) ((MediaSurfaceView) this.H).getParent()).removeView(view);
                } else {
                    ((ViewGroup) ((MediaTextureView) this.H).getParent()).removeView(view);
                }
            }
            ((ArrayList) this.S0).remove(0);
        }
        com.taobao.mediaplay.player.c cVar = this.H;
        if (cVar != null) {
            cVar.setAspectRatio(this.T0);
            E1(this.T0);
        }
        this.O0 = false;
        this.Q0 = false;
    }

    @Override // com.taobao.mediaplay.player.c.a
    public void onDetachedFromWindow() {
        rgi rgiVar;
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        if (this.p != null) {
            AVSDKLog.e(this.x1, "onDetachedFromWindow");
        }
        this.e1 = false;
        if (this.h1 && (rgiVar = this.n) != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) abstractMediaPlayer).setShowViewParent(null);
        }
        View view = this.y0;
        if ((view instanceof SurfaceView) && ((MediaSurfaceView) view).getSurfaceDestroyed()) {
            ((MediaSurfaceView) this.y0).releaseSurfaceControl();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2aeaa0", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (this.p != null) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "onVideoSizeChanged##Video width:" + i + ", height:" + i2);
        }
        q1(iMediaPlayer);
        I(null, 302L, i, i2, null);
        MediaContext mediaContext = this.p;
        if (mediaContext.mEnableNewTBPlayer && i > i2 && mediaContext.getVideoAspectRatio() == MediaAspectRatio.DW_CENTER_CROP) {
            AVSDKLog.e(this.x1, "TBPlayer auto set DW_FIT_CENTER for width>height when onVideoSizeChanged and mode=DW_CENTER_CROP");
            g0(MediaAspectRatio.DW_FIT_CENTER);
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void s0(float f2) {
        int i;
        AbstractMediaPlayer abstractMediaPlayer;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f2)});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar.i != f2) {
            rgiVar.i = f2;
            if (f2 != 0.0f) {
                try {
                    if (this.o0 != null && (i = rgiVar.e) != 0 && !this.t0 && i == 1) {
                        p1(CommandID.setVolume);
                    }
                } catch (Throwable th) {
                    if (this.p != null) {
                        feh fehVar = this.x1;
                        AVSDKLog.e(fehVar, "setVolume##RequestAudioFocus error" + th.getMessage());
                    }
                }
            }
            rgi rgiVar2 = this.n;
            if (rgiVar2 != null && (abstractMediaPlayer = rgiVar2.f) != null && (i2 = rgiVar2.e) != 6 && i2 != 3) {
                try {
                    abstractMediaPlayer.setVolume(f2, f2);
                } catch (Throwable th2) {
                    if (this.p != null) {
                        feh fehVar2 = this.x1;
                        AVSDKLog.e(fehVar2, "setVolume##SetVolume error" + th2.getMessage());
                    }
                }
            }
        }
    }

    public void s1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa241a5a", new Object[]{this});
            return;
        }
        this.w0 = false;
        if (this.p != null) {
            AVSDKLog.e(this.x1, "reset mSetFirstSurfaceUpdate");
        }
    }

    public boolean J0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b9fa1ed", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        MediaPlayControlContext mediaPlayControlContext = this.p.mMediaPlayContext;
        QualityLiveItem qualityLiveItem = mediaPlayControlContext.mQualityLiveItem;
        if (qualityLiveItem == null || mediaPlayControlContext.mSelectedUrlName == null || this.Z) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "canSwitchStream " + z + ", failed for " + this.p.mMediaPlayContext.mQualityLiveItem + ", mSwitchStreaming=" + this.Z);
            return false;
        }
        if (z) {
            String str = qualityLiveItem.liveUrlMiniBfrtc;
            feh fehVar2 = this.x1;
            AVSDKLog.e(fehVar2, "canSwitchStream " + z + ", check for " + this.p.mMediaPlayContext.mSelectedUrlName + ", miniBfrtcUrl=" + str);
            if ((MediaConstant.RTCLIVE_URL_NAME.equals(this.p.mMediaPlayContext.mSelectedUrlName) || MediaConstant.BFRTC_URL_NAME.equals(this.p.mMediaPlayContext.mSelectedUrlName)) && !TextUtils.isEmpty(str)) {
                return true;
            }
        } else {
            String str2 = qualityLiveItem.rtcLiveUrl;
            String str3 = qualityLiveItem.bfrtcUrl;
            feh fehVar3 = this.x1;
            AVSDKLog.e(fehVar3, "canSwitchStream " + z + ", check for " + this.p.mMediaPlayContext.mSelectedUrlName + ", rtcLiveUrl=" + str2 + ", bfrtcUrl=" + str3);
            if (MediaConstant.MINI_BFRTC_URL_NAME.equals(this.p.mMediaPlayContext.mSelectedUrlName) && (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3))) {
                return true;
            }
        }
        return false;
    }

    public boolean N0(AbstractMediaPlayer abstractMediaPlayer, int i, int i2, int i3, int i4) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a513a661", new Object[]{this, abstractMediaPlayer, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).booleanValue();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (abstractMediaPlayer != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
                z = true;
            }
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "createAlphaImageIfNeeded start width=" + i + ", height=" + i2 + ", roundWidth=" + i3 + ", roundHeight=" + i4 + ", mHasSetAlphaBitmap=" + this.X0 + ", mEnableAlphaBitmap=" + this.W0 + ", hasTaobaoPlayer=" + z);
            if (this.W0 && this.V0 == null && i > 0 && i2 > 0 && z) {
                AVSDKLog.e(this.x1, "start createBitmap");
                this.V0 = L0(i, i2, i3, i4);
                AVSDKLog.e(this.x1, "finish createBitmap");
            }
            if (this.V0 != null && z && !this.X0) {
                Bitmap L0 = L0(i, i2, i3, i4);
                this.V0 = L0;
                ((TaobaoMediaPlayer) abstractMediaPlayer).setAlphaBitmap(L0);
                this.X0 = true;
            }
            feh fehVar2 = this.x1;
            AVSDKLog.e(fehVar2, "finish createAlphaImageIfNeeded mAlphaBitmap=" + this.V0 + ", time=" + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable unused) {
            AVSDKLog.e(this.x1, "createAlphaImageIfNeeded exception");
        }
        return true;
    }

    public final void P1(AbstractMediaPlayer abstractMediaPlayer, r7t r7tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb8e3aa", new Object[]{this, abstractMediaPlayer, r7tVar});
        } else if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) abstractMediaPlayer;
            if (taobaoMediaPlayer.isRtcUrl(t())) {
                this.O = ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "GrtnRtcLiveAdaptionEnable", "true"));
                this.U = ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "GrtnRtcLiveAdaptionSwitchUdDisable", "false"));
                this.V = ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "RtcLiveAdaptionNotifyCurDefinitionDisable", "false"));
                this.K = ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "RtcLiveDefinitionAutoSwitchEnable", "true"));
                this.J = ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "RtcLiveAbrSwitchingProcessEnable", "true"));
                boolean isLowPerformance = this.p.mMediaPlayContext.isLowPerformance();
                this.M = !isLowPerformance;
                if (isLowPerformance && ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "RtcLiveBandwidthProbeForLowDeviceDisable", "true"))) {
                    taobaoMediaPlayer._setOption(1, "artp_bandwidth_probe_disable", 1L);
                }
                String lowSpeedArtpCommonParamsJson = this.p.mMediaPlayContext.getLowSpeedArtpCommonParamsJson();
                if (!TextUtils.isEmpty(lowSpeedArtpCommonParamsJson)) {
                    taobaoMediaPlayer._setOption(1, "artp_weak_net_common_params", lowSpeedArtpCommonParamsJson);
                }
                taobaoMediaPlayer._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_WEAK_NET_FLAG_LIFE_TIME, this.p.mMediaPlayContext.mPlayerCoreWeakNetFlagLifeTime);
                ja1.c0(this.p.mMediaPlayContext.mContext);
                this.O = this.O && ja1.mUseRtcAbr.get();
                this.Q = ja1.mUseRtcAbrId.get();
                this.R = ja1.mRtcAdaptionParamJson.get();
                this.S = ja1.mRtcSwitchParamJson.get();
                this.P = ja1.mRtcAbrDynamicEnable.get();
                if (this.K) {
                    this.K = ja1.mRtcAdaptionAutoSwitch.get();
                }
                if (isLowPerformance) {
                    this.M = ja1.mEnableLowDeviceSwitchUd.get();
                }
                ja1.b0();
                this.T = ja1.mBufferStorageParamJson.get();
                if (!this.N) {
                    taobaoMediaPlayer._setPropertyLong(80002, 0L);
                }
                new HashMap();
                StringBuilder sb = new StringBuilder("en_rtc_switch=");
                sb.append(this.N ? 1 : 0);
                sb.append(",adaption_abtest_id=");
                sb.append(this.Q);
                sb.append(",en_rtc_abr=");
                sb.append((!this.N || !this.O) ? 0 : 1);
                taobaoMediaPlayer.setDynamicPlayExParam(sb.toString());
                if (this.N) {
                    taobaoMediaPlayer.setEnableRtcSwitch(true);
                    this.Y = false;
                    this.c0 = 0;
                    if (this.O && r7tVar.E0) {
                        MediaPlayControlContext mediaPlayControlContext = this.p.mMediaPlayContext;
                        taobaoMediaPlayer._setOption(1, "artp_play_start_stream_json", mediaPlayControlContext.getRtcSwitchLiveInfo(mediaPlayControlContext.mMediaLiveInfo));
                    }
                    if (this.O && this.K) {
                        taobaoMediaPlayer.setLiveDefinitionAutoSwitch(this.p.mMediaPlayContext.isLiveDefinitionAutoSwitch());
                    }
                    if (this.O && !TextUtils.isEmpty(this.R)) {
                        taobaoMediaPlayer._setOption(1, "artp_adaption_param_json", this.R);
                    }
                    if (!TextUtils.isEmpty(this.S)) {
                        taobaoMediaPlayer._setOption(1, "artp_switch_param_json", this.S);
                    }
                    if (!TextUtils.isEmpty(this.T)) {
                        taobaoMediaPlayer._setOption(1, "artp_buffer_storage_json", this.T);
                    }
                }
            }
        }
    }

    public final void S0() {
        com.taobao.mediaplay.player.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8277ad3", new Object[]{this});
            return;
        }
        this.f11026a = this.e0;
        this.b = this.f0;
        this.J0 = this.I0;
        if (this.Y && (cVar = this.H) != null && (cVar instanceof MediaTextureView) && this.W != null) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "SeamlessSwitch change to sub stream view visibility=" + this.W.getView().getVisibility());
            this.H.getView().setVisibility(4);
            com.taobao.mediaplay.player.c cVar2 = this.H;
            if (cVar2 instanceof MediaTextureView) {
                ((ViewGroup) ((MediaTextureView) cVar2).getParent()).removeView(this.H.getView());
            } else if (cVar2 instanceof MediaSurfaceView) {
                ((ViewGroup) ((MediaSurfaceView) cVar2).getParent()).removeView(this.H.getView());
            }
            com.taobao.mediaplay.player.c cVar3 = this.W;
            this.H = cVar3;
            cVar3.setBackground(false);
            this.W = null;
            this.k = this.d0;
        }
        AbstractMediaPlayer abstractMediaPlayer = this.n.f;
        if (abstractMediaPlayer != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) abstractMediaPlayer).setPlayingLiveDefinition(this.I0);
        }
        if (!TextUtils.isEmpty(this.I0)) {
            MediaPlayControlContext mediaPlayControlContext = this.p.mMediaPlayContext;
            PlayerQualityItem playerQualityItem = mediaPlayControlContext.mSwitchingPlayerQualityItem;
            mediaPlayControlContext.mPlayerQualityItem = playerQualityItem;
            feh fehVar2 = this.x1;
            AVSDKLog.e(fehVar2, " handleSwitchStreamSuccInfo name=" + playerQualityItem.name + ",  newName=" + playerQualityItem.newName + " ,definition=" + playerQualityItem.definition + " ,newDefinition=" + playerQualityItem.newDefinition);
            MediaPlayControlContext mediaPlayControlContext2 = this.p.mMediaPlayContext;
            mediaPlayControlContext2.mSwitchingPlayerQualityItem = null;
            c1("0", this.I0, mediaPlayControlContext2.mSeamlessSwitchingSelectName, "{\"msg\":\"success\"}");
            this.I0 = null;
        }
        AbstractMediaPlayer abstractMediaPlayer2 = this.n.f;
        if (abstractMediaPlayer2 != null && (abstractMediaPlayer2 instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) abstractMediaPlayer2).updateSeamlessSwitchStatus(1, "" + (System.currentTimeMillis() - this.a0));
        }
        t1();
    }

    public final boolean T1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d45a2b5", new Object[]{this, str})).booleanValue();
        }
        if (this.p.mMediaPlayContext.mQualityLiveItem == null) {
            return false;
        }
        if (MediaConstant.MINI_BFRTC_URL_NAME.equals(str)) {
            MediaPlayControlContext mediaPlayControlContext = this.p.mMediaPlayContext;
            QualityLiveItem qualityLiveItem = mediaPlayControlContext.mQualityLiveItem;
            String str2 = qualityLiveItem.rtcLiveUrl;
            if (str2 != null) {
                mediaPlayControlContext.mSeamlessSwitchingSelectName = MediaConstant.RTCLIVE_URL_NAME;
                mediaPlayControlContext.mSeamlessSwitchingVideoPath = str2.concat("&grtn_fix_ts_reset=off&ali_stream_jitter=0");
                S1(this.p.mMediaPlayContext.mSeamlessSwitchingVideoPath, MediaConstant.RTCLIVE_URL_NAME);
                return true;
            }
            String str3 = qualityLiveItem.bfrtcUrl;
            if (str3 != null) {
                mediaPlayControlContext.mSeamlessSwitchingSelectName = MediaConstant.BFRTC_URL_NAME;
                mediaPlayControlContext.mSeamlessSwitchingVideoPath = str3;
                S1(str3, MediaConstant.BFRTC_URL_NAME);
                return true;
            }
        } else if (MediaConstant.BFRTC_URL_NAME.equals(str) || MediaConstant.RTCLIVE_URL_NAME.equals(str)) {
            MediaPlayControlContext mediaPlayControlContext2 = this.p.mMediaPlayContext;
            String str4 = mediaPlayControlContext2.mQualityLiveItem.liveUrlMiniBfrtc;
            if (str4 != null) {
                mediaPlayControlContext2.mSeamlessSwitchingSelectName = MediaConstant.MINI_BFRTC_URL_NAME;
                mediaPlayControlContext2.mSeamlessSwitchingVideoPath = str4;
                S1(str4, MediaConstant.MINI_BFRTC_URL_NAME);
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.mediaplay.player.b
    public void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7fc628", new Object[]{this, new Boolean(z)});
            return;
        }
        rgi rgiVar = this.n;
        boolean z2 = rgiVar.j;
        if (z2 && !z) {
            z2 = z;
        }
        rgiVar.j = z2;
        this.G = z;
        this.t = 2;
        if (this.p != null) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "pauseVideo##PlayState:" + this.n.e);
        }
        rgi rgiVar2 = this.n;
        if (rgiVar2.f != null && rgiVar2.e == 1) {
            K0();
            AVSDKLog.e(this.x1, "yezo:pause in pauseVideo");
            this.n.f.pause();
            if (this.n.f instanceof TaobaoMediaPlayer) {
                feh fehVar2 = this.x1;
                AVSDKLog.e(fehVar2, "shengjian::mMaxRenderInterval2 before" + this.s1);
                this.s1 = Math.max(this.s1, ((TaobaoMediaPlayer) this.n.f).getMaxRenderInterval());
                feh fehVar3 = this.x1;
                AVSDKLog.e(fehVar3, "shengjian::mMaxRenderInterval2 after" + this.s1);
            }
            if (this.p.mMediaPlayContext.mTBLive) {
                wei.n().j();
            } else {
                pgi.n().j();
            }
            K(z);
            n1();
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void V() {
        rgi rgiVar;
        MediaContext mediaContext;
        rgi rgiVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        v1();
        this.F1 = false;
        rgi rgiVar3 = this.n;
        if (rgiVar3.d) {
            if (rgiVar3.c == 4) {
                this.E1 = true;
            }
            rgiVar3.c = 1;
            this.q0 = System.currentTimeMillis();
            U0();
            return;
        }
        if (!this.v0) {
            this.u0 = true;
            this.q0 = System.currentTimeMillis();
        }
        try {
            if (!(this.n.i == 0.0f || this.o0 == null)) {
                p1("playVideo");
            }
        } catch (Throwable unused) {
        }
        try {
            if (this.p != null) {
                feh fehVar = this.x1;
                AVSDKLog.e(fehVar, " playVideo##PlayState:" + this.n.e);
            }
            rgi rgiVar4 = this.n;
            if (rgiVar4 != null && rgiVar4.f != null && this.z) {
                int i = rgiVar4.e;
                if ((i == 2 || i == 5 || i == 4) && this.I) {
                    String str = rgiVar4.f27360a;
                    if ((ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, "false")) || ja1.C0) && (mediaContext = this.p) != null && mediaContext.getWarmupFlag() && oxw.n().a(str)) {
                        if (this.p.mMediaPlayContext.mTBLive) {
                            rgiVar2 = oxw.n().f(str, this);
                        } else {
                            rgiVar2 = pgi.n().f(str, this);
                        }
                        this.n = rgiVar2;
                    } else {
                        if (this.p.mMediaPlayContext.mTBLive) {
                            rgiVar = wei.n().f(str, this);
                        } else {
                            rgiVar = pgi.n().f(str, this);
                        }
                        this.n = rgiVar;
                    }
                    if (this.p.mMediaPlayContext.isMute()) {
                        s0(0.0f);
                    }
                    a1();
                    this.n.f.start();
                    if (p() != null) {
                        X1(this.n.f, p());
                    }
                    if (l() != null) {
                        G0(this.n.f, l());
                    }
                    if (!TextUtils.isEmpty(this.s0)) {
                        q1(this.n.f);
                    }
                    O1(this.n.f);
                    int i2 = this.n.e;
                    if (!(i2 == 4 || i2 == 5)) {
                        L();
                        C1();
                    }
                    Q();
                    C1();
                }
            }
        } catch (Throwable th) {
            feh fehVar2 = this.x1;
            AVSDKLog.e(fehVar2, "playVideo >>> " + th.getMessage());
        }
    }

    public AbstractMediaPlayer V0() {
        String str;
        TaobaoMediaPlayer taobaoMediaPlayer;
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractMediaPlayer) ipChange.ipc$dispatch("f1ea51f7", new Object[]{this});
        }
        if (this.p != null) {
            AVSDKLog.e(this.x1, "initPlayer##PlayState:" + this.n.e + ",videoURL:" + this.g);
        }
        com.taobao.taobaoavsdk.Tracer.a.c(this.p.mAnalysis);
        r7t r7tVar = new r7t(this.p.mMediaPlayContext.mBusinessId);
        gf4 gf4Var = MediaAdapteManager.mConfigAdapter;
        if (gf4Var == null || !ew0.s(gf4Var.getConfig("DWInteractive", "useTaoBaoPlayer", "true"))) {
            MediaPlayControlContext mediaPlayControlContext = this.p.mMediaPlayContext;
            if (!mediaPlayControlContext.mEmbed) {
                mediaPlayControlContext.setPlayerType(1);
            }
        } else {
            this.p.mMediaPlayContext.setPlayerType(3);
        }
        String str2 = "";
        if (MediaAdapteManager.mConfigAdapter != null && ew0.n(Build.MODEL, MediaAdapteManager.mConfigAdapter.getConfig(this.p.mMediaPlayContext.mConfigGroup, "ijkPlayerBlackList", str2))) {
            this.p.mMediaPlayContext.setPlayerType(3);
        }
        if (MediaAdapteManager.mConfigAdapter != null) {
            MediaPlayControlContext mediaPlayControlContext2 = this.p.mMediaPlayContext;
            String str3 = mediaPlayControlContext2.mBusinessId;
            if (!TextUtils.isEmpty(mediaPlayControlContext2.getFrom())) {
                str3 = str3 + "-" + this.p.mMediaPlayContext.getFrom();
            }
            MediaPlayControlContext mediaPlayControlContext3 = this.p.mMediaPlayContext;
            mediaPlayControlContext3.setPlayerType(ew0.j(MediaAdapteManager.mConfigAdapter, "DWInteractive", mediaPlayControlContext3.mBusinessId, str3, mediaPlayControlContext3.getPlayerType()));
        }
        if (this.p.mMediaPlayContext.getPlayerType() == 2 && this.g.contains(".m3u8")) {
            this.p.mMediaPlayContext.setPlayerType(1);
        }
        QualityLiveItem qualityLiveItem = this.p.mMediaPlayContext.mQualityLiveItem;
        if (qualityLiveItem != null && !TextUtils.isEmpty(qualityLiveItem.newDefinition)) {
            if (!TextUtils.isEmpty(this.p.mMediaPlayContext.mQualityLiveItem.newDefinition)) {
                str2 = this.p.mMediaPlayContext.mQualityLiveItem.newDefinition;
            }
            this.J0 = str2;
        }
        AVSDKLog.e(this.x1, "initPlayer##mPlayingNewDefinition:" + this.J0);
        MediaContext mediaContext = this.p;
        r7tVar.U0 = mediaContext.mAnalysis;
        MediaPlayControlContext mediaPlayControlContext4 = mediaContext.mMediaPlayContext;
        r7tVar.q = mediaPlayControlContext4.mConfigGroup;
        r7tVar.c = mediaPlayControlContext4.getPlayerType();
        MediaContext mediaContext2 = this.p;
        MediaPlayControlContext mediaPlayControlContext5 = mediaContext2.mMediaPlayContext;
        r7tVar.d = (mediaPlayControlContext5.mTBLive || mediaPlayControlContext5.mEmbed) ? mediaContext2.mScenarioType : 2;
        r7tVar.A = mediaContext2.mUserId;
        r7tVar.C = mediaPlayControlContext5.mAccountId;
        r7tVar.y = mediaPlayControlContext5.getFrom();
        MediaPlayControlContext mediaPlayControlContext6 = this.p.mMediaPlayContext;
        r7tVar.B = mediaPlayControlContext6.mVideoId;
        r7tVar.D = mediaPlayControlContext6.getVideoDefinition();
        this.p.mMediaPlayContext.getRateAdapte();
        this.p.mMediaPlayContext.getVideoSource();
        r7tVar.r = this.p.mMediaPlayContext.getCacheKey();
        MediaPlayControlContext mediaPlayControlContext7 = this.p.mMediaPlayContext;
        r7tVar.O = mediaPlayControlContext7.mSVCEnable;
        r7tVar.M = mediaPlayControlContext7.mTBLive ? mediaPlayControlContext7.mDropFrameForH265 : false;
        r7tVar.P = mediaPlayControlContext7.mLowQualityUrl;
        r7tVar.K0 = mediaPlayControlContext7.mDegradeToFlvByArtoSoNoReady;
        r7tVar.S = mediaPlayControlContext7.mOnlyVideoEnable && mediaPlayControlContext7.isMute();
        r7tVar.h0 = this.p.mMediaPlayContext.getForceMuteMode();
        r7tVar.R0 = this.p.mMediaPlayContext.mChooseVVCReason.getValue();
        if (!TextUtils.isEmpty(this.p.mMediaPlayContext.getHighCachePath())) {
            r7tVar.s = this.p.mMediaPlayContext.getHighCachePath();
            r7tVar.D = this.p.mMediaPlayContext.mHighVideoDefinition;
        }
        r7tVar.o = this.p.mMediaPlayContext.isUseTBNet();
        MediaPlayControlContext mediaPlayControlContext8 = this.p.mMediaPlayContext;
        if (mediaPlayControlContext8.mTBLive || mediaPlayControlContext8.mEmbed) {
            r7tVar.h = (!mediaPlayControlContext8.isHardwareHevc() || !ja1.f) ? 0 : 1;
            r7tVar.g = (!this.p.mMediaPlayContext.isHardwareAvc() || !ja1.f) ? 0 : 1;
        } else {
            r7tVar.h = mediaPlayControlContext8.isHardwareHevc() ? 1 : 0;
            r7tVar.g = this.p.mMediaPlayContext.isHardwareAvc() ? 1 : 0;
        }
        if (r7tVar.g == 0) {
            MediaPlayControlContext mediaPlayControlContext9 = this.p.mMediaPlayContext;
            if ((mediaPlayControlContext9.mTBLive || mediaPlayControlContext9.mEmbed) && !ja1.f) {
                r7tVar.I0 = 4;
            } else {
                r7tVar.I0 = 5;
            }
        }
        if (r7tVar.h == 0) {
            MediaPlayControlContext mediaPlayControlContext10 = this.p.mMediaPlayContext;
            if ((mediaPlayControlContext10.mTBLive || mediaPlayControlContext10.mEmbed) && !ja1.f) {
                r7tVar.J0 = 4;
            } else {
                r7tVar.J0 = 5;
            }
        }
        MediaContext mediaContext3 = this.p;
        MediaPlayControlContext mediaPlayControlContext11 = mediaContext3.mMediaPlayContext;
        r7tVar.F = mediaPlayControlContext11.mMediaSourceType;
        r7tVar.N = mediaPlayControlContext11.mSelectedUrlName;
        r7tVar.t = mediaContext3.mPlayToken;
        r7tVar.H = this.p.mMediaPlayContext.getDevicePerformanceLevel() + "/runtimeLevel:" + this.p.mMediaPlayContext.mRuntimeLevel;
        if (this.p.mMediaPlayContext.getVideoLength() > 0 && this.p.mMediaPlayContext.getVideoLength() < 262144000) {
            r7tVar.u = this.p.mMediaPlayContext.getVideoLength();
        }
        r7tVar.K = this.p.mMediaPlayContext.getNetSpeed();
        this.p.mMediaPlayContext.getNetWorkQuality();
        this.p.mMediaPlayContext.getGlobalCurrentBandWidth();
        this.p.mMediaPlayContext.getGlobalPredictBandWidth();
        MediaContext mediaContext4 = this.p;
        boolean z = mediaContext4.mUseCache;
        mediaContext4.mMediaPlayContext.isVideoDeviceMeaseureEnable();
        boolean z2 = this.p.mMediaPlayContext.mHighPerformancePlayer;
        StringBuilder sb = new StringBuilder();
        sb.append(this.p.mMediaPlayContext.getRateAdaptePriority());
        sb.append("#");
        if (this.p.mMediaPlayContext.isH265()) {
            str = "h265";
        } else {
            str = "h264";
        }
        sb.append(str);
        r7tVar.L = sb.toString();
        if (this.p.getPlayExpUTParams() != null) {
            HashMap hashMap = new HashMap();
            r7tVar.T = hashMap;
            hashMap.putAll(this.p.getPlayExpUTParams());
            if (sj4.VIDEO_ACTION_TYPE_UPDOWNSWITCH.equals(r7tVar.T.get("liveActionType"))) {
                this.z1 = false;
            }
        }
        r7tVar.U = this.p.getCustomParams();
        if (this.p.getControlParams() != null) {
            HashMap hashMap2 = new HashMap();
            r7tVar.V = hashMap2;
            hashMap2.putAll(this.p.getControlParams());
            if (!TextUtils.isEmpty(r7tVar.V.get("LiveRoomInit"))) {
                this.z1 = ew0.s(r7tVar.V.get("LiveRoomInit"));
                AVSDKLog.e(this.x1, "get LiveRoomInit=" + this.z1 + " from addControlParams");
            }
        }
        MediaContext mediaContext5 = this.p;
        r7tVar.W = mediaContext5.mConnectTimeout;
        r7tVar.X = mediaContext5.mReadTimeout;
        r7tVar.Y = mediaContext5.mRetryTime;
        r7tVar.a0 = mediaContext5.getPrepareToFirstFrame();
        r7tVar.e0 = this.p.getWarmupFlag();
        r7tVar.f0 = this.p.getWarmupLevel();
        r7tVar.g0 = this.p.getStartPos();
        MediaContext mediaContext6 = this.p;
        r7tVar.i0 = mediaContext6.mSwitchStreamABId;
        r7tVar.k0 = mediaContext6.mUsingInterface;
        r7tVar.Q = mediaContext6.mPlayScenes;
        r7tVar.l0 = mediaContext6.getAudioOnly();
        MediaContext mediaContext7 = this.p;
        r7tVar.m0 = mediaContext7.mLivePushControlInfo;
        r7tVar.f27172a = mediaContext7.mEnterVoiceRoom;
        r7tVar.b = mediaContext7.mIsPlayBackScenario;
        r7tVar.n0 = mediaContext7.mDynamicPlayEx;
        r7tVar.o0 = mediaContext7.mSwitchScene;
        r7tVar.p0 = mediaContext7.mSwitchSceneTime;
        r7tVar.q0 = mediaContext7.mIsFloat;
        MediaPlayControlContext mediaPlayControlContext12 = mediaContext7.mMediaPlayContext;
        r7tVar.w0 = mediaPlayControlContext12.mUseLowSpeedPolicy;
        r7tVar.x0 = mediaPlayControlContext12.mLowSpeedPolicyABId;
        r7tVar.y0 = mediaPlayControlContext12.mLowSpeedPolicy;
        r7tVar.F0 = mediaPlayControlContext12.isLiveRoom();
        MediaContext mediaContext8 = this.p;
        MediaPlayControlContext mediaPlayControlContext13 = mediaContext8.mMediaPlayContext;
        r7tVar.z0 = mediaPlayControlContext13.mSelectDefinitionReason;
        r7tVar.E0 = mediaPlayControlContext13.mEnableAdaptiveLiveSwitch;
        r7tVar.H0 = mediaPlayControlContext13.mLastPlayError;
        mediaPlayControlContext13.mLastPlayError = 0;
        r7tVar.G0 = mediaPlayControlContext13.mSelectFlvUrlReason;
        if (mediaPlayControlContext13.mSelectedUrlName == MediaConstant.RTCLIVE_URL_NAME) {
            mediaPlayControlContext13.mSelectFlvUrlReason = 13;
        } else {
            mediaPlayControlContext13.mSelectFlvUrlReason = 12;
        }
        r7tVar.s0 = mediaPlayControlContext13.mSelectDefinitionSpeed;
        r7tVar.A0 = mediaPlayControlContext13.mEnableSRSByRTCWeakNetFlag;
        r7tVar.B0 = mediaPlayControlContext13.mLiveRtcWeakNetFlag;
        r7tVar.C0 = mediaPlayControlContext13.mLiveRtcWeakNetSVCDrop;
        r7tVar.D0 = mediaPlayControlContext13.mEnableLiveRtcHomePageCardSVCDrop;
        r7tVar.t0 = mediaPlayControlContext13.mLiveMaxBitrate;
        r7tVar.u0 = mediaPlayControlContext13.mSelectDefinition;
        r7tVar.v0 = mediaPlayControlContext13.mEnableCdnStartPlaySpeed;
        r7tVar.L0 = this.Z0;
        r7tVar.N0 = this.W0;
        r7tVar.O0 = this.Y0;
        r7tVar.S0 = mediaPlayControlContext13.mReleaseByCustom;
        r7tVar.T0 = mediaPlayControlContext13.mSetPauseFrameLock;
        r7tVar.X0 = mediaPlayControlContext13.mMediaLiveInfo != null;
        r7tVar.Y0 = mediaPlayControlContext13.mHasQueryMediaInfo;
        Map<String, String> uTParams = mediaContext8.getUTParams();
        if (uTParams != null) {
            String str4 = uTParams.get("product_type");
            if (!TextUtils.isEmpty(str4)) {
                r7tVar.z = str4;
            }
            String str5 = uTParams.get("spm-cnt");
            if (!TextUtils.isEmpty(str5)) {
                r7tVar.r0 = str5;
            }
        }
        if (t() != null && t().startsWith("content://")) {
            this.p.mMediaPlayContext.setPlayerType(2);
        }
        MediaContext mediaContext9 = this.p;
        if (mediaContext9 == null || !(mediaContext9.mMediaPlayContext.getPlayerType() == 3 || this.p.mMediaPlayContext.getPlayerType() == 1)) {
            taobaoMediaPlayer = O0(r7tVar);
        } else {
            TaobaoMediaPlayer taobaoMediaPlayer2 = null;
            try {
                r7tVar.b0 = this.p.getNeedCommitUserToFirstFrame();
                if (this.p == null || MediaAdapteManager.mConfigAdapter == null) {
                    taobaoMediaPlayer2 = new TaobaoMediaPlayer(this.l);
                } else {
                    taobaoMediaPlayer2 = new TaobaoMediaPlayer(this.l, MediaAdapteManager.mConfigAdapter);
                }
                MediaPlayControlContext mediaPlayControlContext14 = this.p.mMediaPlayContext;
                taobaoMediaPlayer2.addExperienceInfo(mediaPlayControlContext14.mExperienceIdSet, mediaPlayControlContext14.mExperienceReleaseIdSet, mediaPlayControlContext14.mExperienceBucketIdSet);
                W1();
                taobaoMediaPlayer = taobaoMediaPlayer2;
            } catch (Throwable th) {
                AVSDKLog.e(this.x1, "initPlayer##TaobaoMediaPlayer load error:" + th.getMessage());
                k1(taobaoMediaPlayer2);
                taobaoMediaPlayer = O0(r7tVar);
            }
        }
        try {
            f1(taobaoMediaPlayer, r7tVar);
            abstractMediaPlayer = taobaoMediaPlayer;
        } catch (Throwable th2) {
            AVSDKLog.e(this.x1, "initPlayer## prepare player error" + th2.getMessage());
            abstractMediaPlayer = taobaoMediaPlayer;
            if (taobaoMediaPlayer != null) {
                k1(taobaoMediaPlayer);
                try {
                    boolean z3 = taobaoMediaPlayer instanceof TaobaoMediaPlayer;
                    AbstractMediaPlayer abstractMediaPlayer2 = taobaoMediaPlayer;
                    if (z3) {
                        AbstractMediaPlayer O0 = O0(r7tVar);
                        f1(O0, r7tVar);
                        abstractMediaPlayer2 = O0;
                    }
                    if (this.U0) {
                        e1(2010, 0);
                        abstractMediaPlayer = abstractMediaPlayer2;
                    } else {
                        d1();
                        abstractMediaPlayer = abstractMediaPlayer2;
                    }
                } catch (Throwable unused) {
                    AVSDKLog.e(this.x1, "initPlayer##backup mediaplayer it error:");
                    if (this.U0) {
                        e1(IMediaPlayer.MEDIA_INFO_PLAYER_INIT_FAILED_ERROR, 0);
                        abstractMediaPlayer = taobaoMediaPlayer;
                    } else {
                        d1();
                        abstractMediaPlayer = taobaoMediaPlayer;
                    }
                }
            }
        }
        AVSDKLog.e(this.x1, "initPlayer finished, player=" + abstractMediaPlayer);
        return abstractMediaPlayer;
    }

    @Override // com.taobao.mediaplay.player.b
    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
            return;
        }
        if (MediaSystemUtils.isApkDebuggable() && this.p != null) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "asyncPrepareVideo##PlayState:" + this.n.e);
        }
        this.F1 = false;
        this.A = true;
        this.B = true;
        this.t = 8;
        v1();
        rgi rgiVar = this.n;
        rgiVar.b = 0;
        if (rgiVar.d) {
            rgiVar.c = 5;
            U0();
            this.u0 = false;
            return;
        }
        if (this.p.getControlParams() != null && !TextUtils.isEmpty(this.p.getControlParams().get(MediaConstant.TIMEMOVING_P2FF_BY_CONTROL_PARAM))) {
            this.A1 = ew0.s(this.p.getControlParams().get(MediaConstant.TIMEMOVING_P2FF_BY_CONTROL_PARAM));
            feh fehVar2 = this.x1;
            AVSDKLog.e(fehVar2, "TextureVideoView init: get TimeMovingP2ff=" + this.A1 + " from mMediaContext.getControlParams() ");
        }
        if (z(this.n.e) && !TextUtils.isEmpty(this.g)) {
            this.p.setPrepareToFirstFrame(true);
            T0();
            if (TextUtils.isEmpty(this.s0)) {
                rgi rgiVar2 = this.n;
                rgiVar2.e = 8;
                rgiVar2.d = false;
            }
        }
    }

    public final boolean Z0(String str) {
        MediaContext mediaContext;
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f04560c", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && str.startsWith(TaoLiveVideoView.TBLIVE_GRTN_SCHEMA) && (mediaContext = this.p) != null && (mediaPlayControlContext = mediaContext.mMediaPlayContext) != null) {
            String str2 = mediaPlayControlContext.mSelectedUrlName;
            if (!TextUtils.isEmpty(str2) && MediaConstant.RTCLIVE_URL_NAME.equals(str2)) {
                AVSDKLog.e(this.x1, "warmup path is valid.".concat(str));
                return true;
            }
        }
        feh fehVar = this.x1;
        AVSDKLog.e(fehVar, "warmup path is not valid. " + str);
        I(null, 11002L, 0L, 0L, null);
        return false;
    }

    @Override // com.taobao.mediaplay.player.c.a
    public void a(c.b bVar, int i, int i2, int i3) {
        AbstractMediaPlayer abstractMediaPlayer;
        int i4;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65401429", new Object[]{this, bVar, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        String currentPageName = c2v.getInstance().getCurrentPageName();
        if (this.p != null) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "onSurfaceChanged holder: " + bVar + ", format: " + i + ", width: " + i2 + ", height: " + i3 + ", currentPageName=" + currentPageName);
        }
        U1();
        int i5 = this.c;
        if (i5 > 0 && (i4 = this.d) > 0 && !(i5 == i2 && i4 == i3)) {
            z = true;
        }
        this.c = i2;
        this.d = i3;
        if (!this.X || !bVar.isBackground() || this.b0) {
            if (bVar.getRenderView() == this.H) {
                this.k = bVar;
                if (!z) {
                    int i6 = this.a1;
                    M0(i2, i3, i6, i6);
                } else {
                    int i7 = this.a1;
                    c2(i2, i3, i7, i7);
                }
                boolean z2 = this.p.mVRLive;
                rgi rgiVar = this.n;
                if (!(rgiVar == null || rgiVar.f == null)) {
                    if (p() != null) {
                        X1(this.n.f, p());
                    } else if (bVar.getSurface() != null) {
                        X1(this.n.f, bVar.getSurface());
                    }
                }
                rgi rgiVar2 = this.n;
                if (!(rgiVar2 == null || (abstractMediaPlayer = rgiVar2.f) == null || !z)) {
                    abstractMediaPlayer.setSurfaceSize(i2, i3);
                }
                TaoLiveVideoView.p pVar = this.z0;
                if (pVar != null) {
                    pVar.onSurfaceCreated();
                }
                if (this.z1 && (this.y0 instanceof SurfaceView)) {
                    if (this.B1 == null && i2 > 1 && i3 > 1) {
                        this.B1 = bVar;
                        this.C1 = true;
                        feh fehVar2 = this.x1;
                        AVSDKLog.e(fehVar2, "get first holder = " + this.B1);
                    }
                    if (this.C1 && bVar != this.B1) {
                        feh fehVar3 = this.x1;
                        AVSDKLog.e(fehVar3, "mFirstHolder=" + this.B1 + ",current Holder=" + bVar + ". IsReadyToHideCover");
                        this.y1 = true;
                    }
                }
                F();
            }
        } else if ((this.n.f instanceof TaobaoMediaPlayer) && bVar == this.d0) {
            feh fehVar4 = this.x1;
            AVSDKLog.e(fehVar4, "SeamlessSwitch onSurfaceChanged " + i2 + ", " + i3);
            this.n.f.setSurfaceSize(i2, i3);
        }
    }

    @Override // com.taobao.mediaplay.player.c.a
    public void c(c.b bVar, int i, int i2) {
        AbstractMediaPlayer abstractMediaPlayer;
        Surface surface;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f234966", new Object[]{this, bVar, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.b1 > 0 && this.c1 == 0) {
            this.c1 = System.currentTimeMillis();
            W1();
        }
        if (this.p != null) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "onSurfaceCreated width=" + i + ", height=" + i2 + ", mSurfaceWidth=" + this.c + ", mSurfaceHeight=" + this.d);
        }
        String currentPageName = c2v.getInstance().getCurrentPageName();
        if (!(bVar == null || this.p == null)) {
            feh fehVar2 = this.x1;
            AVSDKLog.e(fehVar2, " SeamlessSwitch onSurfaceCreated holder: " + bVar + ", surface: " + bVar.getSurface() + ", currentPagename=" + currentPageName);
        }
        U1();
        if (this.p != null) {
            feh fehVar3 = this.x1;
            AVSDKLog.e(fehVar3, "onSurfaceTextureAvailable##PlayState=" + this.n.e);
        }
        if (!this.X || !bVar.isBackground() || this.b0) {
            boolean z2 = this.k != null && this.Z0;
            this.k = bVar;
            if (this.c == i && this.d == i2) {
                z = false;
            }
            this.c = i;
            this.d = i2;
            int i3 = this.a1;
            M0(i, i2, i3, i3);
            F();
            if (this.z || this.A) {
                rgi rgiVar = this.n;
                if (!rgiVar.d && rgiVar.e != 6 && rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
                    if (z2) {
                        X1(abstractMediaPlayer, null);
                    }
                    G0(this.n.f, l());
                    if (z && i > 0 && i2 > 0) {
                        this.n.f.setSurfaceSize(i, i2);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!this.i || p() == null) {
            surface = bVar.getSurface();
        } else {
            surface = p();
        }
        if (this.n.f instanceof TaobaoMediaPlayer) {
            AVSDKLog.e(this.x1, "SeamlessSwitch onSurfaceCreated sub stream set surface ok");
            ((TaobaoMediaPlayer) this.n.f).seamlessSwitchStream(surface);
            this.d0 = bVar;
        }
    }

    @Override // com.taobao.mediaplay.player.c.a
    public void d(c.b bVar, boolean z) {
        rgi rgiVar;
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43606b7f", new Object[]{this, bVar, new Boolean(z)});
            return;
        }
        if (this.v1 && (this.y0 instanceof SurfaceView)) {
            AVSDKLog.e(this.x1, "try to updateCoverBitMapFromSurfaceView at onSurfaceDestroyed");
            d2();
        }
        String currentPageName = c2v.getInstance().getCurrentPageName();
        if (bVar != null) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "onSurfaceDestroyed holder: " + bVar + ", surface: " + bVar.getSurface() + ", currentPageName=" + currentPageName);
        }
        if (this.p != null) {
            feh fehVar2 = this.x1;
            AVSDKLog.e(fehVar2, "onSurfaceDestroyed##PlayState =" + this.n.e);
        }
        if (!this.X || !bVar.isBackground() || this.d0 != bVar) {
            rgi rgiVar2 = this.n;
            int i = rgiVar2.e;
            if ((i == 5 || i == 4 || i == 2 || i == 1) && Build.VERSION.SDK_INT < H1) {
                X1(rgiVar2.f, null);
                this.k = null;
                j1();
            }
            if (z && (rgiVar = this.n) != null && (abstractMediaPlayer = rgiVar.f) != null && this.Z0) {
                X1(abstractMediaPlayer, null);
                this.k = null;
                j1();
            }
            this.n.b = getCurrentPosition();
            TaoLiveVideoView.p pVar = this.z0;
            if (pVar != null) {
                pVar.onSurfaceDestroyed();
            }
        }
    }

    public final void d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96e0d2a", new Object[]{this});
            return;
        }
        if (this.p != null) {
            AVSDKLog.e(this.x1, "notifyVideoErrorForInit called.");
        }
        try {
            H(null, 1, 0);
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void g() {
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        feh fehVar = this.x1;
        AVSDKLog.e(fehVar, "destroy called." + this.k);
        try {
            MediaContext mediaContext = this.p;
            if (!(mediaContext == null || (mediaPlayControlContext = mediaContext.mMediaPlayContext) == null)) {
                mediaPlayControlContext.resumeFrameLock();
            }
            c.b bVar = this.k;
            if (!(bVar == null || bVar.getSurface() == null)) {
                this.k.getSurface().release();
            }
            Surface surface = this.j;
            if (surface != null) {
                surface.release();
                this.j = null;
            }
        } catch (Throwable unused) {
        }
        a2();
        if (!(!ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enableReportSuccessRate", "true")) || this.r0 == 0 || this.p == null)) {
            StringBuilder sb = new StringBuilder(400);
            sb.append(",play_token=");
            sb.append(this.p.mPlayToken);
            sb.append(",error_code=");
            MediaPlayControlContext mediaPlayControlContext2 = this.p.mMediaPlayContext;
            sb.append(mediaPlayControlContext2 != null ? mediaPlayControlContext2.mLastPlayError : 0);
            sb.append(",play_time=");
            long j = -1;
            sb.append(this.r0 > 0 ? System.currentTimeMillis() - this.r0 : -1L);
            sb.append(",first_frame_rendering_time_new=");
            long j2 = this.p1;
            if (j2 > 0) {
                j = j2 - this.r0;
            }
            sb.append(j);
            sb.append(",play_scenario=");
            sb.append(this.p.mScenarioType);
            sb.append(",business_type=");
            MediaPlayControlContext mediaPlayControlContext3 = this.p.mMediaPlayContext;
            String str = "";
            sb.append(mediaPlayControlContext3 != null ? mediaPlayControlContext3.mBusinessId : str);
            sb.append(",sub_business_type=");
            MediaPlayControlContext mediaPlayControlContext4 = this.p.mMediaPlayContext;
            sb.append(mediaPlayControlContext4 != null ? mediaPlayControlContext4.mFrom : str);
            sb.append(",feed_id=");
            MediaPlayControlContext mediaPlayControlContext5 = this.p.mMediaPlayContext;
            sb.append(mediaPlayControlContext5 != null ? mediaPlayControlContext5.mVideoId : str);
            if (this.r1 > 0) {
                feh fehVar2 = this.x1;
                AVSDKLog.e(fehVar2, "shengjian::mMaxRenderInterval1 before" + this.s1);
                this.s1 = Math.max(this.s1, System.currentTimeMillis() - this.r1);
                feh fehVar3 = this.x1;
                AVSDKLog.e(fehVar3, "shengjian::mMaxRenderInterval1 after" + this.s1);
                this.r1 = 0L;
            }
            sb.append(",max_video_render_interval=");
            sb.append(this.s1);
            sb.append(",play_time_begin=");
            sb.append(this.r0);
            sb.append(",play_time_end=");
            sb.append(System.currentTimeMillis());
            if (!this.t1) {
                h2(0);
            }
            sb.append(",error_status_list=");
            sb.append(this.K1);
            sb.append(",anchor_account_id=");
            MediaPlayControlContext mediaPlayControlContext6 = this.p.mMediaPlayContext;
            if (mediaPlayControlContext6 != null) {
                str = mediaPlayControlContext6.mAccountId;
            }
            sb.append(str);
            TBS.Ext.commitEvent("Page_Video", 19997, "Page_Video_UserExperience", "", "", sb.toString());
        }
        this.q0 = 0L;
        this.r0 = 0L;
        this.p1 = 0L;
        MediaContext mediaContext2 = this.p;
        if (mediaContext2 != null) {
            mediaContext2.genPlayToken(true);
        }
    }

    public void g2(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dfca00", new Object[]{this, mediaLiveWarmupConfig});
            return;
        }
        String l0 = ja1.l0("ab_experiment", this.g, "&");
        if (ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enableLongTermAB", "false")) && !TextUtils.isEmpty(l0)) {
            try {
                if (ja1.q0(Long.parseLong(l0), 4)) {
                    AVSDKLog.e(this.x1, "播控预热实验 打开");
                } else {
                    AVSDKLog.e(this.x1, "播控预热实验 关闭");
                    return;
                }
            } catch (NumberFormatException e2) {
                PrintStream printStream = System.out;
                printStream.println("Invalid string format for a long: " + e2.getMessage());
            }
        }
        if (this.t == 1) {
            AVSDKLog.e(this.x1, "try to call warmupLiveStream after start, refuse and return.");
            return;
        }
        if (MediaSystemUtils.isApkDebuggable() && this.p != null) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "asyncPrepareVideo##PlayState:" + this.n.e);
        }
        if (ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, "false")) || ja1.C0) {
            rgi rgiVar = this.n;
            String str = rgiVar.f27360a;
            int i = rgiVar.b;
            int i2 = rgiVar.c;
            boolean z = rgiVar.d;
            int i3 = rgiVar.e;
            float f2 = rgiVar.i;
            AbstractMediaPlayer abstractMediaPlayer = rgiVar.f;
            wei.n().l(true);
            wei.n().i(str, this);
            wei.n().l(false);
            rgi f3 = oxw.n().f(str, this);
            this.n = f3;
            f3.b = i;
            f3.c = i2;
            f3.d = z;
            f3.e = i3;
            f3.f = abstractMediaPlayer;
            f3.i = f2;
            AVSDKLog.e(this.x1, "move player to warmup manager");
        }
        this.F1 = false;
        this.A = true;
        this.t = 8;
        v1();
        rgi rgiVar2 = this.n;
        rgiVar2.b = 0;
        if (rgiVar2.d) {
            rgiVar2.c = 5;
            U0();
            this.u0 = false;
        } else if (z(rgiVar2.e) && !TextUtils.isEmpty(this.g) && Z0(this.g)) {
            this.p.setWarmupFlag(mediaLiveWarmupConfig.mWarmupFlag);
            this.p.setWarmupLevel(mediaLiveWarmupConfig.mWarmupLevel);
            String videoDefinition = this.p.mMediaPlayContext.getVideoDefinition();
            if (!TextUtils.isEmpty(videoDefinition) && videoDefinition.contains("266") && this.Z0 && ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "disable266UseSurfaceView", "true"))) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "rebuildRenderView for VVC + SurfaceView");
                this.R0 = true;
                this.Q0 = true;
                this.Z0 = false;
                h1();
            }
            T0();
            if (TextUtils.isEmpty(this.s0)) {
                rgi rgiVar3 = this.n;
                rgiVar3.e = 8;
                rgiVar3.d = false;
            }
        }
    }

    public final void h1() {
        ViewParent viewParent;
        com.taobao.mediaplay.player.c cVar;
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b1355d", new Object[]{this});
        } else if (this.R0 || !this.Z0) {
            this.R0 = false;
            AVSDKLog.e(this.x1, "rebuildRenderView start.");
            com.taobao.mediaplay.player.c cVar2 = this.H;
            if (cVar2 instanceof MediaSurfaceView) {
                viewParent = ((MediaSurfaceView) cVar2).getParent();
            } else if (cVar2 instanceof MediaTextureView) {
                viewParent = ((MediaTextureView) cVar2).getParent();
            } else {
                AVSDKLog.e(this.x1, "Unknown render view type: ".concat(cVar2.getClass().getName()));
                return;
            }
            ((ArrayList) this.S0).add(this.H.getView());
            if (this.H != null) {
                if (((ArrayList) this.S0).size() == 1) {
                    com.taobao.mediaplay.player.c cVar3 = this.H;
                    if (cVar3 instanceof MediaSurfaceView) {
                        this.T0 = ((MediaSurfaceView) cVar3).getAspectRatio();
                    } else if (cVar3 instanceof MediaTextureView) {
                        this.T0 = ((MediaTextureView) cVar3).getAspectRatio();
                    }
                }
                rgi rgiVar = this.n;
                if (!(rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null)) {
                    X1(abstractMediaPlayer, null);
                }
                this.H.removeRenderCallback(this);
                this.H = null;
            }
            if (this.Z0) {
                cVar = new MediaSurfaceView(this.l, this.x1.b());
            } else {
                cVar = new MediaTextureView(this.l, this.x1.b());
            }
            this.H = cVar;
            cVar.addRenderCallback(this);
            this.H.setVideoRotation(this.E);
            View view = this.H.getView();
            this.y0 = view;
            if (view != null) {
                ((ViewGroup) viewParent).addView(view, 0, new FrameLayout.LayoutParams(-2, -2, 17));
            }
            if (((this.y0 instanceof SurfaceView) && this.A1) || this.P0 || this.Q0) {
                m1();
            }
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "rebuildRenderView finished, newView:" + this.H);
        }
    }

    public boolean j1() {
        rgi rgiVar;
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fc9d731", new Object[]{this})).booleanValue();
        }
        AVSDKLog.e(this.x1, "releaseAlphaBitmap");
        if (!(!this.W0 || this.V0 == null || (rgiVar = this.n) == null || (abstractMediaPlayer = rgiVar.f) == null || !(abstractMediaPlayer instanceof TaobaoMediaPlayer))) {
            ((TaobaoMediaPlayer) abstractMediaPlayer).releaseAlphaBitmap();
            this.V0 = null;
            this.X0 = false;
        }
        return true;
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        feh fehVar = this.x1;
        AVSDKLog.e(fehVar, "onActivityPaused, activity=" + activity + ", mContext=" + this.l);
        if (this.l == activity) {
            MediaPlayControlContext mediaPlayControlContext = this.p.mMediaPlayContext;
            if (!mediaPlayControlContext.mTBLive && !mediaPlayControlContext.mEmbed && mediaPlayControlContext.mEnableAutoPauseInBackground) {
                this.I = false;
                rgi rgiVar = this.n;
                if (rgiVar != null && rgiVar.f != null) {
                    int i = rgiVar.e;
                    if (i == 1 || i == 5) {
                        U(true);
                    }
                }
            }
        }
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityResumed(Activity activity) {
        Window window;
        sx1 n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        feh fehVar = this.x1;
        AVSDKLog.e(fehVar, "onActivityResumed, activity=" + activity + ", mContext=" + this.l);
        this.g1 = new WeakReference<>(activity);
        if (this.q1 > 0 && this.r1 == 0) {
            this.q1 = System.currentTimeMillis();
        }
        Context context = this.l;
        if (context != activity) {
            this.f1 = true;
        }
        if (context == activity) {
            MediaPlayControlContext mediaPlayControlContext = this.p.mMediaPlayContext;
            if (!mediaPlayControlContext.mTBLive && !mediaPlayControlContext.mEmbed && mediaPlayControlContext.mEnableAutoPauseInBackground) {
                this.I = true;
                rgi rgiVar = this.n;
                if (rgiVar == null || !rgiVar.d) {
                    if (!(rgiVar == null || rgiVar.f == null || !rgiVar.j || !this.z || rgiVar.e == 4)) {
                        V();
                    }
                    MediaContext mediaContext = this.p;
                    if (mediaContext == null) {
                        return;
                    }
                    if ((mediaContext.screenType() == MediaPlayScreenType.PORTRAIT_FULL_SCREEN || this.p.screenType() == MediaPlayScreenType.LANDSCAPE_FULL_SCREEN) && (this.p.getContext() instanceof Activity)) {
                        if (this.p.getWindow() == null) {
                            window = ((Activity) this.p.getContext()).getWindow();
                        } else {
                            window = this.p.getWindow();
                        }
                        DWViewUtil.hideNavigationBar(window);
                        return;
                    }
                    return;
                }
                if (B()) {
                    rgi rgiVar2 = this.n;
                    if (rgiVar2.c == 2) {
                        rgiVar2.c = 1;
                    }
                }
                if (this.p.mMediaPlayContext.mTBLive) {
                    n = wei.n();
                } else {
                    n = pgi.n();
                }
                boolean k = n.k();
                if (this.n.c == 1 && k) {
                    U0();
                }
            }
        }
    }

    @Override // com.taobao.mediaplay.player.c.a
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        WeakReference<Activity> weakReference = this.g1;
        Activity activity = weakReference == null ? null : weakReference.get();
        if (this.p != null) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "onAttachedToWindow mContext=" + this.l + ", mCurrentActitity=" + activity);
        }
        this.e1 = true;
        String config = OrangeConfig.getInstance().getConfig("DWInteractive", TaobaoMediaPlayer.ORANGE_ENABLE_SURFACEVIEW_P2FF_OS_VERSION_LIST, "[\"11\",\"12\"]");
        String str = Build.VERSION.RELEASE;
        boolean n = ew0.n(str, config);
        feh fehVar2 = this.x1;
        AVSDKLog.e(fehVar2, "android version:" + str + ", OS list:" + config + ",p2ff and sv needToRebuild:" + n);
        if (this.Z0 && this.B && this.A1 && n) {
            this.B = false;
            this.h1 = true;
            this.f1 = true;
            AVSDKLog.e(this.x1, "surfaceView and called p2ff, rebuild renderView.");
        }
        if (this.h1 && this.l != null && activity != null && this.f1) {
            this.f1 = false;
            this.R0 = true;
            h1();
            U1();
        }
    }

    @Override // tb.rgi.a
    public void release(boolean z) {
        AbstractMediaPlayer abstractMediaPlayer;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88058386", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.p != null) {
            AVSDKLog.e(this.x1, "release called.");
        }
        this.E = 0;
        this.u0 = false;
        this.X0 = false;
        this.v0 = false;
        MediaContext mediaContext = this.p;
        mediaContext.mMediaPlayContext.mSeekWhenPrepared = 0;
        mediaContext.setPrepareToFirstFrame(false);
        this.p.setWarmupFlag(false);
        this.p.setWarmupLevel(1);
        try {
            rgi rgiVar = this.n;
            if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
                if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
                    feh fehVar = this.x1;
                    AVSDKLog.e(fehVar, "shengjian::mMaxRenderInterval5 before" + this.s1);
                    this.s1 = Math.max(this.s1, ((TaobaoMediaPlayer) this.n.f).getMaxRenderInterval());
                    feh fehVar2 = this.x1;
                    AVSDKLog.e(fehVar2, "shengjian::mMaxRenderInterval5 after" + this.s1);
                }
                this.n.f.resetListeners();
                AbstractMediaPlayer abstractMediaPlayer2 = this.n.f;
                if (abstractMediaPlayer2 instanceof TaobaoMediaPlayer) {
                    TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) abstractMediaPlayer2;
                    HashMap hashMap = new HashMap();
                    String str2 = MediaConstant.CMD_SET_RECYCEL_REASON;
                    if (this.F1) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    hashMap.put(str2, str);
                    String str3 = MediaConstant.CMD_UPDATE_PLAY_EX;
                    hashMap.put(str3, "is_mute_prepare=" + (this.n1 ? 1 : 0) + ",request_long_focus=" + (this.k1 ? 1 : 0) + ",request_focus_count=" + this.l1 + ",release_focus_count=" + this.m1);
                    taobaoMediaPlayer.callWithMsg(hashMap);
                    if (this.H != null) {
                        taobaoMediaPlayer.setShowViewParent(null);
                    }
                    this.n.f.releasePrefixInUIThread();
                    dq.b().submit(new h(this, null));
                } else {
                    abstractMediaPlayer2.reset();
                    this.n.f.release();
                }
                rgi rgiVar2 = this.n;
                rgiVar2.f = null;
                rgiVar2.e = 6;
                if (!this.F1) {
                    N();
                }
            }
        } catch (Throwable th) {
            feh fehVar3 = this.x1;
            AVSDKLog.e(fehVar3, "release##ReleasePlayerRunnable error" + th.getMessage());
        }
    }

    @Override // com.taobao.mediaplay.player.b
    public void t0() {
        int i;
        boolean z;
        boolean z2;
        MediaPlayControlContext mediaPlayControlContext;
        MediaContext mediaContext;
        MediaContext mediaContext2;
        MediaPlayControlContext mediaPlayControlContext2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a420d40", new Object[]{this});
            return;
        }
        if (this.p != null) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "startVideo##PlayState:" + this.n.e + " VideoUrl:" + this.g);
        }
        if (!TextUtils.isEmpty(this.g) && this.g.contains("artc") && (mediaContext2 = this.p) != null && (mediaPlayControlContext2 = mediaContext2.mMediaPlayContext) != null) {
            mediaPlayControlContext2.mSelectedUrlName = MediaConstant.RTCLIVE_URL_NAME;
        }
        this.z = true;
        this.F1 = false;
        this.t = 1;
        v1();
        MediaContext mediaContext3 = this.p;
        if (!(mediaContext3 == null || mediaContext3.getControlParams().get("keepScreenOnDoNotCarePlayerState") == null || !ew0.s(this.p.getControlParams().get("keepScreenOnDoNotCarePlayerState")))) {
            AVSDKLog.e(this.x1, "Keep screen on don't care playerstate");
            a1();
        }
        if ((ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, "false")) || ja1.C0) && (mediaContext = this.p) != null && mediaContext.getWarmupFlag()) {
            rgi rgiVar = this.n;
            String str = rgiVar.f27360a;
            int i2 = rgiVar.b;
            int i3 = rgiVar.c;
            boolean z3 = rgiVar.d;
            int i4 = rgiVar.e;
            float f2 = rgiVar.i;
            AbstractMediaPlayer abstractMediaPlayer = rgiVar.f;
            oxw.n().l(true);
            oxw.n().i(str, this);
            oxw.n().l(false);
            rgi f3 = wei.n().f(str, this);
            this.n = f3;
            f3.b = i2;
            f3.c = i3;
            f3.d = z3;
            f3.e = i4;
            f3.f = abstractMediaPlayer;
            f3.i = f2;
            AVSDKLog.e(this.x1, "move warmup player to normal manager");
        }
        MediaContext mediaContext4 = this.p;
        if (!(mediaContext4 == null || (mediaPlayControlContext = mediaContext4.mMediaPlayContext) == null)) {
            if (!mediaPlayControlContext.isMute() || this.n.i > 0.0f) {
                this.n1 = false;
            }
            feh fehVar2 = this.x1;
            AVSDKLog.e(fehVar2, "sbt=" + this.p.mMediaPlayContext.mFrom + " startVideo with mute tag=" + this.p.mMediaPlayContext.isMute() + ", volume=" + this.n.i + ", is_mute_prepare=" + this.n1);
        }
        rgi rgiVar2 = this.n;
        if (rgiVar2.d) {
            this.u0 = false;
            if (rgiVar2.c == 4) {
                this.E1 = true;
            }
            U0();
            this.n.c = 1;
            return;
        }
        rgiVar2.b = 0;
        if (!this.u0) {
            this.u0 = true;
            this.q0 = System.currentTimeMillis();
        }
        if (this.r0 == 0) {
            this.r0 = System.currentTimeMillis();
        }
        if (!z(this.n.e) || TextUtils.isEmpty(this.g)) {
            rgi rgiVar3 = this.n;
            if (rgiVar3 == null || rgiVar3.f == null || rgiVar3.e != 5 || TextUtils.isEmpty(this.g) || !this.I) {
                rgi rgiVar4 = this.n;
                if (rgiVar4 == null || rgiVar4.f == null || TextUtils.isEmpty(this.s0) || !((i = this.n.e) == 2 || i == 1 || i == 4)) {
                    rgi rgiVar5 = this.n;
                    if (!(rgiVar5 == null || rgiVar5.f == null || TextUtils.isEmpty(this.s0))) {
                        rgi rgiVar6 = this.n;
                        if (rgiVar6.e == 8) {
                            O1(rgiVar6.f);
                        }
                    }
                } else {
                    V();
                }
            } else {
                a1();
                this.n.f.start();
                Q();
                C1();
            }
        } else {
            T0();
            String videoDefinition = this.p.mMediaPlayContext.getVideoDefinition();
            if (TextUtils.isEmpty(videoDefinition) || !videoDefinition.contains("266") || !this.Z0 || !ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "disable266UseSurfaceView", "true"))) {
                z = false;
            } else {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "rebuildRenderView for VVC + SurfaceView");
                z = true;
            }
            AbstractMediaPlayer abstractMediaPlayer2 = this.n.f;
            if (!(abstractMediaPlayer2 instanceof TaobaoMediaPlayer) || ((TaobaoMediaPlayer) abstractMediaPlayer2).getViedoCodecType() != 1 || !this.Z0 || !"TimeMovingPlay".equals(this.p.mMediaPlayContext.getFrom()) || !ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "disableFFmpegUseSurfaceView", "true"))) {
                z2 = false;
            } else {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "rebuildRenderView for FFmpegDecoder + SurfaceView");
                z2 = true;
            }
            if (z || z2) {
                this.R0 = true;
                this.Q0 = true;
                this.Z0 = false;
                h1();
            }
            if (TextUtils.isEmpty(this.s0)) {
                rgi rgiVar7 = this.n;
                if (rgiVar7.e != 3) {
                    rgiVar7.e = 8;
                    rgiVar7.d = false;
                }
            }
        }
        if (((this.M0 || this.N0) && this.O0) || this.P0) {
            h1();
            this.P0 = false;
        }
        this.p.setWarmupFlag(false);
    }

    public final boolean w0(String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56b306ee", new Object[]{this, str})).booleanValue();
        }
        if (I1.isEmpty()) {
            int i = 0;
            while (true) {
                String[] strArr = MediaPlayControlContext.PRIORITY_OF_NEW_DEFINITION;
                if (i >= strArr.length) {
                    break;
                }
                I1.put(strArr[i], Integer.valueOf(i));
                i++;
            }
        }
        boolean z2 = MediaConstant.DEFINITION_UD.equals(str) || MediaConstant.DEFINITION_UD_60.equals(str);
        if (TextUtils.isEmpty(this.J0) || TextUtils.isEmpty(str)) {
            return z2;
        }
        HashMap<String, Integer> hashMap = I1;
        if (!hashMap.containsKey(this.J0) || !hashMap.containsKey(str)) {
            return z2;
        }
        if (hashMap.get(this.J0).intValue() > hashMap.get(str).intValue()) {
            z = true;
        }
        return z;
    }

    public void y1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4aa802", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e(this.x1, "SeamlessSwitch TextureVideoView seamlessSwitchStream");
        if (this.n.f instanceof TaobaoMediaPlayer) {
            this.Z = true;
            this.a0 = System.currentTimeMillis();
            if (this.p != null) {
                feh fehVar = this.x1;
                AVSDKLog.e(fehVar, "SeamlessSwitch sub stream set surface ok " + this.Y);
            }
            if (ja1.h0(this.l) || T1(this.p.mMediaPlayContext.mSelectedUrlName)) {
                if (this.Y) {
                    this.X = true;
                    View Q0 = Q0();
                    if (Q0 != null) {
                        Q0.setVisibility(0);
                        com.taobao.mediaplay.player.c cVar = this.H;
                        if (cVar instanceof MediaTextureView) {
                            ((ViewGroup) ((MediaTextureView) cVar).getParent()).addView(Q0, 0, new FrameLayout.LayoutParams(-2, -2, 17));
                        } else if (cVar instanceof MediaSurfaceView) {
                            ((ViewGroup) ((MediaSurfaceView) cVar).getParent()).addView(Q0, 0, new FrameLayout.LayoutParams(-2, -2, 17));
                        }
                    }
                }
                boolean z2 = this.p.mMediaPlayContext.mSwitchingLower;
                if (ja1.h0(this.l)) {
                    ((TaobaoMediaPlayer) this.n.f).setSeamlessSwitchOption(this.Y ? 1 : 0, z, false);
                    if (!this.Y) {
                        ((TaobaoMediaPlayer) this.n.f).seamlessSwitchStream(null);
                    }
                } else if (t() != null) {
                    ((TaobaoMediaPlayer) this.n.f).updateSeamlessSwitchStatus(0, "0");
                    ((TaobaoMediaPlayer) this.n.f).setSeamlessSwitchOption(this.Y ? 1 : 0, z, z2);
                    if (!this.Y) {
                        ((TaobaoMediaPlayer) this.n.f).seamlessSwitchStream(null);
                    }
                } else {
                    I(null, 724L, 0L, 0L, null);
                }
            } else {
                AVSDKLog.e(this.x1, "setSeamlessSwitchUrlAndName failed");
            }
        } else {
            AVSDKLog.e(this.x1, "SeamlessSwitch TextureVideoView seamlessSwitchStream fail for not TaobaoMediaPlayer");
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        rgi rgiVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.L0 && this.Z) {
            this.Z = false;
            this.p.mMediaPlayContext.mSeamlessSwitchingSelectName = null;
            this.a0 = 0L;
            this.b0 = false;
            this.X = false;
            if (!TextUtils.isEmpty(this.I0)) {
                c1("-1", this.I0, this.p.mMediaPlayContext.mSeamlessSwitchingSelectName, "{\"msg\":\"rtc switch fail\", \"error\":-4}");
                this.I0 = null;
                this.p.mMediaPlayContext.mSwitchingPlayerQualityItem = null;
            }
        }
        if (this.p != null) {
            feh fehVar = this.x1;
            AVSDKLog.e(fehVar, "onError##VideoOnError >>> what: " + i + ", extra :" + i2 + ",videoURL:" + this.g);
        }
        K0();
        this.u0 = false;
        this.p.setWarmupLevel(1);
        this.Z = false;
        if (!(this.F1 || (rgiVar = this.n) == null || rgiVar.f == null)) {
            if (rgiVar.d) {
                rgiVar.d = false;
            }
            pgi.n().j();
            String videoDefinition = this.p.mMediaPlayContext.getVideoDefinition();
            MediaContext mediaContext = this.p;
            boolean s = (mediaContext.mMediaPlayContext == null || mediaContext.getControlParams() == null) ? false : ew0.s(this.p.getControlParams().get("notRetryForPrePlay"));
            if (this.n.f instanceof TaobaoMediaPlayer) {
                feh fehVar2 = this.x1;
                AVSDKLog.e(fehVar2, "shengjian::mMaxRenderInterval3 before" + this.s1);
                this.s1 = Math.max(this.s1, ((TaobaoMediaPlayer) this.n.f).getMaxRenderInterval());
                feh fehVar3 = this.x1;
                AVSDKLog.e(fehVar3, "shengjian::mMaxRenderInterval3 after" + this.s1);
            }
            this.t1 = true;
            this.r1 = this.q1;
            h2(i);
            boolean a2 = cq.a();
            if (ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "testForceRetryRtcOnce", "false"))) {
                this.p.mMediaPlayContext.mDegradeToFlvByArtoSoNoReady = true;
                AVSDKLog.e(this.x1, "testForceRetryRtcOnce success");
            }
            if (ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "forceRetryRtcOnce", "false")) && a2 && this.p.mMediaPlayContext.mDegradeToFlvByArtoSoNoReady) {
                AVSDKLog.e(this.x1, "Degrade flv by no artc so, but load so finished when error");
                this.p.mMediaPlayContext.mDegradeToFlvByArtoSoNoReady = false;
                z = true;
            }
            if (this.p.mScenarioType == 0 && !TextUtils.isEmpty(this.g) && ((!this.g.contains(".flv") || z) && !s && !this.J1)) {
                this.n.e = 3;
                this.P0 = true;
                this.R0 = true;
                if (z) {
                    D();
                    this.J1 = true;
                    H1(14);
                    AVSDKLog.e(this.x1, "finish Reselect url");
                    return true;
                }
                if (!TextUtils.isEmpty(videoDefinition) && videoDefinition.contains("266")) {
                    this.p.mMediaPlayContext.mHasVVCErrorEver = true;
                }
                if (E(i, i2)) {
                    feh fehVar4 = this.x1;
                    AVSDKLog.e(fehVar4, "notifyMediaRetry##VideoOnError >>> what: " + i + ", extra :" + i2 + ",videoURL:" + this.g);
                    return true;
                }
            }
            this.P0 = true;
            this.R0 = true;
            this.p.mMediaPlayContext.mLastPlayError = i;
            H(iMediaPlayer, i, i2);
        }
        return true;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        rgi rgiVar;
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
        } else if (!this.F1 && (rgiVar = this.n) != null && rgiVar.f != null) {
            if (this.p != null) {
                feh fehVar = this.x1;
                AVSDKLog.e(fehVar, "onPrepared##PlayState:" + this.n.e);
            }
            try {
                if (!(this.n.i == 0.0f || this.o0 == null || this.t0)) {
                    p1(MessageID.onPrepared);
                }
            } catch (Throwable unused) {
            }
            if (w1()) {
                rgi rgiVar2 = this.n;
                if (rgiVar2.d) {
                    int i = rgiVar2.c;
                    if (i == 2) {
                        rgiVar2.e = 2;
                    } else if (i == 4) {
                        rgiVar2.e = 4;
                    } else if (i == 1) {
                        C1();
                        if (this.E1) {
                            Q();
                        } else {
                            L();
                        }
                    } else if (i == 5) {
                        M(iMediaPlayer);
                    }
                    this.n.d = false;
                    p0(-1);
                    this.E1 = false;
                    return;
                }
            }
            if (!this.G) {
                M(iMediaPlayer);
            }
            MediaPlayControlContext mediaPlayControlContext = this.p.mMediaPlayContext;
            int i2 = mediaPlayControlContext.mSeekWhenPrepared;
            if (i2 != 0) {
                d0(i2, false, mediaPlayControlContext.mSeekIgnorePauseStateWhenPrepared);
                MediaPlayControlContext mediaPlayControlContext2 = this.p.mMediaPlayContext;
                mediaPlayControlContext2.mSeekWhenPrepared = 0;
                mediaPlayControlContext2.mSeekIgnorePauseStateWhenPrepared = false;
            }
            int i3 = this.t;
            if (i3 == 1 && this.n.f != null && this.I) {
                a1();
                this.n.f.start();
                Q();
                C1();
            } else if ((i3 != 1 || !this.I) && this.n.f != null) {
                AVSDKLog.e(this.x1, "yezo:pause in mTargetState != MediaPlayState.PLAYING ");
                this.n.f.pause();
            }
            rgi rgiVar3 = this.n;
            int i4 = rgiVar3.b;
            if (i4 > 0 && (abstractMediaPlayer = rgiVar3.f) != null) {
                z1(abstractMediaPlayer, i4);
            }
        }
    }

    public void Z1(int i, String str) {
        AbstractMediaPlayer abstractMediaPlayer;
        boolean z;
        int i2;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be6cf22", new Object[]{this, new Integer(i), str});
            return;
        }
        this.K0 = i;
        rgi rgiVar = this.n;
        if (rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null || !(abstractMediaPlayer instanceof TaobaoMediaPlayer) || this.p.mMediaPlayContext.mPlayerQualityItem == null || TextUtils.isEmpty(str)) {
            c1("-1", str, "", "{\"msg\":\"error when init\", \"error\":-5}");
            return;
        }
        boolean w0 = w0(str);
        if (!this.Z) {
            String c2 = nfi.c(((TaobaoMediaPlayer) this.n.f).getPlayUrl());
            MediaPlayControlContext mediaPlayControlContext = this.p.mMediaPlayContext;
            PlayerQualityItem playerQualityItem = mediaPlayControlContext.mPlayerQualityItem;
            int i3 = playerQualityItem.index;
            String str2 = playerQualityItem.newDefinition;
            if (str2 == null) {
                str2 = "";
            }
            ArrayList<QualityLiveItem> arrayList = mediaPlayControlContext.mMediaLiveInfo.liveUrlList;
            int i4 = -1;
            QualityLiveItem qualityLiveItem = null;
            if (arrayList != null) {
                int i5 = 0;
                boolean z3 = true;
                while (i5 < arrayList.size()) {
                    if (str.equals(arrayList.get(i5).newDefinition)) {
                        i4 = i5;
                        qualityLiveItem = arrayList.get(i5);
                    }
                    if (!this.P || TextUtils.isEmpty(arrayList.get(i5).newDefinition) || !c2.equals(nfi.c(arrayList.get(i5).rtcLiveUrl)) || i5 == i3) {
                        c2 = c2;
                        str2 = str2;
                        i2 = 1;
                    } else {
                        feh fehVar = this.x1;
                        c2 = c2;
                        StringBuilder sb = new StringBuilder("switchToNewDefinition stream index not consistent playingInex: ");
                        sb.append(i3);
                        sb.append(f7l.BRACKET_START_STR);
                        sb.append(str2);
                        str2 = str2;
                        sb.append("), realStreamIndex: ");
                        sb.append(i5);
                        sb.append(f7l.BRACKET_START_STR);
                        sb.append(arrayList.get(i5).newDefinition);
                        sb.append(f7l.BRACKET_END_STR);
                        AVSDKLog.e(fehVar, sb.toString());
                        i2 = 1;
                        z3 = false;
                    }
                    i5 += i2;
                }
                z = z3;
            } else {
                z = true;
            }
            if (qualityLiveItem == null || (i4 == i3 && z)) {
                c1("-1", str, "", "{\"msg\":\"error when can't select live item\", \"error\":-6}");
                feh fehVar2 = this.x1;
                AVSDKLog.e(fehVar2, "switchToNewDefinition error when can't select live item switchIndex:" + i4 + ", streamIndexConsistent:" + z);
                if (this.J && this.L && i + 1 == 2) {
                    ((TaobaoMediaPlayer) this.n.f).updateAbrRedundantRequestSwitchCount(w0);
                    return;
                }
                return;
            }
            String str3 = qualityLiveItem.rtcLiveUrl;
            this.p.mMediaPlayContext.pauseFrameLock(qualityLiveItem);
            if (!TextUtils.isEmpty(str3)) {
                this.p.mMediaPlayContext.mSeamlessSwitchingSelectName = MediaConstant.RTCLIVE_URL_NAME;
                if (str3.contains("&rtclive=1")) {
                    this.p.mMediaPlayContext.mSeamlessSwitchingVideoPath = str3.concat("&grtn_fix_ts_reset=off&ali_stream_jitter=0");
                } else {
                    this.p.mMediaPlayContext.mSeamlessSwitchingVideoPath = str3.concat("&grtn_fix_ts_reset=off&ali_stream_jitter=0&rtclive=1");
                }
                S1(this.p.mMediaPlayContext.mSeamlessSwitchingVideoPath, MediaConstant.RTCLIVE_URL_NAME);
                if (t() == null) {
                    I(null, 724L, 0L, 0L, null);
                    c1("-1", str, "", "{\"msg\":\"error when can't select switch url\", \"error\":-2}");
                    return;
                }
                this.Z = true;
                this.a0 = System.currentTimeMillis();
                this.X = true;
                this.I0 = str;
                PlayerQualityItem create = PlayerQualityItem.create(qualityLiveItem.name, qualityLiveItem.newName, qualityLiveItem.definition, qualityLiveItem.newDefinition, i4);
                create.current = true;
                this.p.mMediaPlayContext.mSwitchingPlayerQualityItem = create;
                StringBuilder sb2 = new StringBuilder("");
                int i6 = i + 1;
                sb2.append(i6);
                sb2.append("#");
                sb2.append(this.I0);
                ((TaobaoMediaPlayer) this.n.f).updateSeamlessSwitchStatus(0, sb2.toString());
                ((TaobaoMediaPlayer) this.n.f).updateLastStreamSelectReason(i6);
                ((TaobaoMediaPlayer) this.n.f).setSeamlessSwitchOption(1, true, false);
                ((TaobaoMediaPlayer) this.n.f)._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SWITCH_STREAM_TIMEOUT, ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", TaobaoMediaPlayer.ORANGE_SWITCH_STREAM_NEW_DEFIINITION_TIMEOUT, "2000")));
                if (this.Y) {
                    View Q0 = Q0();
                    if (Q0 != null) {
                        Q0.setVisibility(0);
                        com.taobao.mediaplay.player.c cVar = this.H;
                        if (cVar instanceof MediaTextureView) {
                            ((ViewGroup) ((MediaTextureView) cVar).getParent()).addView(Q0, 0, new FrameLayout.LayoutParams(-2, -2, 17));
                        } else if (cVar instanceof MediaSurfaceView) {
                            ((ViewGroup) ((MediaSurfaceView) cVar).getParent()).addView(Q0, 0, new FrameLayout.LayoutParams(-2, -2, 17));
                        }
                    }
                } else {
                    ((TaobaoMediaPlayer) this.n.f).switchToNewDefinition(i6, str);
                }
            } else {
                I(null, 724L, 0L, 0L, null);
                c1("-1", str, "", "{\"msg\":\"error when no rtclive and no bfrtc\", \"error\":-3}");
            }
        } else if (!this.J || !this.L || i + 1 != 2) {
            String str4 = this.I0;
            if (str4 == null) {
                str4 = "";
            }
            feh fehVar3 = this.x1;
            AVSDKLog.e(fehVar3, "switchToNewDefinition: " + str + ", currentSwitchingNewDefinition:" + str4 + ", rtcLiveAutoSwitch:" + this.L + ", reason:" + i);
            if (this.J) {
                c1("0", str, MediaConstant.RTCLIVE_URL_NAME, "{\"msg\":\"duplicate switch success\"}");
            } else {
                c1("-1", str, "", "{\"msg\":\"error when switching\", \"error\":-5}");
            }
        } else {
            boolean equals = str.equals(this.I0);
            if (w0 && !MediaConstant.DEFINITION_UD.equals(this.I0) && !MediaConstant.DEFINITION_UD_60.equals(this.I0)) {
                z2 = true;
            }
            feh fehVar4 = this.x1;
            AVSDKLog.e(fehVar4, "switchToNewDefinition: " + str + ", discard redundant abr request for duplicate_switch_at_switching:" + equals + ", up_switch_at_down_switching:" + z2);
            ((TaobaoMediaPlayer) this.n.f).updateAbrRedundantRequestSwitchCount(w0);
        }
    }

    public final void f1(AbstractMediaPlayer abstractMediaPlayer, r7t r7tVar) throws Throwable {
        gf4 gf4Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5510b0cf", new Object[]{this, abstractMediaPlayer, r7tVar});
            return;
        }
        P1(abstractMediaPlayer, r7tVar);
        MonitorMediaPlayer monitorMediaPlayer = (MonitorMediaPlayer) abstractMediaPlayer;
        if (monitorMediaPlayer.setConfig(r7tVar) != 0) {
            this.u1 = true;
            D();
            AVSDKLog.e(this.x1, "finish Reselect url");
        }
        monitorMediaPlayer.setExtInfo(this.o);
        MediaPlayControlContext mediaPlayControlContext = this.p.mMediaPlayContext;
        monitorMediaPlayer.setDegradeCode(mediaPlayControlContext.mDegradeCode, mediaPlayControlContext.mOriginSelectedUrlName);
        monitorMediaPlayer.setFirstRenderAdapter(this);
        monitorMediaPlayer.setInnerStartFuncListener(this);
        monitorMediaPlayer.setABtestAdapter(MediaAdapteManager.mABTestAdapter);
        monitorMediaPlayer.setNetworkUtilsAdapter(MediaAdapteManager.mMediaNetworkUtilsAdapter);
        monitorMediaPlayer.setH265AuthenStrategy(this.p.mMediaPlayContext.mH265AuthenStrategy);
        monitorMediaPlayer.setH264AuthenStrategy(this.p.mMediaPlayContext.mH264AuthenStrategy);
        monitorMediaPlayer.setAudioGainCoef(this.p.mMediaPlayContext.getAudioGainCoef());
        monitorMediaPlayer.setAudioGainEnable(this.p.mMediaPlayContext.getAudioGainEnable());
        abstractMediaPlayer.registerOnPreparedListener(this);
        abstractMediaPlayer.setOnVideoSizeChangedListener(this);
        abstractMediaPlayer.registerOnCompletionListener(this);
        abstractMediaPlayer.registerOnErrorListener(this);
        abstractMediaPlayer.setOnBufferingUpdateListener(this);
        abstractMediaPlayer.registerOnInfoListener(this);
        abstractMediaPlayer.registerOnLoopCompletionListener(this);
        long j = 0;
        if (abstractMediaPlayer instanceof NativeMediaPlayer) {
            ((NativeMediaPlayer) abstractMediaPlayer).setAudioStreamType(3);
        } else if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) abstractMediaPlayer;
            taobaoMediaPlayer._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SEND_SEI, 1L);
            if (this.t != 1 && !this.p.getPrepareToFirstFrame() && !this.p.getWarmupFlag()) {
                taobaoMediaPlayer._setPropertyLong(11007, 0L);
            }
            MediaPlayControlContext mediaPlayControlContext2 = this.p.mMediaPlayContext;
            if (mediaPlayControlContext2.mTBLive && r7tVar != null && r7tVar.d == 0 && mediaPlayControlContext2.isLowPerformance() && (gf4Var = MediaAdapteManager.mConfigAdapter) != null) {
                int u = ew0.u(gf4Var.getConfig(this.p.mMediaPlayContext.mConfigGroup, MediaConstant.ORANGE_LOW_DEVICE_FIRST_VIDEO_COUNT, ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE));
                int u2 = ew0.u(MediaAdapteManager.mConfigAdapter.getConfig(this.p.mMediaPlayContext.mConfigGroup, MediaConstant.ORANGE_LOW_DEVICE_FIRST_AUDIO_COUNT, "36"));
                if (this.p.mMediaPlayContext.getLowDeviceFirstRender()) {
                    if (u >= 5 && u < 20) {
                        taobaoMediaPlayer._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SOURCER_VIDEO_PIPE_START_COUNT, u);
                    }
                    if (u2 >= 9 && u2 < 36) {
                        taobaoMediaPlayer._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SOURCER_AUDIO_PIPE_START_COUNT, u2);
                    }
                }
            }
            if (this.p.mMediaPlayContext.getAvdataBufferedMaxMBytes() > 128 && 15360 > this.p.mMediaPlayContext.getAvdataBufferedMaxMBytes()) {
                taobaoMediaPlayer._setPropertyLong(40001, this.p.mMediaPlayContext.getAvdataBufferedMaxMBytes());
                r7tVar.v = "initMaxBuffer:" + this.p.mMediaPlayContext.getAvdataBufferedMaxMBytes() + "/maxLevel:" + this.p.mMediaPlayContext.getMaxLevel() + "/currentLevel:" + this.p.mMediaPlayContext.getCurrentLevel();
                r7tVar.w = String.format("%d KB", Integer.valueOf(this.p.mMediaPlayContext.getAvdataBufferedMaxMBytes() / 1024));
            }
            if (this.p.mMediaPlayContext.getAudioGainEnable()) {
                taobaoMediaPlayer._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ENABLE_AUDIO_GAIN_COEF, 1L);
                taobaoMediaPlayer._setPropertyFloat(12002, this.p.mMediaPlayContext.getAudioGainCoef());
                ja1.a(this.p.mMediaPlayContext.mContext);
                taobaoMediaPlayer._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ENABLE_AUDIO_GAIN_COEF_AB, ja1.D0 ? 1L : 0L);
            } else {
                taobaoMediaPlayer._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ENABLE_AUDIO_GAIN_COEF, 0L);
            }
            taobaoMediaPlayer._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ENABLE_USE_SET_VOLUME, 1L);
            AVSDKLog.e(this.x1, "enable use setVolume");
            if (r7tVar != null && r7tVar.h0) {
                taobaoMediaPlayer._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_FORCE_MUTE_MODE, 1L);
                AVSDKLog.e(this.x1, "enable videoMute");
            }
            Map<String, String> map = this.p.mMediaPlayContext.mHttpHeader;
            if (map != null) {
                taobaoMediaPlayer.setRequestHeader(map);
            }
            if (this.p.mMediaPlayContext.getAudioOffFlag()) {
                taobaoMediaPlayer.audioOff();
            }
        }
        if (this.r != null) {
            for (int i = 0; i < this.r.size(); i++) {
                int keyAt = this.r.keyAt(i);
                Long valueAt = this.r.valueAt(i);
                if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
                    ((TaobaoMediaPlayer) abstractMediaPlayer)._setPropertyLong(keyAt, valueAt != null ? valueAt.longValue() : 0L);
                }
            }
            this.r.clear();
        }
        if (this.s != null) {
            for (int i2 = 0; i2 < this.s.size(); i2++) {
                int keyAt2 = this.s.keyAt(i2);
                Float valueAt2 = this.s.valueAt(i2);
                if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
                    ((TaobaoMediaPlayer) abstractMediaPlayer)._setPropertyFloat(keyAt2, valueAt2 != null ? valueAt2.floatValue() : 0.0f);
                }
            }
            this.s.clear();
        }
        float f2 = this.n.i;
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        } else if (f2 >= 1.0f) {
            f2 = 1.0f;
        }
        abstractMediaPlayer.setVolume(f2, f2);
        if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
            TaobaoMediaPlayer taobaoMediaPlayer2 = (TaobaoMediaPlayer) abstractMediaPlayer;
            taobaoMediaPlayer2._setPropertyLong(80005, this.p.mMediaPlayContext.mDefinitionDeciseWindow);
            taobaoMediaPlayer2.setPlayingLiveDefinition(this.p.mMediaPlayContext.mSelectDefinition);
            MediaContext mediaContext = this.p;
            if (mediaContext.mScenarioType == 0 && MediaConstant.RTCLIVE_URL_NAME.equals(mediaContext.mMediaPlayContext.mSelectedUrlName)) {
                ja1.u();
                if (ja1.X) {
                    j = 1;
                }
                taobaoMediaPlayer2._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ENABLE_DETECT_TID_AND_ACTIVE_DROP_FRAME, j);
                taobaoMediaPlayer2._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ENABLE_CHECK_AVG_FPS, ja1.Y ? 1L : 0L);
                if (ja1.X) {
                    taobaoMediaPlayer2._setPropertyFloat(TaobaoMediaPlayer.FFP_PROP_FLOAT_DROP_PKT_COUNT_RESUME_STEP, ja1.T);
                    taobaoMediaPlayer2._setPropertyFloat(TaobaoMediaPlayer.FFP_PROP_FLOAT_DROP_PKT_COUNT_BASE_THRESHOLD, ja1.U);
                    taobaoMediaPlayer2._setPropertyFloat(TaobaoMediaPlayer.FFP_PROP_FLOAT_DROP_PKT_COUNT_ADVANCED_THRESHOLD, ja1.V);
                    taobaoMediaPlayer2._setPropertyFloat(TaobaoMediaPlayer.FFP_PROP_FLOAT_RESUME_PKT_COUNT_BASE_THRESHOLD, 0.0f);
                    taobaoMediaPlayer2._setPropertyFloat(TaobaoMediaPlayer.FFP_PROP_FLOAT_AVG_FPS_DIFF_THRESHOLD, ja1.W);
                }
                taobaoMediaPlayer2._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_DISABLE_RENDER_INVISIBLE_DROP_BY_TID, ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_RENDER_INVISIBLE_DROP_BY_TID, "false")) ? 1L : 0L);
                boolean s = ew0.s(ja1.K(this.l, "DWInteractive", MediaConstant.ORANGE_ENABLE_UP_DOWN_GRADUAL_VOLUME, "true"));
                if (sj4.VIDEO_ACTION_TYPE_UPDOWNSWITCH.equals(r7tVar.T.get("liveActionType")) && s) {
                    this.L1 = true;
                    taobaoMediaPlayer2._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_GRADUAL_VOLUME_ENABLE, 1L);
                    taobaoMediaPlayer2._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_GRADUAL_VOLUME_TIME, 200L);
                    AVSDKLog.e(this.x1, "prepareAysnc updownSwitch, enable gradual time:200ms");
                }
            } else if (this.p.mScenarioType == 2) {
                taobaoMediaPlayer2._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ENABLE_SEEK_PKT_DROP, ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_SEEK_PKT_DROP, "false")) ? 0L : 1L);
                taobaoMediaPlayer2._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ENABLE_SEEK_PKT_TID_DROP, ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_SEEK_PKT_DROP_BY_TID, "true")) ? 0L : 1L);
            }
        }
        abstractMediaPlayer.setDataSource(t());
        AVSDKLog.e(this.x1, "prepareAysnc mMediaPlayer=" + this.n.f + ", mediaPlayer=" + abstractMediaPlayer);
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.a1;
        N0(abstractMediaPlayer, i3, i4, i5, i5);
        G0(abstractMediaPlayer, l());
        abstractMediaPlayer.setScreenOnWhilePlaying(true);
        if (this.n.d) {
            this.q0 = System.currentTimeMillis();
        }
        abstractMediaPlayer.prepareAsync();
    }

    public d(MediaContext mediaContext) {
        this(mediaContext, null);
    }
}
