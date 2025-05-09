package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.ConfigCenter;
import com.taobao.orange.util.OLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m9t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(613417077);
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        OLog.d("TaobaoLaunchOrangeForeground", "TaobaoLaunchOrangeForeground been called", new Object[0]);
        ConfigCenter.getInstance().delayLoadConfigForeground();
    }
}
