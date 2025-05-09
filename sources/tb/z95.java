package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.CT;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class z95 implements vtb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(451936288);
        t2o.a(452985006);
    }

    @Override // tb.vtb
    public void a(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be724dfc", new Object[]{this, str, str2, str3, map, map2});
            return;
        }
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_DWUserTrackAdapter);
        if ("expose".equals(str2)) {
            c(str, map, map2);
        }
        if (str != null && str2 != null && str3 != null && map != null) {
            HashMap hashMap = new HashMap();
            if (map2 != null) {
                hashMap.putAll(map2);
            }
            hashMap.putAll(map);
            String concat = "Page_".concat(str);
            UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(concat, CT.valueOf(str2) + "-" + str3);
            uTHitBuilders$UTControlHitBuilder.setProperties(hashMap);
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
        }
    }

    @Override // tb.vtb
    public void b(String str, String str2, int i, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22de0396", new Object[]{this, str, str2, new Integer(i), str3, str4, str5, map});
            return;
        }
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_DWUserTrackAdapter);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_DWVideo", i, str3, str4, str5, map).build());
    }

    public void c(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850f85f5", new Object[]{this, str, map, map2});
            return;
        }
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_DWUserTrackAdapter);
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (map2 != null) {
                hashMap.putAll(map2);
            }
            UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder(str);
            uTHitBuilders$UTCustomHitBuilder.setEventPage(str);
            uTHitBuilders$UTCustomHitBuilder.setProperties(hashMap);
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
        }
    }
}
