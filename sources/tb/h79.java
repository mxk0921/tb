package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
class h79<T> extends fa9<T> {
    public h79(Type type, Class cls, int i, long j, String str, Method method) {
        super("$$any$$", type, cls, i, j, str, null, null, method, null, null);
    }

    @Override // tb.g79
    public boolean B() {
        return true;
    }

    @Override // tb.fa9, tb.g79
    public void J(JSONReader jSONReader, Object obj) {
        try {
            this.g.invoke(obj, jSONReader.L0(), w(jSONReader).o(jSONReader, this.d, this.b, 0L));
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("any set error"), e);
        }
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        throw new UnsupportedOperationException();
    }

    @Override // tb.fa9, tb.g79
    public void h(T t, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // tb.g79
    public void m(Object obj, String str, Object obj2) {
        try {
            this.g.invoke(obj, str, obj2);
        } catch (Exception unused) {
            throw new JSONException("any set error");
        }
    }

    @Override // tb.g79
    public jdk w(JSONReader jSONReader) {
        if (this.u != null) {
            return this.u;
        }
        jdk R0 = jSONReader.R0(this.d);
        this.u = R0;
        return R0;
    }
}
