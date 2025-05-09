package com.alibaba.wireless.security.securitybody;

import android.app.Application;
import android.content.Context;
import com.alibaba.wireless.security.framework.IRouterComponent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import tb.vu3;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes.dex */
public class InvocationHandlerAdapter implements InvocationHandler {

    /* renamed from: б  reason: contains not printable characters */
    private static IRouterComponent f371;

    /* renamed from: в  reason: contains not printable characters */
    private static Context f372;

    /* renamed from: а  reason: contains not printable characters */
    private Object f373;

    private InvocationHandlerAdapter(Object obj) {
        this.f373 = null;
        this.f373 = obj;
    }

    public static ClassLoader getClassLoader() {
        return InvocationHandlerAdapter.class.getClassLoader();
    }

    public static int init(Context context, IRouterComponent iRouterComponent) {
        if (!(context == null || iRouterComponent == null || !(context instanceof Application))) {
            f371 = iRouterComponent;
            f372 = context;
        }
        return 0;
    }

    public static Object newInstance(Class<?> cls, Object obj) {
        return Proxy.newProxyInstance(SecurityBodyAdapter.class.getClassLoader(), new Class[]{cls}, new InvocationHandlerAdapter(obj));
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Type genericReturnType;
        String name = method.getName();
        method.getDeclaringClass().getName();
        Object obj2 = null;
        try {
            obj2 = f371.doCommand(TaobaoMediaPlayer.FFP_PROP_INT64_AVG_DECODER_VIDEO_FPS, this.f373, obj, method, objArr);
            if (obj2 == null) {
                if ("toString".equals(name)) {
                    return toString();
                }
                if ("hashCode".equals(name)) {
                    return Integer.valueOf(hashCode());
                }
            }
            genericReturnType = method.getGenericReturnType();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (genericReturnType.equals(Integer.TYPE)) {
            if (obj2 instanceof Integer) {
                return obj2;
            }
            return 0;
        } else if (genericReturnType.equals(Byte.TYPE)) {
            if (obj2 instanceof Byte) {
                return obj2;
            }
            return (byte) 0;
        } else if (genericReturnType.equals(Short.TYPE)) {
            if (obj2 instanceof Short) {
                return obj2;
            }
            return (short) 0;
        } else if (genericReturnType.equals(Long.TYPE)) {
            if (obj2 instanceof Long) {
                return obj2;
            }
            return 0L;
        } else if (genericReturnType.equals(Float.TYPE)) {
            return obj2 instanceof Float ? obj2 : Float.valueOf(0.0f);
        } else {
            if (genericReturnType.equals(Double.TYPE)) {
                return obj2 instanceof Double ? obj2 : Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
            }
            if (!genericReturnType.equals(Character.TYPE)) {
                if (genericReturnType.equals(Boolean.TYPE)) {
                    return obj2 instanceof Boolean ? obj2 : Boolean.FALSE;
                }
                return obj2;
            } else if (obj2 instanceof Character) {
                return obj2;
            } else {
                return (char) 0;
            }
        }
    }
}
