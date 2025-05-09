package com.taobao.atools;

import android.os.Build;
import android.text.TextUtils;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.atools.StaticHook;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sun.misc.Unsafe;
import tb.bmv;
import tb.l2u;
import tb.lxq;
import tb.pg1;
import tb.ujq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class StaticHook {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Method f10078a;
    public static final Method b;
    public static final Method c;
    public static final Method d;
    public static Object e;
    public static long f;
    public static long g;
    public static long h;
    public static long i;
    public static long j;
    public static long k;
    public static long l;
    public static long m;
    public static long n;
    public static long o;
    public static boolean p;
    public static final AtomicBoolean q = new AtomicBoolean();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class Helper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f10079a;
        public int b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class A {

            /* renamed from: a  reason: collision with root package name */
            private transient Object f10080a;
            private transient int ac;
            private transient Object b;
            private transient Object c;
            private transient Object d;
            private transient Object[] e;
            private transient String f;
            private transient Object g;
            private transient Object h;
            private transient long i;
            private transient long m;
            private transient long s;
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class A_36 {
            private transient int accessFlags;
            private transient ClassLoader classLoader;
            private transient Class<?> componentType;
            private transient Object dexCache;
            private transient Object extData;
            private transient long fields;
            private transient Object[] ifTable;
            private transient long methods;
            private transient String name;
            private transient Class superClass;
            private transient Object vtable;
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static class B {

            /* renamed from: a  reason: collision with root package name */
            private Object f10081a;
            public long ar;
            public Object b;
            private Object c;
            public int h;
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static class C extends B {

            /* renamed from: a  reason: collision with root package name */
            private Object f10082a;
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static class C_36 extends B {
            public Field field;
            private long target;
            private Object targetClassOrMethodHandleInfo;
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static class D {
            private Object h;
            private Object m;
        }

        public static void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            }
        }

        public static void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
            }
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eb83aac", new Object[0])).booleanValue();
        }
        p();
        if (Build.VERSION.SDK_INT < 26 || !p) {
            return false;
        }
        return true;
    }

    public static Constructor d(Class cls, Class<?>... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Constructor) ipChange.ipc$dispatch("66ddf97", new Object[]{cls, clsArr});
        }
        try {
            try {
                return cls.getConstructor(clsArr);
            } catch (Throwable th) {
                l2u.instance.d("StaticHook", "getConstructor err", th, new Object[0]);
                return null;
            }
        } catch (Throwable unused) {
            return (Constructor) j(cls, cls.getName(), clsArr);
        }
    }

    public static Field e(Class<?> cls, String str) throws InvocationTargetException, IllegalAccessException {
        return (Field) d.invoke(cls, str);
    }

    public static Method g(Object obj, String str, Class<?>... clsArr) {
        try {
            try {
                return (Method) f10078a.invoke(obj, str, clsArr);
            } catch (Throwable unused) {
                return (Method) j(obj, str, clsArr);
            }
        } catch (Throwable th) {
            l2u.instance.d("StaticHook", "getDeclaredMethodByAddress err", th, new Object[0]);
            return null;
        }
    }

    public static Method[] h(Object obj) {
        try {
            Method[] methodArr = (Method[]) b.invoke(obj, new Object[0]);
            if (methodArr != null) {
                if (methodArr.length > 0) {
                    return methodArr;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            return l(obj);
        } catch (Throwable th) {
            l2u.instance.d("StaticHook", "getDeclaredMethods err", th, new Object[0]);
            return null;
        }
    }

    public static Field i(Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("cbf7454e", new Object[]{cls, str});
        }
        try {
            try {
                return e(cls, str);
            } catch (Throwable th) {
                l2u.instance.d("StaticHook", "getInstanceField err", th, new Object[0]);
                return null;
            }
        } catch (Throwable unused) {
            return f(cls, str, new lxq() { // from class: tb.wjq
                @Override // tb.lxq
                public final Object get() {
                    Long n2;
                    n2 = StaticHook.n();
                    return n2;
                }
            });
        }
    }

    public static Method k(Object obj, String str, Class<?>... clsArr) throws InvocationTargetException, IllegalAccessException {
        return (Method) c.invoke(obj, str, clsArr);
    }

    public static Field m(Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("eaa6c827", new Object[]{cls, str});
        }
        try {
            try {
                return e(cls, str);
            } catch (Throwable th) {
                l2u.instance.d("StaticHook", "getStaticField err", th, new Object[0]);
                return null;
            }
        } catch (Throwable unused) {
            return f(cls, str, new lxq() { // from class: tb.vjq
                @Override // tb.lxq
                public final Object get() {
                    Long o2;
                    o2 = StaticHook.o();
                    return o2;
                }
            });
        }
    }

    public static /* synthetic */ Long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("5cab1695", new Object[0]);
        }
        return Long.valueOf(g);
    }

    public static /* synthetic */ Long o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("88d74f0f", new Object[0]);
        }
        return Long.valueOf(h);
    }

    public static void p() {
        int i2;
        MethodHandles.Lookup lookup;
        MethodHandle unreflect;
        MethodHandles.Lookup lookup2;
        MethodHandle unreflect2;
        MethodHandles.Lookup lookup3;
        MethodHandle unreflectGetter;
        MethodHandles.Lookup lookup4;
        MethodHandle unreflectGetter2;
        if (!q.getAndSet(true) && (i2 = Build.VERSION.SDK_INT) >= 26) {
            try {
                e = Unsafe.class.getDeclaredMethod("getUnsafe", new Class[0]).invoke(null, new Object[0]);
                l2u l2uVar = l2u.instance;
                l2uVar.e("StaticHook", "getUnsafe", pg1.ATOM_EXT_unsafe, e);
                Unsafe unsafe = (Unsafe) e;
                i = unsafe.objectFieldOffset(Helper.B.class.getDeclaredField("ar"));
                o = unsafe.objectFieldOffset(Helper.D.class.getDeclaredField("m"));
                if (i2 >= 36) {
                    f = unsafe.objectFieldOffset(Helper.A_36.class.getDeclaredField("methods"));
                    long objectFieldOffset = unsafe.objectFieldOffset(Helper.A_36.class.getDeclaredField("fields"));
                    h = objectFieldOffset;
                    g = objectFieldOffset;
                    n = unsafe.objectFieldOffset(Helper.C_36.class.getDeclaredField("targetClassOrMethodHandleInfo"));
                } else {
                    f = unsafe.objectFieldOffset(Helper.A.class.getDeclaredField("m"));
                    g = unsafe.objectFieldOffset(Helper.A.class.getDeclaredField(bmv.MSGTYPE_INTERVAL));
                    h = unsafe.objectFieldOffset(Helper.A.class.getDeclaredField("s"));
                    n = unsafe.objectFieldOffset(Helper.C.class.getDeclaredField("a"));
                }
                lookup = MethodHandles.lookup();
                unreflect = lookup.unreflect(Helper.class.getDeclaredMethod("a", new Class[0]));
                lookup2 = MethodHandles.lookup();
                unreflect2 = lookup2.unreflect(Helper.class.getDeclaredMethod(TplMsg.VALUE_T_NATIVE_RETURN, new Class[0]));
                long j2 = unsafe.getLong(Helper.class, f);
                long j3 = unsafe.getLong(unreflect, i);
                long j4 = unsafe.getLong(unreflect2, i);
                long j5 = j4 - j3;
                l = j5;
                m = (j3 - j2) - j5;
                l2uVar.e("StaticHook", "unsafeInit method", "startAddress", Long.valueOf(j2), "aAddress", Long.valueOf(j3), "bAddress", Long.valueOf(j4), "mtdSize", Long.valueOf(l), "mtdBias", Long.valueOf(m));
                lookup3 = MethodHandles.lookup();
                unreflectGetter = lookup3.unreflectGetter(Helper.class.getDeclaredField("a"));
                lookup4 = MethodHandles.lookup();
                unreflectGetter2 = lookup4.unreflectGetter(Helper.class.getDeclaredField(TplMsg.VALUE_T_NATIVE_RETURN));
                long j6 = unsafe.getLong(Helper.class, g);
                long j7 = unsafe.getLong(unreflectGetter, i);
                long j8 = unsafe.getLong(unreflectGetter2, i);
                j = j8 - j7;
                k = j7 - j6;
                l2uVar.e("StaticHook", "unsafeInit field", "startAddress", Long.valueOf(j6), "aAddress", Long.valueOf(j7), "bAddress", Long.valueOf(j8), "fieldSize", Long.valueOf(j), "fieldBias", Long.valueOf(k));
                if (l > 0 && j > 0) {
                    p = true;
                }
                l2uVar.e("StaticHook", "unsafeInit", "unsafeAvailable", Boolean.valueOf(p));
            } catch (Throwable th) {
                l2u.instance.d("StaticHook", "unsafeInit err", th, new Object[0]);
            }
        }
    }

    public static Method[] l(Object obj) throws Throwable {
        long j2;
        String str;
        int i2;
        String str2;
        MethodHandles.Lookup lookup;
        MethodHandle unreflect;
        MethodHandles.Lookup lookup2;
        String str3 = "clazz";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method[]) ipChange.ipc$dispatch("c9f7f11", new Object[]{obj});
        }
        if (!c()) {
            return null;
        }
        Unsafe unsafe = (Unsafe) e;
        long j3 = unsafe.getLong(obj, f);
        String str4 = "StaticHook";
        if (j3 > 0) {
            i2 = unsafe.getInt(j3);
            if (i2 <= 0) {
                str = str3;
                str2 = str4;
                j2 = j3;
            } else {
                l2u.instance.e(str4, "getMethodsByAddress", str3, obj, "methods", Long.valueOf(j3), "mtdCount", Integer.valueOf(i2));
                lookup = MethodHandles.lookup();
                unreflect = lookup.unreflect(Helper.class.getDeclaredMethod("a", new Class[0]));
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                while (i3 < i2) {
                    unsafe.putLong(unreflect, i, j3 + m + (i3 * l));
                    unsafe.putObject(unreflect, n, (Object) null);
                    try {
                        lookup2 = MethodHandles.lookup();
                        lookup2.revealDirect(unreflect);
                    } catch (Throwable unused) {
                    }
                    Member member = (Member) unsafe.getObject(ujq.a(unsafe.getObject(unreflect, n)), o);
                    l2u.instance.e(str4, "getMethodsByAddress", str3, obj, "name", member.getName(), "index", Integer.valueOf(i3));
                    if (member instanceof Method) {
                        arrayList.add((Method) member);
                    }
                    i3++;
                    str4 = str4;
                    str3 = str3;
                    j3 = j3;
                }
                return (Method[]) arrayList.toArray(new Method[0]);
            }
        } else {
            str = str3;
            str2 = str4;
            j2 = j3;
            i2 = 0;
        }
        l2u.instance.e(str2, "getMethodsByAddress < 0", str, obj, "methods", Long.valueOf(j2), "mtdCount", Integer.valueOf(i2));
        return null;
    }

    static {
        try {
            f10078a = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
        } catch (Exception e2) {
            l2u.instance.d("StaticHook", "reflect utils init error", e2, new Object[0]);
        }
        try {
            b = Class.class.getDeclaredMethod("getDeclaredMethods", new Class[0]);
        } catch (Exception e3) {
            l2u.instance.d("StaticHook", "reflect utils init error", e3, new Object[0]);
        }
        try {
            c = Class.class.getMethod("getMethod", String.class, Class[].class);
        } catch (Exception e4) {
            l2u.instance.d("StaticHook", "reflect utils init error", e4, new Object[0]);
        }
        try {
            d = Class.class.getMethod("getDeclaredField", String.class);
        } catch (Exception e5) {
            l2u.instance.d("StaticHook", "reflect utils init error", e5, new Object[0]);
        }
    }

    public static Field f(Class<?> cls, String str, lxq<Long> lxqVar) throws Throwable {
        long j2;
        char c2;
        int i2;
        MethodHandles.Lookup lookup;
        MethodHandle unreflectGetter;
        MethodHandles.Lookup lookup2;
        int i3 = 6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("b445e610", new Object[]{cls, str, lxqVar});
        }
        if (!c() || TextUtils.isEmpty(str)) {
            return null;
        }
        Unsafe unsafe = (Unsafe) e;
        long j3 = unsafe.getLong(cls, lxqVar.get().longValue());
        if (j3 > 0) {
            i2 = unsafe.getInt(j3);
            if (i2 <= 0) {
                j2 = j3;
                c2 = 1;
            } else {
                l2u.instance.e("StaticHook", "get field by address", "clazz", cls, "fields", Long.valueOf(j3), "numFields", Integer.valueOf(i2));
                lookup = MethodHandles.lookup();
                unreflectGetter = lookup.unreflectGetter(Helper.class.getDeclaredField("a"));
                int i4 = 0;
                while (i4 < i2) {
                    unsafe.putLong(unreflectGetter, i, (i4 * j) + j3 + k);
                    unsafe.putObject(unreflectGetter, n, (Object) null);
                    try {
                        lookup2 = MethodHandles.lookup();
                        lookup2.revealDirect(unreflectGetter);
                    } catch (Throwable unused) {
                    }
                    Field field = (Field) unsafe.getObject(ujq.a(unsafe.getObject(unreflectGetter, n)), o);
                    l2u l2uVar = l2u.instance;
                    String name = field.getName();
                    Integer valueOf = Integer.valueOf(i4);
                    Object[] objArr = new Object[i3];
                    objArr[0] = "clazz";
                    objArr[1] = cls;
                    objArr[2] = "name";
                    objArr[3] = name;
                    objArr[4] = "index";
                    objArr[5] = valueOf;
                    l2uVar.e("StaticHook", "getDeclaredFieldByAddress", objArr);
                    if (str.equals(field.getName())) {
                        l2uVar.e("StaticHook", "get sFields by address success!", "field", field);
                        return field;
                    }
                    i4++;
                    j3 = j3;
                    i3 = 6;
                }
                return null;
            }
        } else {
            j2 = j3;
            c2 = 1;
            i2 = 0;
        }
        l2u l2uVar2 = l2u.instance;
        Long valueOf2 = Long.valueOf(j2);
        Integer valueOf3 = Integer.valueOf(i2);
        Object[] objArr2 = new Object[6];
        objArr2[0] = "clazz";
        objArr2[c2] = cls;
        objArr2[2] = "fields";
        objArr2[3] = valueOf2;
        objArr2[4] = "numFields";
        objArr2[5] = valueOf3;
        l2uVar2.e("StaticHook", "get field by address < 0", objArr2);
        return null;
    }

    public static Member j(Object obj, String str, Class<?>... clsArr) throws Throwable {
        long j2;
        int i2;
        char c2;
        MethodHandles.Lookup lookup;
        MethodHandle unreflect;
        Class<?>[] clsArr2;
        MethodHandles.Lookup lookup2;
        String str2 = str;
        int i3 = 6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Member) ipChange.ipc$dispatch("afa8a0c3", new Object[]{obj, str2, clsArr});
        }
        if (!c() || TextUtils.isEmpty(str)) {
            return null;
        }
        Unsafe unsafe = (Unsafe) e;
        long j3 = unsafe.getLong(obj, f);
        if (j3 > 0) {
            i2 = unsafe.getInt(j3);
            if (i2 <= 0) {
                j2 = j3;
                c2 = 1;
            } else {
                l2u.instance.e("StaticHook", "getMemberByAddress", "clazz", obj, "methods", Long.valueOf(j3), "mtdCount", Integer.valueOf(i2));
                lookup = MethodHandles.lookup();
                unreflect = lookup.unreflect(Helper.class.getDeclaredMethod("a", new Class[0]));
                int i4 = 0;
                while (i4 < i2) {
                    unsafe.putLong(unreflect, i, j3 + m + (i4 * l));
                    unsafe.putObject(unreflect, n, (Object) null);
                    try {
                        lookup2 = MethodHandles.lookup();
                        lookup2.revealDirect(unreflect);
                    } catch (Throwable unused) {
                    }
                    Member member = (Member) unsafe.getObject(ujq.a(unsafe.getObject(unreflect, n)), o);
                    l2u l2uVar = l2u.instance;
                    String name = member.getName();
                    Integer valueOf = Integer.valueOf(i4);
                    Object[] objArr = new Object[i3];
                    objArr[0] = "clazz";
                    objArr[1] = obj;
                    objArr[2] = "name";
                    objArr[3] = name;
                    objArr[4] = "index";
                    objArr[5] = valueOf;
                    l2uVar.e("StaticHook", "getMemberByAddress", objArr);
                    if (member.getName().equals(str2)) {
                        if (member instanceof Method) {
                            clsArr2 = ((Method) member).getParameterTypes();
                        } else {
                            clsArr2 = member instanceof Constructor ? ((Constructor) member).getParameterTypes() : null;
                        }
                        if (clsArr2 != null && clsArr.length == clsArr2.length) {
                            for (int i5 = 0; i5 < clsArr.length; i5++) {
                                if (clsArr[i5] == clsArr2[i5]) {
                                }
                            }
                            l2u.instance.e("StaticHook", "getMemberByAddress success!", "member", member);
                            return member;
                        }
                    }
                    i4++;
                    str2 = str;
                    j3 = j3;
                    i3 = 6;
                }
                return null;
            }
        } else {
            j2 = j3;
            c2 = 1;
            i2 = 0;
        }
        l2u l2uVar2 = l2u.instance;
        Long valueOf2 = Long.valueOf(j2);
        Integer valueOf3 = Integer.valueOf(i2);
        Object[] objArr2 = new Object[6];
        objArr2[0] = "clazz";
        objArr2[c2] = obj;
        objArr2[2] = "methods";
        objArr2[3] = valueOf2;
        objArr2[4] = "mtdCount";
        objArr2[5] = valueOf3;
        l2uVar2.e("StaticHook", "getMemberByAddress < 0", objArr2);
        return null;
    }
}
