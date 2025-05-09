package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class j99<T> extends fa9<T> {
    public j99(String str, Type type, Class cls, int i, long j, String str2, Integer num, Method method) {
        super(str, type, cls, i, j, str2, null, num, method, null, null);
    }

    @Override // tb.fa9, tb.g79
    public Object K(JSONReader jSONReader) {
        return Integer.valueOf(jSONReader.p2());
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        try {
            this.g.invoke(t, Integer.valueOf(jSONReader.p2()));
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.fa9, tb.g79
    public void M(JSONReader jSONReader, T t) {
        try {
            this.g.invoke(t, Integer.valueOf(jSONReader.p2()));
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.fa9, tb.g79
    public void g(T t, long j) {
        try {
            this.g.invoke(t, Integer.valueOf((int) j));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // tb.fa9, tb.g79
    public void h(T t, Object obj) {
        try {
            this.g.invoke(t, Integer.valueOf(TypeUtils.Q(obj)));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }
}
