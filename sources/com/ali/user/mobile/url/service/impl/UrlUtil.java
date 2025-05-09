package com.ali.user.mobile.url.service.impl;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.helper.IUccInterface;
import com.ali.user.mobile.model.UrlParam;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UrlUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.urlUtil";

    static {
        t2o.a(69206204);
    }

    public static void OpenUCC(Context context, UrlParam urlParam, CommonDataCallback commonDataCallback) {
        if (urlParam != null && !TextUtils.isEmpty(urlParam.url)) {
            LoginApprearanceExtensions loginApprearanceExtensions = AliUserLogin.mAppreanceExtentions;
            if (loginApprearanceExtensions == null || loginApprearanceExtensions.getUccHelper() == null) {
                LoginTLogAdapter.e(TAG, "no ucc helper ");
                return;
            }
            try {
                ((IUccInterface) AliUserLogin.mAppreanceExtentions.getUccHelper().newInstance()).openUrl(context, urlParam, commonDataCallback);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
