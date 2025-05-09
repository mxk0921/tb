package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mtop.statplugin.MtopStatPlugin;
import com.taobao.mtop.wvplugin.MtopWVPlugin;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class x7j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        MtopWVPlugin.register();
        MtopStatPlugin.register();
    }
}
