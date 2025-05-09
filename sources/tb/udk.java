package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class udk extends xgk {
    public static final udk c = new udk(Object.class);
    public final Type b;

    public udk(Type type) {
        super(AtomicReference.class);
        this.b = type;
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.C1()) {
            return null;
        }
        return new AtomicReference(jSONReader.P1(this.b));
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.C1()) {
            return null;
        }
        return new AtomicReference(jSONReader.P1(this.b));
    }
}
