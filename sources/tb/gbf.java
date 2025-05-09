package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gbf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EDITION_CODE_OLD = "OLD";

    static {
        t2o.a(456130574);
    }

    public static void a(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bb9225", new Object[]{str, str2, str3, new Integer(i)});
        } else if ("OLD".equals(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str2, str3);
            TBRevisionSwitchManager.c().l(hashMap, false, i);
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str2, "0");
            TBRevisionSwitchManager.c().l(hashMap2, false, i);
        }
    }
}
