package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class a99<T> extends g79<T> {
    final pck<T> v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a99(java.lang.String r13, int r14, long r15, java.lang.String r17, java.util.Locale r18, java.lang.Short r19, java.lang.reflect.Method r20, tb.pck<T> r21) {
        /*
            r12 = this;
            java.lang.Class r3 = java.lang.Short.TYPE
            r11 = 0
            r0 = r12
            r1 = r13
            r2 = r3
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.a99.<init>(java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.Short, java.lang.reflect.Method, tb.pck):void");
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return Short.valueOf((short) jSONReader.p2());
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        jSONReader.p2();
        throw null;
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        TypeUtils.V(obj);
        throw null;
    }

    @Override // tb.g79
    public void i(T t, short s) {
        throw null;
    }
}
