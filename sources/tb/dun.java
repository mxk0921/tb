package tb;

import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class dun {

    /* renamed from: a  reason: collision with root package name */
    public static final fun f18075a;
    public static final wyf[] b;

    static {
        fun funVar = null;
        try {
            funVar = (fun) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (funVar == null) {
            funVar = new fun();
        }
        f18075a = funVar;
        b = new wyf[0];
    }

    public static zyf a(FunctionReference functionReference) {
        f18075a.a(functionReference);
        return functionReference;
    }

    public static wyf b(Class cls) {
        return f18075a.b(cls);
    }

    public static xyf c(Class cls) {
        return f18075a.c(cls, "");
    }

    public static xyf d(Class cls, String str) {
        return f18075a.c(cls, str);
    }

    public static xzf e(MutablePropertyReference0 mutablePropertyReference0) {
        f18075a.d(mutablePropertyReference0);
        return mutablePropertyReference0;
    }

    public static yzf f(MutablePropertyReference1 mutablePropertyReference1) {
        f18075a.e(mutablePropertyReference1);
        return mutablePropertyReference1;
    }

    public static zzf g(MutablePropertyReference2 mutablePropertyReference2) {
        f18075a.f(mutablePropertyReference2);
        return mutablePropertyReference2;
    }

    public static b0g h(PropertyReference0 propertyReference0) {
        f18075a.g(propertyReference0);
        return propertyReference0;
    }

    public static c0g i(PropertyReference1 propertyReference1) {
        f18075a.h(propertyReference1);
        return propertyReference1;
    }

    public static d0g j(PropertyReference2 propertyReference2) {
        f18075a.i(propertyReference2);
        return propertyReference2;
    }

    public static String k(Lambda lambda) {
        return f18075a.j(lambda);
    }

    public static String l(m2a m2aVar) {
        return f18075a.k(m2aVar);
    }
}
