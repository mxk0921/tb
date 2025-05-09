package com.mobile.auth.gatewayauth.utils;

import android.app.Activity;
import android.app.Application;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ReflectionUtils {
    private static volatile Application sApplication;

    public static Application getApplication() {
        try {
            if (sApplication == null) {
                synchronized (ReflectionUtils.class) {
                    if (sApplication == null) {
                        try {
                            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                            Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]);
                            Method method = cls.getMethod("getApplication", new Class[0]);
                            method.setAccessible(true);
                            Object invoke2 = method.invoke(invoke, new Object[0]);
                            if (invoke2 instanceof Application) {
                                sApplication = (Application) invoke2;
                            }
                        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | Exception | UnsatisfiedLinkError e) {
                            O0000Oo0.O000000o(e);
                        }
                    }
                }
            }
            return sApplication;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static Activity getActivity() {
        Throwable e;
        Map map;
        Iterator it;
        Object next;
        Class<?> cls;
        Field declaredField;
        try {
            try {
                Class<?> cls2 = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                Object invoke = cls2.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]);
                Field declaredField2 = cls2.getDeclaredField("mActivities");
                declaredField2.setAccessible(true);
                map = (Map) declaredField2.get(invoke);
                it = map.values().iterator();
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        } catch (ClassNotFoundException e2) {
            e = e2;
            O0000Oo0.O000000o(e);
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            O0000Oo0.O000000o(e);
            return null;
        } catch (NoSuchMethodException e4) {
            e = e4;
            O0000Oo0.O000000o(e);
            return null;
        } catch (Exception e5) {
            e = e5;
            O0000Oo0.O000000o(e);
            return null;
        }
        do {
            if (it.hasNext()) {
                next = it.next();
                cls = next.getClass();
                declaredField = cls.getDeclaredField("paused");
                declaredField.setAccessible(true);
            } else {
                for (Object obj : map.values()) {
                    Class<?> cls3 = obj.getClass();
                    Field declaredField3 = cls3.getDeclaredField(DXRecyclerLayout.LOAD_MORE_STOPED);
                    declaredField3.setAccessible(true);
                    if (!declaredField3.getBoolean(obj)) {
                        Field declaredField4 = cls3.getDeclaredField("activity");
                        declaredField4.setAccessible(true);
                        return (Activity) declaredField4.get(obj);
                    }
                }
                return null;
            }
        } while (declaredField.getBoolean(next));
        Field declaredField5 = cls.getDeclaredField("activity");
        declaredField5.setAccessible(true);
        return (Activity) declaredField5.get(next);
    }
}
