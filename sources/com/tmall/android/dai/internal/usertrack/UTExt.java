package com.tmall.android.dai.internal.usertrack;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.internal.streamprocessing.WalleStreamListener;
import com.tmall.android.dai.internal.streamprocessing.WalleStreamSource;
import java.util.HashMap;
import java.util.Map;
import tb.stv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UTExt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG3_USE_NEW_UTEXT = "_walle_flag_new_utext_";

    static {
        t2o.a(1034944666);
    }

    public static Map<String, String> a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c53b264a", new Object[]{str, str2, str3, str4, str5, map});
        }
        c(str, str2, str3, str4, str5, map);
        return b(str, str2, str3, str4, str5, map, null);
    }

    public static Map<String, String> b(String str, String str2, String str3, String str4, String str5, Map<String, String> map, DAICallback dAICallback) {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5b470d48", new Object[]{str, str2, str3, str4, str5, map, dAICallback});
        }
        boolean equals = TextUtils.equals(ARG3_USE_NEW_UTEXT, str5);
        UserTrackDO userTrackDO = new UserTrackDO();
        userTrackDO.setPageName(str + "." + str2);
        userTrackDO.setPageNameSizeForUtext(str.length());
        userTrackDO.setEventId(-19999);
        if (str3 != null) {
            userTrackDO.setArg1(str3);
        }
        if (str4 != null) {
            userTrackDO.setArg2(str4);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (equals) {
            if (str5 != null) {
                userTrackDO.setArg3(str5);
            }
            userTrackDO.setCreateTime(currentTimeMillis);
        } else {
            userTrackDO.setArg3(Long.toString(currentTimeMillis));
        }
        if (!equals) {
            try {
                HashMap hashMap = new HashMap();
                if (str3 != null) {
                    hashMap.put("arg1", str3);
                }
                if (str4 != null) {
                    hashMap.put("arg2", str4);
                }
                if (str5 != null) {
                    hashMap.put("arg3", str5);
                }
                if (map != null) {
                    hashMap.put("args", map);
                }
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    Object value = entry.getValue();
                    if (!(value == null || (obj = value.toString()) == null)) {
                        hashMap2.put(entry.getKey(), obj);
                    }
                }
                userTrackDO.setArgs(hashMap2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (map != null) {
            userTrackDO.setArgs(map);
        }
        stv.d().f(userTrackDO);
        return new HashMap();
    }

    public static void c(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        String str6;
        int parseInt;
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a095cbe7", new Object[]{str, str2, str3, str4, str5, map});
        } else if (WalleStreamListener.isStreamProcessingInitialized()) {
            WalleStreamSource.WalleUtEventJava walleUtEventJava = new WalleStreamSource.WalleUtEventJava();
            if (str != null) {
                str6 = str;
            } else {
                str6 = "";
            }
            walleUtEventJava.mPageName = str6;
            if (str2 != null) {
                try {
                    parseInt = Integer.parseInt(str2);
                } catch (Exception unused) {
                    walleUtEventJava.mEventId = 2201;
                }
            } else {
                parseInt = 2201;
            }
            walleUtEventJava.mEventId = parseInt;
            if (walleUtEventJava.mEventId == 2001) {
                walleUtEventJava.mKey = "UTExt_" + str;
            }
            if (str3 == null) {
                str3 = "";
            }
            walleUtEventJava.mArg1 = str3;
            if (str4 == null) {
                str4 = "";
            }
            walleUtEventJava.mArg2 = str4;
            if (str5 == null) {
                str5 = "";
            }
            walleUtEventJava.mArg3 = str5;
            if (map != null) {
                hashMap = new HashMap(map);
            } else {
                hashMap = new HashMap();
            }
            walleUtEventJava.mProperties = hashMap;
            WalleStreamSource.getInstance().sendEvent(walleUtEventJava);
        }
    }

    public static Map<String, String> commit(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a7cb4b2f", new Object[]{str, str2, str3, str4, str5, str6});
        }
        Map<String, String> map = null;
        if (!TextUtils.isEmpty(str6)) {
            if (str6.startsWith("{")) {
                try {
                    map = (Map) JSON.parseObject(str6, Map.class);
                } catch (Exception unused) {
                }
                return a(str, str2, str3, str4, str5, map);
            }
            map = d(str6);
        }
        return a(str, str2, str3, str4, str5, map);
    }

    public static Map<String, String> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a95d1bdc", new Object[]{str});
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            int indexOf = str2.indexOf(61);
            if (indexOf > 0 && indexOf < str2.length()) {
                hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
            }
        }
        return hashMap;
    }
}
