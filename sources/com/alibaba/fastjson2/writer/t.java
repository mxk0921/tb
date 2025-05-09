package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.text.DecimalFormat;
import tb.opf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class t<T> extends FieldWriter<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t(java.lang.String r12, int r13, java.lang.String r14, java.lang.String r15, java.lang.reflect.Field r16) {
        /*
            r11 = this;
            java.lang.Class r8 = java.lang.Double.TYPE
            r10 = 0
            r3 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r5 = r14
            r6 = r15
            r7 = r8
            r9 = r16
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.t.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.reflect.Field):void");
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        double S = S(t);
        DecimalFormat decimalFormat = this.g;
        if (decimalFormat != null) {
            jSONWriter.A1(S, decimalFormat);
        } else {
            jSONWriter.writeDouble(S);
        }
    }

    public double S(Object obj) {
        Throwable e;
        if (obj != null) {
            try {
                long j = this.k;
                if (j != -1) {
                    return opf.UNSAFE.getDouble(obj, j);
                }
                return this.i.getDouble(obj);
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
    public Object a(Object obj) {
        return Double.valueOf(S(obj));
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        v(jSONWriter, S(t));
        return true;
    }
}
