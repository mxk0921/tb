package tb;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class etx {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, ywx> f18813a = new ConcurrentHashMap<>();
    public final List<Field> b = new ArrayList();

    public etx(Class cls) {
        while (!Object.class.equals(cls)) {
            Collections.addAll(this.b, cls.getDeclaredFields());
            cls = cls.getSuperclass();
        }
        Iterator<Field> it = this.b.iterator();
        while (it.hasNext()) {
            if (Modifier.isFinal(it.next().getModifiers())) {
                it.remove();
            }
        }
    }

    public final ywx a(String str) {
        return this.f18813a.get(str);
    }

    public final void b(String str, ywx ywxVar) {
        this.f18813a.put(str, ywxVar);
    }
}
