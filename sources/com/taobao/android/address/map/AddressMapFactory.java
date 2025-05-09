package com.taobao.android.address.map;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AddressMapFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AddressMapFactory";
    private static Map<String, Class<? extends IAddressMap>> sAddressMapClz;

    public static IAddressMap createMap(String str) {
        Map<String, Class<? extends IAddressMap>> map;
        try {
            AdapterForTLog.loge(TAG, "createMap type:" + str);
            map = sAddressMapClz;
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "createMap fail", th);
        }
        if (map == null) {
            return null;
        }
        Class<? extends IAddressMap> cls = map.get(str);
        AdapterForTLog.loge(TAG, "createMap type:" + str + " clz:" + cls);
        if (cls != null) {
            return (IAddressMap) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        return null;
    }

    public static void registerAddressMap(String str, Class<? extends IAddressMap> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6b9aa1", new Object[]{str, cls});
            return;
        }
        if (sAddressMapClz == null) {
            sAddressMapClz = new HashMap();
        }
        AdapterForTLog.loge(TAG, "registerAddressMap type:" + str + " clz:" + cls.getName());
        sAddressMapClz.put(str, cls);
    }
}
