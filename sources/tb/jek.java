package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class jek implements jdk {
    public static final long i = ls9.a("0");
    public static final long j = ls9.a("1");

    /* renamed from: a  reason: collision with root package name */
    public final Class f21957a;
    public final long b;
    public final Enum c;
    public final Enum d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public jek(Class cls, Enum[] enumArr, Enum[] enumArr2, long[] jArr) {
        this.f21957a = cls;
        this.b = ls9.a(TypeUtils.n(cls));
        this.c = enumArr2[0];
        this.d = enumArr2[1];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jArr.length; i4++) {
            long j2 = jArr[i4];
            Enum r3 = enumArr[i4];
            if (r3 == this.c) {
                int i5 = i2 + 1;
                if (i2 == 0) {
                    this.e = j2;
                } else {
                    this.f = j2;
                }
                i2 = i5;
            } else if (r3 == this.d) {
                int i6 = i3 + 1;
                if (i3 == 0) {
                    this.g = j2;
                } else {
                    this.h = j2;
                }
                i3 = i6;
            }
        }
    }

    @Override // tb.jdk
    public /* synthetic */ Object D(long j2) {
        cdk.d(this, j2);
        throw null;
    }

    @Override // tb.jdk
    public /* synthetic */ Object F(JSONReader jSONReader) {
        return cdk.l(this, jSONReader);
    }

    @Override // tb.jdk
    public /* synthetic */ String G() {
        return JSON.DEFAULT_TYPE_KEY;
    }

    @Override // tb.jdk
    public /* synthetic */ Object a() {
        return cdk.c(this);
    }

    @Override // tb.jdk
    public Class b() {
        return this.f21957a;
    }

    public Enum c(String str) {
        if (str == null) {
            return null;
        }
        return e(ls9.a(str));
    }

    @Override // tb.jdk
    public /* synthetic */ k2a d() {
        return null;
    }

    public Enum e(long j2) {
        if (this.e == j2 || this.f == j2) {
            return this.c;
        }
        if (this.g == j2 || this.h == j2) {
            return this.d;
        }
        return null;
    }

    public Enum f(int i2) {
        if (i2 == 0) {
            return this.c;
        }
        if (i2 != 1) {
            return null;
        }
        return this.d;
    }

    @Override // tb.jdk
    public /* synthetic */ g79 h(long j2) {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ Object i(Collection collection) {
        cdk.e(this, collection);
        throw null;
    }

    @Override // tb.jdk
    public /* synthetic */ g79 j(String str) {
        return cdk.h(this, str);
    }

    @Override // tb.jdk
    public /* synthetic */ long m() {
        return jdk.HASH_TYPE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r4 != r7) goto L_0x0024;
     */
    @Override // tb.jdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o(com.alibaba.fastjson2.JSONReader r19, java.lang.reflect.Type r20, java.lang.Object r21, long r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            int r2 = r19.T0()
            boolean r3 = r19.h1()
            java.lang.Enum r5 = r0.d
            java.lang.Enum r6 = r0.c
            if (r3 == 0) goto L_0x001e
            int r3 = r19.p2()
            if (r3 != 0) goto L_0x0019
            goto L_0x0068
        L_0x0019:
            r6 = 1
            if (r3 != r6) goto L_0x0024
            r4 = r5
            goto L_0x006c
        L_0x001e:
            boolean r3 = r19.D1()
            if (r3 == 0) goto L_0x0026
        L_0x0024:
            r4 = 0
            goto L_0x006c
        L_0x0026:
            long r7 = r19.V2()
            long r9 = r0.e
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0068
            long r11 = r0.f
            int r3 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0068
            long r13 = tb.jek.i
            int r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x003d
            goto L_0x0068
        L_0x003d:
            long r13 = r0.g
            int r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x006a
            r3 = r5
            long r4 = r0.h
            int r15 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r15 == 0) goto L_0x0066
            long r15 = tb.jek.j
            int r17 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r17 != 0) goto L_0x0051
            goto L_0x0066
        L_0x0051:
            long r7 = r19.P0()
            int r15 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r15 == 0) goto L_0x0068
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x005e
            goto L_0x0068
        L_0x005e:
            int r6 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0066
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0024
        L_0x0066:
            r4 = r3
            goto L_0x006c
        L_0x0068:
            r4 = r6
            goto L_0x006c
        L_0x006a:
            r3 = r5
            goto L_0x0066
        L_0x006c:
            if (r4 != 0) goto L_0x009b
            int r3 = r19.T0()
            if (r3 != r2) goto L_0x009b
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L_0x009b
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type r1 = r1.getRawType()
            java.lang.Class<java.util.List> r2 = java.util.List.class
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 != 0) goto L_0x0089
            goto L_0x009b
        L_0x0089:
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.Class<tb.jek> r2 = tb.jek.class
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = " parses error, JSONReader not forward when field type belongs to collection to avoid OOM"
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        L_0x009b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jek.o(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // tb.jdk
    public /* synthetic */ Object r(JSONReader jSONReader, Type type, Object obj, long j2) {
        cdk.i(this, jSONReader, type, obj, j2);
        throw null;
    }

    @Override // tb.jdk
    public /* synthetic */ Object t(Map map, JSONReader.Feature... featureArr) {
        return cdk.g(this, map, featureArr);
    }

    @Override // tb.jdk
    public /* synthetic */ g79 u(long j2) {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ long v() {
        return 0L;
    }

    @Override // tb.jdk
    public /* synthetic */ jdk w(ObjectReaderProvider objectReaderProvider, long j2) {
        return cdk.b(this, objectReaderProvider, j2);
    }

    @Override // tb.jdk
    public /* synthetic */ Object x(Map map, long j2) {
        return cdk.f(this, map, j2);
    }

    @Override // tb.jdk
    public /* synthetic */ jdk z(JSONReader.c cVar, long j2) {
        return cdk.a(this, cVar, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
        if (r3 != r9) goto L_0x00a2;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    @Override // tb.jdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(com.alibaba.fastjson2.JSONReader r18, java.lang.reflect.Type r19, java.lang.Object r20, long r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            int r2 = r18.T0()
            byte r3 = r18.W0()
            r4 = -110(0xffffffffffffff92, float:NaN)
            if (r3 != r4) goto L_0x001d
            r18.t1()
            long r4 = r18.T2()
            long r6 = r0.b
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0020
        L_0x001d:
            r4 = r18
            goto L_0x003f
        L_0x0020:
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "not support enumType : "
            r2.<init>(r3)
            java.lang.String r3 = r18.U0()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r4 = r18
            java.lang.String r2 = r4.a1(r2)
            r1.<init>(r2)
            throw r1
        L_0x003f:
            r5 = -16
            java.lang.Enum r7 = r0.d
            java.lang.Enum r8 = r0.c
            if (r3 < r5) goto L_0x005f
            r5 = 72
            if (r3 > r5) goto L_0x005f
            r5 = 47
            if (r3 > r5) goto L_0x0053
            r18.t1()
            goto L_0x0057
        L_0x0053:
            int r3 = r18.p2()
        L_0x0057:
            if (r3 != 0) goto L_0x005a
            goto L_0x00a7
        L_0x005a:
            r5 = 1
            if (r3 != r5) goto L_0x00a2
            r6 = r7
            goto L_0x00a8
        L_0x005f:
            long r9 = r18.V2()
            long r11 = r0.e
            int r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x00a7
            long r13 = r0.f
            int r3 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x00a7
            long r15 = tb.jek.i
            int r3 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0076
            goto L_0x00a7
        L_0x0076:
            r3 = r7
            long r6 = r0.g
            int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            r21 = r3
            if (r5 == 0) goto L_0x00a4
            long r3 = r0.h
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x00a4
            long r15 = tb.jek.j
            int r5 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x008c
            goto L_0x00a4
        L_0x008c:
            long r9 = r18.P0()
            int r5 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x00a7
            int r5 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x0099
            goto L_0x00a7
        L_0x0099:
            int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x00a4
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            r6 = 0
            goto L_0x00a8
        L_0x00a4:
            r6 = r21
            goto L_0x00a8
        L_0x00a7:
            r6 = r8
        L_0x00a8:
            if (r6 != 0) goto L_0x00d7
            int r3 = r18.T0()
            if (r3 != r2) goto L_0x00d7
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L_0x00d7
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type r1 = r1.getRawType()
            java.lang.Class<java.util.List> r2 = java.util.List.class
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 != 0) goto L_0x00c5
            goto L_0x00d7
        L_0x00c5:
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.Class<tb.jek> r2 = tb.jek.class
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = " parses error, JSONReader not forward when field type belongs to collection to avoid OOM"
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        L_0x00d7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jek.q(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // tb.jdk
    public /* synthetic */ void s(Object obj, String str, Object obj2, long j2) {
    }
}
