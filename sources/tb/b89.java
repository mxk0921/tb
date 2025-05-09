package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class b89<T> extends g79<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b89(java.lang.String r13, int r14, long r15, java.lang.String r17, java.lang.Boolean r18, java.lang.reflect.Field r19) {
        /*
            r12 = this;
            java.lang.Class r3 = java.lang.Boolean.TYPE
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
        throw new UnsupportedOperationException("Method not decompiled: tb.b89.<init>(java.lang.String, int, long, java.lang.String, java.lang.Boolean, java.lang.reflect.Field):void");
    }

    @Override // tb.g79
    public Object K(JSONReader jSONReader) {
        return Boolean.valueOf(jSONReader.a2());
    }

    @Override // tb.g79
    public void L(JSONReader jSONReader, T t) {
        try {
            this.h.setBoolean(t, jSONReader.a2());
        } catch (Exception e) {
            throw new JSONException(jSONReader.a1("set " + this.b + " error"), e);
        }
    }

    @Override // tb.g79
    public void f(T t, int i) {
        j(t, TypeUtils.H(Integer.valueOf(i)));
    }

    @Override // tb.g79
    public void j(T t, boolean z) {
        long j = this.i;
        if (j != -1) {
            opf.UNSAFE.putBoolean(t, j, z);
            return;
        }
        try {
            this.h.setBoolean(t, z);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // tb.g79
    public void h(T t, Object obj) {
        if (obj == null) {
            if ((this.e & JSONReader.Feature.IgnoreSetNullValue.mask) == 0) {
                j(t, false);
            }
        } else if (obj instanceof Boolean) {
            j(t, ((Boolean) obj).booleanValue());
        } else {
            throw new JSONException("set " + this.b + " error, type not support " + obj.getClass());
        }
    }
}
