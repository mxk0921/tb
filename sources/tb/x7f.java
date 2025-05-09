package tb;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class x7f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(Application application, HashMap<String, Object> hashMap) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (application == null || hashMap == null) {
            if (application == null) {
                Log.e("InitUt4Aplus", "init error: application is null");
            }
            if (hashMap == null) {
                Log.e("InitUt4Aplus", "init error: params is null");
            }
        } else {
            if (hashMap.get("isDebuggable") != null) {
                z = ((Boolean) hashMap.get("isDebuggable")).booleanValue();
            }
            if (z) {
                application.toString();
                hashMap.toString();
            }
            try {
                zyu.a(application);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
