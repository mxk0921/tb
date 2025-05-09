package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vek extends xgk {
    public static final vek b = new vek(null);
    public static final long c = ls9.a("[S");

    public vek(k2a<short[], Object> k2aVar) {
        super(short[].class);
    }

    @Override // tb.xgk, tb.jdk
    public Object i(Collection collection) {
        short s;
        short[] sArr = new short[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                s = 0;
            } else if (obj instanceof Number) {
                s = ((Number) obj).shortValue();
            } else {
                k2a M = JSONFactory.defaultObjectReaderProvider.M(obj.getClass(), Short.TYPE);
                if (M != null) {
                    s = ((Short) M.apply(obj)).shortValue();
                } else {
                    throw new JSONException("can not cast to short " + obj.getClass());
                }
            }
            sArr[i] = s;
            i++;
        }
        return sArr;
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.n2()) {
            return null;
        }
        if (jSONReader.v1()) {
            short[] sArr = new short[16];
            int i = 0;
            while (!jSONReader.u1()) {
                if (!jSONReader.e1()) {
                    int i2 = i + 1;
                    if (i2 - sArr.length > 0) {
                        int length = sArr.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        sArr = Arrays.copyOf(sArr, i3);
                    }
                    sArr[i] = (short) jSONReader.p2();
                    i = i2;
                } else {
                    throw new JSONException(jSONReader.a1("input end"));
                }
            }
            jSONReader.w1();
            return Arrays.copyOf(sArr, i);
        } else if (jSONReader.l1()) {
            String Q2 = jSONReader.Q2();
            if (Q2.isEmpty()) {
                return null;
            }
            throw new JSONException(jSONReader.a1("not support input ".concat(Q2)));
        } else {
            throw new JSONException(jSONReader.a1("TODO"));
        }
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.y1((byte) -110)) {
            long T2 = jSONReader.T2();
            if (!(T2 == c || T2 == uek.c)) {
                throw new JSONException("not support autoType : " + jSONReader.U0());
            }
        }
        int c3 = jSONReader.c3();
        if (c3 == -1) {
            return null;
        }
        short[] sArr = new short[c3];
        for (int i = 0; i < c3; i++) {
            sArr[i] = (short) jSONReader.p2();
        }
        return sArr;
    }
}
