package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.alipay.auth.mobile.api.IAlipayAuthEventHandler;
import com.alipay.auth.mobile.exception.AlipayAuthIllegalArgumentException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.ToastUtil;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Properties;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yeq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bcbc5d5", new Object[]{intent});
        } else if (LoginContext.alipayHkCallback == null) {
        } else {
            if (intent == null && intent.getData() == null) {
                CommonDataCallback commonDataCallback = LoginContext.alipayHkCallback;
                IpChange ipChange2 = bt0.$ipChange;
                commonDataCallback.onFail(-1, "alipayHK intent is null or invalid");
                return;
            }
            Uri data = intent.getData();
            try {
                String queryParameter = data.getQueryParameter("resultStatus");
                new HashMap().put("resultStatus", queryParameter);
                UserTrackAdapter.sendUT("handleAlipayHKIntent");
                if ("9000".equals(queryParameter)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("authCode", data.getQueryParameter("authCode"));
                    LoginContext.alipayHkCallback.onSuccess(hashMap);
                } else if ("4000".equals(queryParameter)) {
                    CommonDataCallback commonDataCallback2 = LoginContext.alipayHkCallback;
                    IpChange ipChange3 = bt0.$ipChange;
                    commonDataCallback2.onFail(-3, "auth canceled");
                } else {
                    CommonDataCallback commonDataCallback3 = LoginContext.alipayHkCallback;
                    IpChange ipChange4 = bt0.$ipChange;
                    commonDataCallback3.onFail(-2, "auth failed");
                }
            } catch (Throwable unused) {
                CommonDataCallback commonDataCallback4 = LoginContext.alipayHkCallback;
                IpChange ipChange5 = bt0.$ipChange;
                commonDataCallback4.onFail(-1, "alipayHK intent is null or invalid");
            }
        }
    }

    public static void b(Intent intent, IAlipayAuthEventHandler iAlipayAuthEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa6ff153", new Object[]{intent, iAlipayAuthEventHandler});
        } else if (c(intent)) {
            try {
                vs0.b().a().handleIntent(intent, iAlipayAuthEventHandler);
            } catch (AlipayAuthIllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69191c29", new Object[]{intent})).booleanValue();
        }
        try {
            return vs0.b().a().isAlipayAuthCallBack(intent);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void d(Activity activity, String str, String str2, String str3, String str4) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678d545e", new Object[]{activity, str, str2, str3, str4});
            return;
        }
        try {
            DataProviderFactory.getDataProvider().setAlipaySsoDesKey(str);
            vs0.b().a().openAlipayAuth(activity, str, str2, str3, str4);
            Properties properties = new Properties();
            properties.setProperty("monitor", "T");
            LoginParam loginParam = xwr.f31648a;
            if (loginParam == null) {
                str5 = UTConstant.PageName.UT_PAGE_EXTEND;
            } else {
                str5 = loginParam.utPageName;
            }
            UserTrackAdapter.sendUT(str5, UTConstant.CustomEvent.UT_SSO_AUTHCODE_COMMIT, "", LoginType.LocalLoginType.ASO_LOGIN, properties);
            LoginContext.sSSOAuthCodeStartTime = System.currentTimeMillis();
        } catch (Throwable th) {
            th.printStackTrace();
            Properties properties2 = new Properties();
            properties2.setProperty("code", th.getMessage() + "");
            UserTrackAdapter.sendUT(UTConstant.CustomEvent.UT_ALIPAY_SSO_EXCEPTION, properties2);
            ToastUtil.showToast(activity, activity.getResources().getString(R.string.aliuser_network_error), 0);
        }
    }
}
