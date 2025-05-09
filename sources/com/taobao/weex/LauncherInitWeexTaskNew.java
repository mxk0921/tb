package com.taobao.weex;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.weex.adapter.WXInitAdapter;
import java.io.Serializable;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LauncherInitWeexTaskNew implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(773849108);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        TLog.loge("Weex", "Weex", "enter LauncherInitWeexTask");
        WXSDKManager.getInstance().setWXInitTaskAdapter(new WXInitAdapter());
    }
}
