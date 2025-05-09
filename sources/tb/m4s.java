package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m4s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Object... objArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bac6f5a2", new Object[]{objArr});
        }
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                if (obj instanceof Map) {
                    str = c((Map) obj);
                } else {
                    str = obj.toString();
                }
                sb.append("->");
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5242d63c", new Object[]{str, objArr});
            return;
        }
        ehh.b(str, objArr);
        try {
            TLog.loge("CrashReport", str, a(objArr));
        } catch (Throwable th) {
            ehh.d(th);
        }
    }

    public static String c(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e1691a0", new Object[]{map});
        }
        return new JSONObject(map).toString();
    }
}
