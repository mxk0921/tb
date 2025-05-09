package com.taobao.orange.launch;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.ConfigCenter;
import com.taobao.orange.util.OLog;
import java.io.Serializable;
import java.util.HashMap;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TaobaoLaunchOrangeIdle implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TaobaoLaunchOrangeIdle";

    static {
        t2o.a(613417078);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        OLog.e(TAG, "TaobaoLaunchOrangeIdle been called", new Object[0]);
        ConfigCenter.getInstance().delayLoadConfig();
    }
}
