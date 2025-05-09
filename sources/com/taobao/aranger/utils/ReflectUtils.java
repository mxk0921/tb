package com.taobao.aranger.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.atools.StaticHook;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ReflectUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ReflectUtils";

    static {
        t2o.a(393216100);
    }

    public static Method getHideMethod(Class<?> cls, String str, Class<?>... clsArr) throws IllegalAccessException, InvocationTargetException, NullPointerException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("eafcd8cf", new Object[]{cls, str, clsArr});
        }
        return StaticHook.g(cls, str, clsArr);
    }
}
