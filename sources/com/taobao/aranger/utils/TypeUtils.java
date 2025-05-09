package com.taobao.aranger.utils;

import android.content.ComponentName;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.annotation.type.ServiceName;
import com.taobao.aranger.core.ipc.provider.ARangerProvider;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import tb.equ;
import tb.pg1;
import tb.re;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TypeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(393216109);
    }

    public TypeUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean a(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b91381a2", new Object[]{annotationArr, cls})).booleanValue();
        }
        if (!(annotationArr == null || cls == null)) {
            for (Annotation annotation : annotationArr) {
                if (cls.isInstance(annotation)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(Class<?>[] clsArr, Class<?>[] clsArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29aea6fc", new Object[]{clsArr, clsArr2})).booleanValue();
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        int length = clsArr2.length;
        for (int i = 0; i < length; i++) {
            Class<?> cls = clsArr2[i];
            if (cls != null && !d(clsArr[i], cls) && !clsArr[i].isAssignableFrom(clsArr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(Class<?> cls, Class<?> cls2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f6d05d8", new Object[]{cls, cls2})).booleanValue();
        }
        if (cls == cls2 || p(cls, cls2) || p(cls2, cls)) {
            return true;
        }
        return false;
    }

    public static String f(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e50d2c87", new Object[]{cls});
        }
        return cls.getName();
    }

    public static Constructor<?> g(Class<?> cls, Class<?>[] clsArr) throws IPCException {
        Constructor[] constructors;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Constructor) ipChange.ipc$dispatch("66ddf97", new Object[]{cls, clsArr});
        }
        String h = h(cls, clsArr);
        Constructor d = equ.e().d(h);
        if (d != null) {
            return d;
        }
        for (Constructor constructor : cls.getConstructors()) {
            if (c(constructor.getParameterTypes(), clsArr)) {
                if (d == null) {
                    equ.e().g(h, constructor);
                    d = constructor;
                } else {
                    throw new IPCException(15, cls.getName().concat(" has too many constructors whose  parameter types match the required types."));
                }
            }
        }
        if (d != null) {
            return d;
        }
        throw new IPCException(16, "The class " + cls.getName() + " do not have a constructor whose  parameter types match the required types.");
    }

    public static String getMethodId(String str, ParameterWrapper[] parameterWrapperArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("868e13c9", new Object[]{str, parameterWrapperArr});
        }
        return str + '(' + k(parameterWrapperArr) + ')';
    }

    public static String h(Class cls, Class[] clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d258501", new Object[]{cls, clsArr});
        }
        return cls.getSimpleName() + '(' + l(clsArr) + ')';
    }

    public static String k(ParameterWrapper[] parameterWrapperArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aea70a0e", new Object[]{parameterWrapperArr});
        }
        StringBuilder sb = new StringBuilder();
        int length = parameterWrapperArr.length;
        if (length == 0) {
            return sb.toString();
        }
        sb.append(b(parameterWrapperArr[0].getName()));
        for (int i = 1; i < length; i++) {
            sb.append(",");
            sb.append(b(parameterWrapperArr[i].getName()));
        }
        return sb.toString();
    }

    public static String l(Class<?>[] clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("563fe230", new Object[]{clsArr});
        }
        StringBuilder sb = new StringBuilder();
        int length = clsArr.length;
        if (length == 0) {
            return sb.toString();
        }
        sb.append(b(f(clsArr[0])));
        for (int i = 1; i < length; i++) {
            sb.append(",");
            sb.append(b(f(clsArr[i])));
        }
        return sb.toString();
    }

    public static String n(String str, Class<?> cls) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1dbb5e08", new Object[]{str, cls});
        }
        if (!cls.isInterface()) {
            throw new IPCException(20, "only interfaces can be passed as the parameters.");
        } else if (!TextUtils.isEmpty(str)) {
            return str;
        } else {
            ServiceName serviceName = (ServiceName) cls.getAnnotation(ServiceName.class);
            if (serviceName != null && !TextUtils.isEmpty(serviceName.value())) {
                return serviceName.value();
            }
            throw new IPCException(20, "the interfaces must have ServiceName annotation.");
        }
    }

    public static boolean p(Class cls, Class cls2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57917309", new Object[]{cls, cls2})).booleanValue();
        }
        if (cls == Boolean.class && cls2 == Boolean.TYPE) {
            return true;
        }
        if (cls == Byte.class && cls2 == Byte.TYPE) {
            return true;
        }
        if (cls == Character.class && cls2 == Character.TYPE) {
            return true;
        }
        if (cls == Short.class && cls2 == Short.TYPE) {
            return true;
        }
        if (cls == Integer.class && cls2 == Integer.TYPE) {
            return true;
        }
        if (cls == Long.class && cls2 == Long.TYPE) {
            return true;
        }
        if (cls == Float.class && cls2 == Float.TYPE) {
            return true;
        }
        if (cls == Double.class && cls2 == Double.TYPE) {
            return true;
        }
        if (cls == Void.class && cls2 == Void.TYPE) {
            return true;
        }
        return false;
    }

    public static void q(ComponentName componentName) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f61d0416", new Object[]{componentName});
        } else if (TextUtils.isEmpty(componentName.getClassName()) || TextUtils.isEmpty(componentName.getPackageName())) {
            throw new IPCException(28, "the package name or provider class name in component is null!");
        } else if (re.r().getPackageName().equals(componentName.getPackageName())) {
            try {
                if (!ARangerProvider.class.isAssignableFrom(Class.forName(componentName.getClassName()))) {
                    throw new IPCException(20, "Only class extends ARangerProvider can be passed as the parameters.");
                }
            } catch (ClassNotFoundException unused) {
                throw new IPCException(20, "The " + componentName.getClassName() + " class not found, please check the provider class name.");
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
        if (r4.equals("java.lang.Integer") == false) goto L_0x0020;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.aranger.utils.TypeUtils.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "8d2b3155"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            r4.hashCode()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case -2056817302: goto L_0x0076;
                case -527879800: goto L_0x006a;
                case -515992664: goto L_0x005e;
                case 155276373: goto L_0x0052;
                case 344809556: goto L_0x0046;
                case 398507100: goto L_0x003a;
                case 398795216: goto L_0x002e;
                case 761287205: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            r0 = -1
            goto L_0x0080
        L_0x0022:
            java.lang.String r0 = "java.lang.Double"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x002c
            goto L_0x0020
        L_0x002c:
            r0 = 7
            goto L_0x0080
        L_0x002e:
            java.lang.String r0 = "java.lang.Long"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0038
            goto L_0x0020
        L_0x0038:
            r0 = 6
            goto L_0x0080
        L_0x003a:
            java.lang.String r0 = "java.lang.Byte"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0044
            goto L_0x0020
        L_0x0044:
            r0 = 5
            goto L_0x0080
        L_0x0046:
            java.lang.String r0 = "java.lang.Boolean"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0050
            goto L_0x0020
        L_0x0050:
            r0 = 4
            goto L_0x0080
        L_0x0052:
            java.lang.String r0 = "java.lang.Character"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x005c
            goto L_0x0020
        L_0x005c:
            r0 = 3
            goto L_0x0080
        L_0x005e:
            java.lang.String r0 = "java.lang.Short"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0068
            goto L_0x0020
        L_0x0068:
            r0 = 2
            goto L_0x0080
        L_0x006a:
            java.lang.String r0 = "java.lang.Float"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0074
            goto L_0x0020
        L_0x0074:
            r0 = 1
            goto L_0x0080
        L_0x0076:
            java.lang.String r1 = "java.lang.Integer"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0080
            goto L_0x0020
        L_0x0080:
            switch(r0) {
                case 0: goto L_0x009e;
                case 1: goto L_0x009a;
                case 2: goto L_0x0096;
                case 3: goto L_0x0092;
                case 4: goto L_0x008f;
                case 5: goto L_0x008c;
                case 6: goto L_0x0088;
                case 7: goto L_0x0084;
                default: goto L_0x0083;
            }
        L_0x0083:
            return r4
        L_0x0084:
            java.lang.String r4 = "double"
            return r4
        L_0x0088:
            java.lang.String r4 = "long"
            return r4
        L_0x008c:
            java.lang.String r4 = "byte"
            return r4
        L_0x008f:
            java.lang.String r4 = "boolean"
            return r4
        L_0x0092:
            java.lang.String r4 = "char"
            return r4
        L_0x0096:
            java.lang.String r4 = "short"
            return r4
        L_0x009a:
            java.lang.String r4 = "float"
            return r4
        L_0x009e:
            java.lang.String r4 = "int"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.aranger.utils.TypeUtils.b(java.lang.String):java.lang.String");
    }

    public static Method i(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) throws IPCException {
        Method[] declaredMethods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("1b7577d2", new Object[]{cls, str, clsArr, cls2});
        }
        Method method = null;
        for (Method method2 : cls.getDeclaredMethods()) {
            if (method2.getName().equals(str) && c(method2.getParameterTypes(), clsArr)) {
                if (method == null) {
                    method2.setAccessible(true);
                    method = method2;
                } else {
                    throw new IPCException(14, "there are more than one method named " + str + " of the class " + cls.getName() + " matching the parameters!");
                }
            }
        }
        if (method == null) {
            return null;
        }
        if (method.getReturnType() == cls2) {
            return method;
        }
        throw new IPCException(17, "the method named " + str + " of the class " + cls.getName() + " matches the parameter types but not the return type. The return type is " + method.getReturnType().getName() + " but the required type is " + cls2.getName() + ". The method in the local interface must exactly match the method in the remote class.");
    }

    public static Method j(Class<?> cls, String str, Class<?>[] clsArr) throws IPCException {
        Method[] declaredMethods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("358e74bd", new Object[]{cls, str, clsArr});
        }
        Method method = null;
        for (Method method2 : cls.getDeclaredMethods()) {
            String name = method2.getName();
            if (((str.equals("") && name.equals("getInstance")) || (!str.equals("") && name.equals(str))) && c(method2.getParameterTypes(), clsArr)) {
                if (method == null) {
                    method2.setAccessible(true);
                    method = method2;
                } else {
                    throw new IPCException(35, "when getting instance, there are more than one method named " + str + " of the class " + cls.getName() + " matching the parameters!");
                }
            }
        }
        if (method == null) {
            throw new IPCException(37, "when getting instance, the method named " + str + " of the class " + cls.getName() + " is not found. The class must have a method for getting instance.");
        } else if (method.getReturnType() == cls) {
            return method;
        } else {
            throw new IPCException(36, "when getting instance, the method named " + str + " of the class " + cls.getName() + " matches the parameter types but not the return type. The return type is " + method.getReturnType().getName() + " but the required type is " + cls.getName() + ".");
        }
    }

    public static boolean o(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26aa5a7c", new Object[]{cls})).booleanValue();
        }
        Class<?> cls2 = Void.TYPE;
        return cls == cls2 || cls.equals(cls2) || pg1.ATOM_void.equals(cls.getName());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r5.equals("[C") == false) goto L_0x0028;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m(java.lang.String r5, java.lang.Object r6) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.aranger.utils.TypeUtils.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001d
            java.lang.String r4 = "cd2d1665"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r5 = r3.ipc$dispatch(r4, r2)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            return r5
        L_0x001d:
            r5.hashCode()
            r3 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case 2887: goto L_0x0075;
                case 2888: goto L_0x006c;
                case 2889: goto L_0x0061;
                case 2891: goto L_0x0056;
                case 2894: goto L_0x004b;
                case 2895: goto L_0x0040;
                case 2904: goto L_0x0035;
                case 2911: goto L_0x002a;
                default: goto L_0x0028;
            }
        L_0x0028:
            r0 = -1
            goto L_0x007f
        L_0x002a:
            java.lang.String r0 = "[Z"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0033
            goto L_0x0028
        L_0x0033:
            r0 = 7
            goto L_0x007f
        L_0x0035:
            java.lang.String r0 = "[S"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x003e
            goto L_0x0028
        L_0x003e:
            r0 = 6
            goto L_0x007f
        L_0x0040:
            java.lang.String r0 = "[J"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0049
            goto L_0x0028
        L_0x0049:
            r0 = 5
            goto L_0x007f
        L_0x004b:
            java.lang.String r0 = "[I"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0054
            goto L_0x0028
        L_0x0054:
            r0 = 4
            goto L_0x007f
        L_0x0056:
            java.lang.String r0 = "[F"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x005f
            goto L_0x0028
        L_0x005f:
            r0 = 3
            goto L_0x007f
        L_0x0061:
            java.lang.String r0 = "[D"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x006a
            goto L_0x0028
        L_0x006a:
            r0 = 2
            goto L_0x007f
        L_0x006c:
            java.lang.String r1 = "[C"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x007f
            goto L_0x0028
        L_0x0075:
            java.lang.String r0 = "[B"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x007e
            goto L_0x0028
        L_0x007e:
            r0 = 0
        L_0x007f:
            switch(r0) {
                case 0: goto L_0x00a2;
                case 1: goto L_0x009e;
                case 2: goto L_0x009a;
                case 3: goto L_0x0096;
                case 4: goto L_0x0092;
                case 5: goto L_0x008e;
                case 6: goto L_0x008a;
                case 7: goto L_0x0086;
                default: goto L_0x0082;
            }
        L_0x0082:
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r5 = r6.length
            return r5
        L_0x0086:
            boolean[] r6 = (boolean[]) r6
            int r5 = r6.length
            return r5
        L_0x008a:
            short[] r6 = (short[]) r6
            int r5 = r6.length
            return r5
        L_0x008e:
            long[] r6 = (long[]) r6
            int r5 = r6.length
            return r5
        L_0x0092:
            int[] r6 = (int[]) r6
            int r5 = r6.length
            return r5
        L_0x0096:
            float[] r6 = (float[]) r6
            int r5 = r6.length
            return r5
        L_0x009a:
            double[] r6 = (double[]) r6
            int r5 = r6.length
            return r5
        L_0x009e:
            char[] r6 = (char[]) r6
            int r5 = r6.length
            return r5
        L_0x00a2:
            byte[] r6 = (byte[]) r6
            int r5 = r6.length
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.aranger.utils.TypeUtils.m(java.lang.String, java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (r6.equals("[D") == false) goto L_0x0024;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.lang.String r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.aranger.utils.TypeUtils.e(java.lang.String, java.lang.Object, java.lang.Object):void");
    }
}
