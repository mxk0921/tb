package tb;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class icu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public e A;
    public final Context B;

    /* renamed from: a  reason: collision with root package name */
    public final at8 f21244a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int l = 1;
    public int m = 1;
    public int n = 1;
    public int o = 1;
    public int p = 1;
    public int q = 1;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TUrlImageView x;
    public FrameLayout y;
    public d z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (icu.a(icu.this) != null) {
                icu.a(icu.this).a(icu.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (icu.b(icu.this) != null) {
                icu.b(icu.this).a(icu.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                return;
            }
            dialogInterface.dismiss();
            hh.d(icu.c(icu.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d {
        void a(icu icuVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface e {
        void a(icu icuVar);
    }

    static {
        t2o.a(714080272);
    }

    public icu() {
    }

    public static /* synthetic */ d a(icu icuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("26a27733", new Object[]{icuVar});
        }
        return icuVar.z;
    }

    public static /* synthetic */ e b(icu icuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("2e704a2a", new Object[]{icuVar});
        }
        return icuVar.A;
    }

    public static /* synthetic */ Context c(icu icuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("48a59bae", new Object[]{icuVar});
        }
        return icuVar.B;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d2be6a", new Object[]{this});
            return;
        }
        int d2 = x14.d(this.i, 1);
        if (d2 != 1) {
            e(this.y, d2, d2);
        }
        int d3 = x14.d(this.j, 1);
        if (d3 != 1) {
            e(this.v, d3, d3);
        }
        int d4 = x14.d(this.k, 1);
        if (d4 != 1) {
            e(this.w, d4, d4);
        }
    }

    public final void e(View view, int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68508fe", new Object[]{this, view, iArr});
        } else if (view != null && iArr != null && iArr.length > 0) {
            Drawable background = view.getBackground();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColors(iArr);
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa707f9", new Object[]{this});
            return;
        }
        at8 at8Var = this.f21244a;
        if (at8Var != null) {
            at8Var.dismiss();
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f3caff", new Object[]{this});
            return;
        }
        try {
            j();
            k();
            h();
            i();
            d();
        } catch (Throwable unused) {
        }
    }

    public final void h() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14513dc9", new Object[]{this});
            return;
        }
        if (this.r != null && !TextUtils.isEmpty(this.b)) {
            this.r.setText(this.b);
        }
        if (this.s != null && !TextUtils.isEmpty(this.c)) {
            this.s.setText(this.c);
            this.s.setVisibility(0);
        }
        if (this.t != null && !TextUtils.isEmpty(this.d)) {
            this.t.setText(this.d);
            this.t.setVisibility(0);
        }
        if (this.x != null && !TextUtils.isEmpty(this.f)) {
            this.x.setImageUrl(this.f);
        }
        if (this.u != null && !TextUtils.isEmpty(this.e)) {
            this.u.setText(this.e);
        }
        if (this.v != null && !TextUtils.isEmpty(this.g)) {
            this.v.setText(this.g);
        }
        if (this.w != null && !TextUtils.isEmpty(this.h)) {
            this.w.setText(this.h);
        }
    }

    public final void i() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5071d3", new Object[]{this});
        } else if (this.f21244a != null) {
            this.v.setOnClickListener(new a());
            this.w.setOnClickListener(new b());
            this.f21244a.setOnCancelListener(new c());
        }
    }

    public final void j() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f59344", new Object[]{this});
            return;
        }
        at8 at8Var = this.f21244a;
        if (at8Var != null) {
            this.y = (FrameLayout) at8Var.findViewById(R.id.purchase_new_dialog_title_bg);
            this.r = (TextView) this.f21244a.findViewById(R.id.purchase_new_dialog_title);
            this.s = (TextView) this.f21244a.findViewById(R.id.purchase_new_dialog_desc);
            this.t = (TextView) this.f21244a.findViewById(R.id.purchase_new_dialog_msg);
            this.u = (TextView) this.f21244a.findViewById(R.id.purchase_new_dialog_error_code);
            this.x = (TUrlImageView) this.f21244a.findViewById(R.id.purchase_new_dialog_error_image);
            this.v = (TextView) this.f21244a.findViewById(R.id.purchase_new_dialog_left_btn);
            this.w = (TextView) this.f21244a.findViewById(R.id.purchase_new_dialog_right_btn);
            if (this.z == null) {
                this.v.setVisibility(8);
                this.w.setText(Localization.q(R.string.app_i_know));
            }
            if (this.A == null) {
                this.w.setVisibility(8);
            }
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c28f7e", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5a8300", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710bac24", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f83960b", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa510553", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void r(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98513927", new Object[]{this, dVar});
        } else {
            this.z = dVar;
        }
    }

    public void s(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a8e313", new Object[]{this, eVar});
        } else {
            this.A = eVar;
        }
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66653a4", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ae7d7a", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a57c3630", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c637cac", new Object[]{this});
            return;
        }
        at8 at8Var = this.f21244a;
        if (at8Var != null && !at8Var.isShowing()) {
            g();
            this.f21244a.show();
        }
    }

    public final void k() {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f7ab391", new Object[]{this});
            return;
        }
        this.l = FestivalMgr.i().e(DnsPreference.KEY_TRADE, "titleBgColorStart", 1);
        this.m = FestivalMgr.i().e(DnsPreference.KEY_TRADE, "titleBgColorEnd", 1);
        this.n = FestivalMgr.i().e(DnsPreference.KEY_TRADE, "leftButtonColorStart", 1);
        this.o = FestivalMgr.i().e(DnsPreference.KEY_TRADE, "leftButtonColorEnd", 1);
        this.p = FestivalMgr.i().e(DnsPreference.KEY_TRADE, "rightButtonColorStart", 1);
        this.q = FestivalMgr.i().e(DnsPreference.KEY_TRADE, "rightButtonColorEnd", 1);
        String l = FestivalMgr.i().l(DnsPreference.KEY_TRADE, "iconImage");
        if (this.x != null && !TextUtils.isEmpty(l)) {
            this.x.setImageUrl(l);
        }
        int i4 = this.l;
        if (!(i4 == 1 || (i3 = this.m) == 1)) {
            e(this.y, i4, i3);
        }
        int i5 = this.n;
        if (!(i5 == 1 || (i2 = this.o) == 1)) {
            e(this.v, i5, i2);
        }
        int i6 = this.p;
        if (i6 != 1 && (i = this.q) != 1) {
            e(this.w, i6, i);
        }
    }

    public icu(Context context) {
        if (context != null) {
            this.B = context;
            at8 at8Var = new at8(context, R.style.Dialog_Error_Alert);
            this.f21244a = at8Var;
            at8Var.b(R.layout.purchase_new_dialog, -1, -1, 17);
        }
    }
}
