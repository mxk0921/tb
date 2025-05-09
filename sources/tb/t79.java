package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class t79<T> extends fa9<T> {
    public t79(String str, Type type, Class cls, int i, long j, String str2, Locale locale, BigDecimal bigDecimal, Method method) {
        super(str, type, cls, i, j, str2, locale, bigDecimal, method, null, null);
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        try {
            this.g.invoke(t, jSONReader.W1());
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.fa9, tb.g79
    public void f(T t, int i) {
        try {
            this.g.invoke(t, BigDecimal.valueOf(i));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // tb.fa9, tb.g79
    public void g(T t, long j) {
        try {
            this.g.invoke(t, BigDecimal.valueOf(j));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // tb.fa9, tb.g79
    public void h(T t, Object obj) {
        try {
            this.g.invoke(t, TypeUtils.D(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }
}
