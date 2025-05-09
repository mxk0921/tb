package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class iuv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENTID_DEV_STORAGE = 15307;
    public static final int EVENTID_ERROR = 15306;
    public static final int EVENTID_MONITOR = 15301;
    public static final int EVENTID_PA_APPS = 15305;
    public static final int EVENTID_PA_SAPP = 15303;
    public static final int EVENTID_PA_UCSDK = 15309;

    /* renamed from: a  reason: collision with root package name */
    public static Method f21592a;
    public static Method b;
    public static Method c;
    public static boolean OFF = false;
    public static boolean d = false;

    static {
        t2o.a(989856316);
    }

    public static void commitEvent(int i, String str, String str2, String str3) {
        if (f21592a != null && vpw.commonConfig.f30848a != 0) {
            try {
                if (v7t.h()) {
                    v7t.a("UserTrackUtil", "commitEvent: " + i + "||" + str + "||" + str2 + "||" + str3);
                }
                f21592a.invoke(null, Integer.valueOf(i), str, str2, str3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String toArgString(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97cd000e", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(map.size() * 28);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                sb.append(key);
                sb.append("=");
                sb.append(entry.getValue());
                sb.append(",");
            }
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!d) {
            try {
                IpChange ipChange2 = TBS.Ext.$ipChange;
                Class cls = Integer.TYPE;
                f21592a = TBS.Ext.class.getDeclaredMethod("commitEvent", cls, Object.class, Object.class, Object.class);
                b = TBS.Ext.class.getDeclaredMethod("commitEvent", String.class, cls, Object.class, Object.class, Object.class, String[].class);
                c = TBS.Ext.class.getDeclaredMethod("commitEvent", cls, Object.class, Object.class, Object.class, String[].class);
                d = true;
            } catch (ClassNotFoundException unused) {
                v7t.a("UserTrackUtil", "UT class not found");
            } catch (NoSuchMethodException unused2) {
                v7t.a("UserTrackUtil", "UT method not found");
            }
        }
    }

    public static void commitEvent(String str, int i, String str2, String str3, String str4, String str5) {
        if (b != null && vpw.commonConfig.f30848a != 0) {
            try {
                if (v7t.h()) {
                    v7t.a("UserTrackUtil", "commitEvent: " + str + "||" + i + "||" + str2 + "||" + str3 + "||" + str4 + ((Object) TextUtils.concat(str5)));
                }
                b.invoke(null, str, Integer.valueOf(i), str2, str3, str4, new String[]{str5});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void commitEvent(int i, String str, String str2, String str3, String[] strArr) {
        if (c != null && vpw.commonConfig.f30848a != 0) {
            try {
                if (v7t.h()) {
                    v7t.a("UserTrackUtil", "commitEvent: " + i + "||" + str + "||" + str2 + "||" + str3 + ((Object) TextUtils.concat(strArr)));
                }
                c.invoke(null, Integer.valueOf(i), str, str2, str3, strArr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
