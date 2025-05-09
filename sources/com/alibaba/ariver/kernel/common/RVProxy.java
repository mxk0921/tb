package com.alibaba.ariver.kernel.common;

import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.multiinstance.InstanceType;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RVProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile Printer c;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Class<?>, Object> f2436a = new ConcurrentHashMap();
    public static final Map<InstanceType, Map<Class<?>, Object>> b = new ConcurrentHashMap();
    public static boolean sHasSetupProxy = false;
    public static Initializer d = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class EmptyPrinter implements Printer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.ariver.kernel.common.RVProxy.Printer
        public void print(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc0dfd7e", new Object[]{this, str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface Initializer {
        void doInitialize();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface LazyGetter<T> {
        T get();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface Printer {
        void print(String str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[Catch: all -> 0x0017, TryCatch #2 {all -> 0x0017, blocks: (B:6:0x000f, B:14:0x001e, B:16:0x0027, B:18:0x002b, B:23:0x0054, B:24:0x0058, B:25:0x005e, B:27:0x0060, B:32:0x009a, B:35:0x00d5, B:29:0x006a, B:31:0x0078, B:34:0x009e), top: B:39:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027 A[Catch: all -> 0x0017, TryCatch #2 {all -> 0x0017, blocks: (B:6:0x000f, B:14:0x001e, B:16:0x0027, B:18:0x002b, B:23:0x0054, B:24:0x0058, B:25:0x005e, B:27:0x0060, B:32:0x009a, B:35:0x00d5, B:29:0x006a, B:31:0x0078, B:34:0x009e), top: B:39:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[Catch: all -> 0x009c, TRY_ENTER, TryCatch #2 {all -> 0x0017, blocks: (B:6:0x000f, B:14:0x001e, B:16:0x0027, B:18:0x002b, B:23:0x0054, B:24:0x0058, B:25:0x005e, B:27:0x0060, B:32:0x009a, B:35:0x00d5, B:29:0x006a, B:31:0x0078, B:34:0x009e), top: B:39:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T a(java.util.Map<java.lang.Class<?>, java.lang.Object> r10, java.lang.Class<T> r11) {
        /*
            java.lang.String r0 = "DefaultImpl instantiate exception!"
            java.lang.String r1 = "Default impl "
            java.lang.String r2 = "Default initialize of "
            java.lang.String r3 = "Lazy initialize of "
            java.util.Map<java.lang.Class<?>, java.lang.Object> r4 = com.alibaba.ariver.kernel.common.RVProxy.f2436a
            monitor-enter(r4)
            r5 = 1
            r6 = 0
            if (r10 == 0) goto L_0x001a
            java.lang.Object r7 = r10.get(r11)     // Catch: all -> 0x0017
            if (r7 == 0) goto L_0x001b
            r8 = 1
            goto L_0x001c
        L_0x0017:
            r10 = move-exception
            goto L_0x00d7
        L_0x001a:
            r7 = 0
        L_0x001b:
            r8 = 0
        L_0x001c:
            if (r7 != 0) goto L_0x0025
            r7 = r4
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7     // Catch: all -> 0x0017
            java.lang.Object r7 = r7.get(r11)     // Catch: all -> 0x0017
        L_0x0025:
            if (r7 == 0) goto L_0x0060
            boolean r9 = r7 instanceof com.alibaba.ariver.kernel.common.RVProxy.LazyGetter     // Catch: all -> 0x0017
            if (r9 == 0) goto L_0x004d
            com.alibaba.ariver.kernel.common.RVProxy$LazyGetter r7 = (com.alibaba.ariver.kernel.common.RVProxy.LazyGetter) r7     // Catch: all -> 0x0017
            java.lang.Object r7 = r7.get()     // Catch: all -> 0x0017
            com.alibaba.ariver.kernel.common.RVProxy$Printer r6 = getPrinter()     // Catch: all -> 0x0017
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: all -> 0x0017
            r9.<init>(r3)     // Catch: all -> 0x0017
            r9.append(r11)     // Catch: all -> 0x0017
            java.lang.String r3 = " to "
            r9.append(r3)     // Catch: all -> 0x0017
            r9.append(r7)     // Catch: all -> 0x0017
            java.lang.String r3 = r9.toString()     // Catch: all -> 0x0017
            r6.print(r3)     // Catch: all -> 0x0017
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            if (r7 == 0) goto L_0x0060
            if (r5 == 0) goto L_0x005e
            if (r8 == 0) goto L_0x0058
            r10.put(r11, r7)     // Catch: all -> 0x0017
            goto L_0x005e
        L_0x0058:
            r10 = r4
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10     // Catch: all -> 0x0017
            r10.put(r11, r7)     // Catch: all -> 0x0017
        L_0x005e:
            monitor-exit(r4)     // Catch: all -> 0x0017
            return r7
        L_0x0060:
            java.lang.Class<com.alibaba.ariver.kernel.api.annotation.DefaultImpl> r10 = com.alibaba.ariver.kernel.api.annotation.DefaultImpl.class
            java.lang.annotation.Annotation r10 = r11.getAnnotation(r10)     // Catch: all -> 0x0017
            com.alibaba.ariver.kernel.api.annotation.DefaultImpl r10 = (com.alibaba.ariver.kernel.api.annotation.DefaultImpl) r10     // Catch: all -> 0x0017
            if (r10 == 0) goto L_0x00d5
            java.lang.String r3 = r10.value()     // Catch: all -> 0x009c
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: all -> 0x009c
            boolean r5 = r11.isAssignableFrom(r3)     // Catch: all -> 0x009c
            if (r5 == 0) goto L_0x009e
            java.lang.Object r7 = r3.newInstance()     // Catch: all -> 0x009c
            com.alibaba.ariver.kernel.common.RVProxy$Printer r10 = getPrinter()     // Catch: all -> 0x009c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x009c
            r1.<init>(r2)     // Catch: all -> 0x009c
            r1.append(r11)     // Catch: all -> 0x009c
            java.lang.String r2 = " to "
            r1.append(r2)     // Catch: all -> 0x009c
            r1.append(r7)     // Catch: all -> 0x009c
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x009c
            r10.print(r1)     // Catch: all -> 0x009c
            set(r11, r7)     // Catch: all -> 0x009c
            monitor-exit(r4)     // Catch: all -> 0x0017
            return r7
        L_0x009c:
            r10 = move-exception
            goto L_0x00be
        L_0x009e:
            com.alibaba.ariver.kernel.common.RVProxy$Printer r2 = getPrinter()     // Catch: all -> 0x009c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x009c
            r3.<init>(r1)     // Catch: all -> 0x009c
            java.lang.String r10 = r10.value()     // Catch: all -> 0x009c
            r3.append(r10)     // Catch: all -> 0x009c
            java.lang.String r10 = " is not instance of "
            r3.append(r10)     // Catch: all -> 0x009c
            r3.append(r11)     // Catch: all -> 0x009c
            java.lang.String r10 = r3.toString()     // Catch: all -> 0x009c
            r2.print(r10)     // Catch: all -> 0x009c
            goto L_0x00d5
        L_0x00be:
            com.alibaba.ariver.kernel.common.RVProxy$Printer r11 = getPrinter()     // Catch: all -> 0x0017
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x0017
            r1.<init>(r0)     // Catch: all -> 0x0017
            java.lang.String r10 = r10.getMessage()     // Catch: all -> 0x0017
            r1.append(r10)     // Catch: all -> 0x0017
            java.lang.String r10 = r1.toString()     // Catch: all -> 0x0017
            r11.print(r10)     // Catch: all -> 0x0017
        L_0x00d5:
            monitor-exit(r4)     // Catch: all -> 0x0017
            return r7
        L_0x00d7:
            monitor-exit(r4)     // Catch: all -> 0x0017
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.RVProxy.a(java.util.Map, java.lang.Class):java.lang.Object");
    }

    public static <T> void b(InstanceType instanceType, Class cls, Object obj) {
        Map<Class<?>, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce7f703", new Object[]{instanceType, cls, obj});
        } else if (cls != null) {
            if (instanceType != null) {
                Map<InstanceType, Map<Class<?>, Object>> map2 = b;
                map = (Map) ((ConcurrentHashMap) map2).get(instanceType);
                if (map == null) {
                    synchronized (map2) {
                        try {
                            map = (Map) ((ConcurrentHashMap) map2).get(instanceType);
                            if (map == null) {
                                map = new ConcurrentHashMap<>();
                                ((ConcurrentHashMap) map2).put(instanceType, map);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                map = f2436a;
            }
            if (obj == null) {
                map.remove(cls);
            } else if (!cls.isInterface()) {
                throw new IllegalArgumentException("set proxy class must a Interface: " + cls);
            } else if (!Proxiable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("set proxy class must a Proxiable: " + cls);
            } else if (cls.isInstance(obj) || (obj instanceof LazyGetter)) {
                Printer printer = getPrinter();
                printer.print(cls.getSimpleName() + " >>> " + obj.getClass() + " instance: " + instanceType);
                synchronized (f2436a) {
                    map.put(cls, obj);
                }
            } else {
                throw new IllegalArgumentException(obj.getClass().getSimpleName() + " is not instance of " + cls.getSimpleName() + " and not instance of LazyGetter");
            }
        }
    }

    public static <T> T get(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("ea288332", new Object[]{cls}) : (T) get((Class<Object>) cls, false);
    }

    public static synchronized Printer getPrinter() {
        synchronized (RVProxy.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Printer) ipChange.ipc$dispatch("ea5a53af", new Object[0]);
            }
            if (c == null) {
                c = new EmptyPrinter();
            }
            return c;
        }
    }

    public static <T> void set(Class<? super T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707e8150", new Object[]{cls, t});
        } else {
            b(null, cls, t);
        }
    }

    public static <T> void setLazy(Class<T> cls, LazyGetter<T> lazyGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79b63b3", new Object[]{cls, lazyGetter});
        } else {
            b(null, cls, lazyGetter);
        }
    }

    public static void setLazyInitializer(Initializer initializer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc6326ef", new Object[]{initializer});
        } else {
            d = initializer;
        }
    }

    public static void setPrinter(Printer printer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0da9183", new Object[]{printer});
        } else {
            c = printer;
        }
    }

    public static <T> T get(Node node, Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("b4f7086e", new Object[]{node, cls}) : (T) get(node, cls, false);
    }

    public static <T> void set(InstanceType instanceType, Class<? super T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40b20a6", new Object[]{instanceType, cls, t});
        } else {
            b(instanceType, cls, t);
        }
    }

    public static <T> void setLazy(InstanceType instanceType, Class<T> cls, LazyGetter<T> lazyGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d38881f5", new Object[]{instanceType, cls, lazyGetter});
        } else {
            b(instanceType, cls, lazyGetter);
        }
    }

    public static <T> T get(Class<T> cls, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("70fbfade", new Object[]{cls, new Boolean(z)}) : (T) get(null, cls, z);
    }

    public static <T> T get(Node node, final Class<T> cls, boolean z) {
        Map map;
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("fffe1d22", new Object[]{node, cls, new Boolean(z)});
        }
        if (!cls.isInterface()) {
            getPrinter().print("got proxy clazz must a Interface:".concat(cls.getSimpleName()));
        }
        InstanceType instanceType = node != null ? node.getInstanceType() : null;
        if (instanceType == null || (map = (Map) ((ConcurrentHashMap) b).get(instanceType)) == null) {
            map = null;
            t = null;
        } else {
            t = (T) map.get(cls);
        }
        if (t == null) {
            t = (T) ((ConcurrentHashMap) f2436a).get(cls);
        }
        if (t != null && !(t instanceof LazyGetter)) {
            return t;
        }
        T t2 = (T) a(map, cls);
        if (t2 != null) {
            return t2;
        }
        if (!sHasSetupProxy) {
            getPrinter().print("get proxy but not initialized! sLazyInitializer: " + d);
            Initializer initializer = d;
            if (initializer != null) {
                initializer.doInitialize();
                T t3 = (T) a(map, cls);
                if (t3 != null) {
                    return t3;
                }
            } else if (z) {
                return null;
            }
        }
        if (z) {
            return null;
        }
        T t4 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.alibaba.ariver.kernel.common.RVProxy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
                }
                Class<?> returnType = method.getReturnType();
                Printer printer = RVProxy.getPrinter();
                printer.print("unimplemented proxy:" + cls.getSimpleName() + "." + method.getName());
                if (!returnType.isPrimitive()) {
                    return null;
                }
                Class<?> cls2 = Boolean.TYPE;
                if (returnType == cls2 || returnType == cls2) {
                    return Boolean.FALSE;
                }
                return 0;
            }
        });
        set(cls, t4);
        return t4;
    }
}
