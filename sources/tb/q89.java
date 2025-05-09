package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class q89<T> extends g79<T> {
    final z92<T, Float> v;

    public q89(String str, Class cls, int i, long j, String str2, Locale locale, Float f, Method method, z92<T, Float> z92Var) {
        super(str, cls, cls, i, j, str2, locale, f, method, null);
        this.v = z92Var;
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.k2();
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        Float f;
        try {
            f = jSONReader.k2();
        } catch (Exception e) {
            if ((jSONReader.B0(this.e) & JSONReader.Feature.NullOnError.mask) != 0) {
                f = null;
            } else {
                throw e;
            }
        }
        ((pdk) this.v).a(t, f);
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        ((pdk) this.v).a(t, TypeUtils.N(obj));
    }
}
