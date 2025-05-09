package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ums {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Long> f29501a = new HashMap();

    static {
        t2o.a(329253028);
    }

    public static String a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab0c11d2", new Object[]{strArr});
        }
        if (strArr == null || strArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void b(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569a615e", new Object[]{str, strArr});
        } else if (cns.f()) {
            try {
                Map<String, Long> map = f29501a;
                if (((HashMap) map).get(str) != null) {
                    zdh.a("TS.performance", String.format("%s, %s, %s costTime = %d,", cns.d(), str, a(strArr), Long.valueOf(SystemClock.uptimeMillis() - ((Long) ((HashMap) map).remove(str)).longValue())));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184c2928", new Object[]{str});
        } else if (cns.f()) {
            try {
                ((HashMap) f29501a).put(str, Long.valueOf(SystemClock.uptimeMillis()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
