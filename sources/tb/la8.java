package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class la8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Integer> f23208a;

    static {
        HashMap hashMap = new HashMap(6);
        f23208a = hashMap;
        hashMap.put("V", 31);
        hashMap.put(TLogTracker.LEVEL_DEBUG, 30);
        hashMap.put(TLogTracker.LEVEL_INFO, 28);
        hashMap.put("W", 24);
        hashMap.put("E", 16);
        hashMap.put("L", 0);
    }

    public static String a(String str, Object... objArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe17598b", new Object[]{str, objArr});
        }
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(64);
        if (str != null) {
            sb.append(str);
        }
        if (objArr != null) {
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(" ");
                Object obj = objArr[i];
                if (obj == null) {
                    obj = "";
                }
                sb.append(obj);
                sb.append(":");
                Object obj2 = objArr[i2];
                if (obj2 == null) {
                    obj2 = "";
                }
                sb.append(obj2);
                i += 2;
            }
            if (i < objArr.length) {
                sb.append(" ");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    public static void b(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d61a9c", new Object[]{str, str2, th, objArr});
        } else if (e(16)) {
            if (th != null) {
                AdapterForTLog.loge(str, a(str2, objArr), th);
            } else {
                AdapterForTLog.loge(str, a(str2, objArr));
            }
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
        } else {
            b(str, str2, null, objArr);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{str, str2, objArr});
        } else if (e(4)) {
            AdapterForTLog.logi(str, a(str2, objArr));
        }
    }

    public static boolean e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59c881a", new Object[]{new Integer(i)})).booleanValue();
        }
        if ((i & ((Integer) ((HashMap) f23208a).get(AdapterForTLog.getLogLevel())).intValue()) != 0) {
            return true;
        }
        return false;
    }
}
