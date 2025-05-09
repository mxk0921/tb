package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uek extends xgk {
    public static final uek b = new uek();
    public static final long c = ls9.a("[Short");

    public uek() {
        super(Short[].class);
    }

    @Override // tb.xgk, tb.jdk
    public Object i(Collection collection) {
        Short sh;
        Short[] shArr = new Short[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                sh = null;
            } else if (obj instanceof Number) {
                sh = Short.valueOf(((Number) obj).shortValue());
            } else {
                k2a M = JSONFactory.defaultObjectReaderProvider.M(obj.getClass(), Short.class);
                if (M != null) {
                    sh = (Short) M.apply(obj);
                } else {
                    throw new JSONException("can not cast to Short " + obj.getClass());
                }
            }
            shArr[i] = sh;
            i++;
        }
        return shArr;
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.n2()) {
            return null;
        }
        if (jSONReader.v1()) {
            Short[] shArr = new Short[16];
            int i = 0;
            while (!jSONReader.u1()) {
                if (!jSONReader.e1()) {
                    int i2 = i + 1;
                    if (i2 - shArr.length > 0) {
                        int length = shArr.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        shArr = (Short[]) Arrays.copyOf(shArr, i3);
                    }
                    Integer o2 = jSONReader.o2();
                    shArr[i] = Short.valueOf(o2 == null ? (short) 0 : o2.shortValue());
                    i = i2;
                } else {
                    throw new JSONException(jSONReader.a1("input end"));
                }
            }
            jSONReader.w1();
            return Arrays.copyOf(shArr, i);
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
            if (!(T2 == c || T2 == vek.c)) {
                throw new JSONException(jSONReader.a1("not support type " + jSONReader.U0()));
            }
        }
        int c3 = jSONReader.c3();
        if (c3 == -1) {
            return null;
        }
        Short[] shArr = new Short[c3];
        for (int i = 0; i < c3; i++) {
            Integer o2 = jSONReader.o2();
            shArr[i] = o2 == null ? null : Short.valueOf(o2.shortValue());
        }
        return shArr;
    }
}
