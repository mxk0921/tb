package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.widget.desc.TIconFontTextView;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.hme;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ds7 extends kd7<es7> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final RelativeLayout h;
    public TextView i;
    public View j;
    public TIconFontTextView k;
    public TextView l;
    public DetailImageView m;
    public RelativeLayout n;
    public final RelativeLayout.LayoutParams o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ame {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.ame
        public void a(yle yleVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca00359c", new Object[]{this, yleVar});
            } else {
                ds7.w(ds7.this).setVisibility(8);
            }
        }

        @Override // tb.ame
        public void b(yle yleVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85aca743", new Object[]{this, yleVar});
            }
        }
    }

    static {
        t2o.a(912262366);
    }

    public ds7(Context context) {
        super(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        this.o = layoutParams;
        RelativeLayout relativeLayout = new RelativeLayout(this.f22590a);
        this.h = relativeLayout;
        relativeLayout.setLayoutParams(layoutParams);
    }

    public static /* synthetic */ Object ipc$super(ds7 ds7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/DivisionTitleViewHolder");
    }

    public static /* synthetic */ DetailImageView w(ds7 ds7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailImageView) ipChange.ipc$dispatch("c81a5fc1", new Object[]{ds7Var});
        }
        return ds7Var.m;
    }

    public final void A(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.h.removeAllViews();
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_division_title, (ViewGroup) null);
        this.n = relativeLayout;
        this.i = (TextView) relativeLayout.findViewById(R.id.container_title);
        this.m = (DetailImageView) this.n.findViewById(R.id.iv_logo);
        this.j = this.n.findViewById(R.id.container_line);
        this.l = (TextView) this.n.findViewById(R.id.container_sub_title);
        this.k = (TIconFontTextView) this.n.findViewById(R.id.more_sub_title);
        this.h.addView(this.n, this.o);
    }

    public final void D(es7 es7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4bd4a7", new Object[]{this, es7Var});
            return;
        }
        DetailImageView detailImageView = (DetailImageView) this.n.findViewById(R.id.divider_logo);
        if (!TextUtils.isEmpty(es7Var.o)) {
            n(detailImageView, es7Var.o, null, null, new hme.a().r(true).m());
            detailImageView.setVisibility(0);
        } else {
            detailImageView.setVisibility(8);
        }
        String str = es7Var.m;
        if (str == null) {
            str = "";
        }
        TextView textView = (TextView) this.n.findViewById(R.id.divider_text);
        textView.setText(str);
        if (!TextUtils.isEmpty(es7Var.k)) {
            textView.setTextColor(w14.a(es7Var.k));
        }
        if (!TextUtils.isEmpty(es7Var.n)) {
            this.n.setBackgroundColor(w14.a(es7Var.n));
        }
    }

    /* renamed from: e */
    public boolean m(es7 es7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fa6882b", new Object[]{this, es7Var})).booleanValue();
        }
        return false;
    }

    /* renamed from: x */
    public void h(es7 es7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0221a7", new Object[]{this, es7Var});
        } else if (es7Var.s) {
            z(this.f22590a);
            D(es7Var);
        } else {
            A(this.f22590a);
            String str = es7Var.k;
            if (!TextUtils.isEmpty(str)) {
                this.i.setTextColor(w14.a(str));
            }
            String str2 = es7Var.l;
            if (!TextUtils.isEmpty(str2)) {
                this.j.setBackgroundColor(w14.a(str2));
            }
            String str3 = es7Var.m;
            if (!TextUtils.isEmpty(str3)) {
                this.i.setText(str3);
            }
            C(es7Var);
        }
    }

    /* renamed from: y */
    public View j(es7 es7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8cabe89b", new Object[]{this, es7Var});
        }
        return this.h;
    }

    public final void z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de1d57f", new Object[]{this, context});
            return;
        }
        this.h.removeAllViews();
        PreRenderManager g = PreRenderManager.g(this.f22590a);
        if (g != null) {
            this.n = (RelativeLayout) g.j(this.f22590a, R.layout.tt_detail_divider_with_text_and_icon, null, true);
        } else {
            this.n = (RelativeLayout) LayoutInflater.from(this.f22590a).inflate(R.layout.tt_detail_divider_with_text_and_icon, (ViewGroup) null);
        }
        this.h.addView(this.n, this.o);
    }

    public final void C(es7 es7Var) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e513a9db", new Object[]{this, es7Var});
            return;
        }
        String str = es7Var.k;
        if (!TextUtils.isEmpty(str)) {
            this.i.setTextColor(w14.a(str));
        }
        if (!TextUtils.isEmpty(es7Var.n)) {
            this.h.setBackgroundColor(w14.a(es7Var.n));
        }
        String str2 = es7Var.r;
        if (str2 != null) {
            try {
                i = Integer.valueOf(str2).intValue() - 2;
            } catch (Exception unused) {
                i = 8;
            }
            ((AbsListView.LayoutParams) this.h.getLayoutParams()).height = -2;
            this.h.setPadding(0, 0, 0, mr7.a(i));
        }
        String str3 = es7Var.l;
        if (!TextUtils.isEmpty(str3)) {
            this.j.setBackgroundColor(w14.a(str3));
        }
        if (!TextUtils.isEmpty(es7Var.p)) {
            this.k.setVisibility(0);
            this.k.setText("큚");
            this.l.setText(es7Var.p);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) es7Var.q);
            ((ArrayList) ((es7) this.g).j).add(new rc7("open_url", jSONObject, new RuntimeAbilityParam("appendURLParamsOnly", Boolean.TRUE)));
            f(this.g);
        } else {
            this.k.setVisibility(8);
            this.l.setVisibility(8);
        }
        this.i.setText(es7Var.m);
        String str4 = es7Var.o;
        if (TextUtils.isEmpty(str4)) {
            this.m.setVisibility(8);
            return;
        }
        this.m.setVisibility(0);
        n(this.m, str4, new koe(this.m.getLayoutParams().width, this.m.getLayoutParams().height), new a(), null);
    }
}
