package com.taobao.avplayer;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.component.weex.WXSplayerModule;
import com.taobao.media.MediaSystemUtils;
import com.taobao.tao.Globals;
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
public class DWLauncher1 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(451936271);
    }

    private static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            h95.a();
            if (WXEnvironment.isSupport()) {
                WXSDKEngine.registerModule("SplayerModule", WXSplayerModule.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        if (application != null) {
            MediaSystemUtils.sApplication = application;
            MediaSystemUtils.sApplication = application;
            a7m.d(application);
        } else {
            MediaSystemUtils.sApplication = Globals.getApplication();
            MediaSystemUtils.sApplication = Globals.getApplication();
            if (Globals.getApplication() != null) {
                a7m.d(Globals.getApplication());
            }
        }
        register();
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_DWLauncher1);
    }
}
