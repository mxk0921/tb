package tb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.MediaContext;
import com.taobao.mediaplay.MediaLifecycleType;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.mediaplay.playercontrol.ProgressImageView;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import tb.feh;
import tb.ja1;
import tb.sdi;
import tb.z5r;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sdi implements jsc, asc, urc, zrc, gsc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MediaContext f27971a;
    public final FrameLayout b;
    public final yfi c;
    public com.taobao.mediaplay.playercontrol.a d;
    public boolean e;
    public final ArrayList<urc> g;
    public final com.taobao.mediaplay.a h;
    public BroadcastReceiver i;
    public final ProgressImageView m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public float w;
    public float x;
    public IApmEventListener y;
    public final feh z;
    public MediaLifecycleType f = MediaLifecycleType.DEFAULT;
    public final boolean j = true;
    public final int k = 2;
    public boolean l = false;
    public volatile boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;
    public boolean v = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (sdi.q(sdi.this)) {
                if (!sdi.r(sdi.this).r()) {
                    sdi.r(sdi.this).o();
                } else if (sdi.r(sdi.this) != null) {
                    sdi.r(sdi.this).f();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements jsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(sdi sdiVar) {
        }

        @Override // tb.jsc
        public void onPick(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcc46917", new Object[]{this, new Boolean(z), str});
            } else {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "onMediaRetryForRtcDegrade retry for first time warm up failed");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements jsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(sdi sdiVar) {
        }

        @Override // tb.jsc
        public void onPick(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcc46917", new Object[]{this, new Boolean(z), str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e extends CountDownTimer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a extends CountDownTimer {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(long j, long j2) {
                super(j, j2);
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/MediaController$7$1");
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
                } else if (sdi.h(sdi.this)) {
                    sdi.this.B0(false);
                    cancel();
                }
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("badeed9", new Object[]{this});
                } else if (sdi.i(sdi.this)) {
                    sdi.this.B0(false);
                    AVSDKLog.e(sdi.k(sdi.this), "newTBPlayer in Poor Net Quality > 8s, close the loadingView.");
                }
            }
        }

        public e(long j, long j2) {
            super(j, j2);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/MediaController$7");
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            sdi.this.B0(true);
            new a(ja1.Q0 - ja1.P0, 100L).start();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
            } else if (sdi.h(sdi.this)) {
                AVSDKLog.e(sdi.k(sdi.this), "get the mIsFirstFrameUpdate tag, cancel the counter");
                cancel();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f extends CountDownTimer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(long j, long j2) {
            super(j, j2);
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/MediaController$8");
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else if (sdi.j(sdi.this)) {
                sdi.this.B0(true);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
            } else if (!sdi.j(sdi.this)) {
                cancel();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements hsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(774897714);
            t2o.a(774897793);
        }

        public g() {
        }

        public void a(com.taobao.mediaplay.player.d dVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa46426c", new Object[]{this, dVar, new Boolean(z)});
                return;
            }
            MediaLifecycleType f = sdi.f(sdi.this);
            MediaLifecycleType mediaLifecycleType = MediaLifecycleType.PLAY;
            if (f != mediaLifecycleType) {
                if (z) {
                    if (dVar.v() != 1 || !sdi.p(sdi.this)) {
                        if (!TextUtils.isEmpty(sdi.o(sdi.this).getVideoToken()) && dVar.v() == 1) {
                            sdi.this.n0(mediaLifecycleType);
                        }
                        AVSDKLog.e(sdi.k(sdi.this), "ProcessSurfaceTextureEvent finish");
                        return;
                    }
                    sdi.this.n0(mediaLifecycleType);
                    dVar.I(null, 12100L, 0L, 0L, null);
                    AVSDKLog.e(sdi.k(sdi.this), "ProcessSurfaceTextureEvent finish");
                    return;
                }
                AVSDKLog.e(sdi.k(sdi.this), "ProcessSurfaceTextureEvent not update because mIsReadyToHideCover is false.");
            }
        }

        public /* synthetic */ g(sdi sdiVar, a aVar) {
            this();
        }
    }

    static {
        t2o.a(774897704);
        t2o.a(774897701);
        t2o.a(774897787);
        t2o.a(774897700);
        t2o.a(774897818);
        t2o.a(774897792);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sdi(com.taobao.mediaplay.MediaContext r9) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sdi.<init>(com.taobao.mediaplay.MediaContext):void");
    }

    public static /* synthetic */ boolean d(sdi sdiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76b18466", new Object[]{sdiVar, new Boolean(z)})).booleanValue();
        }
        sdiVar.t = z;
        return z;
    }

    public static /* synthetic */ boolean e(sdi sdiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a265a9b5", new Object[]{sdiVar})).booleanValue();
        }
        return sdiVar.u;
    }

    public static /* synthetic */ MediaLifecycleType f(sdi sdiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaLifecycleType) ipChange.ipc$dispatch("bb2adf26", new Object[]{sdiVar});
        }
        return sdiVar.f;
    }

    public static /* synthetic */ boolean g(sdi sdiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30291205", new Object[]{sdiVar, new Boolean(z)})).booleanValue();
        }
        sdiVar.u = z;
        return z;
    }

    public static /* synthetic */ boolean h(sdi sdiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("888e3ba4", new Object[]{sdiVar})).booleanValue();
        }
        return sdiVar.l;
    }

    public static /* synthetic */ boolean i(sdi sdiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("232efe25", new Object[]{sdiVar})).booleanValue();
        }
        sdiVar.getClass();
        return false;
    }

    public static /* synthetic */ boolean j(sdi sdiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdcfc0a6", new Object[]{sdiVar})).booleanValue();
        }
        return sdiVar.q;
    }

    public static /* synthetic */ feh k(sdi sdiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("66df27ad", new Object[]{sdiVar});
        }
        return sdiVar.z;
    }

    public static /* synthetic */ boolean l(sdi sdiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7247f138", new Object[]{sdiVar})).booleanValue();
        }
        return sdiVar.o;
    }

    public static /* synthetic */ boolean m(sdi sdiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce8b3b9", new Object[]{sdiVar})).booleanValue();
        }
        return sdiVar.r;
    }

    public static /* synthetic */ boolean n(sdi sdiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16074881", new Object[]{sdiVar, new Boolean(z)})).booleanValue();
        }
        sdiVar.r = z;
        return z;
    }

    public static /* synthetic */ MediaContext o(sdi sdiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaContext) ipChange.ipc$dispatch("e2755332", new Object[]{sdiVar});
        }
        return sdiVar.f27971a;
    }

    public static /* synthetic */ boolean p(sdi sdiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("422a38bb", new Object[]{sdiVar})).booleanValue();
        }
        return sdiVar.e;
    }

    public static /* synthetic */ boolean q(sdi sdiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dccafb3c", new Object[]{sdiVar})).booleanValue();
        }
        return sdiVar.x();
    }

    public static /* synthetic */ com.taobao.mediaplay.playercontrol.a r(sdi sdiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.mediaplay.playercontrol.a) ipChange.ipc$dispatch("a0457347", new Object[]{sdiVar});
        }
        return sdiVar.d;
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.N();
        }
        IApmEventListener iApmEventListener = this.y;
        if (iApmEventListener != null) {
            c21.k(iApmEventListener);
            AVSDKLog.e(this.z, "ApmManager removeApmEventListener index at destroy");
            this.y = null;
        }
    }

    public void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccfe280", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.playercontrol.a aVar = this.d;
        if (aVar != null) {
            aVar.p();
        } else {
            X(true);
        }
    }

    public Bitmap B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            return yfiVar.P();
        }
        AVSDKLog.e(this.z, "yezo:getCurrentFrame with mMediaPlayViewController == null");
        return null;
    }

    public void B0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8553cae9", new Object[]{this, new Boolean(z)});
            return;
        }
        ProgressImageView progressImageView = this.m;
        if (progressImageView != null && this.n) {
            if (z) {
                progressImageView.setVisibility(0);
                FrameLayout frameLayout = this.b;
                if (frameLayout != null) {
                    frameLayout.bringToFront();
                    return;
                }
                return;
            }
            progressImageView.setVisibility(8);
        }
    }

    public Map<String, String> C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            return yfiVar.Q();
        }
        return null;
    }

    public void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.c.c();
        }
    }

    public String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b6f5b6e", new Object[]{this});
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            return yfiVar.R();
        }
        return null;
    }

    public void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6621cb5d", new Object[]{this});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.C0();
        }
    }

    public int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        yfi yfiVar = this.c;
        if (yfiVar == null || yfiVar.O() == null) {
            return 0;
        }
        return this.c.O().s();
    }

    public void E0(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be6cf22", new Object[]{this, new Integer(i), str});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.D0(i, str);
        }
    }

    public int F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        yfi yfiVar = this.c;
        if (yfiVar == null || yfiVar.O() == null) {
            return 0;
        }
        return this.c.O().v();
    }

    public void F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3aad67", new Object[]{this});
        } else {
            this.c.G0();
        }
    }

    public String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bd55545", new Object[]{this});
        }
        yfi yfiVar = this.c;
        if (yfiVar == null || yfiVar.O() == null) {
            return "";
        }
        return this.c.O().q();
    }

    public final void G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472aaa68", new Object[]{this});
            return;
        }
        try {
            if (this.i != null) {
                this.f27971a.getContext().unregisterReceiver(this.i);
                this.i = null;
            }
        } catch (Exception unused) {
        }
    }

    public int H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        yfi yfiVar = this.c;
        if (yfiVar == null || yfiVar.O() == null) {
            return 0;
        }
        return this.c.O().w();
    }

    public void H0(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16429a7", new Object[]{this, onVideoClickListener});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.H0(onVideoClickListener);
        }
    }

    public View I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }

    public void I0(fsc fscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41442e2a", new Object[]{this, fscVar});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.I0(fscVar);
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8830805", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.playercontrol.a aVar = this.d;
        if (aVar != null) {
            aVar.g();
        }
    }

    public void J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82f17b2e", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.z, "updateLiveMediaInfoData");
        MediaPlayControlContext mediaPlayControlContext = this.f27971a.mMediaPlayContext;
        if (mediaPlayControlContext.mTBLive && mediaPlayControlContext.mMediaLiveInfo != null) {
            this.h.L(this);
        }
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac7ea03", new Object[]{this});
        } else {
            this.i = new BroadcastReceiver() { // from class: com.taobao.mediaplay.MediaController$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(MediaController$2 mediaController$2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/MediaController$2");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Context applicationContext;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") && (applicationContext = context.getApplicationContext()) != null) {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) applicationContext.getSystemService("connectivity")).getActiveNetworkInfo();
                        int type = activeNetworkInfo != null ? activeNetworkInfo.getType() : -1;
                        if (type != ja1.e) {
                            z5r.b();
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                            if (type == 0 && sdi.o(sdi.this).mbShowNoWifiToast && type != ja1.e) {
                                Toast.makeText(sdi.o(sdi.this).getContext(), sdi.o(sdi.this).getContext().getResources().getString(R.string.avsdk_mobile_network_hint), 0).show();
                            }
                            if (!sdi.m(sdi.this) || !sdi.l(sdi.this) || !sdi.p(sdi.this) || sdi.e(sdi.this)) {
                                feh k = sdi.k(sdi.this);
                                AVSDKLog.e(k, "Not retryStart after network resume from error for mIsNetStateError=" + sdi.m(sdi.this) + ", mNeedRetryAfterNetError=" + sdi.l(sdi.this) + ", mRenderStarted=" + sdi.p(sdi.this) + ", mIsInBackGround=" + sdi.e(sdi.this));
                            } else {
                                AVSDKLog.e(sdi.k(sdi.this), "retryStart after network resume from error.");
                                sdi.this.C0();
                                sdi.n(sdi.this, false);
                            }
                            ja1.e = type;
                        } else if (sdi.l(sdi.this)) {
                            sdi.n(sdi.this, true);
                        }
                    }
                }
            };
        }
    }

    public void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e707e7", new Object[]{this});
        } else if (this.f27971a.mMediaPlayContext.mTBLive) {
            this.h.L(this);
        }
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63f2d892", new Object[]{this})).booleanValue();
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            return yfiVar.T();
        }
        return false;
    }

    public void L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95e6b49d", new Object[]{this});
            return;
        }
        int i = this.k;
        if (i != 0) {
            MediaPlayControlContext mediaPlayControlContext = this.f27971a.mMediaPlayContext;
            if (mediaPlayControlContext.mMediaLiveInfo != null && i != 2) {
                return;
            }
            if ((mediaPlayControlContext.getMediaInfoParams() == null || !this.j) && !TextUtils.isEmpty(this.f27971a.mMediaPlayContext.mVideoId) && !this.f27971a.mMediaPlayContext.mTBLive) {
                yfi yfiVar = this.c;
                if (yfiVar != null) {
                    yfiVar.b0();
                }
                this.h.L(this);
            }
        }
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            return yfiVar.U();
        }
        return false;
    }

    public void M0(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dfca00", new Object[]{this, mediaLiveWarmupConfig});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.K0(mediaLiveWarmupConfig);
        }
        this.s = true;
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79996151", new Object[]{this})).booleanValue();
        }
        ProgressImageView progressImageView = this.m;
        if (progressImageView == null || !this.n || progressImageView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28c61cbb", new Object[]{this})).booleanValue();
        }
        DisplayMetrics displayMetrics = this.f27971a.getContext().getResources().getDisplayMetrics();
        float f2 = displayMetrics.xdpi;
        double d2 = displayMetrics.widthPixels / f2;
        double d3 = displayMetrics.heightPixels / displayMetrics.ydpi;
        if (Math.sqrt((d2 * d2) + (d3 * d3)) >= 7.0d) {
            return true;
        }
        return false;
    }

    public final void P(MediaLifecycleType mediaLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9048fd", new Object[]{this, mediaLifecycleType});
            return;
        }
        Iterator<urc> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().onLifecycleChanged(mediaLifecycleType);
        }
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.pauseVideo();
        }
    }

    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
        } else {
            this.c.W();
        }
    }

    public void U(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a117dde9", new Object[]{this, context});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.X(context);
        }
    }

    public void V(urc urcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5bd41c4", new Object[]{this, urcVar});
        } else if (!this.g.contains(urcVar)) {
            this.g.add(urcVar);
        }
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c71d39", new Object[]{this});
        } else if (x()) {
            this.b.setOnClickListener(new b());
        }
    }

    public void X(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa9d8", new Object[]{this, new Boolean(z)});
        } else if (this.d == null) {
            com.taobao.mediaplay.playercontrol.a aVar = new com.taobao.mediaplay.playercontrol.a(this.f27971a, z);
            this.d = aVar;
            this.b.addView(aVar.e(), new FrameLayout.LayoutParams(-1, -1, 17));
            V(this.d);
            this.d.l(this);
            W();
        }
    }

    public final void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd610a1", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (this.i == null) {
            K();
        } else {
            try {
                this.f27971a.getContext().unregisterReceiver(this.i);
            } catch (Exception unused) {
            }
        }
        try {
            this.f27971a.getContext().registerReceiver(this.i, intentFilter);
        } catch (Exception unused2) {
        }
    }

    public void Z(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae58360", new Object[]{this, onVideoClickListener});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.a(onVideoClickListener);
        }
    }

    @Override // tb.zrc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2fc8f1", new Object[]{this});
        } else {
            F0();
        }
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5116570c", new Object[]{this});
        } else {
            ((com.taobao.mediaplay.player.d) this.c.O()).V1(new g(this, null));
        }
    }

    @Override // tb.gsc
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4e1dfdf", new Object[]{this})).booleanValue();
        }
        this.h.L(this);
        String videoUrl = this.f27971a.mMediaPlayContext.getVideoUrl();
        feh fehVar = this.z;
        AVSDKLog.e(fehVar, "Reselect newUrl is " + videoUrl);
        return false;
    }

    public void b0(fsc fscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427b9563", new Object[]{this, fscVar});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.g(fscVar);
        }
    }

    public void c0() {
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.f = MediaLifecycleType.BEFORE;
        G0();
        this.c.Z();
        com.taobao.mediaplay.playercontrol.a aVar = this.d;
        if (aVar != null) {
            aVar.d();
            this.d = null;
        }
        MediaContext mediaContext = this.f27971a;
        if (!(mediaContext == null || (mediaPlayControlContext = mediaContext.mMediaPlayContext) == null)) {
            mediaPlayControlContext.setUseMiniBfrtc(false);
        }
        com.taobao.mediaplay.a aVar2 = this.h;
        if (aVar2 != null) {
            aVar2.O();
        }
    }

    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc677c9c", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.playercontrol.a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    public boolean e0(jsr jsrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6285d7d", new Object[]{this, jsrVar})).booleanValue();
        }
        yfi yfiVar = this.c;
        if (yfiVar == null) {
            return false;
        }
        return yfiVar.a0(jsrVar);
    }

    public void f0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c8f62a", new Object[]{this, str});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.c0(str);
        }
    }

    public void g0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4aa802", new Object[]{this, new Boolean(z)});
        } else if (this.c == null) {
        } else {
            if (ja1.h0(this.f27971a.getContext()) || TextUtils.isEmpty(this.f27971a.mMediaPlayContext.mSeamlessSwitchingSelectName)) {
                this.c.d0(z);
                this.f27971a.mMediaPlayContext.setUseMiniBfrtc(false);
                return;
            }
            AVSDKLog.e(this.z, "SwitchStream seamlessSwitchStream return when mSeamlessSwitchingSelectName is not null");
        }
    }

    public void h0(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c54c69", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else if (this.c.O() == null || this.c.O().v() == 6 || this.c.O().v() == 3 || this.c.O().v() == 0 || this.c.O().v() == 8) {
            MediaPlayControlContext mediaPlayControlContext = this.f27971a.mMediaPlayContext;
            mediaPlayControlContext.mSeekWhenPrepared = i;
            mediaPlayControlContext.mSeekIgnorePauseStateWhenPrepared = true;
        } else {
            AVSDKLog.e(this.z, "TextureVideoView seekTo");
            this.c.O().d0(i, z, z2);
            this.f27971a.mMediaPlayContext.mSeekWhenPrepared = 0;
        }
    }

    public void i0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a617f7", new Object[]{this, str});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.e0(str);
        }
    }

    public void j0(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.h0(nj9Var);
        }
    }

    public void k0(isc iscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6509b308", new Object[]{this, iscVar});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.i0(iscVar);
        }
    }

    public void l0(isc iscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ad0854", new Object[]{this, iscVar});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.j0(iscVar);
        }
    }

    public void m0(InnerStartFuncListener innerStartFuncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805c05a7", new Object[]{this, innerStartFuncListener});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.k0(innerStartFuncListener);
        }
    }

    public final void n0(MediaLifecycleType mediaLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd3522e", new Object[]{this, mediaLifecycleType});
            return;
        }
        P(mediaLifecycleType);
        if (!N()) {
            return;
        }
        if (mediaLifecycleType == MediaLifecycleType.BEFORE) {
            B0(true);
        } else if (mediaLifecycleType == MediaLifecycleType.PLAY) {
            B0(false);
        }
    }

    public void o0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d128a9", new Object[]{this, new Boolean(z)});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.l0(z);
        }
    }

    @Override // tb.urc
    public void onLifecycleChanged(MediaLifecycleType mediaLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0fa27", new Object[]{this, mediaLifecycleType});
        } else if (mediaLifecycleType != this.f) {
            if (mediaLifecycleType == MediaLifecycleType.PLAY) {
                Y();
            }
            this.f = mediaLifecycleType;
        }
    }

    @Override // tb.asc
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.playercontrol.a aVar = this.d;
        if (aVar != null) {
            aVar.n();
        }
    }

    @Override // tb.asc
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.playercontrol.a aVar = this.d;
        if (aVar != null) {
            aVar.n();
        }
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.asc
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.mediaplay.playercontrol.a aVar = this.d;
        if (aVar != null) {
            aVar.n();
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.playercontrol.a aVar = this.d;
        if (aVar != null) {
            aVar.m();
        }
    }

    @Override // tb.asc
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
        }
    }

    @Override // tb.asc
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.asc
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        }
    }

    @Override // tb.asc
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.asc
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.playercontrol.a aVar = this.d;
        if (aVar != null) {
            aVar.m();
        }
        AVSDKLog.e(this.z, "create the loadingui CountDownTimer at onMediaStart in MediaController");
        new e(ja1.P0, 100L).start();
    }

    @Override // tb.jsc
    public void onPick(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc46917", new Object[]{this, new Boolean(z), str});
            return;
        }
        this.f27971a.addPlayExpUtParams(this.h.A());
        this.c.r0(this.f27971a.mMediaPlayContext.getVideoUrl());
    }

    public void p0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1608c02e", new Object[]{this, str});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.m0(str);
        }
    }

    public void q0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b423788", new Object[]{this, str});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.n0(str);
        }
    }

    public void r0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.V(z);
        }
    }

    public void s(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46dce79", new Object[]{this, view});
            return;
        }
        com.taobao.mediaplay.playercontrol.a aVar = this.d;
        if (aVar != null) {
            aVar.c(view);
        }
    }

    public void s0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39f9d24", new Object[]{this, map});
            return;
        }
        MediaPlayControlContext mediaPlayControlContext = this.f27971a.mMediaPlayContext;
        if (mediaPlayControlContext != null) {
            mediaPlayControlContext.setRequestHeader(map);
        }
    }

    @Override // tb.zrc
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
        } else if (this.c.O() == null || this.c.O().v() == 6 || this.c.O().v() == 3 || this.c.O().v() == 0 || this.c.O().v() == 8) {
            this.f27971a.mMediaPlayContext.mSeekWhenPrepared = i;
        } else {
            this.c.O().c0(i);
            this.f27971a.mMediaPlayContext.mSeekWhenPrepared = 0;
        }
    }

    public boolean t(jsr jsrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89570f5a", new Object[]{this, jsrVar})).booleanValue();
        }
        yfi yfiVar = this.c;
        if (yfiVar == null) {
            return false;
        }
        return yfiVar.I(jsrVar);
    }

    public void t0(ykd ykdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab8c6a3", new Object[]{this, ykdVar});
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450701c0", new Object[]{this});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.J();
        }
    }

    public void u0(boolean z, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b6875c", new Object[]{this, new Boolean(z), new Integer(i), new Boolean(z2)});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.o0(z, i, z2);
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13155a5c", new Object[]{this});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.K();
        }
    }

    public void v0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53919393", new Object[]{this, str});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.p0(str);
        }
    }

    public void w(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f07861", new Object[]{this, map});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.L(map);
        }
    }

    public void w0(TaoLiveVideoView.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b06e5b", new Object[]{this, pVar});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.q0(pVar);
        }
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38676b68", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            return false;
        }
        return true;
    }

    public void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ec5bda", new Object[]{this});
        }
    }

    public boolean y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b9fa1ed", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            return yfiVar.M(z);
        }
        return false;
    }

    public void y0(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae597476", new Object[]{this, new Float(f2), new Float(f3)});
            return;
        }
        feh fehVar = this.z;
        AVSDKLog.e(fehVar, "setTranslation translationX is " + f2 + " translationY is " + f3);
        this.w = f2;
        this.x = f3;
    }

    public void z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d518e58d", new Object[]{this, new Integer(i)});
            return;
        }
        MediaPlayControlContext mediaPlayControlContext = this.f27971a.mMediaPlayContext;
        if (mediaPlayControlContext.mTBLive && mediaPlayControlContext.mMediaLiveInfo != null) {
            this.h.q(i, this);
        }
    }

    public void z0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f2)});
            return;
        }
        yfi yfiVar = this.c;
        if (yfiVar != null) {
            yfiVar.s0(f2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IApmEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                return;
            }
            if (i == 1) {
                sdi.d(sdi.this, false);
                sdi.g(sdi.this, true);
                str = "NOTIFY_FOREGROUND_2_BACKGROUND";
            } else if (i != 2) {
                if (i == 50) {
                    sdi.d(sdi.this, false);
                    sdi.g(sdi.this, true);
                }
                str = "unknown";
            } else {
                sdi.d(sdi.this, true);
                sdi.g(sdi.this, false);
                str = "NOTIFY_BACKGROUND_2_FOREGROUND";
            }
            feh k = sdi.k(sdi.this);
            AVSDKLog.e(k, "Apm event " + str + "， is playing " + sdi.this.M());
        }
    }

    public final boolean Q(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb916346", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        feh fehVar = this.z;
        AVSDKLog.e(fehVar, "Enter onMediaRetryForRtcDegrade" + i);
        MediaPlayControlContext mediaPlayControlContext = this.f27971a.mMediaPlayContext;
        String str = mediaPlayControlContext.mSelectedUrlName;
        String videoUrl = mediaPlayControlContext.getVideoUrl();
        feh fehVar2 = this.z;
        AVSDKLog.e(fehVar2, "onMediaRetryForRtcDegrade old url is " + videoUrl);
        if (!ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "EnableRtcAutoDegrade1", "true"))) {
            AVSDKLog.e(this.z, "Not retry by DisableRtcAutoDegrade");
            return false;
        }
        n0(MediaLifecycleType.BEFORE);
        String config = OrangeConfig.getInstance().getConfig("DWInteractive", "rtcDegradeRetryErrorLists", "[-10610]");
        if (this.f27971a.mEnableNewTBPlayer && (((this.p && this.s && !this.e) || (this.t && this.e && ew0.o(i, config))) && !this.v)) {
            AVSDKLog.e(this.z, "set current url when warmuped instance get network error.");
            this.h.L(new c(this));
            this.c.r0(videoUrl);
            this.v = true;
            return true;
        } else if (!MediaConstant.RTCLIVE_URL_NAME.equals(this.f27971a.mMediaPlayContext.mSelectedUrlName)) {
            AVSDKLog.e(this.z, "Not retry By NotRtcUrl");
            return false;
        } else {
            String config2 = OrangeConfig.getInstance().getConfig("DWInteractive", "EnableRtcAutoDegradeFrom", "*");
            feh fehVar3 = this.z;
            AVSDKLog.e(fehVar3, "ENABLE_RTC_DEGRADE_FROM is " + config2 + ",getFrom is " + this.f27971a.mMediaPlayContext.getFrom());
            if (!ew0.n(this.f27971a.mMediaPlayContext.getFrom(), config2)) {
                AVSDKLog.e(this.z, "Not retry by getFrom not support ");
                return false;
            }
            if ("4K".equals(ja1.l0("push_res", videoUrl, "&"))) {
                feh fehVar4 = this.z;
                AVSDKLog.e(fehVar4, "Retry setDisableDefinition " + this.f27971a.mMediaPlayContext.mSelectDefinition);
                MediaPlayControlContext mediaPlayControlContext2 = this.f27971a.mMediaPlayContext;
                mediaPlayControlContext2.setDisableDefinition("uhd_" + this.f27971a.mMediaPlayContext.mSelectDefinition);
            }
            if (ew0.o(i, OrangeConfig.getInstance().getConfig("DWInteractive", "DisableRtcAudioDegradeBlackList", ""))) {
                AVSDKLog.e(this.z, "Not retry by in blackList");
                return false;
            }
            this.f27971a.mMediaPlayContext.setVideoUrl("");
            this.f27971a.mMediaPlayContext.setUseRtcLive(false);
            this.h.L(new d(this));
            String videoUrl2 = this.f27971a.mMediaPlayContext.getVideoUrl();
            if (TextUtils.isEmpty(videoUrl2) || !videoUrl2.contains(".flv") || !videoUrl2.contains("http")) {
                feh fehVar5 = this.z;
                AVSDKLog.e(fehVar5, "Retry Failed newUrl is " + videoUrl2);
                return false;
            }
            AVSDKLog.e(this.z, "Retry newUrl is ".concat(videoUrl2));
            this.f27971a.mMediaPlayContext.setDegradeCode(i, str);
            this.f27971a.mMediaPlayContext.mSelectFlvUrlReason = 10;
            onMediaInfo(null, 12150L, 0L, 0L, null);
            this.c.r0(videoUrl2);
            this.c.f0(i, str);
            this.c.g0(10);
            return true;
        }
    }

    public final boolean R(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("132ccbc8", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!ew0.o(i, OrangeConfig.getInstance().getConfig("DWInteractive", "vvcRetryErrorLists", "*"))) {
            return false;
        }
        String videoUrl = this.f27971a.mMediaPlayContext.getVideoUrl();
        if (TextUtils.isEmpty(videoUrl)) {
            return false;
        }
        this.f27971a.mMediaPlayContext.setVideoUrl("");
        this.h.Z();
        this.h.L(new tdi(this));
        String videoUrl2 = this.f27971a.mMediaPlayContext.getVideoUrl();
        if (TextUtils.isEmpty(videoUrl2) || videoUrl2.equals(videoUrl)) {
            return false;
        }
        this.f27971a.mMediaPlayContext.unselectS266OfPlay();
        MediaPlayControlContext mediaPlayControlContext = this.f27971a.mMediaPlayContext;
        String str = mediaPlayControlContext.mSelectedUrlName;
        mediaPlayControlContext.setDegradeCode(i, str);
        this.c.f0(i, str);
        if (!ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "EnableseamlessDegradeForVVC", "false")) || !this.e) {
            this.c.r0(this.f27971a.mMediaPlayContext.getVideoUrl());
        } else {
            this.c.c0(this.f27971a.mMediaPlayContext.getVideoUrl());
        }
        return true;
    }

    @Override // tb.gsc
    public boolean c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe89394e", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        String videoDefinition = this.f27971a.mMediaPlayContext.getVideoDefinition();
        if (MediaConstant.RTCLIVE_URL_NAME.equals(this.f27971a.mMediaPlayContext.mSelectedUrlName)) {
            if (TextUtils.isEmpty(videoDefinition) || !videoDefinition.contains("266")) {
                if (Q(i, i2)) {
                    return true;
                }
            } else if (R(i, i2)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.asc
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        } else if (3 == j && (obj instanceof Map)) {
            this.e = true;
        } else if (j == 12101) {
            this.l = true;
            if (this.n && this.m != null && N()) {
                B0(false);
            }
        } else if (this.e && (j == 701 || j == 741)) {
            this.q = true;
            if (this.n && this.m != null && !N()) {
                new f(ja1.R0, 100L).start();
            }
        } else if (j == 702 || j == 742) {
            if (this.n && this.m != null) {
                B0(false);
                this.q = false;
            }
        } else if (j != 302) {
        } else {
            if (this.f27971a.mEnableNewTBPlayer && I() != null && j2 > j3 && !O()) {
                feh fehVar = this.z;
                AVSDKLog.e(fehVar, "lee +++ video size update: w=" + j2 + ", h=" + j3 + ", TranslationY=" + this.x);
                I().setTranslationY(this.x);
            } else if (I() == null) {
            } else {
                if (this.w != 0.0f || this.x != 0.0f) {
                    feh fehVar2 = this.z;
                    AVSDKLog.e(fehVar2, "shengjian +++ video size update: w=" + j2 + ", h=" + j3 + ", TranslationY=" + this.x);
                    I().setTranslationX(this.w);
                    I().setTranslationY(this.x);
                }
            }
        }
    }
}
