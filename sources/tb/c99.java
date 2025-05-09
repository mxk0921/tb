package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class c99<T> extends g79<T> {
    public c99(String str, Class cls, int i, long j, String str2, Integer num, Field field) {
        super(str, cls, cls, i, j, str2, null, num, null, field);
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.o2();
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        try {
            this.h.set(t, jSONReader.o2());
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.g79
    public void d(T t, double d) {
        h(t, Integer.valueOf((int) d));
    }

    @Override // tb.g79
    public void e(T t, float f) {
        h(t, Integer.valueOf((int) f));
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        Integer R = TypeUtils.R(obj);
        if (obj != null || (this.e & JSONReader.Feature.IgnoreSetNullValue.mask) == 0) {
            try {
                this.h.set(t, R);
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        }
    }
}
