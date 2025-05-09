package com.taobao.orange.launch;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.io.Serializable;
import java.util.HashMap;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TaobaoLaunchOrangeLogin implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(613417079);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        try {
            str = (String) hashMap.get("userId");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        OrangeConfig.getInstance().setUserId(str);
    }
}
