package tb;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.tool.base.CaptureManager;
import com.etao.feimagesearch.capture.tool.base.CaptureRainbowManager;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class y33 extends n63 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile boolean n;
    public TextView o;
    public TextView p;
    public TextView q;
    public TUrlImageView r;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View X = y33.this.X();
            if (X != null) {
                if (CaptureRainbowManager.Companion.a().d()) {
                    f = 55.0f;
                } else {
                    f = 45.0f;
                }
                X.setLayoutParams(new FrameLayout.LayoutParams(-1, p1p.a(f)));
            }
            y33.p0(y33.this, 0);
            y33.o0(y33.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            mzu.i(s63.ALBUM_PAGE_NAME, "ClickTab", "tab", "album");
            y33.p0(y33.this, 0);
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
            mzu.i(s63.ALBUM_PAGE_NAME, "ClickTab", "tab", q5c.HISTORY);
            y33.p0(y33.this, 1);
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
            mzu.i(s63.ALBUM_PAGE_NAME, "ClickTab", "tab", "browsed");
            y33.p0(y33.this, 2);
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
            } else {
                y33.o0(y33.this, !y33.this.i0().x());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class g extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ TextView d;

        public g(boolean z, TextView textView) {
            this.c = z;
            this.d = textView;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/bottom/nav/CaptureAlbumExpandNavWidget$updateTabBtnState$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else if (this.c) {
                this.d.setTextColor(Color.parseColor("#FFFFFF"));
                this.d.setTypeface(Typeface.DEFAULT_BOLD);
                TextView textView = this.d;
                textView.setContentDescription(((Object) this.d.getText()) + (char) 65292 + Localization.q(R.string.taobao_app_1007_selected) + (char) 65292 + Localization.q(R.string.taobao_app_1007_button));
            } else {
                this.d.setTextColor(Color.parseColor("#99FFFFFF"));
                this.d.setTypeface(Typeface.DEFAULT);
                TextView textView2 = this.d;
                textView2.setContentDescription(((Object) this.d.getText()) + (char) 65292 + Localization.q(R.string.taobao_app_1007_button));
            }
        }
    }

    static {
        t2o.a(481296796);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y33(Activity activity, Object obj, CaptureManager captureManager, boolean z, xfw xfwVar, ojb ojbVar) {
        super(activity, obj, captureManager, xfwVar, ojbVar);
        ckf.g(activity, "activity");
        ckf.g(captureManager, "captureManager");
        ckf.g(xfwVar, "viewSetter");
        ckf.g(ojbVar, "navStateChangeListener");
        this.n = z;
    }

    public static /* synthetic */ Object ipc$super(y33 y33Var, String str, Object... objArr) {
        if (str.hashCode() == 1250151579) {
            super.G();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/bottom/nav/CaptureAlbumExpandNavWidget");
    }

    public static final /* synthetic */ TextView l0(y33 y33Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("d0a73bd3", new Object[]{y33Var});
        }
        return y33Var.o;
    }

    public static final /* synthetic */ TextView m0(y33 y33Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("9efef67e", new Object[]{y33Var});
        }
        return y33Var.q;
    }

    public static final /* synthetic */ TextView n0(y33 y33Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("349c5e5a", new Object[]{y33Var});
        }
        return y33Var.p;
    }

    public static final /* synthetic */ void o0(y33 y33Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed57824", new Object[]{y33Var, new Boolean(z)});
        } else {
            y33Var.r0(z);
        }
    }

    public static final /* synthetic */ void p0(y33 y33Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa062d5", new Object[]{y33Var, new Integer(i)});
        } else {
            y33Var.s0(i);
        }
    }

    public static final /* synthetic */ void q0(y33 y33Var, TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5436a14", new Object[]{y33Var, textView, new Boolean(z)});
        } else {
            y33Var.t0(textView, z);
        }
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget, tb.vz
    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a83cc9b", new Object[]{this});
            return;
        }
        super.G();
        e0(new a());
    }

    public final void r0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4155ee0", new Object[]{this, new Boolean(z)});
            return;
        }
        agh.h(w43.TAG, ckf.p("switchPageFoldState: ", Boolean.valueOf(z)));
        k0(z);
        i0().w(z);
    }

    public final void s0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6978311", new Object[]{this, new Integer(i)});
        } else {
            e0(new f(i));
        }
    }

    public final void t0(TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f419cd8", new Object[]{this, textView, new Boolean(z)});
        } else if (textView != null) {
            vpt.g("updateTabBtnState", new g(z, textView));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public f(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int h0 = y33.this.h0();
            int i = this.b;
            if (h0 != i) {
                y33.this.j0(i);
                int h02 = y33.this.h0();
                if (h02 == 1) {
                    y33 y33Var = y33.this;
                    TextView m0 = y33.m0(y33Var);
                    if (m0 != null) {
                        y33.q0(y33Var, m0, false);
                        y33 y33Var2 = y33.this;
                        TextView l0 = y33.l0(y33Var2);
                        if (l0 != null) {
                            y33.q0(y33Var2, l0, false);
                            y33 y33Var3 = y33.this;
                            TextView n0 = y33.n0(y33Var3);
                            if (n0 != null) {
                                y33.q0(y33Var3, n0, true);
                            } else {
                                ckf.y("tabHistoryTv");
                                throw null;
                            }
                        } else {
                            ckf.y("tabAlbum");
                            throw null;
                        }
                    } else {
                        ckf.y("tabBrowsed");
                        throw null;
                    }
                } else if (h02 != 2) {
                    y33 y33Var4 = y33.this;
                    TextView n02 = y33.n0(y33Var4);
                    if (n02 != null) {
                        y33.q0(y33Var4, n02, false);
                        y33 y33Var5 = y33.this;
                        TextView m02 = y33.m0(y33Var5);
                        if (m02 != null) {
                            y33.q0(y33Var5, m02, false);
                            y33 y33Var6 = y33.this;
                            TextView l02 = y33.l0(y33Var6);
                            if (l02 != null) {
                                y33.q0(y33Var6, l02, true);
                            } else {
                                ckf.y("tabAlbum");
                                throw null;
                            }
                        } else {
                            ckf.y("tabBrowsed");
                            throw null;
                        }
                    } else {
                        ckf.y("tabHistoryTv");
                        throw null;
                    }
                } else {
                    y33 y33Var7 = y33.this;
                    TextView l03 = y33.l0(y33Var7);
                    if (l03 != null) {
                        y33.q0(y33Var7, l03, false);
                        y33 y33Var8 = y33.this;
                        TextView n03 = y33.n0(y33Var8);
                        if (n03 != null) {
                            y33.q0(y33Var8, n03, false);
                            y33 y33Var9 = y33.this;
                            TextView m03 = y33.m0(y33Var9);
                            if (m03 != null) {
                                y33.q0(y33Var9, m03, true);
                            } else {
                                ckf.y("tabBrowsed");
                                throw null;
                            }
                        } else {
                            ckf.y("tabHistoryTv");
                            throw null;
                        }
                    } else {
                        ckf.y("tabAlbum");
                        throw null;
                    }
                }
                y33.this.i0().onTabChanged(y33.this.h0());
            }
        }
    }

    @Override // tb.n63
    public void k0(boolean z) {
        String str;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6be5b61", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            mzu.k(s63.ALBUM_PAGE_NAME, "ExpandOuterAlbum", new String[0]);
        }
        TUrlImageView tUrlImageView = this.r;
        if (tUrlImageView != null) {
            if (z) {
                str = "https://gw.alicdn.com/imgextra/i2/O1CN01pehkcx1RuMsksuapY_!!6000000002171-49-tps-112-112.webp";
            } else {
                str = "https://gw.alicdn.com/imgextra/i4/O1CN01qQBFNc1mEKSW7XGpo_!!6000000004922-49-tps-112-112.webp";
            }
            tUrlImageView.setImageUrl(str);
            TUrlImageView tUrlImageView2 = this.r;
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

    @Override // com.etao.feimagesearch.struct.ViewWidget
    public View b0() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        View inflate = LayoutInflater.from(E()).inflate(R.layout.feis_view_capture_bottom_area_nav_v1, (ViewGroup) null, false);
        View findViewById = inflate.findViewById(R.id.tab_album);
        TextView textView = (TextView) findViewById;
        CaptureRainbowManager.a aVar = CaptureRainbowManager.Companion;
        float f2 = 16.0f;
        textView.setTextSize(1, aVar.a().d() ? 21.0f : 16.0f);
        textView.setOnClickListener(new b());
        ckf.f(findViewById, "findViewById<TextView>(R…UM)\n          }\n        }");
        this.o = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.fl_tab_history);
        if (this.n) {
            findViewById2.setVisibility(8);
        } else {
            findViewById2.setVisibility(0);
        }
        ViewProxy.setOnClickListener(findViewById2, new c());
        View findViewById3 = inflate.findViewById(R.id.tab_history);
        ((TextView) findViewById3).setTextSize(1, aVar.a().d() ? 21.0f : 16.0f);
        ckf.f(findViewById3, "findViewById<TextView>(R…16f\n          )\n        }");
        this.p = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.iv_history_tab_hint);
        ckf.f(findViewById4, "findViewById(R.id.iv_history_tab_hint)");
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.tab_browsed);
        TextView textView2 = (TextView) findViewById5;
        if (aVar.a().d()) {
            f2 = 21.0f;
        }
        textView2.setTextSize(1, f2);
        textView2.setOnClickListener(new d());
        ckf.f(findViewById5, "findViewById<TextView>(R…ED)\n          }\n        }");
        TextView textView3 = (TextView) findViewById5;
        this.q = textView3;
        if (!lg4.V() || this.n) {
            i = 8;
        }
        textView3.setVisibility(i);
        View findViewById6 = inflate.getRootView().findViewById(R.id.btn_fold);
        TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById6;
        tUrlImageView2.setOnClickListener(new e());
        tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01qQBFNc1mEKSW7XGpo_!!6000000004922-49-tps-112-112.webp");
        ViewGroup.LayoutParams layoutParams = tUrlImageView2.getLayoutParams();
        int a2 = p1p.a(aVar.a().d() ? 40.0f : 30.0f);
        layoutParams.height = a2;
        layoutParams.width = a2;
        tUrlImageView2.setLayoutParams(layoutParams);
        ckf.f(findViewById6, "rootView.findViewById<TU…ize\n          }\n        }");
        this.r = (TUrlImageView) findViewById6;
        return inflate;
    }
}
