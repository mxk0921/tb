package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kuh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MTSMeasurementTargetMetric = 1;
    public static final int MTSMeasurementTargetStage = 2;
    public static final int MTSMeasurementTargetTask = 3;
    public static final int MTSMeasurementTargetUndefined = 0;

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46b1d505", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return "metric";
        }
        if (i == 2) {
            return v4s.PARAM_UPLOAD_STAGE;
        }
        if (i != 3) {
            return "unknown_type";
        }
        return "task";
    }
}
