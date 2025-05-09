package com.taobao.android.detail.core.standard.widget.lightoff;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout;
import com.taobao.android.detail.core.standard.widget.lightoff.gallery.LightOffGalleryView;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffFloatModel;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffItemModel;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.dr0;
import tb.fc7;
import tb.fkc;
import tb.g28;
import tb.gkc;
import tb.mog;
import tb.mr7;
import tb.oog;
import tb.pfh;
import tb.s0m;
import tb.s8d;
import tb.t2o;
import tb.tgh;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class LightOffDialog extends Dialog implements ViewPager.OnPageChangeListener, DialogInterface.OnKeyListener, DialogInterface.OnDismissListener, DialogInterface.OnShowListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String q = pfh.a("LightOffDialog", BTags.XLightOff);
    private static final String r = "https://gw.alicdn.com/imgextra/i3/O1CN01YfR6ht1maliwECSdZ_!!6000000004971-2-tps-96-96.png";
    private static final int s = 56;

    /* renamed from: a  reason: collision with root package name */
    private ViewPager f6581a;
    private FrameLayout b;
    private TransAnimLayout c;
    private Context d;
    private mog e;
    private View f;
    private FrameLayout h;
    private ViewGroup i;
    private TextView j;
    private TextView k;
    private gkc l;
    private g28 n;
    private int g = -1;
    private boolean m = false;
    private boolean o = false;
    private TransAnimLayout.d p = new f();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String a2 = LightOffDialog.a();
            tgh.b(a2, "onClick:" + LightOffDialog.b(LightOffDialog.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            String a2 = LightOffDialog.a();
            tgh.b(a2, "onLongClick:" + LightOffDialog.b(LightOffDialog.this));
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                LightOffDialog.this.q(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout.LayoutParams f6585a;

        public d(FrameLayout.LayoutParams layoutParams) {
            this.f6585a = layoutParams;
        }

        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("766e21b6", new Object[]{this, drawable});
            } else if (drawable != null) {
                LightOffDialog.i(LightOffDialog.this, new TransAnimLayout(LightOffDialog.j(LightOffDialog.this)));
                if (LightOffDialog.k(LightOffDialog.this).h) {
                    LightOffDialog.h(LightOffDialog.this).setPullInnerBottomMargin(mr7.a(56.0f));
                }
                LightOffDialog.h(LightOffDialog.this).init(LightOffDialog.k(LightOffDialog.this).c, drawable, true);
                LightOffDialog.h(LightOffDialog.this).addPullInnerView(LightOffDialog.l(LightOffDialog.this));
                LightOffDialog.m(LightOffDialog.this).addView(LightOffDialog.h(LightOffDialog.this), this.f6585a);
                LightOffDialog.h(LightOffDialog.this).setTransListener(LightOffDialog.n(LightOffDialog.this));
                LightOffDialog.h(LightOffDialog.this).runEnterAnim(LightOffDialog.o(LightOffDialog.this));
            } else {
                LightOffDialog.m(LightOffDialog.this).addView(LightOffDialog.l(LightOffDialog.this), this.f6585a);
                LightOffDialog.p(LightOffDialog.this).d(LightOffDialog.m(LightOffDialog.this));
                LightOffDialog.c(LightOffDialog.this).setVisibility(0);
                LightOffDialog.d(LightOffDialog.this).setVisibility(0);
                LightOffDialog.l(LightOffDialog.this).setVisibility(0);
                LightOffDialog.h(LightOffDialog.this).hideTransView();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6586a;
        public final /* synthetic */ g b;

        public e(LightOffDialog lightOffDialog, int i, g gVar) {
            this.f6586a = i;
            this.b = gVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (!(drawable == null || succPhenixEvent.getDrawable().getBitmap() == null || succPhenixEvent.getDrawable().getBitmap().isRecycled() || this.f6586a == -1)) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i = this.f6586a;
                if (i != intrinsicHeight) {
                    intrinsicWidth = (intrinsicWidth * i) / intrinsicHeight;
                }
                drawable.setBounds(0, 0, intrinsicWidth, i);
            }
            g gVar = this.b;
            if (gVar != null) {
                ((d) gVar).a(drawable);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f extends TransAnimLayout.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/core/standard/widget/lightoff/LightOffDialog$6");
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.d
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a8a436b9", new Object[]{this})).booleanValue();
            }
            if (LightOffDialog.l(LightOffDialog.this) instanceof fkc) {
                return ((fkc) LightOffDialog.l(LightOffDialog.this)).isCurrentViewAllowPull();
            }
            return false;
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.d
        public void b(FrameLayout.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f659760", new Object[]{this, layoutParams});
                return;
            }
            LightOffDialog.p(LightOffDialog.this).d(LightOffDialog.m(LightOffDialog.this));
            LightOffDialog.c(LightOffDialog.this).setVisibility(0);
            LightOffDialog.d(LightOffDialog.this).setVisibility(0);
            LightOffDialog.l(LightOffDialog.this).setVisibility(0);
            LightOffDialog.h(LightOffDialog.this).hideTransView();
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.d
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("601a70e0", new Object[]{this});
            } else {
                tgh.b(LightOffDialog.a(), "enterAnimStart");
            }
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.d
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77af6893", new Object[]{this});
            } else if (!tq4.e(LightOffDialog.j(LightOffDialog.this))) {
                LightOffDialog.f(LightOffDialog.this, false);
                LightOffDialog.this.dismiss();
            }
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.d
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae04205a", new Object[]{this});
            } else if (!LightOffDialog.e(LightOffDialog.this)) {
                LightOffDialog.h(LightOffDialog.this).showTransImage(LightOffDialog.g(LightOffDialog.this));
                LightOffDialog.l(LightOffDialog.this).setVisibility(8);
                LightOffDialog.c(LightOffDialog.this).setVisibility(4);
                LightOffDialog.d(LightOffDialog.this).setVisibility(4);
            }
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.d
        public void f(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a3cb62d", new Object[]{this, new Float(f)});
            } else {
                LightOffDialog.o(LightOffDialog.this).setAlpha(1.0f - f);
            }
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.d
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47202f1c", new Object[]{this});
                return;
            }
            LightOffDialog.f(LightOffDialog.this, false);
            LightOffDialog.c(LightOffDialog.this).setVisibility(0);
            LightOffDialog.d(LightOffDialog.this).setVisibility(0);
            LightOffDialog.l(LightOffDialog.this).setVisibility(0);
            LightOffDialog.p(LightOffDialog.this).f(0);
            LightOffDialog.h(LightOffDialog.this).hideTransView();
            LightOffDialog.o(LightOffDialog.this).setAlpha(1.0f);
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.d
        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98b2132f", new Object[]{this});
                return;
            }
            tgh.b(LightOffDialog.a(), "onStartPull");
            LightOffDialog.f(LightOffDialog.this, true);
            LightOffDialog.c(LightOffDialog.this).setVisibility(4);
            LightOffDialog.d(LightOffDialog.this).setVisibility(4);
            LightOffDialog.l(LightOffDialog.this).setVisibility(4);
            LightOffDialog.p(LightOffDialog.this).f(8);
            LightOffDialog.h(LightOffDialog.this).showTransImage(LightOffDialog.g(LightOffDialog.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface g {
    }

    static {
        t2o.a(438304814);
    }

    public LightOffDialog(Context context, mog mogVar, oog oogVar) {
        super(context, 16973840);
        this.d = context;
        this.e = mogVar;
        this.l = oogVar;
        this.n = new g28(mogVar, oogVar);
        setOnDismissListener(this);
        setOnShowListener(this);
        this.e.getClass();
        LightOffGalleryView lightOffGalleryView = new LightOffGalleryView(this.e);
        lightOffGalleryView.setItemListener(this.l);
        lightOffGalleryView.bindData(this.e.e);
        this.f6581a = lightOffGalleryView;
        lightOffGalleryView.setOnClickListener(new a());
        this.f6581a.setOnLongClickListener(new b());
        this.f6581a.addOnPageChangeListener(this);
        this.f6581a.setCurrentItem(this.e.f);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return q;
    }

    public static /* synthetic */ int b(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20ffaca1", new Object[]{lightOffDialog})).intValue();
        }
        return lightOffDialog.g;
    }

    public static /* synthetic */ FrameLayout c(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("430e66bd", new Object[]{lightOffDialog});
        }
        return lightOffDialog.h;
    }

    public static /* synthetic */ ViewGroup d(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("b9ec2e98", new Object[]{lightOffDialog});
        }
        return lightOffDialog.i;
    }

    public static /* synthetic */ boolean e(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d47e522", new Object[]{lightOffDialog})).booleanValue();
        }
        return lightOffDialog.o;
    }

    public static /* synthetic */ boolean f(LightOffDialog lightOffDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8db814b8", new Object[]{lightOffDialog, new Boolean(z)})).booleanValue();
        }
        lightOffDialog.o = z;
        return z;
    }

    public static /* synthetic */ Drawable g(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("b3c5edfb", new Object[]{lightOffDialog});
        }
        return lightOffDialog.t();
    }

    public static /* synthetic */ TransAnimLayout h(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransAnimLayout) ipChange.ipc$dispatch("99bbb315", new Object[]{lightOffDialog});
        }
        return lightOffDialog.c;
    }

    public static /* synthetic */ TransAnimLayout i(LightOffDialog lightOffDialog, TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransAnimLayout) ipChange.ipc$dispatch("cc10dbcb", new Object[]{lightOffDialog, transAnimLayout});
        }
        lightOffDialog.c = transAnimLayout;
        return transAnimLayout;
    }

    public static /* synthetic */ Object ipc$super(LightOffDialog lightOffDialog, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/core/standard/widget/lightoff/LightOffDialog");
    }

    public static /* synthetic */ Context j(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("87694028", new Object[]{lightOffDialog});
        }
        return lightOffDialog.d;
    }

    public static /* synthetic */ mog k(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mog) ipChange.ipc$dispatch("485e7d4a", new Object[]{lightOffDialog});
        }
        return lightOffDialog.e;
    }

    public static /* synthetic */ ViewPager l(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("a08e9199", new Object[]{lightOffDialog});
        }
        return lightOffDialog.f6581a;
    }

    public static /* synthetic */ FrameLayout m(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c53f9106", new Object[]{lightOffDialog});
        }
        return lightOffDialog.b;
    }

    public static /* synthetic */ TransAnimLayout.d n(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransAnimLayout.d) ipChange.ipc$dispatch("32f8b862", new Object[]{lightOffDialog});
        }
        return lightOffDialog.p;
    }

    public static /* synthetic */ View o(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b93c2177", new Object[]{lightOffDialog});
        }
        return lightOffDialog.f;
    }

    public static /* synthetic */ g28 p(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g28) ipChange.ipc$dispatch("1ec1b7a2", new Object[]{lightOffDialog});
        }
        return lightOffDialog.n;
    }

    private ViewGroup r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("fbcef430", new Object[]{this});
        }
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setBackgroundResource(R.drawable.lightoff_index_tag_bg);
        int a2 = fc7.a(this.d, 2.0f);
        int a3 = fc7.a(this.d, 3.0f);
        linearLayout.setPadding(a3, a2, a3, a2);
        TextView s2 = s(this.d);
        this.j = s2;
        linearLayout.addView(s2);
        TextView s3 = s(this.d);
        s3.setText("/");
        linearLayout.addView(s3);
        TextView s4 = s(this.d);
        this.k = s4;
        linearLayout.addView(s4);
        return linearLayout;
    }

    private TextView s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("98af10c7", new Object[]{this, context});
        }
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(1, 13.0f);
        return textView;
    }

    private Drawable t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("ea55ec0f", new Object[]{this});
        }
        ViewPager viewPager = this.f6581a;
        if (viewPager instanceof fkc) {
            return ((fkc) viewPager).getCurrentViewSnapshot();
        }
        return null;
    }

    private void u(FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7be147", new Object[]{this, layoutParams});
            return;
        }
        this.o = false;
        this.f.setAlpha(0.0f);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.f6581a.setVisibility(4);
        w(dr0.a(this.e.d), this.d, -1, new d(layoutParams));
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        this.b = new FrameLayout(this.d);
        View view = new View(this.d);
        this.f = view;
        view.setBackgroundColor(-16777216);
        this.b.addView(this.f, 0, new FrameLayout.LayoutParams(-1, -1));
        this.h = new FrameLayout(this.d);
        TUrlImageView tUrlImageView = new TUrlImageView(this.d);
        tUrlImageView.setImageUrl(r);
        int a2 = fc7.a(this.d, 24.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.leftMargin = fc7.a(this.d, 10.0f);
        layoutParams.gravity = 16;
        this.h.addView(tUrlImageView, layoutParams);
        tUrlImageView.setClickable(true);
        tUrlImageView.setOnClickListener(new c());
        this.i = r();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        mog mogVar = this.e;
        if (mogVar.c == null || mogVar.d == null) {
            this.b.addView(this.f6581a, layoutParams2);
        } else {
            this.m = true;
            u(layoutParams2);
        }
        this.b.addView(this.h, new FrameLayout.LayoutParams(-1, fc7.a(this.d, 44.0f)));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 5;
        layoutParams3.topMargin = fc7.a(this.d, 60.0f);
        layoutParams3.rightMargin = fc7.a(this.d, 16.0f);
        this.b.addView(this.i, layoutParams3);
        y();
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e08e948", new Object[]{this});
            return;
        }
        this.j.setText(String.valueOf(this.f6581a.getCurrentItem() + 1));
        this.k.setText(String.valueOf(this.f6581a.getAdapter().getCount()));
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (getWindow() != null) {
            v();
            setContentView(this.b);
            getWindow().setLayout(-1, -1);
            setOnKeyListener(this);
            if (!this.m) {
                this.n.d(this.b);
            }
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        gkc gkcVar = this.l;
        if (gkcVar != null) {
            gkcVar.onDismiss(dialogInterface);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        q(false);
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else {
            this.l.onPageScrollStateChanged(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f2), new Integer(i2)});
        } else {
            this.l.onPageScrolled(i, f2, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else if (this.b != null && this.e != null) {
            this.g = i;
            y();
            List<LightOffItemModel> list = this.e.e;
            if (list == null || i >= ((ArrayList) list).size()) {
                jSONObject = null;
            } else {
                jSONObject = ((LightOffItemModel) ((ArrayList) this.e.e).get(i)).originData;
            }
            this.f6581a.getChildAt(i);
            this.l.b(jSONObject, i);
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64de6c3", new Object[]{this, dialogInterface});
            return;
        }
        gkc gkcVar = this.l;
        if (gkcVar != null) {
            gkcVar.onShow(dialogInterface);
        }
    }

    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8249dc35", new Object[]{this, new Boolean(z)});
            return;
        }
        this.n.f(8);
        TransAnimLayout transAnimLayout = this.c;
        if (transAnimLayout == null || z) {
            dismiss();
        } else {
            transAnimLayout.runExitAnim(this.f);
        }
    }

    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
        } else {
            this.f6581a.setCurrentItem(i, false);
        }
    }

    public void w(String str, Context context, int i, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccfe523a", new Object[]{this, str, context, new Integer(i), gVar});
        } else {
            s0m.B().N0(context).T(str).preloadWithSmall(false).scaleFromLarge(false).succListener(new e(this, i, gVar)).fetch();
        }
    }

    public void x(LightOffFloatModel lightOffFloatModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc5b16a", new Object[]{this, lightOffFloatModel});
            return;
        }
        g28 g28Var = this.n;
        if (g28Var != null && lightOffFloatModel != null) {
            g28Var.g(lightOffFloatModel);
        }
    }
}
