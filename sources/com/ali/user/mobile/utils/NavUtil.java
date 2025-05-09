package com.ali.user.mobile.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.helper.INavHelper;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NavUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(68157646);
    }

    public static void navTo(Context context, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12ecc5ed", new Object[]{context, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (str.contains("?")) {
                str2 = str.concat("&");
            } else {
                str2 = str.concat("?");
            }
            navToOrigin(context, (str2 + "appcode=") + DataProviderFactory.getDataProvider().getAppkey());
        }
    }

    public static void navToHomePage() {
        Context applicationContext = DataProviderFactory.getApplicationContext();
        LoginApprearanceExtensions loginApprearanceExtensions = AliUserLogin.mAppreanceExtentions;
        if (loginApprearanceExtensions != null && loginApprearanceExtensions.getNavHelper() != null) {
            try {
                ((INavHelper) AliUserLogin.mAppreanceExtentions.getNavHelper().newInstance()).navTo(applicationContext, "http://m.taobao.com/index.htm");
            } catch (Throwable th) {
                th.printStackTrace();
                startUrl(applicationContext, "http://m.taobao.com/index.htm");
            }
        }
    }

    public static void navToOrigin(Context context, String str) {
        LoginApprearanceExtensions loginApprearanceExtensions = AliUserLogin.mAppreanceExtentions;
        if (loginApprearanceExtensions == null || loginApprearanceExtensions.getNavHelper() == null) {
            startUrl(context, str);
            return;
        }
        try {
            ((INavHelper) AliUserLogin.mAppreanceExtentions.getNavHelper().newInstance()).navTo(context, str);
        } catch (Throwable th) {
            th.printStackTrace();
            startUrl(context, str);
        }
    }

    public static void startUrl(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4190f5e", new Object[]{context, str});
            return;
        }
        try {
            if (ServiceFactory.getService(NavigatorService.class) != null) {
                UrlParam urlParam = new UrlParam();
                urlParam.url = str;
                ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openWebViewPage(context, urlParam);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
