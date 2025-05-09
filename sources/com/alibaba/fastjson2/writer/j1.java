package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import tb.f79;
import tb.k2a;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class j1<T> extends FieldWriter<T> {
    final boolean A;
    final boolean B;
    final boolean C;
    final k2a<T, String> z;

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        String apply = this.z.apply(t);
        if (this.B && apply != null) {
            apply = apply.trim();
        }
        if (this.A && jSONWriter.d) {
            jSONWriter.r2(apply);
        } else if (this.C) {
            jSONWriter.f2(apply);
        } else {
            jSONWriter.k2(apply);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.z.apply(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        try {
            String apply = this.z.apply(t);
            if (apply == null && ((this.d | jSONWriter.A()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) == 0) {
                return false;
            }
            A(jSONWriter);
            if (apply != null || (this.d & (JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) == 0) {
                if (this.B && apply != null) {
                    apply = apply.trim();
                }
                if (this.A && jSONWriter.d) {
                    jSONWriter.r2(apply);
                } else if (this.C) {
                    jSONWriter.f2(apply);
                } else {
                    jSONWriter.k2(apply);
                }
                return true;
            }
            jSONWriter.k2("");
            return true;
        } catch (RuntimeException e) {
            if ((jSONWriter.C(this.d) | JSONWriter.Feature.IgnoreNonFieldGetter.mask) != 0) {
                return false;
            }
            throw e;
        }
    }

    public j1(String str, int i, long j, String str2, String str3, Method method, k2a<T, String> k2aVar) {
        super(str, i, j, str2, str3, String.class, String.class, null, method);
        this.z = k2aVar;
        this.A = pg1.ATOM_symbol.equals(str2);
        this.B = "trim".equals(str2);
        this.C = (j & f79.RAW_VALUE_MASK) != 0;
    }
}
