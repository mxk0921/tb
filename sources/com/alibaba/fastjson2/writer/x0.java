package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class x0<T> extends u0<T> {
    public x0(String str, Type type, int i, long j, String str2, String str3, Method method, Type type2, Class cls) {
        super(str, type, i, j, str2, str3, type2, cls, null, method);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        List list = (List) a(t);
        if (list == null) {
            jSONWriter.b2();
        } else {
            N(jSONWriter, false, list);
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
            List<String> list = (List) a(t);
            long A = this.d | jSONWriter.A();
            if (list == null) {
                if ((A & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) == 0) {
                    return false;
                }
                A(jSONWriter);
                jSONWriter.k1();
                return true;
            } else if ((JSONWriter.Feature.NotWriteEmptyArray.mask & A) != 0 && list.isEmpty()) {
                return false;
            } else {
                String Z0 = jSONWriter.Z0(this, list);
                if (Z0 != null) {
                    A(jSONWriter);
                    jSONWriter.i2(Z0);
                    jSONWriter.X0(list);
                    return true;
                }
                if (this.z == String.class) {
                    O(jSONWriter, true, list);
                } else {
                    N(jSONWriter, true, list);
                }
                if ((A & JSONWriter.Feature.ReferenceDetection.mask) != 0) {
                    jSONWriter.X0(list);
                }
                return true;
            }
        } catch (JSONException e) {
            if (jSONWriter.u0()) {
                return false;
            }
            throw e;
        }
    }
}
