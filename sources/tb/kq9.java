package tb;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kq9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Activity activity, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cdb92d7", new Object[]{activity, str, map});
            return;
        }
        if (activity != null) {
            try {
                if (!(activity.getIntent() == null || activity.getIntent().getData() == null)) {
                    Uri data = activity.getIntent().getData();
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    map.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, data.toString());
                    for (String str2 : data.getQueryParameterNames()) {
                        String queryParameter = data.getQueryParameter(str2);
                        String str3 = "uri_" + str2;
                        if (queryParameter == null) {
                            queryParameter = "";
                        }
                        map.put(str3, queryParameter);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                y7t.a("FlowStatisticsTrackUtil", th.toString());
                return;
            }
        }
        b(str, map);
    }

    public static void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4689e69", new Object[]{str, map});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                ArrayList arrayList = new ArrayList();
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (entry != null) {
                            arrayList.add(entry.getKey() + "=" + entry.getValue());
                        }
                    }
                }
                TBS.Ext.commitEvent("Page_InteractiveFlowStatistics", 19997, str, null, null, (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
        } catch (Throwable th) {
            th.printStackTrace();
            y7t.a("FlowStatisticsTrackUtil", th.toString());
        }
    }
}
