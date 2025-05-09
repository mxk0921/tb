package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.common.NetRetryType;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.utils.Global;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.zip.CRC32;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vzo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f30371a;
    public static String b;

    static {
        t2o.a(1017118866);
    }

    public static String a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5375505e", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            arrayList.add(String.format("%s=%s", entry.getKey(), entry.getValue()));
        }
        return TextUtils.join(",", arrayList);
    }

    public static String c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3275e5d", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(String.format("%s=%s", entry.getKey(), entry.getValue()));
        }
        return TextUtils.join(",", arrayList);
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4af9952", new Object[0]);
        }
        return e(Global.getApplication());
    }

    public static String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4921966", new Object[]{context});
        }
        if (b == null) {
            f30371a = MunionDeviceUtil.getUtdid(context);
            CRC32 crc32 = new CRC32();
            crc32.update(f30371a.getBytes());
            b = String.valueOf(crc32.getValue());
        }
        return b + System.currentTimeMillis() + new Random().nextInt(10000);
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c302f1d3", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20bffe49", new Object[0]);
        }
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String h(boolean z, boolean z2) {
        NetRetryType netRetryType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5378f96d", new Object[]{new Boolean(z), new Boolean(z2)});
        }
        if (z2) {
            return NetRetryType.DISK.getValue();
        }
        if (z) {
            netRetryType = NetRetryType.MEMORY;
        } else {
            netRetryType = NetRetryType.NONE;
        }
        return netRetryType.getValue();
    }

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{str})).booleanValue();
        }
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean j(List<?> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a436963f", new Object[]{list})).booleanValue();
        }
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean k(Set<?> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5315c439", new Object[]{set})).booleanValue();
        }
        if (set == null || set.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7d8dd19", new Object[]{str})).booleanValue();
        }
        return !i(str);
    }

    public static boolean m(List<?> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("335c9700", new Object[]{list})).booleanValue();
        }
        return !j(list);
    }

    public static String n(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13625f41", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        return JSON.toJSONString(map);
    }

    public static String o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("257656f1", new Object[]{str});
        }
        try {
            return String.format("%032x", new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(Throwable th, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("211b5ecd", new Object[]{th, new Integer(i), new Integer(i2)});
        }
        if (th == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                for (int i3 = i; i3 < stackTrace.length && i3 < i + i2; i3++) {
                    if (sb.length() > 1) {
                        sb.append("<-");
                    }
                    sb.append(stackTrace[i3].getClassName());
                    sb.append("::");
                    sb.append(stackTrace[i3].getMethodName());
                }
            }
        } catch (Throwable unused) {
        }
        return "track=" + sb.toString();
    }
}
