package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.content.modules.CBModudle;
import com.taobao.weex.WXSDKEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class op2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(701497349);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        try {
            WXSDKEngine.registerModule("contentAddCart", CBModudle.class);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
