package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ii2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84514810", new Object[]{new Integer(i)})).booleanValue();
        }
        int b = BootstrapMode.b();
        if (!BootstrapMode.e(b, 8)) {
            return false;
        }
        return BootstrapMode.e(b, i);
    }
}
