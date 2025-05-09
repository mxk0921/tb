package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.ability.localization.Localization;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class krh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792907);
    }

    public final View a(Context context, ResultError resultError, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d22b5d09", new Object[]{this, context, resultError, onClickListener});
        }
        ckf.g(context, "context");
        ckf.g(onClickListener, "clickListener");
        TBErrorView tBErrorView = new TBErrorView(context);
        tBErrorView.setBackgroundColor(-1);
        if (resultError == null) {
            tBErrorView.setStatus(TBErrorView.Status.STATUS_EMPTY);
            tBErrorView.setTitle(Localization.q(R.string.app_system_error));
            tBErrorView.setSubTitle(Localization.q(R.string.taobao_app_1005_1_16651));
            tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
            tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        } else {
            Error uniError = resultError.getUniError();
            if (uniError == null) {
                uniError = Error.Factory.newError(resultError.getMtopCode(), Localization.q(R.string.network_err_msg));
            }
            tBErrorView.setError(uniError);
            TBErrorView.ButtonType buttonType = TBErrorView.ButtonType.BUTTON_LEFT;
            tBErrorView.setButton(buttonType, Localization.q(R.string.app_refresh), onClickListener);
            String str = uniError.errorCode;
            ckf.d(str);
            if (tsq.I(str, q5j.TRAFFIC_LIMIT_STATUS, false, 2, null) || tsq.I(str, "ANDROID_SYS_API_FLOW_LIMIT_LOCKED", false, 2, null)) {
                tBErrorView.setStatus(TBErrorView.Status.STATUS_EMPTY);
                tBErrorView.setTitle(o4p.I());
                tBErrorView.setSubTitle(o4p.H());
                tBErrorView.setButtonVisibility(buttonType, 8);
                tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
            } else {
                JSONObject s = o4p.s(str);
                if (s != null) {
                    tBErrorView.setStatus(TBErrorView.Status.STATUS_EMPTY);
                    String optString = s.optString("mainTitle", "");
                    if (!TextUtils.isEmpty(optString)) {
                        tBErrorView.setTitle(optString);
                    }
                    if (!TextUtils.isEmpty(s.optString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE, ""))) {
                        tBErrorView.setTitle(optString);
                    }
                    String optString2 = s.optString("imageUrl");
                    if (!TextUtils.isEmpty(optString2)) {
                        tBErrorView.setIconUrl(optString2);
                    }
                    if (!s.optBoolean("showRetry", true)) {
                        tBErrorView.setButtonVisibility(buttonType, 8);
                        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
                    }
                }
            }
        }
        return tBErrorView;
    }
}
