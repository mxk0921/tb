package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class k1<T> extends FieldWriter<T> {
    public k1(String str, int i, String str2, String str3, long j, Method method) {
        super(str, i, j, str2, str3, String.class, String.class, null, method);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        String str = (String) a(t);
        if (this.u && str != null) {
            str = str.trim();
        }
        if (this.t && jSONWriter.d) {
            jSONWriter.r2(str);
        } else if (this.v) {
            jSONWriter.f2(str);
        } else {
            jSONWriter.k2(str);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        try {
            return this.j.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new JSONException("invoke getter method error, " + this.f2478a, e);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        try {
            String str = (String) a(t);
            if (str == null && ((this.d | jSONWriter.A()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) == 0) {
                return false;
            }
            if (this.u && str != null) {
                str = str.trim();
            }
            P(jSONWriter, str);
            return true;
        } catch (JSONException e) {
            if ((jSONWriter.C(this.d) | JSONWriter.Feature.IgnoreNonFieldGetter.mask) != 0) {
                return false;
            }
            throw e;
        }
    }
}
