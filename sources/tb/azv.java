package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class azv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(283115583);
    }

    public static String a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2551ac28", new Object[]{new Long(j), str});
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return new SimpleDateFormat(str).format(instance.getTime());
    }
}
