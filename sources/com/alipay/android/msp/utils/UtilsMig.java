package com.alipay.android.msp.utils;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UtilsMig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T> T deref(WeakReference<T> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("be94a48d", new Object[]{weakReference});
        }
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static boolean equals(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b37c282", new Object[]{obj, obj2})).booleanValue();
        }
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static String getRandomString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e176e26e", new Object[]{new Integer(i)});
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            int nextInt = random.nextInt(3);
            if (nextInt == 0) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (nextInt == 1) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (nextInt == 2) {
                sb.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb.toString();
    }

    public static boolean isVidAct(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91021d16", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject2 != null && jSONObject2.toJSONString().contains("VIData")) {
            return true;
        }
        if (jSONObject == null || !jSONObject.toJSONString().contains("VIData")) {
            return false;
        }
        return true;
    }
}
