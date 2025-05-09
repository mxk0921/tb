package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class k99<T> extends g79<T> {
    public k99(String str, Class cls, int i, long j, String str2, Long l, Field field) {
        super(str, cls, cls, i, j, str2, null, l, null, field);
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.q2();
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        try {
            this.h.set(t, jSONReader.q2());
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.g79
    public void d(T t, double d) {
        h(t, Long.valueOf((long) d));
    }

    @Override // tb.g79
    public void e(T t, float f) {
        h(t, Long.valueOf(f));
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        try {
            this.h.set(t, TypeUtils.S(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }
}
