package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class ma9<T, V> extends g79<T> {
    final z92<T, V> v;
    final String w;
    final boolean x;

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.Q2();
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        String Q2 = jSONReader.Q2();
        if (this.x && Q2 != null) {
            Q2 = Q2.trim();
        }
        ((pdk) this.v).a(t, Q2);
    }

    @Override // tb.g79
    public boolean N(Class cls) {
        return true;
    }

    @Override // tb.g79
    public void f(T t, int i) {
        h(t, Integer.toString(i));
    }

    @Override // tb.g79
    public void g(T t, long j) {
        h(t, Long.toString(j));
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        String str;
        if ((obj instanceof String) || obj == null) {
            str = (String) obj;
        } else {
            str = obj.toString();
        }
        if (this.x && str != null) {
            str = str.trim();
        }
        try {
            ((pdk) this.v).a(t, str);
        } catch (Exception e) {
            throw new JSONException("set " + toString() + " error", e);
        }
    }

    public ma9(String str, Class<V> cls, int i, long j, String str2, Locale locale, Object obj, Method method, z92<T, V> z92Var) {
        super(str, cls, cls, i, j, str2, locale, obj, method, null);
        this.v = z92Var;
        this.w = str2;
        this.x = "trim".equals(str2) || (j & JSONReader.Feature.TrimString.mask) != 0;
    }
}
