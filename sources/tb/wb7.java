package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.TBErrorView;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltb/wb7;", "Ltb/na4;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "detail-industry_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class wb7 extends na4<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TBErrorView c;
    public obo d;
    public final Context e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
                wb7.h(wb7.this);
            }
        }
    }

    static {
        t2o.a(440401974);
    }

    public wb7(Context context) {
        ckf.g(context, "context");
        this.e = context;
    }

    public static final /* synthetic */ void h(wb7 wb7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470dedf1", new Object[]{wb7Var});
        } else {
            wb7Var.k();
        }
    }

    public static final /* synthetic */ void i(wb7 wb7Var, TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15819d89", new Object[]{wb7Var, tBErrorView});
        } else {
            wb7Var.c = tBErrorView;
        }
    }

    public static /* synthetic */ Object ipc$super(wb7 wb7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/hourlydelivery/DeliveryErrorComponent");
    }

    @Override // tb.na4
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
        }
    }

    @Override // tb.na4
    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        if (this.c == null) {
            TBErrorView tBErrorView = new TBErrorView(this.e);
            this.c = tBErrorView;
            tBErrorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            TBErrorView tBErrorView2 = this.c;
            if (tBErrorView2 != null) {
                tBErrorView2.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
                TBErrorView tBErrorView3 = this.c;
                if (tBErrorView3 != null) {
                    TBErrorView.ButtonType buttonType = TBErrorView.ButtonType.BUTTON_LEFT;
                    tBErrorView3.setButtonVisibility(buttonType, 8);
                    TBErrorView tBErrorView4 = this.c;
                    if (tBErrorView4 != null) {
                        tBErrorView4.setTitle("系统出了点问题");
                        TBErrorView tBErrorView5 = this.c;
                        if (tBErrorView5 != null) {
                            tBErrorView5.setSubTitle("尝试刷新一下吧");
                            TBErrorView tBErrorView6 = this.c;
                            if (tBErrorView6 != null) {
                                tBErrorView6.setButton(buttonType, "刷新页面", new a());
                            } else {
                                ckf.y("errorView");
                                throw null;
                            }
                        } else {
                            ckf.y("errorView");
                            throw null;
                        }
                    } else {
                        ckf.y("errorView");
                        throw null;
                    }
                } else {
                    ckf.y("errorView");
                    throw null;
                }
            } else {
                ckf.y("errorView");
                throw null;
            }
        }
        TBErrorView tBErrorView7 = this.c;
        if (tBErrorView7 != null) {
            return tBErrorView7;
        }
        ckf.y("errorView");
        throw null;
    }

    @Override // tb.na4
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ea132f", new Object[]{this});
            return;
        }
        TBErrorView tBErrorView = this.c;
        if (tBErrorView != null) {
            tBErrorView.setTitle("正在加载中");
            TBErrorView tBErrorView2 = this.c;
            if (tBErrorView2 != null) {
                tBErrorView2.setSubTitle("请稍后...");
                TBErrorView tBErrorView3 = this.c;
                if (tBErrorView3 != null) {
                    tBErrorView3.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 4);
                    obo oboVar = this.d;
                    if (oboVar != null) {
                        oboVar.c();
                        return;
                    }
                    return;
                }
                ckf.y("errorView");
                throw null;
            }
            ckf.y("errorView");
            throw null;
        }
        ckf.y("errorView");
        throw null;
    }

    public final void l(obo oboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbbd7ed4", new Object[]{this, oboVar});
            return;
        }
        ckf.g(oboVar, "handler");
        this.d = oboVar;
    }

    public static final /* synthetic */ TBErrorView g(wb7 wb7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("77bc8805", new Object[]{wb7Var});
        }
        TBErrorView tBErrorView = wb7Var.c;
        if (tBErrorView != null) {
            return tBErrorView;
        }
        ckf.y("errorView");
        throw null;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
            return;
        }
        TBErrorView tBErrorView = this.c;
        if (tBErrorView == null) {
            return;
        }
        if (tBErrorView != null) {
            tBErrorView.setTitle("系统出了点问题");
            TBErrorView tBErrorView2 = this.c;
            if (tBErrorView2 != null) {
                tBErrorView2.setSubTitle("尝试刷新一下吧");
                TBErrorView tBErrorView3 = this.c;
                if (tBErrorView3 != null) {
                    tBErrorView3.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 0);
                } else {
                    ckf.y("errorView");
                    throw null;
                }
            } else {
                ckf.y("errorView");
                throw null;
            }
        } else {
            ckf.y("errorView");
            throw null;
        }
    }
}
