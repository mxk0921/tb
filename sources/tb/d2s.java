package tb;

import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.e2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d2s implements e2s.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837598);
        t2o.a(301989921);
    }

    @Override // tb.e2s.a
    public Map<String, List<String>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d3fa450", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("submitTextColor", Arrays.asList(b("tradeTextColor")));
        hashMap.put("gradientThemeColor", Arrays.asList(b("tradeButtonColor")));
        return hashMap;
    }

    public final String b(String str) {
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27e8c37a", new Object[]{this, str});
        }
        if (!FestivalMgr.i().v(DnsPreference.KEY_TRADE) || (e = FestivalMgr.i().e(DnsPreference.KEY_TRADE, str, -1)) == -1) {
            return null;
        }
        return "#" + Integer.toHexString(e);
    }
}
