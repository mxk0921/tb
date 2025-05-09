package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import tb.opf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class d0<T> extends a0<T> {
    public d0(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, Short.TYPE, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.a0, com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        jSONWriter.L1(T(t));
    }

    public short T(T t) {
        Throwable e;
        if (t != null) {
            try {
                long j = this.k;
                if (j != -1) {
                    return opf.UNSAFE.getShort(t, j);
                }
                return this.i.getShort(t);
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
        return Short.valueOf(T(t));
    }

    @Override // com.alibaba.fastjson2.writer.a0, com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        S(jSONWriter, T(t));
        return true;
    }
}
