package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
class l79<T> extends g79<T> {
    public l79(String str, Class cls, int i, Method method) {
        super(str, cls, cls, i, 0L, null, null, null, method, null);
    }

    @Override // tb.g79
    public boolean B() {
        return true;
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        int p2 = jSONReader.p2();
        if (jSONReader.o3()) {
            return null;
        }
        return new AtomicInteger(p2);
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        h(t, jSONReader.o2());
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        if (obj != null) {
            try {
                ((AtomicInteger) this.g.invoke(t, new Object[0])).set(((Number) obj).intValue());
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        }
    }
}
