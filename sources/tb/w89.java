package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class w89<T, V> extends g79<T> {
    final z92<T, V> v;

    public w89(String str, Class<V> cls, int i, long j, String str2, Locale locale, Object obj, Method method, z92<T, V> z92Var) {
        super(str, cls, cls, i, j, str2, locale, obj, method, null);
        this.v = z92Var;
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return Short.valueOf((short) jSONReader.p2());
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        Short sh = null;
        try {
            Integer o2 = jSONReader.o2();
            if (o2 != null) {
                sh = Short.valueOf(o2.shortValue());
            }
        } catch (Exception e) {
            if ((jSONReader.B0(this.e) & JSONReader.Feature.NullOnError.mask) == 0) {
                throw e;
            }
        }
        ((pdk) this.v).a(t, sh);
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        ((pdk) this.v).a(t, TypeUtils.U(obj));
    }
}
