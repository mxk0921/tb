package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class enj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_INTENT_TARGET_ACTIVITY = "INTENT_TARGET_ACTIVITY";

    static {
        t2o.a(578814048);
    }

    public static Nav a(zmj zmjVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("8232fd7f", new Object[]{zmjVar, intent});
        }
        return Nav.from(zmjVar, intent);
    }
}
