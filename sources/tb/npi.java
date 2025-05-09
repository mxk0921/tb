package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class npi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static lpi b(dft dftVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpi) ipChange.ipc$dispatch("e1d55d76", new Object[]{dftVar, new Boolean(z)});
        }
        if (!z && !t.a(dftVar.getContext(), "lowEndHomepageSkiOpt")) {
            return new hmh(dftVar);
        }
        if (!f5u.a(dftVar)) {
            return new hmh(dftVar);
        }
        return new imh(dftVar);
    }

    public static lpi a(dft dftVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpi) ipChange.ipc$dispatch("e48b5995", new Object[]{dftVar, new Integer(i)});
        }
        int i2 = c21.g().getInt("deviceLevel", -1);
        whh.a("MessageLooperPreparers", "current device level: " + i2);
        if (BootstrapMode.e(i, 4)) {
            whh.a("MessageLooperPreparers", "use LowEndDevice for Themis");
            return b(dftVar, true);
        } else if (i2 == 0 || BootstrapMode.e(i, 1024)) {
            return new hwa(dftVar);
        } else {
            return b(dftVar, false);
        }
    }
}
