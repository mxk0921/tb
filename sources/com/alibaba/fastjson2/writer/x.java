package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import tb.opf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
class x<T> extends FieldWriter<T> {
    public x(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, Float.class, Float.class, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        Float f = (Float) a(t);
        if (f == null) {
            jSONWriter.c2();
            return;
        }
        float floatValue = f.floatValue();
        DecimalFormat decimalFormat = this.g;
        if (decimalFormat != null) {
            jSONWriter.E1(floatValue, decimalFormat);
        } else {
            jSONWriter.writeFloat(floatValue);
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
        Float f = (Float) a(t);
        if (f == null) {
            long C = jSONWriter.C(this.d);
            if ((JSONWriter.Feature.WriteNulls.mask & C) == 0 || (C & JSONWriter.Feature.NotWriteDefaultValue.mask) != 0) {
                return false;
            }
            A(jSONWriter);
            jSONWriter.c2();
            return true;
        }
        A(jSONWriter);
        float floatValue = f.floatValue();
        DecimalFormat decimalFormat = this.g;
        if (decimalFormat != null) {
            jSONWriter.E1(floatValue, decimalFormat);
        } else {
            jSONWriter.writeFloat(floatValue);
        }
        return true;
    }
}
