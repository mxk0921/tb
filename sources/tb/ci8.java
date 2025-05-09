package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.TBErrorViewWidget;
import com.taobao.uikit.extend.component.error.Error;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ci8 implements w2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f17076a;
    public TBErrorView b;
    public final kmb c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
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
            ci8.d(ci8.this).setVisibility(8);
            ci8.e(ci8.this).T().a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kmb f17078a;

        public b(ci8 ci8Var, kmb kmbVar) {
            this.f17078a = kmbVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            kmb kmbVar = this.f17078a;
            if (kmbVar != null) {
                kmbVar.h0(true);
            }
        }
    }

    static {
        t2o.a(479199613);
        t2o.a(479199610);
    }

    public ci8(LinearLayout linearLayout, kmb kmbVar) {
        this.f17076a = linearLayout;
        this.c = kmbVar;
    }

    public static /* synthetic */ TBErrorView d(ci8 ci8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("a3593ab3", new Object[]{ci8Var});
        }
        return ci8Var.b;
    }

    public static /* synthetic */ kmb e(ci8 ci8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("61a5a02", new Object[]{ci8Var});
        }
        return ci8Var.c;
    }

    @Override // tb.w2c
    public void a(kmb kmbVar, Context context, int i, MtopResponse mtopResponse, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc3820b", new Object[]{this, kmbVar, context, new Integer(i), mtopResponse, new Boolean(z)});
        } else {
            c(kmbVar, context, i, mtopResponse, z, false);
        }
    }

    @Override // tb.w2c
    public void b(kmb kmbVar, Context context, int i, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79aede9", new Object[]{this, kmbVar, context, new Integer(i), mtopResponse});
        } else {
            a(kmbVar, context, i, mtopResponse, true);
        }
    }

    public final View f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7c2124ce", new Object[]{this, context});
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        return ((Activity) context).findViewById(R.id.icart_network_error_view_widget);
    }

    public final void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda800e1", new Object[]{this, context});
            return;
        }
        View f = f(context);
        if (f != null) {
            f.setVisibility(8);
        }
    }

    public final void h(Context context, kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ef8fb13", new Object[]{this, context, kmbVar});
            return;
        }
        View f = f(context);
        if (f instanceof TBErrorViewWidget) {
            TBErrorViewWidget tBErrorViewWidget = (TBErrorViewWidget) f;
            tBErrorViewWidget.setAdaptiveWidth(true);
            tBErrorViewWidget.setStatus(TBErrorViewWidget.Status.STATUS_NETWORK_ERROR);
            tBErrorViewWidget.setRefreshButton(new b(this, kmbVar));
            f.setVisibility(0);
        }
    }

    @Override // tb.w2c
    public void c(kmb kmbVar, Context context, int i, MtopResponse mtopResponse, boolean z, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cad7229", new Object[]{this, kmbVar, context, new Integer(i), mtopResponse, new Boolean(z), new Boolean(z2)});
        } else if (i == 1) {
            boolean o = this.c.o();
            if (!o) {
                if (this.b == null) {
                    TBErrorView tBErrorView = new TBErrorView(context);
                    this.b = tBErrorView;
                    tBErrorView.setBackgroundResource(R.color.taobao_cart_core_background);
                    this.f17076a.addView(this.b, new LinearLayout.LayoutParams(-1, -1));
                    this.b.setButton(TBErrorView.ButtonType.BUTTON_LEFT, Localization.q(R.string.app_retry), new a());
                }
                this.b.setVisibility(0);
                this.b.setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
                hdv.a().commitFeedback(c9x.CART_BIZ_NAME, mtopResponse.getRetMsg(), UmTypeKey.ERROE_PAGE, mtopResponse.getRetCode(), mtopResponse.getMappingCode());
                lbq.b(c9x.CART_BIZ_NAME, "hasNoContentErrorPage", mtopResponse.getRetCode(), mtopResponse.getRetMsg());
            }
            if (o) {
                String q = Localization.q(R.string.app_network_error);
                if (mtopResponse != null && !TextUtils.isEmpty(mtopResponse.getRetMsg())) {
                    q = mtopResponse.getRetMsg();
                }
                if (mtopResponse == null) {
                    str = "";
                } else {
                    str = mtopResponse.getRetCode();
                }
                boolean equals = "DISABLE_TOAST".equals(str);
                if (z2) {
                    h(context, kmbVar);
                }
                if (z && !equals) {
                    be3.c(context, q);
                }
                ub3.d("showErrorView", "显示统一错误页", true, 1.0f);
                hdv.a().commitFeedback(c9x.CART_BIZ_NAME, q, UmTypeKey.TOAST, mtopResponse.getRetCode(), mtopResponse.getMappingCode());
            }
        } else if (i == 3) {
            TBErrorView tBErrorView2 = this.b;
            if (tBErrorView2 != null) {
                tBErrorView2.setVisibility(8);
            }
            g(context);
        }
    }
}
