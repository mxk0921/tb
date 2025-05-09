package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class p89<T> extends g79<T> {
    public p89(String str, Class cls, int i, long j, String str2, Float f, Field field) {
        super(str, cls, cls, i, j, str2, null, f, null, field);
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.k2();
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        try {
            this.h.set(t, jSONReader.k2());
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        try {
            this.h.set(t, TypeUtils.N(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }
}
