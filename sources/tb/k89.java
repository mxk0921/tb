package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class k89<T> extends g79<T> {
    final z92<T, Double> v;

    public k89(String str, Class cls, int i, long j, String str2, Locale locale, Double d, Method method, z92<T, Double> z92Var) {
        super(str, cls, cls, i, j, str2, locale, d, method, null);
        this.v = z92Var;
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.e2();
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        Double d;
        try {
            d = jSONReader.e2();
        } catch (Exception e) {
            if ((jSONReader.B0(this.e) & JSONReader.Feature.NullOnError.mask) != 0) {
                d = null;
            } else {
                throw e;
            }
        }
        ((pdk) this.v).a(t, d);
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        ((pdk) this.v).a(t, TypeUtils.L(obj));
    }
}
