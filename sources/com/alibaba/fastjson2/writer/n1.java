package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;
import tb.jik;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class n1<T> extends jik<T> {
    public final FieldWriter A;
    public final FieldWriter B;
    public final FieldWriter C;
    public final FieldWriter D;
    public final FieldWriter E;
    public final FieldWriter F;
    public final FieldWriter G;
    public final FieldWriter w;
    public final FieldWriter x;
    public final FieldWriter y;
    public final FieldWriter z;

    public n1(Class<T> cls, String str, String str2, long j, List<FieldWriter> list) {
        super(cls, str, str2, j, list);
        this.w = list.get(0);
        this.x = list.get(1);
        this.y = list.get(2);
        this.z = list.get(3);
        this.A = list.get(4);
        this.B = list.get(5);
        this.C = list.get(6);
        this.D = list.get(7);
        this.E = list.get(8);
        this.F = list.get(9);
        this.G = list.get(10);
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
        FieldWriter fieldWriter4 = this.z;
        if (j == fieldWriter4.m) {
            return fieldWriter4;
        }
        FieldWriter fieldWriter5 = this.A;
        if (j == fieldWriter5.m) {
            return fieldWriter5;
        }
        FieldWriter fieldWriter6 = this.B;
        if (j == fieldWriter6.m) {
            return fieldWriter6;
        }
        FieldWriter fieldWriter7 = this.C;
        if (j == fieldWriter7.m) {
            return fieldWriter7;
        }
        FieldWriter fieldWriter8 = this.D;
        if (j == fieldWriter8.m) {
            return fieldWriter8;
        }
        FieldWriter fieldWriter9 = this.E;
        if (j == fieldWriter9.m) {
            return fieldWriter9;
        }
        FieldWriter fieldWriter10 = this.F;
        if (j == fieldWriter10.m) {
            return fieldWriter10;
        }
        FieldWriter fieldWriter11 = this.G;
        if (j == fieldWriter11.m) {
            return fieldWriter11;
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
            C(jSONWriter, obj, obj2, type, j2);
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
            this.z.o(jSONWriter, obj);
            this.A.o(jSONWriter, obj);
            this.B.o(jSONWriter, obj);
            this.C.o(jSONWriter, obj);
            this.D.o(jSONWriter, obj);
            this.E.o(jSONWriter, obj);
            this.F.o(jSONWriter, obj);
            this.G.o(jSONWriter, obj);
            jSONWriter.g();
        }
    }
}
