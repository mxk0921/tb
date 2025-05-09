package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class d89<T> extends g79<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d89(java.lang.String r13, int r14, long r15, java.lang.String r17, java.lang.Character r18, java.lang.reflect.Field r19) {
        /*
            r12 = this;
            java.lang.Class r3 = java.lang.Character.TYPE
            r8 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            r2 = r3
            r4 = r14
            r5 = r15
            r7 = r17
            r9 = r18
            r11 = r19
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.d89.<init>(java.lang.String, int, long, java.lang.String, java.lang.Character, java.lang.reflect.Field):void");
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return Character.valueOf(jSONReader.c2());
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        char c2 = jSONReader.c2();
        if (c2 != 0 || !jSONReader.o3()) {
            b(t, c2);
        }
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
        try {
            this.h.set(t, Character.valueOf(c));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }
}
