package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class i79<T> extends g79<T> {
    public i79(String str, Class cls, int i, String str2, AtomicBoolean atomicBoolean, Field field) {
        super(str, cls, cls, i, 0L, str2, null, atomicBoolean, null, field);
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
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.h.get(t);
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
