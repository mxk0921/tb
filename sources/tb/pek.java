package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class pek<T> extends xgk<T> {
    public final k2a<Boolean, T> b;

    public pek(Class<T> cls, k2a<Boolean, T> k2aVar) {
        super(cls);
        this.b = k2aVar;
    }

    @Override // tb.jdk
    public T o(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.C1()) {
            return null;
        }
        return this.b.apply(Boolean.valueOf(jSONReader.a2()));
    }

    @Override // tb.jdk
    public T q(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.C1()) {
            return null;
        }
        return this.b.apply(Boolean.valueOf(jSONReader.a2()));
    }
}
