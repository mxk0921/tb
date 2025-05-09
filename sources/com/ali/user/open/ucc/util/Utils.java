package com.ali.user.open.ucc.util;

import android.text.TextUtils;
import com.ali.user.open.core.device.DeviceInfo;
import com.ali.user.open.core.model.RpcResponse;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(76546194);
    }

    public static int buidErrorCode(RpcResponse rpcResponse, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c4d9229", new Object[]{rpcResponse, new Integer(i)})).intValue();
        }
        if (rpcResponse != null) {
            return rpcResponse.code;
        }
        return i;
    }

    public static String buidErrorMessage(RpcResponse rpcResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66b141a3", new Object[]{rpcResponse, str});
        }
        if (rpcResponse == null) {
            return str;
        }
        if (TextUtils.isEmpty(rpcResponse.message)) {
            return "亲，您的手机网络不太顺畅喔~";
        }
        return rpcResponse.message;
    }

    public static Map<String, String> convertJsonStrToMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84f8911", new Object[]{str});
        }
        try {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : JSON.parseObject(str).entrySet()) {
                hashMap.put(entry.getKey(), (String) entry.getValue());
            }
            return hashMap;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String convertMapToJsonStr(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b656647", new Object[]{map});
        }
        if (map != null && !map.isEmpty()) {
            try {
                return JSON.toJSONString(map);
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public static String generateTraceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da7905c4", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str + DeviceInfo.deviceId + (System.currentTimeMillis() / 1000);
    }
}
