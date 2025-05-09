package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.math.BigDecimal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class r79<T> extends g79<T> {
    public r79(String str, Class cls, int i, long j, String str2, BigDecimal bigDecimal, Field field) {
        super(str, cls, cls, i, j, str2, null, bigDecimal, null, field);
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.W1();
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        try {
            this.h.set(t, jSONReader.W1());
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.g79
    public void f(T t, int i) {
        try {
            this.h.set(t, BigDecimal.valueOf(i));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // tb.g79
    public void g(T t, long j) {
        try {
            this.h.set(t, BigDecimal.valueOf(j));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        try {
            this.h.set(t, TypeUtils.D(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }
}
