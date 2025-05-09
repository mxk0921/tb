package tb;

import com.alibaba.analytics.core.model.LogField;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(416284708);
    }

    public static String a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c16f9ea", new Object[]{strArr});
        }
        if (strArr != null && strArr.length == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (strArr != null && strArr.length > 0) {
            boolean z = false;
            for (int i = 0; i < strArr.length; i++) {
                if (!hsq.f(strArr[i])) {
                    if (z) {
                        stringBuffer.append(",");
                    }
                    stringBuffer.append(strArr[i]);
                    z = true;
                }
            }
        }
        return stringBuffer.toString();
    }

    public static void b(String str, int i, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6fccbf9", new Object[]{str, new Integer(i), obj, strArr});
            return;
        }
        String a2 = a(strArr);
        HashMap hashMap = new HashMap();
        hashMap.put(LogField.PAGE.toString(), str);
        String obj2 = LogField.EVENTID.toString();
        hashMap.put(obj2, "" + i);
        hashMap.put(LogField.ARG1.toString(), hsq.c(obj));
        if (a2 != null) {
            hashMap.put(LogField.ARGS.toString(), a2);
        }
        hashMap.put("_bmbu", Constants.VAL_YES);
        UTAnalytics.getInstance().getDefaultTracker().send(hashMap);
    }
}
