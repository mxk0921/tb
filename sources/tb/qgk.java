package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class qgk extends xgk {
    public static final qgk b = new qgk();

    public qgk() {
        super(String.class);
    }

    @Override // tb.xgk, tb.jdk
    public Object i(Collection collection) {
        if (collection == null) {
            return null;
        }
        return wqf.q(collection);
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.Q2();
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.Q2();
    }

    @Override // tb.xgk, tb.jdk
    public Object x(Map map, long j) {
        if (map == null) {
            return null;
        }
        return wqf.q(map);
    }
}
