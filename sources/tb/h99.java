package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
class h99<T> extends g79<T> {
    final long v;

    public h99(String str, Class cls, int i, String str2, Integer num, Field field) {
        super(str, cls, cls, i, 0L, str2, null, num, null, field);
        this.v = opf.UNSAFE.objectFieldOffset(field);
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return Integer.valueOf(jSONReader.p2());
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        opf.UNSAFE.putInt(t, this.v, jSONReader.p2());
    }

    @Override // tb.g79
    public void M(JSONReader jSONReader, T t) {
        f(t, jSONReader.p2());
    }

    @Override // tb.g79
    public void d(T t, double d) {
        h(t, Integer.valueOf((int) d));
    }

    @Override // tb.g79
    public void e(T t, float f) {
        h(t, Integer.valueOf((int) f));
    }

    @Override // tb.g79
    public void g(T t, long j) {
        opf.UNSAFE.putInt(t, this.v, (int) j);
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        opf.UNSAFE.putInt(t, this.v, TypeUtils.Q(obj));
    }
}
