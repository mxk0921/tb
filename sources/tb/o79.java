package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class o79<T> extends g79<T> {
    final Type v;

    public o79(String str, Type type, Class cls, int i, long j, String str2, Method method, Field field) {
        super(str, type, cls, i, j, str2, null, null, method, field);
        Type type2;
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                type2 = actualTypeArguments[0];
                this.v = type2;
            }
        }
        type2 = null;
        this.v = type2;
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.P1(this.v);
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        if (!jSONReader.C1()) {
            h(t, jSONReader.P1(this.v));
        }
    }
}
