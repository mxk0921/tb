package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.struct.ViewWidget;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class cmf extends ViewWidget<View, IrpDatasource, cmf> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public TextView l;
    public TUrlImageView m;
    public TextView n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481297193);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
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
            } else {
                cmf.h0(cmf.this);
            }
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
            ViewParent parent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            View X = cmf.this.X();
            if (X != null && (parent = X.getParent()) != null) {
                ((ViewGroup) parent).removeView(cmf.this.X());
            }
        }
    }

    static {
        t2o.a(481297192);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmf(Activity activity, vz vzVar, IrpDatasource irpDatasource, xfw xfwVar) {
        super(activity, vzVar, irpDatasource, xfwVar, false, false, 32, null);
        ckf.g(activity, "activity");
        ckf.g(vzVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(irpDatasource, "irpDatasource");
        ckf.g(xfwVar, "setter");
    }

    public static final /* synthetic */ void h0(cmf cmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2649da31", new Object[]{cmfVar});
        } else {
            cmfVar.k0();
        }
    }

    public static /* synthetic */ Object ipc$super(cmf cmfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/IrpGuideViewWidget");
    }

    public final void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df03306", new Object[]{this});
        } else if (!W().X() && lg4.a4() && !caa.t() && !caa.s() && !W().b0() && !eno.b(E(), "crop_guide", false)) {
            mno.e(E(), "crop_guide", true);
            ViewWidget.T(this, null, 1, null);
            j0();
        }
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget
    public View b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        View inflate = LayoutInflater.from(E()).inflate(R.layout.feis_irp_crop_guide, V(), false);
        View findViewById = inflate.findViewById(R.id.tv_title);
        ckf.f(findViewById, "rootView.findViewById(R.id.tv_title)");
        this.l = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.iv_logo);
        ckf.f(findViewById2, "rootView.findViewById(R.id.iv_logo)");
        this.m = (TUrlImageView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.btn_next_step);
        ckf.f(findViewById3, "rootView.findViewById(R.id.btn_next_step)");
        this.n = (TextView) findViewById3;
        return inflate;
    }

    public final void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b652044", new Object[]{this});
            return;
        }
        TextView textView = this.n;
        if (textView != null) {
            textView.setOnClickListener(new b());
            TextView textView2 = this.l;
            if (textView2 != null) {
                textView2.setText(Localization.q(R.string.taobao_app_1007_1_19006));
                TextView textView3 = this.n;
                if (textView3 != null) {
                    textView3.setText(Localization.q(R.string.taobao_app_1007_next_step));
                    TUrlImageView tUrlImageView = this.m;
                    if (tUrlImageView != null) {
                        tUrlImageView.getLayoutParams().width = zb7.a(180.0f);
                        TUrlImageView tUrlImageView2 = this.m;
                        if (tUrlImageView2 != null) {
                            tUrlImageView2.getLayoutParams().height = zb7.a(180.0f);
                            TUrlImageView tUrlImageView3 = this.m;
                            if (tUrlImageView3 != null) {
                                tUrlImageView3.setPadding(zb7.a(37.5f), 0, 0, 0);
                                TUrlImageView tUrlImageView4 = this.m;
                                if (tUrlImageView4 != null) {
                                    tUrlImageView4.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01tWf46u1HCijuHsOXu_!!6000000000722-2-tps-720-720.png");
                                } else {
                                    ckf.y("logoView");
                                    throw null;
                                }
                            } else {
                                ckf.y("logoView");
                                throw null;
                            }
                        } else {
                            ckf.y("logoView");
                            throw null;
                        }
                    } else {
                        ckf.y("logoView");
                        throw null;
                    }
                } else {
                    ckf.y("nextView");
                    throw null;
                }
            } else {
                ckf.y("titleView");
                throw null;
            }
        } else {
            ckf.y("nextView");
            throw null;
        }
    }

    public final void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33ccd12a", new Object[]{this});
            return;
        }
        TextView textView = this.n;
        if (textView != null) {
            textView.setOnClickListener(new c());
            TextView textView2 = this.l;
            if (textView2 != null) {
                textView2.setText(Localization.q(R.string.taobao_app_1007_1_19011));
                TextView textView3 = this.n;
                if (textView3 != null) {
                    textView3.setText(Localization.q(R.string.taobao_app_1007_close));
                    TUrlImageView tUrlImageView = this.m;
                    if (tUrlImageView != null) {
                        tUrlImageView.getLayoutParams().width = zb7.a(200.0f);
                        TUrlImageView tUrlImageView2 = this.m;
                        if (tUrlImageView2 != null) {
                            tUrlImageView2.setPadding(zb7.a(25.5f), 0, 0, 0);
                            TUrlImageView tUrlImageView3 = this.m;
                            if (tUrlImageView3 != null) {
                                tUrlImageView3.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01bWd6Op1u7TDJOaew5_!!6000000005990-2-tps-800-720.png");
                            } else {
                                ckf.y("logoView");
                                throw null;
                            }
                        } else {
                            ckf.y("logoView");
                            throw null;
                        }
                    } else {
                        ckf.y("logoView");
                        throw null;
                    }
                } else {
                    ckf.y("nextView");
                    throw null;
                }
            } else {
                ckf.y("titleView");
                throw null;
            }
        } else {
            ckf.y("nextView");
            throw null;
        }
    }
}
