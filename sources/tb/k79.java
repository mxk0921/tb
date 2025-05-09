package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class k79<T> extends g79<T> {
    public k79(String str, Class cls, int i, Method method) {
        super(str, cls, cls, i, 0L, null, null, null, method, null);
    }

    @Override // tb.g79
    public boolean B() {
        return true;
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        if (jSONReader.C1()) {
            return null;
        }
        return jSONReader.V1(Integer.class);
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        if (!jSONReader.n2()) {
            try {
                int i = 0;
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) this.g.invoke(t, new Object[0]);
                if (jSONReader.v1()) {
                    while (!jSONReader.u1()) {
                        int p2 = jSONReader.p2();
                        if (atomicIntegerArray != null && i < atomicIntegerArray.length()) {
                            atomicIntegerArray.set(i, p2);
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
            }
        }
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        if (obj != null) {
            try {
                int i = 0;
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) this.g.invoke(t, new Object[0]);
                if (obj instanceof AtomicIntegerArray) {
                    AtomicIntegerArray atomicIntegerArray2 = (AtomicIntegerArray) obj;
                    while (i < atomicIntegerArray2.length()) {
                        atomicIntegerArray.set(i, atomicIntegerArray2.get(i));
                        i++;
                    }
                    return;
                }
                List list = (List) obj;
                while (i < list.size()) {
                    atomicIntegerArray.set(i, TypeUtils.Q(list.get(i)));
                    i++;
                }
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        }
    }
}
