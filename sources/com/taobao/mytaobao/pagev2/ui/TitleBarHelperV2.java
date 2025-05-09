package com.taobao.mytaobao.pagev2.ui;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.message.lab.comfrm.util.ExtentionFunctionKt;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.cpt;
import tb.g1a;
import tb.p3j;
import tb.pgj;
import tb.qd6;
import tb.t2o;
import tb.tot;
import tb.u3j;
import tb.uuu;
import tb.xhv;
import tb.y14;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TitleBarHelperV2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public Runnable f11307a;
    public FrameLayout b;
    public TextView c;
    public TextView d;
    public View e;
    public TextView f;
    public View g;
    public TextView h;
    public View i;
    public TextView j;
    public g1a<? super Integer, xhv> o;
    public final int k = DensityUtil.dip2px(Globals.getApplication(), 14.0f);
    public final int l = DensityUtil.dip2px(Globals.getApplication(), 10.0f);
    public final int m = DensityUtil.dip2px(Globals.getApplication(), 7.0f);
    public final int n = DensityUtil.dip2px(Globals.getApplication(), 1.0f);
    public int p = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* renamed from: com.taobao.mytaobao.pagev2.ui.TitleBarHelperV2$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class RunnableC0635a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final RunnableC0635a INSTANCE = new RunnableC0635a();

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TBS.Ext.commitEvent(u3j.b, 2101, "Page_MyTaobao_click_address", null, null, "spm=a2141.7631743.1.51");
                }
            }
        }

        static {
            t2o.a(745537997);
        }

        public a() {
        }

        public final int a(ThemeData themeData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("37912b24", new Object[]{this, themeData})).intValue();
            }
            ckf.h(themeData, "themeData");
            String str = themeData.actionBarBackgroundColor;
            if (str == null) {
                return -16777216;
            }
            if (str.length() <= 0) {
                str = null;
            }
            return (str == null || y14.c(Color.parseColor(str))) ? -16777216 : -1;
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a140158", new Object[]{this});
                return;
            }
            Nav.from(Globals.getApplication()).toUri("https://my.m.taobao.com/deliver/wap_deliver_address_list.htm?spm=a2141.7631743.1.51");
            MtbGlobalEnv.i = "https://my.m.taobao.com/deliver/wap_deliver_address_list.htm?spm=a2141.7631743.1.51";
            p3j.g(RunnableC0635a.INSTANCE);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                qd6.Companion.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final c INSTANCE = new c();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                TitleBarHelperV2.Companion.b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11309a;

        public e(String str) {
            this.f11309a = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (this.f11309a != null) {
                ckf.c(view, AdvanceSetting.NETWORK_TYPE);
                Nav.from(view.getContext()).toUri(this.f11309a);
                MtbGlobalEnv.i = this.f11309a;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11310a;

        public f(String str) {
            this.f11310a = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (this.f11310a != null) {
                ckf.c(view, AdvanceSetting.NETWORK_TYPE);
                Nav.from(view.getContext()).toUri(this.f11310a);
                MtbGlobalEnv.i = this.f11310a;
            }
        }
    }

    static {
        t2o.a(745537996);
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4713ac41", new Object[]{this, context});
        } else {
            g(context);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4343a3", new Object[]{this});
            return;
        }
        int o = MtbGlobalEnv.o();
        if (o != this.p) {
            this.p = o;
            if (o == 1) {
                TextView textView = this.c;
                if (textView != null) {
                    textView.setTextSize(2, 17.0f);
                }
                TextView textView2 = this.c;
                if (textView2 != null) {
                    textView2.setTypeface(null, 1);
                }
                TextView textView3 = this.d;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                View view = this.e;
                if (view != null) {
                    view.setVisibility(0);
                }
                TextView textView4 = this.f;
                if (textView4 != null) {
                    textView4.setTextSize(2, 13.0f);
                }
                TextView textView5 = this.f;
                if (textView5 != null) {
                    int i = this.m;
                    textView5.setPadding(i, 0, i, 0);
                }
                TextView textView6 = this.f;
                if (textView6 != null) {
                    textView6.setVisibility(0);
                }
                View view2 = this.g;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                TextView textView7 = this.h;
                if (textView7 != null) {
                    int i2 = this.m;
                    textView7.setPadding(i2, 0, i2, 0);
                }
                TextView textView8 = this.h;
                if (textView8 != null) {
                    textView8.setTextSize(2, 13.0f);
                }
                View view3 = this.i;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                TextView textView9 = this.j;
                if (textView9 != null) {
                    textView9.setPadding(this.m, 0, this.l, 0);
                }
                TextView textView10 = this.j;
                if (textView10 != null) {
                    textView10.setTextSize(2, 13.0f);
                }
            } else if (o != 2) {
                TextView textView11 = this.c;
                if (textView11 != null) {
                    textView11.setTextSize(2, 17.0f);
                }
                TextView textView12 = this.c;
                if (textView12 != null) {
                    textView12.setTypeface(null, 0);
                }
                TextView textView13 = this.d;
                if (textView13 != null) {
                    textView13.setVisibility(8);
                }
                View view4 = this.e;
                if (view4 != null) {
                    view4.setVisibility(8);
                }
                TextView textView14 = this.f;
                if (textView14 != null) {
                    textView14.setVisibility(8);
                }
                View view5 = this.g;
                if (view5 != null) {
                    view5.setVisibility(8);
                }
                TextView textView15 = this.h;
                if (textView15 != null) {
                    textView15.setPadding(this.l, 0, 0, 0);
                }
                TextView textView16 = this.h;
                if (textView16 != null) {
                    textView16.setTextSize(2, 16.0f);
                }
                View view6 = this.i;
                if (view6 != null) {
                    view6.setVisibility(8);
                }
                TextView textView17 = this.j;
                if (textView17 != null) {
                    int i3 = this.l;
                    textView17.setPadding(i3, 0, i3, 0);
                }
                TextView textView18 = this.j;
                if (textView18 != null) {
                    textView18.setTextSize(2, 16.0f);
                }
            } else {
                TextView textView19 = this.c;
                if (textView19 != null) {
                    textView19.setTextSize(2, 16.0f);
                }
                TextView textView20 = this.c;
                if (textView20 != null) {
                    textView20.setTypeface(null, 1);
                }
                TextView textView21 = this.d;
                if (textView21 != null) {
                    textView21.setVisibility(8);
                }
                View view7 = this.e;
                if (view7 != null) {
                    view7.setVisibility(8);
                }
                TextView textView22 = this.f;
                if (textView22 != null) {
                    textView22.setTextSize(2, 14.0f);
                }
                TextView textView23 = this.f;
                if (textView23 != null) {
                    textView23.setPadding(this.k, 0, 0, 0);
                }
                TextView textView24 = this.f;
                if (textView24 != null) {
                    textView24.setVisibility(0);
                }
                View view8 = this.g;
                if (view8 != null) {
                    view8.setVisibility(8);
                }
                TextView textView25 = this.h;
                if (textView25 != null) {
                    textView25.setPadding(this.k, 0, 0, 0);
                }
                TextView textView26 = this.h;
                if (textView26 != null) {
                    textView26.setTextSize(2, 14.0f);
                }
                View view9 = this.i;
                if (view9 != null) {
                    view9.setVisibility(8);
                }
                TextView textView27 = this.j;
                if (textView27 != null) {
                    textView27.setPadding(this.k, 0, this.l, 0);
                }
                TextView textView28 = this.j;
                if (textView28 != null) {
                    textView28.setTextSize(2, 14.0f);
                }
            }
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        Runnable runnable = this.f11307a;
        if (runnable != null) {
            uuu.b.removeCallbacks(runnable);
        }
    }

    public final FrameLayout e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b7592931", new Object[]{this});
        }
        return this.b;
    }

    public final void f(Context context, MTPtrRecyclerView mTPtrRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e807882f", new Object[]{this, context, mTPtrRecyclerView});
            return;
        }
        ckf.h(context, "ctx");
        ckf.h(mTPtrRecyclerView, "rv");
        final int dip2px = DisplayUtil.dip2px(20.0f) * (-1);
        mTPtrRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.mytaobao.pagev2.ui.TitleBarHelperV2$initViews$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(TitleBarHelperV2$initViews$1 titleBarHelperV2$initViews$1, String str, Object... objArr) {
                if (str.hashCode() == -1177043419) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/ui/TitleBarHelperV2$initViews$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                RecyclerView.ViewHolder findFirstVisibleViewHoler;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                ckf.h(recyclerView, OrderConfigs.RECYCLERVIEW);
                super.onScrolled(recyclerView, i, i2);
                if (i2 != 0 && (findFirstVisibleViewHoler = ExtentionFunctionKt.findFirstVisibleViewHoler(recyclerView)) != null) {
                    if (findFirstVisibleViewHoler.getAdapterPosition() > 0) {
                        FrameLayout e2 = TitleBarHelperV2.this.e();
                        if (e2 != null) {
                            e2.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    View view = findFirstVisibleViewHoler.itemView;
                    ckf.c(view, "firstVH.itemView");
                    if (view.getHeight() > 0) {
                        View view2 = findFirstVisibleViewHoler.itemView;
                        ckf.c(view2, "firstVH.itemView");
                        if (view2.getTop() < dip2px) {
                            FrameLayout e3 = TitleBarHelperV2.this.e();
                            if (e3 != null) {
                                e3.setVisibility(0);
                                return;
                            }
                            return;
                        }
                    }
                    FrameLayout e4 = TitleBarHelperV2.this.e();
                    if (e4 != null) {
                        e4.setVisibility(4);
                    }
                }
            }
        });
        d(context);
        a(context);
    }

    public final void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2208e1b7", new Object[]{this, context});
            return;
        }
        d dVar = new d(context);
        uuu.b.postDelayed(dVar, 2000L);
        this.f11307a = dVar;
    }

    public final void h(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b3a318", new Object[]{this, onClickListener});
            return;
        }
        ckf.h(onClickListener, "clickListener");
        FrameLayout frameLayout = this.b;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(onClickListener);
        }
    }

    public final void i(g1a<? super Integer, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a26530d", new Object[]{this, g1aVar});
        } else {
            this.o = g1aVar;
        }
    }

    public final void j(String str, String str2, String str3, String str4, String str5) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cf59ed", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        k();
        b();
        if (!(str == null || (textView = this.c) == null)) {
            textView.setText(str);
        }
        TextView textView2 = this.h;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        TextView textView3 = this.h;
        if (textView3 != null) {
            textView3.setOnClickListener(new e(str3));
        }
        if (TextUtils.isEmpty(str2)) {
            TextView textView4 = this.h;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            View view = this.i;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        TextView textView5 = this.j;
        if (textView5 != null) {
            textView5.setText(str4);
        }
        TextView textView6 = this.j;
        if (textView6 != null) {
            textView6.setOnClickListener(new f(str5));
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82457a7e", new Object[]{this});
            return;
        }
        ThemeData e2 = cpt.c().e("mytaobao");
        if (e2 != null) {
            int a2 = Companion.a(e2);
            TextView textView = this.c;
            if (textView != null) {
                textView.setTextColor(a2);
            }
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setTextColor(a2);
            }
            TextView textView3 = this.f;
            if (textView3 != null) {
                textView3.setTextColor(a2);
            }
            TextView textView4 = this.h;
            if (textView4 != null) {
                textView4.setTextColor(a2);
            }
            TextView textView5 = this.j;
            if (textView5 != null) {
                textView5.setTextColor(a2);
            }
            g1a<? super Integer, xhv> g1aVar = this.o;
            if (g1aVar != null) {
                g1aVar.invoke(Integer.valueOf(a2));
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        public d(Context context) {
            this.b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            FrameLayout e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ThemeFrameLayout b = cpt.c().b(this.b, new tot("mytaobao", 1, pgj.b()));
            if (!(b == null || (e = TitleBarHelperV2.this.e()) == null)) {
                e.addView(b, 0, new FrameLayout.LayoutParams(-1, -1));
            }
            TitleBarHelperV2.this.k();
        }
    }

    public final void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390ef174", new Object[]{this, context});
            return;
        }
        int d2 = pgj.d();
        int dip2px = DensityUtil.dip2px(context, 48.0f) + d2;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(0, d2, DensityUtil.dip2px(context, 6.0f), 0);
        linearLayout.setOrientation(0);
        linearLayout.setVerticalGravity(16);
        TextView textView = new TextView(context);
        textView.setText(R.string.mytaobao_title);
        textView.setGravity(16);
        int i = (int) 4279308561L;
        textView.setTextColor(i);
        textView.setMaxLines(1);
        textView.setTextSize(2, 17.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.c = textView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        layoutParams.leftMargin = DensityUtil.dip2px(context, 16.0f);
        linearLayout.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        int i2 = this.m;
        textView2.setPadding(i2, 0, i2, 0);
        textView2.setTextColor(i);
        textView2.setTextSize(2, 13.0f);
        textView2.setText("切换账号");
        textView2.setVisibility(8);
        textView2.setOnClickListener(b.INSTANCE);
        this.d = textView2;
        linearLayout.addView(textView2, -2, -1);
        View view = new View(context);
        view.setBackgroundColor(1090519039);
        view.setVisibility(8);
        this.e = view;
        linearLayout.addView(view, this.n, this.k);
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        int i3 = this.m;
        textView3.setPadding(i3, 0, i3, 0);
        textView3.setTextColor(i);
        textView3.setTextSize(2, 13.0f);
        textView3.setText("地址");
        textView3.setVisibility(8);
        textView3.setOnClickListener(c.INSTANCE);
        this.f = textView3;
        linearLayout.addView(textView3, -2, -1);
        View view2 = new View(context);
        view2.setBackgroundColor(1090519039);
        view2.setVisibility(8);
        this.g = view;
        linearLayout.addView(view2, this.n, this.k);
        TextView textView4 = new TextView(context);
        textView4.setGravity(17);
        textView4.setPadding(this.l, 0, 0, 0);
        textView4.setTextColor(i);
        textView4.setTextSize(2, 16.0f);
        textView4.setText("官方客服");
        this.h = textView4;
        linearLayout.addView(textView4, -2, -1);
        View view3 = new View(context);
        view3.setBackgroundColor(1090519039);
        view3.setVisibility(8);
        this.i = view3;
        linearLayout.addView(view3, this.n, this.k);
        TextView textView5 = new TextView(context);
        textView5.setGravity(17);
        int i4 = this.l;
        textView5.setPadding(i4, 0, i4, 0);
        textView5.setTextColor(i);
        textView5.setTextSize(2, 16.0f);
        textView5.setText("设置");
        this.j = textView5;
        linearLayout.addView(textView5, -2, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor((int) 4294111986L);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, dip2px));
        frameLayout.addView(linearLayout, -1, -1);
        frameLayout.setVisibility(4);
        this.b = frameLayout;
        b();
    }
}
