package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class vdk extends xgk {
    public static final vdk c = new vdk(null);
    public final k2a b = new xzt(BigDecimal.class);

    public vdk(k2a<BigDecimal, Object> k2aVar) {
        super(BigDecimal.class);
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.W1();
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.W1();
    }

    @Override // tb.xgk, tb.jdk
    public Object x(Map map, long j) {
        Object obj = map.get("value");
        if (obj == null) {
            obj = map.get("$numberDecimal");
        }
        if (!(obj instanceof BigDecimal)) {
            obj = ((xzt) this.b).apply(obj);
        }
        return (BigDecimal) obj;
    }
}
