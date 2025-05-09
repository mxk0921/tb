package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.PreloadWindVanePlugin;
import com.taobao.orange.OConstant;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rxj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321603);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        if (hashMap != null) {
            zgj.b = url.a(hashMap.get("launchStartTime"), -1L);
            Number number = (Number) hashMap.get(OConstant.LAUNCH_ENVINDEX);
            if (number != null && (number.intValue() == 0 || number.intValue() == 1 || number.intValue() == 2)) {
                zgj.g = number.intValue();
            }
        }
        new jxj().a();
        yq0 yq0Var = new yq0();
        yq0Var.k();
        yq0Var.h(application);
        yq0Var.l();
        fsw.h(PreloadWindVanePlugin.NAME, PreloadWindVanePlugin.class);
        txj.b("NewDetailLaunchTask", "init_task" + application + "," + hashMap);
    }
}
