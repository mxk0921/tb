package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ogk extends xgk {
    public static final ogk INSTANCE = new ogk();

    public ogk() {
        super(Object.class);
    }

    @Override // tb.xgk, tb.jdk
    public Object D(long j) {
        return new JSONObject();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    @Override // tb.jdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o(com.alibaba.fastjson2.JSONReader r24, java.lang.reflect.Type r25, java.lang.Object r26, long r27) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ogk.o(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        jdk c0;
        byte W0 = jSONReader.W0();
        if (W0 >= 73 && W0 <= 125) {
            return jSONReader.Q2();
        }
        if (W0 == -110 && (c0 = jSONReader.c0(Object.class, 0L, j)) != null) {
            return c0.q(jSONReader, type, obj, j);
        }
        if (W0 != -81) {
            return jSONReader.T1();
        }
        jSONReader.t1();
        return null;
    }

    @Override // tb.xgk, tb.jdk
    public Object x(Map map, long j) {
        jdk jdkVar;
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        Object obj = map.get(JSON.DEFAULT_TYPE_KEY);
        if (!(obj instanceof String)) {
            return map;
        }
        String str = (String) obj;
        long a2 = ls9.a(str);
        if ((JSONReader.Feature.SupportAutoType.mask & j) != 0) {
            jdkVar = w(objectReaderProvider, a2);
        } else {
            jdkVar = null;
        }
        if (jdkVar == null && (jdkVar = objectReaderProvider.H(str, b(), j)) == null) {
            throw new JSONException("No suitable ObjectReader found for".concat(str));
        } else if (jdkVar != this) {
            return jdkVar.x(map, j);
        } else {
            return map;
        }
    }

    @Override // tb.xgk, tb.jdk
    public Object i(Collection collection) {
        return collection;
    }
}
