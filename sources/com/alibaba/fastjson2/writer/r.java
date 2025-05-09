package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import tb.opf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
class r<T> extends FieldWriter<T> {
    public r(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, Double.class, Double.class, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        Double d = (Double) a(t);
        if (d == null) {
            jSONWriter.c2();
            return;
        }
        double doubleValue = d.doubleValue();
        DecimalFormat decimalFormat = this.g;
        if (decimalFormat != null) {
            jSONWriter.A1(doubleValue, decimalFormat);
        } else {
            jSONWriter.writeDouble(doubleValue);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        Throwable e;
        if (obj != null) {
            try {
                if (this.k == -1 || this.c.isPrimitive()) {
                    return this.i.get(obj);
                }
                return opf.UNSAFE.getObject(obj, this.k);
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
    public boolean o(JSONWriter jSONWriter, T t) {
        Double d = (Double) a(t);
        if (d == null) {
            long C = jSONWriter.C(this.d);
            if ((JSONWriter.Feature.WriteNulls.mask & C) == 0 || (C & JSONWriter.Feature.NotWriteDefaultValue.mask) != 0) {
                return false;
            }
            A(jSONWriter);
            jSONWriter.c2();
            return true;
        }
        A(jSONWriter);
        double doubleValue = d.doubleValue();
        DecimalFormat decimalFormat = this.g;
        if (decimalFormat != null) {
            jSONWriter.A1(doubleValue, decimalFormat);
        } else {
            jSONWriter.writeDouble(doubleValue);
        }
        return true;
    }
}
