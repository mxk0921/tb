package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class z89<T> extends g79<T> {
    public z89(String str, Class cls, int i, long j, String str2, Short sh, Field field) {
        super(str, cls, cls, i, j, str2, null, sh, null, field);
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return Short.valueOf((short) jSONReader.p2());
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        try {
            this.h.setShort(t, (short) jSONReader.p2());
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.g79
    public void d(T t, double d) {
        h(t, Short.valueOf((short) d));
    }

    @Override // tb.g79
    public void e(T t, float f) {
        h(t, Short.valueOf((short) f));
    }

    @Override // tb.g79
    public void f(T t, int i) {
        try {
            this.h.setShort(t, (short) i);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // tb.g79
    public void g(T t, long j) {
        try {
            this.h.setShort(t, (short) j);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        try {
            this.h.setShort(t, TypeUtils.V(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }
}
