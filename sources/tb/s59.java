package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class s59 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T> T a(Map<String, Object> map, String str, Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("995919f4", new Object[]{map, str, cls, t});
        }
        if (!map.containsKey(str)) {
            return null;
        }
        T t2 = (T) map.get(str);
        if (t2 != null && cls.isInstance(t2)) {
            return t2;
        }
        StringBuilder sb = new StringBuilder("wrong data type for key");
        sb.append(str);
        sb.append(":");
        sb.append(t2);
        return t;
    }

    public static void b(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ec6b91", new Object[]{context, str, str2, str3});
            return;
        }
        try {
            Intent intent = new Intent("com.taobao.android.diagnose.action.feedback");
            intent.putExtra("feedbackID", str);
            intent.putExtra("title", str2);
            intent.putExtra("content", str3);
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean c(Context context, Map<String, Object> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ceb491d", new Object[]{context, map})).booleanValue();
        }
        if (map == null || map.isEmpty()) {
            TLog.loge("applicationmonitor_adaptor", "reportFullstrace", "param is null or empty!");
            return false;
        }
        Integer num = (Integer) a(map, "feedbackId", Integer.class, null);
        if (num == null) {
            str = (String) a(map, "feedbackId", String.class, null);
        } else {
            str = num.toString();
        }
        String str2 = "FEEDBACK";
        String str3 = (String) a(map, "bizType", String.class, str2);
        if (!TextUtils.isEmpty(str3)) {
            str2 = str3;
        }
        String str4 = "taobao4android_feedback_21646297";
        String str5 = (String) a(map, "bizCode", String.class, str4);
        if (!TextUtils.isEmpty(str5)) {
            str4 = str5;
        }
        HashMap hashMap = new HashMap(3);
        if (str != null) {
            hashMap.put("feedbackId", str);
        }
        String str6 = (String) a(map, "title", String.class, null);
        if (str6 != null) {
            hashMap.put("title", str6);
        }
        String str7 = (String) a(map, "content", String.class, null);
        if (str7 != null) {
            hashMap.put("content", str7);
        }
        b(context, str, str6, str7);
        d5s.a(context, str2, str4, hashMap);
        return true;
    }
}
