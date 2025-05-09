package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class m89<T> extends g79<T> {
    public m89(String str, Class cls, int i, long j, String str2, Double d, Field field) {
        super(str, cls, cls, i, j, str2, null, d, null, field);
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return Double.valueOf(jSONReader.f2());
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        try {
            this.h.setDouble(t, jSONReader.f2());
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        try {
            this.h.set(t, Double.valueOf(TypeUtils.M(obj)));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }
}
