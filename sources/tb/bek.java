package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class bek extends xgk {
    public static final bek b = new bek(null);
    public static final long c = ls9.a("[C");

    public bek(k2a<char[], Object> k2aVar) {
        super(char[].class);
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        char c2;
        if (jSONReader.n2()) {
            return null;
        }
        if (jSONReader.f0() == '\"') {
            return jSONReader.Q2().toCharArray();
        }
        if (jSONReader.v1()) {
            char[] cArr = new char[16];
            int i = 0;
            while (!jSONReader.u1()) {
                int i2 = i + 1;
                if (i2 - cArr.length > 0) {
                    int length = cArr.length;
                    int i3 = length + (length >> 1);
                    if (i3 - i2 < 0) {
                        i3 = i2;
                    }
                    cArr = Arrays.copyOf(cArr, i3);
                }
                if (jSONReader.h1()) {
                    cArr[i] = (char) jSONReader.p2();
                } else {
                    String Q2 = jSONReader.Q2();
                    if (Q2 == null) {
                        c2 = 0;
                    } else {
                        c2 = Q2.charAt(0);
                    }
                    cArr[i] = c2;
                }
                i = i2;
            }
            jSONReader.w1();
            return Arrays.copyOf(cArr, i);
        }
        throw new JSONException(jSONReader.a1("TODO"));
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.y1((byte) -110) && jSONReader.T2() != c) {
            throw new JSONException("not support autoType : " + jSONReader.U0());
        } else if (jSONReader.l1()) {
            return jSONReader.Q2().toCharArray();
        } else {
            int c3 = jSONReader.c3();
            if (c3 == -1) {
                return null;
            }
            char[] cArr = new char[c3];
            for (int i = 0; i < c3; i++) {
                if (jSONReader.h1()) {
                    cArr[i] = (char) jSONReader.p2();
                } else {
                    cArr[i] = jSONReader.Q2().charAt(0);
                }
            }
            return cArr;
        }
    }
}
