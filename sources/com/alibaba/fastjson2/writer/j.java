package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import tb.ajk;
import tb.iik;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
abstract class j extends FieldWriter {
    final byte[] A;
    final byte[] B;
    final byte[] C;
    final char[] D;
    final char[] E;
    final char[] F;
    final char[] G;
    final byte[] z;

    public j(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, type, cls, field, method);
        byte[] bArr = this.n;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length + 4);
        byte[] bArr2 = this.n;
        copyOf[bArr2.length] = 116;
        copyOf[bArr2.length + 1] = 114;
        copyOf[bArr2.length + 2] = 117;
        copyOf[bArr2.length + 3] = 101;
        this.z = copyOf;
        byte[] copyOf2 = Arrays.copyOf(bArr2, bArr2.length + 5);
        byte[] bArr3 = this.n;
        copyOf2[bArr3.length] = 102;
        copyOf2[bArr3.length + 1] = 97;
        copyOf2[bArr3.length + 2] = 108;
        copyOf2[bArr3.length + 3] = 115;
        copyOf2[bArr3.length + 4] = 101;
        this.A = copyOf2;
        byte[] copyOf3 = Arrays.copyOf(bArr3, bArr3.length + 1);
        byte[] bArr4 = this.n;
        copyOf3[bArr4.length] = 49;
        this.B = copyOf3;
        byte[] copyOf4 = Arrays.copyOf(bArr4, bArr4.length + 1);
        copyOf4[this.n.length] = 48;
        this.C = copyOf4;
        char[] cArr = this.o;
        char[] copyOf5 = Arrays.copyOf(cArr, cArr.length + 4);
        char[] cArr2 = this.o;
        copyOf5[cArr2.length] = 't';
        copyOf5[cArr2.length + 1] = 'r';
        copyOf5[cArr2.length + 2] = 'u';
        copyOf5[cArr2.length + 3] = 'e';
        this.D = copyOf5;
        char[] copyOf6 = Arrays.copyOf(cArr2, cArr2.length + 5);
        char[] cArr3 = this.o;
        copyOf6[cArr3.length] = 'f';
        copyOf6[cArr3.length + 1] = 'a';
        copyOf6[cArr3.length + 2] = 'l';
        copyOf6[cArr3.length + 3] = 's';
        copyOf6[cArr3.length + 4] = 'e';
        this.E = copyOf6;
        char[] copyOf7 = Arrays.copyOf(cArr3, cArr3.length + 1);
        char[] cArr4 = this.o;
        copyOf7[cArr4.length] = '1';
        this.F = copyOf7;
        char[] copyOf8 = Arrays.copyOf(cArr4, cArr4.length + 1);
        copyOf8[this.o.length] = '0';
        this.G = copyOf8;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, Object obj) {
        Boolean bool = (Boolean) a(obj);
        if (bool == null) {
            jSONWriter.b2();
        } else {
            jSONWriter.o1(bool.booleanValue());
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public iik g(JSONWriter jSONWriter, Class cls) {
        return ajk.f15776a;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, Object obj) {
        try {
            Boolean bool = (Boolean) a(obj);
            if (bool == null) {
                if (((this.d | jSONWriter.A()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullBooleanAsFalse.mask)) == 0) {
                    return false;
                }
                A(jSONWriter);
                jSONWriter.q1();
                return true;
            } else if (this.c == Boolean.TYPE && !bool.booleanValue() && (jSONWriter.C(this.d) & JSONWriter.Feature.NotWriteDefaultValue.mask) != 0) {
                return false;
            } else {
                q(jSONWriter, bool.booleanValue());
                return true;
            }
        } catch (RuntimeException e) {
            if (jSONWriter.u0()) {
                return false;
            }
            throw e;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void q(JSONWriter jSONWriter, boolean z) {
        char[] cArr;
        byte[] bArr;
        String str;
        long C = jSONWriter.C(this.d);
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & C) != 0) {
            A(jSONWriter);
            if (z) {
                str = "true";
            } else {
                str = "false";
            }
            jSONWriter.k2(str);
        } else if (jSONWriter.b) {
            if ((C & JSONWriter.Feature.WriteBooleanAsNumber.mask) != 0) {
                if (z) {
                    bArr = this.B;
                } else {
                    bArr = this.C;
                }
            } else if (z) {
                bArr = this.z;
            } else {
                bArr = this.A;
            }
            jSONWriter.Y1(bArr);
        } else if (jSONWriter.c) {
            if ((C & JSONWriter.Feature.WriteBooleanAsNumber.mask) != 0) {
                if (z) {
                    cArr = this.F;
                } else {
                    cArr = this.G;
                }
            } else if (z) {
                cArr = this.D;
            } else {
                cArr = this.E;
            }
            jSONWriter.a2(cArr);
        } else {
            A(jSONWriter);
            jSONWriter.o1(z);
        }
    }
}
