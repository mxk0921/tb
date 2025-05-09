package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class w43 extends d32<Object, yr3, CaptureManager> implements pjb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final String TAG = "AutoSize__Bottom_NavBarViewV1";
    public final ViewGroup l;
    public final ojb m;
    public View n;
    public TextView o;
    public View p;
    public TextView q;
    public TUrlImageView r;
    public TextView s;
    public TUrlImageView t;
    public int u = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/CaptureBottomAreaNavBarViewV1$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            w43.this.X().setLayoutParams(new LinearLayout.LayoutParams(-1, p1p.a(w43.this.m().M() ? 55.0f : 45.0f)));
            ViewGroup X = w43.this.X();
            View P = w43.P(w43.this);
            if (P != null) {
                X.addView(P);
                w43.V(w43.this, 0);
                w43.U(w43.this, false);
                return;
            }
            ckf.y("rootView");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {
        static {
            t2o.a(481296516);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
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
            mzu.i(s63.ALBUM_PAGE_NAME, "ClickTab", "tab", "album");
            w43.V(w43.this, 0);
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
            mzu.i(s63.ALBUM_PAGE_NAME, "ClickTab", "tab", q5c.HISTORY);
            w43.V(w43.this, 1);
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
            mzu.i(s63.ALBUM_PAGE_NAME, "ClickTab", "tab", "browsed");
            w43.V(w43.this, 2);
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
            } else {
                w43.U(w43.this, !w43.O(w43.this).x());
            }
        }
    }

    static {
        t2o.a(481296514);
        t2o.a(481296540);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w43(Activity activity, rcc<yr3, CaptureManager> rccVar, ViewGroup viewGroup, ojb ojbVar) {
        super(activity, rccVar, false);
        ckf.g(activity, "activity");
        ckf.g(viewGroup, "container");
        ckf.g(ojbVar, "navStateChangeListener");
        this.l = viewGroup;
        this.m = ojbVar;
        vpt.g("CaptureBottomAreaNavBarViewV1_addView", new a());
    }

    public static final /* synthetic */ int N(w43 w43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8093f0e", new Object[]{w43Var})).intValue();
        }
        return w43Var.u;
    }

    public static final /* synthetic */ ojb O(w43 w43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ojb) ipChange.ipc$dispatch("582e438e", new Object[]{w43Var});
        }
        return w43Var.m;
    }

    public static final /* synthetic */ View P(w43 w43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("aeecd781", new Object[]{w43Var});
        }
        return w43Var.n;
    }

    public static final /* synthetic */ TextView Q(w43 w43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("89b4dd60", new Object[]{w43Var});
        }
        return w43Var.o;
    }

    public static final /* synthetic */ TextView R(w43 w43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("86547815", new Object[]{w43Var});
        }
        return w43Var.s;
    }

    public static final /* synthetic */ TextView S(w43 w43Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("a4640bb9", new Object[]{w43Var});
        }
        return w43Var.q;
    }

    public static final /* synthetic */ void T(w43 w43Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f56a8bc", new Object[]{w43Var, new Integer(i)});
        } else {
            w43Var.u = i;
        }
    }

    public static final /* synthetic */ void U(w43 w43Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2feb1779", new Object[]{w43Var, new Boolean(z)});
        } else {
            w43Var.Y(z);
        }
    }

    public static final /* synthetic */ void V(w43 w43Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd84fd66", new Object[]{w43Var, new Integer(i)});
        } else {
            w43Var.Z(i);
        }
    }

    public static final /* synthetic */ void W(w43 w43Var, TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad384e37", new Object[]{w43Var, textView, new Boolean(z)});
        } else {
            w43Var.a0(textView, z);
        }
    }

    public static /* synthetic */ Object ipc$super(w43 w43Var, String str, Object... objArr) {
        if (str.hashCode() == -3136315) {
            super.K();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/CaptureBottomAreaNavBarViewV1");
    }

    public final ViewGroup X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("c9c16903", new Object[]{this});
        }
        return this.l;
    }

    public final void Y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4155ee0", new Object[]{this, new Boolean(z)});
            return;
        }
        agh.h(TAG, ckf.p("switchPageFoldState: ", Boolean.valueOf(z)));
        j(z);
        this.m.w(z);
    }

    public final void Z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6978311", new Object[]{this, new Integer(i)});
        } else {
            vpt.g("switchShowType", new x43(this, i));
        }
    }

    public final void a0(TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f419cd8", new Object[]{this, textView, new Boolean(z)});
        } else {
            vpt.g("updateTabBtnState", new y43(z, textView));
        }
    }

    @Override // tb.pjb
    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9dc77d", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.pjb
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d7a6c4", new Object[]{this, new Boolean(z)});
        } else if (z) {
            TUrlImageView tUrlImageView = this.r;
            if (tUrlImageView != null) {
                tUrlImageView.setVisibility(0);
                TUrlImageView tUrlImageView2 = this.r;
                if (tUrlImageView2 != null) {
                    tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01D1YGyn1mzxeLjgEyp_!!6000000005026-49-tps-224-140.webp");
                } else {
                    ckf.y("tabHistoryIv");
                    throw null;
                }
            } else {
                ckf.y("tabHistoryIv");
                throw null;
            }
        } else {
            TUrlImageView tUrlImageView3 = this.r;
            if (tUrlImageView3 != null) {
                tUrlImageView3.setVisibility(8);
            } else {
                ckf.y("tabHistoryIv");
                throw null;
            }
        }
    }

    @Override // tb.pjb
    public void j(boolean z) {
        String str;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6be5b61", new Object[]{this, new Boolean(z)});
            return;
        }
        agh.h(TAG, ckf.p("updateFoldBtnState isFoldUp=", Boolean.valueOf(z)));
        if (z) {
            mzu.k(s63.ALBUM_PAGE_NAME, "ExpandOuterAlbum", new String[0]);
        }
        TUrlImageView tUrlImageView = this.t;
        if (tUrlImageView != null) {
            if (z) {
                str = "https://gw.alicdn.com/imgextra/i2/O1CN01pehkcx1RuMsksuapY_!!6000000002171-49-tps-112-112.webp";
            } else {
                str = "https://gw.alicdn.com/imgextra/i4/O1CN01qQBFNc1mEKSW7XGpo_!!6000000004922-49-tps-112-112.webp";
            }
            tUrlImageView.setImageUrl(str);
            TUrlImageView tUrlImageView2 = this.t;
            if (tUrlImageView2 != null) {
                StringBuilder sb = new StringBuilder();
                if (z) {
                    i = R.string.taobao_app_1007_fold;
                } else {
                    i = R.string.taobao_app_1007_expand;
                }
                sb.append(Localization.q(i));
                sb.append((char) 65292);
                sb.append(Localization.q(R.string.taobao_app_1007_button));
                tUrlImageView2.setContentDescription(sb.toString());
                return;
            }
            ckf.y("foldBtn");
            throw null;
        }
        ckf.y("foldBtn");
        throw null;
    }

    @Override // tb.d32
    public void K() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        super.K();
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.feis_view_capture_bottom_area_nav_v1, (ViewGroup) null, false);
        ckf.f(inflate, "from(activity)\n      .in…area_nav_v1, null, false)");
        this.n = inflate;
        View findViewById = inflate.findViewById(R.id.tab_album);
        TextView textView = (TextView) findViewById;
        float f2 = 16.0f;
        textView.setTextSize(1, m().M() ? 21.0f : 16.0f);
        textView.setOnClickListener(new c());
        ckf.f(findViewById, "rootView.findViewById<Te…TYPE_ALBUM)\n      }\n    }");
        this.o = (TextView) findViewById;
        View view = this.n;
        if (view != null) {
            View findViewById2 = view.findViewById(R.id.fl_tab_history);
            ViewProxy.setOnClickListener(findViewById2, new d());
            ckf.f(findViewById2, "rootView.findViewById<Vi…PE_HISTORY)\n      }\n    }");
            this.p = findViewById2;
            View view2 = this.n;
            if (view2 != null) {
                View findViewById3 = view2.findViewById(R.id.tab_history);
                ((TextView) findViewById3).setTextSize(1, m().M() ? 21.0f : 16.0f);
                ckf.f(findViewById3, "rootView.findViewById<Te…Mode) 21f else 16f)\n    }");
                this.q = (TextView) findViewById3;
                View view3 = this.n;
                if (view3 != null) {
                    View findViewById4 = view3.findViewById(R.id.iv_history_tab_hint);
                    ckf.f(findViewById4, "rootView.findViewById(R.id.iv_history_tab_hint)");
                    this.r = (TUrlImageView) findViewById4;
                    View view4 = this.n;
                    if (view4 != null) {
                        View findViewById5 = view4.findViewById(R.id.tab_browsed);
                        TextView textView2 = (TextView) findViewById5;
                        if (m().M()) {
                            f2 = 21.0f;
                        }
                        textView2.setTextSize(1, f2);
                        textView2.setOnClickListener(new e());
                        ckf.f(findViewById5, "rootView.findViewById<Te…PE_BROWSED)\n      }\n    }");
                        TextView textView3 = (TextView) findViewById5;
                        this.s = textView3;
                        if (!lg4.V()) {
                            i = 8;
                        }
                        textView3.setVisibility(i);
                        View view5 = this.n;
                        if (view5 != null) {
                            View findViewById6 = view5.findViewById(R.id.btn_fold);
                            TUrlImageView tUrlImageView = (TUrlImageView) findViewById6;
                            tUrlImageView.setOnClickListener(new f());
                            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01qQBFNc1mEKSW7XGpo_!!6000000004922-49-tps-112-112.webp");
                            ViewGroup.LayoutParams layoutParams = tUrlImageView.getLayoutParams();
                            int a2 = p1p.a(m().M() ? 40.0f : 30.0f);
                            layoutParams.height = a2;
                            layoutParams.width = a2;
                            tUrlImageView.setLayoutParams(layoutParams);
                            ckf.f(findViewById6, "rootView.findViewById<TU…idth = size\n      }\n    }");
                            this.t = (TUrlImageView) findViewById6;
                            return;
                        }
                        ckf.y("rootView");
                        throw null;
                    }
                    ckf.y("rootView");
                    throw null;
                }
                ckf.y("rootView");
                throw null;
            }
            ckf.y("rootView");
            throw null;
        }
        ckf.y("rootView");
        throw null;
    }
}
