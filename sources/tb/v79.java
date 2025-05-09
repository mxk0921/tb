package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class v79<T, V> extends g79<T> {
    final z92<T, V> v;

    public v79(String str, Class<V> cls, int i, long j, String str2, Locale locale, Object obj, Method method, z92<T, V> z92Var) {
        super(str, cls, cls, i, j, str2, locale, obj, method, null);
        this.v = z92Var;
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.X1();
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        BigInteger bigInteger;
        try {
            bigInteger = jSONReader.X1();
        } catch (Exception e) {
            if ((jSONReader.B0(this.e) & JSONReader.Feature.NullOnError.mask) != 0) {
                bigInteger = null;
            } else {
                throw e;
            }
        }
        ((pdk) this.v).a(t, bigInteger);
    }

    @Override // tb.g79
    public void f(T t, int i) {
        try {
            ((pdk) this.v).a(t, BigInteger.valueOf(i));
        } catch (Exception e) {
            throw new JSONException("set " + toString() + " error", e);
        }
    }

    @Override // tb.g79
    public void g(T t, long j) {
        try {
            ((pdk) this.v).a(t, BigInteger.valueOf(j));
        } catch (Exception e) {
            throw new JSONException("set " + toString() + " error", e);
        }
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        try {
            ((pdk) this.v).a(t, TypeUtils.F(obj));
        } catch (Exception e) {
            throw new JSONException("set " + toString() + " error", e);
        }
    }
}
