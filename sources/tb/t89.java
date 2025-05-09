package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class t89<T> extends g79<T> {
    final lck<T> v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t89(java.lang.String r13, int r14, java.lang.Float r15, java.lang.reflect.Method r16, tb.lck<T> r17) {
        /*
            r12 = this;
            java.lang.Class r3 = java.lang.Float.TYPE
            r8 = 0
            r11 = 0
            r5 = 0
            r7 = 0
            r0 = r12
            r1 = r13
            r2 = r3
            r4 = r14
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.t89.<init>(java.lang.String, int, java.lang.Float, java.lang.reflect.Method, tb.lck):void");
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return Float.valueOf(jSONReader.l2());
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        jSONReader.l2();
        throw null;
    }

    @Override // tb.g79
    public void e(T t, float f) {
        throw null;
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        TypeUtils.O(obj);
        throw null;
    }
}
