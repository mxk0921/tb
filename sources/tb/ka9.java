package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class ka9 extends fa9 {
    public ka9(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, Method method, Field field, z92 z92Var) {
        super(str, type, cls, i, j, str2, locale, obj, method, field, z92Var);
        this.v = rgk.b;
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, Object obj) {
        h(obj, jSONReader.R2());
    }

    @Override // tb.fa9, tb.g79
    public jdk y(JSONReader.c cVar) {
        return this.v;
    }

    @Override // tb.fa9, tb.g79
    public jdk z(JSONReader jSONReader) {
        return this.v;
    }
}
