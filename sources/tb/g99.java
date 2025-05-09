package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class g99<T> extends ga9<T> {
    public g99(String str, Class cls, int i, long j, String str2, int[] iArr, Field field) {
        super(str, cls, cls, i, j, str2, iArr, field);
    }

    @Override // tb.g79
    public boolean B() {
        return true;
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        if (!jSONReader.n2()) {
            try {
                int[] iArr = (int[]) this.h.get(t);
                if (jSONReader.v1()) {
                    int i = 0;
                    while (!jSONReader.u1()) {
                        int p2 = jSONReader.p2();
                        if (iArr != null && i < iArr.length) {
                            iArr[i] = p2;
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
