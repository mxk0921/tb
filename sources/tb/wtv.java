package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wtv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(758120542);
    }

    public static void c(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4868a641", new Object[]{str, str2, hashMap});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder(str + "_" + str2);
        uTHitBuilders$UTCustomHitBuilder.setEventPage(str);
        uTHitBuilders$UTCustomHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c917aa08", new Object[]{this, context, str});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(context, str);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, str);
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55adeaec", new Object[]{this, context});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(context);
        }
    }
}
