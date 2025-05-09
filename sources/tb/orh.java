package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class orh implements duc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f25599a;
    public final krh b = new krh();

    static {
        t2o.a(815792910);
        t2o.a(993001505);
    }

    public orh(Activity activity) {
        ckf.g(activity, "activity");
        this.f25599a = activity;
    }

    @Override // tb.duc
    public View a(asi asiVar, View.OnClickListener onClickListener) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3d7c0e44", new Object[]{this, asiVar, onClickListener});
        }
        ckf.g(asiVar, "combo");
        ckf.g(onClickListener, "clickListener");
        frh frhVar = (frh) asiVar;
        if (o4p.A2()) {
            TBErrorView tBErrorView = new TBErrorView(this.f25599a);
            tBErrorView.setStatus(TBErrorView.Status.STATUS_EMPTY);
            l4k h0 = frhVar.h0();
            if (h0 != null) {
                if (!TextUtils.isEmpty(h0.c)) {
                    tBErrorView.setIconUrl(h0.c);
                }
                if (!TextUtils.isEmpty(h0.f23107a)) {
                    tBErrorView.setTitle(h0.f23107a);
                }
                if (!TextUtils.isEmpty(h0.b)) {
                    tBErrorView.setSubTitle(h0.b);
                }
                if (h0.d) {
                    tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, Localization.q(R.string.app_refresh), onClickListener);
                } else {
                    tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
                    tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
                }
            }
            return tBErrorView;
        }
        View inflate = LayoutInflater.from(this.f25599a).inflate(R.layout.sf_tbsearch_ms_error, (ViewGroup) null, false);
        Activity activity = this.f25599a;
        ckf.d(inflate);
        prh.a(activity, inflate);
        String q = Localization.q(R.string.taobao_app_1005_1_16692);
        ckf.f(q, "localizedString(...)");
        String q2 = Localization.q(R.string.taobao_app_1005_1_16676);
        ckf.f(q2, "localizedString(...)");
        l4k h02 = frhVar.h0();
        String str = "https://gw.alicdn.com/tfs/TB1uI.xbLJNTKJjSspoXXc6mpXa-330-330.png";
        if (h02 != null) {
            if (!TextUtils.isEmpty(h02.c)) {
                str = h02.c;
            }
            if (!TextUtils.isEmpty(h02.f23107a)) {
                q = h02.f23107a;
            }
            if (!TextUtils.isEmpty(h02.b)) {
                q2 = h02.b;
            }
            z = h02.d;
        } else {
            z = false;
        }
        ((TUrlImageView) inflate.findViewById(R.id.tipLogo)).setImageUrl(str);
        ((TextView) inflate.findViewById(R.id.tipTitle)).setText(q);
        ((TextView) inflate.findViewById(R.id.tipContent)).setText(q2);
        TextView textView = (TextView) inflate.findViewById(R.id.expandBtn);
        if (textView != null) {
            if (z) {
                textView.setVisibility(0);
                textView.setText(Localization.q(R.string.app_reload));
                textView.setOnClickListener(onClickListener);
            } else {
                textView.setVisibility(8);
                textView.setOnClickListener(null);
            }
        }
        return inflate;
    }

    @Override // tb.duc
    public View b(asi asiVar, View.OnClickListener onClickListener) {
        frh frhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d65e0269", new Object[]{this, asiVar, onClickListener});
        }
        ckf.g(asiVar, "combo");
        ckf.g(onClickListener, "clickListener");
        krh krhVar = this.b;
        Activity activity = this.f25599a;
        ResultError resultError = null;
        if (asiVar instanceof frh) {
            frhVar = (frh) asiVar;
        } else {
            frhVar = null;
        }
        if (frhVar != null) {
            resultError = frhVar.q();
        }
        return krhVar.a(activity, resultError, onClickListener);
    }

    @Override // tb.duc
    public View getLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dc3c0794", new Object[]{this});
        }
        View inflate = LayoutInflater.from(this.f25599a).inflate(R.layout.sf_tbsearch_ms_loading, (ViewGroup) null, false);
        Activity activity = this.f25599a;
        ckf.d(inflate);
        prh.b(activity, inflate);
        return inflate;
    }
}
