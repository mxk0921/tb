package com.taobao.login4android.init;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import java.io.Serializable;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LoginSessionValidateInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "login.LoginInitializer3";

    static {
        t2o.a(517996591);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        StringBuilder sb = new StringBuilder("LoginSessionValidateInitializer init() called with: application = [");
        sb.append(application);
        sb.append("], params = [");
        sb.append(hashMap);
        sb.append("]");
        if (TextUtils.isEmpty(Login.getLoginToken()) && TextUtils.isEmpty(Login.getUserId())) {
            Login.triggerLoginBundle();
        }
    }
}
