package com.taobao.codetrack;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.io.Serializable;
import java.util.HashMap;
import tb.ah8;
import tb.hy3;
import tb.jy3;
import tb.sgr;
import tb.t71;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CodeTrackLauncher implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private boolean checkBetaVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f92f132b", new Object[]{this})).booleanValue();
        }
        try {
            String str = LauncherRuntime.e;
            if (str != null) {
                if (str.split("\\.").length >= 4) {
                    return true;
                }
            }
        } catch (Throwable th) {
            Log.e(t71.MODULE_NAME, "", th);
        }
        return false;
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        Log.e(t71.MODULE_NAME, "CodeTrack Launched." + LauncherRuntime.e);
        String a2 = ah8.a(application);
        jy3 jy3Var = new jy3();
        jy3Var.d(a2);
        jy3Var.e(false);
        jy3Var.c(checkBetaVersion());
        hy3.b().c(application.getApplicationContext(), jy3Var);
        sgr.c(application.getApplicationContext(), a2);
    }
}
