package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class e99<T> extends fa9<T> {
    public e99(String str, int i, long j, String str2, Locale locale, Integer num, Method method) {
        super(str, Integer.class, Integer.class, i, j, str2, locale, num, method, null, null);
    }

    @Override // tb.fa9, tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.o2();
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        try {
            this.g.invoke(t, jSONReader.o2());
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.fa9, tb.g79
    public void M(JSONReader jSONReader, T t) {
        try {
            this.g.invoke(t, jSONReader.o2());
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.fa9, tb.g79
    public void h(T t, Object obj) {
        try {
            this.g.invoke(t, TypeUtils.R(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }
}
