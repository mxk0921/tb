package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.constraintlayout.motion.widget.Key;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.DWViewUtil;
import com.taobao.media.MediaSystemUtils;
import com.taobao.mediaplay.MediaContext;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.model.MediaInfoAuthRegister;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yfi implements asc, jrc, krc, rrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MediaContext f32045a;
    public final com.taobao.mediaplay.player.b b;
    public boolean c;
    public float f;
    public Runnable g;
    public AnimatorSet i;
    public AnimatorSet j;
    public ViewGroup k;
    public ViewGroup l;
    public FrameLayout m;
    public float n;
    public float o;
    public int q;
    public int r;
    public volatile boolean s;
    public int t;
    public int u;
    public int v;
    public final feh w;
    public boolean e = true;
    public int h = 0;
    public int[] p = new int[2];
    public final Handler d = new Handler();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                yfi.r(yfi.this).start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float abs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.width = (int) (yfi.m(yfi.this) + (((yfi.n(yfi.this) - yfi.m(yfi.this)) * abs) / 90.0f));
            layoutParams.height = (int) (yfi.y(yfi.this) + (((yfi.B(yfi.this) - yfi.y(yfi.this)) * abs) / 90.0f));
            layoutParams.topMargin = yfi.t(yfi.this)[1];
            layoutParams.leftMargin = yfi.t(yfi.this)[0];
            yfi.C(yfi.this).setLayoutParams(layoutParams);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                yfi.u(yfi.this);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                yfi.u(yfi.this);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            yfi.C(yfi.this).requestLayout();
            MediaContext F = yfi.F(yfi.this);
            MediaPlayScreenType mediaPlayScreenType = MediaPlayScreenType.LANDSCAPE_FULL_SCREEN;
            F.setVideoScreenType(mediaPlayScreenType);
            yfi.G(yfi.this).S(mediaPlayScreenType);
            if (yfi.F(yfi.this) != null && !yfi.F(yfi.this).mHookKeyBackToggleEvent) {
                yfi.F(yfi.this).registerKeyBackEventListener(yfi.this);
            }
            yfi.C(yfi.this).setLayerType(0, null);
            yfi.p(yfi.this, false);
        }
    }

    static {
        t2o.a(774897732);
        t2o.a(774897787);
        t2o.a(774897699);
        t2o.a(774897757);
        t2o.a(774897758);
    }

    public yfi(MediaContext mediaContext) {
        this.f32045a = mediaContext;
        this.w = new feh(toString(), mediaContext.mPlayToken);
        if (!TextUtils.isEmpty(mediaContext.getVideoToken())) {
            this.b = new com.taobao.mediaplay.player.d(mediaContext, mediaContext.getVideoToken());
        } else {
            this.b = new com.taobao.mediaplay.player.d(mediaContext);
        }
        this.b.i0(mediaContext.mLoop);
        this.b.X(this);
    }

    public static /* synthetic */ Handler A(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("1a098a40", new Object[]{yfiVar});
        }
        return yfiVar.d;
    }

    public static /* synthetic */ int B(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75f3642d", new Object[]{yfiVar})).intValue();
        }
        return yfiVar.u;
    }

    public static /* synthetic */ ViewGroup C(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6162c1fa", new Object[]{yfiVar});
        }
        return yfiVar.k;
    }

    public static /* synthetic */ void D(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9068c73c", new Object[]{yfiVar});
        } else {
            yfiVar.y0();
        }
    }

    public static /* synthetic */ ViewGroup E(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("e5911cb8", new Object[]{yfiVar});
        }
        return yfiVar.l;
    }

    public static /* synthetic */ MediaContext F(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaContext) ipChange.ipc$dispatch("ae63053a", new Object[]{yfiVar});
        }
        return yfiVar.f32045a;
    }

    public static /* synthetic */ com.taobao.mediaplay.player.b G(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.mediaplay.player.b) ipChange.ipc$dispatch("e717cc65", new Object[]{yfiVar});
        }
        return yfiVar.b;
    }

    public static /* synthetic */ float H(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5538d30", new Object[]{yfiVar})).floatValue();
        }
        return yfiVar.n;
    }

    public static /* synthetic */ int m(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce434faa", new Object[]{yfiVar})).intValue();
        }
        return yfiVar.q;
    }

    public static /* synthetic */ int n(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b7e012b", new Object[]{yfiVar})).intValue();
        }
        return yfiVar.t;
    }

    public static /* synthetic */ float o(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b2e8296", new Object[]{yfiVar})).floatValue();
        }
        return yfiVar.o;
    }

    public static /* synthetic */ boolean p(yfi yfiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a06f384f", new Object[]{yfiVar, new Boolean(z)})).booleanValue();
        }
        yfiVar.s = z;
        return z;
    }

    public static /* synthetic */ void q(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55a3e5a8", new Object[]{yfiVar});
        } else {
            yfiVar.w0();
        }
    }

    public static /* synthetic */ AnimatorSet r(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("38f19aea", new Object[]{yfiVar});
        }
        return yfiVar.i;
    }

    public static /* synthetic */ void s(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd53fa2b", new Object[]{yfiVar});
        } else {
            yfiVar.A0();
        }
    }

    public static /* synthetic */ int[] t(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("c746cab8", new Object[]{yfiVar});
        }
        return yfiVar.p;
    }

    public static /* synthetic */ void u(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c95d2d", new Object[]{yfiVar});
        } else {
            yfiVar.u0();
        }
    }

    public static /* synthetic */ int v(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5040ea1", new Object[]{yfiVar})).intValue();
        }
        return yfiVar.h;
    }

    public static /* synthetic */ int w(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c15cfca9", new Object[]{yfiVar})).intValue();
        }
        int i = yfiVar.h;
        yfiVar.h = 1 + i;
        return i;
    }

    public static /* synthetic */ float x(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("323ec01f", new Object[]{yfiVar})).floatValue();
        }
        return yfiVar.f;
    }

    public static /* synthetic */ int y(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8b8b2ac", new Object[]{yfiVar})).intValue();
        }
        return yfiVar.r;
    }

    public static /* synthetic */ Runnable z(yfi yfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("7d4dcc2f", new Object[]{yfiVar});
        }
        return yfiVar.g;
    }

    public final void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d42ff6", new Object[]{this});
        } else {
            this.d.post(new xfi(this));
        }
    }

    public void B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e800daa4", new Object[]{this});
        } else if (this.b.v() == 5 || this.b.v() == 8 || !TextUtils.isEmpty(this.f32045a.getVideoToken())) {
            this.b.t0();
        } else if (this.b.v() == 4 || (this.b.C() && this.b.o() == 4)) {
            if (this.b.C()) {
                this.b.h0(0);
            } else {
                this.b.c0(0);
            }
            playVideo();
        } else if (this.b.v() == 2) {
            playVideo();
        } else {
            this.b.t0();
        }
    }

    public void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6621cb5d", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).Y1();
        }
    }

    public void D0(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be6cf22", new Object[]{this, new Integer(i), str});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).Z1(i, str);
        }
    }

    public final void E0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63cf8c37", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaContext mediaContext = this.f32045a;
        if (mediaContext != null && (mediaContext.getContext() instanceof Activity) && S().getParent() != null && S().getParent().getParent() != null) {
            this.s = true;
            if (this.k == null && this.l == null) {
                ViewGroup viewGroup = (ViewGroup) S().getParent();
                this.k = viewGroup;
                this.l = (ViewGroup) viewGroup.getParent();
            }
            this.k.setLayerType(2, null);
            int[] iArr = new int[2];
            this.p = iArr;
            this.l.getLocationInWindow(iArr);
            this.q = this.k.getWidth();
            this.r = this.k.getHeight();
            if (z) {
                this.n = this.k.getTranslationX();
                this.o = this.k.getTranslationY();
            }
            if (this.m == null) {
                this.m = (FrameLayout) ((Activity) this.f32045a.getContext()).getWindow().getDecorView();
            }
            if (z) {
                this.u = DWViewUtil.getVideoWidthInLandscape((Activity) this.f32045a.getContext());
                this.t = DWViewUtil.getPortraitScreenWidth();
            } else {
                this.u = DWViewUtil.getRealWithInPx(this.f32045a.getContext());
                this.t = DWViewUtil.getVideoWidthInLandscape((Activity) this.f32045a.getContext());
            }
            if (this.k.getParent() != this.m) {
                this.l.removeView(this.k);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.k.getLayoutParams();
                layoutParams.gravity = 17;
                layoutParams.width = this.q;
                layoutParams.height = this.r;
                int i = layoutParams.topMargin;
                int[] iArr2 = this.p;
                int i2 = iArr2[1];
                if (i != i2) {
                    layoutParams.topMargin = i2;
                }
                int i3 = layoutParams.leftMargin;
                int i4 = iArr2[0];
                if (i3 != i4) {
                    layoutParams.leftMargin = i4;
                }
                this.m.addView(this.k, layoutParams);
                if (this.f32045a.getVideo().getVideoState() == 4) {
                    this.b.e0(getDuration(), false);
                }
            }
            if (z) {
                int[] iArr3 = this.p;
                z0(-iArr3[0], 0 - iArr3[1]);
                return;
            }
            int i5 = this.u;
            int i6 = this.t;
            int[] iArr4 = this.p;
            t0(((i5 - i6) / 2) - iArr4[0], ((i6 - i5) / 2) - iArr4[1]);
        }
    }

    public final void F0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa349d9f", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaContext mediaContext = this.f32045a;
        if (mediaContext != null && (mediaContext.getContext() instanceof Activity) && S().getParent() != null && S().getParent().getParent() != null) {
            this.s = true;
            if (this.k == null && this.l == null) {
                ViewGroup viewGroup = (ViewGroup) S().getParent();
                this.k = viewGroup;
                this.l = (ViewGroup) viewGroup.getParent();
            }
            this.k.setLayerType(2, null);
            if (this.m == null) {
                this.m = (FrameLayout) ((Activity) this.f32045a.getContext()).getWindow().getDecorView();
            }
            if (z) {
                this.u = DWViewUtil.getVideoWidthInLandscape((Activity) this.f32045a.getContext());
                this.t = DWViewUtil.getPortraitScreenWidth();
                int[] iArr = this.p;
                x0(iArr[0], iArr[1]);
                return;
            }
            this.u = DWViewUtil.getRealWithInPx(this.f32045a.getContext());
            int videoWidthInLandscape = DWViewUtil.getVideoWidthInLandscape((Activity) this.f32045a.getContext());
            this.t = videoWidthInLandscape;
            int[] iArr2 = this.p;
            v0(((-(this.u - this.q)) / 2) + iArr2[0], ((-(videoWidthInLandscape - this.r)) / 2) + iArr2[1]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
        if (r2.mRequestLandscape == false) goto L_0x0072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
        if (r2.mRequestLandscape == false) goto L_0x00c1;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void G0() {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yfi.G0():void");
    }

    public void H0(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16429a7", new Object[]{this, onVideoClickListener});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            bVar.u0(onVideoClickListener);
        }
    }

    public boolean I(jsr jsrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89570f5a", new Object[]{this, jsrVar})).booleanValue();
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return false;
        }
        return ((com.taobao.mediaplay.player.d) bVar).C0(jsrVar);
    }

    public void I0(fsc fscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41442e2a", new Object[]{this, fscVar});
        } else {
            this.b.v0(fscVar);
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450701c0", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).E0();
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13155a5c", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).F0();
        }
    }

    public void K0(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dfca00", new Object[]{this, mediaLiveWarmupConfig});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).g2(mediaLiveWarmupConfig);
        }
    }

    public void L(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f07861", new Object[]{this, map});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).H0(map);
        }
    }

    public boolean M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b9fa1ed", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            return ((com.taobao.mediaplay.player.d) bVar).J0(z);
        }
        return false;
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.b.g();
        }
    }

    public com.taobao.mediaplay.player.b O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.mediaplay.player.b) ipChange.ipc$dispatch("893afda6", new Object[]{this});
        }
        return this.b;
    }

    public Bitmap P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            return bVar.j();
        }
        AVSDKLog.e(this.w, "getCurrentFrame with mVideoView == null");
        return null;
    }

    public Map<String, String> Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            return bVar.m();
        }
        return null;
    }

    public String R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b6f5b6e", new Object[]{this});
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            return bVar.n();
        }
        return null;
    }

    public View S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b.x();
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63f2d892", new Object[]{this})).booleanValue();
        }
        return this.b.A();
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        return this.b.isPlaying();
    }

    public void V(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d.removeCallbacks(this.g);
        MediaContext mediaContext = this.f32045a;
        if (mediaContext != null) {
            mediaContext.mMediaPlayContext.mute(z);
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).e2(z);
            if (((com.taobao.mediaplay.player.d) this.b).L1) {
                this.e = false;
            }
        }
        if (z) {
            this.e = true;
            this.b.s0(0.0f);
            this.c = z;
            return;
        }
        float f = com.taobao.mediaplay.player.b.C;
        this.f = f;
        this.c = z;
        if (this.e) {
            this.b.s0(f * 0.2f);
            if (this.b.v() == 1) {
                J0();
                return;
            }
            return;
        }
        this.b.s0(f);
    }

    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
        } else if (this.b.v() == 1 && TextUtils.isEmpty(this.f32045a.getVideoToken())) {
        } else {
            if (TextUtils.isEmpty(this.f32045a.getVideoToken()) || this.b.v() != 1) {
                this.b.W();
            }
        }
    }

    public void X(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a117dde9", new Object[]{this, context});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).g1(context);
        }
    }

    public void Y(gsc gscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27b1251f", new Object[]{this, gscVar});
        } else {
            this.b.Y(gscVar);
        }
    }

    public void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.b.f();
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // tb.jrc
    public void a(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae58360", new Object[]{this, onVideoClickListener});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            bVar.a0(onVideoClickListener);
        }
    }

    public boolean a0(jsr jsrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6285d7d", new Object[]{this, jsrVar})).booleanValue();
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar == null) {
            return false;
        }
        return ((com.taobao.mediaplay.player.d) bVar).o1(jsrVar);
    }

    @Override // tb.jrc
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d143b09a", new Object[]{this, new Boolean(z)});
        } else {
            this.b.h(z);
        }
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5ca86b8", new Object[]{this});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).u1();
        }
    }

    public void c0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c8f62a", new Object[]{this, str});
            return;
        }
        feh fehVar = this.w;
        AVSDKLog.e(fehVar, " enter seamlessDegradeForVVC , Url is " + str);
        if (TextUtils.isEmpty(str)) {
            AVSDKLog.e(this.w, " enter seamlessDegradeForVVC ,but Url is null");
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar instanceof com.taobao.mediaplay.player.d) {
            ((com.taobao.mediaplay.player.d) bVar).x1(str);
        }
    }

    @Override // tb.krc
    public boolean d(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("328efe1e", new Object[]{this, keyEvent})).booleanValue();
        }
        if (this.f32045a.screenType() != MediaPlayScreenType.LANDSCAPE_FULL_SCREEN && this.f32045a.screenType() != MediaPlayScreenType.PORTRAIT_FULL_SCREEN) {
            return false;
        }
        G0();
        return true;
    }

    public void d0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4aa802", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).y1(z);
        }
    }

    public void e0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a617f7", new Object[]{this, str});
        } else {
            this.b.f0(str);
        }
    }

    @Override // tb.jrc
    public void f(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c3a069", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            bVar.n0(i, f);
        }
    }

    public void f0(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318e63c5", new Object[]{this, new Integer(i), str});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).G1(i, str);
        }
    }

    @Override // tb.jrc
    public void g(fsc fscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f9c4a20", new Object[]{this, fscVar});
        } else {
            this.b.b0(fscVar);
        }
    }

    public void g0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a07335c", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null && (bVar instanceof com.taobao.mediaplay.player.d)) {
            ((com.taobao.mediaplay.player.d) bVar).H1(i);
        }
    }

    @Override // tb.jrc
    public int getBufferPercentage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a4a46ea", new Object[]{this})).intValue();
        }
        return this.b.r();
    }

    @Override // tb.jrc
    public int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        return this.b.getCurrentPosition();
    }

    @Override // tb.jrc
    public int getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        return this.b.k();
    }

    @Override // tb.jrc
    public float getVideoRenderPts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f9486ab", new Object[]{this})).floatValue();
        }
        return this.b.u();
    }

    @Override // tb.jrc
    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        return this.b.v();
    }

    @Override // tb.jrc
    public void h(asc ascVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17602ef", new Object[]{this, ascVar});
        } else {
            this.b.X(ascVar);
        }
    }

    public void h0(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).J1(nj9Var);
        }
    }

    @Override // tb.jrc
    public void i(MediaAspectRatio mediaAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e63654", new Object[]{this, mediaAspectRatio});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            bVar.g0(mediaAspectRatio);
        }
    }

    public void i0(isc iscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6509b308", new Object[]{this, iscVar});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).K1(iscVar);
        }
    }

    @Override // tb.jrc
    public void j(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5ff41b", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            bVar.o0(i, j);
        }
    }

    public void j0(isc iscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ad0854", new Object[]{this, iscVar});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).L1(iscVar);
        }
    }

    @Override // tb.jrc
    public void k(vrc vrcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56aa86f5", new Object[]{this, vrcVar});
        } else {
            this.b.Z(vrcVar);
        }
    }

    public void k0(InnerStartFuncListener innerStartFuncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805c05a7", new Object[]{this, innerStartFuncListener});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).M1(innerStartFuncListener);
        }
    }

    @Override // tb.jrc
    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70e7d25", new Object[]{this, new Boolean(z)});
        } else {
            this.b.e(z);
        }
    }

    public void l0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d128a9", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).N1(z);
        }
    }

    public void m0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1608c02e", new Object[]{this, str});
        } else {
            this.b.j0(str);
        }
    }

    public void n0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b423788", new Object[]{this, str});
        } else {
            this.b.k0(str);
        }
    }

    public void o0(boolean z, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b6875c", new Object[]{this, new Boolean(z), new Integer(i), new Boolean(z2)});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).Q1(z, i, z2);
        }
    }

    @Override // tb.asc
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        }
    }

    @Override // tb.asc
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
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
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        } else if (3 == j) {
            AVSDKLog.d(RPCDataItems.SWITCH_TAG_LOG, " sdadsa MEDIA_INFO_VIDEO_RENDERING_START START ");
        }
    }

    @Override // tb.asc
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
        } else {
            J0();
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
        } else {
            J0();
        }
    }

    public void p0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53919393", new Object[]{this, str});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.mediaplay.player.d) bVar).R1(str);
        }
    }

    @Override // tb.jrc
    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
        } else {
            this.b.U(false);
        }
    }

    @Override // tb.jrc
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else {
            this.b.V();
        }
    }

    public void q0(TaoLiveVideoView.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b06e5b", new Object[]{this, pVar});
            return;
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar != null) {
            bVar.q0(pVar);
        }
    }

    public void s0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
            return;
        }
        this.d.removeCallbacks(this.g);
        this.f = f;
        if (!this.e || f == 0.0f) {
            this.b.s0(f);
        } else {
            this.b.s0(f * 0.2f);
        }
    }

    @Override // tb.jrc
    public void setPlayRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f)});
        } else {
            this.b.m0(f);
        }
    }

    public final void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d7a41a", new Object[]{this});
        } else {
            this.d.post(new d());
        }
    }

    public final void w0() {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02129da", new Object[]{this});
            return;
        }
        MediaContext mediaContext = this.f32045a;
        if (mediaContext != null && (mediaContext.getContext() instanceof Activity)) {
            if (this.f32045a.getWindow() == null) {
                window = ((Activity) this.f32045a.getContext()).getWindow();
            } else {
                window = this.f32045a.getWindow();
            }
            DWViewUtil.setNavigationBar(window, this.v);
            this.d.post(new fgi(this));
            MediaContext mediaContext2 = this.f32045a;
            if (mediaContext2 != null && !mediaContext2.mHookKeyBackToggleEvent) {
                mediaContext2.unregisterKeyBackEventListener(this);
            }
        }
    }

    public final void y0() {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5810834", new Object[]{this});
            return;
        }
        MediaContext mediaContext = this.f32045a;
        if (mediaContext != null && (mediaContext.getContext() instanceof Activity)) {
            if (this.f32045a.getWindow() == null) {
                window = ((Activity) this.f32045a.getContext()).getWindow();
            } else {
                window = this.f32045a.getWindow();
            }
            DWViewUtil.setNavigationBar(window, this.v);
            this.d.post(new cgi(this));
            MediaContext mediaContext2 = this.f32045a;
            if (mediaContext2 != null && !mediaContext2.mHookKeyBackToggleEvent) {
                mediaContext2.unregisterKeyBackEventListener(this);
            }
        }
    }

    public final void J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f339782", new Object[]{this});
        } else if (this.c || this.f == 0.0f) {
            feh fehVar = this.w;
            AVSDKLog.e(fehVar, "volumeFadeIn try to setVolume, mMute=" + this.c + ", mVolume=" + this.f);
        } else if (this.e) {
            this.e = false;
            this.h = 0;
            if (this.g == null) {
                this.g = new zfi(this);
            }
            this.d.postDelayed(this.g, 500L);
        }
    }

    @Override // tb.jrc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a420d40", new Object[]{this});
        } else if ((this.b.v() != 1 || !TextUtils.isEmpty(this.f32045a.getVideoToken())) && (TextUtils.isEmpty(this.f32045a.getVideoToken()) || this.b.v() != 1)) {
            if (this.b.v() == 3 && this.f32045a.mEnableNewTBPlayer) {
                com.taobao.mediaplay.player.b bVar = this.b;
                if (bVar instanceof com.taobao.mediaplay.player.d) {
                    ((com.taobao.mediaplay.player.d) bVar).b1();
                }
            }
            B0();
        } else {
            feh fehVar = this.w;
            AVSDKLog.e(fehVar, "start index=null because return by mVideoView.getVideoState()=" + this.b.v());
            com.taobao.mediaplay.player.b bVar2 = this.b;
            if (bVar2 instanceof com.taobao.mediaplay.player.d) {
                ((com.taobao.mediaplay.player.d) bVar2).s1();
            }
        }
    }

    @Override // tb.rrc
    public void e(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f709d9", new Object[]{this, new Integer(i), str, new Integer(i2)});
            return;
        }
        if (!(i == 0 || !MediaSystemUtils.isApkDebuggable() || this.f32045a.getContext() == null)) {
            Toast.makeText(this.f32045a.getContext(), "【警告】该播放场景鉴权失败，预发环境下已禁止播放。请联系iOS:@牛仔/Android:@生艰", 1).show();
        }
        com.taobao.mediaplay.player.b bVar = this.b;
        if (bVar instanceof com.taobao.mediaplay.player.d) {
            ((com.taobao.mediaplay.player.d) bVar).F1(i, str, i2);
        }
    }

    public void r0(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0c1645", new Object[]{this, str});
            return;
        }
        feh fehVar = this.w;
        AVSDKLog.e(fehVar, " enter setVideoSource , Url is " + str);
        if (TextUtils.isEmpty(str)) {
            AVSDKLog.e(this.w, "setVideoSource## sorry  VideoSource is Empty  ");
        } else if (this.f32045a.mMediaPlayContext.mLocalVideo) {
            this.b.r0(str);
        } else {
            if (str.startsWith(itw.URL_SEPARATOR)) {
                str = "http:".concat(str);
            }
            if (MediaSystemUtils.isApkDebuggable()) {
                AVSDKLog.e(this.w, " start queryVideoAuthData");
                if (TextUtils.isEmpty(this.f32045a.mUsingInterface) || !this.f32045a.mUsingInterface.contains("TBPlayer")) {
                    z = false;
                }
                MediaContext mediaContext = this.f32045a;
                new MediaInfoAuthRegister(mediaContext.mMediaPlayContext, mediaContext.mScenarioType, z).d(str, this);
            }
            this.b.l0(this.f32045a.getUTParams());
            this.b.r0(str);
        }
    }

    public final void v0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf0d1a3", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.k, "translationX", i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.k, "translationY", i2);
        this.k.setTranslationY(this.o);
        this.k.setTranslationX(this.n);
        this.j = new AnimatorSet();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.k, Key.ROTATION, 0.0f);
        ofFloat3.addUpdateListener(new dgi(this));
        this.j.setDuration(150L);
        this.j.play(ofFloat3);
        this.j.play(ofFloat);
        this.j.play(ofFloat2);
        this.j.start();
        this.j.addListener(new egi(this));
    }

    public final void t0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a90be3", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        MediaContext mediaContext = this.f32045a;
        if (mediaContext != null && (mediaContext.getContext() instanceof Activity)) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.k, "translationX", i);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.k, "translationY", i2);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.k, Key.ROTATION, 0.0f, 90.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            this.i = animatorSet;
            animatorSet.setDuration(150);
            this.i.play(ofFloat3);
            this.i.play(ofFloat);
            this.i.play(ofFloat2);
            this.d.post(new a());
            ofFloat3.addUpdateListener(new b());
            this.i.addListener(new c());
        }
    }

    public final void x0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba1b5fd", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.k, "translationX", 0.0f, i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.k, "translationY", 0.0f, i2);
        this.k.setTranslationY(this.o);
        this.k.setTranslationX(this.n);
        this.j = new AnimatorSet();
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(90.0f, 0.0f);
        ofFloat3.addUpdateListener(new agi(this));
        this.j.setDuration(150L);
        this.j.play(ofFloat3);
        this.j.play(ofFloat);
        this.j.play(ofFloat2);
        this.j.start();
        this.j.addListener(new bgi(this));
    }

    public final void z0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b9fbbf", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        MediaContext mediaContext = this.f32045a;
        if (mediaContext != null && (mediaContext.getContext() instanceof Activity)) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.k, "translationX", i);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.k, "translationY", i2);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 90.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            this.i = animatorSet;
            long j = 150;
            animatorSet.setDuration(j);
            this.i.play(ofFloat3);
            this.i.play(ofFloat);
            this.i.play(ofFloat2);
            this.d.post(new ggi(this));
            ofFloat3.setDuration(j);
            ofFloat3.addUpdateListener(new hgi(this));
            ofFloat3.addListener(new igi(this));
        }
    }
}
