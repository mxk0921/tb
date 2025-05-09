package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class nek extends xgk {
    public static final nek b = new nek();
    public static final long c = ls9.a("[Float");

    public nek() {
        super(Float[].class);
    }

    @Override // tb.xgk, tb.jdk
    public Object i(Collection collection) {
        Float f;
        Float[] fArr = new Float[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                f = null;
            } else if (obj instanceof Number) {
                f = Float.valueOf(((Number) obj).floatValue());
            } else {
                k2a M = JSONFactory.defaultObjectReaderProvider.M(obj.getClass(), Float.class);
                if (M != null) {
                    f = (Float) M.apply(obj);
                } else {
                    throw new JSONException("can not cast to Float " + obj.getClass());
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
            Float[] fArr = new Float[16];
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
                        fArr = (Float[]) Arrays.copyOf(fArr, i3);
                    }
                    fArr[i] = jSONReader.k2();
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
            Float[] fArr = new Float[c3];
            for (int i = 0; i < c3; i++) {
                fArr[i] = jSONReader.k2();
            }
            return fArr;
        }
        throw new JSONException("not support autoType : " + jSONReader.U0());
    }
}
