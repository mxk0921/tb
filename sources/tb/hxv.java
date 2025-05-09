package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.ut.device.UTDevice;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(284164130);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("592cda11", new Object[0]);
        }
        if (!f()) {
            return "-1";
        }
        return b("hw_sc.build.platform.version", "");
    }

    public static String b(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str3 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            if (TextUtils.isEmpty(str3)) {
                return str2;
            }
            return str3;
        } catch (Throwable th) {
            th.printStackTrace();
            return str2;
        }
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a287796", new Object[0])).intValue();
        }
        return ubl.b(ubl.ORANGE_KEY_CHANGE_APP_ICON_ERROR_MSG_UT_MAX_LENGTH, 300);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f865606e", new Object[]{str});
        }
        return h(str, c());
    }

    public static boolean e(int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fd0e783", new Object[]{new Integer(i)})).booleanValue();
        }
        try {
            int abs = Math.abs(UTDevice.getUtdid(qh3.k()).hashCode()) % 10000;
            if (abs < i) {
                z = true;
            }
            AdapterForTLog.logd(qh3.TAG, "isABTest : value=" + i + " flagIndex=" + abs);
            return z;
        } catch (Exception e) {
            AdapterForTLog.loge(qh3.TAG, "error " + e.getMessage(), e);
            return z;
        }
    }

    public static boolean f() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "Harmony".equalsIgnoreCase(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]).toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static <T> T g(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7c96a3b0", new Object[]{str, cls});
        }
        try {
            return (T) JSON.parseObject(str, cls);
        } catch (Exception e) {
            AdapterForTLog.loge(qh3.TAG, "jsonParseObject error " + e.getMessage(), e);
            return null;
        }
    }

    public static String h(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("530ca99f", new Object[]{str, new Integer(i)});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            return str.substring(0, Math.min(str.length(), i));
        } catch (Exception e) {
            e.printStackTrace();
            return "-1";
        }
    }
}
