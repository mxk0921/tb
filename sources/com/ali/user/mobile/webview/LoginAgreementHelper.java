package com.ali.user.mobile.webview;

import android.content.Context;
import com.ali.user.mobile.filter.LoginFilterCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.membercenter.account.AccountListComponent;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoginAgreementHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static LoginFilterCallback sCallback;

    static {
        t2o.a(70254898);
    }

    public static void openAgreement(Context context, LoginFilterCallback loginFilterCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d9deff9", new Object[]{context, loginFilterCallback});
            return;
        }
        sCallback = loginFilterCallback;
        AccountListComponent.showAgreement(context);
    }
}
