package com.taobao.avplayer;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.motion.widget.Key;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.common.DWScreenOrientationListenerImp;
import com.taobao.avplayer.f;
import com.taobao.media.DWViewUtil;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import java.net.URI;
import java.util.Map;
import tb.aub;
import tb.b75;
import tb.c32;
import tb.d75;
import tb.dub;
import tb.ea5;
import tb.fa5;
import tb.feh;
import tb.ga5;
import tb.gsc;
import tb.ha5;
import tb.ia5;
import tb.itw;
import tb.ja5;
import tb.ka5;
import tb.krc;
import tb.la5;
import tb.ma5;
import tb.na5;
import tb.nj9;
import tb.oa5;
import tb.pa5;
import tb.psb;
import tb.qa5;
import tb.ra5;
import tb.sa5;
import tb.t2o;
import tb.ta5;
import tb.ua5;
import tb.uyv;
import tb.va5;
import tb.wtb;
import tb.ytb;
import tb.z5r;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWVideoViewController implements wtb, krc, ytb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DWVideoScreenType2 A;
    public final DWScreenOrientationListenerImp B;
    public final feh C;
    public boolean D;
    public boolean E;
    public DWScreenOrientationListenerImp.Orientation F;
    public c G;

    /* renamed from: a  reason: collision with root package name */
    public final DWContext f10107a;
    public final c32 b;
    public int c;
    public FrameLayout d;
    public boolean e;
    public b f;
    public int g;
    public int h;
    public AnimatorSet i;
    public AnimatorSet j;
    public int l;
    public ViewGroup n;
    public ViewGroup o;
    public boolean p;
    public float q;
    public float r;
    public volatile boolean s;
    public float w;
    public Runnable x;
    public DWVideoScreenType2 z;
    public int[] k = new int[2];
    public boolean t = true;
    public boolean u = true;
    public boolean v = true;
    public int y = 0;
    public final Handler m = new Handler();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum FullOritation {
        LANDSCAPE_FULL90_TO_PORTRAIT_FULL("landscape90_portrait"),
        LANDSCAPE_FULL270_TO_PORTRAIT_FULL("landscape270_portrait"),
        LANDSCAPE_FULL90_TO_LANDSCAPE_FULL270("landscape90_landscape270"),
        LANDSCAPE_FULL270_TO_LANDSCAPE_FULL90("landscape270_landscape90"),
        PORTRAIT_FULL_TO_LANDSCAPE_FULL270("portrait_landscape270"),
        PORTRAIT_FULL_TO_LANDSCAPE_FULL90("portrait_landscape90");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String value;

        FullOritation(String str) {
            this.value = str;
        }

        public static /* synthetic */ Object ipc$super(FullOritation fullOritation, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/DWVideoViewController$FullOritation");
        }

        public static FullOritation valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FullOritation) ipChange.ipc$dispatch("648f7253", new Object[]{str});
            }
            return (FullOritation) Enum.valueOf(FullOritation.class, str);
        }

        public String getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
            }
            return this.value;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements DWScreenOrientationListenerImp.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0132  */
        @Override // com.taobao.avplayer.common.DWScreenOrientationListenerImp.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.taobao.avplayer.common.DWScreenOrientationListenerImp.Orientation r7) {
            /*
                Method dump skipped, instructions count: 508
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.DWVideoViewController.a.a(com.taobao.avplayer.common.DWScreenOrientationListenerImp$Orientation):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
    }

    static {
        t2o.a(452984968);
        t2o.a(452985007);
        t2o.a(774897757);
        t2o.a(452985011);
    }

    public DWVideoViewController(DWContext dWContext, boolean z) {
        DWVideoScreenType2 dWVideoScreenType2 = DWVideoScreenType2.NORMAL;
        this.z = dWVideoScreenType2;
        this.A = dWVideoScreenType2;
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_DWVideoViewController);
        this.f10107a = dWContext;
        this.C = new feh(toString(), dWContext.getPlayToken());
        if (dWContext.needAD() || TextUtils.isEmpty(dWContext.getVideoToken())) {
            this.b = new com.taobao.avplayer.player.a(dWContext, true);
        } else {
            this.b = new com.taobao.avplayer.player.a(dWContext, true, dWContext.getVideoToken());
        }
        this.b.k0(z);
        this.b.a0(this);
        if (!dWContext.isActivityToggleForLandscape()) {
            try {
                DWScreenOrientationListenerImp dWScreenOrientationListenerImp = new DWScreenOrientationListenerImp(dWContext.getActivity());
                this.B = dWScreenOrientationListenerImp;
                dWScreenOrientationListenerImp.a(new a());
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void A(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3dca56f", new Object[]{dWVideoViewController});
        } else {
            dWVideoViewController.F0();
        }
    }

    public static /* synthetic */ c32 B(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c32) ipChange.ipc$dispatch("b9d9bd79", new Object[]{dWVideoViewController});
        }
        return dWVideoViewController.b;
    }

    public static /* synthetic */ boolean C(DWVideoViewController dWVideoViewController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74c07de1", new Object[]{dWVideoViewController, new Boolean(z)})).booleanValue();
        }
        dWVideoViewController.s = z;
        return z;
    }

    public static /* synthetic */ void D(DWVideoViewController dWVideoViewController, FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c0feb2", new Object[]{dWVideoViewController, fullOritation});
        } else {
            dWVideoViewController.k0(fullOritation);
        }
    }

    public static /* synthetic */ void E(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc43857", new Object[]{dWVideoViewController});
        } else {
            dWVideoViewController.j0();
        }
    }

    public static /* synthetic */ void F(DWVideoViewController dWVideoViewController, FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca16cc34", new Object[]{dWVideoViewController, fullOritation});
        } else {
            dWVideoViewController.o0(fullOritation);
        }
    }

    public static /* synthetic */ int[] G(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("83d90eef", new Object[]{dWVideoViewController});
        }
        return dWVideoViewController.k;
    }

    public static /* synthetic */ void H(DWVideoViewController dWVideoViewController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c764dea0", new Object[]{dWVideoViewController, new Boolean(z)});
        } else {
            dWVideoViewController.z0(z);
        }
    }

    public static /* synthetic */ ViewGroup I(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("82290be2", new Object[]{dWVideoViewController});
        }
        return dWVideoViewController.o;
    }

    public static /* synthetic */ FrameLayout J(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("29e2caa7", new Object[]{dWVideoViewController});
        }
        return dWVideoViewController.d;
    }

    public static /* synthetic */ void K(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25be1d11", new Object[]{dWVideoViewController});
        } else {
            dWVideoViewController.D0();
        }
    }

    public static /* synthetic */ float L(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1767c320", new Object[]{dWVideoViewController})).floatValue();
        }
        return dWVideoViewController.q;
    }

    public static /* synthetic */ Runnable M(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("d49701d0", new Object[]{dWVideoViewController});
        }
        return dWVideoViewController.x;
    }

    public static /* synthetic */ float N(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbfc09ca", new Object[]{dWVideoViewController})).floatValue();
        }
        return dWVideoViewController.r;
    }

    public static /* synthetic */ void O(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda5aff9", new Object[]{dWVideoViewController});
        } else {
            dWVideoViewController.B0();
        }
    }

    public static /* synthetic */ Handler P(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e0599a83", new Object[]{dWVideoViewController});
        }
        return dWVideoViewController.m;
    }

    public static /* synthetic */ DWContext Q(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWContext) ipChange.ipc$dispatch("96d4c0dd", new Object[]{dWVideoViewController});
        }
        return dWVideoViewController.f10107a;
    }

    public static /* synthetic */ DWVideoScreenType2 R(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoScreenType2) ipChange.ipc$dispatch("4692565a", new Object[]{dWVideoViewController});
        }
        return dWVideoViewController.A;
    }

    public static /* synthetic */ DWVideoScreenType2 S(DWVideoViewController dWVideoViewController, DWVideoScreenType2 dWVideoScreenType2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoScreenType2) ipChange.ipc$dispatch("6f63077", new Object[]{dWVideoViewController, dWVideoScreenType2});
        }
        dWVideoViewController.A = dWVideoScreenType2;
        return dWVideoScreenType2;
    }

    public static /* synthetic */ DWVideoScreenType2 T(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoScreenType2) ipChange.ipc$dispatch("2f9a1b5b", new Object[]{dWVideoViewController});
        }
        return dWVideoViewController.z;
    }

    public static /* synthetic */ DWVideoScreenType2 U(DWVideoViewController dWVideoViewController, DWVideoScreenType2 dWVideoScreenType2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoScreenType2) ipChange.ipc$dispatch("eab52078", new Object[]{dWVideoViewController, dWVideoScreenType2});
        }
        dWVideoViewController.z = dWVideoScreenType2;
        return dWVideoScreenType2;
    }

    public static /* synthetic */ void V(DWVideoViewController dWVideoViewController, FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ae12eb", new Object[]{dWVideoViewController, fullOritation});
        } else {
            dWVideoViewController.i0(fullOritation);
        }
    }

    public static /* synthetic */ void W(DWVideoViewController dWVideoViewController, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce42cfe", new Object[]{dWVideoViewController, new Boolean(z), new Boolean(z2)});
        } else {
            dWVideoViewController.H0(z, z2);
        }
    }

    public static /* synthetic */ int e(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b8582da", new Object[]{dWVideoViewController})).intValue();
        }
        return dWVideoViewController.y;
    }

    public static /* synthetic */ int p(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69da91d2", new Object[]{dWVideoViewController})).intValue();
        }
        int i = dWVideoViewController.y;
        dWVideoViewController.y = 1 + i;
        return i;
    }

    public static /* synthetic */ float q(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d2f28f6", new Object[]{dWVideoViewController})).floatValue();
        }
        return dWVideoViewController.w;
    }

    public static /* synthetic */ int r(DWVideoViewController dWVideoViewController, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46e7a3a0", new Object[]{dWVideoViewController, new Integer(i)})).intValue();
        }
        dWVideoViewController.c = i;
        return i;
    }

    public static /* synthetic */ void s(DWVideoViewController dWVideoViewController, FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848f0d53", new Object[]{dWVideoViewController, fullOritation});
        } else {
            dWVideoViewController.l0(fullOritation);
        }
    }

    public static /* synthetic */ void t(DWVideoViewController dWVideoViewController, FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b9f414", new Object[]{dWVideoViewController, fullOritation});
        } else {
            dWVideoViewController.n0(fullOritation);
        }
    }

    public static /* synthetic */ AnimatorSet u(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("18558776", new Object[]{dWVideoViewController});
        }
        return dWVideoViewController.i;
    }

    public static /* synthetic */ ViewGroup v(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d9a044c1", new Object[]{dWVideoViewController});
        }
        return dWVideoViewController.n;
    }

    public static /* synthetic */ int w(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d360ce6", new Object[]{dWVideoViewController})).intValue();
        }
        return dWVideoViewController.g;
    }

    public static /* synthetic */ int x(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fedfb305", new Object[]{dWVideoViewController})).intValue();
        }
        return dWVideoViewController.h;
    }

    public static /* synthetic */ boolean y(DWVideoViewController dWVideoViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e232ff54", new Object[]{dWVideoViewController})).booleanValue();
        }
        return dWVideoViewController.p;
    }

    public static /* synthetic */ boolean z(DWVideoViewController dWVideoViewController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6340d18a", new Object[]{dWVideoViewController, new Boolean(z)})).booleanValue();
        }
        dWVideoViewController.p = z;
        return z;
    }

    public final void B0() {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02129da", new Object[]{this});
            return;
        }
        if (this.f10107a.getWindow() == null) {
            window = this.f10107a.getActivity().getWindow();
        } else {
            window = this.f10107a.getWindow();
        }
        DWViewUtil.setNavigationBar(window, this.c);
        this.m.post(new ra5(this));
        DWContext dWContext = this.f10107a;
        if (dWContext != null && !dWContext.mHookKeyBackToggleEvent) {
            dWContext.unregisterKeyBackEventListener(this);
        }
    }

    public final void D0() {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5810834", new Object[]{this});
            return;
        }
        if (this.f10107a.getWindow() == null) {
            window = this.f10107a.getActivity().getWindow();
        } else {
            window = this.f10107a.getWindow();
        }
        DWViewUtil.setNavigationBar(window, this.c);
        this.m.post(new oa5(this));
        DWContext dWContext = this.f10107a;
        if (dWContext != null && !dWContext.mHookKeyBackToggleEvent) {
            dWContext.unregisterKeyBackEventListener(this);
        }
    }

    public final void F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d42ff6", new Object[]{this});
        } else {
            this.m.post(new va5(this));
        }
    }

    public void G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e800daa4", new Object[]{this});
        } else if (this.b.s() == 5 || this.b.s() == 8 || !TextUtils.isEmpty(this.f10107a.getVideoToken())) {
            this.b.r0();
        } else if (this.b.s() == 4 || (this.b.C() && this.b.k() == 4)) {
            if (this.b.C()) {
                this.b.j0(0);
            } else {
                this.b.f0(0);
            }
            playVideo();
        } else {
            this.b.r0();
        }
    }

    public final void H0(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1622ad7d", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!this.f10107a.isActivityToggleForLandscape() || z) {
            this.p = false;
            if (e0().getParent() != null && e0().getParent().getParent() != null) {
                this.s = true;
                if (this.n == null && this.o == null) {
                    ViewGroup viewGroup = (ViewGroup) e0().getParent();
                    this.n = viewGroup;
                    this.o = (ViewGroup) viewGroup.getParent();
                }
                this.n.setLayerType(2, null);
                int[] iArr = new int[2];
                this.k = iArr;
                this.o.getLocationInWindow(iArr);
                if (z) {
                    this.q = this.n.getTranslationX();
                    this.r = this.n.getTranslationY();
                }
                if (this.f10107a.getWindow() != null) {
                    this.d = (FrameLayout) this.f10107a.getWindow().getDecorView();
                } else {
                    this.d = (FrameLayout) this.f10107a.getActivity().getWindow().getDecorView();
                }
                if (z) {
                    this.h = DWViewUtil.getVideoWidthInLandscape(this.f10107a.getActivity());
                    this.g = DWViewUtil.getPortraitScreenWidth();
                } else {
                    this.h = DWViewUtil.getRealWithInPx(this.f10107a.getActivity());
                    this.g = DWViewUtil.getVideoWidthInLandscape(this.f10107a.getActivity());
                }
                ViewParent parent = this.n.getParent();
                ViewGroup viewGroup2 = this.o;
                if (parent == viewGroup2) {
                    viewGroup2.removeView(this.n);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.n.getLayoutParams();
                    layoutParams.gravity = 0;
                    DWContext dWContext = this.f10107a;
                    layoutParams.width = dWContext.mWidth;
                    layoutParams.height = dWContext.mHeight;
                    int i = layoutParams.topMargin;
                    int[] iArr2 = this.k;
                    int i2 = iArr2[1];
                    if (i != i2) {
                        layoutParams.topMargin = i2;
                    }
                    int i3 = layoutParams.leftMargin;
                    int i4 = iArr2[0];
                    if (i3 != i4) {
                        layoutParams.leftMargin = i4;
                    }
                    this.d.addView(this.n, layoutParams);
                    if (this.f10107a.getVideo().getVideoState() == 4) {
                        this.b.h0(getDuration(), false);
                    }
                }
                if (z) {
                    int[] iArr3 = this.k;
                    E0(-iArr3[0], 0 - iArr3[1]);
                    return;
                }
                int i5 = this.h;
                int i6 = this.g;
                int[] iArr4 = this.k;
                y0(((i5 - i6) / 2) - iArr4[0], ((i6 - i5) / 2) - iArr4[1], z2);
            }
        } else {
            this.s = true;
            if (this.f10107a.getActivity().getRequestedOrientation() != 0 && this.f10107a.getActivity().getRequestedOrientation() != 8) {
                I0(z2);
            }
        }
    }

    public final void I0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("530caa64", new Object[]{this, new Boolean(z)});
        } else if (e0().getParent() != null && e0().getParent().getParent() != null) {
            this.s = true;
            if (this.n == null && this.o == null) {
                ViewGroup viewGroup = (ViewGroup) e0().getParent();
                this.n = viewGroup;
                this.o = (ViewGroup) viewGroup.getParent();
            }
            if (this.f10107a.getWindow() != null) {
                this.d = (FrameLayout) this.f10107a.getWindow().getDecorView();
            } else {
                this.d = (FrameLayout) this.f10107a.getActivity().getWindow().getDecorView();
            }
            if (z) {
                this.f10107a.getActivity().setRequestedOrientation(0);
            } else {
                this.f10107a.getActivity().setRequestedOrientation(8);
            }
            this.m.postDelayed(new la5(this, z), 20L);
        }
    }

    public final void J0() {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49257570", new Object[]{this});
        } else if (e0().getParent() != null && e0().getParent().getParent() != null) {
            this.s = true;
            if (this.n == null && this.o == null) {
                ViewGroup viewGroup = (ViewGroup) e0().getParent();
                this.n = viewGroup;
                this.o = (ViewGroup) viewGroup.getParent();
            }
            if (this.f10107a.getWindow() != null) {
                this.d = (FrameLayout) this.f10107a.getWindow().getDecorView();
            } else {
                this.d = (FrameLayout) this.f10107a.getActivity().getWindow().getDecorView();
            }
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = this.f10107a.getActivity().getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 0;
                this.f10107a.getActivity().getWindow().setAttributes(attributes);
            }
            this.n.setLayerType(2, null);
            this.f10107a.getActivity().setRequestedOrientation(1);
            if (this.f10107a.getWindow() == null) {
                window = this.f10107a.getActivity().getWindow();
            } else {
                window = this.f10107a.getWindow();
            }
            DWViewUtil.setNavigationBar(window, this.c);
            this.m.postDelayed(new ka5(this), 20L);
        }
    }

    public final void K0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa349d9f", new Object[]{this, new Boolean(z)});
        } else if (e0().getParent() != null && e0().getParent().getParent() != null) {
            this.s = true;
            if (this.n == null && this.o == null) {
                ViewGroup viewGroup = (ViewGroup) e0().getParent();
                this.n = viewGroup;
                this.o = (ViewGroup) viewGroup.getParent();
            }
            int i = this.l;
            if (i != 0) {
                this.k[1] = i;
                this.l = 0;
            }
            ViewGroup viewGroup2 = this.n;
            if (viewGroup2 != null) {
                viewGroup2.setLayerType(2, null);
            }
            if (this.f10107a.getWindow() != null) {
                this.d = (FrameLayout) this.f10107a.getWindow().getDecorView();
            } else {
                this.d = (FrameLayout) this.f10107a.getActivity().getWindow().getDecorView();
            }
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = this.f10107a.getActivity().getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 0;
                this.f10107a.getActivity().getWindow().setAttributes(attributes);
            }
            if (z) {
                this.h = DWViewUtil.getVideoWidthInLandscape(this.f10107a.getActivity());
                this.g = DWViewUtil.getPortraitScreenWidth();
                int[] iArr = this.k;
                C0(iArr[0], iArr[1]);
                return;
            }
            this.h = DWViewUtil.getRealWithInPx(this.f10107a.getActivity());
            int videoWidthInLandscape = DWViewUtil.getVideoWidthInLandscape(this.f10107a.getActivity());
            this.g = videoWidthInLandscape;
            int i2 = this.h;
            DWContext dWContext = this.f10107a;
            int[] iArr2 = this.k;
            A0(((-(i2 - dWContext.mWidth)) / 2) + iArr2[0], ((-(videoWidthInLandscape - dWContext.mHeight)) / 2) + iArr2[1]);
        }
    }

    public boolean L0() {
        AnimatorSet animatorSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e25ada62", new Object[]{this})).booleanValue();
        }
        AnimatorSet animatorSet2 = this.i;
        if ((animatorSet2 == null || !animatorSet2.isRunning()) && (((animatorSet = this.j) == null || !animatorSet.isRunning()) && !this.s)) {
            return true;
        }
        return false;
    }

    public void M0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5499d60", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            c32Var.s0(i, i2);
        }
    }

    public final void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f339782", new Object[]{this});
            return;
        }
        feh fehVar = this.C;
        AVSDKLog.e(fehVar, "dw volumeFadeIn try to setVolume, mMute=" + this.e + ",mVolume=" + this.w + ",!mOpenVolumeFadeIn=" + (true ^ this.v));
        if (!this.e && this.w != 0.0f && this.v && this.u) {
            this.u = false;
            this.y = 0;
            if (this.x == null) {
                this.x = new ha5(this);
            }
            this.m.postDelayed(this.x, 500L);
        }
    }

    public String X(String str) throws Exception {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dcb4580c", new Object[]{this, str});
        }
        if (!"TBVideo".equals(this.f10107a.getVideoSource())) {
            return str;
        }
        URI uri = new URI(str);
        StringBuilder sb = new StringBuilder(50);
        sb.append("SOS=Android");
        DWContext dWContext = this.f10107a;
        String n = z5r.n(dWContext.mNetworkUtilsAdapter, dWContext.getActivity());
        if (!TextUtils.isEmpty(n)) {
            sb.append("&SNet=");
            sb.append(n);
        }
        if (!TextUtils.isEmpty(this.f10107a.mFrom)) {
            sb.append("&SBizCode=");
            sb.append(this.f10107a.mFrom);
        }
        DWContext dWContext2 = this.f10107a;
        String a2 = ((d75) dWContext2.mConfigParamsAdapter).a(dWContext2.getActivity());
        if (this.f10107a.mConfigParamsAdapter != null && !TextUtils.isEmpty(a2)) {
            sb.append("&SRid=");
            sb.append(System.currentTimeMillis());
            sb.append(a2);
        }
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null) {
            str2 = sb.toString();
        } else {
            str2 = rawQuery + "&" + ((Object) sb);
        }
        return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment()).toString();
    }

    public void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a27cd7", new Object[]{this});
        } else {
            this.b.e();
        }
    }

    public void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            frameLayout.removeView(this.n);
        }
        try {
            DWScreenOrientationListenerImp dWScreenOrientationListenerImp = this.B;
            if (dWScreenOrientationListenerImp != null) {
                dWScreenOrientationListenerImp.disable();
            }
        } catch (Throwable unused) {
        }
        this.b.g();
        AnimatorSet animatorSet = this.j;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.j.cancel();
        }
        AnimatorSet animatorSet2 = this.i;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            this.i.cancel();
        }
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // tb.wtb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
        } else {
            this.b.f();
        }
    }

    public void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5097f36f", new Object[]{this});
            return;
        }
        DWScreenOrientationListenerImp dWScreenOrientationListenerImp = this.B;
        if (dWScreenOrientationListenerImp != null) {
            dWScreenOrientationListenerImp.disable();
        }
    }

    @Override // tb.wtb
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f691388", new Object[]{this, new Integer(i)});
        } else {
            this.b.w(i);
        }
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c6308a", new Object[]{this});
            return;
        }
        DWScreenOrientationListenerImp dWScreenOrientationListenerImp = this.B;
        if (dWScreenOrientationListenerImp != null) {
            dWScreenOrientationListenerImp.enable();
        }
    }

    @Override // tb.wtb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a420d40", new Object[]{this});
        } else if ((this.b.s() != 1 && this.b.s() != 2) || !TextUtils.isEmpty(this.f10107a.getVideoToken())) {
            if (TextUtils.isEmpty(this.f10107a.getVideoToken()) || this.b.s() != 1) {
                ((f.i) this.f).a();
            }
        }
    }

    public c32 c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c32) ipChange.ipc$dispatch("b7fa48be", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.krc
    public boolean d(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("328efe1e", new Object[]{this, keyEvent})).booleanValue();
        }
        if (this.f10107a.screenType() != DWVideoScreenType.LANDSCAPE_FULL_SCREEN && this.f10107a.screenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
            return false;
        }
        n();
        return true;
    }

    public Map<String, String> d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            return c32Var.j();
        }
        return null;
    }

    public View e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b.u();
    }

    @Override // tb.wtb
    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba74df4a", new Object[]{this, new Boolean(z)});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null && (c32Var instanceof com.taobao.avplayer.player.a)) {
            ((com.taobao.avplayer.player.a) c32Var).W0(z);
        }
    }

    public boolean f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0f104dd", new Object[]{this})).booleanValue();
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            return c32Var.x();
        }
        return false;
    }

    @Override // tb.wtb
    public void g(aub aubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68f6586", new Object[]{this, aubVar});
        } else {
            this.b.b0(aubVar);
        }
    }

    public boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3f7704", new Object[]{this})).booleanValue();
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            return c32Var.y();
        }
        return false;
    }

    @Override // tb.wtb
    public int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        return this.b.getCurrentPosition();
    }

    @Override // tb.wtb
    public int getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        return this.b.i();
    }

    @Override // tb.wtb
    public int getVideoHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        return this.b.q();
    }

    @Override // tb.wtb
    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        return this.b.s();
    }

    @Override // tb.wtb
    public int getVideoWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        return this.b.t();
    }

    @Override // tb.wtb
    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fea6ec89", new Object[]{this})).intValue();
        }
        return this.b.n();
    }

    public boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0e63790", new Object[]{this})).booleanValue();
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            return c32Var.D();
        }
        return false;
    }

    @Override // tb.wtb
    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d912e60", new Object[]{this})).intValue();
        }
        if (this.b.C()) {
            return this.b.k();
        }
        return this.b.s();
    }

    @Override // tb.wtb
    public void j(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a5bb934", new Object[]{this, new Float(f)});
        } else {
            this.b.o0(f);
        }
    }

    public final void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d6a773", new Object[]{this});
        } else {
            this.m.post(new ea5(this));
        }
    }

    @Override // tb.wtb
    public void k(dub dubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97f5814", new Object[]{this, dubVar});
        } else {
            this.b.c0(dubVar);
        }
    }

    public final void k0(FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d8fd47c", new Object[]{this, fullOritation});
        } else {
            this.m.post(new p(this, fullOritation));
        }
    }

    @Override // tb.wtb
    public void l(ytb ytbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b71d026", new Object[]{this, ytbVar});
        } else {
            this.b.a0(ytbVar);
        }
    }

    @Override // tb.wtb
    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("906945f8", new Object[]{this})).intValue();
        }
        return this.b.m();
    }

    public void m0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.m.removeCallbacks(this.x);
        c32 c32Var = this.b;
        if (c32Var != null && (c32Var instanceof com.taobao.avplayer.player.a)) {
            ((com.taobao.avplayer.player.a) c32Var).A1(z);
        }
        if (z) {
            this.u = true;
            this.b.q0(0.0f);
            this.e = z;
            return;
        }
        float f = c32.z;
        this.w = f;
        this.e = z;
        if (!this.u || !this.v) {
            this.b.q0(f);
            return;
        }
        this.b.q0(f * 0.2f);
        if (this.b.s() == 1) {
            N0();
        }
    }

    @Override // tb.wtb
    public void n() {
        boolean z;
        boolean z2;
        Window window;
        boolean z3;
        Window window2;
        boolean z4;
        Window window3;
        boolean z5 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3aad67", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.i;
        if (animatorSet == null || !animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.j;
            if ((animatorSet2 != null && animatorSet2.isRunning()) || this.s) {
                return;
            }
            if (!this.f10107a.isActivityToggleForLandscape()) {
                if (this.f10107a.screenType() == DWVideoScreenType.NORMAL) {
                    if ((this.b.h() > 1.01d || this.b.h() == 0.0f) && (this.f10107a.getInitScreenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN || !this.t)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if ((this.F == DWScreenOrientationListenerImp.Orientation.PORTRAIT && !z4) || this.f10107a.getInitScreenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || this.f10107a.getInitScreenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                        z5 = true;
                    }
                    this.D = z5;
                    H0(z4, true);
                    if (this.f10107a.getWindow() == null) {
                        window3 = this.f10107a.getActivity().getWindow();
                    } else {
                        window3 = this.f10107a.getWindow();
                    }
                    this.c = DWViewUtil.hideNavigationBar(window3);
                    return;
                }
                if (((this.b.h() > 1.01d || this.b.h() == 0.0f) && (this.f10107a.getInitScreenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN || !this.t)) || this.f10107a.screenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (this.F != DWScreenOrientationListenerImp.Orientation.PORTRAIT) {
                    z5 = true;
                }
                this.E = z5;
                K0(z3);
                if (this.f10107a.getWindow() == null) {
                    window2 = this.f10107a.getActivity().getWindow();
                } else {
                    window2 = this.f10107a.getWindow();
                }
                DWViewUtil.setNavigationBar(window2, this.c);
            } else if (this.f10107a.screenType() == DWVideoScreenType.NORMAL) {
                if ((this.b.h() > 1.01d || this.b.h() == 0.0f) && (this.f10107a.getInitScreenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN || !this.t)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if ((this.F == DWScreenOrientationListenerImp.Orientation.PORTRAIT && !z2) || this.f10107a.getInitScreenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || this.f10107a.getInitScreenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                    z5 = true;
                }
                this.D = z5;
                if (z2) {
                    H0(z2, true);
                } else if (this.f10107a.getActivity().getRequestedOrientation() != 0 && this.f10107a.getActivity().getRequestedOrientation() != 8) {
                    I0(true);
                } else {
                    return;
                }
                if (this.f10107a.getWindow() == null) {
                    window = this.f10107a.getActivity().getWindow();
                } else {
                    window = this.f10107a.getWindow();
                }
                this.c = DWViewUtil.hideNavigationBar(window);
            } else {
                if (((this.b.h() > 1.01d || this.b.h() == 0.0f) && (this.f10107a.getInitScreenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN || !this.t)) || this.f10107a.screenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
                    z = false;
                } else {
                    z = true;
                }
                if (this.F != DWScreenOrientationListenerImp.Orientation.PORTRAIT) {
                    z5 = true;
                }
                this.E = z5;
                if (z) {
                    K0(z);
                } else if (this.f10107a.getActivity().getRequestedOrientation() != 1) {
                    J0();
                }
            }
        }
    }

    @Override // tb.wtb
    public float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82244988", new Object[]{this})).floatValue();
        }
        return this.b.o();
    }

    public final void o0(FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4bf36d", new Object[]{this, fullOritation});
        } else {
            this.m.post(new m(this, fullOritation));
        }
    }

    @Override // tb.ytb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.ytb
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.ytb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.ytb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        } else {
            N0();
        }
    }

    @Override // tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // tb.ytb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // tb.ytb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ytb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        } else {
            N0();
        }
    }

    public void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
        } else {
            this.b.X();
        }
    }

    @Override // tb.wtb
    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
        } else {
            this.b.V(false);
        }
    }

    @Override // tb.wtb
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else {
            this.b.W();
        }
    }

    public void q0(gsc gscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27b1251f", new Object[]{this, gscVar});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            c32Var.Z(gscVar);
        }
    }

    public void r0(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            ((com.taobao.avplayer.player.a) c32Var).r1(nj9Var);
        }
    }

    @Override // tb.wtb
    public void refreshScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a8082e", new Object[]{this});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            c32Var.Y();
        }
    }

    @Override // tb.wtb
    public void retryVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6555dba", new Object[]{this});
        } else if (this.b.s() == 3 || ((TextUtils.isEmpty(this.f10107a.mPlayContext.getVideoUrl()) && TextUtils.isEmpty(this.f10107a.getVideoToken())) || (this.b.C() && this.b.k() == 3))) {
            c cVar = this.G;
            if (cVar != null) {
                ((f.b) cVar).a();
            }
            this.b.r0();
            if (this.e) {
                this.b.q0(0.0f);
            }
        }
    }

    public void s0(InnerStartFuncListener innerStartFuncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805c05a7", new Object[]{this, innerStartFuncListener});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            ((com.taobao.avplayer.player.a) c32Var).t1(innerStartFuncListener);
        }
    }

    @Override // tb.wtb
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
        } else {
            this.b.f0(i);
        }
    }

    @Override // tb.wtb
    public void setFov(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66bab26e", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            c32Var.i0(f, f2, f3);
        }
    }

    public void t0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cffc2caf", new Object[]{this, bVar});
        } else {
            this.f = bVar;
        }
    }

    public void u0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cac726", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public void v0(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22d190e5", new Object[]{this, cVar});
        } else {
            this.G = cVar;
        }
    }

    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57bb48ce", new Object[]{this});
        } else if (this.f10107a.screenType() == DWVideoScreenType.NORMAL) {
            this.D = true;
        } else {
            this.E = true;
        }
    }

    public void x0(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9377652f", new Object[]{this, str, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
            AVSDKLog.e(this.C, "setVideoSource## sorry  VideoSource is Empty  ");
        } else if (this.f10107a.mPlayContext.mLocalVideo) {
            this.b.p0(str);
        } else {
            if (str.startsWith(itw.URL_SEPARATOR)) {
                psb psbVar = this.f10107a.mConfigAdapter;
                if (psbVar == null || ((b75) psbVar).h()) {
                    str = uyv.HTTPS_SCHEMA.concat(str);
                } else {
                    str = "http:".concat(str);
                }
            }
            if (z) {
                try {
                    str = X(str);
                } catch (Throwable th) {
                    feh fehVar = this.C;
                    AVSDKLog.e(fehVar, " URL illegal " + th.getMessage());
                }
            }
            this.b.l0(this.f10107a.getUTParams());
            this.b.p0(str);
        }
    }

    public final void z0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("791d91fa", new Object[]{this, new Boolean(z)});
        } else {
            this.m.post(new ja5(this, z));
        }
    }

    public final void A0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf0d1a3", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.n, "translationX", i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.n, "translationY", i2);
        this.n.setTranslationY(this.r);
        this.n.setTranslationX(this.q);
        this.j = new AnimatorSet();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.n, Key.ROTATION, 0.0f);
        ofFloat3.addUpdateListener(new pa5(this));
        this.j.setDuration(200L);
        this.j.play(ofFloat3);
        this.j.play(ofFloat);
        this.j.play(ofFloat2);
        this.j.start();
        this.j.addListener(new qa5(this));
    }

    public final void C0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba1b5fd", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.n, "translationX", 0.0f, i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.n, "translationY", 0.0f, i2);
        this.n.setTranslationY(this.r);
        this.n.setTranslationX(this.q);
        this.j = new AnimatorSet();
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(90.0f, 0.0f);
        ofFloat3.addUpdateListener(new ma5(this));
        this.j.setDuration(200L);
        this.j.play(ofFloat3);
        this.j.play(ofFloat);
        this.j.play(ofFloat2);
        this.j.start();
        this.j.addListener(new na5(this));
    }

    public final void E0(int i, int i2) {
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b9fbbf", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.n, "translationX", i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.n, "translationY", i2);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 90.0f);
        this.i = new AnimatorSet();
        if (!this.t || this.f10107a.getInitScreenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
            i3 = 200;
        } else {
            this.t = false;
            int i4 = this.k[1];
            if (i4 == 0) {
                this.l = i4 + DWViewUtil.getStatusBarHeight(this.f10107a.getActivity());
            }
        }
        long j = i3;
        this.i.setDuration(j);
        this.i.play(ofFloat3);
        this.i.play(ofFloat);
        this.i.play(ofFloat2);
        this.m.post(new sa5(this));
        ofFloat3.setDuration(j);
        ofFloat3.addUpdateListener(new ta5(this));
        ofFloat3.addListener(new ua5(this));
    }

    public final void i0(FullOritation fullOritation) {
        ObjectAnimator objectAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c50834", new Object[]{this, fullOritation});
        } else if (!this.f10107a.isActivityToggleForLandscape() || !(this.f10107a.getActivity().getRequestedOrientation() == 0 || this.f10107a.getActivity().getRequestedOrientation() == 8)) {
            this.s = true;
            if (fullOritation == FullOritation.LANDSCAPE_FULL90_TO_PORTRAIT_FULL) {
                objectAnimator = ObjectAnimator.ofFloat(this.n, Key.ROTATION, -90.0f, 0.0f);
            } else {
                objectAnimator = ObjectAnimator.ofFloat(this.n, Key.ROTATION, 90.0f, 0.0f);
            }
            this.n.setLayerType(2, null);
            this.h = DWViewUtil.getPortraitScreenWidth();
            this.g = DWViewUtil.getVideoWidthInLandscape(this.f10107a.getActivity());
            int videoWidthInLandscape = DWViewUtil.getVideoWidthInLandscape(this.f10107a.getActivity());
            int portraitScreenWidth = DWViewUtil.getPortraitScreenWidth();
            int[] iArr = this.k;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.n, "translationX", -iArr[0]);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.n, "translationY", -iArr[1]);
            this.n.setLayerType(2, null);
            AnimatorSet animatorSet = new AnimatorSet();
            this.i = animatorSet;
            long j = 400;
            animatorSet.setDuration(j);
            this.i.play(objectAnimator);
            this.i.play(ofFloat);
            this.i.play(ofFloat2);
            this.m.post(new g(this));
            objectAnimator.setDuration(j);
            objectAnimator.addUpdateListener(new h(this, portraitScreenWidth, videoWidthInLandscape));
            objectAnimator.addListener(new i(this));
        } else {
            this.s = true;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.n.setLayoutParams(layoutParams);
            this.n.setLayerType(2, null);
            this.f10107a.getActivity().setRequestedOrientation(1);
            j0();
        }
    }

    public final void l0(FullOritation fullOritation) {
        ObjectAnimator objectAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8568f9a3", new Object[]{this, fullOritation});
        } else if (!this.f10107a.isActivityToggleForLandscape() || !(this.f10107a.getActivity().getRequestedOrientation() == 0 || this.f10107a.getActivity().getRequestedOrientation() == 8)) {
            if (fullOritation == FullOritation.LANDSCAPE_FULL270_TO_LANDSCAPE_FULL90) {
                objectAnimator = ObjectAnimator.ofFloat(this.n, Key.ROTATION, 90.0f, -90.0f);
            } else {
                objectAnimator = ObjectAnimator.ofFloat(this.n, Key.ROTATION, -90.0f, 90.0f);
            }
            this.s = true;
            this.n.setLayerType(2, null);
            AnimatorSet animatorSet = new AnimatorSet();
            this.i = animatorSet;
            long j = 400;
            animatorSet.setDuration(j);
            this.i.play(objectAnimator);
            this.m.post(new n(this));
            objectAnimator.setDuration(j);
            objectAnimator.addListener(new o(this, fullOritation));
        } else {
            this.s = true;
            this.n.setLayerType(2, null);
            if (fullOritation == FullOritation.LANDSCAPE_FULL270_TO_LANDSCAPE_FULL90) {
                this.f10107a.getActivity().setRequestedOrientation(8);
            } else {
                this.f10107a.getActivity().setRequestedOrientation(0);
            }
            k0(fullOritation);
        }
    }

    public final void n0(FullOritation fullOritation) {
        ObjectAnimator objectAnimator;
        int i;
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50bca5e", new Object[]{this, fullOritation});
        } else if (!this.f10107a.isActivityToggleForLandscape() || this.f10107a.getActivity().getRequestedOrientation() != 1) {
            this.s = true;
            if (fullOritation == FullOritation.PORTRAIT_FULL_TO_LANDSCAPE_FULL90) {
                objectAnimator = ObjectAnimator.ofFloat(this.n, Key.ROTATION, 0.0f, -90.0f);
            } else {
                objectAnimator = ObjectAnimator.ofFloat(this.n, Key.ROTATION, 0.0f, 90.0f);
            }
            this.n.setLayerType(2, null);
            this.h = DWViewUtil.getPortraitScreenWidth();
            this.g = DWViewUtil.getVideoWidthInLandscape(this.f10107a.getActivity());
            int videoWidthInLandscape = DWViewUtil.getVideoWidthInLandscape(this.f10107a.getActivity());
            int portraitScreenWidth = DWViewUtil.getPortraitScreenWidth();
            int i2 = this.h;
            int i3 = ((this.g - i2) / 2) - this.k[1];
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.n, "translationX", ((i2 - i) / 2) - iArr[0]);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.n, "translationY", i3);
            this.n.setLayerType(2, null);
            AnimatorSet animatorSet = new AnimatorSet();
            this.i = animatorSet;
            long j = 400;
            animatorSet.setDuration(j);
            this.i.play(objectAnimator);
            this.i.play(ofFloat);
            this.i.play(ofFloat2);
            this.m.post(new j(this));
            objectAnimator.setDuration(j);
            objectAnimator.addUpdateListener(new k(this, portraitScreenWidth, videoWidthInLandscape));
            objectAnimator.addListener(new l(this, fullOritation));
        } else {
            this.s = true;
            this.n.setLayerType(2, null);
            if (fullOritation == FullOritation.PORTRAIT_FULL_TO_LANDSCAPE_FULL90) {
                this.f10107a.getActivity().setRequestedOrientation(8);
            } else {
                this.f10107a.getActivity().setRequestedOrientation(0);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.n.setTranslationX(0.0f);
            this.n.setTranslationY(0.0f);
            this.n.setLayoutParams(layoutParams);
            o0(fullOritation);
        }
    }

    public final void y0(int i, int i2, boolean z) {
        ObjectAnimator objectAnimator;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe792351", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.n, "translationX", i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.n, "translationY", i2);
        if (z) {
            objectAnimator = ObjectAnimator.ofFloat(this.n, Key.ROTATION, 0.0f, 90.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.n, Key.ROTATION, 0.0f, -90.0f);
        }
        this.i = new AnimatorSet();
        if (!this.t || this.f10107a.getInitScreenType() != DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
            i3 = 200;
        } else {
            this.t = false;
            int i4 = this.k[1];
            if (i4 == 0) {
                this.l = i4 + DWViewUtil.getStatusBarHeight(this.f10107a.getActivity());
            }
        }
        this.i.setDuration(i3);
        this.i.play(objectAnimator);
        this.i.play(ofFloat);
        this.i.play(ofFloat2);
        this.m.post(new fa5(this));
        objectAnimator.addUpdateListener(new ga5(this));
        this.i.addListener(new ia5(this, z));
    }
}
