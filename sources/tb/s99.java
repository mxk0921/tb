package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class s99<T> extends g79<T> {
    public s99(String str, Class cls, int i, long j, String str2, Byte b, Field field) {
        super(str, cls, cls, i, j, str2, null, b, null, field);
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return Byte.valueOf((byte) jSONReader.p2());
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        Integer o2 = jSONReader.o2();
        try {
            this.h.set(t, o2 == null ? null : Byte.valueOf(o2.byteValue()));
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.g79
    public void d(T t, double d) {
        h(t, Byte.valueOf((byte) d));
    }

    @Override // tb.g79
    public void e(T t, float f) {
        h(t, Byte.valueOf((byte) f));
    }

    @Override // tb.g79
    public void f(T t, int i) {
        h(t, Byte.valueOf((byte) i));
    }

    @Override // tb.g79
    public void g(T t, long j) {
        h(t, Byte.valueOf((byte) j));
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        try {
            this.h.set(t, TypeUtils.I(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // tb.g79
    public void i(T t, short s) {
        h(t, Byte.valueOf((byte) s));
    }
}
