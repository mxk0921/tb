package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wek extends xgk {
    public static final wek b = new wek();
    public static final long HASH_TYPE = ls9.a("[Integer");

    public wek() {
        super(Integer[].class);
    }

    @Override // tb.xgk, tb.jdk
    public Object i(Collection collection) {
        Integer num;
        Integer[] numArr = new Integer[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                num = null;
            } else if (obj instanceof Number) {
                num = Integer.valueOf(((Number) obj).intValue());
            } else {
                k2a M = JSONFactory.defaultObjectReaderProvider.M(obj.getClass(), Integer.class);
                if (M != null) {
                    num = (Integer) M.apply(obj);
                } else {
                    throw new JSONException("can not cast to Integer " + obj.getClass());
                }
            }
            numArr[i] = num;
            i++;
        }
        return numArr;
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.n2()) {
            return null;
        }
        if (jSONReader.v1()) {
            Integer[] numArr = new Integer[16];
            int i = 0;
            while (!jSONReader.u1()) {
                if (!jSONReader.e1()) {
                    int i2 = i + 1;
                    if (i2 - numArr.length > 0) {
                        int length = numArr.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        numArr = (Integer[]) Arrays.copyOf(numArr, i3);
                    }
                    numArr[i] = jSONReader.o2();
                    i = i2;
                } else {
                    throw new JSONException(jSONReader.a1("input end"));
                }
            }
            jSONReader.w1();
            return Arrays.copyOf(numArr, i);
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
            if (!(T2 == HASH_TYPE || T2 == xek.HASH_TYPE)) {
                throw new JSONException(jSONReader.a1("not support type " + jSONReader.U0()));
            }
        }
        int c3 = jSONReader.c3();
        if (c3 == -1) {
            return null;
        }
        Integer[] numArr = new Integer[c3];
        for (int i = 0; i < c3; i++) {
            numArr[i] = jSONReader.o2();
        }
        return numArr;
    }
}
