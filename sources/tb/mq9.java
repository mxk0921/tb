package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.pissarro.external.Config;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mq9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(623902806);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9103a7f", new Object[0])).booleanValue();
        }
        Config a2 = q3m.c().a();
        if (a2.isEnableClip() || a2.isEnableMosaic() || a2.isEnableGraffiti()) {
            return true;
        }
        return false;
    }
}
