package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class o89<T> extends fa9<T> {
    public o89(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Double d, Method method) {
        super(str, type, cls, i, j, str2, locale, d, method, null, null);
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        try {
            this.g.invoke(t, Double.valueOf(jSONReader.f2()));
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.fa9, tb.g79
    public void M(JSONReader jSONReader, T t) {
        try {
            this.g.invoke(t, Double.valueOf(jSONReader.f2()));
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.fa9, tb.g79
    public void f(T t, int i) {
        try {
            this.g.invoke(t, Double.valueOf(i));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // tb.fa9, tb.g79
    public void h(T t, Object obj) {
        try {
            this.g.invoke(t, Double.valueOf(TypeUtils.M(obj)));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }
}
