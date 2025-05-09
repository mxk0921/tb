package tb;

import com.squareup.wire.ExtendableMessage;
import com.squareup.wire.b;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class rs8 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<? extends ExtendableMessage>, Map<Integer, b<?, ?>>> f27577a = new LinkedHashMap();
    public final Map<Class<? extends ExtendableMessage>, Map<String, b<?, ?>>> b = new LinkedHashMap();

    public <T extends ExtendableMessage<?>, E> void a(b<T, E> bVar) {
        Class<T> l = bVar.l();
        Map<Class<? extends ExtendableMessage>, Map<Integer, b<?, ?>>> map = this.f27577a;
        Map<Integer, b<?, ?>> map2 = (Map) ((LinkedHashMap) map).get(l);
        Map<Class<? extends ExtendableMessage>, Map<String, b<?, ?>>> map3 = this.b;
        Map<String, b<?, ?>> map4 = (Map) ((LinkedHashMap) map3).get(l);
        if (map2 == null) {
            map2 = new LinkedHashMap<>();
            map4 = new LinkedHashMap<>();
            map.put(l, map2);
            map3.put(l, map4);
        }
        map2.put(Integer.valueOf(bVar.p()), bVar);
        map4.put(bVar.o(), bVar);
    }

    public <T extends ExtendableMessage<?>, E> b<T, E> b(Class<T> cls, int i) {
        Map map = (Map) ((LinkedHashMap) this.f27577a).get(cls);
        if (map == null) {
            return null;
        }
        return (b) map.get(Integer.valueOf(i));
    }
}
