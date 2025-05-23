package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class x89<T> extends fa9<T> {
    public x89(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Short sh, Method method) {
        super(str, type, cls, i, j, str2, locale, sh, method, null, null);
    }

    @Override // tb.fa9, tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.o2();
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        Integer o2 = jSONReader.o2();
        try {
            this.g.invoke(t, o2 == null ? null : Short.valueOf(o2.shortValue()));
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.fa9, tb.g79
    public void h(T t, Object obj) {
        try {
            this.g.invoke(t, TypeUtils.U(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }
}
