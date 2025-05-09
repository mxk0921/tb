package com.taobao.browser.jsbridge;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TrackBuried {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ACTION = "action";
    private static final String KEY_BDID = "bdid";
    public static final String KEY_CARRIER = "carrier_id";
    private static final String KEY_LIST_PARAM = "list_param";
    private static final String KEY_LIST_TYPE = "list_type";
    public static final String KEY_OBJECT_ID = "object_id";
    public static final String KEY_OBJECT_TYPE = "object_type";
    private static Map<String, String> effectMap;
    public static String list_PageType = "";
    public static String list_refer = "";
    public static String list_CurPage = "";
    public static String list_Param = "";
    public static String bdid = "";
    public static String carrier = "";
    public static String list_Type = "";
    public static String[] list_TypeArr = {"activity", "search"};

    public static void ctrlClick(CT ct, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac5fc81", new Object[]{ct, str, map});
            return;
        }
        String str2 = "";
        for (String str3 : map.keySet()) {
            String str4 = map.get(str3);
            if (!TextUtils.isEmpty(str4)) {
                str2 = str2 + str3 + "=" + str4 + ",";
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        new StringBuilder("TrackBuried args:").append(str2);
        TBS.Adv.ctrlClicked(ct, str, str2);
    }

    public static void effectCtrlClick(CT ct, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a56f2db0", new Object[]{ct, str, map});
            return;
        }
        if (map != null) {
            map.putAll(geteffectNormalMap());
        } else {
            map = geteffectNormalMap();
        }
        ctrlClick(ct, str, map);
    }

    public static void effectupdatePageProperties(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594098f8", new Object[]{str, map});
            return;
        }
        if (map != null) {
            map.putAll(geteffectNormalMap());
        } else {
            map = geteffectNormalMap();
        }
        Properties properties = new Properties();
        for (String str2 : map.keySet()) {
            if (!TextUtils.isEmpty(map.get(str2))) {
                properties.put(str2, map.get(str2));
            }
        }
        new StringBuilder("argsMap ：").append(map.toString());
        TBS.Page.updatePageProperties(str, properties);
    }

    private static Map<String, String> geteffectNormalMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2cdf8d4a", new Object[0]);
        }
        if (effectMap == null) {
            effectMap = new HashMap();
        }
        effectMap.put("list_param", list_Param);
        effectMap.put("list_type", list_Type);
        effectMap.put(KEY_BDID, bdid);
        effectMap.put("carrier_id", carrier);
        return effectMap;
    }

    public static boolean needEffectParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("561f5891", new Object[0])).booleanValue();
        }
        if (!TextUtils.isEmpty(list_Type) || !TextUtils.isEmpty(carrier)) {
            return true;
        }
        return false;
    }

    static {
        t2o.a(619708523);
    }
}
