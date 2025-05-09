package tb;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbelder.TBElder;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rm0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301990103);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc46dfa3", new Object[0])).booleanValue();
        }
        return new File("/data/local/tmp/.skipFloatBuy").exists();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69249934", new Object[0])).booleanValue();
        }
        if (TBElder.b() || Localization.o() || a()) {
            return true;
        }
        return false;
    }
}
