package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qfp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745538211);
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21d0b39", new Object[]{application});
            return;
        }
        b(application, "SCP_newSetting");
        b(application, "SCP_account201501");
    }

    public static void b(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a717fd4", new Object[]{application, str});
            return;
        }
        try {
            or2.b(application);
            or2.a(str);
        } catch (Exception e) {
            TLog.logd("cache util", "delete cache error:" + e.getMessage());
        }
    }
}
