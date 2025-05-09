package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.text.DecimalFormat;
import tb.opf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class z<T> extends FieldWriter<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Field r18) {
        /*
            r11 = this;
            java.lang.Class r8 = java.lang.Float.TYPE
            r10 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r8
            r9 = r18
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.z.<init>(java.lang.String, int, long, java.lang.String, java.lang.String, java.lang.reflect.Field):void");
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        float S = S(t);
        DecimalFormat decimalFormat = this.g;
        if (decimalFormat != null) {
            jSONWriter.E1(S, decimalFormat);
        } else {
            jSONWriter.writeFloat(S);
        }
    }

    public float S(T t) {
        Throwable e;
        if (t != null) {
            try {
                long j = this.k;
                if (j != -1) {
                    return opf.UNSAFE.getFloat(t, j);
                }
                return this.i.getFloat(t);
            } catch (IllegalAccessException e2) {
                e = e2;
                throw new JSONException("field.get error, " + this.f2478a, e);
            } catch (IllegalArgumentException e3) {
                e = e3;
                throw new JSONException("field.get error, " + this.f2478a, e);
            }
        } else {
            throw new JSONException("field.get error, " + this.f2478a);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return Float.valueOf(S(t));
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        C(jSONWriter, S(t));
        return true;
    }
}
