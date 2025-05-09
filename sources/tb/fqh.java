package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fqh implements gqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.gqh
    public String getDeviceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89e64461", new Object[]{this});
        }
        try {
            int i = c21.g().getInt("deviceLevel", -1);
            if (i == 0) {
                return "high";
            }
            if (i == 1) {
                return "medium";
            }
            return "low";
        } catch (Throwable th) {
            th.printStackTrace();
            return "low";
        }
    }
}
