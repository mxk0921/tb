package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class oek extends xgk {
    public static final oek b = new oek(null);
    public static final long c = ls9.a("[F");

    public oek(k2a<float[], Object> k2aVar) {
        super(float[].class);
    }

    @Override // tb.xgk, tb.jdk
    public Object i(Collection collection) {
        float f;
        float[] fArr = new float[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                f = 0.0f;
            } else if (obj instanceof Number) {
                f = ((Number) obj).floatValue();
            } else {
                k2a M = JSONFactory.defaultObjectReaderProvider.M(obj.getClass(), Float.TYPE);
                if (M != null) {
                    f = ((Float) M.apply(obj)).floatValue();
                } else {
                    throw new JSONException("can not cast to float " + obj.getClass());
                }
            }
            fArr[i] = f;
            i++;
        }
        return fArr;
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.n2()) {
            return null;
        }
        if (jSONReader.v1()) {
            float[] fArr = new float[16];
            int i = 0;
            while (!jSONReader.u1()) {
                if (!jSONReader.e1()) {
                    int i2 = i + 1;
                    if (i2 - fArr.length > 0) {
                        int length = fArr.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        fArr = Arrays.copyOf(fArr, i3);
                    }
                    fArr[i] = jSONReader.l2();
                    i = i2;
                } else {
                    throw new JSONException(jSONReader.a1("input end"));
                }
            }
            jSONReader.w1();
            return Arrays.copyOf(fArr, i);
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
        if (!jSONReader.y1((byte) -110) || jSONReader.T2() == c) {
            int c3 = jSONReader.c3();
            if (c3 == -1) {
                return null;
            }
            float[] fArr = new float[c3];
            for (int i = 0; i < c3; i++) {
                fArr[i] = jSONReader.l2();
            }
            return fArr;
        }
        throw new JSONException("not support autoType : " + jSONReader.U0());
    }
}
