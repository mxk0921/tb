package tb;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hpv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be1c6a4", new Object[]{wVCallBackContext, str});
            return;
        }
        try {
            String url = wVCallBackContext.getWebview().getUrl();
            String uri = Uri.parse(url).buildUpon().clearQuery().build().toString();
            UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder(str);
            uTHitBuilders$UTCustomHitBuilder.setEventPage(c2v.getInstance().getCurrentPageName());
            HashMap hashMap = new HashMap();
            hashMap.put("url", url);
            hashMap.put("pureUrl", uri);
            uTHitBuilders$UTCustomHitBuilder.setProperties(hashMap);
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
        } catch (Throwable unused) {
        }
    }
}
