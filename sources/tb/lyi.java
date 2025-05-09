package tb;

import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class lyi {
    public static final lyi INSTANCE = new lyi();

    /* renamed from: a  reason: collision with root package name */
    public static final a f23644a = new a(null, null, null);
    public static a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f23645a;
        public final Method b;
        public final Method c;

        public a(Method method, Method method2, Method method3) {
            this.f23645a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    public final a a(BaseContinuationImpl baseContinuationImpl) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            b = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f23644a;
            b = aVar2;
            return aVar2;
        }
    }

    public final String b(BaseContinuationImpl baseContinuationImpl) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        ckf.g(baseContinuationImpl, "continuation");
        a aVar = b;
        if (aVar == null) {
            aVar = a(baseContinuationImpl);
        }
        if (aVar == f23644a || (method = aVar.f23645a) == null || (invoke = method.invoke(baseContinuationImpl.getClass(), new Object[0])) == null || (method2 = aVar.b) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null) {
            return null;
        }
        Method method3 = aVar.c;
        if (method3 != null) {
            obj = method3.invoke(invoke2, new Object[0]);
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }
}
