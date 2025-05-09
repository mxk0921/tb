package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class xek extends xgk {
    public final k2a<int[], Object> b;
    public static final xek c = new xek(int[].class, null);
    public static final long HASH_TYPE = ls9.a("[I");

    public xek(Class cls, k2a<int[], Object> k2aVar) {
        super(cls);
        this.b = k2aVar;
    }

    @Override // tb.xgk, tb.jdk
    public Object i(Collection collection) {
        int i;
        int[] iArr = new int[collection.size()];
        int i2 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                i = 0;
            } else if (obj instanceof Number) {
                i = ((Number) obj).intValue();
            } else {
                k2a M = JSONFactory.defaultObjectReaderProvider.M(obj.getClass(), Integer.TYPE);
                if (M != null) {
                    i = ((Integer) M.apply(obj)).intValue();
                } else {
                    throw new JSONException("can not cast to int " + obj.getClass());
                }
            }
            iArr[i2] = i;
            i2++;
        }
        k2a<int[], Object> k2aVar = this.b;
        if (k2aVar != null) {
            return k2aVar.apply(iArr);
        }
        return iArr;
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.w) {
            return q(jSONReader, type, obj, j);
        }
        if (jSONReader.n2()) {
            return null;
        }
        if (jSONReader.v1()) {
            int[] iArr = new int[16];
            int i = 0;
            while (!jSONReader.u1()) {
                if (!jSONReader.e1()) {
                    int i2 = i + 1;
                    if (i2 - iArr.length > 0) {
                        int length = iArr.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        iArr = Arrays.copyOf(iArr, i3);
                    }
                    iArr[i] = jSONReader.p2();
                    i = i2;
                } else {
                    throw new JSONException(jSONReader.a1("input end"));
                }
            }
            jSONReader.w1();
            int[] copyOf = Arrays.copyOf(iArr, i);
            k2a<int[], Object> k2aVar = this.b;
            return k2aVar != null ? k2aVar.apply(copyOf) : copyOf;
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
            if (!(T2 == HASH_TYPE || T2 == wek.HASH_TYPE)) {
                throw new JSONException("not support autoType : " + jSONReader.U0());
            }
        }
        int c3 = jSONReader.c3();
        if (c3 == -1) {
            return null;
        }
        int[] iArr = new int[c3];
        for (int i = 0; i < c3; i++) {
            iArr[i] = jSONReader.p2();
        }
        k2a<int[], Object> k2aVar = this.b;
        return k2aVar != null ? k2aVar.apply(iArr) : iArr;
    }
}
