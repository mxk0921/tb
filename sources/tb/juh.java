package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class juh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MTSMeasurementStateBegan = 2;
    public static final int MTSMeasurementStateEnded = 3;
    public static final int MTSMeasurementStateInit = 1;

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46b1d505", new Object[]{new Integer(i)});
        }
        if (i == 2) {
            return "measure_began";
        }
        if (i != 3) {
            return "unknown_state";
        }
        return "measure_ended";
    }
}
