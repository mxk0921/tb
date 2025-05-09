package com.ali.user.mobile.service;

import android.text.TextUtils;
import com.ali.user.mobile.config.BeanConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.lang.reflect.InvocationTargetException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ServiceFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BeanLoader";

    static {
        t2o.a(68157617);
    }

    private ServiceFactory() {
    }

    private static String getBeanClassName(String str) {
        try {
            IpChange ipChange = BeanConfig.$ipChange;
            return (String) BeanConfig.class.getMethod("getBeanClassName", String.class).invoke(BeanConfig.class.getConstructor(new Class[0]).newInstance(new Object[0]), str);
        } catch (ClassNotFoundException e) {
            LoginTLogAdapter.e(TAG, e.getMessage());
            return "";
        } catch (InvocationTargetException e2) {
            LoginTLogAdapter.e(TAG, e2.getMessage());
            return "";
        } catch (Exception e3) {
            LoginTLogAdapter.e(TAG, e3.getMessage());
            return "";
        }
    }

    public static <T> T getService(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bb314f9b", new Object[]{cls});
        }
        registerService(cls);
        return (T) ServiceContainer.getInstance().getService(cls);
    }

    public static boolean registerService(Class<?> cls) {
        Object obj;
        Class cls2;
        if (cls == null) {
            return false;
        }
        try {
            if (ServiceContainer.getInstance().getService(cls) != null) {
                return true;
            }
            String beanClassName = getBeanClassName(cls.getName());
            if (TextUtils.isEmpty(beanClassName)) {
                return false;
            }
            try {
                obj = Class.forName(beanClassName).getField("INSTANCE").get(null);
            } catch (NoSuchFieldException unused) {
                obj = cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
            if (obj != null) {
                return ServiceContainer.getInstance().registerService(cls, obj);
            }
            return false;
        } catch (ClassNotFoundException e) {
            LoginTLogAdapter.e(TAG, e.getMessage());
            return false;
        } catch (InvocationTargetException e2) {
            LoginTLogAdapter.e(TAG, e2.getMessage());
            return false;
        } catch (Exception e3) {
            LoginTLogAdapter.e(TAG, e3.getMessage());
            return false;
        }
    }
}
