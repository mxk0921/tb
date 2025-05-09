package org.lsposed.hiddenapibypass;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.invoke.MethodHandleInfo;
import java.lang.invoke.MethodType;
import java.lang.reflect.Member;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class Helper {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class AccessibleObject {
        private boolean override;

        static {
            t2o.a(411041804);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class Class {
        private transient int accessFlags;
        private transient int classFlags;
        private transient ClassLoader classLoader;
        private transient int classSize;
        private transient int clinitThreadId;
        private transient Class<?> componentType;
        private transient short copiedMethodsOffset;
        private transient Object dexCache;
        private transient int dexClassDefIndex;
        private volatile transient int dexTypeIndex;
        private transient Object extData;
        private transient long iFields;
        private transient Object[] ifTable;
        private transient long methods;
        private transient String name;
        private transient int numReferenceInstanceFields;
        private transient int numReferenceStaticFields;
        private transient int objectSize;
        private transient int objectSizeAllocFastPath;
        private transient int primitiveType;
        private transient int referenceInstanceOffsets;
        private transient long sFields;
        private transient int status;
        private transient Class<?> superClass;
        private transient short virtualMethodsOffset;
        private transient Object vtable;

        static {
            t2o.a(411041805);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class Executable extends AccessibleObject {
        private int accessFlags;
        private long artMethod;
        private Class declaringClass;
        private Class declaringClassOfOverriddenMethod;
        private Object[] parameters;

        static {
            t2o.a(411041806);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class HandleInfo {
        private final Member member = null;
        private final a handle = null;

        static {
            t2o.a(411041807);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class InvokeStub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(411041808);
        }

        private InvokeStub(Object... objArr) {
            throw new IllegalStateException("Failed to new a instance");
        }

        private static Object invoke(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("40032da0", new Object[]{objArr});
            }
            throw new IllegalStateException("Failed to invoke the method");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class MethodHandleImpl extends a {
        private final MethodHandleInfo info = null;

        static {
            t2o.a(411041810);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class NeverCall {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static int s;
        private static int t;
        private int i;
        private int j;

        static {
            t2o.a(411041811);
        }

        private static void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            }
        }

        private static void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a {
        private a cachedSpreadInvoker;
        private MethodType nominalType;
        private final MethodType type = null;
        public final int handleKind = 0;
        public final long artFieldOrMethod = 0;

        static {
            t2o.a(411041809);
        }
    }

    static {
        t2o.a(411041803);
    }
}
