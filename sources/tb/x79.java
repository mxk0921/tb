package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class x79<T> extends g79<T> {
    public x79(String str, Class cls, int i, long j, String str2, Boolean bool, Field field) {
        super(str, cls, cls, i, j, str2, null, bool, null, field);
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.Z1();
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        try {
            this.h.set(t, jSONReader.Z1());
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.g79
    public void f(T t, int i) {
        h(t, TypeUtils.G(Integer.valueOf(i)));
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        try {
            this.h.set(t, TypeUtils.G(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // tb.g79
    public void j(T t, boolean z) {
        h(t, Boolean.valueOf(z));
    }
}
