package tb;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class sx8<T> implements k2a<Map<Long, Object>, T> {

    /* renamed from: a  reason: collision with root package name */
    public final Method f28335a;
    public final long[] b;

    public sx8(Method method, String... strArr) {
        String str;
        this.f28335a = method;
        Class<?>[] parameterTypes = method.getParameterTypes();
        String[] strArr2 = new String[parameterTypes.length];
        this.b = new long[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i < strArr.length) {
                str = strArr[i];
            } else {
                str = null;
            }
            if (str == null) {
                str = "arg" + i;
            }
            strArr[i] = str;
            this.b[i] = ls9.a(str);
        }
    }

    /* renamed from: a */
    public T apply(Map<Long, Object> map) {
        long[] jArr = this.b;
        int length = jArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            objArr[i] = map.get(Long.valueOf(jArr[i]));
        }
        try {
            return (T) this.f28335a.invoke(null, objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new JSONException("invoke factoryMethod error", e);
        }
    }
}
