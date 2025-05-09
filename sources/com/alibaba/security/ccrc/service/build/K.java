package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class K {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2561a = "参数异常";
    public static final String b = "不支持的方法";
    public static final String c = "调用成功";
    public static final String d = "调用异常";

    public static void a(L l, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0f6b0d", new Object[]{l, map});
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("message", "调用成功");
        if (l != null) {
            l.onSuccess(hashMap);
        }
    }

    public abstract boolean a(Context context, String str, String str2, L l);

    public static void a(L l, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192a6203", new Object[]{l, str, map});
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("message", str);
        }
        if (l != null) {
            l.a(hashMap);
        }
    }
}
