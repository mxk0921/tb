package tb;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class p79<T> extends o79<T> {
    final boolean w;

    public p79(String str, Type type, Class cls, int i, String str2, Field field) {
        super(str, type, cls, i, 0L, str2, null, field);
        this.w = Modifier.isFinal(field.getModifiers());
    }

    @Override // tb.g79
    public boolean B() {
        return true;
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        if (obj != null) {
            try {
                if (this.w) {
                    ((AtomicReference) this.h.get(t)).set(obj);
                } else {
                    this.h.set(t, new AtomicReference(obj));
                }
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        }
    }
}
