package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.Supplier;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
class ba9<T, V> extends z99<T, V> {
    final jdk<V> A;
    final Supplier<List<V>> z;

    public ba9(Supplier<List<V>> supplier, jdk<V> jdkVar, z92<T, List<V>> z92Var, Type type, String str) {
        super(str, List.class, List.class, type, TypeUtils.i(type), 0, 0L, null, null, null, null, null, z92Var);
        this.z = supplier;
        this.A = jdkVar;
    }

    @Override // tb.z99
    public Collection<V> P(JSONReader.c cVar) {
        return this.z.get();
    }

    @Override // tb.fa9, tb.g79
    public void h(T t, Object obj) {
        ((pdk) this.w).a(t, obj);
    }
}
