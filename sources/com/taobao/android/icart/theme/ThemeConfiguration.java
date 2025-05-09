package com.taobao.android.icart.theme;

import android.text.TextUtils;
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
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ThemeConfiguration implements aqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150877);
        t2o.a(155189375);
    }

    @Override // tb.aqb
    public Map<String, List<String>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aac1b80e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        String c = c("tradeButtonColor");
        if (!TextUtils.isEmpty(c)) {
            hashMap.put("gradientThemeColor", new ArrayList<String>(c) { // from class: com.taobao.android.icart.theme.ThemeConfiguration.1
                public final /* synthetic */ String val$chargeColor;

                {
                    this.val$chargeColor = c;
                    add(c);
                    add(c);
                }
            });
        }
        String f = FestivalMgr.i().f("mytaobao", "skinPic");
        if (!TextUtils.isEmpty(f)) {
            hashMap.put("skinPic", new ArrayList<String>(f) { // from class: com.taobao.android.icart.theme.ThemeConfiguration.2
                public final /* synthetic */ String val$festivalSkinPic;

                {
                    this.val$festivalSkinPic = f;
                    add(f);
                }
            });
        }
        String f2 = FestivalMgr.i().f("global", FestivalMgr.KEY_GLOBAL_ACTIONBAR_BG);
        if (!TextUtils.isEmpty(f2)) {
            hashMap.put("actionBarColor", new ArrayList<String>(f2) { // from class: com.taobao.android.icart.theme.ThemeConfiguration.3
                public final /* synthetic */ String val$actionBarColor;

                {
                    this.val$actionBarColor = f2;
                    add(f2);
                }
            });
        }
        return hashMap;
    }

    @Override // tb.aqb
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61d25a94", new Object[]{this});
        }
        return null;
    }

    public final String c(String str) {
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
