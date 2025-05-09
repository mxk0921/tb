package com.ali.user.mobile.common.api;

import android.content.SharedPreferences;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AliUserLogin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static LoginApprearanceExtensions mAppreanceExtentions;

    static {
        t2o.a(68157470);
    }

    public static void clearCacheData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82e73d0", new Object[]{str});
            return;
        }
        try {
            SharedPreferences sharedPreferences = DataProviderFactory.getApplicationContext().getSharedPreferences(str, 0);
            if (sharedPreferences != null) {
                sharedPreferences.edit().clear().apply();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static LoginApprearanceExtensions getAppreanceExtentions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginApprearanceExtensions) ipChange.ipc$dispatch("2cc30e0a", new Object[0]);
        }
        if (mAppreanceExtentions == null && DataProviderFactory.getDataProvider().getLoginExtension() != null) {
            mAppreanceExtentions = DataProviderFactory.getDataProvider().getLoginExtension();
        }
        return mAppreanceExtentions;
    }

    public static void setLoginAppreanceExtions(LoginApprearanceExtensions loginApprearanceExtensions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f4821a", new Object[]{loginApprearanceExtensions});
        } else {
            mAppreanceExtentions = loginApprearanceExtensions;
        }
    }
}
