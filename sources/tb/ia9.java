package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
class ia9<T> extends fa9<T> {
    final String x;
    final long y;

    public ia9(String str, Type type, Class cls, String str2, int i, long j, String str3, Locale locale, Object obj) {
        super(str, type, cls, i, j, str3, locale, obj, null, null, null);
        this.x = str2;
        this.y = ls9.a(str2);
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        throw new JSONException("UnsupportedOperationException");
    }

    @Override // tb.fa9, tb.g79
    public void h(T t, Object obj) {
    }
}
