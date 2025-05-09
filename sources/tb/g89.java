package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
class g89<T> extends fa9<T> {
    public g89(String str, Type type, Class cls, int i, long j, String str2, Method method, Field field) {
        super(str, type, cls, i, j, str2, null, null, method, field, null);
        Type type2;
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length > 0) {
                type2 = actualTypeArguments[0];
                this.s = type2;
            }
        }
        type2 = null;
        this.s = type2;
    }

    @Override // tb.g79
    public boolean B() {
        return true;
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        Object obj;
        if (this.v == null) {
            this.v = jSONReader.f2453a.g(this.d);
        }
        if (jSONReader.w) {
            obj = this.v.q(jSONReader, this.d, this.b, 0L);
        } else {
            obj = this.v.o(jSONReader, this.d, this.b, 0L);
        }
        h(t, obj);
    }

    @Override // tb.fa9, tb.g79
    public void h(T t, Object obj) {
        if (obj != null) {
            try {
                Collection collection = (Collection) this.g.invoke(t, new Object[0]);
                if (!(collection == Collections.EMPTY_LIST || collection == Collections.EMPTY_SET || collection == null || collection.equals(obj))) {
                    String name = collection.getClass().getName();
                    if (!("java.util.Collections$UnmodifiableRandomAccessList".equals(name) || "java.util.Arrays$ArrayList".equals(name) || "java.util.Collections$SingletonList".equals(name) || obj == collection)) {
                        for (Object obj2 : (Collection) obj) {
                            if (obj2 == null) {
                                collection.add(obj2);
                            } else {
                                if (obj2 instanceof Map) {
                                    Type type = this.s;
                                    if ((type instanceof Class) && !((Class) type).isAssignableFrom(obj2.getClass())) {
                                        if (this.u == null) {
                                            this.u = JSONFactory.defaultObjectReaderProvider.I(this.s);
                                        }
                                        obj2 = this.u.x((Map) obj2, 0L);
                                    }
                                }
                                collection.add(obj2);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        }
    }
}
