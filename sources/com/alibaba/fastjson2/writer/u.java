package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import tb.b2d;
import tb.ls9;
import tb.w1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
class u extends FieldWriter {
    final char[][] A;
    final byte[][] B;
    final char[][] C;
    final Class D;
    final Enum[] E;
    final long[] F;
    final long[] G;
    final byte[][] z;

    public u(String str, int i, long j, String str2, String str3, Type type, Class<? extends Enum> cls, Field field, Method method) {
        super(str, i, j, str2, str3, type, cls, field, method);
        this.D = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.E = enumArr;
        this.F = new long[enumArr.length];
        this.G = new long[enumArr.length];
        int i2 = 0;
        while (true) {
            Enum[] enumArr2 = this.E;
            if (i2 < enumArr2.length) {
                this.F[i2] = ls9.a(enumArr2[i2].name());
                i2++;
            } else {
                this.z = new byte[enumArr2.length];
                this.A = new char[enumArr2.length];
                this.B = new byte[enumArr2.length];
                this.C = new char[enumArr2.length];
                return;
            }
        }
    }

    private byte[] S(int i) {
        int k = b2d.k(i);
        byte[] bArr = this.n;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length + k);
        byte[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        b2d.l(copyOf2, this.n.length, i);
        return copyOf2;
    }

    private char[] T(int i) {
        int k = b2d.k(i);
        char[] cArr = this.o;
        char[] copyOf = Arrays.copyOf(cArr, cArr.length + k);
        char[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        b2d.m(copyOf2, 0, i);
        return copyOf2;
    }

    private byte[] U(int i) {
        byte[] bytes = this.E[i].name().getBytes(StandardCharsets.UTF_8);
        byte[] bArr = this.n;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length + bytes.length + 2);
        byte[] bArr2 = this.n;
        copyOf[bArr2.length] = 34;
        int length = bArr2.length + 1;
        int length2 = bytes.length;
        int i2 = 0;
        while (i2 < length2) {
            copyOf[length] = bytes[i2];
            i2++;
            length++;
        }
        copyOf[copyOf.length - 1] = 34;
        return copyOf;
    }

    private char[] V(int i) {
        String name = this.E[i].name();
        char[] cArr = this.o;
        char[] copyOf = Arrays.copyOf(cArr, cArr.length + name.length() + 2);
        copyOf[this.o.length] = '\"';
        name.getChars(0, name.length(), copyOf, this.o.length + 1);
        copyOf[copyOf.length - 1] = '\"';
        return copyOf;
    }

    private void W(JSONWriter jSONWriter, Enum r4, w1r w1rVar) {
        jSONWriter.Z1(this.p, this.m);
        jSONWriter.k2(r4.toString());
    }

    private boolean X(JSONWriter jSONWriter, int i, w1r w1rVar) {
        int identityHashCode = System.identityHashCode(w1rVar);
        long j = this.G[i];
        if (j == 0) {
            long j2 = this.F[i];
            throw null;
        } else if (((int) j) == identityHashCode) {
            int i2 = (int) (j >> 32);
            if (i2 < 0) {
                return false;
            }
            long j3 = this.q;
            if (j3 == 0) {
                throw null;
            } else if (((int) j3) == identityHashCode) {
                int i3 = (int) (j3 >> 32);
                if (i3 != -1) {
                    jSONWriter.q2(-i3);
                } else {
                    jSONWriter.Z1(this.p, this.m);
                }
                jSONWriter.d2((byte) 121);
                jSONWriter.L1(-i2);
                return true;
            } else {
                throw null;
            }
        } else {
            long j4 = this.F[i];
            throw null;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void R(JSONWriter jSONWriter, Object obj) {
        jSONWriter.D1((Enum) a(obj));
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, Object obj) {
        Enum r7 = (Enum) a(obj);
        if (r7 != null) {
            if (jSONWriter.d) {
                z(jSONWriter, r7);
            } else {
                y(jSONWriter, r7);
            }
            return true;
        } else if (((this.d | jSONWriter.A()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
            return false;
        } else {
            A(jSONWriter);
            jSONWriter.b2();
            return true;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void y(JSONWriter jSONWriter, Enum r12) {
        boolean z;
        long C = jSONWriter.C(this.d);
        if ((JSONWriter.Feature.WriteEnumUsingToString.mask & C) == 0) {
            if (jSONWriter.d) {
                z(jSONWriter, r12);
                return;
            }
            boolean z2 = false;
            if ((JSONWriter.Feature.UnquoteFieldName.mask & C) != 0) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = jSONWriter.b;
            if (!z3 && jSONWriter.c) {
                z2 = true;
            }
            int ordinal = r12.ordinal();
            if ((C & JSONWriter.Feature.WriteEnumUsingOrdinal.mask) != 0) {
                if (!z) {
                    if (z3) {
                        byte[][] bArr = this.B;
                        byte[] bArr2 = bArr[ordinal];
                        if (bArr2 == null) {
                            bArr2 = S(ordinal);
                            bArr[ordinal] = bArr2;
                        }
                        jSONWriter.Y1(bArr2);
                        return;
                    } else if (z2) {
                        char[][] cArr = this.C;
                        char[] cArr2 = cArr[ordinal];
                        if (cArr2 == null) {
                            cArr2 = T(ordinal);
                            cArr[ordinal] = cArr2;
                        }
                        jSONWriter.a2(cArr2);
                        return;
                    }
                }
                A(jSONWriter);
                jSONWriter.L1(ordinal);
                return;
            } else if (!z) {
                if (z3) {
                    byte[][] bArr3 = this.z;
                    byte[] bArr4 = bArr3[ordinal];
                    if (bArr4 == null) {
                        bArr4 = U(ordinal);
                        bArr3[ordinal] = bArr4;
                    }
                    jSONWriter.Y1(bArr4);
                    return;
                } else if (z2) {
                    char[][] cArr3 = this.A;
                    char[] cArr4 = cArr3[ordinal];
                    if (cArr4 == null) {
                        cArr4 = V(ordinal);
                        cArr3[ordinal] = cArr4;
                    }
                    jSONWriter.a2(cArr4);
                    return;
                }
            }
        }
        A(jSONWriter);
        jSONWriter.k2(r12.toString());
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void z(JSONWriter jSONWriter, Enum r13) {
        boolean z;
        if (r13 != null) {
            long C = jSONWriter.C(this.d);
            long j = JSONWriter.Feature.WriteEnumUsingToString.mask;
            boolean z2 = false;
            if (((JSONWriter.Feature.WriteEnumsUsingName.mask | j) & C) == 0) {
                z = true;
            } else {
                z = false;
            }
            if ((C & j) != 0) {
                z2 = true;
            }
            int ordinal = r13.ordinal();
            if (z2) {
                W(jSONWriter, r13, null);
            } else if (z) {
                jSONWriter.Z1(this.p, this.m);
                jSONWriter.L1(ordinal);
            } else {
                A(jSONWriter);
                jSONWriter.k2(r13.name());
            }
        }
    }
}
