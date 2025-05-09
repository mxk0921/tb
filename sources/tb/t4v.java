package tb;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.change.app.icon.model.AppIconComponentName;
import com.taobao.login4android.Login;
import com.ut.device.UTDevice;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class t4v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_ID_19999 = 19999;
    public static final int EVENT_ID_CLICK = 2101;
    public static final int EVENT_ID_UI_SHOW = 2201;
    public static final String PAGE_NAME = "Page_ChangeAppIcon";

    static {
        t2o.a(284164129);
    }

    public static void a(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733b24ed", new Object[]{str, str2, str3, str4, map});
        } else {
            d(str, 19999, str2, str3, str4, map);
        }
    }

    public static void b(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e74c8296", new Object[]{str, str2, str3, str4, map});
        } else {
            d(str, 2101, str2, str3, str4, map);
        }
    }

    public static void c(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf098686", new Object[]{str, str2, str3, str4, map});
        } else {
            d(str, 2201, str2, str3, str4, map);
        }
    }

    public static void d(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd69623c", new Object[]{str, new Integer(i), str2, str3, str4, map});
        } else if (UTAnalytics.getInstance().isInit()) {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, e(map)).build());
        }
    }

    public static Map<String, String> e(Map<String, String> map) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a4682e77", new Object[]{map});
        }
        if (map == null) {
            try {
                map = new HashMap();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        String utdid = UTDevice.getUtdid(qh3.k());
        map.put("utdid_hash", String.valueOf(Math.abs(Math.abs(utdid.hashCode())) % 10000));
        map.put("utdid", utdid);
        map.put("userId", Login.getOldUserId());
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry<String, AppIconComponentName> entry : qh3.s().entrySet()) {
            AppIconComponentName value = entry.getValue();
            sb.append(value.iconName);
            sb.append(":");
            sb.append(value.state);
            sb.append(";");
            int i4 = value.state;
            if (i4 == 0) {
                i++;
            } else if (i4 == 1) {
                i2++;
            } else {
                i3++;
            }
        }
        sb.append("]");
        map.put("AppIcons", sb.toString());
        map.put("defaultSize", String.valueOf(i));
        map.put("enableSize", String.valueOf(i2));
        map.put("otherSize", String.valueOf(i3));
        AppIconComponentName l = qh3.l(qh3.k());
        map.put("currentAppIcon", l.toString());
        AppIconComponentName r = qh3.r();
        map.put("expectAppIcon", r.toString());
        map.put("current_eq_expect", String.valueOf(TextUtils.equals(l.clzPath, r.clzPath)));
        map.put("deviceBrand", Build.BRAND);
        map.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
        map.put("osVersion", Build.VERSION.RELEASE);
        map.put("harmonyVersion", hxv.a());
        return map;
    }
}
