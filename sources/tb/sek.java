package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class sek<T> extends xgk<T> {
    public final k2a<String, T> b;

    public sek(Class<T> cls, k2a<String, T> k2aVar) {
        super(cls);
        this.b = k2aVar;
    }

    @Override // tb.jdk
    public T o(JSONReader jSONReader, Type type, Object obj, long j) {
        String Q2 = jSONReader.Q2();
        if (Q2 == null) {
            return null;
        }
        return this.b.apply(Q2);
    }

    @Override // tb.jdk
    public T q(JSONReader jSONReader, Type type, Object obj, long j) {
        String Q2 = jSONReader.Q2();
        if (Q2 == null || Q2.isEmpty()) {
            return null;
        }
        return this.b.apply(Q2);
    }
}
