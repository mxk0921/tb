package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class la9<T> extends g79<T> {
    final boolean v;
    final long w;

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        String Q2 = jSONReader.Q2();
        if (this.v && Q2 != null) {
            Q2 = Q2.trim();
        }
        opf.UNSAFE.putObject(t, this.w, Q2);
    }

    @Override // tb.g79
    public void M(JSONReader jSONReader, T t) {
        String Q2 = jSONReader.Q2();
        if (this.v && Q2 != null) {
            Q2 = Q2.trim();
        }
        h(t, Q2);
    }

    @Override // tb.g79
    public boolean N(Class cls) {
        return true;
    }

    /* renamed from: O */
    public String K(JSONReader jSONReader) {
        String Q2 = jSONReader.Q2();
        if (!this.v || Q2 == null) {
            return Q2;
        }
        return Q2.trim();
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        String str;
        if (obj == null || (obj instanceof String)) {
            str = (String) obj;
        } else {
            str = obj.toString();
        }
        if (this.v && str != null) {
            str = str.trim();
        }
        opf.UNSAFE.putObject(t, this.w, str);
    }

    public la9(String str, Class cls, int i, long j, String str2, String str3, Field field) {
        super(str, cls, cls, i, j, str2, null, str3, null, field);
        this.v = "trim".equals(str2) || (j & JSONReader.Feature.TrimString.mask) != 0;
        this.w = opf.UNSAFE.objectFieldOffset(field);
    }
}
