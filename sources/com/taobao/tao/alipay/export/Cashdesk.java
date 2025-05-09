package com.taobao.tao.alipay.export;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.utils.CashDeskLog;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import tb.df3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class Cashdesk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NAV_URL_CASHIER = "http://d.m.taobao.com/launchCashier.htm";

    private static Uri.Builder getBuilder(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri.Builder) ipChange.ipc$dispatch("cc91a0cf", new Object[]{str, map});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                buildUpon = buildUpon.appendQueryParameter(key, value);
            }
        }
        return buildUpon;
    }

    public static Map<String, String> getQueryMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e7f08af0", new Object[]{str});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> queryParameterNames = getQueryParameterNames(str);
        if (queryParameterNames == null || queryParameterNames.isEmpty()) {
            return null;
        }
        for (String str2 : queryParameterNames) {
            String queryParameter = getQueryParameter(str, str2);
            if (!(str2 == null || queryParameter == null)) {
                linkedHashMap.put(str2, queryParameter);
            }
        }
        return linkedHashMap;
    }

    private static String getQueryParameter(String str, String str2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("173d6b0e", new Object[]{str, str2});
        }
        if (str == null) {
            return null;
        }
        String encode = Uri.encode(str2, null);
        int length = str.length();
        int i2 = 0;
        while (true) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf != -1) {
                i = indexOf;
            } else {
                i = length;
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 > i || indexOf2 == -1) {
                indexOf2 = i;
            }
            if (indexOf2 - i2 != encode.length() || !str.regionMatches(i2, encode, 0, encode.length())) {
                if (indexOf == -1) {
                    return null;
                }
                i2 = indexOf + 1;
            } else if (indexOf2 == i) {
                return "";
            } else {
                return str.substring(indexOf2 + 1, i);
            }
        }
    }

    private static Set<String> getQueryParameterNames(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("be3d4911", new Object[]{str});
        }
        if (str == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        do {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(str.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < str.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static void invokeAlipay(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed0e8e26", new Object[]{context, map});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "invokeAlipay from CashDesk");
        if (PayRequest.CALL_WEIXIN_SDK.equals(map.get("cashierType"))) {
            new df3().e(context, map, null);
        } else if (!PayRequest.CALL_LAUNCH_CASHIER_PAGE.equals(map.get("cashierType"))) {
            Nav.from(context).toUri(getBuilder("http://d.m.taobao.com/goAlipay.htm", map).toString());
        } else if (context instanceof Activity) {
            new df3().e(context, map, null);
        } else {
            Nav.from(context).toUri(getBuilder(NAV_URL_CASHIER, map).toString());
        }
    }

    public static void invokeAlipay(Context context, Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c3a99d", new Object[]{context, map, new Integer(i)});
            return;
        }
        map.put("result", "1");
        Nav.from(context).forResult(i).toUri(getBuilder("http://d.m.taobao.com/goAlipay.htm", map).toString());
    }
}
