package tb;

import com.alibaba.fastjson2.JSONReader;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class v99<T> extends ia9<T> {
    public v99(String str, Class cls, String str2, int i, long j, String str3, Locale locale, Object obj) {
        super(str, cls, cls, str2, i, j, str3, locale, obj);
    }

    @Override // tb.fa9, tb.g79
    public Object K(JSONReader jSONReader) {
        Integer o2 = jSONReader.o2();
        if (o2 == null) {
            return null;
        }
        return Byte.valueOf(o2.byteValue());
    }
}
