package com.etao.feimagesearch.capture.dynamic.bottom;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.album.CaptureAlbumView;
import com.etao.feimagesearch.capture.dynamic.bottom.history.CaptureHistoryView;
import com.etao.feimagesearch.result.ScrollInterceptView;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.taobao.R;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.agh;
import tb.b53;
import tb.c53;
import tb.caa;
import tb.ckf;
import tb.d32;
import tb.d53;
import tb.h53;
import tb.ipj;
import tb.lg4;
import tb.ojb;
import tb.p1p;
import tb.pjb;
import tb.r7m;
import tb.rcc;
import tb.t2o;
import tb.vpt;
import tb.w43;
import tb.yr3;
import tb.z43;
import tb.zio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureBottomAreaView extends d32<b53, yr3, CaptureManager> implements ojb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AutoSize__Bottom_BottomAreaView";
    public static final String TAG_PREFIX = "AutoSize__Bottom_";
    public static final int TYPE_ALBUM = 0;
    public static final int TYPE_BROWSED = 2;
    public static final int TYPE_HISTORY = 1;
    public final ViewGroup l;
    public ScrollInterceptView m;
    public FrameLayout n;
    public FrameLayout o;
    public final pjb p;
    public int q;
    public int r;
    public final CaptureAlbumView s;
    public final CaptureHistoryView t;
    public h53 u;
    public b v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;
    public static final a Companion = new a(null);
    public static final int A = p1p.a(50.0f);
    public static final int B = p1p.a(89.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296530);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final int a(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea7d5499", new Object[]{this, activity})).intValue();
            }
            ckf.g(activity, "activity");
            int h = caa.h(activity);
            CaptureAlbumView.b bVar = CaptureAlbumView.Companion;
            int a2 = (int) ((h + bVar.a()) / (CaptureBottomAreaView.Q() + bVar.a()));
            if (a2 <= 0) {
                return 1;
            }
            if (a2 < 4) {
                return 4;
            }
            if (a2 < 16) {
                return a2;
            }
            agh.r("PltCameraPai", CaptureBottomAreaView.TAG, "computeAlbumSpanCount: getRealScreenWidth=" + caa.h(activity) + ", albumDecorationDivider=" + bVar.a() + ", DEFAULT_IMAGE_HEIGHT=" + CaptureBottomAreaView.Q() + ", count=" + a2);
            return 16;
        }

        @JvmStatic
        public final int b(Activity activity, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("daa97782", new Object[]{this, activity, new Integer(i)})).intValue();
            }
            ckf.g(activity, "activity");
            return ((caa.h(activity) - ((i - 1) * CaptureAlbumView.Companion.a())) / i) + p1p.a(47.0f);
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d8a11c39", new Object[]{this})).intValue();
            }
            return CaptureBottomAreaView.S();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b {
        boolean c();

        void d(int i, int i2);

        void g(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ViewGroup d;

        public c(ViewGroup viewGroup) {
            this.d = viewGroup;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/CaptureBottomAreaView$add2Parent$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                CaptureBottomAreaView.this.a0().addView(this.d, -1, -1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements ScrollInterceptView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.a
        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("81a01aca", new Object[]{this})).booleanValue();
            }
            b P = CaptureBottomAreaView.P(CaptureBottomAreaView.this);
            if (P == null) {
                return false;
            }
            return P.c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements ScrollInterceptView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35387db9", new Object[]{this});
            }
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
        public void l(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efa83a09", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i2 == 1 || i2 == 2) {
                CaptureBottomAreaView.this.m().o0(false);
            } else if (i2 == -1 && i != -1) {
            } else {
                if (i2 == 0 && i != 0 && i != -1) {
                    CaptureBottomAreaView.this.m().o0(true);
                    CaptureBottomAreaView.R(CaptureBottomAreaView.this).j(false);
                    CaptureBottomAreaView.U(CaptureBottomAreaView.this, false);
                } else if (i2 == 3 && i != 3 && i != -1) {
                    CaptureBottomAreaView.this.m().o0(false);
                    CaptureBottomAreaView.this.m().V(3);
                    CaptureBottomAreaView.R(CaptureBottomAreaView.this).j(true);
                    CaptureBottomAreaView.U(CaptureBottomAreaView.this, true);
                }
            }
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
        public void s(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("691aec9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            CaptureBottomAreaView.W(CaptureBottomAreaView.this, i4 - i2);
            CaptureBottomAreaView.V(CaptureBottomAreaView.this, i4);
            b P = CaptureBottomAreaView.P(CaptureBottomAreaView.this);
            if (P != null) {
                P.d(CaptureBottomAreaView.T(CaptureBottomAreaView.this), i4);
            }
        }
    }

    static {
        t2o.a(481296529);
        t2o.a(481296539);
    }

    public /* synthetic */ CaptureBottomAreaView(Activity activity, rcc rccVar, ViewGroup viewGroup, boolean z, int i, a07 a07Var) {
        this(activity, rccVar, viewGroup, (i & 8) != 0 ? true : z);
    }

    public static final /* synthetic */ int N(CaptureBottomAreaView captureBottomAreaView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23452d7f", new Object[]{captureBottomAreaView})).intValue();
        }
        return captureBottomAreaView.q;
    }

    public static final /* synthetic */ FrameLayout O(CaptureBottomAreaView captureBottomAreaView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("3539eb16", new Object[]{captureBottomAreaView});
        }
        return captureBottomAreaView.n;
    }

    public static final /* synthetic */ b P(CaptureBottomAreaView captureBottomAreaView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2d23205b", new Object[]{captureBottomAreaView});
        }
        return captureBottomAreaView.v;
    }

    public static final /* synthetic */ int Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("450dbf8c", new Object[0])).intValue();
        }
        return B;
    }

    public static final /* synthetic */ pjb R(CaptureBottomAreaView captureBottomAreaView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pjb) ipChange.ipc$dispatch("5f4c84a2", new Object[]{captureBottomAreaView});
        }
        return captureBottomAreaView.p;
    }

    public static final /* synthetic */ int S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e5f5aac", new Object[0])).intValue();
        }
        return A;
    }

    public static final /* synthetic */ int T(CaptureBottomAreaView captureBottomAreaView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ac59946", new Object[]{captureBottomAreaView})).intValue();
        }
        return captureBottomAreaView.w;
    }

    public static final /* synthetic */ void U(CaptureBottomAreaView captureBottomAreaView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95216a9a", new Object[]{captureBottomAreaView, new Boolean(z)});
        } else {
            captureBottomAreaView.y = z;
        }
    }

    public static final /* synthetic */ void V(CaptureBottomAreaView captureBottomAreaView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87b6163", new Object[]{captureBottomAreaView, new Integer(i)});
        } else {
            captureBottomAreaView.x = i;
        }
    }

    public static final /* synthetic */ void W(CaptureBottomAreaView captureBottomAreaView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74036284", new Object[]{captureBottomAreaView, new Integer(i)});
        } else {
            captureBottomAreaView.w = i;
        }
    }

    @JvmStatic
    public static final int Y(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea7d5499", new Object[]{activity})).intValue();
        }
        return Companion.a(activity);
    }

    public static /* synthetic */ Object ipc$super(CaptureBottomAreaView captureBottomAreaView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -3136315) {
            super.K();
            return null;
        } else if (hashCode == 1411002928) {
            super.A();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/capture/dynamic/bottom/CaptureBottomAreaView");
        }
    }

    @Override // tb.d32
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541a3230", new Object[]{this});
            return;
        }
        this.l.removeView(b0());
        super.A();
    }

    public final void X(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01a7d01", new Object[]{this, viewGroup});
        } else if (this.d) {
            vpt.g("AutoSize__Bottom_BottomAreaViewaddView", new c(viewGroup));
        }
    }

    /* renamed from: Z */
    public b53 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b53) ipChange.ipc$dispatch("7564592c", new Object[]{this});
        }
        return new b53();
    }

    public final ViewGroup a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2ed30c29", new Object[]{this});
        }
        return this.l;
    }

    public final ScrollInterceptView b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollInterceptView) ipChange.ipc$dispatch("3779a1e", new Object[]{this});
        }
        ScrollInterceptView scrollInterceptView = this.m;
        if (scrollInterceptView != null) {
            return scrollInterceptView;
        }
        ckf.y("rootView");
        throw null;
    }

    public final void c0() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab43333", new Object[]{this});
            return;
        }
        b0().setDownContentHeight(this.q);
        Integer b2 = ipj.INSTANCE.b((AppCompatActivity) this.c);
        if (b2 == null) {
            i = p1p.a(50.0f);
        } else {
            i = b2.intValue();
        }
        int a2 = i + p1p.a(10.0f);
        b0().setContentUpStateOffset(a2);
        FrameLayout frameLayout = this.n;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new c53(this, a2));
            vpt.e(b0(), new d53(this));
            return;
        }
        ckf.y("bizContainer");
        throw null;
    }

    public final void d0(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("622d37df", new Object[]{this, new Boolean(z)});
        } else if (this.z != z) {
            this.z = z;
            ScrollInterceptView b0 = b0();
            if (!z) {
                i = 8;
            }
            b0.setVisibility(i);
        }
    }

    public final void e0(ScrollInterceptView scrollInterceptView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a372145a", new Object[]{this, scrollInterceptView});
            return;
        }
        ckf.g(scrollInterceptView, "<set-?>");
        this.m = scrollInterceptView;
    }

    public final boolean f0(r7m r7mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbb6f15d", new Object[]{this, r7mVar, new Boolean(z)})).booleanValue();
        }
        if (!z) {
            this.t.i0(r7mVar, false);
            this.p.e(false);
            return true;
        } else if (r7mVar == null || !this.t.c0()) {
            return false;
        } else {
            this.t.i0(r7mVar, true);
            this.p.e(true);
            return true;
        }
    }

    public final void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9dc77d", new Object[]{this, new Integer(i)});
        } else {
            this.p.l(i);
        }
    }

    @Override // tb.ojb
    public void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff87768", new Object[]{this, new Boolean(z)});
            return;
        }
        agh.h(TAG, "onFolderStateChange: isFoldUp=" + z + ", this.isPageFoldUp=" + this.y);
        if (this.y != z) {
            this.y = z;
            b bVar = this.v;
            if (bVar != null) {
                bVar.g(z);
            }
            b0().movePageToAssignPageLocationRatioWithAnim(this.y ? 0.0f : 1.0f, 150L, null);
        }
    }

    @Override // tb.ojb
    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24e7612d", new Object[]{this})).booleanValue();
        }
        return this.y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureBottomAreaView(Activity activity, rcc<yr3, CaptureManager> rccVar, ViewGroup viewGroup, boolean z) {
        super(activity, rccVar, false, z);
        pjb pjbVar;
        ckf.g(activity, "activity");
        ckf.g(viewGroup, "parentView");
        this.l = viewGroup;
        this.s = new CaptureAlbumView(activity, this, this.q);
        this.t = new CaptureHistoryView(activity, this, new CaptureBottomAreaView$historyView$1(this));
        boolean L = lg4.L();
        if (!L) {
            X(b0());
        }
        this.y = false;
        if (m().f()) {
            FrameLayout frameLayout = this.o;
            if (frameLayout != null) {
                pjbVar = new z43(activity, this, frameLayout, this);
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        } else {
            FrameLayout frameLayout2 = this.o;
            if (frameLayout2 != null) {
                pjbVar = new w43(activity, this, frameLayout2, this);
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        }
        this.p = pjbVar;
        onTabChanged(0);
        c0();
        if (L) {
            X(b0());
        }
        this.z = true;
    }

    @Override // tb.d32
    public void K() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        super.K();
        this.r = lg4.O1(this.c);
        if (m().f()) {
            i = 0;
        } else {
            a aVar = Companion;
            Activity activity = this.c;
            ckf.f(activity, "activity");
            i = aVar.b(activity, this.r);
        }
        this.q = i;
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.feis_view_capture_bottom_area, (ViewGroup) null, false);
        if (inflate != null) {
            e0((ScrollInterceptView) inflate);
            View findViewById = b0().findViewById(R.id.fl_area_container);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(p1p.b(6.5f));
            gradientDrawable.setColor(Color.parseColor("#0E1119"));
            findViewById.setBackground(gradientDrawable);
            b0().setStateProvider(new d());
            b0().setAutoScrollInterval(1);
            b0().setOffsetCallback(new e());
            View findViewById2 = b0().findViewById(R.id.fl_container);
            ckf.f(findViewById2, "rootView.findViewById(R.id.fl_container)");
            this.n = (FrameLayout) findViewById2;
            View findViewById3 = b0().findViewById(R.id.fl_nav_bar_container);
            ckf.f(findViewById3, "rootView.findViewById(R.id.fl_nav_bar_container)");
            this.o = (FrameLayout) findViewById3;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.result.ScrollInterceptView");
    }

    @Override // tb.ojb
    public void onTabChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62d6597e", new Object[]{this, new Integer(i)});
            return;
        }
        agh.h(TAG, ckf.p("onTabChanged ", Integer.valueOf(i)));
        if (i == 0) {
            CaptureAlbumView captureAlbumView = this.s;
            this.v = captureAlbumView;
            FrameLayout frameLayout = this.n;
            if (frameLayout != null) {
                captureAlbumView.w0(frameLayout, true, this.y, this.w, this.x);
                CaptureHistoryView captureHistoryView = this.t;
                FrameLayout frameLayout2 = this.n;
                if (frameLayout2 != null) {
                    captureHistoryView.f0(frameLayout2, false, this.y, this.w, this.x);
                    h53 h53Var = this.u;
                    if (h53Var != null) {
                        FrameLayout frameLayout3 = this.n;
                        if (frameLayout3 != null) {
                            h53Var.Y(frameLayout3, false, this.y, this.w, this.x);
                        } else {
                            ckf.y("bizContainer");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("bizContainer");
                    throw null;
                }
            } else {
                ckf.y("bizContainer");
                throw null;
            }
        } else if (i == 1) {
            this.v = this.t;
            CaptureAlbumView captureAlbumView2 = this.s;
            FrameLayout frameLayout4 = this.n;
            if (frameLayout4 != null) {
                captureAlbumView2.w0(frameLayout4, false, this.y, this.w, this.x);
                CaptureHistoryView captureHistoryView2 = this.t;
                FrameLayout frameLayout5 = this.n;
                if (frameLayout5 != null) {
                    captureHistoryView2.f0(frameLayout5, true, this.y, this.w, this.x);
                    h53 h53Var2 = this.u;
                    if (h53Var2 != null) {
                        FrameLayout frameLayout6 = this.n;
                        if (frameLayout6 != null) {
                            h53Var2.Y(frameLayout6, false, this.y, this.w, this.x);
                        } else {
                            ckf.y("bizContainer");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("bizContainer");
                    throw null;
                }
            } else {
                ckf.y("bizContainer");
                throw null;
            }
        } else if (i == 2) {
            if (this.u == null) {
                Activity activity = this.c;
                ckf.f(activity, "activity");
                this.u = new h53(activity, this.b);
            }
            this.v = this.u;
            CaptureAlbumView captureAlbumView3 = this.s;
            FrameLayout frameLayout7 = this.n;
            if (frameLayout7 != null) {
                captureAlbumView3.w0(frameLayout7, false, this.y, this.w, this.x);
                CaptureHistoryView captureHistoryView3 = this.t;
                FrameLayout frameLayout8 = this.n;
                if (frameLayout8 != null) {
                    captureHistoryView3.f0(frameLayout8, false, this.y, this.w, this.x);
                    h53 h53Var3 = this.u;
                    if (h53Var3 != null) {
                        FrameLayout frameLayout9 = this.n;
                        if (frameLayout9 != null) {
                            h53Var3.Y(frameLayout9, true, this.y, this.w, this.x);
                        } else {
                            ckf.y("bizContainer");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("bizContainer");
                    throw null;
                }
            } else {
                ckf.y("bizContainer");
                throw null;
            }
        }
    }
}
