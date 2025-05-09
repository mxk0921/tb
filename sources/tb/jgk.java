package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class jgk extends kgk {
    public jgk(Class cls, Class cls2, long j) {
        super(cls, cls2, null, String.class, j, null);
    }

    @Override // tb.kgk, tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        Map map;
        Object put;
        if (jSONReader.w) {
            return q(jSONReader, type, obj, j);
        }
        if (!jSONReader.F1()) {
            if (jSONReader.f0() == '[') {
                jSONReader.t1();
                if (jSONReader.f0() == '{') {
                    Object o = o(jSONReader, String.class, obj, j);
                    if (jSONReader.u1()) {
                        jSONReader.w1();
                        return o;
                    }
                }
                throw new JSONException(jSONReader.a1("expect '{', but '['"));
            } else if (jSONReader.D1()) {
                return null;
            }
        }
        long j2 = jSONReader.f2453a.c | j;
        if (this.b == HashMap.class) {
            map = new HashMap();
        } else {
            map = (Map) D(j2);
        }
        int i = 0;
        while (!jSONReader.E1()) {
            String g2 = jSONReader.g2();
            String Q2 = jSONReader.Q2();
            if ((i != 0 || (JSONReader.Feature.SupportAutoType.mask & j2) == 0 || !g2.equals(JSON.DEFAULT_TYPE_KEY)) && !((Q2 == null && (JSONReader.Feature.IgnoreNullPropertyValue.mask & j2) != 0) || (put = map.put(g2, Q2)) == null || (JSONReader.Feature.DuplicateKeyValueAsArray.mask & j2) == 0)) {
                if (put instanceof Collection) {
                    ((Collection) put).add(Q2);
                    map.put(g2, put);
                } else {
                    map.put(g2, JSONArray.of(put, (Object) Q2));
                }
            }
            i++;
        }
        jSONReader.w1();
        return map;
    }
}
