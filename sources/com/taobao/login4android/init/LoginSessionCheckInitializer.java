package com.taobao.login4android.init;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LoginSessionCheckInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(517996590);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else {
            Login.sessionInitCheck(application.getApplicationContext());
        }
    }
}
