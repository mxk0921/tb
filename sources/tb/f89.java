package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class f89<T> extends ga9<T> {
    public f89(String str, Type type, Class cls, int i, long j, String str2, Field field) {
        super(str, type, cls, i, j, str2, null, field);
    }

    @Override // tb.g79
    public boolean B() {
        return true;
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        if (this.v == null) {
            this.v = jSONReader.f2453a.g(this.d);
        }
        h(t, this.v.o(jSONReader, this.d, this.b, 0L));
    }

    @Override // tb.ga9, tb.fa9, tb.g79
    public void h(T t, Object obj) {
        if (obj != null) {
            try {
                Collection collection = (Collection) this.h.get(t);
                if (collection != Collections.EMPTY_LIST && collection != Collections.EMPTY_SET && collection != null && !collection.equals(obj)) {
                    String name = collection.getClass().getName();
                    if (!"java.util.Collections$UnmodifiableRandomAccessList".equals(name) && !"java.util.Arrays$ArrayList".equals(name) && !"java.util.Collections$SingletonList".equals(name)) {
                        collection.addAll((Collection) obj);
                    }
                }
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        }
    }
}
