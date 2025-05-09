package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class ea9<T, V> extends g79<T> {
    final z92<T, V> v;

    public ea9(String str, Class<V> cls, int i, long j, String str2, Locale locale, Number number, Method method, z92<T, V> z92Var) {
        super(str, cls, cls, i, j, str2, locale, number, method, null);
        this.v = z92Var;
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.K2();
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        Number number;
        try {
            number = jSONReader.K2();
        } catch (Exception e) {
            if ((jSONReader.B0(this.e) & JSONReader.Feature.NullOnError.mask) != 0) {
                number = null;
            } else {
                throw e;
            }
        }
        ((pdk) this.v).a(t, number);
    }

    @Override // tb.g79
    public void f(T t, int i) {
        ((pdk) this.v).a(t, Integer.valueOf(i));
    }

    @Override // tb.g79
    public void g(T t, long j) {
        ((pdk) this.v).a(t, Long.valueOf(j));
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        ((pdk) this.v).a(t, obj);
    }
}
