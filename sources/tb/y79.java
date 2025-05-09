package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class y79<T, V> extends g79<T> {
    final z92<T, V> v;

    public y79(String str, Class<V> cls, int i, long j, String str2, Locale locale, Object obj, Method method, z92<T, V> z92Var) {
        super(str, cls, cls, i, j, str2, locale, obj, method, null);
        this.v = z92Var;
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.Z1();
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        Boolean bool;
        try {
            bool = jSONReader.Z1();
        } catch (Exception e) {
            if ((jSONReader.B0(this.e) & JSONReader.Feature.NullOnError.mask) != 0) {
                bool = null;
            } else {
                throw e;
            }
        }
        ((pdk) this.v).a(t, bool);
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        ((pdk) this.v).a(t, TypeUtils.G(obj));
    }
}
