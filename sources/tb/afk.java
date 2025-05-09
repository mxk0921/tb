package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class afk extends xgk {
    public final k2a<long[], Object> b;
    public static final afk c = new afk(long[].class, null);
    public static final long HASH_TYPE = ls9.a("[J");

    public afk(Class cls, k2a<long[], Object> k2aVar) {
        super(cls);
        this.b = k2aVar;
    }

    @Override // tb.xgk, tb.jdk
    public Object i(Collection collection) {
        long j;
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                j = 0;
            } else if (obj instanceof Number) {
                j = ((Number) obj).longValue();
            } else {
                k2a M = JSONFactory.defaultObjectReaderProvider.M(obj.getClass(), Long.TYPE);
                if (M != null) {
                    j = ((Long) M.apply(obj)).longValue();
                } else {
                    throw new JSONException("can not cast to long " + obj.getClass());
                }
            }
            jArr[i] = j;
            i++;
        }
        k2a<long[], Object> k2aVar = this.b;
        if (k2aVar != null) {
            return k2aVar.apply(jArr);
        }
        return jArr;
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        k2a<long[], Object> k2aVar;
        long[] s2 = jSONReader.s2();
        if (s2 == null || (k2aVar = this.b) == null) {
            return s2;
        }
        return k2aVar.apply(s2);
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        k2a<long[], Object> k2aVar;
        long[] s2 = jSONReader.s2();
        if (s2 == null || (k2aVar = this.b) == null) {
            return s2;
        }
        return k2aVar.apply(s2);
    }
}
