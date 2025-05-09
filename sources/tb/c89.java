package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class c89<T> extends fa9<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c89(java.lang.String r14, int r15, long r16, java.lang.String r18, java.lang.Boolean r19, java.lang.reflect.Method r20) {
        /*
            r13 = this;
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r11 = 0
            r12 = 0
            r8 = 0
            r0 = r13
            r1 = r14
            r2 = r3
            r4 = r15
            r5 = r16
            r7 = r18
            r9 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.c89.<init>(java.lang.String, int, long, java.lang.String, java.lang.Boolean, java.lang.reflect.Method):void");
    }

    @Override // tb.fa9, tb.g79
    public Object K(JSONReader jSONReader) {
        return jSONReader.Z1();
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        try {
            this.g.invoke(t, Boolean.valueOf(jSONReader.a2()));
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.fa9, tb.g79
    public void M(JSONReader jSONReader, T t) {
        try {
            this.g.invoke(t, Boolean.valueOf(jSONReader.a2()));
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.fa9, tb.g79
    public void h(T t, Object obj) {
        try {
            this.g.invoke(t, Boolean.valueOf(TypeUtils.H(obj)));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }
}
