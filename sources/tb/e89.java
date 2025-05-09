package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class e89<T> extends g79<T> {
    final jck<T> v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e89(java.lang.String r13, int r14, java.lang.String r15, java.lang.Character r16, java.lang.reflect.Method r17, tb.jck<T> r18) {
        /*
            r12 = this;
            java.lang.Class r3 = java.lang.Character.TYPE
            r8 = 0
            r11 = 0
            r5 = 0
            r0 = r12
            r1 = r13
            r2 = r3
            r4 = r14
            r7 = r15
            r9 = r16
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.e89.<init>(java.lang.String, int, java.lang.String, java.lang.Character, java.lang.reflect.Method, tb.jck):void");
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        if (jSONReader.c2() != 0 || !jSONReader.o3()) {
            throw null;
        }
    }

    /* renamed from: O */
    public String K(JSONReader jSONReader) {
        return jSONReader.Q2();
    }

    @Override // tb.g79
    public void b(T t, char c) {
        throw null;
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        char c;
        if (obj instanceof String) {
            c = ((String) obj).charAt(0);
        } else if (obj instanceof Character) {
            c = ((Character) obj).charValue();
        } else {
            throw new JSONException("cast to char error");
        }
        b(t, c);
        throw null;
    }
}
