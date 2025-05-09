package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class rek<T> extends xgk<T> {
    public final ujh<T> b;

    public rek(Class<T> cls, ujh ujhVar) {
        super(cls);
        this.b = ujhVar;
    }

    @Override // tb.jdk
    public T o(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.C1()) {
            return null;
        }
        return (T) ((rhk) this.b).a(jSONReader.p2());
    }

    @Override // tb.jdk
    public T q(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.C1()) {
            return null;
        }
        return (T) ((rhk) this.b).a(jSONReader.p2());
    }
}
