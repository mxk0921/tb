package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class o99<T> extends ga9<T> {
    public o99(String str, Class cls, int i, long j, String str2, long[] jArr, Field field) {
        super(str, cls, cls, i, j, str2, jArr, field);
    }

    @Override // tb.g79
    public boolean B() {
        return true;
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        if (!jSONReader.n2()) {
            try {
                long[] jArr = (long[]) this.h.get(t);
                if (jSONReader.v1()) {
                    int i = 0;
                    while (!jSONReader.u1()) {
                        long r2 = jSONReader.r2();
                        if (jArr != null && i < jArr.length) {
                            jArr[i] = r2;
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
            }
        }
    }
}
