package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import tb.opf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class n0<T> extends k0<T> {
    public n0(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, Long.TYPE, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.k0, com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        jSONWriter.O1(S(t));
    }

    public long S(T t) {
        Throwable e;
        if (t != null) {
            try {
                long j = this.k;
                if (j != -1) {
                    return opf.UNSAFE.getLong(t, j);
                }
                return this.i.getLong(t);
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
        return Long.valueOf(S(t));
    }

    @Override // com.alibaba.fastjson2.writer.k0, com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        long S = S(t);
        if (S == 0 && jSONWriter.n0(JSONWriter.Feature.NotWriteDefaultValue)) {
            return false;
        }
        M(jSONWriter, S);
        return true;
    }
}
