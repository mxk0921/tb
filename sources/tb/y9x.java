package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class y9x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766510500);
    }

    public static synchronized WXSDKInstance a() {
        synchronized (y9x.class) {
            IpChange ipChange = $ipChange;
            if (!(ipChange instanceof IpChange)) {
                return null;
            }
            return (WXSDKInstance) ipChange.ipc$dispatch("368fc403", new Object[0]);
        }
    }

    public static synchronized void b() {
        synchronized (y9x.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[0]);
            }
        }
    }
}
