package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class t99<T, V> extends g79<T> {
    final z92<T, V> v;

    public t99(String str, Class<V> cls, int i, long j, String str2, Locale locale, Object obj, Method method, z92<T, V> z92Var) {
        super(str, cls, cls, i, j, str2, locale, obj, method, null);
        this.v = z92Var;
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.o2();
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        Byte b = null;
        try {
            Integer o2 = jSONReader.o2();
            if (o2 != null) {
                b = Byte.valueOf(o2.byteValue());
            }
        } catch (Exception e) {
            if ((jSONReader.B0(this.e) & JSONReader.Feature.NullOnError.mask) == 0) {
                throw e;
            }
        }
        ((pdk) this.v).a(t, b);
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        ((pdk) this.v).a(t, TypeUtils.I(obj));
    }
}
