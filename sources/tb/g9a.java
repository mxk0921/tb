package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.gift.IGiftProxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class g9a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093351);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11e826ed", new Object[0])).booleanValue();
        }
        if (bl9.g().e() == null || bl9.g().e().get(IGiftProxy.KEY) == null) {
            return false;
        }
        return true;
    }
}
