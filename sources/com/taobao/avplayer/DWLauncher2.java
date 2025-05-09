package com.taobao.avplayer;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.component.weex.WXSplayerModule;
import com.taobao.media.MediaDeviceUtils;
import com.taobao.tao.Globals;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import java.io.Serializable;
import java.util.HashMap;
import tb.a7m;
import tb.h95;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWLauncher2 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(451936272);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        MediaDeviceUtils.isSupportH265("1.8");
        h95.a();
        if (application != null) {
            a7m.d(application);
        } else if (Globals.getApplication() != null) {
            a7m.d(Globals.getApplication());
        }
        try {
            if (WXEnvironment.isSupport()) {
                WXSDKEngine.registerModule("SplayerModule", WXSplayerModule.class);
                AVSDKLog.d("DWLauncher2", "registerModule");
            }
        } catch (Exception e) {
            AVSDKLog.e("DWLauncher2", "registerModule error:" + e.getMessage());
            e.printStackTrace();
        }
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_DWLauncher2);
    }
}
