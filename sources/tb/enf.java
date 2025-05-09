package tb;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.struct.ViewWidget;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class enf extends ViewWidget<View, IrpDatasource, enf> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final d1a<xhv> l;
    public TextView m;
    public TextView n;
    public View o;
    public View p;
    public Pair<String, String> q = new Pair<>("中文", "zh");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                enf.this.E().finish();
            }
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
            enf.h0(enf.this).invoke();
            mzu.n("Page_PhotoSearchResult", "SwitchLanguage", 2101, new String[0]);
        }
    }

    static {
        t2o.a(481297215);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enf(Activity activity, vz vzVar, IrpDatasource irpDatasource, d1a<xhv> d1aVar, xfw xfwVar) {
        super(activity, vzVar, irpDatasource, xfwVar, false, false, 32, null);
        ckf.g(activity, "activity");
        ckf.g(vzVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(irpDatasource, "irpDatasource");
        ckf.g(d1aVar, "onLangConfigClickListener");
        ckf.g(xfwVar, "setter");
        this.l = d1aVar;
        new Pair("自动", "auto");
    }

    public static final /* synthetic */ d1a h0(enf enfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("661b0fcd", new Object[]{enfVar});
        }
        return enfVar.l;
    }

    public static /* synthetic */ Object ipc$super(enf enfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/IrpTranslateUIWidget");
    }

    public final void i0(Pair<String, String> pair, Pair<String, String> pair2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374c2907", new Object[]{this, pair, pair2});
            return;
        }
        ckf.g(pair, "srcLang");
        ckf.g(pair2, "targetLang");
        this.q = pair2;
        TextView textView = this.m;
        if (textView != null) {
            textView.setText(pair.getFirst());
            TextView textView2 = this.n;
            if (textView2 != null) {
                textView2.setText(this.q.getFirst());
            } else {
                ckf.y("targetLangTv");
                throw null;
            }
        } else {
            ckf.y("srcLangTv");
            throw null;
        }
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget
    public View b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        View inflate = LayoutInflater.from(E()).inflate(R.layout.feis_view_translate_ui, (ViewGroup) null, false);
        ViewProxy.setOnClickListener(inflate.findViewById(R.id.btn_back), new a());
        View findViewById = inflate.findViewById(R.id.rl_lang_operate);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(p1p.b(6.5f));
        gradientDrawable.setColor(Color.parseColor("#FFFFFF"));
        findViewById.setBackground(gradientDrawable);
        ViewProxy.setOnClickListener(findViewById, new b());
        findViewById.setVisibility(8);
        this.o = findViewById;
        ((TUrlImageView) inflate.findViewById(R.id.tiv_hint)).setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01MIZMfJ1i9Vpo2J3Tb_!!6000000004370-49-tps-120-120.webp");
        ((TUrlImageView) inflate.findViewById(R.id.tiv_src_hint)).setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01ut7ZjD1MjJFADORni_!!6000000001470-49-tps-39-21.webp");
        ((TUrlImageView) inflate.findViewById(R.id.tiv_target_hint)).setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01ut7ZjD1MjJFADORni_!!6000000001470-49-tps-39-21.webp");
        View findViewById2 = inflate.findViewById(R.id.tv_source_lang);
        ckf.f(findViewById2, "findViewById(R.id.tv_source_lang)");
        this.m = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.tv_target_lang);
        ckf.f(findViewById3, "findViewById(R.id.tv_target_lang)");
        this.n = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.view_operate_bg_hint);
        ckf.f(findViewById4, "findViewById(R.id.view_operate_bg_hint)");
        this.p = findViewById4;
        return inflate;
    }

    public final void j0(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee640078", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.p;
        if (view != null) {
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
            return;
        }
        ckf.y("langConfigOperateBg");
        throw null;
    }

    public final void k0(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d45bd255", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.o;
        if (view != null) {
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
            return;
        }
        ckf.y("langOperateContainer");
        throw null;
    }
}
