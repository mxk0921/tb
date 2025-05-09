package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class iek extends xgk {
    public static final iek b = new iek(null);
    public static final long c = ls9.a("[D");

    public iek(k2a<double[], Object> k2aVar) {
        super(double[].class);
    }

    @Override // tb.xgk, tb.jdk
    public Object i(Collection collection) {
        double d;
        double[] dArr = new double[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                d = vu3.b.GEO_NOT_SUPPORT;
            } else if (obj instanceof Number) {
                d = ((Number) obj).doubleValue();
            } else {
                k2a M = JSONFactory.defaultObjectReaderProvider.M(obj.getClass(), Double.TYPE);
                if (M != null) {
                    d = ((Double) M.apply(obj)).doubleValue();
                } else {
                    throw new JSONException("can not cast to double " + obj.getClass());
                }
            }
            dArr[i] = d;
            i++;
        }
        return dArr;
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.n2()) {
            return null;
        }
        if (jSONReader.v1()) {
            double[] dArr = new double[16];
            int i = 0;
            while (!jSONReader.u1()) {
                if (!jSONReader.e1()) {
                    int i2 = i + 1;
                    if (i2 - dArr.length > 0) {
                        int length = dArr.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        dArr = Arrays.copyOf(dArr, i3);
                    }
                    dArr[i] = jSONReader.f2();
                    i = i2;
                } else {
                    throw new JSONException(jSONReader.a1("input end"));
                }
            }
            jSONReader.w1();
            return Arrays.copyOf(dArr, i);
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
            double[] dArr = new double[c3];
            for (int i = 0; i < c3; i++) {
                dArr[i] = jSONReader.f2();
            }
            return dArr;
        }
        throw new JSONException("not support autoType : " + jSONReader.U0());
    }
}
