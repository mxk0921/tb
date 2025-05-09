package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.umbrella.performance.PerformanceEntity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class odv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6aadc0d1", new Object[]{str})).booleanValue();
        }
        if (idv.C() || TextUtils.isEmpty(str)) {
            return true;
        }
        return false;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da87b19a", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !str.equals(q5j.TRAFFIC_LIMIT_STATUS) && !str.equals(ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK) && !str.equals("FAIL_SYS_USER_VALIDATE") && !str.equals("FAIL_LOCAL_ERROR_FANG_XUE_FENG")) {
            return false;
        }
        return true;
    }

    public static PerformanceEntity c(String str, String str2, Map<String, Long> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerformanceEntity) ipChange.ipc$dispatch("d55f51fb", new Object[]{str, str2, map, map2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || map == null) {
            return null;
        }
        PerformanceEntity performanceEntity = new PerformanceEntity(str, str2, null);
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            Long value = entry.getValue();
            Log.e("UmbrellaUtils", String.valueOf(value));
            performanceEntity.addRecordPoint(entry.getKey(), value.longValue());
        }
        performanceEntity.addArgs(map2);
        return performanceEntity;
    }
}
