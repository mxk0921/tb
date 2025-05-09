package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class x99<T> extends g79<T> {
    final ick<T> v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x99(java.lang.String r13, int r14, java.lang.reflect.Method r15, tb.ick<T> r16) {
        /*
            r12 = this;
            java.lang.Class r3 = java.lang.Byte.TYPE
            r9 = 0
            r11 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r0 = r12
            r1 = r13
            r2 = r3
            r4 = r14
            r10 = r15
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.x99.<init>(java.lang.String, int, java.lang.reflect.Method, tb.ick):void");
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return Byte.valueOf((byte) jSONReader.p2());
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        jSONReader.p2();
        throw null;
    }

    @Override // tb.g79
    public void a(T t, byte b) {
        throw null;
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        TypeUtils.J(obj);
        throw null;
    }
}
