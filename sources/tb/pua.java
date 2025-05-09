package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pua {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f26312a = "unknown";
    public static String b = "unknown";
    public static String c = "unknown";
    public static boolean d = false;
    public static String e = "unknown";
    public static String f = "unknown";
    public static String g = "unknown";

    public static void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe49541", new Object[]{map});
            return;
        }
        f26312a = b(map.get("appVersion"), f26312a);
        g = b(map.get("packageTag"), g);
        b = b(map.get("deviceId"), b);
        c = b(map.get("process"), c);
        f = c21.g().getString("lastAppVersion", f);
    }

    public static String b(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7dd16055", new Object[]{obj, str});
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return str;
    }
}
