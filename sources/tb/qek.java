package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class qek<T> extends xgk<T> {
    public final ndf<T> b;

    public qek(Class<T> cls, ndf ndfVar) {
        super(cls);
        this.b = ndfVar;
    }

    @Override // tb.jdk
    public T o(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.C1()) {
            return null;
        }
        return (T) ((ehk) this.b).a(jSONReader.p2());
    }

    @Override // tb.jdk
    public T q(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.C1()) {
            return null;
        }
        return (T) ((ehk) this.b).a(jSONReader.p2());
    }
}
