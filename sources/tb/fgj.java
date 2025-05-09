package tb;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.nav.Nav;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity;
import com.taobao.mytaobao.pagev2.ui.TitleBarHelperV2;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class fgj implements ceb, View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TextView f19274a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TUrlImageView e;
    public TUrlImageView f;
    public TUrlImageView g;
    public ViewStub h;
    public LinearLayout i;
    public LinearLayout j;
    public FrameLayout k;
    public final egj l = new egj();
    public LinearLayout m;
    public ViewStub n;
    public LinearLayout o;
    public TextView p;
    public View q;
    public TextView r;
    public View s;
    public TextView t;
    public View u;
    public TextView v;
    public boolean w;
    public final View x;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

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
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

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
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                fgj.c(fgj.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                fgj.d(fgj.this);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;

        public e(JSONObject jSONObject) {
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                fgj.b(fgj.this, this.b);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        t2o.a(745537716);
        t2o.a(745537713);
    }

    public fgj(View view) {
        ckf.h(view, "rootView");
        this.x = view;
        j();
        p();
    }

    public static final /* synthetic */ void b(fgj fgjVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("215799ab", new Object[]{fgjVar, jSONObject});
        } else {
            fgjVar.h(jSONObject);
        }
    }

    public static final /* synthetic */ void c(fgj fgjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce8c530", new Object[]{fgjVar});
        } else {
            fgjVar.l();
        }
    }

    public static final /* synthetic */ void d(fgj fgjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9d9186", new Object[]{fgjVar});
        } else {
            fgjVar.n();
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ab39", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.o;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        if (this.e == null || this.f == null || this.g == null) {
            ViewStub viewStub = this.h;
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                View findViewById = inflate.findViewById(R.id.img_action_container);
                if (!(findViewById instanceof LinearLayout)) {
                    findViewById = null;
                }
                this.j = (LinearLayout) findViewById;
                View findViewById2 = inflate.findViewById(R.id.img_mytaobao_actionbar_message);
                if (!(findViewById2 instanceof TUrlImageView)) {
                    findViewById2 = null;
                }
                this.e = (TUrlImageView) findViewById2;
                View findViewById3 = inflate.findViewById(R.id.img_mytaobao_actionbar_xiaomi);
                if (!(findViewById3 instanceof TUrlImageView)) {
                    findViewById3 = null;
                }
                this.f = (TUrlImageView) findViewById3;
                View findViewById4 = inflate.findViewById(R.id.img_mytaobao_actionbar_settings);
                if (!(findViewById4 instanceof TUrlImageView)) {
                    findViewById4 = null;
                }
                this.g = (TUrlImageView) findViewById4;
                q();
            } else {
                ckf.s();
                throw null;
            }
        }
        LinearLayout linearLayout3 = this.j;
        if (linearLayout3 == null) {
            return;
        }
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        } else {
            ckf.s();
            throw null;
        }
    }

    public final void f() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9fc1625", new Object[]{this});
        } else if (!Localization.o() && MtbGlobalEnv.z() && this.o == null) {
            ViewStub viewStub = this.n;
            TextView textView = null;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            if (!(view instanceof LinearLayout)) {
                view = null;
            }
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout != null) {
                this.o = linearLayout;
                View findViewById = linearLayout.findViewById(R.id.tvSinkSwitchAccount);
                if (!(findViewById instanceof TextView)) {
                    findViewById = null;
                }
                this.p = (TextView) findViewById;
                View findViewById2 = linearLayout.findViewById(R.id.tvSinkAddress);
                if (!(findViewById2 instanceof TextView)) {
                    findViewById2 = null;
                }
                this.r = (TextView) findViewById2;
                View findViewById3 = linearLayout.findViewById(R.id.tvSinkChat);
                if (!(findViewById3 instanceof TextView)) {
                    findViewById3 = null;
                }
                this.t = (TextView) findViewById3;
                View findViewById4 = linearLayout.findViewById(R.id.tvSinkSetting);
                if (findViewById4 instanceof TextView) {
                    textView = findViewById4;
                }
                this.v = textView;
                this.q = linearLayout.findViewById(R.id.viewSinkSwitchAccountDivider);
                this.s = linearLayout.findViewById(R.id.viewSinkAddressDivider);
                this.u = linearLayout.findViewById(R.id.viewSinkChatDivider);
                TextView textView2 = this.p;
                if (textView2 != null) {
                    textView2.setOnClickListener(a.INSTANCE);
                }
                TextView textView3 = this.r;
                if (textView3 != null) {
                    textView3.setOnClickListener(b.INSTANCE);
                }
                TextView textView4 = this.t;
                if (textView4 != null) {
                    textView4.setOnClickListener(new c());
                }
                TextView textView5 = this.v;
                if (textView5 != null) {
                    textView5.setOnClickListener(new d());
                }
            }
        }
    }

    public final void g() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4343a3", new Object[]{this});
        } else if (Localization.o()) {
            LinearLayout linearLayout = this.i;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.o;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            LinearLayout linearLayout3 = this.j;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
        } else {
            LinearLayout linearLayout4 = this.j;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
            boolean z = MtbGlobalEnv.z();
            LinearLayout linearLayout5 = this.o;
            if (linearLayout5 != null) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                linearLayout5.setVisibility(i2);
            }
            LinearLayout linearLayout6 = this.i;
            if (linearLayout6 != null) {
                if (z) {
                    i = 8;
                } else {
                    i = 0;
                }
                linearLayout6.setVisibility(i);
            }
            if (this.w != z) {
                this.w = z;
                int dip2px = DensityUtil.dip2px(Globals.getApplication(), 10.0f);
                int dip2px2 = DensityUtil.dip2px(Globals.getApplication(), 7.0f);
                if (z) {
                    f();
                    LinearLayout linearLayout7 = this.o;
                    if (linearLayout7 != null) {
                        linearLayout7.setVisibility(0);
                    }
                    LinearLayout linearLayout8 = this.i;
                    if (linearLayout8 != null) {
                        linearLayout8.setVisibility(8);
                    }
                    LinearLayout linearLayout9 = this.j;
                    if (linearLayout9 != null) {
                        linearLayout9.setVisibility(8);
                    }
                    TextView textView = this.p;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    View view = this.q;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    TextView textView2 = this.r;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    View view2 = this.s;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    TextView textView3 = this.t;
                    if (textView3 != null) {
                        textView3.setPadding(dip2px2, 0, dip2px2, 0);
                    }
                    TextView textView4 = this.t;
                    if (textView4 != null) {
                        textView4.setTextSize(2, 13.0f);
                    }
                    View view3 = this.u;
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                    TextView textView5 = this.v;
                    if (textView5 != null) {
                        textView5.setPadding(dip2px2, 0, dip2px, 0);
                    }
                    TextView textView6 = this.v;
                    if (textView6 != null) {
                        textView6.setTextSize(2, 13.0f);
                        return;
                    }
                    return;
                }
                TextView textView7 = this.p;
                if (textView7 != null) {
                    textView7.setVisibility(8);
                }
                View view4 = this.q;
                if (view4 != null) {
                    view4.setVisibility(8);
                }
                TextView textView8 = this.r;
                if (textView8 != null) {
                    textView8.setVisibility(8);
                }
                View view5 = this.s;
                if (view5 != null) {
                    view5.setVisibility(8);
                }
                TextView textView9 = this.t;
                if (textView9 != null) {
                    textView9.setPadding(dip2px, 0, 0, 0);
                }
                TextView textView10 = this.t;
                if (textView10 != null) {
                    textView10.setTextSize(2, 16.0f);
                }
                View view6 = this.u;
                if (view6 != null) {
                    view6.setVisibility(8);
                }
                TextView textView11 = this.v;
                if (textView11 != null) {
                    textView11.setPadding(dip2px, 0, dip2px, 0);
                }
                TextView textView12 = this.v;
                if (textView12 != null) {
                    textView12.setTextSize(2, 16.0f);
                }
            }
        }
    }

    public final void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04ec02f", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                ckf.c(key, "key");
                if (wsq.O(key, "headerModule", false, 2, null)) {
                    if (!(value instanceof JSONObject)) {
                        value = null;
                    }
                    JSONObject jSONObject2 = (JSONObject) value;
                    if (jSONObject2 != null) {
                        this.l.o(jSONObject2.getJSONObject("fields"));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21efbf0", new Object[]{this, jSONObject});
            return;
        }
        ckf.h(jSONObject, "mtopData");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        try {
            h(jSONObject2);
        } catch (Throwable unused) {
            this.x.post(new e(jSONObject2));
        }
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33e719f9", new Object[]{this})).intValue();
        }
        FrameLayout frameLayout = this.k;
        if (frameLayout != null) {
            return frameLayout.getVisibility();
        }
        return -1;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb323b6", new Object[]{this});
            return;
        }
        String m = this.l.m();
        if (!TextUtils.isEmpty(m)) {
            Nav.from(Globals.getApplication()).toUri(m);
            MtbGlobalEnv.i = m;
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488cfc36", new Object[]{this});
            return;
        }
        suv.c(u3j.b, "Page_MyTaobao_Button-Nav-Language", suv.a("a2141.7631743.1.26", null, null, null));
        String g = this.l.g();
        if (!TextUtils.isEmpty(g)) {
            Nav.from(Globals.getApplication()).toUri(g);
            MtbGlobalEnv.i = g;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        TUrlImageView tUrlImageView;
        TUrlImageView tUrlImageView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view != null) {
            int id = view.getId();
            TextView textView = this.b;
            if (textView == null) {
                ckf.s();
                throw null;
            } else if (id == textView.getId() || ((tUrlImageView = this.g) != null && id == tUrlImageView.getId())) {
                n();
            } else {
                TextView textView2 = this.c;
                if (textView2 == null) {
                    ckf.s();
                    throw null;
                } else if (id == textView2.getId() || ((tUrlImageView2 = this.f) != null && id == tUrlImageView2.getId())) {
                    l();
                } else {
                    TextView textView3 = this.d;
                    if (textView3 == null || id != textView3.getId()) {
                        TUrlImageView tUrlImageView3 = this.e;
                        if (tUrlImageView3 != null && id == tUrlImageView3.getId()) {
                            suv.c(u3j.b, "Page_MyTaobao_Button-Message", suv.a("a2141.7631743.1.101", null, null, null));
                            String i = this.l.i();
                            if (!TextUtils.isEmpty(i)) {
                                Nav.from(Globals.getApplication()).toUri(i);
                                MtbGlobalEnv.i = i;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    m();
                }
            }
        } else {
            ckf.s();
            throw null;
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b2a880", new Object[]{this});
            return;
        }
        TextView textView = this.b;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        TextView textView3 = this.d;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        q();
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab885e5", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.e;
        if (tUrlImageView != null) {
            if (tUrlImageView != null) {
                tUrlImageView.setOnClickListener(this);
            } else {
                ckf.s();
                throw null;
            }
        }
        TUrlImageView tUrlImageView2 = this.f;
        if (tUrlImageView2 != null) {
            if (tUrlImageView2 != null) {
                tUrlImageView2.setOnClickListener(this);
            } else {
                ckf.s();
                throw null;
            }
        }
        TUrlImageView tUrlImageView3 = this.g;
        if (tUrlImageView3 == null) {
            return;
        }
        if (tUrlImageView3 != null) {
            tUrlImageView3.setOnClickListener(this);
        } else {
            ckf.s();
            throw null;
        }
    }

    public void r(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b3a318", new Object[]{this, onClickListener});
            return;
        }
        ckf.h(onClickListener, DataReceiveMonitor.CB_LISTENER);
        FrameLayout frameLayout = this.k;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(onClickListener);
        }
    }

    public void s(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6f5d56", new Object[]{this, new Boolean(z)});
            return;
        }
        FrameLayout frameLayout = this.k;
        if (frameLayout != null) {
            if (!z) {
                i = 4;
            }
            frameLayout.setVisibility(i);
        }
    }

    public void t(int i) {
        TextView textView;
        TextView textView2;
        String str;
        String str2;
        String str3;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f07ef3a", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView3 = this.f19274a;
        if (textView3 != null && (textView = this.b) != null && (textView2 = this.c) != null) {
            g();
            TextView textView4 = this.d;
            if (textView4 != null) {
                textView4.setTextColor(i);
            }
            textView2.setTextColor(i);
            textView.setTextColor(i);
            textView3.setTextColor(i);
            TextView textView5 = this.r;
            if (textView5 != null) {
                textView5.setTextColor(i);
            }
            TextView textView6 = this.p;
            if (textView6 != null) {
                textView6.setTextColor(i);
            }
            TextView textView7 = this.t;
            if (textView7 != null) {
                textView7.setTextColor(i);
            }
            TextView textView8 = this.v;
            if (textView8 != null) {
                textView8.setTextColor(i);
            }
            if (Localization.o()) {
                e();
                TUrlImageView tUrlImageView = this.e;
                if (tUrlImageView != null) {
                    if (y14.c(i)) {
                        str3 = this.l.b();
                    } else {
                        str3 = this.l.a();
                    }
                    tUrlImageView.setImageUrl(str3);
                }
                TUrlImageView tUrlImageView2 = this.f;
                if (tUrlImageView2 != null) {
                    if (y14.c(i)) {
                        str2 = this.l.f();
                    } else {
                        str2 = this.l.e();
                    }
                    tUrlImageView2.setImageUrl(str2);
                }
                TUrlImageView tUrlImageView3 = this.g;
                if (tUrlImageView3 != null) {
                    if (y14.c(i)) {
                        str = this.l.d();
                    } else {
                        str = this.l.c();
                    }
                    tUrlImageView3.setImageUrl(str);
                    return;
                }
                return;
            }
            LinearLayout linearLayout = this.i;
            if (linearLayout != null) {
                if (MtbGlobalEnv.z()) {
                    i2 = 8;
                }
                linearLayout.setVisibility(i2);
            }
            LinearLayout linearLayout2 = this.j;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    @Override // tb.ceb
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8715ec", new Object[]{this, view});
            return;
        }
        ckf.h(view, "themeView");
        FrameLayout frameLayout = this.k;
        if (frameLayout != null) {
            frameLayout.addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public final void j() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea8ea99", new Object[]{this});
            return;
        }
        View findViewById = this.x.findViewById(R.id.mtb_actionbar_root);
        TUrlImageView tUrlImageView = null;
        if (!(findViewById instanceof FrameLayout)) {
            findViewById = null;
        }
        this.k = (FrameLayout) findViewById;
        View findViewById2 = this.x.findViewById(R.id.tv_mytaobao_center_nick);
        if (findViewById2 != null) {
            this.f19274a = (TextView) findViewById2;
            View findViewById3 = this.x.findViewById(R.id.tv_mytaobao_settings_text);
            if (!(findViewById3 instanceof TextView)) {
                findViewById3 = null;
            }
            this.b = (TextView) findViewById3;
            View findViewById4 = this.x.findViewById(R.id.tv_mytaobao_actionbar_xiaomi_text);
            if (!(findViewById4 instanceof TextView)) {
                findViewById4 = null;
            }
            this.c = (TextView) findViewById4;
            View findViewById5 = this.x.findViewById(R.id.tv_mytaobao_actionbar_language_text);
            if (!(findViewById5 instanceof TextView)) {
                findViewById5 = null;
            }
            this.d = (TextView) findViewById5;
            View findViewById6 = this.x.findViewById(R.id.actionbar_stub_view);
            if (findViewById6 != null) {
                this.h = (ViewStub) findViewById6;
                View findViewById7 = this.x.findViewById(R.id.txt_action_container);
                if (!(findViewById7 instanceof LinearLayout)) {
                    findViewById7 = null;
                }
                this.i = (LinearLayout) findViewById7;
                View findViewById8 = this.x.findViewById(R.id.llActionBarSinkEngageViewStub);
                if (findViewById8 != null) {
                    this.n = (ViewStub) findViewById8;
                    View findViewById9 = this.x.findViewById(R.id.llTitleBarContainer);
                    if (findViewById9 != null) {
                        this.m = (LinearLayout) findViewById9;
                        int d2 = pgj.d();
                        int dip2px = DensityUtil.dip2px(Globals.getApplication(), 48.0f) + d2;
                        LinearLayout linearLayout = this.m;
                        if (linearLayout != null) {
                            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.height = dip2px;
                            }
                            LinearLayout linearLayout2 = this.m;
                            if (linearLayout2 != null) {
                                linearLayout2.setLayoutParams(layoutParams);
                            }
                            LinearLayout linearLayout3 = this.m;
                            if (linearLayout3 != null) {
                                linearLayout3.setPadding(0, d2, 0, 0);
                            }
                            if (Localization.o()) {
                                ViewStub viewStub = this.h;
                                if (viewStub != null) {
                                    View inflate = viewStub.inflate();
                                    View findViewById10 = inflate.findViewById(R.id.img_action_container);
                                    if (!(findViewById10 instanceof LinearLayout)) {
                                        findViewById10 = null;
                                    }
                                    this.j = (LinearLayout) findViewById10;
                                    View findViewById11 = inflate.findViewById(R.id.img_mytaobao_actionbar_message);
                                    if (!(findViewById11 instanceof TUrlImageView)) {
                                        findViewById11 = null;
                                    }
                                    this.e = (TUrlImageView) findViewById11;
                                    View findViewById12 = inflate.findViewById(R.id.img_mytaobao_actionbar_xiaomi);
                                    if (!(findViewById12 instanceof TUrlImageView)) {
                                        findViewById12 = null;
                                    }
                                    this.f = (TUrlImageView) findViewById12;
                                    View findViewById13 = inflate.findViewById(R.id.img_mytaobao_actionbar_settings);
                                    if (findViewById13 instanceof TUrlImageView) {
                                        tUrlImageView = findViewById13;
                                    }
                                    this.g = tUrlImageView;
                                } else {
                                    ckf.s();
                                    throw null;
                                }
                            }
                            LinearLayout linearLayout4 = this.i;
                            if (linearLayout4 != null) {
                                linearLayout4.setVisibility((Localization.o() || MtbGlobalEnv.z()) ? 8 : 0);
                            }
                            LinearLayout linearLayout5 = this.j;
                            if (linearLayout5 != null) {
                                if (!Localization.o()) {
                                    i = 8;
                                }
                                linearLayout5.setVisibility(i);
                                return;
                            }
                            return;
                        }
                        ckf.s();
                        throw null;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewStub");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewStub");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece0bb20", new Object[]{this});
            return;
        }
        suv.c(u3j.b, "Page_MyTaobao_Button-MyNickName", suv.a("a2141.7631743.1.25", null, null, null));
        String j = this.l.j();
        if (!TextUtils.isEmpty(j)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(NewTaobaoSettingActivity.EXTRA_KEY_SHOW_LOGOUT, true);
            Nav.from(Globals.getApplication()).withExtras(bundle).toUri(j);
            MtbGlobalEnv.i = j;
        }
    }

    public void o(boolean z) {
        TextView textView;
        TextView textView2;
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87aca4d6", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView3 = this.f19274a;
        if (textView3 != null && (textView = this.b) != null && (textView2 = this.c) != null) {
            g();
            MtbGlobalEnv.z();
            textView3.setText(this.l.l());
            textView.setText(this.l.k());
            textView2.setText(this.l.n());
            TextView textView4 = this.d;
            if (textView4 != null) {
                textView4.setText(this.l.h());
            }
            TextView textView5 = this.t;
            if (textView5 != null) {
                textView5.setText(this.l.n());
            }
            TextView textView6 = this.v;
            if (textView6 != null) {
                textView6.setText(this.l.k());
            }
            if (TextUtils.isEmpty(this.l.n())) {
                textView2.setVisibility(8);
                TextView textView7 = this.t;
                if (textView7 != null) {
                    textView7.setVisibility(8);
                }
                View view = this.u;
                if (view != null) {
                    view.setVisibility(8);
                }
            } else {
                textView2.setVisibility(0);
            }
            if (TextUtils.isEmpty(this.l.h())) {
                TextView textView8 = this.d;
                if (textView8 != null) {
                    textView8.setVisibility(8);
                }
            } else {
                TextView textView9 = this.d;
                if (textView9 != null) {
                    textView9.setVisibility(0);
                }
            }
            if (z && (frameLayout = this.k) != null) {
                frameLayout.setBackgroundColor((int) 4294111986L);
            }
            if (Localization.o()) {
                e();
                FrameLayout frameLayout2 = this.k;
                if (frameLayout2 != null) {
                    if (frameLayout2.getBackground() instanceof ColorDrawable) {
                        FrameLayout frameLayout3 = this.k;
                        if (frameLayout3 != null) {
                            Drawable background = frameLayout3.getBackground();
                            if (background == null) {
                                throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                            } else if (!y14.c(((ColorDrawable) background).getColor())) {
                                TUrlImageView tUrlImageView = this.e;
                                if (tUrlImageView != null) {
                                    tUrlImageView.setImageUrl(this.l.b());
                                    TUrlImageView tUrlImageView2 = this.f;
                                    if (tUrlImageView2 != null) {
                                        tUrlImageView2.setImageUrl(this.l.f());
                                        TUrlImageView tUrlImageView3 = this.g;
                                        if (tUrlImageView3 != null) {
                                            tUrlImageView3.setImageUrl(this.l.c());
                                            return;
                                        } else {
                                            ckf.s();
                                            throw null;
                                        }
                                    } else {
                                        ckf.s();
                                        throw null;
                                    }
                                } else {
                                    ckf.s();
                                    throw null;
                                }
                            }
                        } else {
                            ckf.s();
                            throw null;
                        }
                    }
                    TUrlImageView tUrlImageView4 = this.e;
                    if (tUrlImageView4 != null) {
                        tUrlImageView4.setImageUrl(this.l.a());
                        TUrlImageView tUrlImageView5 = this.f;
                        if (tUrlImageView5 != null) {
                            tUrlImageView5.setImageUrl(this.l.e());
                            TUrlImageView tUrlImageView6 = this.g;
                            if (tUrlImageView6 != null) {
                                tUrlImageView6.setImageUrl(this.l.c());
                            } else {
                                ckf.s();
                                throw null;
                            }
                        } else {
                            ckf.s();
                            throw null;
                        }
                    } else {
                        ckf.s();
                        throw null;
                    }
                } else {
                    ckf.s();
                    throw null;
                }
            }
        }
    }
}
