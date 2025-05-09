package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.service.SNSService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.open.core.util.ParamsConstants;
import com.ali.user.open.oauth.alipay3.AlipayRpcPresenter;
import com.ali.user.open.oauth.alipay3.SignRequest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.taobao.R;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bt0 extends vmo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String b = SNSPlatform.PLATFORM_ALIPAYHK.getPlatform();

    public static /* synthetic */ void g(bt0 bt0Var, Activity activity, wmo wmoVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda7d78c", new Object[]{bt0Var, activity, wmoVar, str, str2});
        } else {
            bt0Var.j(activity, wmoVar, str, str2);
        }
    }

    public static bt0 i(smo smoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bt0) ipChange.ipc$dispatch("6b4b8f2e", new Object[]{smoVar});
        }
        return new bt0();
    }

    public static /* synthetic */ Object ipc$super(bt0 bt0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sns4android/alipayhk/AlipayHKSignInHelper");
    }

    @Override // tb.vmo
    public void b(Activity activity, wmo wmoVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df5b00d", new Object[]{this, activity, wmoVar, jSONObject});
        } else {
            h(false, activity, wmoVar, jSONObject, null);
        }
    }

    @Override // tb.vmo
    public void f(Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("958c604a", new Object[]{this, activity, map});
        } else {
            h(true, activity, this.f30110a, null, map);
        }
    }

    public final void h(boolean z, Activity activity, wmo wmoVar, JSONObject jSONObject, Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebabd808", new Object[]{this, new Boolean(z), activity, wmoVar, jSONObject, map});
            return;
        }
        if (map == null || map.isEmpty() || !map.containsKey(UTConstant.PageName.UT_KEY_PAGE_NAME)) {
            str = "Page_Extent_AlipayHK";
        } else {
            str = map.remove(UTConstant.PageName.UT_KEY_PAGE_NAME);
        }
        LoginContext.alipayHkCallback = new zs0(this, wmoVar, str, activity);
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString(ParamsConstants.Key.PARAM_ALIPAY_URL);
                if (!TextUtils.isEmpty(optString)) {
                    j(activity, wmoVar, str, optString);
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        SignRequest signRequest = new SignRequest();
        signRequest.app_id = "";
        signRequest.pid = "";
        signRequest.sign_type = b;
        signRequest.target_id = "";
        signRequest.scope = "";
        if (activity != null) {
            ((SNSService) ServiceFactory.getService(SNSService.class)).showLoading(activity);
        }
        AlipayRpcPresenter.getAlipaySign(new at0(this, activity, wmoVar, str), signRequest);
    }

    public final void j(Activity activity, wmo wmoVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7242edd", new Object[]{this, activity, wmoVar, str, str2});
            return;
        }
        Intent intent = new Intent();
        intent.setData(Uri.parse(new StringBuilder(str2).toString()));
        if (activity.getPackageManager().queryIntentActivities(intent, 0).size() > 0) {
            intent.setFlags(268468224);
            try {
                activity.startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
                wmoVar.onError(activity, b, -2, activity.getString(R.string.aliuser_sns_platform_auth_fail), str);
            }
        } else {
            wmoVar.onError(activity, b, 10011, activity.getString(R.string.aliuser_sns_platform_auth_fail), str);
        }
    }
}
