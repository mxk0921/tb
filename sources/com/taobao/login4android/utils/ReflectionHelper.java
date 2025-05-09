package com.taobao.login4android.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ReflectionHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(516948012);
    }

    public static <T> T invokeMethod(Class cls, Method method, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return (T) method.invoke(cls, objArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
