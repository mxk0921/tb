package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pbu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b18725b", new Object[]{str});
        }
        return UTDevice.getUtdid(Globals.getApplication()) + ":" + str + ":" + System.currentTimeMillis();
    }

    public static String b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2c7082a", new Object[]{map});
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append("=");
            sb.append(map.get(str));
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1529e9d", new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("serviceId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("version", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("bizName", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("sceneName", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            hashMap.put("token", str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            hashMap.put("cost", str6);
        }
        if (!TextUtils.isEmpty(str7)) {
            hashMap.put("errorCode", str7);
        }
        if (!TextUtils.isEmpty(str8)) {
            hashMap.put("errorMsg", str8);
        }
        TBS.Ext.commitEvent(2201, str9, (Object) null, (Object) null, b(hashMap));
    }
}
