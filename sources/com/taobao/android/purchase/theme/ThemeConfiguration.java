package com.taobao.android.purchase.theme;

import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aqb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ThemeConfiguration implements aqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f9230a = DnsPreference.KEY_TRADE;

    static {
        t2o.a(708837599);
        t2o.a(155189375);
    }

    private String c(String str) {
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

    @Override // tb.aqb
    public Map<String, List<String>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aac1b80e", new Object[]{this});
        }
        final String c = c("tradeTextColor");
        final String c2 = c("tradeButtonColor");
        if (c != null) {
            return new HashMap<String, List<String>>() { // from class: com.taobao.android.purchase.theme.ThemeConfiguration.1
                {
                    put("submitTextColor", new ArrayList<String>() { // from class: com.taobao.android.purchase.theme.ThemeConfiguration.1.1
                        {
                            add(c);
                        }
                    });
                    put("gradientThemeColor", new ArrayList<String>() { // from class: com.taobao.android.purchase.theme.ThemeConfiguration.1.2
                        {
                            add(c2);
                        }
                    });
                }
            };
        }
        return null;
    }

    @Override // tb.aqb
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61d25a94", new Object[]{this});
        }
        return null;
    }
}
