package tb;

import com.taobao.tao.log.TLog;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bih {
    static {
        t2o.a(813695000);
    }

    public static String a(Object... objArr) {
        String str;
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
        try {
            TLog.loge("tbrest", str, a(objArr));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static String c(Map map) {
        return new JSONObject(map).toString();
    }
}
