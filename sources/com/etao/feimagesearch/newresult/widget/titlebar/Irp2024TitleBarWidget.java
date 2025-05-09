package com.etao.feimagesearch.newresult.widget.titlebar;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.newresult.widget.titlebar.searchbar.Irp2024SearchBarWidget;
import com.etao.feimagesearch.ui.GradientLayout;
import com.etao.feimagesearch.view.ContentOffsetView;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.LinkedList;
import java.util.List;
import tb.amf;
import tb.caa;
import tb.ckf;
import tb.jzu;
import tb.l53;
import tb.lp9;
import tb.mh7;
import tb.mno;
import tb.mzu;
import tb.p1p;
import tb.p9j;
import tb.qnd;
import tb.t2o;
import tb.vz;
import tb.xfw;
import tb.ylf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Irp2024TitleBarWidget extends ylf implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int B;
    public boolean C;
    public final boolean n;
    public final qnd o;
    public ContentOffsetView p;
    public RelativeLayout q;
    public LinearLayout r;
    public TUrlImageView s;
    public TextView t;
    public TUrlImageView u;
    public Irp2024SearchBarWidget v;
    public GradientLayout w;
    public RecyclerView x;
    public Irp2024TitleBarRegionAdapter y;
    public int z;
    public final int A = p1p.a(amf.b());
    public boolean D = t0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            mzu.i("Page_PhotoSearchResult", "floatbarTurnOff", new String[0]);
            lp9.INSTANCE.c();
            mno.h(caa.c(), l53.IS_PLT_SCREENSHOT_FLOAT_BAR_OPEN_DEFAULT, "false");
            view.setVisibility(8);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else {
                Irp2024TitleBarWidget.J0(Irp2024TitleBarWidget.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Integer b;

        public d(Integer num) {
            this.b = num;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Irp2024TitleBarWidget.F0(Irp2024TitleBarWidget.this, this.b);
            }
        }
    }

    static {
        t2o.a(481297251);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Irp2024TitleBarWidget(Activity activity, vz vzVar, IrpDatasource irpDatasource, xfw xfwVar, boolean z, qnd qndVar) {
        super(activity, vzVar, irpDatasource, xfwVar);
        ckf.g(activity, "activity");
        ckf.g(vzVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(irpDatasource, "irpDatasource");
        ckf.g(xfwVar, "setter");
        this.n = z;
        this.o = qndVar;
        this.B = p1p.a(amf.a(z));
    }

    public static final /* synthetic */ void F0(Irp2024TitleBarWidget irp2024TitleBarWidget, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d658715", new Object[]{irp2024TitleBarWidget, num});
        } else {
            irp2024TitleBarWidget.L0(num);
        }
    }

    public static final /* synthetic */ int G0(Irp2024TitleBarWidget irp2024TitleBarWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed2418da", new Object[]{irp2024TitleBarWidget})).intValue();
        }
        return irp2024TitleBarWidget.A;
    }

    public static final /* synthetic */ RelativeLayout H0(Irp2024TitleBarWidget irp2024TitleBarWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("dc6e71c7", new Object[]{irp2024TitleBarWidget});
        }
        return irp2024TitleBarWidget.q;
    }

    public static final /* synthetic */ ContentOffsetView I0(Irp2024TitleBarWidget irp2024TitleBarWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentOffsetView) ipChange.ipc$dispatch("50a60cbf", new Object[]{irp2024TitleBarWidget});
        }
        return irp2024TitleBarWidget.p;
    }

    public static final /* synthetic */ void J0(Irp2024TitleBarWidget irp2024TitleBarWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f162828f", new Object[]{irp2024TitleBarWidget});
        } else {
            irp2024TitleBarWidget.U0();
        }
    }

    public static final /* synthetic */ void K0(Irp2024TitleBarWidget irp2024TitleBarWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be58d5a", new Object[]{irp2024TitleBarWidget, new Integer(i)});
        } else {
            irp2024TitleBarWidget.V0(i);
        }
    }

    public static /* synthetic */ Object ipc$super(Irp2024TitleBarWidget irp2024TitleBarWidget, String str, Object... objArr) {
        if (str.hashCode() == 1011169217) {
            super.v0((Integer) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/titlebar/Irp2024TitleBarWidget");
    }

    @Override // tb.ylf
    public void A0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a432185f", new Object[]{this, new Integer(i)});
            return;
        }
        Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter = this.y;
        if (irp2024TitleBarRegionAdapter != null) {
            irp2024TitleBarRegionAdapter.a0(i);
            V0(i);
            return;
        }
        ckf.y("mAdapter");
        throw null;
    }

    @Override // tb.ylf
    public void B0(RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c156873f", new Object[]{this, rectF, new Boolean(z)});
        } else if (rectF != null) {
            Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter = this.y;
            if (irp2024TitleBarRegionAdapter != null) {
                irp2024TitleBarRegionAdapter.b0(rectF, z);
                Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter2 = this.y;
                if (irp2024TitleBarRegionAdapter2 != null) {
                    V0(irp2024TitleBarRegionAdapter2.Q());
                } else {
                    ckf.y("mAdapter");
                    throw null;
                }
            } else {
                ckf.y("mAdapter");
                throw null;
            }
        }
    }

    @Override // tb.ylf
    public void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3498b50c", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.u;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(8);
        } else {
            ckf.y("mViewBack");
            throw null;
        }
    }

    public final void N0() {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df09870", new Object[]{this});
            return;
        }
        boolean t0 = t0();
        if (this.D != t0) {
            this.D = t0;
            TUrlImageView tUrlImageView = this.s;
            if (tUrlImageView != null) {
                if (t0) {
                    str = "https://gw.alicdn.com/imgextra/i2/O1CN01SiHsHS1kgbcrG4PwW_!!6000000004713-2-tps-567-567.png";
                } else {
                    str = "https://gw.alicdn.com/imgextra/i1/O1CN0162Tvji1KwTKm9tqYY_!!6000000001228-49-tps-567-567.webp";
                }
                tUrlImageView.setImageUrl(str);
                TextView textView = this.t;
                if (textView != null) {
                    if (this.D) {
                        str2 = "#EEEEEE";
                    } else {
                        str2 = "#11192D";
                    }
                    textView.setTextColor(Color.parseColor(str2));
                    TUrlImageView tUrlImageView2 = this.u;
                    if (tUrlImageView2 != null) {
                        if (this.D) {
                            str3 = "https://gw.alicdn.com/imgextra/i3/O1CN019FT1zf1Cv5D0XeaPJ_!!6000000000142-2-tps-500-500.png";
                        } else {
                            str3 = "https://gw.alicdn.com/imgextra/i1/O1CN012Hy4Xd1DBZSpD0i0o_!!6000000000178-49-tps-500-500.webp";
                        }
                        tUrlImageView2.setImageUrl(str3);
                        return;
                    }
                    ckf.y("mViewBack");
                    throw null;
                }
                ckf.y("mTvQueryText");
                throw null;
            }
            ckf.y("mIvSearch");
            throw null;
        }
    }

    public final GradientDrawable O0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("526fa69d", new Object[]{this});
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        if (this.D) {
            str = "#222222";
        } else {
            str = "#FFFFFF";
        }
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setCornerRadius(p1p.b(6.5f));
        return gradientDrawable;
    }

    public final qnd P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qnd) ipChange.ipc$dispatch("fb7a8a19", new Object[]{this});
        }
        return this.o;
    }

    public final boolean Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f4d3fc", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public void T0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f800cc52", new Object[]{this, new Integer(i)});
            return;
        }
        ContentOffsetView contentOffsetView = this.p;
        if (contentOffsetView != null) {
            contentOffsetView.setOffset(i);
        } else {
            ckf.y("mRootView");
            throw null;
        }
    }

    public final void U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c809aa7c", new Object[]{this});
            return;
        }
        Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter = this.y;
        if (irp2024TitleBarRegionAdapter == null) {
            ckf.y("mAdapter");
            throw null;
        } else if (irp2024TitleBarRegionAdapter.getItemCount() != 0) {
            LinearLayout linearLayout = this.r;
            if (linearLayout != null) {
                int right = linearLayout.getRight();
                RecyclerView recyclerView = this.x;
                if (recyclerView != null) {
                    int width = right - recyclerView.getWidth();
                    RecyclerView recyclerView2 = this.x;
                    if (recyclerView2 != null) {
                        int left = (width - recyclerView2.getLeft()) - p1p.a(56.0f);
                        TextView textView = this.t;
                        if (textView != null) {
                            textView.setMaxWidth(left);
                        } else {
                            ckf.y("mTvQueryText");
                            throw null;
                        }
                    } else {
                        ckf.y("mObjectsRv");
                        throw null;
                    }
                } else {
                    ckf.y("mObjectsRv");
                    throw null;
                }
            } else {
                ckf.y("mBtnSearch");
                throw null;
            }
        }
    }

    public final void V0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b0390d", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter = this.y;
            if (irp2024TitleBarRegionAdapter == null) {
                ckf.y("mAdapter");
                throw null;
            } else if (i < irp2024TitleBarRegionAdapter.getItemCount()) {
                this.z = i;
                RecyclerView recyclerView = this.x;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(i);
                } else {
                    ckf.y("mObjectsRv");
                    throw null;
                }
            }
        }
    }

    @Override // tb.ylf
    public int j0(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93b23a73", new Object[]{this, rectF})).intValue();
        }
        Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter = this.y;
        if (irp2024TitleBarRegionAdapter != null) {
            return irp2024TitleBarRegionAdapter.P(rectF);
        }
        ckf.y("mAdapter");
        throw null;
    }

    @Override // tb.ylf
    public Bitmap k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("bd9231c7", new Object[]{this});
        }
        Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter = this.y;
        if (irp2024TitleBarRegionAdapter != null) {
            return irp2024TitleBarRegionAdapter.T(this.z);
        }
        ckf.y("mAdapter");
        throw null;
    }

    @Override // tb.ylf
    public int l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.B;
    }

    @Override // tb.ylf
    public int n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9332553", new Object[]{this})).intValue();
        }
        RecyclerView recyclerView = this.x;
        if (recyclerView != null) {
            return recyclerView.getWidth();
        }
        ckf.y("mObjectsRv");
        throw null;
    }

    @Override // tb.ylf
    public LinkedList<p9j> o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("8847d4ab", new Object[]{this});
        }
        Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter = this.y;
        if (irp2024TitleBarRegionAdapter != null) {
            return irp2024TitleBarRegionAdapter.S();
        }
        ckf.y("mAdapter");
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (m0() != null) {
            LinearLayout linearLayout = this.r;
            if (linearLayout == null) {
                ckf.y("mBtnSearch");
                throw null;
            } else if (ckf.b(view, linearLayout)) {
                Irp2024SearchBarWidget irp2024SearchBarWidget = this.v;
                if (irp2024SearchBarWidget != null) {
                    irp2024SearchBarWidget.show();
                    ylf.a m0 = m0();
                    if (m0 != null) {
                        m0.z();
                    }
                    Irp2024SearchBarWidget irp2024SearchBarWidget2 = this.v;
                    if (irp2024SearchBarWidget2 != null) {
                        irp2024SearchBarWidget2.setThumbContent(k0());
                        Irp2024SearchBarWidget irp2024SearchBarWidget3 = this.v;
                        if (irp2024SearchBarWidget3 != null) {
                            mzu.i("Page_PhotoSearchResult", "clickTextSearchNew", "query", irp2024SearchBarWidget3.getHintQuery());
                        } else {
                            ckf.y("mSearchBar");
                            throw null;
                        }
                    } else {
                        ckf.y("mSearchBar");
                        throw null;
                    }
                } else {
                    ckf.y("mSearchBar");
                    throw null;
                }
            } else {
                TUrlImageView tUrlImageView = this.u;
                if (tUrlImageView == null) {
                    ckf.y("mViewBack");
                    throw null;
                } else if (view == tUrlImageView) {
                    ylf.a m02 = m0();
                    if (m02 != null) {
                        m02.m();
                    }
                    jzu.g("Page_PhotoSearchResult", "clickBackBtn", "pssource", W().y());
                }
            }
        }
    }

    @Override // tb.ylf
    public int p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42fb2bb8", new Object[]{this})).intValue();
        }
        ContentOffsetView contentOffsetView = this.p;
        if (contentOffsetView != null) {
            return (int) contentOffsetView.getTranslationY();
        }
        ckf.y("mRootView");
        throw null;
    }

    @Override // tb.ylf
    public boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a70437", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    @Override // tb.ylf
    public boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5242a8f4", new Object[]{this})).booleanValue();
        }
        Irp2024SearchBarWidget irp2024SearchBarWidget = this.v;
        if (irp2024SearchBarWidget != null) {
            return irp2024SearchBarWidget.isVisible();
        }
        ckf.y("mSearchBar");
        throw null;
    }

    @Override // tb.ylf
    public void v0(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4537c1", new Object[]{this, num});
            return;
        }
        super.v0(num);
        ContentOffsetView contentOffsetView = this.p;
        if (contentOffsetView != null) {
            contentOffsetView.post(new d(num));
        } else {
            ckf.y("mRootView");
            throw null;
        }
    }

    @Override // tb.ylf
    public void x0(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede5fbdf", new Object[]{this, bitmap});
            return;
        }
        RelativeLayout relativeLayout = this.q;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.height = p1p.a(amf.d(Q0()));
            relativeLayout.setLayoutParams(layoutParams);
            try {
                Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter = this.y;
                if (irp2024TitleBarRegionAdapter != null) {
                    irp2024TitleBarRegionAdapter.Z(bitmap);
                } else {
                    ckf.y("mAdapter");
                    throw null;
                }
            } catch (Exception unused) {
            }
        } else {
            ckf.y("mMainContainer");
            throw null;
        }
    }

    @Override // tb.ylf
    public void y0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1d13c5", new Object[]{this, str});
        } else if (str != null) {
            Irp2024SearchBarWidget irp2024SearchBarWidget = this.v;
            if (irp2024SearchBarWidget != null) {
                irp2024SearchBarWidget.setQueryTag(str);
            } else {
                ckf.y("mSearchBar");
                throw null;
            }
        }
    }

    @Override // tb.ylf
    public void z0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b729aa24", new Object[]{this, str});
            return;
        }
        Irp2024SearchBarWidget irp2024SearchBarWidget = this.v;
        if (irp2024SearchBarWidget != null) {
            irp2024SearchBarWidget.setHintQuery(str);
            if (TextUtils.isEmpty(str)) {
                TextView textView = this.t;
                if (textView != null) {
                    textView.setText(Localization.q(R.string.taobao_app_1007_search));
                } else {
                    ckf.y("mTvQueryText");
                    throw null;
                }
            } else {
                TextView textView2 = this.t;
                if (textView2 != null) {
                    textView2.setText(str);
                } else {
                    ckf.y("mTvQueryText");
                    throw null;
                }
            }
        } else {
            ckf.y("mSearchBar");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements qnd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.qnd
        public void b(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55d1b959", new Object[]{this, jSONArray});
                return;
            }
            qnd P0 = Irp2024TitleBarWidget.this.P0();
            if (P0 != null) {
                P0.b(jSONArray);
            }
        }

        @Override // tb.qnd
        public void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edaecd18", new Object[]{this, new Boolean(z)});
                return;
            }
            qnd P0 = Irp2024TitleBarWidget.this.P0();
            if (P0 != null) {
                P0.c(z);
            }
        }

        @Override // tb.qnd
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d6b3c2b", new Object[]{this, new Boolean(z)});
                return;
            }
            qnd P0 = Irp2024TitleBarWidget.this.P0();
            if (P0 != null) {
                P0.a(z);
            }
            if (z) {
                Irp2024TitleBarWidget.this.S0(false);
                ContentOffsetView I0 = Irp2024TitleBarWidget.I0(Irp2024TitleBarWidget.this);
                if (I0 != null) {
                    I0.setPadding(0, 0, 0, 0);
                    RelativeLayout H0 = Irp2024TitleBarWidget.H0(Irp2024TitleBarWidget.this);
                    if (H0 != null) {
                        H0.setVisibility(8);
                        Irp2024TitleBarWidget.this.T0(0);
                        return;
                    }
                    ckf.y("mMainContainer");
                    throw null;
                }
                ckf.y("mRootView");
                throw null;
            }
            Irp2024TitleBarWidget.this.S0(true);
            ContentOffsetView I02 = Irp2024TitleBarWidget.I0(Irp2024TitleBarWidget.this);
            if (I02 != null) {
                I02.setPadding(0, p1p.a(10.0f), 0, 0);
                RelativeLayout H02 = Irp2024TitleBarWidget.H0(Irp2024TitleBarWidget.this);
                if (H02 != null) {
                    H02.setVisibility(0);
                    mzu.q("Page_PhotoSearchResult", "showTextSearchNew", new String[0]);
                    return;
                }
                ckf.y("mMainContainer");
                throw null;
            }
            ckf.y("mRootView");
            throw null;
        }
    }

    @Override // tb.ylf
    public void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a670c62", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.u;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(0);
        } else {
            ckf.y("mViewBack");
            throw null;
        }
    }

    @Override // tb.ylf
    public void E0(boolean z, boolean z2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcbf3f4", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        N0();
        if (Localization.o()) {
            LinearLayout linearLayout = this.r;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            } else {
                ckf.y("mBtnSearch");
                throw null;
            }
        } else {
            LinearLayout linearLayout2 = this.r;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(z2 ? 0 : 8);
            } else {
                ckf.y("mBtnSearch");
                throw null;
            }
        }
        RecyclerView recyclerView = this.x;
        if (recyclerView != null) {
            if (!z) {
                i = 8;
            }
            recyclerView.setVisibility(i);
            return;
        }
        ckf.y("mObjectsRv");
        throw null;
    }

    @Override // tb.ylf
    public void i0(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c52d4d5", new Object[]{this, rectF});
            return;
        }
        Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter = this.y;
        if (irp2024TitleBarRegionAdapter != null) {
            irp2024TitleBarRegionAdapter.N(rectF);
            Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter2 = this.y;
            if (irp2024TitleBarRegionAdapter2 != null) {
                if (irp2024TitleBarRegionAdapter2.getItemCount() > 0) {
                    Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter3 = this.y;
                    if (irp2024TitleBarRegionAdapter3 != null) {
                        V0(irp2024TitleBarRegionAdapter3.getItemCount() - 1);
                    } else {
                        ckf.y("mAdapter");
                        throw null;
                    }
                }
                Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter4 = this.y;
                if (irp2024TitleBarRegionAdapter4 != null) {
                    M0(irp2024TitleBarRegionAdapter4.getItemCount());
                } else {
                    ckf.y("mAdapter");
                    throw null;
                }
            } else {
                ckf.y("mAdapter");
                throw null;
            }
        } else {
            ckf.y("mAdapter");
            throw null;
        }
    }

    @Override // tb.ylf
    public void q0(List<mh7> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e751c1a", new Object[]{this, list, new Integer(i)});
        } else if (list != null && list.size() > 0 && i >= 0) {
            Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter = this.y;
            if (irp2024TitleBarRegionAdapter == null) {
                ckf.y("mAdapter");
                throw null;
            } else if (i <= irp2024TitleBarRegionAdapter.getItemCount()) {
                int i2 = i;
                for (mh7 mh7Var : list) {
                    Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter2 = this.y;
                    if (irp2024TitleBarRegionAdapter2 != null) {
                        irp2024TitleBarRegionAdapter2.a(mh7Var.f24039a, i2, mh7Var.b, mh7Var.c);
                        i2++;
                    } else {
                        ckf.y("mAdapter");
                        throw null;
                    }
                }
                Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter3 = this.y;
                if (irp2024TitleBarRegionAdapter3 == null) {
                    ckf.y("mAdapter");
                    throw null;
                } else if (irp2024TitleBarRegionAdapter3 != null) {
                    irp2024TitleBarRegionAdapter3.notifyItemRangeChanged(i, irp2024TitleBarRegionAdapter3.getItemCount() - i);
                    Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter4 = this.y;
                    if (irp2024TitleBarRegionAdapter4 != null) {
                        M0(irp2024TitleBarRegionAdapter4.getItemCount());
                    } else {
                        ckf.y("mAdapter");
                        throw null;
                    }
                } else {
                    ckf.y("mAdapter");
                    throw null;
                }
            }
        }
    }

    @Override // tb.ylf
    public void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326d413c", new Object[]{this});
        } else {
            mzu.q("Page_PhotoSearchResult", "showTextSearchNew", new String[0]);
        }
    }

    public final void L0(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b6b08", new Object[]{this, num});
        } else if (num != null) {
            RecyclerView recyclerView = this.x;
            if (recyclerView != null) {
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    int intValue = num.intValue();
                    if (intValue == 1) {
                        layoutParams2.leftMargin = p1p.a(25.0f);
                    } else if (intValue == 2) {
                        layoutParams2.leftMargin = p1p.a(21.0f);
                    } else if (intValue != 3) {
                        layoutParams2.leftMargin = p1p.a(13.0f);
                    } else {
                        layoutParams2.leftMargin = p1p.a(17.0f);
                    }
                    RecyclerView recyclerView2 = this.x;
                    if (recyclerView2 != null) {
                        recyclerView2.setLayoutParams(layoutParams2);
                    } else {
                        ckf.y("mObjectsRv");
                        throw null;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            } else {
                ckf.y("mObjectsRv");
                throw null;
            }
        }
    }

    public final void M0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5ee3b9", new Object[]{this, new Integer(i)});
            return;
        }
        if (W().R()) {
            ContentOffsetView contentOffsetView = this.p;
            if (contentOffsetView != null) {
                View findViewById = contentOffsetView.findViewById(R.id.btn_close_screen_search);
                findViewById.setVisibility(0);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(Color.parseColor("#FFFFFF"));
                gradientDrawable.setCornerRadius(p1p.b(6.5f));
                findViewById.setBackground(gradientDrawable);
                ViewProxy.setOnClickListener(findViewById, a.INSTANCE);
                ContentOffsetView contentOffsetView2 = this.p;
                if (contentOffsetView2 != null) {
                    ((TUrlImageView) contentOffsetView2.findViewById(R.id.tiv_close)).setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01Dn6i5C284BAgfWjMM_!!6000000007878-49-tps-500-500.webp");
                    if (!this.C) {
                        TextView textView = this.t;
                        if (textView != null) {
                            textView.setVisibility(8);
                            LinearLayout linearLayout = this.r;
                            if (linearLayout != null) {
                                linearLayout.setPadding(p1p.a(13.0f), 0, p1p.a(7.0f), 0);
                                LinearLayout linearLayout2 = this.r;
                                if (linearLayout2 != null) {
                                    linearLayout2.setBackground(null);
                                    this.C = true;
                                } else {
                                    ckf.y("mBtnSearch");
                                    throw null;
                                }
                            } else {
                                ckf.y("mBtnSearch");
                                throw null;
                            }
                        } else {
                            ckf.y("mTvQueryText");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("mRootView");
                    throw null;
                }
            } else {
                ckf.y("mRootView");
                throw null;
            }
        } else {
            ContentOffsetView contentOffsetView3 = this.p;
            if (contentOffsetView3 != null) {
                contentOffsetView3.findViewById(R.id.btn_close_screen_search).setVisibility(8);
                if (i <= 4) {
                    if (this.C) {
                        TextView textView2 = this.t;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            int a2 = p1p.a(13.0f);
                            LinearLayout linearLayout3 = this.r;
                            if (linearLayout3 != null) {
                                linearLayout3.setPadding(a2, 0, a2, 0);
                                LinearLayout linearLayout4 = this.r;
                                if (linearLayout4 != null) {
                                    linearLayout4.setBackground(O0());
                                    this.C = false;
                                } else {
                                    ckf.y("mBtnSearch");
                                    throw null;
                                }
                            } else {
                                ckf.y("mBtnSearch");
                                throw null;
                            }
                        } else {
                            ckf.y("mTvQueryText");
                            throw null;
                        }
                    }
                } else if (!this.C) {
                    TextView textView3 = this.t;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                        LinearLayout linearLayout5 = this.r;
                        if (linearLayout5 != null) {
                            linearLayout5.setPadding(p1p.a(13.0f), 0, p1p.a(7.0f), 0);
                            LinearLayout linearLayout6 = this.r;
                            if (linearLayout6 != null) {
                                linearLayout6.setBackground(null);
                                this.C = true;
                            } else {
                                ckf.y("mBtnSearch");
                                throw null;
                            }
                        } else {
                            ckf.y("mBtnSearch");
                            throw null;
                        }
                    } else {
                        ckf.y("mTvQueryText");
                        throw null;
                    }
                }
            } else {
                ckf.y("mRootView");
                throw null;
            }
        }
        GradientLayout gradientLayout = this.w;
        if (gradientLayout == null) {
            ckf.y("mGradientContainer");
            throw null;
        } else if (!gradientLayout.hasOpenGradient()) {
            int a3 = i * p1p.a(51.0f);
            RecyclerView recyclerView = this.x;
            if (recyclerView == null) {
                ckf.y("mObjectsRv");
                throw null;
            } else if (a3 > recyclerView.getWidth()) {
                GradientLayout gradientLayout2 = this.w;
                if (gradientLayout2 != null) {
                    gradientLayout2.openGradient();
                } else {
                    ckf.y("mGradientContainer");
                    throw null;
                }
            }
        }
    }

    /* renamed from: R0 */
    public ContentOffsetView b0() {
        int i;
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentOffsetView) ipChange.ipc$dispatch("9599a722", new Object[]{this});
        }
        if (this.n) {
            i = R.layout.feis_irp_titlebar_2024_single;
        } else {
            i = R.layout.feis_irp_titlebar_2024;
        }
        View inflate = LayoutInflater.from(E()).inflate(i, V(), false);
        if (inflate != null) {
            this.p = (ContentOffsetView) inflate;
            S0(true);
            ContentOffsetView contentOffsetView = this.p;
            if (contentOffsetView != null) {
                View findViewById = contentOffsetView.findViewById(R.id.rl_container);
                ckf.f(findViewById, "mRootView.findViewById(R.id.rl_container)");
                this.q = (RelativeLayout) findViewById;
                ContentOffsetView contentOffsetView2 = this.p;
                if (contentOffsetView2 != null) {
                    View findViewById2 = contentOffsetView2.findViewById(R.id.ll_search_container);
                    LinearLayout linearLayout = (LinearLayout) findViewById2;
                    linearLayout.setBackground(O0());
                    int a2 = p1p.a(13.0f);
                    linearLayout.setPadding(a2, 0, a2, 0);
                    linearLayout.setVisibility(8);
                    linearLayout.setOnClickListener(this);
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    if (layoutParams != null) {
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                        layoutParams2.setMargins(0, -p1p.a(amf.f(Q0())), 0, 0);
                        linearLayout.setLayoutParams(layoutParams2);
                        StringBuilder sb = new StringBuilder();
                        int i2 = R.string.taobao_app_1007_search;
                        sb.append(Localization.q(i2));
                        sb.append((char) 65292);
                        int i3 = R.string.taobao_app_1007_button;
                        sb.append(Localization.q(i3));
                        linearLayout.setContentDescription(sb.toString());
                        ckf.f(findViewById2, "mRootView.findViewById<L…07_button)\n      }\"\n    }");
                        this.r = (LinearLayout) findViewById2;
                        ContentOffsetView contentOffsetView3 = this.p;
                        if (contentOffsetView3 != null) {
                            View findViewById3 = contentOffsetView3.findViewById(R.id.ic_search);
                            ckf.f(findViewById3, "mRootView.findViewById(R.id.ic_search)");
                            TUrlImageView tUrlImageView = (TUrlImageView) findViewById3;
                            this.s = tUrlImageView;
                            if (this.D) {
                                str = "https://gw.alicdn.com/imgextra/i2/O1CN01SiHsHS1kgbcrG4PwW_!!6000000004713-2-tps-567-567.png";
                            } else {
                                str = "https://gw.alicdn.com/imgextra/i1/O1CN0162Tvji1KwTKm9tqYY_!!6000000001228-49-tps-567-567.webp";
                            }
                            tUrlImageView.setImageUrl(str);
                            ContentOffsetView contentOffsetView4 = this.p;
                            if (contentOffsetView4 != null) {
                                View findViewById4 = contentOffsetView4.findViewById(R.id.tv_hint);
                                ckf.f(findViewById4, "mRootView.findViewById(R.id.tv_hint)");
                                TextView textView = (TextView) findViewById4;
                                this.t = textView;
                                textView.setText(Localization.q(i2));
                                TextView textView2 = this.t;
                                if (textView2 != null) {
                                    if (this.D) {
                                        str2 = "#EEEEEE";
                                    } else {
                                        str2 = "#11192D";
                                    }
                                    textView2.setTextColor(Color.parseColor(str2));
                                    TextView textView3 = this.t;
                                    if (textView3 != null) {
                                        textView3.setTextSize(1, W().Y() ? 18.0f : 16.0f);
                                        ContentOffsetView contentOffsetView5 = this.p;
                                        if (contentOffsetView5 != null) {
                                            View findViewById5 = contentOffsetView5.findViewById(R.id.btn_back);
                                            ckf.f(findViewById5, "mRootView.findViewById(R.id.btn_back)");
                                            TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById5;
                                            this.u = tUrlImageView2;
                                            tUrlImageView2.setContentDescription(Localization.q(R.string.taobao_app_1007_close) + (char) 65292 + Localization.q(i3));
                                            TUrlImageView tUrlImageView3 = this.u;
                                            if (tUrlImageView3 != null) {
                                                tUrlImageView3.setOnClickListener(this);
                                                TUrlImageView tUrlImageView4 = this.u;
                                                if (tUrlImageView4 != null) {
                                                    if (this.D) {
                                                        str3 = "https://gw.alicdn.com/imgextra/i3/O1CN019FT1zf1Cv5D0XeaPJ_!!6000000000142-2-tps-500-500.png";
                                                    } else {
                                                        str3 = "https://gw.alicdn.com/imgextra/i1/O1CN012Hy4Xd1DBZSpD0i0o_!!6000000000178-49-tps-500-500.webp";
                                                    }
                                                    tUrlImageView4.setImageUrl(str3);
                                                    ContentOffsetView contentOffsetView6 = this.p;
                                                    if (contentOffsetView6 != null) {
                                                        View findViewById6 = contentOffsetView6.findViewById(R.id.gl_rv);
                                                        ckf.f(findViewById6, "mRootView.findViewById(R.id.gl_rv)");
                                                        this.w = (GradientLayout) findViewById6;
                                                        ContentOffsetView contentOffsetView7 = this.p;
                                                        if (contentOffsetView7 != null) {
                                                            View findViewById7 = contentOffsetView7.findViewById(R.id.rv_thumbnails);
                                                            ckf.f(findViewById7, "mRootView.findViewById(R.id.rv_thumbnails)");
                                                            this.x = (RecyclerView) findViewById7;
                                                            this.y = new Irp2024TitleBarRegionAdapter(W(), this.n, new Irp2024TitleBarWidget$onCreateView$2(this));
                                                            RecyclerView recyclerView = this.x;
                                                            if (recyclerView != null) {
                                                                recyclerView.setLayoutManager(new LinearLayoutManager(E(), 0, false));
                                                                RecyclerView recyclerView2 = this.x;
                                                                if (recyclerView2 != null) {
                                                                    Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter = this.y;
                                                                    if (irp2024TitleBarRegionAdapter != null) {
                                                                        recyclerView2.setAdapter(irp2024TitleBarRegionAdapter);
                                                                        RecyclerView recyclerView3 = this.x;
                                                                        if (recyclerView3 != null) {
                                                                            recyclerView3.setItemAnimator(null);
                                                                            RecyclerView recyclerView4 = this.x;
                                                                            if (recyclerView4 != null) {
                                                                                recyclerView4.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.etao.feimagesearch.newresult.widget.titlebar.Irp2024TitleBarWidget$onCreateView$3
                                                                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                                                                    public static /* synthetic */ Object ipc$super(Irp2024TitleBarWidget$onCreateView$3 irp2024TitleBarWidget$onCreateView$3, String str4, Object... objArr) {
                                                                                        str4.hashCode();
                                                                                        int hashCode = str4.hashCode();
                                                                                        throw new InstantReloadException("String switch could not find '" + str4 + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/titlebar/Irp2024TitleBarWidget$onCreateView$3");
                                                                                    }

                                                                                    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                                                                                    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView5, RecyclerView.State state) {
                                                                                        IpChange ipChange2 = $ipChange;
                                                                                        if (ipChange2 instanceof IpChange) {
                                                                                            ipChange2.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView5, state});
                                                                                            return;
                                                                                        }
                                                                                        ckf.g(rect, "outRect");
                                                                                        ckf.g(view, "view");
                                                                                        ckf.g(recyclerView5, a.MSG_SOURCE_PARENT);
                                                                                        ckf.g(state, "state");
                                                                                        if (recyclerView5.getChildAdapterPosition(view) != state.getItemCount() - 1) {
                                                                                            rect.right = Irp2024TitleBarWidget.G0(Irp2024TitleBarWidget.this);
                                                                                        }
                                                                                    }
                                                                                });
                                                                                RecyclerView recyclerView5 = this.x;
                                                                                if (recyclerView5 != null) {
                                                                                    recyclerView5.addOnLayoutChangeListener(new b());
                                                                                    Activity E = E();
                                                                                    ContentOffsetView contentOffsetView8 = this.p;
                                                                                    if (contentOffsetView8 != null) {
                                                                                        this.v = new Irp2024SearchBarWidget(E, contentOffsetView8, this.D, W().Y(), new c());
                                                                                        ScreenType g = ScreenType.g(E());
                                                                                        L0(g == null ? null : Integer.valueOf(g.c()));
                                                                                        ContentOffsetView contentOffsetView9 = this.p;
                                                                                        if (contentOffsetView9 != null) {
                                                                                            return contentOffsetView9;
                                                                                        }
                                                                                        ckf.y("mRootView");
                                                                                        throw null;
                                                                                    }
                                                                                    ckf.y("mRootView");
                                                                                    throw null;
                                                                                }
                                                                                ckf.y("mObjectsRv");
                                                                                throw null;
                                                                            }
                                                                            ckf.y("mObjectsRv");
                                                                            throw null;
                                                                        }
                                                                        ckf.y("mObjectsRv");
                                                                        throw null;
                                                                    }
                                                                    ckf.y("mAdapter");
                                                                    throw null;
                                                                }
                                                                ckf.y("mObjectsRv");
                                                                throw null;
                                                            }
                                                            ckf.y("mObjectsRv");
                                                            throw null;
                                                        }
                                                        ckf.y("mRootView");
                                                        throw null;
                                                    }
                                                    ckf.y("mRootView");
                                                    throw null;
                                                }
                                                ckf.y("mViewBack");
                                                throw null;
                                            }
                                            ckf.y("mViewBack");
                                            throw null;
                                        }
                                        ckf.y("mRootView");
                                        throw null;
                                    }
                                    ckf.y("mTvQueryText");
                                    throw null;
                                }
                                ckf.y("mTvQueryText");
                                throw null;
                            }
                            ckf.y("mRootView");
                            throw null;
                        }
                        ckf.y("mRootView");
                        throw null;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                }
                ckf.y("mRootView");
                throw null;
            }
            ckf.y("mRootView");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.view.ContentOffsetView");
    }

    @Override // tb.ylf
    public void h0(List<mh7> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ec9921", new Object[]{this, list});
            return;
        }
        Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter = this.y;
        if (irp2024TitleBarRegionAdapter != null) {
            irp2024TitleBarRegionAdapter.O();
            if (list != null && list.size() > 0) {
                int i = 0;
                for (mh7 mh7Var : list) {
                    i++;
                    Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter2 = this.y;
                    if (irp2024TitleBarRegionAdapter2 != null) {
                        irp2024TitleBarRegionAdapter2.a(mh7Var.f24039a, i, mh7Var.b, mh7Var.c);
                    } else {
                        ckf.y("mAdapter");
                        throw null;
                    }
                }
                Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter3 = this.y;
                if (irp2024TitleBarRegionAdapter3 != null) {
                    p9j V = irp2024TitleBarRegionAdapter3.V();
                    if (V == null) {
                        Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter4 = this.y;
                        if (irp2024TitleBarRegionAdapter4 != null) {
                            RectF rectF = list.get(0).f24039a;
                            ckf.f(rectF, "regionParts[0].region");
                            irp2024TitleBarRegionAdapter4.b0(rectF, false);
                        } else {
                            ckf.y("mAdapter");
                            throw null;
                        }
                    } else {
                        Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter5 = this.y;
                        if (irp2024TitleBarRegionAdapter5 != null) {
                            RectF rectF2 = V.b;
                            ckf.f(rectF2, "selectedRegion.rectF");
                            irp2024TitleBarRegionAdapter5.b0(rectF2, V.h);
                        } else {
                            ckf.y("mAdapter");
                            throw null;
                        }
                    }
                    Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter6 = this.y;
                    if (irp2024TitleBarRegionAdapter6 != null) {
                        M0(irp2024TitleBarRegionAdapter6.getItemCount());
                    } else {
                        ckf.y("mAdapter");
                        throw null;
                    }
                } else {
                    ckf.y("mAdapter");
                    throw null;
                }
            }
        } else {
            ckf.y("mAdapter");
            throw null;
        }
    }

    public final void S0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f643e54f", new Object[]{this, new Boolean(z)});
        } else if (z) {
            ContentOffsetView contentOffsetView = this.p;
            if (contentOffsetView != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                float b2 = p1p.b(6.5f);
                gradientDrawable.setCornerRadii(new float[]{b2, b2, b2, b2, 0.0f, 0.0f, 0.0f, 0.0f});
                contentOffsetView.setBackground(gradientDrawable);
                return;
            }
            ckf.y("mRootView");
            throw null;
        } else {
            ContentOffsetView contentOffsetView2 = this.p;
            if (contentOffsetView2 != null) {
                contentOffsetView2.setBackground(null);
            } else {
                ckf.y("mRootView");
                throw null;
            }
        }
    }
}
