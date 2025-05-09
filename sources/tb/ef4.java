package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ef4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a20342a", new Object[0])).booleanValue();
        }
        return String.valueOf(true).equals(OrangeConfig.getInstance().getConfig("relation-daifu", "isNavTransferOpen", String.valueOf(true)));
    }
}
