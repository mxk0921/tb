package tb;

import java.util.ArrayList;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class g9f<E> {
    public static /* synthetic */ Object a(Object obj, int i, a07 a07Var) {
        if ((i & 1) != 0) {
            return null;
        }
        return obj;
    }

    public static final Object b(Object obj, E e) {
        String str = dv6.DEBUG_PROPERTY_NAME;
        if (obj == null) {
            return e;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return arrayList;
    }
}
