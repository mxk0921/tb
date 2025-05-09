package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import tb.k2a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class y0<T> extends FieldWriter<T> {
    final k2a<T, List> z;

    public y0(String str, int i, long j, String str2, String str3, Method method, k2a<T, List> k2aVar, Type type, Class cls) {
        super(str, i, j, str2, str3, type, cls, null, method);
        this.z = k2aVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        List apply = this.z.apply(t);
        if (apply == null) {
            jSONWriter.b2();
            return;
        }
        int i = 0;
        if (jSONWriter.d) {
            int size = apply.size();
            jSONWriter.d1(size);
            while (i < size) {
                String str = (String) apply.get(i);
                if (str == null) {
                    jSONWriter.b2();
                } else {
                    jSONWriter.k2(str);
                }
                i++;
            }
            return;
        }
        jSONWriter.c1();
        while (i < apply.size()) {
            if (i != 0) {
                jSONWriter.t1();
            }
            String str2 = (String) apply.get(i);
            if (str2 == null) {
                jSONWriter.b2();
            } else {
                jSONWriter.k2(str2);
            }
            i++;
        }
        jSONWriter.e();
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.z.apply(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        int i = 0;
        try {
            List apply = this.z.apply(t);
            long A = this.d | jSONWriter.A();
            if (apply == null) {
                if ((A & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) == 0) {
                    return false;
                }
                A(jSONWriter);
                jSONWriter.k1();
                return true;
            } else if ((A & JSONWriter.Feature.NotWriteEmptyArray.mask) != 0 && apply.isEmpty()) {
                return false;
            } else {
                A(jSONWriter);
                if (jSONWriter.d) {
                    int size = apply.size();
                    jSONWriter.d1(size);
                    while (i < size) {
                        String str = (String) apply.get(i);
                        if (str == null) {
                            jSONWriter.b2();
                        } else {
                            jSONWriter.k2(str);
                        }
                        i++;
                    }
                    return true;
                }
                jSONWriter.c1();
                while (i < apply.size()) {
                    if (i != 0) {
                        jSONWriter.t1();
                    }
                    String str2 = (String) apply.get(i);
                    if (str2 == null) {
                        jSONWriter.b2();
                    } else {
                        jSONWriter.k2(str2);
                    }
                    i++;
                }
                jSONWriter.e();
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
