package org.lsposed.hiddenapibypass;

import android.util.Log;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.lsposed.hiddenapibypass.Helper;
import sun.misc.Unsafe;
import tb.bmv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class a {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean DEBUG = false;

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f15419a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;

    static {
        MethodHandles.Lookup lookup;
        MethodHandle unreflect;
        MethodHandles.Lookup lookup2;
        MethodHandle unreflect2;
        MethodHandles.Lookup lookup3;
        MethodHandle unreflectGetter;
        MethodHandles.Lookup lookup4;
        MethodHandle unreflectGetter2;
        t2o.a(411041812);
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", new Class[0]).invoke(null, new Object[0]);
            f15419a = unsafe;
            b = unsafe.objectFieldOffset(Helper.Executable.class.getDeclaredField("artMethod"));
            long objectFieldOffset = unsafe.objectFieldOffset(Helper.a.class.getDeclaredField("artFieldOrMethod"));
            long objectFieldOffset2 = unsafe.objectFieldOffset(Helper.Class.class.getDeclaredField("methods"));
            c = objectFieldOffset2;
            long objectFieldOffset3 = unsafe.objectFieldOffset(Helper.Class.class.getDeclaredField("iFields"));
            Method declaredMethod = Helper.NeverCall.class.getDeclaredMethod("a", new Class[0]);
            Method declaredMethod2 = Helper.NeverCall.class.getDeclaredMethod(TplMsg.VALUE_T_NATIVE_RETURN, new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            lookup = MethodHandles.lookup();
            unreflect = lookup.unreflect(declaredMethod);
            lookup2 = MethodHandles.lookup();
            unreflect2 = lookup2.unreflect(declaredMethod2);
            long j = unsafe.getLong(unreflect, objectFieldOffset);
            long j2 = unsafe.getLong(unreflect2, objectFieldOffset);
            long j3 = unsafe.getLong(Helper.NeverCall.class, objectFieldOffset2);
            long j4 = j2 - j;
            d = j4;
            e = (j - j3) - j4;
            Field declaredField = Helper.NeverCall.class.getDeclaredField(bmv.MSGTYPE_INTERVAL);
            Field declaredField2 = Helper.NeverCall.class.getDeclaredField(at.j);
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            lookup3 = MethodHandles.lookup();
            unreflectGetter = lookup3.unreflectGetter(declaredField);
            lookup4 = MethodHandles.lookup();
            unreflectGetter2 = lookup4.unreflectGetter(declaredField2);
            unsafe.getLong(unreflectGetter, objectFieldOffset);
            unsafe.getLong(unreflectGetter2, objectFieldOffset);
            unsafe.getLong(Helper.NeverCall.class, objectFieldOffset3);
        } catch (ReflectiveOperationException e2) {
            Log.e("HiddenApiBypass", "Initialize error", e2);
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static boolean a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58802d83", new Object[]{strArr})).booleanValue();
        }
        return d(strArr);
    }

    public static boolean b(Class<?>[] clsArr, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99e86749", new Object[]{clsArr, objArr})).booleanValue();
        }
        if (clsArr.length != objArr.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (clsArr[i].isPrimitive()) {
                Class<?> cls = clsArr[i];
                if (cls == Integer.TYPE && !(objArr[i] instanceof Integer)) {
                    return false;
                }
                if (cls == Byte.TYPE && !(objArr[i] instanceof Byte)) {
                    return false;
                }
                if (cls == Character.TYPE && !(objArr[i] instanceof Character)) {
                    return false;
                }
                if (cls == Boolean.TYPE && !(objArr[i] instanceof Boolean)) {
                    return false;
                }
                if (cls == Double.TYPE && !(objArr[i] instanceof Double)) {
                    return false;
                }
                if (cls == Float.TYPE && !(objArr[i] instanceof Float)) {
                    return false;
                }
                if (cls == Long.TYPE && !(objArr[i] instanceof Long)) {
                    return false;
                }
                if (cls == Short.TYPE && !(objArr[i] instanceof Short)) {
                    return false;
                }
            } else {
                Object obj = objArr[i];
                if (obj != null && !clsArr[i].isInstance(obj)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Object c(Class<?> cls, Object obj, String str, Object... objArr) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (obj == null || cls.isInstance(obj)) {
            Method declaredMethod = Helper.InvokeStub.class.getDeclaredMethod("invoke", Object[].class);
            declaredMethod.setAccessible(true);
            Unsafe unsafe = f15419a;
            long j = unsafe.getLong(cls, c);
            if (j != 0) {
                int i = unsafe.getInt(j);
                for (int i2 = 0; i2 < i; i2++) {
                    f15419a.putLong(declaredMethod, b, (i2 * d) + j + e);
                    if (str.equals(declaredMethod.getName()) && b(declaredMethod.getParameterTypes(), objArr)) {
                        return declaredMethod.invoke(obj, objArr);
                    }
                }
                throw new NoSuchMethodException("Cannot find matching method");
            }
            throw new NoSuchMethodException("Cannot find matching method");
        }
        throw new IllegalArgumentException("this object is not an instance of the given class");
    }

    public static boolean d(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ed13004", new Object[]{strArr})).booleanValue();
        }
        try {
            c(VMRuntime.class, c(VMRuntime.class, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
