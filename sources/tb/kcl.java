package tb;

import android.text.TextUtils;
import com.alibaba.analytics.core.model.LogField;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kcl implements jkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031855);
        t2o.a(297795616);
    }

    @Override // tb.jkb
    public void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a51144", new Object[]{this, str, str2, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, null, null, map).build());
        }
    }

    @Override // tb.jkb
    public void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb015301", new Object[]{this, str, str2, map});
            return;
        }
        String currentPageName = c2v.getInstance().getCurrentPageName();
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = currentPageName;
        }
        hashMap.put(LogField.PAGE.toString(), str);
        hashMap.put(LogField.EVENTID.toString(), "2101");
        if (!TextUtils.isEmpty(str)) {
            if (str2.startsWith(str)) {
                hashMap.put(LogField.ARG1.toString(), str2);
            } else {
                String obj = LogField.ARG1.toString();
                hashMap.put(obj, str + str2);
            }
            hashMap.put("_bmbu", Constants.VAL_YES);
            if (map == null) {
                map = new HashMap<>();
            }
            if (!map.containsKey("orderId")) {
                map.put("orderId", d());
            }
            hashMap.put(LogField.ARGS.toString(), map.toString());
            UTAnalytics.getInstance().getDefaultTracker().send(hashMap);
        }
    }

    @Override // tb.jkb
    public void c(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36e086", new Object[]{this, str, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(map.get("pageObject"), str);
        }
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0e7d006", new Object[]{this});
        }
        try {
            Map<String, String> pageProperties = c2v.getInstance().getPageProperties("");
            if (pageProperties != null && (pageProperties.get("newOrderId") instanceof String)) {
                return pageProperties.get("newOrderId");
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
