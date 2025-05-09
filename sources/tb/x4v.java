package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class x4v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_COST_TIME = "api_cost_time";
    public static final String EVENT_PAGE_MASTER = "AliDowngradeSDK.master";
    public static final String EVENT_PAGE_SLAVE = "AliDowngradeSDK.slave";

    /* renamed from: a  reason: collision with root package name */
    public final UTOriginalCustomHitBuilder f31146a;
    public final Map<String, String> b;

    public x4v(String str, String str2, String str3, Map<String, String> map) {
        this.b = map;
        map.put(API_COST_TIME, String.valueOf(xpf.a()));
        this.f31146a = new UTOriginalCustomHitBuilder("AliDowngradeSDK", 19999, str, str2, str3, map);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a48500f", new Object[]{this});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(this.f31146a.build());
        }
    }
}
