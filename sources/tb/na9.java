package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class na9<T> extends fa9<T> {
    final boolean x;

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        String Q2 = jSONReader.Q2();
        if (this.x && Q2 != null) {
            Q2 = Q2.trim();
        }
        try {
            this.g.invoke(t, Q2);
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.g79
    public boolean N(Class cls) {
        return true;
    }

    /* renamed from: O */
    public String K(JSONReader jSONReader) {
        String Q2 = jSONReader.Q2();
        if (!this.x || Q2 == null) {
            return Q2;
        }
        return Q2.trim();
    }

    @Override // tb.fa9, tb.g79
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
            this.g.invoke(t, str);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    public na9(String str, Type type, Class cls, int i, long j, String str2, Locale locale, String str3, Method method) {
        super(str, type, cls, i, j, str2, locale, str3, method, null, null);
        this.x = "trim".equals(str2) || (j & JSONReader.Feature.TrimString.mask) != 0;
    }
}
