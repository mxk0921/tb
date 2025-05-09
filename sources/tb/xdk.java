package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xdk extends xgk {
    public static final xdk b = new xdk();
    public static final long c = ls9.a("[Z");

    public xdk() {
        super(boolean[].class);
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.n2()) {
            return null;
        }
        if (jSONReader.v1()) {
            boolean[] zArr = new boolean[16];
            int i = 0;
            while (!jSONReader.u1()) {
                int i2 = i + 1;
                if (i2 - zArr.length > 0) {
                    int length = zArr.length;
                    int i3 = length + (length >> 1);
                    if (i3 - i2 < 0) {
                        i3 = i2;
                    }
                    zArr = Arrays.copyOf(zArr, i3);
                }
                zArr[i] = jSONReader.a2();
                i = i2;
            }
            jSONReader.w1();
            return Arrays.copyOf(zArr, i);
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
            boolean[] zArr = new boolean[c3];
            for (int i = 0; i < c3; i++) {
                zArr[i] = jSONReader.a2();
            }
            return zArr;
        }
        throw new JSONException("not support autoType : " + jSONReader.U0());
    }
}
