package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class j89<T> extends ga9<T> {
    public j89(String str, Class cls, int i, long j, String str2, Double d, Field field) {
        super(str, cls, cls, i, j, str2, d, field);
    }

    @Override // tb.fa9, tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.e2();
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        try {
            this.h.set(t, jSONReader.e2());
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.ga9, tb.fa9, tb.g79
    public void h(T t, Object obj) {
        try {
            this.h.set(t, TypeUtils.L(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }
}
