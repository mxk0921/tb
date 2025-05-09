package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class aih implements yxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public final String a(String str, Object... objArr) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c6cc3ac", new Object[]{this, str, objArr});
        }
        if (TextUtils.isEmpty(str) && (objArr == null || objArr.length == 0)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!(objArr == null || objArr.length == 0)) {
            for (Object obj : objArr) {
                if (obj != null) {
                    if (obj instanceof Map) {
                        str2 = c((Map) obj);
                    } else {
                        str2 = obj.toString();
                    }
                    sb.append("->");
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }

    public void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3ba772", new Object[]{this, str, str2, objArr});
            return;
        }
        try {
            TLog.loge("apm", str, a(str2, objArr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final String c(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e1691a0", new Object[]{this, map});
        }
        return new JSONObject(map).toString();
    }
}
