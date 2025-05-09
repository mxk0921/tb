package tb;

import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class ha9<T, V> extends fa9<T> {
    public ha9(String str, Type type, Class<V> cls, int i, long j, String str2, Locale locale, Object obj, Method method, z92<T, V> z92Var, jdk jdkVar) {
        super(str, type, cls, i, j, str2, locale, obj, method, null, z92Var);
        this.v = jdkVar;
    }

    @Override // tb.fa9, tb.g79
    public void h(T t, Object obj) {
        Type type = this.d;
        if (type == Float.class) {
            obj = TypeUtils.N(obj);
        } else if (type == Double.class) {
            obj = TypeUtils.L(obj);
        }
        if (obj != null || this.c != StackTraceElement[].class) {
            ((pdk) this.w).a(t, obj);
        }
    }
}
