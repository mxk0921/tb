package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.x2r;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class iv6 implements x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "sw_plugin";

    static {
        t2o.a(962592819);
        t2o.a(962592825);
    }

    @Override // tb.x2r.a
    public void a(String str, String str2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4813d18a", new Object[]{this, str, str2});
        } else if (KEY.equalsIgnoreCase(str)) {
            try {
                z = Boolean.parseBoolean(str2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (z) {
                o2w.k().c0();
            }
        }
    }
}
