package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.CommonJsApiManager;
import com.taobao.login4android.api.Login;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n7r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708476);
    }

    public static synchronized void a(String str) {
        synchronized (n7r.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60dc73a1", new Object[]{str});
            } else {
                CommonJsApiManager.initCommonJsbridge();
            }
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf81cf25", new Object[]{str})).booleanValue();
        }
        return Login.isLoginUrl(str);
    }
}
