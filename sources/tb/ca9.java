package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
class ca9<T> extends ga9<T> {
    public ca9(String str, Type type, Class cls, int i, long j, String str2, Field field) {
        super(str, type, cls, i, j, str2, null, field);
    }

    @Override // tb.g79
    public boolean B() {
        return true;
    }

    @Override // tb.fa9, tb.g79
    public void J(JSONReader jSONReader, Object obj) {
        try {
            Map map = (Map) this.h.get(obj);
            String L0 = jSONReader.L0();
            map.put(L0, w(jSONReader).o(jSONReader, null, L0, 0L));
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        Object obj;
        if (this.v == null) {
            this.v = jSONReader.f2453a.g(this.d);
        }
        if (jSONReader.w) {
            obj = this.v.q(jSONReader, this.d, this.b, this.e);
        } else {
            obj = this.v.o(jSONReader, this.d, this.b, this.e);
        }
        h(t, obj);
    }

    @Override // tb.g79
    public void m(Object obj, String str, Object obj2) {
        try {
            ((Map) this.h.get(obj)).put(str, obj2);
        } catch (Exception unused) {
            throw new JSONException("set " + this.b + " error");
        }
    }

    @Override // tb.g79
    public jdk w(JSONReader jSONReader) {
        if (this.u != null) {
            return this.u;
        }
        jdk z = z(jSONReader);
        if (z instanceof ggk) {
            qgk qgkVar = qgk.b;
            this.u = qgkVar;
            return qgkVar;
        } else if (!(z instanceof kgk)) {
            return ogk.INSTANCE;
        } else {
            jdk R0 = jSONReader.R0(((kgk) z).d);
            this.u = R0;
            return R0;
        }
    }

    @Override // tb.ga9, tb.fa9, tb.g79
    public void h(T t, Object obj) {
        if (obj != null) {
            try {
                Map map = (Map) this.h.get(t);
                if (map != Collections.EMPTY_MAP && map != null && !"java.util.Collections$UnmodifiableMap".equals(map.getClass().getName())) {
                    map.putAll((Map) obj);
                }
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        }
    }
}
