package com.etao.feimagesearch.capture.dynamic.bottom.album;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.thumbnail.MediaThumbnailExecutor;
import com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView;
import com.etao.feimagesearch.capture.dynamic.bottom.album.CaptureAlbumView;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.ui.CustomGridLayoutManager;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.agh;
import tb.caa;
import tb.ckf;
import tb.d22;
import tb.d32;
import tb.d43;
import tb.h43;
import tb.i43;
import tb.jzu;
import tb.lg4;
import tb.mhi;
import tb.mz1;
import tb.mzu;
import tb.p1p;
import tb.p73;
import tb.p7m;
import tb.pei;
import tb.rcc;
import tb.s63;
import tb.svm;
import tb.t2o;
import tb.tj0;
import tb.vpt;
import tb.xhv;
import tb.yr3;
import tb.zio;
import tb.zs9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureAlbumView extends d32<d43, yr3, CaptureManager> implements CaptureBottomAreaView.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final int P = p1p.a(1.0f);
    public static final int TAB_TYPE_ALL = 0;
    public static final int TAB_TYPE_SCREEN_SHOT = 2;
    public static final int TAB_TYPE_VIDEO = 1;
    public static final String TAG = "AutoSize__Bottom_CaptureAlbumView";
    public static final String TAG_PREFIX = "AutoSize__Bottom_Album_";
    public View A;
    public TUrlImageView B;
    public View C;
    public View D;
    public View E;
    public View F;
    public int G = -1;
    public List<TextView> H;
    public boolean I;
    public final d22 J;
    public final CaptureAlbumAdapter K;
    public final CaptureAlbumFolderAdapter L;
    public boolean M;
    public int N;
    public int O;
    public final int l;
    public boolean m;
    public int n;
    public boolean o;
    public zs9 p;
    public LinearLayout q;
    public View r;
    public View s;
    public TextView t;
    public TUrlImageView u;
    public View v;
    public View w;
    public RecyclerView x;
    public RecyclerView y;
    public View z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements svm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.svm
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df1ef900", new Object[]{this});
                return;
            }
            RecyclerView Y = CaptureAlbumView.Y(CaptureAlbumView.this);
            if (Y != null) {
                Y.setAdapter(CaptureAlbumView.N(CaptureAlbumView.this));
            } else {
                ckf.y("rvImage");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296558);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("85978d0a", new Object[]{this})).intValue();
            }
            return CaptureAlbumView.O();
        }

        @JvmStatic
        public final int b(Context context, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d688ca68", new Object[]{this, context, new Integer(i)})).intValue();
            }
            ckf.g(context, "context");
            return (caa.h(context) - ((i - 1) * a())) / i;
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            mzu.i(s63.ALBUM_PAGE_NAME, "GoSettingClick", new String[0]);
            d43 d43Var = (d43) CaptureAlbumView.W(CaptureAlbumView.this);
            if (d43Var != null) {
                d43Var.L();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            mzu.i(s63.ALBUM_PAGE_NAME, "GoSettingClick", new String[0]);
            d43 d43Var = (d43) CaptureAlbumView.W(CaptureAlbumView.this);
            if (d43Var != null) {
                d43Var.L();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            CaptureAlbumView captureAlbumView = CaptureAlbumView.this;
            CaptureAlbumView.e0(captureAlbumView, true ^ CaptureAlbumView.a0(captureAlbumView));
            if (CaptureAlbumView.a0(CaptureAlbumView.this)) {
                mzu.g(s63.ALBUM_PAGE_NAME, "ClickAlbum");
            }
            CaptureAlbumView captureAlbumView2 = CaptureAlbumView.this;
            CaptureAlbumView.g0(captureAlbumView2, CaptureAlbumView.a0(captureAlbumView2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            CaptureAlbumView.i0(CaptureAlbumView.this, 0);
            mzu.i(s63.ALBUM_PAGE_NAME, "ClickAlbumFilter", new String[0]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            CaptureAlbumView.i0(CaptureAlbumView.this, 1);
            mzu.i(s63.ALBUM_PAGE_NAME, "ClickAlbumFilter", new String[0]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            CaptureAlbumView.i0(CaptureAlbumView.this, 2);
            mzu.i(s63.ALBUM_PAGE_NAME, "ClickAlbumFilter", new String[0]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class i implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            mzu.i(s63.ALBUM_PAGE_NAME, "GoSettingClick", new String[0]);
            d43 d43Var = (d43) CaptureAlbumView.W(CaptureAlbumView.this);
            if (d43Var != null) {
                d43Var.M();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class j extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ ViewGroup d;
        public final /* synthetic */ CaptureAlbumView e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;

        public j(boolean z, ViewGroup viewGroup, CaptureAlbumView captureAlbumView, boolean z2, int i, int i2) {
            this.c = z;
            this.d = viewGroup;
            this.e = captureAlbumView;
            this.f = z2;
            this.g = i;
            this.h = i2;
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/album/CaptureAlbumView$onViewStateChanged$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            if (this.c) {
                this.d.removeAllViews();
                this.d.addView(this.e.p0(), -1, -1);
                CaptureAlbumView.d0(this.e, this.f);
            }
            this.e.u0(this.g, this.h);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class k extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean d;

        public k(boolean z) {
            this.d = z;
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/album/CaptureAlbumView$updateProgressViewState$1");
        }

        @Override // tb.zio
        public void c() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            View X = CaptureAlbumView.X(CaptureAlbumView.this);
            if (X != null) {
                if (!this.d) {
                    i = 8;
                }
                X.setVisibility(i);
                return;
            }
            ckf.y("progressView");
            throw null;
        }
    }

    static {
        t2o.a(481296556);
        t2o.a(481296531);
        t2o.a(481296538);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureAlbumView(Activity activity, rcc<yr3, CaptureManager> rccVar, int i2) {
        super(activity, rccVar);
        d22 d22Var;
        ckf.g(activity, "activity");
        this.l = i2;
        this.n = lg4.O1(activity);
        if (lg4.x()) {
            d22Var = new mhi("album");
        } else {
            d22Var = new MediaThumbnailExecutor();
        }
        this.J = d22Var;
        CaptureAlbumAdapter captureAlbumAdapter = new CaptureAlbumAdapter(null, d22Var, this.n, m().M(), new CaptureAlbumView$albumAdapter$1(activity, this), new CaptureAlbumView$albumAdapter$2(this));
        this.K = captureAlbumAdapter;
        CaptureAlbumFolderAdapter captureAlbumFolderAdapter = new CaptureAlbumFolderAdapter(activity, m().M(), d22Var, new CaptureAlbumView$folderAdapter$1(this));
        this.L = captureAlbumFolderAdapter;
        G0(0);
        if (m().v()) {
            m().g0(new a());
        } else {
            RecyclerView recyclerView = this.x;
            if (recyclerView != null) {
                recyclerView.setAdapter(captureAlbumAdapter);
            } else {
                ckf.y("rvImage");
                throw null;
            }
        }
        RecyclerView recyclerView2 = this.y;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(captureAlbumFolderAdapter);
        } else {
            ckf.y("rvFolder");
            throw null;
        }
    }

    public static final /* synthetic */ CaptureAlbumAdapter N(CaptureAlbumView captureAlbumView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureAlbumAdapter) ipChange.ipc$dispatch("f57383f5", new Object[]{captureAlbumView});
        }
        return captureAlbumView.K;
    }

    public static final /* synthetic */ int O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34d44c3b", new Object[0])).intValue();
        }
        return P;
    }

    public static final /* synthetic */ int P(CaptureAlbumView captureAlbumView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d083217", new Object[]{captureAlbumView})).intValue();
        }
        return captureAlbumView.n;
    }

    public static final /* synthetic */ int Q(CaptureAlbumView captureAlbumView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26d1df70", new Object[]{captureAlbumView})).intValue();
        }
        return captureAlbumView.G;
    }

    public static final /* synthetic */ View R(CaptureAlbumView captureAlbumView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bc759cfd", new Object[]{captureAlbumView});
        }
        return captureAlbumView.F;
    }

    public static final /* synthetic */ TextView S(CaptureAlbumView captureAlbumView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("faa6bddc", new Object[]{captureAlbumView});
        }
        return captureAlbumView.t;
    }

    public static final /* synthetic */ View T(CaptureAlbumView captureAlbumView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c55a74be", new Object[]{captureAlbumView});
        }
        return captureAlbumView.A;
    }

    public static final /* synthetic */ int U(CaptureAlbumView captureAlbumView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec1f35e6", new Object[]{captureAlbumView})).intValue();
        }
        return captureAlbumView.O;
    }

    public static final /* synthetic */ int V(CaptureAlbumView captureAlbumView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b59a2e9f", new Object[]{captureAlbumView})).intValue();
        }
        return captureAlbumView.N;
    }

    public static final /* synthetic */ mz1 W(CaptureAlbumView captureAlbumView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mz1) ipChange.ipc$dispatch("39b2ff7a", new Object[]{captureAlbumView});
        }
        return captureAlbumView.f17536a;
    }

    public static final /* synthetic */ View X(CaptureAlbumView captureAlbumView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7c782a22", new Object[]{captureAlbumView});
        }
        return captureAlbumView.z;
    }

    public static final /* synthetic */ RecyclerView Y(CaptureAlbumView captureAlbumView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("d3f7a220", new Object[]{captureAlbumView});
        }
        return captureAlbumView.x;
    }

    public static final /* synthetic */ List Z(CaptureAlbumView captureAlbumView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eebf986c", new Object[]{captureAlbumView});
        }
        return captureAlbumView.H;
    }

    public static final /* synthetic */ boolean a0(CaptureAlbumView captureAlbumView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52f7b60f", new Object[]{captureAlbumView})).booleanValue();
        }
        return captureAlbumView.I;
    }

    public static final /* synthetic */ boolean b0(CaptureAlbumView captureAlbumView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b074a6b1", new Object[]{captureAlbumView})).booleanValue();
        }
        return captureAlbumView.M;
    }

    public static final /* synthetic */ void c0(CaptureAlbumView captureAlbumView, zs9 zs9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b21e97", new Object[]{captureAlbumView, zs9Var});
        } else {
            captureAlbumView.s0(zs9Var);
        }
    }

    public static final /* synthetic */ void d0(CaptureAlbumView captureAlbumView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4af4455", new Object[]{captureAlbumView, new Boolean(z)});
        } else {
            captureAlbumView.x0(z);
        }
    }

    public static final /* synthetic */ void e0(CaptureAlbumView captureAlbumView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bdf8271", new Object[]{captureAlbumView, new Boolean(z)});
        } else {
            captureAlbumView.I = z;
        }
    }

    public static final /* synthetic */ void f0(CaptureAlbumView captureAlbumView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9212ee60", new Object[]{captureAlbumView, new Boolean(z)});
        } else {
            captureAlbumView.B0(z);
        }
    }

    public static final /* synthetic */ void g0(CaptureAlbumView captureAlbumView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3a15ec", new Object[]{captureAlbumView, new Boolean(z)});
        } else {
            captureAlbumView.C0(z);
        }
    }

    public static final /* synthetic */ void h0(CaptureAlbumView captureAlbumView, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de6d95d2", new Object[]{captureAlbumView, new Integer(i2), new Integer(i3)});
        } else {
            captureAlbumView.D0(i2, i3);
        }
    }

    public static final /* synthetic */ void i0(CaptureAlbumView captureAlbumView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68eafd2", new Object[]{captureAlbumView, new Integer(i2)});
        } else {
            captureAlbumView.G0(i2);
        }
    }

    public static /* synthetic */ Object ipc$super(CaptureAlbumView captureAlbumView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -3136315) {
            super.K();
            return null;
        } else if (hashCode == 1411002928) {
            super.A();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/capture/dynamic/bottom/album/CaptureAlbumView");
        }
    }

    @JvmStatic
    public static final int k0(Context context, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d688ca68", new Object[]{context, new Integer(i2)})).intValue();
        }
        return Companion.b(context, i2);
    }

    @Override // tb.d32
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541a3230", new Object[]{this});
            return;
        }
        super.A();
        this.J.onDestroy();
        agh.r("PltCameraPai", "AutoSize__Bottom_CaptureAlbumView", ckf.p("hitCache ", Integer.valueOf(this.K.T())));
        mzu.n(p73.f25916a, "hitAlbumViewCache", 19999, "count", String.valueOf(this.K.T()));
    }

    public final void B0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2f60e5", new Object[]{this, new Boolean(z)});
        } else {
            vpt.g("updateEmptyViewState", new h43(this, z));
        }
    }

    public final void F0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53bed77", new Object[]{this, new Boolean(z)});
        } else {
            vpt.g("updateProgressViewState", new k(z));
        }
    }

    public final void G0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60841897", new Object[]{this, new Integer(i2)});
            return;
        }
        int i3 = this.G;
        if (i3 != i2) {
            H0(i3, false);
            this.G = i2;
            H0(i2, true);
        }
    }

    public final void H0(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603c2738", new Object[]{this, new Integer(i2), new Boolean(z)});
        } else {
            vpt.g("updateTabViewState", new i43(i2, this, z));
        }
    }

    @Override // tb.d32
    public void K() {
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        super.K();
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.feis_view_capture_album, (ViewGroup) null, false);
        if (inflate != null) {
            z0((LinearLayout) inflate);
            View findViewById = p0().findViewById(R.id.fl_btn_container);
            findViewById.setVisibility(8);
            xhv xhvVar = xhv.INSTANCE;
            this.r = findViewById;
            View findViewById2 = p0().findViewById(R.id.ll_folder);
            ViewProxy.setOnClickListener(findViewById2, new e());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(p1p.b(6.5f));
            gradientDrawable.setStroke(p1p.a(1.0f), Color.parseColor("#66F3F6F8"));
            findViewById2.setBackground(gradientDrawable);
            StringBuilder sb = new StringBuilder();
            sb.append(Localization.q(R.string.taobao_app_1007_1_18952));
            sb.append((char) 65292);
            sb.append(Localization.q(R.string.taobao_app_1007_expand));
            sb.append((char) 65292);
            int i2 = R.string.taobao_app_1007_button;
            sb.append(Localization.q(i2));
            findViewById2.setContentDescription(sb.toString());
            this.s = findViewById2;
            View findViewById3 = p0().findViewById(R.id.folder_label);
            float f2 = 18.0f;
            float f3 = 15.0f;
            ((TextView) findViewById3).setTextSize(1, m().M() ? 18.0f : 15.0f);
            ckf.f(findViewById3, "rootView.findViewById<Te…Mode) 18f else 15f)\n    }");
            this.t = (TextView) findViewById3;
            View findViewById4 = p0().findViewById(R.id.iv_fold_state);
            ckf.f(findViewById4, "rootView.findViewById(R.id.iv_fold_state)");
            TUrlImageView tUrlImageView = (TUrlImageView) findViewById4;
            this.u = tUrlImageView;
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01WjFuHO1BvFnP1cxXx_!!6000000000007-49-tps-42-25.webp");
            View findViewById5 = p0().findViewById(R.id.fl_tab_container);
            ckf.f(findViewById5, "rootView.findViewById(R.id.fl_tab_container)");
            this.v = findViewById5;
            this.H = new ArrayList();
            View findViewById6 = p0().findViewById(R.id.tv_tab_all);
            TextView textView = (TextView) findViewById6;
            textView.setTextSize(1, m().M() ? 18.0f : 15.0f);
            textView.setOnClickListener(new f());
            textView.setContentDescription(Localization.q(R.string.taobao_app_1007_all) + (char) 65292 + Localization.q(i2));
            List<TextView> list = this.H;
            if (list != null) {
                ((ArrayList) list).add(textView);
                ckf.f(findViewById6, "rootView.findViewById<Te…ewHolders.add(this)\n    }");
                TextView textView2 = (TextView) findViewById6;
                View findViewById7 = p0().findViewById(R.id.tv_tab_video);
                TextView textView3 = (TextView) findViewById7;
                textView3.setTextSize(1, m().M() ? 18.0f : 15.0f);
                textView3.setOnClickListener(new g());
                textView3.setContentDescription(Localization.q(R.string.taobao_app_1007_item_video) + (char) 65292 + Localization.q(i2));
                List<TextView> list2 = this.H;
                if (list2 != null) {
                    ((ArrayList) list2).add(textView3);
                    ckf.f(findViewById7, "rootView.findViewById<Te…ewHolders.add(this)\n    }");
                    TextView textView4 = (TextView) findViewById7;
                    View findViewById8 = p0().findViewById(R.id.tv_tab_screenshot);
                    TextView textView5 = (TextView) findViewById8;
                    if (!m().M()) {
                        f2 = 15.0f;
                    }
                    textView5.setTextSize(1, f2);
                    textView5.setOnClickListener(new h());
                    textView5.setContentDescription(Localization.q(R.string.taobao_app_1007_1_18944) + (char) 65292 + Localization.q(i2));
                    List<TextView> list3 = this.H;
                    if (list3 != null) {
                        ((ArrayList) list3).add(textView5);
                        ckf.f(findViewById8, "rootView.findViewById<Te…ewHolders.add(this)\n    }");
                        TextView textView6 = (TextView) findViewById8;
                        View findViewById9 = p0().findViewById(R.id.ll_auth_all_container);
                        ckf.f(findViewById9, "rootView.findViewById(R.id.ll_auth_all_container)");
                        this.w = findViewById9;
                        ViewProxy.setOnClickListener(findViewById9, new i());
                        View view = this.w;
                        if (view != null) {
                            GradientDrawable gradientDrawable2 = new GradientDrawable();
                            gradientDrawable2.setShape(0);
                            float f4 = 12.0f;
                            float b2 = p1p.b(12.0f);
                            gradientDrawable2.setCornerRadii(new float[]{b2, b2, b2, b2, 0.0f, 0.0f, 0.0f, 0.0f});
                            gradientDrawable2.setColor(Color.parseColor("#1F1F1F"));
                            view.setBackground(gradientDrawable2);
                            ((TextView) p0().findViewById(R.id.tv_auth_hint)).setTextSize(1, m().M() ? 15.0f : 12.0f);
                            TextView textView7 = (TextView) p0().findViewById(R.id.btn_auth_all);
                            GradientDrawable gradientDrawable3 = new GradientDrawable();
                            gradientDrawable3.setShape(0);
                            gradientDrawable3.setCornerRadius(p1p.b(12.0f));
                            gradientDrawable3.setColor(Color.parseColor("#99888888"));
                            textView7.setBackground(gradientDrawable3);
                            if (m().M()) {
                                f4 = 15.0f;
                            }
                            textView7.setTextSize(1, f4);
                            View findViewById10 = p0().findViewById(R.id.fl_album_container);
                            ckf.f(findViewById10, "rootView.findViewById(R.id.fl_album_container)");
                            FrameLayout frameLayout = (FrameLayout) findViewById10;
                            View findViewById11 = p0().findViewById(R.id.fl_progress);
                            ckf.f(findViewById11, "rootView.findViewById(R.id.fl_progress)");
                            this.z = findViewById11;
                            View findViewById12 = p0().findViewById(R.id.fl_hint_container);
                            ckf.f(findViewById12, "rootView.findViewById(R.id.fl_hint_container)");
                            this.A = findViewById12;
                            View findViewById13 = p0().findViewById(R.id.iv_permission_hint_bg);
                            ckf.f(findViewById13, "rootView.findViewById(R.id.iv_permission_hint_bg)");
                            TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById13;
                            this.B = tUrlImageView2;
                            tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01qikYpk1N6Ct7qHaaE_!!6000000001520-2-tps-1500-372.png");
                            View findViewById14 = p0().findViewById(R.id.fl_permission_hint_container);
                            ckf.f(findViewById14, "rootView.findViewById(R.…ermission_hint_container)");
                            this.C = findViewById14;
                            View findViewById15 = p0().findViewById(R.id.fl_permission_hint);
                            ckf.f(findViewById15, "rootView.findViewById(R.id.fl_permission_hint)");
                            this.D = findViewById15;
                            ((TUrlImageView) p0().findViewById(R.id.iv_permission_hint)).setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01fH5ATq1BsVGSvI8fC_!!6000000000001-2-tps-108-92.png");
                            ((TextView) p0().findViewById(R.id.tv_permission_hint)).setTextSize(1, m().M() ? 17.0f : 15.0f);
                            TextView textView8 = (TextView) p0().findViewById(R.id.btn_permission);
                            GradientDrawable gradientDrawable4 = new GradientDrawable();
                            gradientDrawable4.setShape(0);
                            gradientDrawable4.setCornerRadius(p1p.b(17.0f));
                            gradientDrawable4.setColor(Color.parseColor("#FFFFFF"));
                            textView8.setBackground(gradientDrawable4);
                            textView8.setOnClickListener(new c());
                            textView8.setTextSize(1, m().M() ? 17.0f : 15.0f);
                            View findViewById16 = p0().findViewById(R.id.fl_permission_hint_full);
                            ckf.f(findViewById16, "rootView.findViewById(R.….fl_permission_hint_full)");
                            this.E = findViewById16;
                            ((TextView) p0().findViewById(R.id.tv_permission_hint_top)).setTextSize(1, m().M() ? 21.0f : 17.0f);
                            ((TextView) p0().findViewById(R.id.tv_permission_hint_bottom)).setTextSize(1, m().M() ? 17.0f : 15.0f);
                            ((TUrlImageView) p0().findViewById(R.id.iv_permission_hint_full)).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN019KpKir1rMdZRTCbiZ_!!6000000005617-2-tps-180-164.png");
                            TextView textView9 = (TextView) p0().findViewById(R.id.btn_permission_full);
                            GradientDrawable gradientDrawable5 = new GradientDrawable();
                            gradientDrawable5.setShape(0);
                            gradientDrawable5.setCornerRadius(p1p.b(17.0f));
                            gradientDrawable5.setColor(Color.parseColor("#FFFFFF"));
                            textView9.setBackground(gradientDrawable5);
                            textView9.setTextSize(1, m().M() ? 17.0f : 15.0f);
                            textView9.setOnClickListener(new d());
                            ViewGroup.LayoutParams layoutParams = textView9.getLayoutParams();
                            layoutParams.height = p1p.a(m().M() ? 35.0f : 28.0f);
                            textView9.setLayoutParams(layoutParams);
                            View findViewById17 = p0().findViewById(R.id.tv_empty_hint);
                            TextView textView10 = (TextView) findViewById17;
                            if (m().M()) {
                                f3 = 17.0f;
                            }
                            textView10.setTextSize(1, f3);
                            ckf.f(findViewById17, "rootView.findViewById<Te…Mode) 17f else 15f)\n    }");
                            this.F = findViewById17;
                            View findViewById18 = p0().findViewById(R.id.rv_image);
                            ckf.f(findViewById18, "rootView.findViewById(R.id.rv_image)");
                            this.x = (RecyclerView) findViewById18;
                            this.n = lg4.O1(this.c);
                            RecyclerView recyclerView = this.x;
                            if (recyclerView != null) {
                                if (lg4.t()) {
                                    layoutManager = new CustomGridLayoutManager(this.c, this.n);
                                } else {
                                    layoutManager = new GridLayoutManager(this.c, this.n);
                                }
                                recyclerView.setLayoutManager(layoutManager);
                                RecyclerView recyclerView2 = this.x;
                                if (recyclerView2 != null) {
                                    recyclerView2.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.etao.feimagesearch.capture.dynamic.bottom.album.CaptureAlbumView$initViews$17
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        public static /* synthetic */ Object ipc$super(CaptureAlbumView$initViews$17 captureAlbumView$initViews$17, String str, Object... objArr) {
                                            str.hashCode();
                                            int hashCode = str.hashCode();
                                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/album/CaptureAlbumView$initViews$17");
                                        }

                                        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                                        public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView3, RecyclerView.State state) {
                                            IpChange ipChange2 = $ipChange;
                                            if (ipChange2 instanceof IpChange) {
                                                ipChange2.ipc$dispatch("84db4eca", new Object[]{this, rect, view2, recyclerView3, state});
                                                return;
                                            }
                                            ckf.g(rect, "outRect");
                                            ckf.g(view2, "view");
                                            ckf.g(recyclerView3, a.MSG_SOURCE_PARENT);
                                            ckf.g(state, "state");
                                            int childAdapterPosition = (recyclerView3.getChildAdapterPosition(view2) + 1) % CaptureAlbumView.P(CaptureAlbumView.this);
                                            if (childAdapterPosition == 0) {
                                                CaptureAlbumView.b bVar = CaptureAlbumView.Companion;
                                                rect.left = bVar.a() / 2;
                                                rect.bottom = bVar.a();
                                            } else if (childAdapterPosition != 1) {
                                                CaptureAlbumView.b bVar2 = CaptureAlbumView.Companion;
                                                rect.left = bVar2.a() / 2;
                                                rect.right = bVar2.a() / 2;
                                                rect.bottom = bVar2.a();
                                            } else {
                                                CaptureAlbumView.b bVar3 = CaptureAlbumView.Companion;
                                                rect.right = bVar3.a() / 2;
                                                rect.bottom = bVar3.a();
                                            }
                                        }
                                    });
                                    if (lg4.U3()) {
                                        RecyclerView recyclerView3 = this.x;
                                        if (recyclerView3 != null) {
                                            recyclerView3.setItemAnimator(null);
                                        } else {
                                            ckf.y("rvImage");
                                            throw null;
                                        }
                                    }
                                    if (m().g()) {
                                        agh.h("AutoSize__Bottom_CaptureAlbumView", ckf.p("enableVisibleAreaOpt ", Integer.valueOf(this.l)));
                                        b bVar = Companion;
                                        Activity activity = this.c;
                                        ckf.f(activity, "activity");
                                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, bVar.b(activity, this.n));
                                        RecyclerView recyclerView4 = this.x;
                                        if (recyclerView4 != null) {
                                            recyclerView4.setLayoutParams(layoutParams2);
                                        } else {
                                            ckf.y("rvImage");
                                            throw null;
                                        }
                                    }
                                    View findViewById19 = p0().findViewById(R.id.rv_folder);
                                    ckf.f(findViewById19, "rootView.findViewById(R.id.rv_folder)");
                                    RecyclerView recyclerView5 = (RecyclerView) findViewById19;
                                    this.y = recyclerView5;
                                    recyclerView5.setLayoutManager(new LinearLayoutManager(this.c, 1, false));
                                    return;
                                }
                                ckf.y("rvImage");
                                throw null;
                            }
                            ckf.y("rvImage");
                            throw null;
                        }
                        ckf.y("authAllHintContainer");
                        throw null;
                    }
                    ckf.y("tabViewHolders");
                    throw null;
                }
                ckf.y("tabViewHolders");
                throw null;
            }
            ckf.y("tabViewHolders");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    @Override // com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView.b
    public void d(int i2, int i3) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39d8911", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        if (i2 <= i3 / 2) {
            z = false;
        }
        x0(z);
        u0(i2, i3);
        if (i2 >= 0 && this.I) {
            C0(false);
        }
    }

    @Override // com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView.b
    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51db6da", new Object[]{this, new Boolean(z)});
        } else {
            this.M = z;
        }
    }

    /* renamed from: j0 */
    public d43 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d43) ipChange.ipc$dispatch("dd302681", new Object[]{this});
        }
        return new d43();
    }

    public final int l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1fe37bd", new Object[]{this})).intValue();
        }
        RecyclerView recyclerView = this.x;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                return ((GridLayoutManager) layoutManager).findFirstVisibleItemPosition();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
        }
        ckf.y("rvImage");
        throw null;
    }

    public final int m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6bf642d", new Object[]{this})).intValue();
        }
        RecyclerView recyclerView = this.x;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                return ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
        }
        ckf.y("rvImage");
        throw null;
    }

    public final zs9 n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zs9) ipChange.ipc$dispatch("d539bb9", new Object[]{this});
        }
        return this.K.S();
    }

    public final int o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89e8fc26", new Object[]{this})).intValue();
        }
        return this.G;
    }

    public final LinearLayout p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("9aee6d7b", new Object[]{this});
        }
        LinearLayout linearLayout = this.q;
        if (linearLayout != null) {
            return linearLayout;
        }
        ckf.y("rootView");
        throw null;
    }

    public final void r0(zs9 zs9Var, boolean z, boolean z2) {
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b77b4e", new Object[]{this, zs9Var, new Boolean(z), new Boolean(z2)});
            return;
        }
        ckf.g(zs9Var, "folderItem");
        E0(false);
        F0(false);
        x0(this.M);
        this.K.c0(z);
        this.K.a0(zs9Var, null, true);
        this.p = zs9Var;
        zs9Var.l(true);
        TextView textView = this.t;
        if (textView != null) {
            textView.setText(zs9Var.g());
            TextView textView2 = this.t;
            if (textView2 != null) {
                textView2.setVisibility(0);
                if (this.K.getItemCount() != 0) {
                    z3 = false;
                }
                B0(z3);
                if (z2) {
                    Toast.makeText(this.c, Localization.q(R.string.taobao_app_1007_1_18980), 0).show();
                    return;
                }
                return;
            }
            ckf.y("folderLabel");
            throw null;
        }
        ckf.y("folderLabel");
        throw null;
    }

    public final void s0(zs9 zs9Var) {
        boolean z;
        tj0 F;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908afd1c", new Object[]{this, zs9Var});
            return;
        }
        TextView textView = this.t;
        LinkedList<pei> linkedList = null;
        if (textView != null) {
            textView.setText(zs9Var.g());
            CaptureAlbumAdapter captureAlbumAdapter = this.K;
            d43 d43Var = (d43) this.f17536a;
            if (!(d43Var == null || (F = d43Var.F()) == null)) {
                linkedList = F.e();
            }
            captureAlbumAdapter.N(zs9Var, linkedList);
            if (this.K.getItemCount() == 0) {
                z = true;
            } else {
                z = false;
            }
            B0(z);
            zs9 zs9Var2 = this.p;
            if (zs9Var2 != null) {
                zs9Var2.l(false);
            }
            this.L.Q(this.p);
            zs9Var.l(true);
            this.L.Q(zs9Var);
            this.p = zs9Var;
            C0(false);
            return;
        }
        ckf.y("folderLabel");
        throw null;
    }

    public void w0(ViewGroup viewGroup, boolean z, boolean z2, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bb1cbcd", new Object[]{this, viewGroup, new Boolean(z), new Boolean(z2), new Integer(i2), new Integer(i3)});
            return;
        }
        ckf.g(viewGroup, "container");
        if (this.m != z) {
            this.m = z;
            this.M = z2;
            vpt.g("CaptureAlbumView_addView", new j(z, viewGroup, this, z2, i2, i3));
        }
    }

    public final void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c18532c", new Object[]{this});
            return;
        }
        this.K.reset();
        this.L.reset();
        this.G = -1;
        G0(0);
    }

    public final void z0(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da081b7", new Object[]{this, linearLayout});
            return;
        }
        ckf.g(linearLayout, "<set-?>");
        this.q = linearLayout;
    }

    public final void A0(boolean z) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb5625f", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.w;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            RecyclerView recyclerView = this.x;
            if (recyclerView != null) {
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    if (z) {
                        i2 = p1p.a(70.0f);
                    }
                    layoutParams2.bottomMargin = i2;
                    RecyclerView recyclerView2 = this.x;
                    if (recyclerView2 != null) {
                        recyclerView2.setLayoutParams(layoutParams2);
                    } else {
                        ckf.y("rvImage");
                        throw null;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            } else {
                ckf.y("rvImage");
                throw null;
            }
        } else {
            ckf.y("authAllHintContainer");
            throw null;
        }
    }

    public final void C0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5185caf1", new Object[]{this, new Boolean(z)});
            return;
        }
        this.I = z;
        d43 d43Var = (d43) this.f17536a;
        if (d43Var != null) {
            if (z) {
                TUrlImageView tUrlImageView = this.u;
                if (tUrlImageView != null) {
                    tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01526CrE1SSiaPc0Rhq_!!6000000002246-49-tps-42-25.webp");
                    jzu.i("Page_PhotoSearchTake", "ClickAlbumFolder", new String[0]);
                    this.L.P(d43Var.F().b());
                    View view = this.v;
                    if (view != null) {
                        view.setVisibility(8);
                        RecyclerView recyclerView = this.y;
                        if (recyclerView != null) {
                            recyclerView.setVisibility(0);
                            RecyclerView recyclerView2 = this.x;
                            if (recyclerView2 != null) {
                                recyclerView2.setVisibility(4);
                                View view2 = this.s;
                                if (view2 != null) {
                                    StringBuilder sb = new StringBuilder();
                                    TextView textView = this.t;
                                    if (textView != null) {
                                        sb.append((Object) textView.getText());
                                        sb.append((char) 65292);
                                        sb.append(Localization.q(R.string.taobao_app_1007_fold));
                                        sb.append((char) 65292);
                                        sb.append(Localization.q(R.string.taobao_app_1007_button));
                                        view2.setContentDescription(sb.toString());
                                        return;
                                    }
                                    ckf.y("folderLabel");
                                    throw null;
                                }
                                ckf.y("foldContainer");
                                throw null;
                            }
                            ckf.y("rvImage");
                            throw null;
                        }
                        ckf.y("rvFolder");
                        throw null;
                    }
                    ckf.y("tabContainer");
                    throw null;
                }
                ckf.y("folderStateIv");
                throw null;
            }
            TUrlImageView tUrlImageView2 = this.u;
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01WjFuHO1BvFnP1cxXx_!!6000000000007-49-tps-42-25.webp");
                View view3 = this.v;
                if (view3 != null) {
                    view3.setVisibility(0);
                    RecyclerView recyclerView3 = this.x;
                    if (recyclerView3 != null) {
                        recyclerView3.setVisibility(0);
                        RecyclerView recyclerView4 = this.y;
                        if (recyclerView4 != null) {
                            recyclerView4.setVisibility(8);
                            View view4 = this.s;
                            if (view4 != null) {
                                StringBuilder sb2 = new StringBuilder();
                                TextView textView2 = this.t;
                                if (textView2 != null) {
                                    sb2.append((Object) textView2.getText());
                                    sb2.append((char) 65292);
                                    sb2.append(Localization.q(R.string.taobao_app_1007_expand));
                                    sb2.append((char) 65292);
                                    sb2.append(Localization.q(R.string.taobao_app_1007_button));
                                    view4.setContentDescription(sb2.toString());
                                    return;
                                }
                                ckf.y("folderLabel");
                                throw null;
                            }
                            ckf.y("foldContainer");
                            throw null;
                        }
                        ckf.y("rvFolder");
                        throw null;
                    }
                    ckf.y("rvImage");
                    throw null;
                }
                ckf.y("tabContainer");
                throw null;
            }
            ckf.y("folderStateIv");
            throw null;
        }
    }

    public final void E0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26572dc0", new Object[]{this, new Boolean(z)});
        } else if (z) {
            View view = this.C;
            if (view != null) {
                if (view.getVisibility() == 0) {
                    mzu.q(s63.ALBUM_PAGE_NAME, "GoSettingExpose", new String[0]);
                }
                View view2 = this.A;
                if (view2 != null) {
                    view2.setVisibility(0);
                    View view3 = this.C;
                    if (view3 != null) {
                        view3.setVisibility(0);
                        View view4 = this.F;
                        if (view4 != null) {
                            view4.setVisibility(8);
                            TUrlImageView tUrlImageView = this.B;
                            if (tUrlImageView != null) {
                                tUrlImageView.setVisibility(0);
                                D0(this.N, this.O);
                                return;
                            }
                            ckf.y("permissionHintBg");
                            throw null;
                        }
                        ckf.y("emptyHintView");
                        throw null;
                    }
                    ckf.y("permissionHintContainer");
                    throw null;
                }
                ckf.y("hintContainer");
                throw null;
            }
            ckf.y("permissionHintContainer");
            throw null;
        } else {
            View view5 = this.A;
            if (view5 != null) {
                view5.setVisibility(8);
                TUrlImageView tUrlImageView2 = this.B;
                if (tUrlImageView2 != null) {
                    tUrlImageView2.setVisibility(8);
                    View view6 = this.C;
                    if (view6 != null) {
                        view6.setVisibility(8);
                    } else {
                        ckf.y("permissionHintContainer");
                        throw null;
                    }
                } else {
                    ckf.y("permissionHintBg");
                    throw null;
                }
            } else {
                ckf.y("hintContainer");
                throw null;
            }
        }
    }

    @Override // com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView.b
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25fbc59f", new Object[]{this})).booleanValue();
        }
        RecyclerView recyclerView = this.x;
        if (recyclerView == null) {
            ckf.y("rvImage");
            throw null;
        } else if (recyclerView.getVisibility() == 0) {
            RecyclerView recyclerView2 = this.x;
            if (recyclerView2 != null) {
                return true ^ recyclerView2.canScrollVertically(-1);
            }
            ckf.y("rvImage");
            throw null;
        } else {
            RecyclerView recyclerView3 = this.y;
            if (recyclerView3 == null) {
                ckf.y("rvFolder");
                throw null;
            } else if (recyclerView3.getVisibility() != 0) {
                return true;
            } else {
                RecyclerView recyclerView4 = this.y;
                if (recyclerView4 != null) {
                    return true ^ recyclerView4.canScrollVertically(-1);
                }
                ckf.y("rvFolder");
                throw null;
            }
        }
    }

    public final void q0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e20e6f1", new Object[]{this, new Integer(i2)});
        } else if (i2 > 0) {
            this.K.notifyItemRangeInserted(0, i2);
            if (l0() <= 4) {
                RecyclerView recyclerView = this.x;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(0);
                } else {
                    ckf.y("rvImage");
                    throw null;
                }
            }
        }
    }

    public void u0(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f9d2d0", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (this.N != i2) {
            this.O = i3;
            this.N = i2;
            D0(i2, i3);
            if (i2 > this.l && m().g() && !this.o) {
                this.o = true;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                RecyclerView recyclerView = this.x;
                if (recyclerView != null) {
                    recyclerView.setLayoutParams(layoutParams);
                } else {
                    ckf.y("rvImage");
                    throw null;
                }
            }
        }
    }

    public final void x0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa141a", new Object[]{this, new Boolean(z)});
        } else if (z) {
            View view = this.C;
            if (view == null) {
                ckf.y("permissionHintContainer");
                throw null;
            } else if (view.getVisibility() == 0) {
                View view2 = this.r;
                if (view2 == null) {
                    ckf.y("btnContainer");
                    throw null;
                } else if (view2.getVisibility() != 8) {
                    View view3 = this.r;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    } else {
                        ckf.y("btnContainer");
                        throw null;
                    }
                }
            } else {
                View view4 = this.r;
                if (view4 == null) {
                    ckf.y("btnContainer");
                    throw null;
                } else if (view4.getVisibility() != 0) {
                    View view5 = this.r;
                    if (view5 != null) {
                        view5.setVisibility(0);
                    } else {
                        ckf.y("btnContainer");
                        throw null;
                    }
                }
            }
        } else {
            View view6 = this.r;
            if (view6 == null) {
                ckf.y("btnContainer");
                throw null;
            } else if (view6.getVisibility() != 8) {
                View view7 = this.r;
                if (view7 != null) {
                    view7.setVisibility(8);
                } else {
                    ckf.y("btnContainer");
                    throw null;
                }
            }
        }
    }

    public final void t0(zs9 zs9Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d08107f", new Object[]{this, zs9Var});
            return;
        }
        ckf.g(zs9Var, "folderItem");
        boolean a0 = this.K.a0(zs9Var, null, false);
        p7m.a("AlbumUpdate", ckf.p("onAlbumFolderItemsUpdate: ", Boolean.valueOf(a0)));
        if (a0) {
            if (this.K.getItemCount() == 0) {
                z = true;
            }
            B0(z);
            int l0 = l0() + (this.K.X() ? 1 : 0);
            this.K.notifyItemRangeChanged(l0, ((m0() + (this.K.X() ? 1 : 0)) - l0) + 1);
        }
    }

    public final void v0(List<pei> list) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16bb079e", new Object[]{this, list});
            return;
        }
        List<pei> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            boolean O = this.K.O(list);
            p7m.a("AlbumUpdate", ckf.p("onScreenShotsFullUpdate: ", Boolean.valueOf(O)));
            if (O) {
                if (this.K.getItemCount() == 0) {
                    z = true;
                }
                B0(z);
                int l0 = l0();
                this.K.notifyItemRangeChanged(l0, (m0() - l0) + 1);
            }
        }
    }

    public final void D0(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98ad0ed", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        View view = this.A;
        if (view == null) {
            ckf.y("hintContainer");
            throw null;
        } else if (view.getVisibility() == 0) {
            if (i2 > i3 / 3) {
                View view2 = this.D;
                if (view2 != null) {
                    if (view2.getVisibility() != 8) {
                        View view3 = this.D;
                        if (view3 != null) {
                            view3.setVisibility(8);
                            TUrlImageView tUrlImageView = this.B;
                            if (tUrlImageView != null) {
                                tUrlImageView.setVisibility(8);
                            } else {
                                ckf.y("permissionHintBg");
                                throw null;
                            }
                        } else {
                            ckf.y("permissionHintView");
                            throw null;
                        }
                    }
                    View view4 = this.E;
                    if (view4 == null) {
                        ckf.y("permissionHintFullView");
                        throw null;
                    } else if (view4.getVisibility() != 0) {
                        View view5 = this.E;
                        if (view5 != null) {
                            view5.setVisibility(0);
                        } else {
                            ckf.y("permissionHintFullView");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("permissionHintView");
                    throw null;
                }
            } else {
                View view6 = this.D;
                if (view6 != null) {
                    if (view6.getVisibility() != 0) {
                        View view7 = this.D;
                        if (view7 != null) {
                            view7.setVisibility(0);
                            TUrlImageView tUrlImageView2 = this.B;
                            if (tUrlImageView2 != null) {
                                tUrlImageView2.setVisibility(0);
                            } else {
                                ckf.y("permissionHintBg");
                                throw null;
                            }
                        } else {
                            ckf.y("permissionHintView");
                            throw null;
                        }
                    }
                    View view8 = this.E;
                    if (view8 == null) {
                        ckf.y("permissionHintFullView");
                        throw null;
                    } else if (view8.getVisibility() != 8) {
                        View view9 = this.E;
                        if (view9 != null) {
                            view9.setVisibility(8);
                        } else {
                            ckf.y("permissionHintFullView");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("permissionHintView");
                    throw null;
                }
            }
            View view10 = this.D;
            if (view10 != null) {
                float f2 = 1.0f;
                if (view10.getVisibility() == 0) {
                    View view11 = this.D;
                    if (view11 != null) {
                        ViewGroup.LayoutParams layoutParams = view11.getLayoutParams();
                        if (layoutParams != null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                            layoutParams2.topMargin = ((i2 - p1p.a(30.0f)) - CaptureBottomAreaView.Companion.c()) / 2;
                            View view12 = this.D;
                            if (view12 != null) {
                                view12.setLayoutParams(layoutParams2);
                                float f3 = (300 - (i2 - this.l)) / 100.0f;
                                if (f3 < 0.0f) {
                                    f3 = 0.0f;
                                } else if (f3 > 1.0f) {
                                    f3 = 1.0f;
                                }
                                View view13 = this.D;
                                if (view13 != null) {
                                    view13.setAlpha(f3);
                                } else {
                                    ckf.y("permissionHintView");
                                    throw null;
                                }
                            } else {
                                ckf.y("permissionHintView");
                                throw null;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                    } else {
                        ckf.y("permissionHintView");
                        throw null;
                    }
                }
                TUrlImageView tUrlImageView3 = this.B;
                if (tUrlImageView3 != null) {
                    if (tUrlImageView3.getVisibility() == 0) {
                        float f4 = (100 - (i2 - this.l)) / 100.0f;
                        if (f4 < 0.0f) {
                            f2 = 0.0f;
                        } else if (f4 <= 1.0f) {
                            f2 = f4;
                        }
                        TUrlImageView tUrlImageView4 = this.B;
                        if (tUrlImageView4 != null) {
                            tUrlImageView4.setAlpha(f2);
                        } else {
                            ckf.y("permissionHintBg");
                            throw null;
                        }
                    }
                    View view14 = this.E;
                    if (view14 != null) {
                        if (view14.getVisibility() == 0) {
                            View view15 = this.E;
                            if (view15 != null) {
                                ViewGroup.LayoutParams layoutParams3 = view15.getLayoutParams();
                                if (layoutParams3 != null) {
                                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                    layoutParams4.topMargin = ((i2 - CaptureBottomAreaView.Companion.c()) / 2) - p1p.a(170.0f);
                                    View view16 = this.E;
                                    if (view16 != null) {
                                        view16.setLayoutParams(layoutParams4);
                                    } else {
                                        ckf.y("permissionHintFullView");
                                        throw null;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                }
                            } else {
                                ckf.y("permissionHintFullView");
                                throw null;
                            }
                        }
                        View view17 = this.F;
                        if (view17 == null) {
                            ckf.y("emptyHintView");
                            throw null;
                        } else if (view17.getVisibility() == 0) {
                            View view18 = this.F;
                            if (view18 != null) {
                                ViewGroup.LayoutParams layoutParams5 = view18.getLayoutParams();
                                if (layoutParams5 != null) {
                                    FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                                    layoutParams6.topMargin = ((i2 - p1p.a(48.0f)) - CaptureBottomAreaView.Companion.c()) / 2;
                                    View view19 = this.F;
                                    if (view19 != null) {
                                        view19.setLayoutParams(layoutParams6);
                                    } else {
                                        ckf.y("emptyHintView");
                                        throw null;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                }
                            } else {
                                ckf.y("emptyHintView");
                                throw null;
                            }
                        }
                    } else {
                        ckf.y("permissionHintFullView");
                        throw null;
                    }
                } else {
                    ckf.y("permissionHintBg");
                    throw null;
                }
            } else {
                ckf.y("permissionHintView");
                throw null;
            }
        }
    }
}
