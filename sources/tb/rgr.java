package tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_plugin.WeexInitSwitch;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class rgr implements bhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855757);
        t2o.a(989855839);
    }

    @Override // tb.bhc
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea8a145", new Object[]{this, context});
            return;
        }
        try {
            TLog.loge("WindVane", "WVJsi", "onBeforeLoadJSI");
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    WeexInitSwitch.loadRemoteQking((Application) applicationContext);
                    TLog.loge("WindVane", "WVJsi", "loadRemoteQking success");
                } else {
                    TLog.loge("WindVane", "WVJsi", "loadRemoteQking failed, applicationContext is not Application");
                }
            }
        } catch (Exception unused) {
        }
    }
}
