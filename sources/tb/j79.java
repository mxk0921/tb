package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class j79<T> extends g79<T> {
    public j79(String str, Class cls, int i, Method method) {
        super(str, cls, cls, i, 0L, null, null, null, method, null);
    }

    @Override // tb.g79
    public boolean B() {
        return true;
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.Z1();
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        h(t, jSONReader.Z1());
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        if (obj != null) {
            try {
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.g.invoke(t, new Object[0]);
                if (obj instanceof AtomicBoolean) {
                    obj = Boolean.valueOf(((AtomicBoolean) obj).get());
                }
                atomicBoolean.set(((Boolean) obj).booleanValue());
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        }
    }
}
