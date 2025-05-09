package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class n79<T> extends g79<T> {
    public n79(String str, Class cls, int i, Method method) {
        super(str, cls, cls, i, 0L, null, null, null, method, null);
    }

    @Override // tb.g79
    public boolean B() {
        return true;
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        long r2 = jSONReader.r2();
        if (jSONReader.o3()) {
            return null;
        }
        return new AtomicLong(r2);
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        h(t, jSONReader.q2());
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        if (obj != null) {
            try {
                ((AtomicLong) this.g.invoke(t, new Object[0])).set(((Number) obj).longValue());
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        }
    }
}
