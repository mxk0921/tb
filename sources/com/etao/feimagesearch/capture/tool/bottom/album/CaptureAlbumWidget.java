package com.etao.feimagesearch.capture.tool.bottom.album;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
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
import com.etao.feimagesearch.capture.dynamic.bottom.album.CaptureAlbumAdapter;
import com.etao.feimagesearch.capture.dynamic.bottom.album.CaptureAlbumFolderAdapter;
import com.etao.feimagesearch.capture.dynamic.bottom.album.CaptureAlbumView;
import com.etao.feimagesearch.capture.tool.base.CaptureManager;
import com.etao.feimagesearch.capture.tool.base.CaptureRainbowManager;
import com.etao.feimagesearch.ui.CustomGridLayoutManager;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.agh;
import tb.b43;
import tb.caa;
import tb.ckf;
import tb.d22;
import tb.gib;
import tb.jzu;
import tb.lg4;
import tb.lz1;
import tb.mhi;
import tb.mzu;
import tb.njg;
import tb.p1p;
import tb.p73;
import tb.p7m;
import tb.pei;
import tb.s63;
import tb.t2o;
import tb.txh;
import tb.u1a;
import tb.xfw;
import tb.xhv;
import tb.zs9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureAlbumWidget extends txh<LinearLayout, CaptureAlbumWidget, lz1<CaptureAlbumWidget>, CaptureManager, b43> implements gib {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int R = p1p.a(1.0f);
    public static final int TAB_TYPE_ALL = 0;
    public static final int TAB_TYPE_SCREEN_SHOT = 2;
    public static final int TAB_TYPE_VIDEO = 1;
    public static final String TAG = "AutoSize__Bottom_CaptureAlbumView";
    public static final String TAG_PREFIX = "AutoSize__Bottom_Album_";
    public TUrlImageView A;
    public View B;
    public View C;
    public View D;
    public View E;
    public final int F;
    public volatile boolean G;
    public volatile int H = -1;
    public List<TextView> I;
    public volatile boolean J;
    public zs9 K;
    public final d22 L;
    public final njg M;
    public final njg N;
    public volatile boolean O;
    public volatile int P;
    public volatile int Q;
    public volatile boolean m;
    public volatile CaptureManager n;
    public final u1a<? super pei, ? super Boolean, xhv> o;
    public final int p;
    public View q;
    public View r;
    public TextView s;
    public TUrlImageView t;
    public View u;
    public View v;
    public RecyclerView w;
    public RecyclerView x;
    public View y;
    public View z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296777);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("85978d0a", new Object[]{this})).intValue();
            }
            return CaptureAlbumWidget.l0();
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

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                CaptureAlbumWidget.H0(CaptureAlbumWidget.this, 0);
            }
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
            ((b43) CaptureAlbumWidget.this.i0()).V();
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
            ((b43) CaptureAlbumWidget.this.i0()).V();
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
            CaptureAlbumWidget captureAlbumWidget = CaptureAlbumWidget.this;
            CaptureAlbumWidget.D0(captureAlbumWidget, true ^ CaptureAlbumWidget.z0(captureAlbumWidget));
            if (CaptureAlbumWidget.z0(CaptureAlbumWidget.this)) {
                mzu.g(s63.ALBUM_PAGE_NAME, "ClickAlbum");
            }
            CaptureAlbumWidget captureAlbumWidget2 = CaptureAlbumWidget.this;
            CaptureAlbumWidget.F0(captureAlbumWidget2, CaptureAlbumWidget.z0(captureAlbumWidget2));
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
            CaptureAlbumWidget.H0(CaptureAlbumWidget.this, 0);
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
            CaptureAlbumWidget.H0(CaptureAlbumWidget.this, 1);
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
            CaptureAlbumWidget.H0(CaptureAlbumWidget.this, 2);
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
            b43 b43Var = (b43) CaptureAlbumWidget.this.i0();
            if (b43Var != null) {
                b43Var.W();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f4700a;
        public final /* synthetic */ CaptureAlbumWidget b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public j(boolean z, CaptureAlbumWidget captureAlbumWidget, boolean z2, int i, int i2) {
            this.f4700a = z;
            this.b = captureAlbumWidget;
            this.c = z2;
            this.d = i;
            this.e = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f4700a) {
                CaptureAlbumWidget.B0(this.b, this.c);
            }
            this.b.V0(this.d, this.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public k(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View s0 = CaptureAlbumWidget.s0(CaptureAlbumWidget.this);
            if (s0 != null) {
                s0.setVisibility(this.b ? 0 : 8);
                View p0 = CaptureAlbumWidget.p0(CaptureAlbumWidget.this);
                if (p0 != null) {
                    if (!this.b) {
                        i = 8;
                    }
                    p0.setVisibility(i);
                    if (this.b) {
                        CaptureAlbumWidget captureAlbumWidget = CaptureAlbumWidget.this;
                        CaptureAlbumWidget.G0(captureAlbumWidget, CaptureAlbumWidget.v0(captureAlbumWidget), CaptureAlbumWidget.u0(CaptureAlbumWidget.this));
                        return;
                    }
                    return;
                }
                ckf.y("emptyHintView");
                throw null;
            }
            ckf.y("hintContainer");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public l(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View w0 = CaptureAlbumWidget.w0(CaptureAlbumWidget.this);
            if (w0 != null) {
                if (!this.b) {
                    i = 8;
                }
                w0.setVisibility(i);
                return;
            }
            ckf.y("progressView");
            throw null;
        }
    }

    static {
        t2o.a(481296776);
        t2o.a(481296770);
    }

    public static final /* synthetic */ boolean A0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb9cb00b", new Object[]{captureAlbumWidget})).booleanValue();
        }
        return captureAlbumWidget.O;
    }

    public static final /* synthetic */ void B0(CaptureAlbumWidget captureAlbumWidget, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fee175f", new Object[]{captureAlbumWidget, new Boolean(z)});
        } else {
            captureAlbumWidget.X0(z);
        }
    }

    public static final /* synthetic */ void C0(CaptureAlbumWidget captureAlbumWidget, zs9 zs9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db255698", new Object[]{captureAlbumWidget, zs9Var});
        } else {
            captureAlbumWidget.K = zs9Var;
        }
    }

    public static final /* synthetic */ void D0(CaptureAlbumWidget captureAlbumWidget, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88efa5c3", new Object[]{captureAlbumWidget, new Boolean(z)});
        } else {
            captureAlbumWidget.J = z;
        }
    }

    public static final /* synthetic */ void E0(CaptureAlbumWidget captureAlbumWidget, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb77ff4", new Object[]{captureAlbumWidget, new Boolean(z)});
        } else {
            captureAlbumWidget.a1(z);
        }
    }

    public static final /* synthetic */ void F0(CaptureAlbumWidget captureAlbumWidget, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8736e8", new Object[]{captureAlbumWidget, new Boolean(z)});
        } else {
            captureAlbumWidget.b1(z);
        }
    }

    public static final /* synthetic */ void G0(CaptureAlbumWidget captureAlbumWidget, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c2a5002", new Object[]{captureAlbumWidget, new Integer(i2), new Integer(i3)});
        } else {
            captureAlbumWidget.c1(i2, i3);
        }
    }

    public static final /* synthetic */ void H0(CaptureAlbumWidget captureAlbumWidget, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce48a80", new Object[]{captureAlbumWidget, new Integer(i2)});
        } else {
            captureAlbumWidget.f1(i2);
        }
    }

    public static /* synthetic */ Object ipc$super(CaptureAlbumWidget captureAlbumWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1083424568) {
            super.K();
            return null;
        } else if (hashCode == 1250151579) {
            super.G();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/capture/tool/bottom/album/CaptureAlbumWidget");
        }
    }

    public static final /* synthetic */ CaptureAlbumAdapter k0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureAlbumAdapter) ipChange.ipc$dispatch("c00337b9", new Object[]{captureAlbumWidget});
        }
        return captureAlbumWidget.J0();
    }

    public static final /* synthetic */ int l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34d44c3b", new Object[0])).intValue();
        }
        return R;
    }

    public static final /* synthetic */ int m0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("833e59a3", new Object[]{captureAlbumWidget})).intValue();
        }
        return captureAlbumWidget.F;
    }

    public static final /* synthetic */ zs9 n0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zs9) ipChange.ipc$dispatch("6e045be6", new Object[]{captureAlbumWidget});
        }
        return captureAlbumWidget.K;
    }

    public static final /* synthetic */ int o0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b4d1d2a", new Object[]{captureAlbumWidget})).intValue();
        }
        return captureAlbumWidget.H;
    }

    public static final /* synthetic */ View p0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7fbe037b", new Object[]{captureAlbumWidget});
        }
        return captureAlbumWidget.E;
    }

    public static final /* synthetic */ CaptureAlbumFolderAdapter q0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureAlbumFolderAdapter) ipChange.ipc$dispatch("8a18cb72", new Object[]{captureAlbumWidget});
        }
        return captureAlbumWidget.P0();
    }

    public static final /* synthetic */ TextView r0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("e73eea60", new Object[]{captureAlbumWidget});
        }
        return captureAlbumWidget.s;
    }

    public static final /* synthetic */ View s0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ceeaf9a", new Object[]{captureAlbumWidget});
        }
        return captureAlbumWidget.z;
    }

    public static final /* synthetic */ u1a t0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("fb6227b", new Object[]{captureAlbumWidget});
        }
        return captureAlbumWidget.o;
    }

    public static final /* synthetic */ int u0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48601ff4", new Object[]{captureAlbumWidget})).intValue();
        }
        return captureAlbumWidget.Q;
    }

    public static final /* synthetic */ int v0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9b6ac1b", new Object[]{captureAlbumWidget})).intValue();
        }
        return captureAlbumWidget.P;
    }

    public static final /* synthetic */ View w0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1252bdb6", new Object[]{captureAlbumWidget});
        }
        return captureAlbumWidget.y;
    }

    public static final /* synthetic */ List x0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9b61a0ae", new Object[]{captureAlbumWidget});
        }
        return captureAlbumWidget.I;
    }

    public static final /* synthetic */ d22 y0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d22) ipChange.ipc$dispatch("7a7c9b3c", new Object[]{captureAlbumWidget});
        }
        return captureAlbumWidget.L;
    }

    public static final /* synthetic */ boolean z0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32eb3ced", new Object[]{captureAlbumWidget})).booleanValue();
        }
        return captureAlbumWidget.J;
    }

    @Override // tb.txh, com.etao.feimagesearch.struct.ViewWidget, tb.vz
    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a83cc9b", new Object[]{this});
            return;
        }
        super.G();
        e0(new b());
    }

    /* renamed from: I0 */
    public b43 h0(CaptureAlbumWidget captureAlbumWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b43) ipChange.ipc$dispatch("f968c1af", new Object[]{this, captureAlbumWidget});
        }
        ckf.g(captureAlbumWidget, "widget");
        return new b43(captureAlbumWidget);
    }

    public final CaptureAlbumAdapter J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureAlbumAdapter) ipChange.ipc$dispatch("54d0f684", new Object[]{this});
        }
        return (CaptureAlbumAdapter) this.M.getValue();
    }

    @Override // tb.txh, tb.vz
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4093bf38", new Object[]{this});
            return;
        }
        super.K();
        this.L.onDestroy();
        agh.r("PltCameraPai", "AutoSize__Bottom_CaptureAlbumView", ckf.p("hitCache ", Integer.valueOf(J0().T())));
        mzu.n(p73.f25916a, "hitAlbumViewCache", 19999, "count", String.valueOf(J0().T()));
    }

    public final CaptureManager K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureManager) ipChange.ipc$dispatch("5165d96f", new Object[]{this});
        }
        return this.n;
    }

    public final int L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1fe37bd", new Object[]{this})).intValue();
        }
        RecyclerView recyclerView = this.w;
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

    public final int M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6bf642d", new Object[]{this})).intValue();
        }
        RecyclerView recyclerView = this.w;
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

    public final zs9 N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zs9) ipChange.ipc$dispatch("d539bb9", new Object[]{this});
        }
        return J0().S();
    }

    public final int O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89e8fc26", new Object[]{this})).intValue();
        }
        return this.H;
    }

    public final CaptureAlbumFolderAdapter P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureAlbumFolderAdapter) ipChange.ipc$dispatch("30a602c7", new Object[]{this});
        }
        return (CaptureAlbumFolderAdapter) this.N.getValue();
    }

    public final boolean Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e10d7657", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public final void S0(zs9 zs9Var, boolean z, boolean z2) {
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b77b4e", new Object[]{this, zs9Var, new Boolean(z), new Boolean(z2)});
            return;
        }
        ckf.g(zs9Var, "folderItem");
        d1(false);
        e1(false);
        X0(this.O);
        J0().c0(z);
        J0().a0(zs9Var, null, true);
        this.K = zs9Var;
        zs9Var.l(true);
        TextView textView = this.s;
        if (textView != null) {
            textView.setText(zs9Var.g());
            TextView textView2 = this.s;
            if (textView2 != null) {
                textView2.setVisibility(0);
                if (J0().getItemCount() != 0) {
                    z3 = false;
                }
                a1(z3);
                if (z2) {
                    Toast.makeText(E(), Localization.q(R.string.taobao_app_1007_1_18980), 0).show();
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

    /* renamed from: U0 */
    public LinearLayout b0() {
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("887bc65e", new Object[]{this});
        }
        View inflate = LayoutInflater.from(E()).inflate(R.layout.feis_view_capture_album, (ViewGroup) null, false);
        if (inflate != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            View findViewById = linearLayout.getRootView().findViewById(R.id.fl_btn_container);
            findViewById.setVisibility(8);
            xhv xhvVar = xhv.INSTANCE;
            this.q = findViewById;
            View findViewById2 = linearLayout.getRootView().findViewById(R.id.ll_folder);
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
            this.r = findViewById2;
            View findViewById3 = linearLayout.getRootView().findViewById(R.id.folder_label);
            TextView textView = (TextView) findViewById3;
            CaptureRainbowManager.a aVar = CaptureRainbowManager.Companion;
            textView.setTextSize(1, aVar.a().d() ? 18.0f : 15.0f);
            ckf.f(findViewById3, "rootView.findViewById<Te…lse 15f\n        )\n      }");
            this.s = (TextView) findViewById3;
            View findViewById4 = linearLayout.getRootView().findViewById(R.id.iv_fold_state);
            ckf.f(findViewById4, "rootView.findViewById(R.id.iv_fold_state)");
            TUrlImageView tUrlImageView = (TUrlImageView) findViewById4;
            this.t = tUrlImageView;
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01WjFuHO1BvFnP1cxXx_!!6000000000007-49-tps-42-25.webp");
            View findViewById5 = linearLayout.getRootView().findViewById(R.id.fl_tab_container);
            ckf.f(findViewById5, "rootView.findViewById(R.id.fl_tab_container)");
            this.u = findViewById5;
            this.I = new ArrayList();
            View findViewById6 = linearLayout.getRootView().findViewById(R.id.tv_tab_all);
            TextView textView2 = (TextView) findViewById6;
            textView2.setTextSize(1, aVar.a().d() ? 18.0f : 15.0f);
            textView2.setOnClickListener(new f());
            textView2.setContentDescription(Localization.q(R.string.taobao_app_1007_all) + (char) 65292 + Localization.q(i2));
            List<TextView> list = this.I;
            if (list != null) {
                ((ArrayList) list).add(textView2);
                ckf.f(findViewById6, "rootView.findViewById<Te…Holders.add(this)\n      }");
                TextView textView3 = (TextView) findViewById6;
                View findViewById7 = linearLayout.getRootView().findViewById(R.id.tv_tab_video);
                TextView textView4 = (TextView) findViewById7;
                textView4.setVisibility(8);
                textView4.setTextSize(1, aVar.a().d() ? 18.0f : 15.0f);
                textView4.setOnClickListener(new g());
                textView4.setContentDescription(Localization.q(R.string.taobao_app_1007_item_video) + (char) 65292 + Localization.q(i2));
                List<TextView> list2 = this.I;
                if (list2 != null) {
                    ((ArrayList) list2).add(textView4);
                    ckf.f(findViewById7, "rootView.findViewById<Te…Holders.add(this)\n      }");
                    TextView textView5 = (TextView) findViewById7;
                    View findViewById8 = linearLayout.getRootView().findViewById(R.id.tv_tab_screenshot);
                    TextView textView6 = (TextView) findViewById8;
                    textView6.setTextSize(1, aVar.a().d() ? 18.0f : 15.0f);
                    textView6.setOnClickListener(new h());
                    textView6.setContentDescription(Localization.q(R.string.taobao_app_1007_1_18944) + (char) 65292 + Localization.q(i2));
                    List<TextView> list3 = this.I;
                    if (list3 != null) {
                        ((ArrayList) list3).add(textView6);
                        ckf.f(findViewById8, "rootView.findViewById<Te…Holders.add(this)\n      }");
                        TextView textView7 = (TextView) findViewById8;
                        View findViewById9 = linearLayout.getRootView().findViewById(R.id.ll_auth_all_container);
                        ckf.f(findViewById9, "rootView.findViewById(R.id.ll_auth_all_container)");
                        this.v = findViewById9;
                        ViewProxy.setOnClickListener(findViewById9, new i());
                        View view = this.v;
                        if (view != null) {
                            GradientDrawable gradientDrawable2 = new GradientDrawable();
                            gradientDrawable2.setShape(0);
                            float f2 = 12.0f;
                            float b2 = p1p.b(12.0f);
                            gradientDrawable2.setCornerRadii(new float[]{b2, b2, b2, b2, 0.0f, 0.0f, 0.0f, 0.0f});
                            gradientDrawable2.setColor(Color.parseColor("#1F1F1F"));
                            view.setBackground(gradientDrawable2);
                            ((TextView) linearLayout.getRootView().findViewById(R.id.tv_auth_hint)).setTextSize(1, aVar.a().d() ? 15.0f : 12.0f);
                            TextView textView8 = (TextView) linearLayout.getRootView().findViewById(R.id.btn_auth_all);
                            GradientDrawable gradientDrawable3 = new GradientDrawable();
                            gradientDrawable3.setShape(0);
                            gradientDrawable3.setCornerRadius(p1p.b(12.0f));
                            gradientDrawable3.setColor(Color.parseColor("#99888888"));
                            textView8.setBackground(gradientDrawable3);
                            if (aVar.a().d()) {
                                f2 = 15.0f;
                            }
                            textView8.setTextSize(1, f2);
                            View findViewById10 = linearLayout.getRootView().findViewById(R.id.fl_album_container);
                            ckf.f(findViewById10, "rootView.findViewById(R.id.fl_album_container)");
                            FrameLayout frameLayout = (FrameLayout) findViewById10;
                            View findViewById11 = linearLayout.getRootView().findViewById(R.id.fl_progress);
                            ckf.f(findViewById11, "rootView.findViewById(R.id.fl_progress)");
                            this.y = findViewById11;
                            View findViewById12 = linearLayout.getRootView().findViewById(R.id.fl_hint_container);
                            ckf.f(findViewById12, "rootView.findViewById(R.id.fl_hint_container)");
                            this.z = findViewById12;
                            View findViewById13 = linearLayout.getRootView().findViewById(R.id.iv_permission_hint_bg);
                            ckf.f(findViewById13, "rootView.findViewById(R.id.iv_permission_hint_bg)");
                            TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById13;
                            this.A = tUrlImageView2;
                            tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01qikYpk1N6Ct7qHaaE_!!6000000001520-2-tps-1500-372.png");
                            View findViewById14 = linearLayout.getRootView().findViewById(R.id.fl_permission_hint_container);
                            ckf.f(findViewById14, "rootView.findViewById(R.…ermission_hint_container)");
                            this.B = findViewById14;
                            View findViewById15 = linearLayout.getRootView().findViewById(R.id.fl_permission_hint);
                            ckf.f(findViewById15, "rootView.findViewById(R.id.fl_permission_hint)");
                            this.C = findViewById15;
                            ((TUrlImageView) linearLayout.getRootView().findViewById(R.id.iv_permission_hint)).setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01fH5ATq1BsVGSvI8fC_!!6000000000001-2-tps-108-92.png");
                            ((TextView) linearLayout.getRootView().findViewById(R.id.tv_permission_hint)).setTextSize(1, aVar.a().d() ? 17.0f : 15.0f);
                            TextView textView9 = (TextView) linearLayout.getRootView().findViewById(R.id.btn_permission);
                            GradientDrawable gradientDrawable4 = new GradientDrawable();
                            gradientDrawable4.setShape(0);
                            gradientDrawable4.setCornerRadius(p1p.b(17.0f));
                            gradientDrawable4.setColor(Color.parseColor("#FFFFFF"));
                            textView9.setBackground(gradientDrawable4);
                            textView9.setOnClickListener(new c());
                            textView9.setTextSize(1, aVar.a().d() ? 17.0f : 15.0f);
                            View findViewById16 = linearLayout.getRootView().findViewById(R.id.fl_permission_hint_full);
                            ckf.f(findViewById16, "rootView.findViewById(R.….fl_permission_hint_full)");
                            this.D = findViewById16;
                            ((TextView) linearLayout.getRootView().findViewById(R.id.tv_permission_hint_top)).setTextSize(1, aVar.a().d() ? 21.0f : 17.0f);
                            ((TextView) linearLayout.getRootView().findViewById(R.id.tv_permission_hint_bottom)).setTextSize(1, aVar.a().d() ? 17.0f : 15.0f);
                            ((TUrlImageView) linearLayout.getRootView().findViewById(R.id.iv_permission_hint_full)).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN019KpKir1rMdZRTCbiZ_!!6000000005617-2-tps-180-164.png");
                            TextView textView10 = (TextView) linearLayout.getRootView().findViewById(R.id.btn_permission_full);
                            GradientDrawable gradientDrawable5 = new GradientDrawable();
                            gradientDrawable5.setShape(0);
                            gradientDrawable5.setCornerRadius(p1p.b(17.0f));
                            gradientDrawable5.setColor(Color.parseColor("#FFFFFF"));
                            textView10.setBackground(gradientDrawable5);
                            textView10.setTextSize(1, aVar.a().d() ? 17.0f : 15.0f);
                            textView10.setOnClickListener(new d());
                            ViewGroup.LayoutParams layoutParams = textView10.getLayoutParams();
                            layoutParams.height = p1p.a(aVar.a().d() ? 35.0f : 28.0f);
                            textView10.setLayoutParams(layoutParams);
                            View findViewById17 = linearLayout.getRootView().findViewById(R.id.tv_empty_hint);
                            ((TextView) findViewById17).setTextSize(1, aVar.a().d() ? 17.0f : 15.0f);
                            ckf.f(findViewById17, "rootView.findViewById<Te…lse 15f\n        )\n      }");
                            this.E = findViewById17;
                            View findViewById18 = linearLayout.getRootView().findViewById(R.id.rv_image);
                            ckf.f(findViewById18, "rootView.findViewById(R.id.rv_image)");
                            RecyclerView recyclerView = (RecyclerView) findViewById18;
                            this.w = recyclerView;
                            if (lg4.t()) {
                                layoutManager = new CustomGridLayoutManager(E(), this.F);
                            } else {
                                layoutManager = new GridLayoutManager(E(), this.F);
                            }
                            recyclerView.setLayoutManager(layoutManager);
                            RecyclerView recyclerView2 = this.w;
                            if (recyclerView2 != null) {
                                recyclerView2.setAdapter(J0());
                                RecyclerView recyclerView3 = this.w;
                                if (recyclerView3 != null) {
                                    recyclerView3.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.etao.feimagesearch.capture.tool.bottom.album.CaptureAlbumWidget$onCreateView$root$1$17
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        public static /* synthetic */ Object ipc$super(CaptureAlbumWidget$onCreateView$root$1$17 captureAlbumWidget$onCreateView$root$1$17, String str, Object... objArr) {
                                            str.hashCode();
                                            int hashCode = str.hashCode();
                                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/bottom/album/CaptureAlbumWidget$onCreateView$root$1$17");
                                        }

                                        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                                        public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView4, RecyclerView.State state) {
                                            IpChange ipChange2 = $ipChange;
                                            if (ipChange2 instanceof IpChange) {
                                                ipChange2.ipc$dispatch("84db4eca", new Object[]{this, rect, view2, recyclerView4, state});
                                                return;
                                            }
                                            ckf.g(rect, "outRect");
                                            ckf.g(view2, "view");
                                            ckf.g(recyclerView4, a.MSG_SOURCE_PARENT);
                                            ckf.g(state, "state");
                                            int childAdapterPosition = (recyclerView4.getChildAdapterPosition(view2) + 1) % CaptureAlbumWidget.m0(CaptureAlbumWidget.this);
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
                                        RecyclerView recyclerView4 = this.w;
                                        if (recyclerView4 != null) {
                                            recyclerView4.setItemAnimator(null);
                                        } else {
                                            ckf.y("rvImage");
                                            throw null;
                                        }
                                    }
                                    agh.h("AutoSize__Bottom_CaptureAlbumView", ckf.p("enableVisibleAreaOpt ", Integer.valueOf(this.p)));
                                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, Companion.b(E(), this.F));
                                    RecyclerView recyclerView5 = this.w;
                                    if (recyclerView5 != null) {
                                        recyclerView5.setLayoutParams(layoutParams2);
                                        View findViewById19 = linearLayout.getRootView().findViewById(R.id.rv_folder);
                                        ckf.f(findViewById19, "rootView.findViewById(R.id.rv_folder)");
                                        RecyclerView recyclerView6 = (RecyclerView) findViewById19;
                                        this.x = recyclerView6;
                                        recyclerView6.setLayoutManager(new LinearLayoutManager(E(), 1, false));
                                        RecyclerView recyclerView7 = this.x;
                                        if (recyclerView7 != null) {
                                            recyclerView7.setAdapter(P0());
                                            return linearLayout;
                                        }
                                        ckf.y("rvFolder");
                                        throw null;
                                    }
                                    ckf.y("rvImage");
                                    throw null;
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

    public final void Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c18532c", new Object[]{this});
            return;
        }
        J0().reset();
        P0().reset();
        this.H = -1;
        f1(0);
    }

    public final void a1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2f60e5", new Object[]{this, new Boolean(z)});
        } else {
            e0(new k(z));
        }
    }

    @Override // tb.gib
    public void d(int i2, int i3) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39d8911", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (a0()) {
            if (i2 <= i3 / 2) {
                z = false;
            }
            X0(z);
            V0(i2, i3);
            if (i2 >= 0 && this.J) {
                b1(false);
            }
        }
    }

    public final void e1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53bed77", new Object[]{this, new Boolean(z)});
        } else {
            e0(new l(z));
        }
    }

    public final void f1(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60841897", new Object[]{this, new Integer(i2)});
        } else if (this.H != i2) {
            g1(this.H, false);
            this.H = i2;
            g1(this.H, true);
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51db6da", new Object[]{this, new Boolean(z)});
        } else {
            this.O = z;
        }
    }

    public final void g1(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603c2738", new Object[]{this, new Integer(i2), new Boolean(z)});
        } else {
            e0(new m(i2, this, z));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return X();
    }

    public void t(boolean z, boolean z2, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a583810e", new Object[]{this, new Boolean(z), new Boolean(z2), new Integer(i2), new Integer(i3)});
            return;
        }
        f0(z);
        this.O = z2;
        e0(new j(z, this, z2, i2, i3));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class m implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f4703a;
        public final /* synthetic */ CaptureAlbumWidget b;
        public final /* synthetic */ boolean c;

        public m(int i, CaptureAlbumWidget captureAlbumWidget, boolean z) {
            this.f4703a = i;
            this.b = captureAlbumWidget;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int i = this.f4703a;
            if (i >= 0) {
                List x0 = CaptureAlbumWidget.x0(this.b);
                if (x0 == null) {
                    ckf.y("tabViewHolders");
                    throw null;
                } else if (i < x0.size()) {
                    List x02 = CaptureAlbumWidget.x0(this.b);
                    if (x02 != null) {
                        TextView textView = (TextView) x02.get(this.f4703a);
                        if (this.c) {
                            textView.setTextColor(Color.parseColor("#FFFFFF"));
                            textView.setTypeface(Typeface.DEFAULT_BOLD);
                            CaptureAlbumWidget.k0(this.b).d0(this.f4703a);
                            CaptureAlbumWidget captureAlbumWidget = this.b;
                            if (CaptureAlbumWidget.k0(captureAlbumWidget).P(this.f4703a) == 0) {
                                z = true;
                            }
                            CaptureAlbumWidget.E0(captureAlbumWidget, z);
                            textView.setContentDescription(((Object) textView.getText()) + (char) 65292 + Localization.q(R.string.taobao_app_1007_selected) + (char) 65292 + Localization.q(R.string.taobao_app_1007_button));
                            return;
                        }
                        textView.setTypeface(Typeface.DEFAULT);
                        textView.setTextColor(Color.parseColor("#80FFFFFF"));
                        textView.setContentDescription(((Object) textView.getText()) + (char) 65292 + Localization.q(R.string.taobao_app_1007_button));
                        return;
                    }
                    ckf.y("tabViewHolders");
                    throw null;
                }
            }
        }
    }

    public final void R0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e20e6f1", new Object[]{this, new Integer(i2)});
        } else if (i2 > 0) {
            J0().notifyItemRangeInserted(0, i2);
            if (L0() <= 4) {
                RecyclerView recyclerView = this.w;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(0);
                } else {
                    ckf.y("rvImage");
                    throw null;
                }
            }
        }
    }

    public void V0(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f9d2d0", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (this.P != i2) {
            this.Q = i3;
            this.P = i2;
            c1(i2, i3);
            if (i2 > this.p && !this.G) {
                this.G = true;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                RecyclerView recyclerView = this.w;
                if (recyclerView != null) {
                    recyclerView.setLayoutParams(layoutParams);
                } else {
                    ckf.y("rvImage");
                    throw null;
                }
            }
        }
    }

    public final void X0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa141a", new Object[]{this, new Boolean(z)});
        } else if (z) {
            View view = this.B;
            if (view == null) {
                ckf.y("permissionHintContainer");
                throw null;
            } else if (view.getVisibility() == 0) {
                View view2 = this.q;
                if (view2 == null) {
                    ckf.y("btnContainer");
                    throw null;
                } else if (view2.getVisibility() != 8) {
                    View view3 = this.q;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    } else {
                        ckf.y("btnContainer");
                        throw null;
                    }
                }
            } else {
                View view4 = this.q;
                if (view4 == null) {
                    ckf.y("btnContainer");
                    throw null;
                } else if (view4.getVisibility() != 0) {
                    View view5 = this.q;
                    if (view5 != null) {
                        view5.setVisibility(0);
                    } else {
                        ckf.y("btnContainer");
                        throw null;
                    }
                }
            }
        } else {
            View view6 = this.q;
            if (view6 == null) {
                ckf.y("btnContainer");
                throw null;
            } else if (view6.getVisibility() != 8) {
                View view7 = this.q;
                if (view7 != null) {
                    view7.setVisibility(8);
                } else {
                    ckf.y("btnContainer");
                    throw null;
                }
            }
        }
    }

    public final void Z0(boolean z) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb5625f", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.v;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            RecyclerView recyclerView = this.w;
            if (recyclerView != null) {
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    if (z) {
                        i2 = p1p.a(70.0f);
                    }
                    layoutParams2.bottomMargin = i2;
                    RecyclerView recyclerView2 = this.w;
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

    public final void b1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5185caf1", new Object[]{this, new Boolean(z)});
            return;
        }
        this.J = z;
        b43 b43Var = (b43) i0();
        if (b43Var != null) {
            if (this.J) {
                TUrlImageView tUrlImageView = this.t;
                if (tUrlImageView != null) {
                    tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01526CrE1SSiaPc0Rhq_!!6000000002246-49-tps-42-25.webp");
                    jzu.i("Page_PhotoSearchTake", "ClickAlbumFolder", new String[0]);
                    P0().P(b43Var.Q().b());
                    View view = this.u;
                    if (view != null) {
                        view.setVisibility(8);
                        RecyclerView recyclerView = this.x;
                        if (recyclerView != null) {
                            recyclerView.setVisibility(0);
                            RecyclerView recyclerView2 = this.w;
                            if (recyclerView2 != null) {
                                recyclerView2.setVisibility(4);
                                View view2 = this.r;
                                if (view2 != null) {
                                    StringBuilder sb = new StringBuilder();
                                    TextView textView = this.s;
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
            TUrlImageView tUrlImageView2 = this.t;
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01WjFuHO1BvFnP1cxXx_!!6000000000007-49-tps-42-25.webp");
                View view3 = this.u;
                if (view3 != null) {
                    view3.setVisibility(0);
                    RecyclerView recyclerView3 = this.w;
                    if (recyclerView3 != null) {
                        recyclerView3.setVisibility(0);
                        RecyclerView recyclerView4 = this.x;
                        if (recyclerView4 != null) {
                            recyclerView4.setVisibility(8);
                            View view4 = this.r;
                            if (view4 != null) {
                                StringBuilder sb2 = new StringBuilder();
                                TextView textView2 = this.s;
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

    public final void d1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26572dc0", new Object[]{this, new Boolean(z)});
        } else if (z) {
            View view = this.B;
            if (view != null) {
                if (view.getVisibility() == 0) {
                    mzu.q(s63.ALBUM_PAGE_NAME, "GoSettingExpose", new String[0]);
                }
                View view2 = this.z;
                if (view2 != null) {
                    view2.setVisibility(0);
                    View view3 = this.B;
                    if (view3 != null) {
                        view3.setVisibility(0);
                        View view4 = this.E;
                        if (view4 != null) {
                            view4.setVisibility(8);
                            TUrlImageView tUrlImageView = this.A;
                            if (tUrlImageView != null) {
                                tUrlImageView.setVisibility(0);
                                c1(this.P, this.Q);
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
            View view5 = this.z;
            if (view5 != null) {
                view5.setVisibility(8);
                TUrlImageView tUrlImageView2 = this.A;
                if (tUrlImageView2 != null) {
                    tUrlImageView2.setVisibility(8);
                    View view6 = this.B;
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

    public final void T0(zs9 zs9Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d08107f", new Object[]{this, zs9Var});
            return;
        }
        ckf.g(zs9Var, "folderItem");
        boolean a0 = J0().a0(zs9Var, null, false);
        p7m.a("AlbumUpdate", ckf.p("onAlbumFolderItemsUpdate: ", Boolean.valueOf(a0)));
        if (a0) {
            if (J0().getItemCount() == 0) {
                z = true;
            }
            a1(z);
            int L0 = L0() + (J0().X() ? 1 : 0);
            J0().notifyItemRangeChanged(L0, ((M0() + (J0().X() ? 1 : 0)) - L0) + 1);
        }
    }

    public final void W0(List<pei> list) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16bb079e", new Object[]{this, list});
            return;
        }
        List<pei> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            boolean O = J0().O(list);
            p7m.a("AlbumUpdate", ckf.p("onScreenShotsFullUpdate: ", Boolean.valueOf(O)));
            if (O) {
                if (J0().getItemCount() == 0) {
                    z = true;
                }
                a1(z);
                int L0 = L0();
                J0().notifyItemRangeChanged(L0, (M0() - L0) + 1);
            }
        }
    }

    @Override // tb.gib
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25fbc59f", new Object[]{this})).booleanValue();
        }
        if (!a0()) {
            return false;
        }
        RecyclerView recyclerView = this.w;
        if (recyclerView == null) {
            ckf.y("rvImage");
            throw null;
        } else if (recyclerView.getVisibility() == 0) {
            RecyclerView recyclerView2 = this.w;
            if (recyclerView2 != null) {
                return !recyclerView2.canScrollVertically(-1);
            }
            ckf.y("rvImage");
            throw null;
        } else {
            RecyclerView recyclerView3 = this.x;
            if (recyclerView3 == null) {
                ckf.y("rvFolder");
                throw null;
            } else if (recyclerView3.getVisibility() != 0) {
                return true;
            } else {
                RecyclerView recyclerView4 = this.x;
                if (recyclerView4 != null) {
                    return !recyclerView4.canScrollVertically(-1);
                }
                ckf.y("rvFolder");
                throw null;
            }
        }
    }

    public final void c1(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98ad0ed", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        View view = this.z;
        if (view == null) {
            ckf.y("hintContainer");
            throw null;
        } else if (view.getVisibility() == 0) {
            if (i2 > i3 / 3) {
                View view2 = this.C;
                if (view2 != null) {
                    if (view2.getVisibility() != 8) {
                        View view3 = this.C;
                        if (view3 != null) {
                            view3.setVisibility(8);
                            TUrlImageView tUrlImageView = this.A;
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
                    View view4 = this.D;
                    if (view4 == null) {
                        ckf.y("permissionHintFullView");
                        throw null;
                    } else if (view4.getVisibility() != 0) {
                        View view5 = this.D;
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
                View view6 = this.C;
                if (view6 != null) {
                    if (view6.getVisibility() != 0) {
                        View view7 = this.C;
                        if (view7 != null) {
                            view7.setVisibility(0);
                            TUrlImageView tUrlImageView2 = this.A;
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
                    View view8 = this.D;
                    if (view8 == null) {
                        ckf.y("permissionHintFullView");
                        throw null;
                    } else if (view8.getVisibility() != 8) {
                        View view9 = this.D;
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
            View view10 = this.C;
            if (view10 != null) {
                float f2 = 1.0f;
                if (view10.getVisibility() == 0) {
                    View view11 = this.C;
                    if (view11 != null) {
                        ViewGroup.LayoutParams layoutParams = view11.getLayoutParams();
                        if (layoutParams != null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                            layoutParams2.topMargin = ((i2 - p1p.a(30.0f)) - CaptureBottomAreaView.Companion.c()) / 2;
                            View view12 = this.C;
                            if (view12 != null) {
                                view12.setLayoutParams(layoutParams2);
                                float f3 = (300 - (i2 - this.p)) / 100.0f;
                                if (f3 < 0.0f) {
                                    f3 = 0.0f;
                                } else if (f3 > 1.0f) {
                                    f3 = 1.0f;
                                }
                                View view13 = this.C;
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
                TUrlImageView tUrlImageView3 = this.A;
                if (tUrlImageView3 != null) {
                    if (tUrlImageView3.getVisibility() == 0) {
                        float f4 = (100 - (i2 - this.p)) / 100.0f;
                        if (f4 < 0.0f) {
                            f2 = 0.0f;
                        } else if (f4 <= 1.0f) {
                            f2 = f4;
                        }
                        TUrlImageView tUrlImageView4 = this.A;
                        if (tUrlImageView4 != null) {
                            tUrlImageView4.setAlpha(f2);
                        } else {
                            ckf.y("permissionHintBg");
                            throw null;
                        }
                    }
                    View view14 = this.D;
                    if (view14 != null) {
                        if (view14.getVisibility() == 0) {
                            View view15 = this.D;
                            if (view15 != null) {
                                ViewGroup.LayoutParams layoutParams3 = view15.getLayoutParams();
                                if (layoutParams3 != null) {
                                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                    layoutParams4.topMargin = ((i2 - CaptureBottomAreaView.Companion.c()) / 2) - p1p.a(170.0f);
                                    View view16 = this.D;
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
                        View view17 = this.E;
                        if (view17 == null) {
                            ckf.y("emptyHintView");
                            throw null;
                        } else if (view17.getVisibility() == 0) {
                            View view18 = this.E;
                            if (view18 != null) {
                                ViewGroup.LayoutParams layoutParams5 = view18.getLayoutParams();
                                if (layoutParams5 != null) {
                                    FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                                    layoutParams6.topMargin = ((i2 - p1p.a(48.0f)) - CaptureBottomAreaView.Companion.c()) / 2;
                                    View view19 = this.E;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureAlbumWidget(Activity activity, Object obj, boolean z, CaptureManager captureManager, xfw xfwVar, u1a<? super pei, ? super Boolean, xhv> u1aVar, int i2) {
        super(activity, obj, captureManager, xfwVar, false, 16, null);
        d22 d22Var;
        ckf.g(activity, "activity");
        ckf.g(captureManager, "captureManager");
        ckf.g(u1aVar, "onAlbumItemSelectedListener");
        this.m = z;
        this.n = captureManager;
        this.o = u1aVar;
        this.p = i2;
        this.F = lg4.O1(activity);
        if (lg4.x()) {
            d22Var = new mhi("album");
        } else {
            d22Var = new MediaThumbnailExecutor();
        }
        this.L = d22Var;
        this.M = kotlin.a.b(new CaptureAlbumWidget$albumAdapter$2(this));
        this.N = kotlin.a.b(new CaptureAlbumWidget$folderAdapter$2(activity, this));
    }
}
