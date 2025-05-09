package com.alibaba.android.split.core.internal;

import android.content.Context;
import android.util.Log;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import tb.t2o;
import tb.udq;
import tb.uql;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BootReflector {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Class<?> bootClassLoader_Clazz;

    static {
        t2o.a(677380131);
        try {
            bootClassLoader_Clazz = Class.forName("java.lang.BootClassLoader");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Log.e("BootReflector", FlexaClassLoader.class.getName());
        Log.e("BootReflector", udq.class.getName());
    }

    private static void injectParent(Context context, ClassLoader classLoader) throws Exception {
        Field declaredField = ClassLoader.class.getDeclaredField(a.MSG_SOURCE_PARENT);
        declaredField.setAccessible(true);
        declaredField.set(classLoader, new uql(context, classLoader.getParent(), true, new uql.a() { // from class: com.alibaba.android.split.core.internal.BootReflector.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.uql.a
            public int whereFindClass(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("c2927e9c", new Object[]{this, str})).intValue();
                }
                if (udq.a(str)) {
                    return 1;
                }
                return 0;
            }
        }));
    }

    public static void reflect(Context context, ClassLoader classLoader) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be374e66", new Object[]{context, classLoader});
            return;
        }
        while (classLoader.getParent().getClass() != bootClassLoader_Clazz) {
            classLoader = classLoader.getParent();
        }
        injectParent(context, classLoader);
    }
}
