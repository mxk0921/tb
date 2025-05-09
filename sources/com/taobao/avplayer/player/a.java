package com.taobao.avplayer.player;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.player.DWTextureView;
import com.taobao.media.DWViewUtil;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.media.MediaSystemUtils;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.mediaplay.player.MediaSurfaceView;
import com.taobao.mediaplay.player.MediaTextureView;
import com.taobao.mediaplay.player.a;
import com.taobao.mediaplay.player.c;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.uc.webview.export.media.CommandID;
import com.uc.webview.export.media.MessageID;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.aot;
import tb.atb;
import tb.b75;
import tb.bot;
import tb.c2v;
import tb.c32;
import tb.dfi;
import tb.dq;
import tb.ew0;
import tb.feh;
import tb.fub;
import tb.gf4;
import tb.izq;
import tb.ja1;
import tb.nj9;
import tb.pgi;
import tb.pmm;
import tb.pnt;
import tb.psb;
import tb.qbi;
import tb.qnt;
import tb.r7t;
import tb.rgi;
import tb.rnt;
import tb.t2o;
import tb.tfb;
import tb.ttb;
import tb.x3r;
import tv.danmaku.ijk.media.player.AbstractMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;
import tv.danmaku.ijk.media.player.NativeMediaPlayer;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a extends c32 implements rgi.a, a.AbstractC0594a, TextureView.SurfaceTextureListener, IMediaPlayer.OnPreCompletionListener, IMediaPlayer.OnLoopCompletionListener, Handler.Callback, nj9, InnerStartFuncListener, c.a, DWTextureView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int R0 = 200;
    public static int S0 = 0;
    public final int A;
    public final boolean A0;
    public int B;
    public boolean B0;
    public boolean C;
    public boolean C0;
    public TextureView D;
    public boolean D0;
    public SurfaceTexture E;
    public long E0;
    public boolean F;
    public boolean F0;
    public boolean G;
    public boolean G0;
    public com.taobao.mediaplay.player.c H;
    public Surface H0;
    public c.b I;
    public Surface I0;
    public boolean J;
    public boolean J0;
    public Handler K;
    public SurfaceControl K0;
    public ttb L;
    public boolean L0;
    public boolean M;
    public final feh M0;
    public final boolean N;
    public int N0;
    public AudioManager O;
    public boolean O0;
    public com.taobao.mediaplay.player.a P;
    public boolean P0;
    public long Q;
    public boolean Q0;
    public long R;
    public final boolean S;
    public boolean T;
    public int U;
    public final String V;
    public boolean W;
    public boolean X;
    public final boolean Y;
    public final boolean Z;
    public boolean a0;
    public boolean b0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public long h0;
    public long i0;
    public long j0;
    public long k0;
    public boolean l0;
    public nj9 m0;
    public InnerStartFuncListener n0;
    public int o0;
    public final int p0;
    public final int q0;
    public boolean r0;
    public boolean s0;
    public int t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public List<fub> x0;
    public boolean y0;
    public boolean z0;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.avplayer.player.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class RunnableC0539a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0539a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ((Activity) a.this.l).getWindow().clearFlags(128);
            AVSDKLog.e(a.u0(a.this), "TextureVideoView , clearKeepScreenOn");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements IMediaPlayer.OnSeekCompletionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f10200a;

        public b(int i) {
            this.f10200a = i;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompletionListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a9f3179", new Object[]{this, iMediaPlayer});
                return;
            }
            a.w0(a.this, this.f10200a);
            a.x0(a.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AbstractMediaPlayer f10201a;

        public c(AbstractMediaPlayer abstractMediaPlayer) {
            this.f10201a = abstractMediaPlayer;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            feh u0 = a.u0(a.this);
            AVSDKLog.e(u0, "TextureVideoView: releasePlayer  in sub thread. " + this.f10201a);
            a.y0(a.this, this.f10201a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractMediaPlayer abstractMediaPlayer;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AVSDKLog.e(a.u0(a.this), "destroy player in ThreadPool");
                rgi rgiVar = a.this.n;
                if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
                    abstractMediaPlayer.release();
                    a.this.n = null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$avplayer$DWAspectRatio;

        static {
            int[] iArr = new int[DWAspectRatio.values().length];
            $SwitchMap$com$taobao$avplayer$DWAspectRatio = iArr;
            try {
                iArr[DWAspectRatio.DW_FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$avplayer$DWAspectRatio[DWAspectRatio.DW_CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$avplayer$DWAspectRatio[DWAspectRatio.DW_FIT_X_Y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(452985131);
        t2o.a(774897931);
        t2o.a(774897783);
        t2o.a(774898024);
        t2o.a(774898022);
        t2o.a(774897668);
        t2o.a(774898030);
        t2o.a(774897790);
        t2o.a(452985130);
    }

    public a(DWContext dWContext, boolean z, String str) {
        super(dWContext);
        this.A = 21;
        this.F = true;
        this.Q = 0L;
        this.R = 0L;
        this.S = true;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = false;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = true;
        this.h0 = 0L;
        this.i0 = 0L;
        this.j0 = 0L;
        this.k0 = -1L;
        this.l0 = false;
        this.p0 = 50;
        this.q0 = 1000;
        this.r0 = false;
        this.s0 = true;
        this.t0 = 0;
        this.u0 = true;
        this.y0 = false;
        this.z0 = true;
        this.A0 = true;
        this.B0 = true;
        this.C0 = false;
        this.D0 = false;
        this.E0 = 0L;
        this.F0 = false;
        this.G0 = false;
        this.N0 = 0;
        feh fehVar = new feh(toString(), dWContext.getPlayToken());
        this.M0 = fehVar;
        AVSDKLog.e(fehVar, "TextureVideoView new , normalVideo=" + z + " , " + str);
        DWContext dWContext2 = this.p;
        if (!(dWContext2 == null || dWContext2.getActivity() == null)) {
            n1();
            qbi qbiVar = this.k;
            if (qbiVar != null) {
                qbiVar.g(this.p.mPanoType);
            }
        }
        DWContext dWContext3 = this.p;
        if (!(dWContext3 == null || dWContext3.mConfigAdapter == null || TextUtils.isEmpty(dWContext3.mFrom))) {
            DWContext dWContext4 = this.p;
            if (((b75) dWContext4.mConfigAdapter).g(dWContext4.mFrom)) {
                this.A = 18;
            }
        }
        if (this.p.getActivity() != null) {
            this.O = (AudioManager) this.p.getActivity().getApplicationContext().getSystemService("audio");
        } else {
            Context context = this.p.mApplicationontext;
            if (context != null) {
                this.O = (AudioManager) context.getApplicationContext().getSystemService("audio");
            }
        }
        this.K = new Handler(this);
        this.N = z;
        if (!z) {
            R0 = 100;
        }
        this.V = str;
        if (TextUtils.isEmpty(str)) {
            str = ew0.d();
        } else {
            this.W = true;
        }
        K0(str);
        this.A0 = true;
        Z0();
        String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_LONG_AUDIO_FOCUS_SBT, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        if ((!TextUtils.isEmpty(config) && !TextUtils.isEmpty(this.p.mFrom) && ew0.n(this.p.mFrom, config)) || this.p.mUseShortAudioFocus) {
            this.Y = true;
        }
        String config2 = OrangeConfig.getInstance().getConfig("DWInteractive", "abandonFocusAtPauseSBT", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        if (TextUtils.isEmpty(config2) || TextUtils.isEmpty(this.p.mFrom) || !ew0.n(this.p.mFrom, config2)) {
            DWContext dWContext5 = this.p;
            if (!dWContext5.mUseShortAudioFocus || !dWContext5.mReleaseShortFocusWhenPause) {
                return;
            }
        }
        this.Z = true;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/player/TextureVideoView");
    }

    public static /* synthetic */ feh u0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("3cc31ad8", new Object[]{aVar});
        }
        return aVar.M0;
    }

    public static /* synthetic */ boolean v0(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4607495e", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.r0 = z;
        return z;
    }

    public static /* synthetic */ void w0(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c2b7f88", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.V0(i);
        }
    }

    public static /* synthetic */ void x0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1787693a", new Object[]{aVar});
        } else {
            aVar.m1();
        }
    }

    public static /* synthetic */ void y0(a aVar, AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57770976", new Object[]{aVar, abstractMediaPlayer});
        } else {
            aVar.c1(abstractMediaPlayer);
        }
    }

    public final void A0(IMediaPlayer iMediaPlayer, c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c482522", new Object[]{this, iMediaPlayer, bVar});
        } else if (iMediaPlayer != null) {
            if (bVar == null) {
                x1(iMediaPlayer, null);
            } else if (this.J0) {
                AVSDKLog.e(this.M0, "DW TextureVideoView bindSurfaceHolder start createControlSurfaceAndReparent");
                if (iMediaPlayer instanceof TaobaoMediaPlayer) {
                    H0(iMediaPlayer, (MediaSurfaceView) bVar.getRenderView());
                }
                AVSDKLog.e(this.M0, "DW TextureVideoView bindSurfaceHolder end createControlSurfaceAndReparent");
            } else {
                x1(iMediaPlayer, bVar.getSurface());
            }
        }
    }

    public void A1(boolean z) {
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
                AVSDKLog.e(this.M0, "dw texturevideoview updateMuteNodes error.");
            }
        }
    }

    @Override // tb.c32
    public boolean B() {
        rgi rgiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d3c247e", new Object[]{this})).booleanValue();
        }
        if (this.p.mPauseInBackground && (rgiVar = this.n) != null && !rgiVar.j && rgiVar.e == 2) {
            return true;
        }
        return false;
    }

    public void B0(Map<String, String> map) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f07861", new Object[]{this, map});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) abstractMediaPlayer).callWithMsg(map);
        }
    }

    public final void B1() {
        rgi rgiVar;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb0f9d", new Object[]{this});
        } else if (Q0() && (rgiVar = this.n) != null) {
            int i2 = rgiVar.e;
            if (i2 == 1 || (this.r0 && i2 == 2)) {
                this.r0 = false;
                if (this.N) {
                    int currentPosition = getCurrentPosition();
                    if (currentPosition >= 0) {
                        int i3 = i();
                        if (i3 > 0) {
                            Math.ceil(((currentPosition * 1.0f) / i3) * 1000.0f);
                            i = M0();
                        }
                        S(currentPosition, i, i3);
                        return;
                    }
                    return;
                }
                S(-1, -1, -1);
            }
        }
    }

    public final void C0(int i, int i2) {
        SurfaceControl.Transaction bufferSize;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12e56e8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (Build.VERSION.SDK_INT >= 29 && this.K0 != null) {
            bufferSize = aot.a().setBufferSize(this.K0, i, i2);
            bufferSize.apply();
        }
    }

    public final void C1() {
        int u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be241d0a", new Object[]{this});
            return;
        }
        DWContext dWContext = this.p;
        if (dWContext != null) {
            Map<String, String> customParams = dWContext.getCustomParams();
            if (customParams == null || customParams.isEmpty()) {
                customParams = this.p.getControlParams();
            }
            if (customParams != null && customParams.containsKey("_progressTime")) {
                String str = customParams.get("_progressTime");
                if (!TextUtils.isEmpty(str) && (u = ew0.u(str)) > 0) {
                    R0 = Math.min(this.q0, Math.max(this.p0, u));
                }
            }
        }
    }

    @Override // tb.c32
    public boolean D() {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0e63790", new Object[]{this})).booleanValue();
        }
        rgi rgiVar = this.n;
        if (rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null || !(abstractMediaPlayer instanceof MonitorMediaPlayer) || !((MonitorMediaPlayer) abstractMediaPlayer).isUseVideoCache()) {
            return false;
        }
        return true;
    }

    public void F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.M0, "TextureVideoView close");
        E0();
        d1();
        rgi rgiVar = this.n;
        rgiVar.e = 6;
        rgiVar.b = 0;
    }

    public void G0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f22ae", new Object[]{this, new Boolean(z)});
        } else if (z) {
            g1("controlAudioFocus");
            this.a0 = false;
        } else {
            t0("controlAudioFocus");
            this.a0 = true;
        }
    }

    public final AbstractMediaPlayer I0(r7t r7tVar) {
        NativeMediaPlayer nativeMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractMediaPlayer) ipChange.ipc$dispatch("743d08c5", new Object[]{this, r7tVar});
        }
        AVSDKLog.e(this.M0, "TextureVideoView , + degradeMediaPlayer");
        Context context = this.l;
        if (context == null) {
            context = this.m;
        }
        DWContext dWContext = this.p;
        if (dWContext == null || dWContext.mConfigAdapter == null) {
            nativeMediaPlayer = new NativeMediaPlayer(context);
        } else {
            nativeMediaPlayer = new NativeMediaPlayer(context, this.p.mConfigAdapter);
        }
        this.p.mPlayContext.setHardwareAvc(true);
        this.p.mPlayContext.setHardwareHevc(true);
        r7tVar.h = 1;
        r7tVar.g = 1;
        this.p.mPlayContext.setPlayerType(2);
        if (!TextUtils.isEmpty(this.p.mPlayContext.getBackupVideoUrl()) && this.p.mPlayContext.isH265()) {
            String backupVideoUrl = this.p.mPlayContext.getBackupVideoUrl();
            this.h = backupVideoUrl;
            this.p.mPlayContext.setVideoUrl(backupVideoUrl);
            this.p.mPlayContext.setH265(false);
            this.p.mPlayContext.setHighCachePath("");
            MediaPlayControlContext mediaPlayControlContext = this.p.mPlayContext;
            mediaPlayControlContext.setVideoDefinition(mediaPlayControlContext.getBackupVideoDefinition());
            MediaPlayControlContext mediaPlayControlContext2 = this.p.mPlayContext;
            mediaPlayControlContext2.setCacheKey(mediaPlayControlContext2.getBackupCacheKey());
            r7tVar.D = this.p.mPlayContext.getBackupVideoDefinition();
            r7tVar.r = this.p.mPlayContext.getBackupCacheKey();
            psb psbVar = this.p.mConfigAdapter;
            if (psbVar != null && ((b75) psbVar).j() && this.p.mPlayContext.getVideoLength() > 0 && this.p.mPlayContext.getVideoLength() < 262144000) {
                r7tVar.u = this.p.mPlayContext.getBackupVideoLength();
            }
        }
        return nativeMediaPlayer;
    }

    public c.b J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.b) ipChange.ipc$dispatch("da75b4c0", new Object[]{this});
        }
        return this.I;
    }

    public final void K0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("180bef5e", new Object[]{this, str});
            return;
        }
        if (ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "tempInstanceManager", "true"))) {
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", "playerInstanceManagerBlackList", "[\"Pop4\", \"topshow_festival\"]");
            DWContext dWContext = this.p;
            if (dWContext != null && config.contains(dWContext.mFrom)) {
                if (this.n == null) {
                    this.n = new rgi(str, this);
                    AVSDKLog.e(this.M0, "getMediaRecycler not PlayerInstanceManager");
                    return;
                }
                return;
            }
        }
        DWContext dWContext2 = this.p;
        if (!dWContext2.mBackgroundAudio || !dWContext2.mAudioOnly) {
            this.n = pgi.n().f(str, this);
        } else {
            this.n = dfi.n().f(str, this);
        }
    }

    public final void L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43a65327", new Object[]{this});
            return;
        }
        if (ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "tempInstanceManager", "true"))) {
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", "playerInstanceManagerBlackList", "[\"Pop4\", \"topshow_festival\"]");
            DWContext dWContext = this.p;
            if (dWContext != null && config.contains(dWContext.mFrom)) {
                return;
            }
        }
        DWContext dWContext2 = this.p;
        if (!dWContext2.mBackgroundAudio || !dWContext2.mAudioOnly) {
            this.n = pgi.n().g(this.n);
        } else {
            this.n = dfi.n().g(this.n);
        }
    }

    public int M0() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62eff19a", new Object[]{this})).intValue();
        }
        rgi rgiVar = this.n;
        if (!(rgiVar == null || rgiVar.f == null || (i = rgiVar.e) == 8 || i == 6 || i == 3 || i() <= 0)) {
            this.t0 = (int) (((this.n.f.getCurCachePosition() * 1000.0f) * 100.0f) / i());
        }
        return this.t0;
    }

    public final void N0() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23416bc", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.M0, "TextureVideoView , + initMediaPlayer");
        if (this.h == null) {
            return;
        }
        if (this.l != null || this.m != null) {
            rgi rgiVar = this.n;
            if (rgiVar != null && rgiVar.e == 3) {
                d1();
                this.n.f = null;
            }
            K0(this.n.f27360a);
            rgi rgiVar2 = this.n;
            if (rgiVar2.f == null) {
                rgiVar2.e = 0;
                rgiVar2.f = P0();
                qbi qbiVar = this.k;
                if (qbiVar != null) {
                    o1(qbiVar.b());
                }
                Surface surface = this.i;
                if (surface != null && this.j) {
                    x1(this.n.f, surface);
                }
            }
            if (!TextUtils.isEmpty(this.V)) {
                AVSDKLog.e(this.M0, "DWTextureVideoView setSurface in initMediaPlayer");
                if (this.D != null && l() != null) {
                    x1(this.n.f, l());
                } else if (!(this.H == null || J0() == null)) {
                    A0(this.n.f, J0());
                }
                h1(this.n.f);
            }
            u1(this.n.f);
            this.n.f.setLooping(this.M);
            n1();
            rgi rgiVar3 = this.n;
            if (rgiVar3 != null && (((i = rgiVar3.e) == 5 || i == 8 || i == 4 || i == 2 || i == 1) && this.F)) {
                rgiVar3.f.start();
                R(this.N);
                m1();
            }
            AVSDKLog.e(this.M0, "TextureVideoView , + initMediaPlayer finished");
        }
    }

    public void O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77cf44f3", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.M0, "TextureVideoView , initMediaPlayerAfterRecycle");
        rgi rgiVar = this.n;
        if (rgiVar.e != 8) {
            rgiVar.e = 0;
        }
        L0();
        rgi rgiVar2 = this.n;
        AbstractMediaPlayer abstractMediaPlayer = rgiVar2.f;
        if (abstractMediaPlayer == null) {
            rgiVar2.f = P0();
            this.n.e = 8;
            qbi qbiVar = this.k;
            if (qbiVar != null) {
                o1(qbiVar.b());
            }
        } else {
            u1(abstractMediaPlayer);
        }
        if (l() != null) {
            x1(this.n.f, l());
        }
        if (J0() != null) {
            A0(this.n.f, J0());
        }
        this.n.f.setLooping(this.M);
    }

    public boolean Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue();
        }
        if (this.p.mAudioOnly || this.j) {
            return true;
        }
        TextureView textureView = this.D;
        if (textureView != null) {
            return textureView.isAvailable();
        }
        com.taobao.mediaplay.player.c cVar = this.H;
        if (cVar != null) {
            return cVar.isAvailable();
        }
        return false;
    }

    @Override // tb.c32
    public void T(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        } else {
            P(dWVideoScreenType);
        }
    }

    public final void U0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585dc8d0", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, "TextureVideoView: , notifyVideoError, errorCode=" + i + ", extra=" + i2);
        try {
            H(null, i, i2);
        } catch (Throwable th) {
            feh fehVar2 = this.M0;
            AVSDKLog.e(fehVar2, "call notifyVideoError failed." + th);
        }
    }

    public final void V0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1099f95e", new Object[]{this, new Integer(i)});
            return;
        }
        List<fub> list = this.x0;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((fub) it.next()).onSeekCompletion(i);
            }
        }
    }

    public void W0(boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba74df4a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        I(null, 18L, j, 0L, null);
    }

    @Override // tb.c32
    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.M0, "TextureVideoView , prepareToFirstFrame ");
        this.P0 = false;
        this.y = true;
        this.q = 8;
        i1();
        rgi rgiVar = this.n;
        rgiVar.b = 0;
        if (rgiVar.d) {
            rgiVar.c = 5;
            O0();
            this.f0 = false;
            return;
        }
        if (this.u0) {
            this.p.setPrepareToFirstFrame(true);
        }
        if (a(this.n.e) && !TextUtils.isEmpty(this.h)) {
            if (!this.u0) {
                this.p.setPrepareToFirstFrame(true);
            }
            N0();
            if (TextUtils.isEmpty(this.V)) {
                rgi rgiVar2 = this.n;
                rgiVar2.e = 8;
                rgiVar2.d = false;
            }
        }
    }

    @Override // tb.c32
    public void Y() {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a8082e", new Object[]{this});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) abstractMediaPlayer).refreshScreen();
        }
    }

    public final void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d7907d", new Object[]{this});
        } else if (this.l != null && this.P == null) {
            this.P = new com.taobao.mediaplay.player.a(this, (Application) this.l.getApplicationContext());
        }
    }

    @Override // com.taobao.mediaplay.player.c.a
    public void a(c.b bVar, int i, int i2, int i3) {
        AbstractMediaPlayer abstractMediaPlayer;
        int i4;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65401429", new Object[]{this, bVar, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        String currentPageName = c2v.getInstance().getCurrentPageName();
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, "  onSurfaceChanged holder: " + bVar + ", format: " + i + ", width: " + i2 + ", height: " + i3 + ", currentPagename=" + currentPageName);
        v1();
        int i5 = this.c;
        if (i5 <= 0 || (i4 = this.d) <= 0 || (i5 == i2 && i4 == i3)) {
            z = false;
        }
        this.c = i2;
        this.d = i3;
        if (bVar.getRenderView() == this.H) {
            this.I = bVar;
            S0();
            rgi rgiVar = this.n;
            if (!(rgiVar == null || rgiVar.f == null || bVar.getSurface() == null)) {
                x1(this.n.f, bVar.getSurface());
            }
            rgi rgiVar2 = this.n;
            if (rgiVar2 != null && (abstractMediaPlayer = rgiVar2.f) != null && z) {
                abstractMediaPlayer.setSurfaceSize(i2, i3);
                C0(i2, i3);
            }
        }
    }

    public void a1(fub fubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d468be06", new Object[]{this, fubVar});
            return;
        }
        if (this.x0 == null) {
            this.x0 = new ArrayList();
        }
        if (!this.x0.contains(fubVar)) {
            this.x0.add(fubVar);
        }
    }

    public final void b1(AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5602ba16", new Object[]{this, abstractMediaPlayer});
            return;
        }
        AVSDKLog.e(this.M0, "TextureVideoView  releaseForInit");
        if (abstractMediaPlayer != null) {
            try {
                abstractMediaPlayer.release();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.taobao.mediaplay.player.c.a
    public void c(c.b bVar, int i, int i2) {
        boolean z;
        AbstractMediaPlayer abstractMediaPlayer;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f234966", new Object[]{this, bVar, new Integer(i), new Integer(i2)});
            return;
        }
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, " onSurfaceCreated width=" + i + ", height=" + i2 + ", mSurfaceWidth=" + this.c + ", mSurfaceHeight=" + this.d);
        String currentPageName = c2v.getInstance().getCurrentPageName();
        if (bVar != null) {
            feh fehVar2 = this.M0;
            AVSDKLog.e(fehVar2, " SeamlessSwitch onSurfaceCreated holder: " + bVar + ", surface: " + bVar.getSurface() + ", currentPagename=" + currentPageName);
        }
        this.w0 = true;
        if (this.e == 0) {
            this.e = System.currentTimeMillis();
        }
        v1();
        if (this.I == null || !this.G) {
            z = false;
        } else {
            z = true;
        }
        this.I = bVar;
        if (this.c == i && this.d == i2) {
            z2 = false;
        }
        this.c = i;
        this.d = i2;
        if (this.x || this.y) {
            rgi rgiVar = this.n;
            if (!rgiVar.d && rgiVar.e != 6 && rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
                if (z) {
                    x1(abstractMediaPlayer, null);
                }
                A0(this.n.f, J0());
                if (z2 && i > 0 && i2 > 0) {
                    this.n.f.setSurfaceSize(i, i2);
                    C0(i, i2);
                }
            }
        }
    }

    public final void c1(AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e788b980", new Object[]{this, abstractMediaPlayer});
        } else if (abstractMediaPlayer != null) {
            try {
                abstractMediaPlayer.stop();
                abstractMediaPlayer.release();
            } catch (Throwable unused) {
            }
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
        String currentPageName = c2v.getInstance().getCurrentPageName();
        if (bVar != null) {
            feh fehVar = this.M0;
            AVSDKLog.e(fehVar, " onSurfaceDestroyed holder: " + bVar + ", surface: " + bVar.getSurface() + ", currentPagename=" + currentPageName);
        }
        rgi rgiVar2 = this.n;
        int i = rgiVar2.e;
        if ((i == 5 || i == 4 || i == 2 || i == 1) && Build.VERSION.SDK_INT < com.taobao.mediaplay.player.d.H1) {
            if (!this.J0) {
                x1(rgiVar2.f, null);
            } else if (!this.L0) {
                x1(rgiVar2.f, null);
            }
            this.I = null;
        }
        if (z && (rgiVar = this.n) != null && (abstractMediaPlayer = rgiVar.f) != null && this.G) {
            if (!this.J0) {
                x1(abstractMediaPlayer, null);
            } else if (!this.L0) {
                x1(abstractMediaPlayer, null);
            }
            this.I = null;
        }
        this.n.b = getCurrentPosition();
    }

    public final void d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc10dfa", new Object[]{this});
            return;
        }
        if (ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "tempInstanceManager", "true"))) {
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", "playerInstanceManagerBlackList", "[\"Pop4\", \"topshow_festival\"]");
            DWContext dWContext = this.p;
            if (dWContext != null && config.contains(dWContext.mFrom)) {
                return;
            }
        }
        DWContext dWContext2 = this.p;
        if (!dWContext2.mBackgroundAudio || !dWContext2.mAudioOnly) {
            pgi.n().i(this.n.f27360a, this);
        } else {
            dfi.n().i(this.n.f27360a, this);
        }
    }

    @Override // tb.c32
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c335f2", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.M0, "TextureVideoView , asyncPrepare ");
        this.P0 = false;
        if (MediaSystemUtils.isApkDebuggable() && this.p != null) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "asyncPrepareVideo##PlayState:" + this.n.e);
        }
        this.y = true;
        this.q = 8;
        i1();
        rgi rgiVar = this.n;
        rgiVar.b = 0;
        if (rgiVar.d) {
            rgiVar.c = 5;
            O0();
            this.f0 = false;
        } else if (a(rgiVar.e) && this.i != null && !TextUtils.isEmpty(this.h)) {
            N0();
            if (TextUtils.isEmpty(this.V)) {
                rgi rgiVar2 = this.n;
                rgiVar2.e = 8;
                rgiVar2.d = false;
            }
        }
    }

    public final void e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca38426e", new Object[]{this});
            return;
        }
        Handler handler = this.K;
        if (handler != null) {
            handler.removeMessages(0);
        }
    }

    @Override // tb.c32
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.M0, "TextureVideoView , closeVideo");
        this.P0 = true;
        F0();
        F();
    }

    @Override // tb.c32
    public void f0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, "TextureVideoView , seekTo " + i);
        if (i >= 0) {
            e1();
            h0(i, false);
            int i2 = this.n.e;
            if ((i2 == 5 || i2 == 2 || i2 == 4 || i2 == 1) && !this.Q0) {
                Q(i);
            }
        }
    }

    public final void f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7523da98", new Object[]{this});
            return;
        }
        if (ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "tempInstanceManager", "true"))) {
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", "playerInstanceManagerBlackList", "[\"Pop4\", \"topshow_festival\"]");
            DWContext dWContext = this.p;
            if (dWContext != null && config.contains(dWContext.mFrom)) {
                return;
            }
        }
        DWContext dWContext2 = this.p;
        if (!dWContext2.mBackgroundAudio || !dWContext2.mAudioOnly) {
            pgi.n().j();
        } else {
            dfi.n().j();
        }
    }

    @Override // tb.c32
    public void g0(int i, boolean z, boolean z2) {
        rgi rgiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c54c69", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            return;
        }
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, "TextureVideoView , seekTo " + i + ", pause " + z);
        if (i >= 0 && (rgiVar = this.n) != null && rgiVar.f != null) {
            e1();
            l1(i, z, z2);
            if (z) {
                this.n.e = 2;
            }
            int i2 = this.n.e;
            if ((i2 == 5 || i2 == 2 || i2 == 4 || i2 == 1) && !this.Q0) {
                Q(i);
            }
        }
    }

    public final void g1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76f36e62", new Object[]{this, str});
        } else if (this.p.mNeedRequestAudio) {
            try {
                if (this.n.i > 0.0f && this.O != null && !this.X) {
                    if (this.Y) {
                        AVSDKLog.e(this.M0, "TextureVideoView ," + str + ", sbt=" + this.p.mFrom + " only request short AudioFocus with mVolume: " + this.n.i);
                        x3r.j(this.l).h(null, 2);
                    } else {
                        AVSDKLog.e(this.M0, "TextureVideoView ," + str + ", sbt=" + this.p.mFrom + " request long AudioFocus with mVolume: " + this.n.i);
                        x3r.j(this.l).h(null, 1);
                        this.b0 = true;
                    }
                    this.X = true;
                    this.c0++;
                }
            } catch (Throwable th) {
                AVSDKLog.e(this.M0, "TextureVideoView  RequestAudioFocus error" + th.getMessage());
            }
        }
    }

    @Override // tb.c32, tb.rgi.a
    public int getCurrentPosition() {
        int i;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        rgi rgiVar = this.n;
        if (rgiVar == null || (i = rgiVar.e) == 7 || i == 8 || i == 6 || i == 3) {
            return this.g;
        }
        AbstractMediaPlayer abstractMediaPlayer = rgiVar.f;
        if (abstractMediaPlayer == null) {
            j = this.g;
        } else {
            j = abstractMediaPlayer.getCurrentPosition();
        }
        int i2 = (int) j;
        this.g = i2;
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c800e8a", new Object[]{this})).longValue();
        }
        InnerStartFuncListener innerStartFuncListener = this.n0;
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
        nj9 nj9Var = this.m0;
        if (nj9Var != null) {
            return nj9Var.getStartTime();
        }
        return this.Q;
    }

    @Override // tb.c32
    public float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b371754", new Object[]{this})).floatValue();
        }
        return this.k.c();
    }

    @Override // tb.c32
    public void h0(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5fb7a56", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, "TextureVideoView , seekToWithoutNotify " + i + " " + z);
        int i2 = this.n.e;
        if (i2 == 5 || i2 == 2 || i2 == 4 || i2 == 1) {
            if (i > i()) {
                i = i();
            }
            if (z) {
                this.n.f.instantSeekTo(i);
            } else {
                this.n.f.seekTo(i);
            }
            this.n.f.setOnSeekCompleteListener(new b(i));
        }
    }

    public final void h1(IMediaPlayer iMediaPlayer) {
        qbi qbiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491db11f", new Object[]{this, iMediaPlayer});
        } else if (this.l != null) {
            this.f16808a = iMediaPlayer.getVideoWidth();
            int videoHeight = iMediaPlayer.getVideoHeight();
            this.b = videoHeight;
            int i = this.f16808a;
            if (i > 0 && videoHeight > 0 && (qbiVar = this.k) != null) {
                qbiVar.k(i, videoHeight);
                int videoSarNum = iMediaPlayer.getVideoSarNum();
                int videoSarDen = iMediaPlayer.getVideoSarDen();
                if (videoSarNum > 0 && videoSarDen > 0) {
                    if (this.D != null) {
                        this.k.j(videoSarNum, videoSarDen);
                    } else {
                        com.taobao.mediaplay.player.c cVar = this.H;
                        if (cVar != null) {
                            cVar.setVideoSampleAspectRatio(videoSarNum, videoSarDen);
                        }
                    }
                }
                TextureView textureView = this.D;
                if (textureView != null) {
                    textureView.requestLayout();
                    return;
                }
                com.taobao.mediaplay.player.c cVar2 = this.H;
                if (cVar2 != null) {
                    ((View) cVar2).requestLayout();
                }
            }
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
            B1();
            if (!(s() == 3 || s() == 6 || s() == 7 || s() == 4 || (handler = this.K) == null)) {
                handler.sendEmptyMessageDelayed(0, R0);
            }
        } else if (i == 1 && !this.w0) {
            I(null, 12120L, 500L, 0L, null);
        }
        return false;
    }

    @Override // tb.c32
    public int i() {
        AbstractMediaPlayer abstractMediaPlayer;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        rgi rgiVar = this.n;
        int i = rgiVar.e;
        if ((i == 5 || i == 1 || i == 4 || i == 2) && (abstractMediaPlayer = rgiVar.f) != null) {
            int i2 = this.B;
            if (i2 <= 0) {
                j = abstractMediaPlayer.getDuration();
            } else {
                j = i2;
            }
            this.B = (int) j;
        }
        return this.B;
    }

    @Override // tb.c32
    public void i0(float f, float f2, float f3) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66bab26e", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) abstractMediaPlayer).setFov(f, f2, f3);
        }
    }

    public void i1() {
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

    @Override // tb.rgi.a
    public boolean isPlaying() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        rgi rgiVar = this.n;
        AbstractMediaPlayer abstractMediaPlayer = rgiVar.f;
        if (abstractMediaPlayer == null || (i = rgiVar.e) == 0 || i == 8 || i == 7 || i == 3 || i == 6) {
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
        com.taobao.mediaplay.player.c cVar = this.H;
        if (cVar == null) {
            return false;
        }
        if (cVar.getView().getVisibility() == 0 || this.H.getView().getGlobalVisibleRect(rect)) {
            return true;
        }
        return false;
    }

    @Override // tb.c32
    public Map<String, String> j() {
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

    @Override // tb.c32
    public void k0(boolean z) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c734b1", new Object[]{this, new Boolean(z)});
            return;
        }
        this.M = z;
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
            abstractMediaPlayer.setLooping(z);
        }
    }

    public boolean k1() {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bbad7ba", new Object[]{this})).booleanValue();
        }
        rgi rgiVar = this.n;
        if (!(rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null)) {
            int i = rgiVar.c;
            if (i == 2) {
                abstractMediaPlayer.seekTo(rgiVar.b);
                return true;
            } else if (i == 4) {
                abstractMediaPlayer.seekTo(rgiVar.b);
                return true;
            } else if (i == 1) {
                abstractMediaPlayer.seekTo(rgiVar.b);
                this.n.f.start();
                return true;
            }
        }
        return false;
    }

    public final void l1(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8536d9", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            return;
        }
        int i2 = this.n.e;
        if (i2 == 5 || i2 == 2 || i2 == 4 || i2 == 1) {
            if (i > i()) {
                i = i();
            }
            AbstractMediaPlayer abstractMediaPlayer = this.n.f;
            if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
                ((TaobaoMediaPlayer) abstractMediaPlayer).seekTo(i, z, z2);
            }
            this.n.f.setOnSeekCompleteListener(new bot(this, i));
        }
    }

    @Override // tb.c32
    public void m0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f)});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && rgiVar.f != null) {
            feh fehVar = this.M0;
            AVSDKLog.e(fehVar, "TextureVideoView setPlayRate " + f);
            this.n.f.setPlayRate(f);
        }
    }

    public final void m1() {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f260b5ea", new Object[]{this});
        } else if (s() != 3 && s() != 6 && s() != 7 && s() != 4 && (handler = this.K) != null) {
            handler.removeCallbacksAndMessages(null);
            this.K.sendEmptyMessageDelayed(0, R0);
        }
    }

    public final void n1() {
        DWContext dWContext;
        DWAspectRatio videoAspectRatio;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d20db0d8", new Object[]{this});
        } else if (this.k != null && (dWContext = this.p) != null && (videoAspectRatio = dWContext.getVideoAspectRatio()) != null) {
            feh fehVar = this.M0;
            AVSDKLog.e(fehVar, "TextureVideoView setAspectRatio " + videoAspectRatio);
            int i = e.$SwitchMap$com$taobao$avplayer$DWAspectRatio[videoAspectRatio.ordinal()];
            if (i == 1) {
                this.k.f(0);
                o1(0);
            } else if (i == 2) {
                this.k.f(1);
                o1(1);
            } else if (i == 3) {
                this.k.f(3);
            }
        }
    }

    @Override // tb.c32
    public void o0(float f) {
        rgi rgiVar;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a5bb934", new Object[]{this, new Float(f)});
            return;
        }
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, "TextureVideoView , + setSysVolume " + f);
        try {
            AudioManager audioManager = this.O;
            if (audioManager != null && (rgiVar = this.n) != null && (i = rgiVar.e) != 7 && i != 3) {
                audioManager.setStreamVolume(3, (int) f, 4);
            }
        } catch (Throwable th) {
            feh fehVar2 = this.M0;
            AVSDKLog.e(fehVar2, "TextureVideoView setSysVolume##SetStreamVolume error" + th.getMessage());
        }
    }

    public final void o1(int i) {
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
    public void onActivityPaused(Activity activity) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        DWContext dWContext = this.p;
        if (dWContext == null || !dWContext.mBackgroundVideo) {
            z = false;
        } else {
            z = true;
        }
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, "TextureVideoView onActivityPaused , " + activity + ", " + z + ", " + this.l);
        if (!z && this.l == activity) {
            this.F = false;
            rgi rgiVar = this.n;
            if (rgiVar != null && rgiVar.f != null) {
                int i = rgiVar.e;
                if (i == 1 || i == 5) {
                    V(true);
                }
            }
        }
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityResumed(Activity activity) {
        Window window;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        DWContext dWContext = this.p;
        if (dWContext != null && dWContext.mBackgroundVideo) {
            z = true;
        }
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, "TextureVideoView onActivityResumed , " + activity + ", " + z + ", " + this.l);
        if (!z && this.l == activity) {
            this.F = true;
            rgi rgiVar = this.n;
            if (rgiVar == null || !rgiVar.d) {
                if (!(rgiVar == null || rgiVar.f == null || !rgiVar.j || !this.x || rgiVar.e == 4)) {
                    W();
                }
                DWContext dWContext2 = this.p;
                if (dWContext2 == null) {
                    return;
                }
                if (dWContext2.screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || this.p.screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                    if (this.p.getWindow() == null) {
                        window = this.p.getActivity().getWindow();
                    } else {
                        window = this.p.getWindow();
                    }
                    DWViewUtil.hideNavigationBar(window);
                    return;
                }
                return;
            }
            if (A()) {
                rgi rgiVar2 = this.n;
                if (rgiVar2.c == 2) {
                    rgiVar2.c = 1;
                }
            }
            boolean j1 = j1();
            if (this.n.c == 1 && j1) {
                O0();
            }
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

    @Override // com.taobao.mediaplay.player.c.a
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        this.v0 = true;
        Handler handler = this.K;
        if (handler != null && !this.w0) {
            handler.sendEmptyMessageDelayed(1, 500L);
        }
        AVSDKLog.e(this.M0, "TextureVideoView , + onAttachedToWindow");
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f723554e", new Object[]{this, iMediaPlayer, new Integer(i)});
        }
    }

    @Override // com.taobao.mediaplay.player.c.a
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.M0, "DW TextureVideoView , + onDetachedFromWindow");
        com.taobao.mediaplay.player.c cVar = this.H;
        if (cVar != null && (cVar.getView() instanceof SurfaceView) && ((MediaSurfaceView) this.H).getSurfaceDestroyed()) {
            ((MediaSurfaceView) this.H).releaseSurfaceControl();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        rgi rgiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, "TextureVideoView , " + iMediaPlayer + " onInfo >>> what: " + i + ", extra :" + i2 + " videoURL: " + this.h);
        E0();
        this.f0 = false;
        if (!(this.Q0 || (rgiVar = this.n) == null || rgiVar.f == null)) {
            if (rgiVar.d) {
                rgiVar.d = false;
            }
            f1();
            AbstractMediaPlayer abstractMediaPlayer = this.n.f;
            if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
                this.k0 = Math.max(this.k0, ((TaobaoMediaPlayer) abstractMediaPlayer).getMaxRenderInterval());
            }
            this.l0 = true;
            this.j0 = this.i0;
            if (i == -5 || i == -110) {
                rgi rgiVar2 = this.n;
                rgiVar2.e = 3;
                if (this.B0) {
                    if (rgiVar2.f.getCurrentPosition() > 0) {
                        feh fehVar2 = this.M0;
                        AVSDKLog.e(fehVar2, "TextureVideoView getCurrentPosition is " + this.n.f.getCurrentPosition());
                        this.p.mStartPos = (int) this.n.f.getCurrentPosition();
                    }
                    this.C0 = true;
                    this.B0 = false;
                }
            }
            this.N0 = i;
            if (E(i, i2)) {
                return true;
            }
            H(iMediaPlayer, i, i2);
        }
        return true;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        long j4;
        long j5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (j != 740) {
            AVSDKLog.e(this.M0, "TextureVideoView , " + iMediaPlayer + " onInfo >>> what: " + j + ", extra :" + j2 + ", ext: " + j3 + ", object: " + obj);
        }
        if (3 == j) {
            HashMap hashMap = new HashMap();
            hashMap.put("RENDER_START_TIME", Long.valueOf(this.Q));
            if (this.Q != 0) {
                j4 = j2 > 0 ? j2 : System.currentTimeMillis();
            } else {
                j4 = 0;
            }
            this.g0 = true;
            if (this.h0 == 0) {
                this.h0 = System.currentTimeMillis();
            }
            if (!this.l0 || this.j0 <= 0) {
                j5 = 0;
            } else {
                this.k0 = Math.max(this.k0, System.currentTimeMillis() - this.j0);
                j5 = 0;
                this.j0 = 0L;
            }
            hashMap.put("RENDER_END_TIME", Long.valueOf(j4));
            if (this.e > j5) {
                AVSDKLog.e(this.M0, "mSurfaceAvailableTs is " + this.e);
                hashMap.put("SurfaceAvailableTs", Long.valueOf(this.e));
            }
            if (this.F0) {
                AVSDKLog.e(this.M0, "mSetupDecoderEarly is " + this.F0);
                hashMap.put("SetupDecoderEarly", 1L);
            }
            if (this.G0) {
                AVSDKLog.e(this.M0, "mOpenDeviceEarly is " + this.F0);
                hashMap.put("OpenDeviceEarly", 1L);
            }
            if (this.f > 0) {
                AVSDKLog.e(this.M0, "mFirstSetVideoPathTs is " + this.f);
                hashMap.put("FirstSetVideoPathTs", Long.valueOf(this.f));
            }
            DWContext dWContext = this.p;
            if (!(dWContext == null || dWContext.mPlayContext == null)) {
                AVSDKLog.e(this.M0, "MediaInfo TTL is " + this.p.mPlayContext.getMediaLiveInfoTTL());
                hashMap.put("MediaInfoTTL", Long.valueOf((long) this.p.mPlayContext.getMediaLiveInfoTTL()));
            }
            if (obj != null && (obj instanceof HashMap)) {
                hashMap.putAll((Map) obj);
            }
            I(iMediaPlayer, j, j2, j3, hashMap);
            return true;
        } else if (740 == j) {
            this.i0 = System.currentTimeMillis();
            S0();
            return true;
        } else {
            if (711 == j && MediaSystemUtils.isApkDebuggable()) {
                AVSDKLog.d(tfb.MODULE_SDK_PAGE, "-->commitMediaPlayerRender open file time:" + j2 + " file_find_stream_info_time:" + j3);
            } else if (10004 == j && (s() == 1 || s() == 8 || s() == 5)) {
                if (ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enableUseHWTagForPlayScenario", "false"))) {
                    ja1.g = false;
                }
            } else if (10001 == j) {
                int i = (int) j2;
                this.o0 = i;
                qbi qbiVar = this.k;
                if (qbiVar != null) {
                    qbiVar.i(i);
                }
                TextureView textureView = this.D;
                if (textureView != null) {
                    textureView.setRotation(this.o0);
                } else {
                    com.taobao.mediaplay.player.c cVar = this.H;
                    if (cVar != null) {
                        cVar.setVideoRotation(this.o0);
                    }
                }
            }
            I(iMediaPlayer, j, j2, j3, obj);
            return true;
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

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreCompletionListener
    public void onPreCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d27d69", new Object[]{this, iMediaPlayer});
        } else {
            M();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface;
        rgi rgiVar;
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, " onSurfaceTextureAvailable " + surfaceTexture + ", w=" + i + ", h=" + i2);
        DWContext dWContext = this.p;
        if (dWContext != null) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "onSurfaceTextureAvailable##PlayState=" + this.n.e);
        }
        this.w0 = true;
        if (this.e == 0) {
            this.e = System.currentTimeMillis();
        }
        if (this.n.e == 7 || this.Q0) {
            AVSDKLog.e(fehVar, " onSurfaceTextureAvailable " + surfaceTexture + ", return by mPlayState=" + this.n.e + ", mDestoryed=" + this.Q0);
            return;
        }
        boolean z = this.z0 && !(this.c == i && this.d == i2);
        this.c = i;
        this.d = i2;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = this.A;
        if (i3 < i4) {
            surface = new Surface(surfaceTexture);
        } else {
            surface = this.i;
        }
        this.i = surface;
        SurfaceTexture surfaceTexture2 = this.E;
        if (surfaceTexture2 != null && i3 >= i4) {
            try {
                this.D.setSurfaceTexture(surfaceTexture2);
            } catch (Exception e2) {
                AVSDKLog.e(fehVar, " setSurfaceTexture error" + ew0.k(e2));
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 == 21 || i5 == 22) {
                try {
                    Field declaredField = this.D.getClass().getSuperclass().getDeclaredField("mUpdateListener");
                    declaredField.setAccessible(true);
                    this.E.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) declaredField.get(this.D));
                } catch (Throwable th) {
                    AVSDKLog.e(fehVar, "setOnFrameAvailableListener error" + th.getMessage());
                }
            }
        }
        if (this.i == null) {
            this.i = new Surface(surfaceTexture);
            this.E = surfaceTexture;
        }
        if (this.x || this.y) {
            rgi rgiVar2 = this.n;
            if (!rgiVar2.d && rgiVar2.e != 6) {
                AVSDKLog.e(fehVar, " onSurfaceTextureAvailable " + surfaceTexture + ", try to setSurface by isFirstRenderOptimize=" + dWContext.isFirstRenderOptimize() + ",mPlayState=" + this.n.e);
                boolean isFirstRenderOptimize = dWContext.isFirstRenderOptimize();
                String str = this.V;
                if (!(((isFirstRenderOptimize || TextUtils.isEmpty(str)) && !dWContext.isFirstRenderOptimize()) || (rgiVar = this.n) == null || rgiVar.f == null)) {
                    AVSDKLog.e(fehVar, "DWTextureVideoView setSurface in onSurfaceTextureAvailable 1.");
                    x1(this.n.f, l());
                    if (z) {
                        this.n.f.setSurfaceSize(this.c, this.d);
                        C0(this.c, this.d);
                    }
                }
                if ((!dWContext.isFirstRenderOptimize() && this.n.e == 0 && !TextUtils.isEmpty(this.h)) || (!TextUtils.isEmpty(str) && this.n.e == 3)) {
                    N0();
                    if (TextUtils.isEmpty(str)) {
                        rgi rgiVar3 = this.n;
                        if (rgiVar3.e != 3) {
                            rgiVar3.e = 8;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!dWContext.isFirstRenderOptimize() && this.n.f != null && Build.VERSION.SDK_INT < i4) {
                    AVSDKLog.e(fehVar, "DWTextureVideoView setSurface in onSurfaceTextureAvailable 2.");
                    x1(this.n.f, this.i);
                    this.n.f.setSurfaceSize(this.c, this.d);
                    C0(this.c, this.d);
                    return;
                } else {
                    return;
                }
            }
        }
        StringBuilder sb = new StringBuilder(" onSurfaceTextureAvailable ");
        sb.append(surfaceTexture);
        sb.append(", return by !mVideoStarted=");
        sb.append(!this.x);
        sb.append(", !mVideoPrepared=");
        sb.append(!this.y);
        sb.append(", mMediaPlayerRecycler.mRecycled=");
        sb.append(this.n.d);
        sb.append(", mPlayState=");
        sb.append(this.n.e);
        AVSDKLog.e(fehVar, sb.toString());
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83525c82", new Object[]{this, surfaceTexture, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.p != null) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "onSurfaceTextureAvailable##Video width:" + i + "，height:" + i2);
        }
        this.c = i;
        this.d = i2;
        AbstractMediaPlayer abstractMediaPlayer = this.n.f;
        if (abstractMediaPlayer != null) {
            abstractMediaPlayer.setSurfaceSize(i, i2);
            C0(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3157eda", new Object[]{this, surfaceTexture});
            return;
        }
        ttb ttbVar = this.L;
        if (ttbVar != null) {
            ttbVar.a(this);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2aeaa0", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        AVSDKLog.i(tfb.MODULE_SDK_PAGE, "onVideoSizeChanged##Video width:" + i + ", height:" + i2);
        h1(iMediaPlayer);
    }

    @Override // com.taobao.mediaplay.player.c.a
    public void onWindowVisibilityChanged(int i) {
        AbstractMediaPlayer abstractMediaPlayer;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, "dw TextureVideoView , + onWindowVisibilityChanged " + i);
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) abstractMediaPlayer;
            HashMap hashMap = new HashMap();
            String str2 = MediaConstant.CMD_SET_VIEW_VISIBLE;
            if (i == 0) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put(str2, str);
            taobaoMediaPlayer.callWithMsg(hashMap);
        }
    }

    @Override // tb.c32
    public void p0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f405b10f", new Object[]{this, str});
            return;
        }
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, "TextureVideoView , + setVideoPath " + str);
        if (!TextUtils.isEmpty(str)) {
            this.h = str;
            this.f = System.currentTimeMillis();
            rgi rgiVar = this.n;
            if (rgiVar != null && a(rgiVar.e) && !this.Q0) {
                int i = this.q;
                if ((i != 1 && i != 8) || TextUtils.isEmpty(this.h) || this.n.d) {
                    return;
                }
                if (this.q == 1) {
                    r0();
                } else if (this.p.getPrepareToFirstFrame()) {
                    X();
                } else {
                    e();
                }
            }
        }
    }

    public void p1(int i, String str, int i2) {
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

    public void q1(long j) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("962cd696", new Object[]{this, new Long(j)});
            return;
        }
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            HashMap hashMap = new HashMap();
            String str = MediaConstant.CMD_SET_FIRST_FRAME_UPDATE_TIME;
            hashMap.put(str, "" + j);
            ((TaobaoMediaPlayer) abstractMediaPlayer).callWithMsg(hashMap);
        }
    }

    public void r1(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
        } else {
            this.m0 = nj9Var;
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
        this.U = 0;
        this.o0 = 0;
        this.p.setPrepareToFirstFrame(false);
        try {
            rgi rgiVar = this.n;
            if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
                abstractMediaPlayer.resetListeners();
                AbstractMediaPlayer abstractMediaPlayer2 = this.n.f;
                if (abstractMediaPlayer2 instanceof TaobaoMediaPlayer) {
                    TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) abstractMediaPlayer2;
                    HashMap hashMap = new HashMap();
                    if (!this.P0 && !this.Q0) {
                        str = "0";
                        hashMap.put("__setRecycleReason", str);
                        String str2 = MediaConstant.CMD_UPDATE_PLAY_EX;
                        hashMap.put(str2, "has_attach=" + (this.v0 ? 1 : 0) + ",request_long_focus=" + (this.b0 ? 1 : 0) + ",request_focus_count=" + this.c0 + ",release_focus_count=" + this.d0 + ",is_mute_prepare=" + (this.e0 ? 1 : 0));
                        taobaoMediaPlayer.callWithMsg(hashMap);
                        if (this.D == null || this.H != null) {
                            ((TaobaoMediaPlayer) this.n.f).setShowViewParent(null);
                        }
                        AbstractMediaPlayer abstractMediaPlayer3 = this.n.f;
                        abstractMediaPlayer3.releasePrefixInUIThread();
                        new Thread(new c(abstractMediaPlayer3), "ReleasePlayerInDWTextureView").start();
                    }
                    str = "1";
                    hashMap.put("__setRecycleReason", str);
                    String str22 = MediaConstant.CMD_UPDATE_PLAY_EX;
                    hashMap.put(str22, "has_attach=" + (this.v0 ? 1 : 0) + ",request_long_focus=" + (this.b0 ? 1 : 0) + ",request_focus_count=" + this.c0 + ",release_focus_count=" + this.d0 + ",is_mute_prepare=" + (this.e0 ? 1 : 0));
                    taobaoMediaPlayer.callWithMsg(hashMap);
                    if (this.D == null) {
                    }
                    ((TaobaoMediaPlayer) this.n.f).setShowViewParent(null);
                    AbstractMediaPlayer abstractMediaPlayer32 = this.n.f;
                    abstractMediaPlayer32.releasePrefixInUIThread();
                    new Thread(new c(abstractMediaPlayer32), "ReleasePlayerInDWTextureView").start();
                } else {
                    abstractMediaPlayer2.reset();
                    this.n.f.release();
                }
                rgi rgiVar2 = this.n;
                rgiVar2.f = null;
                if (this.Q0) {
                    rgiVar2.e = 7;
                    return;
                }
                rgiVar2.e = 6;
                O();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // tb.c32
    public void s0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5499d60", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        AVSDKLog.e(this.M0, "TextureVideoView , + videoPlayError ");
        this.f0 = false;
        this.U = -1;
        if (this.A0) {
            U0(i, i2);
        } else {
            T0();
        }
    }

    public void s1(int i, boolean z) {
        AbstractMediaPlayer abstractMediaPlayer;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8950038a", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, this + "dw texturevideoview setGradualVolumeWithConfig gradualTime = " + i + ", switchFadeIn = " + z);
        rgi rgiVar = this.n;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) abstractMediaPlayer;
            if (z && i > 0) {
                if (z) {
                    j = 1;
                } else {
                    j = 0;
                }
                taobaoMediaPlayer._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_GRADUAL_VOLUME_ENABLE, j);
                taobaoMediaPlayer._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_GRADUAL_VOLUME_TIME, i);
            }
        }
    }

    public final void t0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434d3248", new Object[]{this, str});
            return;
        }
        try {
            if (this.O != null && this.X) {
                feh fehVar = this.M0;
                AVSDKLog.e(fehVar, "TextureVideoView abandonAudioFocus " + str);
                x3r.j(this.l).k(null);
                this.X = false;
            }
        } catch (Throwable unused) {
        }
    }

    public void t1(InnerStartFuncListener innerStartFuncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805c05a7", new Object[]{this, innerStartFuncListener});
        } else {
            this.n0 = innerStartFuncListener;
        }
    }

    @Override // tb.c32
    public View u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        TextureView textureView = this.D;
        if (textureView != null) {
            return textureView;
        }
        com.taobao.mediaplay.player.c cVar = this.H;
        if (cVar != null) {
            return cVar.getView();
        }
        return null;
    }

    public final void u1(AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a438f2d1", new Object[]{this, abstractMediaPlayer});
            return;
        }
        try {
            abstractMediaPlayer.registerOnPreparedListener(this);
            abstractMediaPlayer.setOnVideoSizeChangedListener(this);
            abstractMediaPlayer.registerOnPreCompletionListener(this);
            abstractMediaPlayer.registerOnCompletionListener(this);
            abstractMediaPlayer.registerOnErrorListener(this);
            abstractMediaPlayer.setOnBufferingUpdateListener(this);
            abstractMediaPlayer.registerOnInfoListener(this);
            abstractMediaPlayer.registerOnLoopCompletionListener(this);
            abstractMediaPlayer.setScreenOnWhilePlaying(true);
        } catch (Throwable unused) {
        }
    }

    public final void v1() {
        rgi rgiVar;
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8861411", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.player.c cVar = this.H;
        if (cVar != null && (rgiVar = this.n) != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) abstractMediaPlayer;
            if (this.G) {
                taobaoMediaPlayer.setShowViewParent((ViewGroup) ((MediaSurfaceView) cVar).getParent());
            } else {
                taobaoMediaPlayer.setShowViewParent((ViewGroup) ((MediaTextureView) cVar).getParent());
            }
        }
    }

    @Override // tb.c32
    public void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f691388", new Object[]{this, new Integer(i)});
            return;
        }
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, "TextureVideoView , instantSeekTo " + i);
        if (i >= 0) {
            e1();
            int i2 = this.n.e;
            if (i2 == 5 || i2 == 2 || i2 == 4 || i2 == 1) {
                if (i > i()) {
                    i = i();
                }
                this.n.f.instantSeekTo(i);
            }
        }
    }

    public void w1(ttb ttbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f552515a", new Object[]{this, ttbVar});
        } else {
            this.L = ttbVar;
        }
    }

    @Override // tb.c32
    public boolean x() {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0f104dd", new Object[]{this})).booleanValue();
        }
        rgi rgiVar = this.n;
        if (rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null || !(abstractMediaPlayer instanceof MonitorMediaPlayer) || !((MonitorMediaPlayer) abstractMediaPlayer).isCompleteHitCache()) {
            return false;
        }
        return true;
    }

    public final void x1(IMediaPlayer iMediaPlayer, Surface surface) {
        SurfaceControl surfaceControl;
        SurfaceControl.Transaction reparent;
        SurfaceControl.Transaction bufferSize;
        SurfaceControl.Transaction visibility;
        SurfaceControl.Transaction reparent2;
        SurfaceControl.Transaction bufferSize2;
        SurfaceControl.Transaction visibility2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf33cffc", new Object[]{this, iMediaPlayer, surface});
        } else if (Build.VERSION.SDK_INT < 29 || !this.J0) {
            iMediaPlayer.setSurface(surface);
        } else {
            feh fehVar = this.M0;
            AVSDKLog.e(fehVar, "HDR DWTextureVideoView will start setSurface surface=" + surface + " mSurfaceviewSurface " + this.H0 + " mSurfaceControlSurface=" + this.I0);
            Surface surface2 = this.H0;
            if ((surface2 != null || surface != null) && surface2 != surface) {
                this.H0 = surface;
                feh fehVar2 = this.M0;
                AVSDKLog.e(fehVar2, "HDR DWTextureVideoView end setSurface surface=" + surface + " mSurfaceviewSurface " + this.H0);
                if (this.H0 != null) {
                    SurfaceControl.Transaction a2 = aot.a();
                    SurfaceControl surfaceControl2 = this.K0;
                    surfaceControl = ((MediaSurfaceView) J0().getRenderView()).getSurfaceControl();
                    reparent = a2.reparent(surfaceControl2, surfaceControl);
                    bufferSize = reparent.setBufferSize(this.K0, ((MediaSurfaceView) J0().getRenderView()).getWidth(), ((MediaSurfaceView) J0().getRenderView()).getHeight());
                    visibility = bufferSize.setVisibility(this.K0, true);
                    visibility.apply();
                } else if (this.K0 != null) {
                    reparent2 = aot.a().reparent(this.K0, null);
                    bufferSize2 = reparent2.setBufferSize(this.K0, 0, 0);
                    visibility2 = bufferSize2.setVisibility(this.K0, false);
                    visibility2.apply();
                }
            }
        }
    }

    @Override // tb.c32
    public boolean y() {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3f7704", new Object[]{this})).booleanValue();
        }
        rgi rgiVar = this.n;
        if (rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null || !(abstractMediaPlayer instanceof MonitorMediaPlayer) || !((MonitorMediaPlayer) abstractMediaPlayer).isHitCache()) {
            return false;
        }
        return true;
    }

    public final void y1() {
        com.taobao.mediaplay.player.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f0e456", new Object[]{this});
            return;
        }
        Context context = this.l;
        if (context != null && (aVar = this.P) != null) {
            aVar.b((Application) context.getApplicationContext());
            this.P = null;
        }
    }

    public final void z0(MediaPlayControlContext mediaPlayControlContext, long j, long j2, long j3) {
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

    public final void z1(AbstractMediaPlayer abstractMediaPlayer) {
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
            abstractMediaPlayer.unregisterOnPreCompletionListener(this);
            abstractMediaPlayer.unregisterOnErrorListener(this);
            abstractMediaPlayer.unregisterOnBufferingUpdateListener(this);
            abstractMediaPlayer.unregisterOnInfoListener(this);
            abstractMediaPlayer.unregisterOnLoopCompletionListener(this);
        } catch (Throwable th) {
            if (this.p != null) {
                feh fehVar = this.M0;
                AVSDKLog.e(fehVar, "unregisterMediaplayerListener##error:" + th.getMessage());
            }
        }
    }

    public void R0() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd09697", new Object[]{this});
            return;
        }
        DWContext dWContext = this.p;
        if (dWContext == null || dWContext.getControlParams().get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM) == null || !ew0.s(this.p.getControlParams().get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM))) {
            feh fehVar = this.M0;
            AVSDKLog.e(fehVar, "keepScreenOn " + this.l + ", " + ja1.L());
            if (!this.S) {
                i = 1 + S0;
                S0 = i;
            } else if (!this.T) {
                this.T = true;
                ja1.R();
                i = ja1.L();
            } else {
                return;
            }
            Context context = this.l;
            if (context != null && (context instanceof Activity) && i > 0) {
                ((Activity) context).getWindow().addFlags(128);
                AVSDKLog.e(this.M0, "TextureVideoView , keepScreenOn");
                return;
            }
            return;
        }
        AVSDKLog.e(this.M0, "KeepScreeon do nothing");
    }

    public void S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09ecf87", new Object[]{this});
        } else if (this.L != null && this.G && this.g0) {
            if (!this.D0) {
                this.E0 = System.currentTimeMillis();
                feh fehVar = this.M0;
                AVSDKLog.e(fehVar, "yezo: notifySurfaceTextureUpdate at dw with surfaceView and mFirstFrameUpdateTs=" + System.currentTimeMillis());
                q1(this.E0);
                this.D0 = true;
                I(null, 12101L, this.E0, 0L, null);
            }
            this.L.a(this);
        }
    }

    public final boolean X0(String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f804d5d0", new Object[]{this, str})).booleanValue();
        }
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, "HDR dwTextureVideoView check cache of videoId " + str);
        if (pmm.b().c(str)) {
            AVSDKLog.e(this.M0, "HDR check predownCache");
            String str2 = pmm.b().a(str).get("videoDefinition");
            if (!TextUtils.isEmpty(str2)) {
                z = str2.contains("hdr");
                feh fehVar2 = this.M0;
                AVSDKLog.e(fehVar2, "HDR predownCache has hdr " + z);
            }
        }
        feh fehVar3 = this.M0;
        AVSDKLog.e(fehVar3, "HDR preOrLocalCacheHasHDR mHasPreCache " + z + " mHasLocalCache false");
        return z;
    }

    @Override // com.taobao.mediaplay.player.c.a
    public void b(c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747ddf29", new Object[]{this, bVar});
            return;
        }
        if (this.g0 && !this.D0) {
            this.E0 = System.currentTimeMillis();
            feh fehVar = this.M0;
            AVSDKLog.e(fehVar, "onSurfaceUpdate and mFirstFrameUpdateTs=" + System.currentTimeMillis());
            q1(this.E0);
            this.D0 = true;
            I(null, 12101L, this.E0, 0L, null);
        }
        ttb ttbVar = this.L;
        if (ttbVar != null) {
            ttbVar.a(this);
        }
    }

    @Override // tb.c32
    public void g() {
        SurfaceControl surfaceControl;
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.M0, "TextureVideoView , + destroy");
        AVSDKLog.e(this.M0, "keepScreenOn: onDestroy currentinstance Count=" + S0 + "," + this);
        Handler handler = this.K;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.K = null;
        }
        t0("destory");
        this.O = null;
        this.d0++;
        rgi rgiVar = this.n;
        if (!(rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null)) {
            if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
                AVSDKLog.e(this.M0, "HDR dwTextureVideoView onDestory release controlSurface");
                ((TaobaoMediaPlayer) this.n.f).setControlSurface(null);
            }
            AbstractMediaPlayer abstractMediaPlayer2 = this.n.f;
            if (abstractMediaPlayer2 instanceof TaobaoMediaPlayer) {
                this.k0 = Math.max(this.k0, ((TaobaoMediaPlayer) abstractMediaPlayer2).getMaxRenderInterval());
            }
            z1(this.n.f);
        }
        if (!TextUtils.isEmpty(this.V) && 1 == this.n.e) {
            V(true);
        }
        this.Q0 = true;
        d1();
        if (ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "tempInstanceManager", "true"))) {
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", "playerInstanceManagerBlackList", "[\"Pop4\", \"topshow_festival\"]");
            DWContext dWContext = this.p;
            if (dWContext != null && config.contains(dWContext.mFrom)) {
                AVSDKLog.e(this.M0, "destory not PlayerInstanceManager");
                dq.b().execute(new d());
                return;
            }
        }
        if (this.y0) {
            E0();
        }
        y1();
        AVSDKLog.e(this.M0, "dwTextureVideoView onDestory start release mSurfaceControl" + this.K0 + " mSurfaceControlSurface " + this.I0);
        if (Build.VERSION.SDK_INT >= 29 && (surfaceControl = this.K0) != null) {
            surfaceControl.release();
            this.K0 = null;
            AVSDKLog.e(this.M0, "HDR dwTextureVideoView release mSurfaceControl");
        }
        Surface surface = this.I0;
        if (surface != null) {
            surface.release();
            this.I0 = null;
            AVSDKLog.e(this.M0, "HDR dwTextureVideoView release mSurfaceControlSurface");
        }
        if (this.H0 != null) {
            this.H0 = null;
            AVSDKLog.e(this.M0, "HDR dwTextureVideoView set mSurfaceViewSurface null");
        }
        AVSDKLog.e(this.M0, "dwTextureVideoView onDestory end release mSurfaceControl mControlSurface mSurfaceviewSurface");
        try {
            if (this.D != null) {
                Surface surface2 = this.i;
                if (surface2 != null) {
                    surface2.release();
                    this.i = null;
                }
                this.D = null;
            }
        } catch (Throwable unused) {
        }
        if (!(!ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enableReportSuccessRate", "true")) || this.R == 0 || this.p == null)) {
            StringBuilder sb = new StringBuilder(400);
            sb.append(",play_token=");
            sb.append(this.p.getPlayToken());
            sb.append(",error_code=");
            sb.append(this.N0);
            sb.append(",play_time=");
            long j = -1;
            sb.append(this.R > 0 ? System.currentTimeMillis() - this.R : -1L);
            sb.append(",first_frame_rendering_time_new=");
            long j2 = this.h0;
            if (j2 > 0) {
                j = j2 - this.R;
            }
            sb.append(j);
            sb.append(",play_scenario=2,business_type=");
            sb.append(this.p.mBusinessType);
            sb.append(",sub_business_type=");
            sb.append(this.p.mFrom);
            sb.append(",feed_id=");
            sb.append(this.p.getVideoId());
            if (this.j0 > 0) {
                this.k0 = Math.max(this.k0, System.currentTimeMillis() - this.j0);
                this.j0 = 0L;
            }
            sb.append(",max_video_render_interval=");
            sb.append(this.k0);
            TBS.Ext.commitEvent("Page_Video", 19997, "Page_Video_UserExperience", "", "", sb.toString());
        }
        this.h0 = 0L;
        this.R = 0L;
    }

    public final boolean j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8f34951", new Object[]{this})).booleanValue();
        }
        if (ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "tempInstanceManager", "true"))) {
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", "playerInstanceManagerBlackList", "[\"Pop4\", \"topshow_festival\"]");
            DWContext dWContext = this.p;
            if (dWContext != null && config.contains(dWContext.mFrom)) {
                return false;
            }
        }
        DWContext dWContext2 = this.p;
        if (!dWContext2.mBackgroundAudio || !dWContext2.mAudioOnly) {
            return pgi.n().k();
        }
        return dfi.n().k();
    }

    @Override // tb.c32
    public void q0(float f) {
        AbstractMediaPlayer abstractMediaPlayer;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
            return;
        }
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, "TextureVideoView , + setVolume " + f);
        rgi rgiVar = this.n;
        if (rgiVar.i != f) {
            rgiVar.i = f;
            this.p.setVolume(f);
            int i2 = this.n.e;
            if (i2 != 0 && !this.X && !this.a0 && i2 == 1) {
                g1(CommandID.setVolume);
            }
            rgi rgiVar2 = this.n;
            if (rgiVar2 != null && (abstractMediaPlayer = rgiVar2.f) != null && (i = rgiVar2.e) != 7 && i != 3) {
                try {
                    abstractMediaPlayer.setVolume(f, f);
                } catch (Throwable th) {
                    feh fehVar2 = this.M0;
                    AVSDKLog.e(fehVar2, "TextureVideoView setVolume##RequestAudioFocus error" + th.getMessage());
                }
            }
        }
    }

    public final boolean D0() {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("539c019a", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            feh fehVar = this.M0;
            AVSDKLog.e(fehVar, "HDR start check videoId " + this.p.mPlayContext.mVideoId + " will use SurfaceControl for hdr");
            if (!this.G) {
                return false;
            }
            feh fehVar2 = this.M0;
            AVSDKLog.e(fehVar2, "HDR DWTextureVideoView videoID " + this.p.mPlayContext.mVideoId);
            if (!TextUtils.isEmpty(this.p.mPlayContext.mVideoId)) {
                z = X0(this.p.mPlayContext.mVideoId);
                feh fehVar3 = this.M0;
                AVSDKLog.e(fehVar3, "HDR videoId " + this.p.mPlayContext.mVideoId + "mCacheHasHDR " + z);
            } else {
                z = false;
            }
            if (z && this.p.mPlayContext.canSelectHDRUrl()) {
                z2 = true;
            }
        }
        feh fehVar4 = this.M0;
        AVSDKLog.e(fehVar4, "HDR end check videoId " + this.p.mPlayContext.mVideoId + " canUseSurfaceControl " + z2);
        return z2;
    }

    public void E0() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0265704", new Object[]{this});
            return;
        }
        DWContext dWContext = this.p;
        if (dWContext == null || dWContext.getControlParams().get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM) == null || !ew0.s(this.p.getControlParams().get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM))) {
            if (!this.S) {
                int i2 = S0;
                if (i2 > 0) {
                    i = i2 - 1;
                    S0 = i;
                }
            } else if (this.T) {
                this.T = false;
                ja1.r();
                i = ja1.L();
            } else {
                return;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Context context = this.l;
                if (context != null && (context instanceof Activity) && i == 0) {
                    ((Activity) context).getWindow().clearFlags(128);
                    AVSDKLog.e(this.M0, "TextureVideoView , clearKeepScreenOn");
                    return;
                }
                return;
            }
            Context context2 = this.l;
            if (context2 != null && (context2 instanceof Activity) && i == 0) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0539a());
                return;
            }
            return;
        }
        AVSDKLog.e(this.M0, "KeepScreeon do nothing");
    }

    public final void H0(IMediaPlayer iMediaPlayer, MediaSurfaceView mediaSurfaceView) {
        SurfaceControl surfaceControl;
        SurfaceControl.Transaction reparent;
        SurfaceControl.Transaction bufferSize;
        SurfaceControl.Transaction visibility;
        SurfaceControl.Transaction reparent2;
        SurfaceControl.Transaction bufferSize2;
        SurfaceControl.Transaction visibility2;
        SurfaceControl.Builder name;
        SurfaceControl.Builder bufferSize3;
        SurfaceControl build;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ed1aae", new Object[]{this, iMediaPlayer, mediaSurfaceView});
            return;
        }
        int width = mediaSurfaceView != null ? mediaSurfaceView.getWidth() : 0;
        int height = mediaSurfaceView != null ? mediaSurfaceView.getHeight() : 0;
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.K0 == null) {
                AVSDKLog.e(this.M0, "create surfacecontrol ");
                name = pnt.a().setName("MediaControlSurface");
                bufferSize3 = name.setBufferSize(width, height);
                build = bufferSize3.build();
                this.K0 = build;
                rnt.a();
                this.I0 = qnt.a(this.K0);
                feh fehVar = this.M0;
                AVSDKLog.e(fehVar, "create mSurfaceControlSurface " + this.I0);
                ((TaobaoMediaPlayer) iMediaPlayer).setControlSurface(this.I0);
            }
            AVSDKLog.e(this.M0, "reparent surfaceview");
            if (mediaSurfaceView != null) {
                this.H0 = mediaSurfaceView.getHolder().getSurface();
            } else {
                this.H0 = null;
            }
            SurfaceControl surfaceControl2 = this.K0;
            if (surfaceControl2 == null) {
                return;
            }
            if (mediaSurfaceView == null) {
                reparent2 = aot.a().reparent(surfaceControl2, null);
                bufferSize2 = reparent2.setBufferSize(this.K0, 0, 0);
                visibility2 = bufferSize2.setVisibility(this.K0, false);
                visibility2.apply();
                return;
            }
            surfaceControl = mediaSurfaceView.getSurfaceControl();
            reparent = aot.a().reparent(surfaceControl2, surfaceControl);
            bufferSize = reparent.setBufferSize(this.K0, mediaSurfaceView.getWidth(), mediaSurfaceView.getHeight());
            visibility = bufferSize.setVisibility(this.K0, true);
            visibility.apply();
        }
    }

    public AbstractMediaPlayer P0() {
        String str;
        TaobaoMediaPlayer taobaoMediaPlayer;
        AbstractMediaPlayer abstractMediaPlayer;
        TaobaoMediaPlayer taobaoMediaPlayer2;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractMediaPlayer) ipChange.ipc$dispatch("f1ea51f7", new Object[]{this});
        }
        com.taobao.taobaoavsdk.Tracer.a.c(this.p.mAnalysis);
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, "TextureVideoView  initPlayer##PlayState:" + this.n.e + ",videoURL:" + this.h);
        if (this.p.mPlayContext.getPlayerType() == 2 && (str2 = this.h) != null && str2.contains(".m3u8")) {
            this.p.mPlayContext.setPlayerType(1);
        }
        r7t r7tVar = new r7t(this.p.getInstanceType().getValue());
        DWContext dWContext = this.p;
        r7tVar.U0 = dWContext.mAnalysis;
        r7tVar.c = dWContext.mPlayContext.getPlayerType();
        r7tVar.d = 2;
        r7tVar.C = String.valueOf(this.p.mUserId);
        DWContext dWContext2 = this.p;
        r7tVar.y = dWContext2.mFrom;
        r7tVar.x = dWContext2.mBusinessType;
        r7tVar.B = dWContext2.getVideoId();
        r7tVar.D = this.p.mPlayContext.getVideoDefinition();
        DWContext dWContext3 = this.p;
        r7tVar.E = dWContext3.mPlayContext.mVideoId;
        dWContext3.getVideoSource();
        r7tVar.r = this.p.mPlayContext.getCacheKey();
        DWContext dWContext4 = this.p;
        r7tVar.Q = dWContext4.mPlayScenes;
        MediaPlayControlContext mediaPlayControlContext = dWContext4.mPlayContext;
        r7tVar.q = mediaPlayControlContext.mConfigGroup;
        r7tVar.c0 = dWContext4.mPanoType;
        r7tVar.d0 = mediaPlayControlContext.getVideoIsHDR();
        if (!TextUtils.isEmpty(this.p.mPlayContext.getHighCachePath())) {
            r7tVar.s = this.p.mPlayContext.getHighCachePath();
            r7tVar.D = this.p.mPlayContext.mHighVideoDefinition;
        }
        r7tVar.o = this.p.mPlayContext.isUseTBNet();
        this.p.mPlayContext.getNetWorkQuality();
        this.p.mPlayContext.getGlobalCurrentBandWidth();
        this.p.mPlayContext.getGlobalPredictBandWidth();
        r7tVar.h = (!this.p.mPlayContext.isHardwareHevc() || !ja1.g) ? 0 : 1;
        int i = (!this.p.mPlayContext.isHardwareAvc() || !ja1.g) ? 0 : 1;
        r7tVar.g = i;
        if (i == 0) {
            if (!ja1.g) {
                r7tVar.I0 = 4;
            } else {
                r7tVar.I0 = 5;
            }
        }
        if (r7tVar.h == 0) {
            if (!ja1.g) {
                r7tVar.J0 = 4;
            } else {
                r7tVar.J0 = 5;
            }
        }
        DWContext dWContext5 = this.p;
        boolean z = dWContext5.mPlayContext.mEmbed;
        r7tVar.t = dWContext5.getPlayToken();
        r7tVar.H = this.p.mPlayContext.getDevicePerformanceLevel() + "/runtimeLevel:" + this.p.mPlayContext.mRuntimeLevel;
        psb psbVar = this.p.mConfigAdapter;
        if (psbVar != null && ((b75) psbVar).j() && this.p.mPlayContext.getVideoLength() > 0 && this.p.mPlayContext.getVideoLength() < 262144000) {
            r7tVar.u = this.p.mPlayContext.getVideoLength();
        }
        r7tVar.K = this.p.mPlayContext.getNetSpeed();
        this.p.mPlayContext.isVideoDeviceMeaseureEnable();
        boolean z2 = this.p.mPlayContext.mHighPerformancePlayer;
        StringBuilder sb = new StringBuilder();
        sb.append(this.p.mPlayContext.getRateAdaptePriority());
        sb.append("#");
        if (this.p.mPlayContext.isH265()) {
            str = "h265";
        } else {
            str = "h264";
        }
        sb.append(str);
        r7tVar.L = sb.toString();
        r7tVar.T = this.p.getPlayExpUTParams();
        r7tVar.V = this.p.getControlParams();
        r7tVar.a0 = this.p.getPrepareToFirstFrame();
        DWContext dWContext6 = this.p;
        r7tVar.g0 = dWContext6.mStartPos;
        r7tVar.U = dWContext6.getCustomParams();
        r7tVar.h0 = this.p.mPlayContext.getForceMuteMode();
        DWContext dWContext7 = this.p;
        r7tVar.W = dWContext7.mConnectTimeout;
        r7tVar.X = dWContext7.mReadTimeout;
        r7tVar.Y = dWContext7.mRetryTime;
        r7tVar.k0 = dWContext7.mUsingInterface;
        r7tVar.l0 = dWContext7.mAudioOnly;
        r7tVar.Z = dWContext7.mUseAudioCache;
        r7tVar.n0 = dWContext7.mDynamicPlayEx;
        r7tVar.o0 = dWContext7.mSwitchScene;
        r7tVar.p0 = dWContext7.mSwitchSceneTime;
        r7tVar.q0 = dWContext7.mIsFloat;
        r7tVar.R0 = dWContext7.mPlayContext.mChooseVVCReason.getValue();
        r7tVar.L0 = this.G;
        DWContext dWContext8 = this.p;
        MediaPlayControlContext mediaPlayControlContext2 = dWContext8.mPlayContext;
        r7tVar.M0 = mediaPlayControlContext2.mUseSurfaceControl;
        r7tVar.O0 = this.J;
        r7tVar.P0 = this.C0;
        r7tVar.X0 = mediaPlayControlContext2.mMediaInfoParams != null;
        r7tVar.Y0 = mediaPlayControlContext2.mHasQueryMediaInfo;
        if (!r7tVar.d0) {
            if (dWContext8.getControlParams().get(MediaConstant.USE_SETUP_DECODER_EARLY_BY_CONTROL_PARAM) != null && ew0.s(this.p.getControlParams().get(MediaConstant.USE_SETUP_DECODER_EARLY_BY_CONTROL_PARAM))) {
                AVSDKLog.e(this.M0, "open UseSetupDecoderEarlyByControlParam");
                r7tVar.V0 = true;
                this.F0 = true;
            }
            DWContext dWContext9 = this.p;
            if (!(dWContext9 == null || dWContext9.getControlParams().get(MediaConstant.USE_OPEN_DEVICE_EARLY_BY_CONTROL_PARAM) == null || !ew0.s(this.p.getControlParams().get(MediaConstant.USE_OPEN_DEVICE_EARLY_BY_CONTROL_PARAM)))) {
                AVSDKLog.e(this.M0, "open UseOpenDeviceEarlyByControlParam");
                r7tVar.W0 = true;
                this.G0 = true;
            }
        }
        DWContext dWContext10 = this.p;
        if (!(dWContext10 == null || dWContext10.getControlParams().get("NoUseProxyByControl") == null || !ew0.s(this.p.getControlParams().get("NoUseProxyByControl")))) {
            AVSDKLog.e(this.M0, "player not use proxy by control");
            r7tVar.Q0 = true;
        }
        feh fehVar2 = this.M0;
        AVSDKLog.e(fehVar2, "TextureVideoView initPlayer , + initPlayer, " + this.p.getVideoId() + ", " + this.p.mFrom + ", " + this.p.getPlayToken() + ", " + r7tVar.a0);
        Map<String, String> uTParams = this.p.getUTParams();
        if (uTParams != null) {
            String str3 = uTParams.get("product_type");
            if (!TextUtils.isEmpty(str3)) {
                r7tVar.z = str3;
            }
            String str4 = uTParams.get("spm-cnt");
            if (!TextUtils.isEmpty(str4)) {
                r7tVar.r0 = str4;
            }
        }
        this.N0 = 0;
        if (r().startsWith("content://")) {
            this.p.mPlayContext.setPlayerType(2);
        }
        DWContext dWContext11 = this.p;
        if (dWContext11 == null || !(dWContext11.mPlayContext.getPlayerType() == 3 || this.p.mPlayContext.getPlayerType() == 1)) {
            taobaoMediaPlayer = I0(r7tVar);
        } else {
            try {
                DWContext dWContext12 = this.p;
                if (dWContext12 != null) {
                    r7tVar.b0 = dWContext12.getNeedCommitUserToFirstFrame();
                }
                Context context = this.l;
                if (context == null) {
                    context = this.m;
                }
                DWContext dWContext13 = this.p;
                if (dWContext13 == null || dWContext13.mConfigAdapter == null) {
                    taobaoMediaPlayer2 = new TaobaoMediaPlayer(context);
                } else {
                    taobaoMediaPlayer2 = new TaobaoMediaPlayer(context, this.p.mConfigAdapter);
                }
                MediaPlayControlContext mediaPlayControlContext3 = this.p.mPlayContext;
                taobaoMediaPlayer2.addExperienceInfo(mediaPlayControlContext3.mExperienceIdSet, mediaPlayControlContext3.mExperienceReleaseIdSet, mediaPlayControlContext3.mExperienceBucketIdSet);
                TextureView textureView = this.D;
                if (textureView != null) {
                    taobaoMediaPlayer2.setShowViewParent((ViewGroup) textureView.getParent());
                    taobaoMediaPlayer = taobaoMediaPlayer2;
                } else {
                    com.taobao.mediaplay.player.c cVar = this.H;
                    taobaoMediaPlayer = taobaoMediaPlayer2;
                    if (cVar != null) {
                        if (this.G) {
                            taobaoMediaPlayer2.setShowViewParent((ViewGroup) ((MediaSurfaceView) cVar).getParent());
                            taobaoMediaPlayer = taobaoMediaPlayer2;
                        } else {
                            taobaoMediaPlayer2.setShowViewParent((ViewGroup) ((MediaTextureView) cVar).getParent());
                            taobaoMediaPlayer = taobaoMediaPlayer2;
                        }
                    }
                }
            } catch (Throwable th) {
                feh fehVar3 = this.M0;
                AVSDKLog.e(fehVar3, "initPlayer##TaobaoMediaPlayer load error:" + th.getMessage());
                b1(null);
                taobaoMediaPlayer = I0(r7tVar);
            }
        }
        try {
            Y0(taobaoMediaPlayer, r7tVar);
            abstractMediaPlayer = taobaoMediaPlayer;
        } catch (Throwable th2) {
            feh fehVar4 = this.M0;
            AVSDKLog.e(fehVar4, "initPlayer##  prepare player error" + th2.getMessage());
            abstractMediaPlayer = taobaoMediaPlayer;
            if (taobaoMediaPlayer != null) {
                b1(taobaoMediaPlayer);
                try {
                    boolean z3 = taobaoMediaPlayer instanceof TaobaoMediaPlayer;
                    AbstractMediaPlayer abstractMediaPlayer2 = taobaoMediaPlayer;
                    if (z3) {
                        AbstractMediaPlayer I0 = I0(r7tVar);
                        Y0(I0, r7tVar);
                        abstractMediaPlayer2 = I0;
                    }
                    this.U = -2;
                    if (this.A0) {
                        U0(IMediaPlayer.MEDIA_INFO_PLAYER_ACTIVE_VIDEO_PLAY_ERROR, 0);
                        abstractMediaPlayer = abstractMediaPlayer2;
                    } else {
                        T0();
                        abstractMediaPlayer = abstractMediaPlayer2;
                    }
                } catch (Throwable unused) {
                    AVSDKLog.e(this.M0, "initPlayer##backup mediaplayer it error:");
                    this.U = -3;
                    if (this.A0) {
                        U0(IMediaPlayer.MEDIA_INFO_PLAYER_ACTIVE_VIDEO_PLAY_ERROR, 0);
                        abstractMediaPlayer = taobaoMediaPlayer;
                    } else {
                        T0();
                        abstractMediaPlayer = taobaoMediaPlayer;
                    }
                }
            }
        }
        return abstractMediaPlayer;
    }

    public final void T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96e0d2a", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.M0, "TextureVideoView  notifyVideoErrorForInit");
        try {
            H(null, 1, 0);
        } catch (Throwable unused) {
        }
        DWContext dWContext = this.p;
        if (dWContext != null && dWContext.mUTAdapter != null && this.U < 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_code", "" + this.U);
            hashMap.put(atb.EXP_KEY_SUB_BUSINESS_TYPE, "" + this.p.mFrom);
            hashMap.put("page_name", c2v.getInstance().getCurrentPageName());
            hashMap.put(PushMessageHelper.ERROR_TYPE, "init");
            hashMap.put("play_token", this.p.getPlayToken());
            DWContext dWContext2 = this.p;
            dWContext2.mUTAdapter.a("DWVideo", "Button", "VideoPlayError", dWContext2.getUTParams(), hashMap);
        }
    }

    @Override // tb.c32
    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.M0, "TextureVideoView , + playVideo ");
        this.P0 = false;
        i1();
        rgi rgiVar = this.n;
        if (rgiVar.d) {
            if (rgiVar.c == 4) {
                this.O0 = true;
            }
            rgiVar.c = 1;
            this.Q = System.currentTimeMillis();
            O0();
            return;
        }
        if (!this.g0) {
            this.f0 = true;
            this.Q = System.currentTimeMillis();
        }
        g1("playVideo");
        try {
            if (this.p != null) {
                AVSDKLog.d(tfb.MODULE_SDK_PAGE, " playVideo##PlayState:" + this.n.e);
            }
            rgi rgiVar2 = this.n;
            if (rgiVar2 != null && rgiVar2.f != null && this.x) {
                int i = rgiVar2.e;
                if ((i == 2 || i == 5 || i == 4) && this.F) {
                    K0(rgiVar2.f27360a);
                    this.y0 = true;
                    R0();
                    this.n.f.start();
                    if (l() != null) {
                        x1(this.n.f, l());
                    }
                    if (J0() != null) {
                        A0(this.n.f, J0());
                    }
                    if (!TextUtils.isEmpty(this.V)) {
                        h1(this.n.f);
                    }
                    u1(this.n.f);
                    int i2 = this.n.e;
                    if (!(i2 == 4 || i2 == 5 || this.W)) {
                        L();
                        m1();
                    }
                    this.W = false;
                    R(this.N);
                    m1();
                }
            }
        } catch (Throwable th) {
            feh fehVar = this.M0;
            AVSDKLog.e(fehVar, "playVideo >>> " + th.getMessage());
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        rgi rgiVar;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
            return;
        }
        AVSDKLog.e(this.M0, "TextureVideoView , " + iMediaPlayer + "onCompletion videoURL: " + this.h);
        if (!this.Q0 && (rgiVar = this.n) != null && rgiVar.f != null) {
            int i2 = rgiVar.e;
            if (i2 == 1 || i2 == 4) {
                E0();
                f1();
                long i3 = i();
                if (i3 >= 0) {
                    long i4 = i();
                    if (i4 > 0) {
                        i = M0();
                    }
                    S((int) i3, i, (int) i4);
                }
                G();
                e1();
            }
        }
    }

    @Override // tb.c32
    public void r0() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a420d40", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.M0, "TextureVideoView , + startVideo ");
        this.P0 = false;
        feh fehVar = this.M0;
        AVSDKLog.e(fehVar, "startVideo##PlayState:" + this.n.e + " VideoUrl:" + this.h);
        this.x = true;
        this.q = 1;
        DWContext dWContext = this.p;
        if (dWContext != null) {
            if (!dWContext.isMute() || this.p.getVolume() > 0.0f) {
                this.e0 = false;
            }
            feh fehVar2 = this.M0;
            AVSDKLog.e(fehVar2, "sbt=" + this.p.mFrom + ",textureVideoview= startVideo with mute tag=" + this.p.isMute() + ", volume=" + this.p.getVolume() + ", is_mute_prepare=" + this.e0);
        }
        DWContext dWContext2 = this.p;
        if (!(dWContext2 == null || dWContext2.getControlParams().get("keepScreenOnDoNotCarePlayerState") == null || !ew0.s(this.p.getControlParams().get("keepScreenOnDoNotCarePlayerState")))) {
            AVSDKLog.e(this.M0, "Keep screen on don't care playerstate");
            R0();
        }
        i1();
        rgi rgiVar = this.n;
        if (rgiVar.d) {
            this.f0 = false;
            if (rgiVar.c == 4) {
                this.O0 = true;
            }
            O0();
            this.n.c = 1;
            return;
        }
        rgiVar.b = 0;
        if (!this.f0) {
            this.f0 = true;
            this.Q = System.currentTimeMillis();
        }
        if (this.R == 0) {
            this.R = System.currentTimeMillis();
        }
        if (!a(this.n.e) || ((!this.p.isFirstRenderOptimize() && (this.p.isFirstRenderOptimize() || this.i == null)) || TextUtils.isEmpty(this.h))) {
            rgi rgiVar2 = this.n;
            if (rgiVar2 == null || rgiVar2.f == null || rgiVar2.e != 5 || TextUtils.isEmpty(this.h) || !this.F) {
                rgi rgiVar3 = this.n;
                if (rgiVar3 == null || rgiVar3.f == null || TextUtils.isEmpty(this.V) || !((i = this.n.e) == 2 || i == 1 || i == 4)) {
                    rgi rgiVar4 = this.n;
                    if (!(rgiVar4 == null || rgiVar4.f == null || TextUtils.isEmpty(this.V))) {
                        rgi rgiVar5 = this.n;
                        if (rgiVar5.e == 8) {
                            u1(rgiVar5.f);
                        }
                    }
                } else {
                    W();
                }
            } else {
                this.y0 = true;
                R0();
                g1("startVideo");
                this.n.f.start();
                R(this.N);
                m1();
            }
        } else {
            N0();
            if (TextUtils.isEmpty(this.V)) {
                rgi rgiVar6 = this.n;
                if (rgiVar6.e != 3) {
                    rgiVar6.e = 8;
                    rgiVar6.d = false;
                }
            }
        }
        AVSDKLog.e(this.M0, "TextureVideoView , + startVideo finished");
    }

    @Override // tb.c32
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.p.getActivity() != null) {
            this.k = new qbi();
            gf4 gf4Var = MediaAdapteManager.mConfigAdapter;
            if (gf4Var != null) {
                this.s0 = ew0.s(gf4Var.getConfig("DWInteractive", "enableFixRecycleInit", "true"));
                this.u0 = ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "fixP2ffState", "true"));
                this.z0 = ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "enSetSurfaceSizeMore", "true"));
            } else {
                this.s0 = false;
            }
            if (this.p.getExternSurface() != null) {
                this.i = this.p.getExternSurface();
                this.j = true;
                feh fehVar = this.M0;
                AVSDKLog.e(fehVar, " initRender: extern " + this.i);
                return;
            }
            this.G = izq.i(this.l, this.p.getPlayToken()).c();
            boolean b2 = izq.i(this.l, this.p.getPlayToken()).b(this.l, this.p.mFrom);
            if (!this.G || !b2) {
                this.G = false;
            } else {
                this.G = true;
            }
            if (this.G) {
                if (this.p.getVideoAspectRatio() != DWAspectRatio.DW_CENTER_CROP) {
                    this.G = false;
                    izq.i(this.l, this.p.getPlayToken()).a(2);
                }
                DWContext dWContext = this.p;
                if (dWContext.mDisableSurfaceView) {
                    this.G = false;
                    izq.i(this.l, dWContext.getPlayToken()).a(3);
                }
            }
            if (this.p.mEnableSurfaceView) {
                this.G = true;
                AVSDKLog.e(this.M0, "setForceUseSurfaceView=true by custom.");
            }
            feh fehVar2 = this.M0;
            AVSDKLog.e(fehVar2, "HDR start check mForseUseSurfaceView " + this.G + " mUseSurfaceControl " + this.J0);
            this.J0 = D0();
            this.L0 = ja1.a1 || this.p.mPlayContext.mFixedSurfaceControl;
            ja1.r0(this.p.mPlayContext.mContext);
            if (MediaSystemUtils.isApkDebuggable() && ja1.Z0) {
                this.G = true;
                this.J0 = true;
            }
            feh fehVar3 = this.M0;
            AVSDKLog.e(fehVar3, "HDR end check mForseUseSurfaceView " + this.G + " mUseSurfaceControl " + this.J0 + " mFixedSurfaceControl " + this.L0);
            MediaPlayControlContext mediaPlayControlContext = this.p.mPlayContext;
            boolean z = this.G;
            mediaPlayControlContext.mForceUseSurfaceView = z;
            mediaPlayControlContext.mUseSurfaceControl = this.J0;
            if (z) {
                AVSDKLog.e(this.M0, "Create MediaSurfaceView");
                MediaSurfaceView mediaSurfaceView = new MediaSurfaceView(this.l, this.p.getPlayToken());
                int i = Build.VERSION.SDK_INT;
                if (i == 28 || i == 29) {
                    DWContext dWContext2 = this.p;
                    if (dWContext2.mWidth > 0 && dWContext2.mHeight > 0 && mediaSurfaceView.getHolder() != null) {
                        SurfaceHolder holder = mediaSurfaceView.getHolder();
                        DWContext dWContext3 = this.p;
                        holder.setFixedSize(dWContext3.mWidth, dWContext3.mHeight);
                    }
                }
                this.J = true;
                mediaSurfaceView.setUseCrop(false);
                this.H = mediaSurfaceView;
                mediaSurfaceView.addRenderCallback(this);
                this.H.setVideoRotation(this.o0);
                AVSDKLog.e(this.M0, "Create MediaSurfaceView finished");
            } else {
                AVSDKLog.e(this.M0, "Create DWTextureView");
                DWTextureView dWTextureView = new DWTextureView(this.l, this.k, this, this.p.getPlayToken());
                this.D = dWTextureView;
                dWTextureView.setSurfaceTextureListener(this);
                this.k.i(this.o0);
                this.D.setRotation(this.o0);
                AVSDKLog.e(this.M0, "Create DWTextureView finished");
            }
            DWContext dWContext4 = this.p;
            z0(dWContext4.mPlayContext, izq.i(this.l, dWContext4.getPlayToken()).g(), izq.i(this.l, this.p.getPlayToken()).f(), izq.i(this.l, this.p.getPlayToken()).h());
            feh fehVar4 = this.M0;
            AVSDKLog.e(fehVar4, " initRender:" + this.H + "， " + this.D);
        }
    }

    @Override // tb.c32
    public void V(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7fc628", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e(this.M0, "TextureVideoView , + pauseVideo ");
        rgi rgiVar = this.n;
        boolean z2 = rgiVar.j;
        if (z2 && !z) {
            z2 = z;
        }
        rgiVar.j = z2;
        this.C = z;
        this.q = 2;
        AVSDKLog.d(tfb.MODULE_SDK_PAGE, "pauseVideo##PlayState:" + this.n.e);
        try {
            rgi rgiVar2 = this.n;
            if (rgiVar2.f != null && rgiVar2.e == 1) {
                if (this.y0) {
                    E0();
                }
                this.y0 = false;
                this.n.f.pause();
                AbstractMediaPlayer abstractMediaPlayer = this.n.f;
                if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
                    this.k0 = Math.max(this.k0, ((TaobaoMediaPlayer) abstractMediaPlayer).getMaxRenderInterval());
                }
                f1();
                K(z);
                e1();
            }
        } catch (Throwable th) {
            feh fehVar = this.M0;
            AVSDKLog.e(fehVar, "pauseVideo >>> " + th.getMessage());
        }
        if (this.Z && this.O != null && this.X && this.Y) {
            t0("pause");
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        rgi rgiVar;
        AbstractMediaPlayer abstractMediaPlayer;
        AbstractMediaPlayer abstractMediaPlayer2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
        } else if (!this.Q0 && (rgiVar = this.n) != null && rgiVar.f != null) {
            if (this.p != null) {
                AVSDKLog.d(tfb.MODULE_SDK_PAGE, "onPrepared##PlayState:" + this.n.e);
            }
            if (!this.X && !this.p.getPrepareToFirstFrame()) {
                g1(MessageID.onPrepared);
            }
            if (k1()) {
                rgi rgiVar2 = this.n;
                if (rgiVar2.d) {
                    int i = rgiVar2.c;
                    if (i == 2) {
                        rgiVar2.e = 2;
                    } else if (i == 4) {
                        rgiVar2.e = 4;
                    } else if (i == 1) {
                        m1();
                        if (this.O0) {
                            R(this.N);
                        } else {
                            L();
                        }
                    } else if (i == 5) {
                        N(iMediaPlayer);
                    }
                    this.n.d = false;
                    n0(-1);
                    this.O0 = false;
                    return;
                }
            }
            if (!this.C) {
                N(iMediaPlayer);
            }
            int i2 = this.q;
            if (i2 == 1 && this.n.f != null && this.F) {
                this.y0 = true;
                R0();
                if (!this.X) {
                    g1(MessageID.onPrepared);
                }
                this.n.f.start();
                R(this.N);
                m1();
            } else if ((i2 != 1 || !this.F) && (abstractMediaPlayer2 = this.n.f) != null) {
                abstractMediaPlayer2.pause();
            }
            rgi rgiVar3 = this.n;
            int i3 = rgiVar3.b;
            if (i3 > 0 && (abstractMediaPlayer = rgiVar3.f) != null) {
                abstractMediaPlayer.seekTo(i3);
            }
            C1();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("177b9d00", new Object[]{this, surfaceTexture})).booleanValue();
        }
        if (this.p != null) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "onSurfaceTextureDestroyed##PlayState =" + this.n.e);
        }
        int i = this.n.e;
        if ((i == 5 || i == 4 || i == 2 || i == 1) && Build.VERSION.SDK_INT < this.A) {
            Surface surface = this.i;
            if (surface != null) {
                surface.release();
            }
            this.i = null;
            x1(this.n.f, null);
        }
        this.n.b = getCurrentPosition();
        return Build.VERSION.SDK_INT < this.A;
    }

    public final void Y0(AbstractMediaPlayer abstractMediaPlayer, r7t r7tVar) throws Throwable {
        rgi rgiVar;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5510b0cf", new Object[]{this, abstractMediaPlayer, r7tVar});
            return;
        }
        AVSDKLog.e(this.M0, "TextureVideoView prepareAysnc");
        this.P0 = false;
        MonitorMediaPlayer monitorMediaPlayer = (MonitorMediaPlayer) abstractMediaPlayer;
        monitorMediaPlayer.setConfig(r7tVar);
        monitorMediaPlayer.setExtInfo(this.o);
        monitorMediaPlayer.setFirstRenderAdapter(this);
        monitorMediaPlayer.setInnerStartFuncListener(this);
        monitorMediaPlayer.setABtestAdapter(MediaAdapteManager.mABTestAdapter);
        monitorMediaPlayer.setNetworkUtilsAdapter(this.p.mNetworkUtilsAdapter);
        monitorMediaPlayer.setH265AuthenStrategy(this.p.mPlayContext.mH265AuthenStrategy);
        monitorMediaPlayer.setH264AuthenStrategy(this.p.mPlayContext.mH264AuthenStrategy);
        monitorMediaPlayer.setAudioGainCoef(this.p.mPlayContext.getAudioGainCoef());
        monitorMediaPlayer.setAudioGainEnable(this.p.mPlayContext.getAudioGainEnable());
        abstractMediaPlayer.registerOnPreparedListener(this);
        abstractMediaPlayer.setOnVideoSizeChangedListener(this);
        abstractMediaPlayer.registerOnPreCompletionListener(this);
        abstractMediaPlayer.registerOnCompletionListener(this);
        abstractMediaPlayer.registerOnErrorListener(this);
        abstractMediaPlayer.setOnBufferingUpdateListener(this);
        abstractMediaPlayer.registerOnInfoListener(this);
        abstractMediaPlayer.registerOnLoopCompletionListener(this);
        if (abstractMediaPlayer instanceof NativeMediaPlayer) {
            ((NativeMediaPlayer) abstractMediaPlayer).setAudioStreamType(3);
        } else if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
            if ((this.p.mPlayContext.getAvdataBufferedMaxMBytes() > 0 && 15728640 > this.p.mPlayContext.getAvdataBufferedMaxMBytes()) || (ja1.S > 0 && 15728640 > ja1.S * 1024)) {
                int avdataBufferedMaxMBytes = this.p.mPlayContext.getAvdataBufferedMaxMBytes() / 1024;
                if (r7tVar == null || (map = r7tVar.T) == null || !"false".equals(map.get(atb.EXP_KEY_PRELOAD_REAL_PLAY))) {
                    AVSDKLog.e(this.M0, "TAB2 preload secenario netcuts, get orange false and not set, bufferedMaxSize=" + avdataBufferedMaxMBytes);
                } else {
                    ((TaobaoMediaPlayer) abstractMediaPlayer)._setPropertyLong(40002, avdataBufferedMaxMBytes);
                    AVSDKLog.e(tfb.MODULE_SDK_PAGE, "TAB2 preload secenario netcuts, set bufferedMaxSizeRealPlay=" + avdataBufferedMaxMBytes);
                    avdataBufferedMaxMBytes = ja1.S;
                    AVSDKLog.e(this.M0, "TAB2 preload secenario netcuts, set bufferedMaxSize=" + avdataBufferedMaxMBytes);
                }
                ((TaobaoMediaPlayer) abstractMediaPlayer)._setPropertyLong(40001, avdataBufferedMaxMBytes);
                AVSDKLog.e(this.M0, "DW TextureVideoView finally setProperty bufferedMaxSize=" + avdataBufferedMaxMBytes);
                r7tVar.v = "initMaxBuffer:" + avdataBufferedMaxMBytes + "KB/maxLevel:" + this.p.mPlayContext.getMaxLevel() + "/currentLevel:" + this.p.mPlayContext.getCurrentLevel();
                r7tVar.w = String.format("%d KB", Integer.valueOf(avdataBufferedMaxMBytes));
            }
            long j = 0;
            if (this.q != 1 && !this.p.getPrepareToFirstFrame()) {
                ((TaobaoMediaPlayer) abstractMediaPlayer)._setPropertyLong(11007, 0L);
            }
            long j2 = 1;
            if (this.s0 && (rgiVar = this.n) != null && rgiVar.d) {
                ((TaobaoMediaPlayer) abstractMediaPlayer)._setPropertyLong(11007, 1L);
            }
            if (this.p.mPlayContext.getAudioGainEnable()) {
                TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) abstractMediaPlayer;
                taobaoMediaPlayer._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ENABLE_AUDIO_GAIN_COEF, 1L);
                float audioGainCoef = this.p.mPlayContext.getAudioGainCoef();
                taobaoMediaPlayer._setPropertyFloat(12002, audioGainCoef);
                ja1.a(this.p.mPlayContext.mContext);
                boolean z = ja1.D0;
                boolean s = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_NEW_AUDIO_GAIN, "false"));
                boolean z2 = z && !s;
                if (!z2) {
                    j2 = 0;
                }
                taobaoMediaPlayer._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ENABLE_AUDIO_GAIN_COEF_AB, j2);
                AVSDKLog.e(this.M0, "textureVideoview audioGainCoef:" + audioGainCoef + ", enableAudioGain :" + z + " , orangeAudioGainDisabled:" + s + ", finalAudioGainEnabled:" + z2);
            } else {
                ((TaobaoMediaPlayer) abstractMediaPlayer)._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ENABLE_AUDIO_GAIN_COEF, 0L);
            }
            Map<String, String> map2 = this.p.mPlayContext.mHttpHeader;
            if (map2 != null) {
                ((TaobaoMediaPlayer) abstractMediaPlayer).setRequestHeader(map2);
            }
            if (r7tVar.d == 2) {
                TaobaoMediaPlayer taobaoMediaPlayer2 = (TaobaoMediaPlayer) abstractMediaPlayer;
                taobaoMediaPlayer2._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ENABLE_SEEK_PKT_DROP, ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_SEEK_PKT_DROP, "false")) ? 0L : 1L);
                taobaoMediaPlayer2._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ENABLE_SEEK_PKT_TID_DROP, ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_SEEK_PKT_DROP_BY_TID, "true")) ? 0L : 1L);
            }
            if (r7tVar.h0) {
                j = 1;
                ((TaobaoMediaPlayer) abstractMediaPlayer)._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_FORCE_MUTE_MODE, 1L);
                AVSDKLog.e(this.M0, this + "prepareAsync mForceMuteMode: true");
            } else {
                j = 1;
            }
            AVSDKLog.e(this.M0, this + "prepareAysnc mSwitchFadeIn= " + this.p.mSwitchFadeIn + ", gradualTime=" + this.p.mGradualVolumeTime);
            DWContext dWContext = this.p;
            boolean z3 = dWContext.mSwitchFadeIn;
            if (z3 && dWContext.mGradualVolumeTime > 0) {
                TaobaoMediaPlayer taobaoMediaPlayer3 = (TaobaoMediaPlayer) abstractMediaPlayer;
                if (z3) {
                }
                taobaoMediaPlayer3._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_GRADUAL_VOLUME_ENABLE, j);
                taobaoMediaPlayer3._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_GRADUAL_VOLUME_TIME, this.p.mGradualVolumeTime);
            }
        }
        this.n.i = this.p.getVolume();
        float f = this.n.i;
        if (f <= 0.0f) {
            f = 0.0f;
        } else if (f >= 1.0f) {
            f = 1.0f;
        }
        abstractMediaPlayer.setVolume(f, f);
        abstractMediaPlayer.setDataSource(r());
        if (l() != null) {
            x1(abstractMediaPlayer, l());
        }
        if (J0() != null) {
            A0(abstractMediaPlayer, J0());
        }
        abstractMediaPlayer.setScreenOnWhilePlaying(true);
        if (this.n.d) {
            this.Q = System.currentTimeMillis();
        }
        abstractMediaPlayer.prepareAsync();
    }

    public a(DWContext dWContext, boolean z) {
        this(dWContext, z, null);
    }
}
