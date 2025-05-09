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
public class fun {
    public wyf b(Class cls) {
        return new ns3(cls);
    }

    public xyf c(Class cls, String str) {
        return new nkl(cls, str);
    }

    public String j(Lambda lambda) {
        return k(lambda);
    }

    public String k(m2a m2aVar) {
        String obj = m2aVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    public zyf a(FunctionReference functionReference) {
        return functionReference;
    }

    public xzf d(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public yzf e(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public zzf f(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public b0g g(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public c0g h(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public d0g i(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }
}
