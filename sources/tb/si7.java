package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class si7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4cfad7d", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return "high";
        }
        if (i == 2) {
            return "medium";
        }
        if (i != 3) {
            return "unknown";
        }
        return "low";
    }
}
