package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
abstract class k0<T> extends FieldWriter<T> {
    final boolean z;

    public k0(String str, int i, long j, String str2, String str3, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, cls, cls, field, method);
        boolean z;
        if ((JSONWriter.Feature.BrowserCompatible.mask & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.z = z;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void M(JSONWriter jSONWriter, long j) {
        boolean z;
        boolean z2 = false;
        if (((jSONWriter.A() | this.d) & (JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask)) != 0) {
            z = true;
        } else {
            z = false;
        }
        A(jSONWriter);
        if (!z) {
            if (this.z && !jSONWriter.d && (j > 9007199254740991L || j < -9007199254740991L)) {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            jSONWriter.k2(Long.toString(j));
        } else {
            jSONWriter.O1(j);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        Long l = (Long) a(t);
        if (l == null) {
            jSONWriter.b2();
        } else {
            jSONWriter.O1(l.longValue());
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        try {
            Long l = (Long) a(t);
            if (l != null) {
                M(jSONWriter, l.longValue());
                return true;
            } else if (((this.d | jSONWriter.A()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullNumberAsZero.mask)) == 0) {
                return false;
            } else {
                A(jSONWriter);
                jSONWriter.Q1();
                return true;
            }
        } catch (RuntimeException e) {
            if (jSONWriter.u0()) {
                return false;
            }
            throw e;
        }
    }
}
