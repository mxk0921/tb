package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;
import tb.jik;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class r1<T> extends jik<T> {
    public final FieldWriter w;
    public final FieldWriter x;
    public final FieldWriter y;

    public r1(Class<T> cls, String str, String str2, long j, List<FieldWriter> list) {
        super(cls, str, str2, j, list);
        this.w = list.get(0);
        this.x = list.get(1);
        this.y = list.get(2);
    }

    @Override // tb.jik, tb.iik
    public final FieldWriter E(long j) {
        FieldWriter fieldWriter = this.w;
        if (j == fieldWriter.m) {
            return fieldWriter;
        }
        FieldWriter fieldWriter2 = this.x;
        if (j == fieldWriter2.m) {
            return fieldWriter2;
        }
        FieldWriter fieldWriter3 = this.y;
        if (j == fieldWriter3.m) {
            return fieldWriter3;
        }
        return null;
    }

    @Override // tb.jik, tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        boolean z;
        long j2 = this.p | j;
        long A = jSONWriter.A() | j2;
        if ((JSONWriter.Feature.BeanToArray.mask & A) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (jSONWriter.d) {
            if (z) {
                l(jSONWriter, obj, obj2, type, j);
            } else {
                e(jSONWriter, obj, obj2, type, j);
            }
        } else if (z) {
            C(jSONWriter, obj, obj2, type, j);
        } else {
            if (!this.t) {
                if ((JSONWriter.Feature.ErrorOnNoneSerializable.mask & A) != 0) {
                    a();
                    throw null;
                } else if ((A & JSONWriter.Feature.IgnoreNoneSerializable.mask) != 0) {
                    jSONWriter.b2();
                    return;
                }
            }
            if (n(jSONWriter)) {
                B(jSONWriter, obj, obj2, type, 0L);
                return;
            }
            jSONWriter.e1();
            if ((j2 & JSONWriter.Feature.WriteClassName.mask) != 0 || jSONWriter.N0(obj, j)) {
                q(jSONWriter);
            }
            this.w.o(jSONWriter, obj);
            this.x.o(jSONWriter, obj);
            this.y.o(jSONWriter, obj);
            jSONWriter.g();
        }
    }
}
