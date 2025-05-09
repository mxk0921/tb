package tb;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class tg1<T> extends rxk {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(tg1.class, Object.class, "a");
    @Volatile

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f28698a = sg1.NO_DECISION;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.rxk
    public final Object a(Object obj) {
        Object obj2 = b.get(this);
        if (obj2 == sg1.NO_DECISION) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t, Object obj);

    public final Object c(Object obj) {
        String str = dv6.DEBUG_PROPERTY_NAME;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = sg1.NO_DECISION;
        if (obj2 != obj3) {
            return obj2;
        }
        if (h30.a(atomicReferenceFieldUpdater, this, obj3, obj)) {
            return obj;
        }
        return atomicReferenceFieldUpdater.get(this);
    }

    public abstract Object d(T t);
}
