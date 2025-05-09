package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.function.Supplier;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.time.DateTimeException;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alipay.android.msp.framework.okio.SegmentPool;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import tb.b2d;
import tb.ba2;
import tb.c0z;
import tb.ft8;
import tb.g79;
import tb.hq4;
import tb.jdk;
import tb.ldk;
import tb.ogk;
import tb.oij;
import tb.p7h;
import tb.q7h;
import tb.tiv;
import tb.uh9;
import tb.vcf;
import tb.vtn;
import tb.w1r;
import tb.wqx;
import tb.x9h;
import tb.xqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class JSONReader implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final c f2453a;
    public List<d> b;
    public int c;
    public char d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public byte k;
    public short l;
    public short m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public String s;
    public Object t;
    public boolean u;
    public char[] v;
    public final boolean w;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum Feature {
        FieldBased(1),
        IgnoreNoneSerializable(2),
        ErrorOnNoneSerializable(4),
        SupportArrayToBean(8),
        InitStringFieldAsEmpty(16),
        SupportAutoType(32),
        SupportSmartMatch(64),
        UseNativeObject(128),
        SupportClassForName(256),
        IgnoreSetNullValue(512),
        UseDefaultConstructorAsPossible(1024),
        UseBigDecimalForFloats(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX),
        UseBigDecimalForDoubles(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF),
        ErrorOnEnumNotMatch(8192),
        TrimString(16384),
        ErrorOnNotSupportAutoType(32768),
        DuplicateKeyValueAsArray(SegmentPool.MAX_SIZE),
        AllowUnQuotedFieldNames(131072),
        NonStringKeyAsString(262144),
        Base64StringAsByteArray(524288),
        IgnoreCheckClose(1048576),
        ErrorOnNullForPrimitives(2097152),
        NullOnError(4194304),
        IgnoreAutoTypeNotMatch(8388608),
        NonZeroNumberCastToBooleanAsTrue(16777216),
        IgnoreNullPropertyValue(33554432),
        ErrorOnUnknownProperties(67108864);
        
        public final long mask;

        Feature(long j) {
            this.mask = j;
        }

        public static long of(Feature[] featureArr) {
            long j = 0;
            if (featureArr == null) {
                return 0L;
            }
            for (Feature feature : featureArr) {
                j |= feature.mask;
            }
            return j;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a extends uh9 {
        Class<?> b(String str, Class<?> cls, long j);

        Class<?> c(long j, Class<?> cls, long j2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements ba2<Integer, int[], BigInteger> {

        /* renamed from: a  reason: collision with root package name */
        public static final ba2<Integer, int[], BigInteger> f2454a = new b();

        /* renamed from: b */
        public BigInteger a(Integer num, int[] iArr) {
            int i;
            boolean z;
            int intValue = num.intValue();
            if (iArr.length == 0) {
                i = 0;
            } else {
                i = ((iArr.length - 1) << 5) + (32 - Integer.numberOfLeadingZeros(iArr[0]));
                if (intValue < 0) {
                    if (Integer.bitCount(iArr[0]) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    for (int i2 = 1; i2 < iArr.length && z; i2++) {
                        if (iArr[i2] == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        i--;
                    }
                }
            }
            int i3 = i / 8;
            byte[] bArr = new byte[i3 + 1];
            int i4 = 4;
            int i5 = 0;
            int i6 = 0;
            while (i3 >= 0) {
                if (i4 == 4) {
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        if (i6 < iArr.length) {
                            i5 = iArr[(iArr.length - i6) - 1];
                            if (intValue < 0) {
                                int length = iArr.length;
                                int i8 = length - 1;
                                while (i8 >= 0 && iArr[i8] == 0) {
                                    i8--;
                                }
                                if (i6 <= (length - i8) - 1) {
                                    i5 = -i5;
                                } else {
                                    i5 = ~i5;
                                }
                            }
                        } else if (intValue < 0) {
                            i5 = -1;
                        }
                        i6 = i7;
                        i4 = 1;
                    }
                    i5 = 0;
                    i6 = i7;
                    i4 = 1;
                } else {
                    i5 >>>= 8;
                    i4++;
                }
                bArr[i3] = (byte) i5;
                i3--;
            }
            return new BigInteger(bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final g79 f2456a;
        public final Object b;
        public final Object c;
        public final com.alibaba.fastjson2.c d;

        public d(g79 g79Var, Object obj, Object obj2, com.alibaba.fastjson2.c cVar) {
            this.f2456a = g79Var;
            this.b = obj;
            this.c = obj2;
            this.d = cVar;
        }

        public String toString() {
            return this.d.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f2457a;
        public final int b;

        public e(int i, int i2) {
            this.f2457a = i;
            this.b = i2;
        }
    }

    public JSONReader(c cVar, boolean z) {
        this.f2453a = cVar;
        this.w = z;
    }

    public static JSONException J1(int i, int i2) {
        return new JSONException("illegal number, offset " + i + ", char " + ((char) i2));
    }

    public static JSONReader K1(String str) {
        str.getClass();
        return new i(new c(JSONFactory.defaultObjectReaderProvider), str, 0, str.length());
    }

    public static char L(int i, int i2) {
        int[] iArr = JSONFactory.m;
        return (char) ((iArr[i] << 4) + iArr[i2]);
    }

    public static JSONReader L1(String str, c cVar) {
        if (str != null && cVar != null) {
            return new i(cVar, str, 0, str.length());
        }
        throw null;
    }

    public static JSONReader M1(char[] cArr, int i, int i2) {
        return new i(JSONFactory.b(), null, cArr, i, i2);
    }

    public static JSONReader N1(byte[] bArr) {
        return new h(JSONFactory.b(), bArr, 0, bArr.length);
    }

    public static char Z(int i, int i2, int i3, int i4) {
        int[] iArr = JSONFactory.m;
        return (char) ((iArr[i] << 12) + (iArr[i2] << 8) + (iArr[i3] << 4) + iArr[i4]);
    }

    public static JSONException d3(int i) {
        return new JSONException("syntax error, expect ',', but '" + ((char) i) + "'");
    }

    public static JSONException e3(int i, int i2) {
        return new JSONException("syntax error, offset " + i + ", char " + ((char) i2));
    }

    public static boolean f1(int i) {
        if ((i < 65 || i > 90) && ((i < 97 || i > 122) && i != 95 && i != 36 && ((i < 48 || i > 57) && i <= 127))) {
            return false;
        }
        return true;
    }

    public static a w(Class... clsArr) {
        return new hq4(clsArr);
    }

    public abstract boolean A1(char c2, char c3, char c4, char c5, char c6);

    public abstract q7h A2();

    public final long B0(long j) {
        return j | this.f2453a.c;
    }

    public boolean B1() {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract q7h B2();

    public abstract boolean C1();

    public abstract q7h C2();

    public final BigInteger D0() {
        Number Q0 = Q0();
        if (Q0 == null) {
            return null;
        }
        if (Q0 instanceof BigInteger) {
            return (BigInteger) Q0;
        }
        return BigInteger.valueOf(Q0.longValue());
    }

    public abstract boolean D1();

    public abstract q7h D2();

    public final c E0() {
        return this.f2453a;
    }

    public abstract boolean E1();

    public abstract q7h E2();

    public abstract boolean F1();

    public abstract q7h F2(int i);

    public abstract boolean G1();

    public abstract long G2();

    public final JSONException H1() {
        return new JSONException(a1("not support unquoted name"));
    }

    public JSONException I1() {
        return new JSONException("illegal number, offset " + this.c + ", char " + this.d);
    }

    public abstract void I2();

    public abstract Date J2();

    public Number K2() {
        L2();
        return Q0();
    }

    public abstract String L0();

    public abstract void L2();

    public final int M0() {
        int intValueExact;
        int i;
        switch (this.k) {
            case 1:
            case 9:
            case 10:
                if (this.o != 0 || this.p != 0 || (i = this.q) == Integer.MIN_VALUE) {
                    Number Q0 = Q0();
                    if (Q0 instanceof Long) {
                        long longValue = Q0.longValue();
                        if (longValue >= -2147483648L && longValue <= 2147483647L) {
                            return (int) longValue;
                        }
                        throw new JSONException(a1("integer overflow " + longValue));
                    } else if (!(Q0 instanceof BigInteger)) {
                        return Q0.intValue();
                    } else {
                        try {
                            intValueExact = ((BigInteger) Q0).intValueExact();
                            return intValueExact;
                        } catch (ArithmeticException unused) {
                            throw I1();
                        }
                    }
                } else if (this.j) {
                    return -i;
                } else {
                    return i;
                }
            case 2:
                return Q0().intValue();
            case 3:
                return g3(this.s);
            case 4:
                return this.i ? 1 : 0;
            case 5:
                if ((this.f2453a.c & Feature.ErrorOnNullForPrimitives.mask) == 0) {
                    return 0;
                }
                throw new JSONException(a1("int value not support input null"));
            case 6:
                Number k3 = k3((Map) this.t);
                if (k3 != null) {
                    return k3.intValue();
                }
                return 0;
            case 7:
                return f3((List) this.t);
            case 8:
                try {
                    return C0().intValueExact();
                } catch (ArithmeticException unused2) {
                    throw I1();
                }
            case 11:
            case 12:
            case 13:
                return Q0().intValue();
            default:
                throw new JSONException("TODO : " + ((int) this.k));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.Object> M2() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.M2():java.util.Map");
    }

    public final long N0() {
        long longValueExact;
        int i;
        switch (this.k) {
            case 1:
            case 9:
            case 10:
                if (this.o == 0 && this.p == 0 && (i = this.q) != Integer.MIN_VALUE) {
                    if (this.j) {
                        i = -i;
                    }
                    return i;
                }
                Number Q0 = Q0();
                if (!(Q0 instanceof BigInteger)) {
                    return Q0.longValue();
                }
                try {
                    longValueExact = ((BigInteger) Q0).longValueExact();
                    return longValueExact;
                } catch (ArithmeticException unused) {
                    throw I1();
                }
            case 2:
                return Q0().longValue();
            case 3:
                return h3(this.s);
            case 4:
                if (this.i) {
                    return 1L;
                }
                return 0L;
            case 5:
                if ((this.f2453a.c & Feature.ErrorOnNullForPrimitives.mask) == 0) {
                    return 0L;
                }
                throw new JSONException(a1("long value not support input null"));
            case 6:
                return i3((Map) this.t);
            case 7:
                return f3((List) this.t);
            case 8:
                try {
                    return C0().longValueExact();
                } catch (ArithmeticException unused2) {
                    throw I1();
                }
            case 11:
            case 12:
            case 13:
                return Q0().longValue();
            default:
                throw new JSONException("TODO : " + ((int) this.k));
        }
    }

    public final Locale O0() {
        this.f2453a.getClass();
        return null;
    }

    public <T> T O1(Class<T> cls) {
        boolean z;
        c cVar = this.f2453a;
        if ((cVar.c & Feature.FieldBased.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        return (T) cVar.i.J(cls, z).o(this, null, null, 0L);
    }

    public final void O2(Object obj, Feature... featureArr) {
        long j = 0;
        for (Feature feature : featureArr) {
            j |= feature.mask;
        }
        N2(obj, j);
    }

    public abstract long P0();

    public <T> T P1(Type type) {
        boolean z;
        c cVar = this.f2453a;
        if ((cVar.c & Feature.FieldBased.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        return (T) cVar.i.J(type, z).o(this, null, null, 0L);
    }

    public abstract String P2();

    public final void Q1(Collection collection) {
        if (v1()) {
            int i = this.r + 1;
            this.r = i;
            this.f2453a.getClass();
            if (i < 2048) {
                while (!u1()) {
                    collection.add(T1());
                    w1();
                }
                this.r--;
                w1();
                return;
            }
            throw new JSONException("level too large : " + this.r);
        }
        throw new JSONException("illegal input, offset " + this.c + ", char " + this.d);
    }

    public abstract String Q2();

    public final jdk R0(Type type) {
        boolean z;
        c cVar = this.f2453a;
        if ((cVar.c & Feature.FieldBased.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        return cVar.i.J(type, z);
    }

    public final void R1(List list) {
        if (v1()) {
            int i = this.r + 1;
            this.r = i;
            this.f2453a.getClass();
            if (i < 2048) {
                while (!u1()) {
                    list.add(ogk.INSTANCE.o(this, null, null, 0L));
                    w1();
                }
                this.r--;
                w1();
                return;
            }
            throw new JSONException("level too large : " + this.r);
        }
        throw new JSONException("illegal input, offset " + this.c + ", char " + this.d);
    }

    public String[] R2() {
        String[] strArr = null;
        if (this.d == 'n' && C1()) {
            return null;
        }
        if (v1()) {
            int i = 0;
            while (!u1()) {
                if (!e1()) {
                    if (strArr == null) {
                        strArr = new String[16];
                    } else if (i == strArr.length) {
                        strArr = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
                    }
                    i++;
                    strArr[i] = Q2();
                } else {
                    throw new JSONException(a1("input end"));
                }
            }
            if (strArr == null) {
                strArr = new String[0];
            }
            w1();
            return strArr.length == i ? strArr : (String[]) Arrays.copyOf(strArr, i);
        }
        char c2 = this.d;
        if (c2 == '\"' || c2 == '\'') {
            String Q2 = Q2();
            if (Q2.isEmpty()) {
                return null;
            }
            throw new JSONException(a1("not support input ".concat(Q2)));
        }
        throw new JSONException(a1("not support input"));
    }

    public jdk S0(long j, Class cls, long j2) {
        Class<?> b2;
        boolean z;
        c cVar = this.f2453a;
        jdk h = cVar.h(j);
        if (h != null) {
            return h;
        }
        String U0 = U0();
        a aVar = cVar.g;
        if (aVar == null || (b2 = aVar.b(U0, cls, j2)) == null) {
            return cVar.i.H(U0, cls, j2 | cVar.c);
        }
        if ((j2 & Feature.FieldBased.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        return cVar.i.J(b2, z);
    }

    public final String S2() {
        char c2 = this.d;
        if (!(c2 == '+' || c2 == '-')) {
            if (c2 == '[') {
                return l3(U1());
            }
            if (c2 != 'f') {
                if (c2 == 'n') {
                    I2();
                    return null;
                } else if (c2 != 't') {
                    if (c2 == '{') {
                        return m3(M2());
                    }
                    switch (c2) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            break;
                        default:
                            throw new JSONException(a1("illegal input : " + this.d));
                    }
                }
            }
            boolean a2 = a2();
            this.i = a2;
            if (a2) {
                return "true";
            }
            return "false";
        }
        L2();
        return Q0().toString();
    }

    public final int T0() {
        return this.c;
    }

    public Object T1() {
        return O1(Object.class);
    }

    public long T2() {
        return V2();
    }

    public abstract String U0();

    public List U1() {
        Object obj;
        List jSONArray;
        List jSONArray2;
        t1();
        int i = this.r + 1;
        this.r = i;
        c cVar = this.f2453a;
        cVar.getClass();
        if (i < 2048) {
            boolean z = false;
            List<Object> list = null;
            Object obj2 = null;
            Object obj3 = null;
            int i2 = 0;
            while (true) {
                char c2 = this.d;
                if (c2 == '\"' || c2 == '\'') {
                    obj = Q2();
                } else {
                    if (!(c2 == '+' || c2 == '-')) {
                        if (c2 == '[') {
                            obj = U1();
                        } else if (c2 != ']') {
                            if (c2 != 'f') {
                                if (c2 == 'n') {
                                    I2();
                                    obj = null;
                                } else if (c2 != 't') {
                                    if (c2 != '{') {
                                        switch (c2) {
                                            case '/':
                                                a3();
                                                break;
                                        }
                                    } else if (cVar.g != null || (cVar.c & Feature.SupportAutoType.mask) != 0) {
                                        obj = ogk.INSTANCE.o(this, null, null, 0L);
                                    } else if (k1()) {
                                        obj = com.alibaba.fastjson2.c.b(P2());
                                    } else {
                                        obj = M2();
                                    }
                                }
                            }
                            obj = Boolean.valueOf(a2());
                        } else {
                            t1();
                            if (list == null) {
                                Supplier<List> supplier = cVar.f;
                                if (supplier != null) {
                                    jSONArray2 = supplier.get();
                                } else if (!cVar.n(Feature.UseNativeObject)) {
                                    Supplier<List> supplier2 = cVar.f;
                                    if (supplier2 != null) {
                                        jSONArray2 = supplier2.get();
                                    } else if (i2 == 2) {
                                        jSONArray2 = new JSONArray(2);
                                    } else {
                                        jSONArray2 = new JSONArray(1);
                                    }
                                } else if (i2 == 2) {
                                    jSONArray2 = new ArrayList<>(2);
                                } else {
                                    jSONArray2 = new ArrayList<>(1);
                                }
                                list = jSONArray2;
                                if (i2 == 1) {
                                    a(list, 0, obj2);
                                } else if (i2 == 2) {
                                    a(list, 0, obj2);
                                    a(list, 1, obj3);
                                }
                            }
                            if (this.d == ',') {
                                z = true;
                            }
                            this.e = z;
                            if (z) {
                                t1();
                            }
                            this.r--;
                            return list;
                        }
                    }
                    L2();
                    obj = Q0();
                }
                if (i2 == 0) {
                    obj2 = obj;
                } else if (i2 == 1) {
                    obj3 = obj;
                } else if (i2 == 2) {
                    Supplier<List> supplier3 = cVar.f;
                    if (supplier3 != null) {
                        jSONArray = supplier3.get();
                    } else {
                        jSONArray = new JSONArray();
                    }
                    list = jSONArray;
                    a(list, 0, obj2);
                    a(list, 1, obj3);
                    a(list, i2, obj);
                } else {
                    a(list, i2, obj);
                }
                i2++;
            }
            throw new JSONException("TODO : " + this.d);
        }
        throw new JSONException("level too large : " + this.r);
    }

    public abstract UUID U2();

    public abstract int V0();

    public List V1(Type type) {
        char c2;
        if (C1()) {
            return null;
        }
        if (v1()) {
            c cVar = this.f2453a;
            boolean z = false;
            jdk J = cVar.i.J(type, (cVar.c & Feature.FieldBased.mask) != 0);
            ArrayList arrayList = new ArrayList();
            while (!u1()) {
                int i = this.c;
                Object o = J.o(this, null, null, 0L);
                if (i == this.c || (c2 = this.d) == '}' || c2 == 26) {
                    throw new JSONException("illegal input : " + this.d + ", offset " + T0());
                }
                arrayList.add(o);
            }
            if (this.d == ',') {
                z = true;
            }
            this.e = z;
            if (z) {
                t1();
            }
            return arrayList;
        }
        throw new JSONException(a1("syntax error : " + this.d));
    }

    public abstract long V2();

    public byte W0() {
        return c0z.STATE;
    }

    public abstract BigDecimal W1();

    public xqx W2() {
        q7h q7hVar;
        boolean h1 = h1();
        c cVar = this.f2453a;
        if (h1) {
            long r2 = r2();
            cVar.getClass();
            return xqx.d(vcf.d(r2), cVar.m());
        } else if (l1()) {
            cVar.getClass();
            int V0 = V0();
            switch (V0) {
                case 8:
                    p7h v2 = v2();
                    if (v2 != null) {
                        q7hVar = q7h.f(v2, x9h.MIN);
                        break;
                    }
                    q7hVar = null;
                    break;
                case 9:
                    p7h w2 = w2();
                    if (w2 != null) {
                        q7hVar = q7h.f(w2, x9h.MIN);
                        break;
                    }
                    q7hVar = null;
                    break;
                case 10:
                    p7h t2 = t2();
                    if (t2 != null) {
                        q7hVar = q7h.f(t2, x9h.MIN);
                        break;
                    }
                    q7hVar = null;
                    break;
                case 11:
                    q7hVar = q7h.f(u2(), x9h.MIN);
                    break;
                case 12:
                case 13:
                case 14:
                case 15:
                default:
                    xqx X2 = X2(V0);
                    if (X2 != null) {
                        return X2;
                    }
                    q7hVar = null;
                    break;
                case 16:
                    q7hVar = A2();
                    break;
                case 17:
                    q7hVar = B2();
                    break;
                case 18:
                    q7hVar = C2();
                    break;
                case 19:
                    q7hVar = D2();
                    break;
                case 20:
                    q7hVar = E2();
                    break;
            }
            if (q7hVar != null) {
                return xqx.e(q7hVar, cVar.m());
            }
            String Q2 = Q2();
            if (Q2.isEmpty() || "null".equals(Q2)) {
                return null;
            }
            DateTimeFormatter e2 = cVar.e();
            if (e2 != null) {
                return xqx.b(e2.h(Q2), x9h.MIN, cVar.m());
            }
            if (b2d.h(Q2)) {
                return xqx.d(vcf.d(Long.parseLong(Q2)), cVar.m());
            }
            return DateUtils.o0(Q2);
        } else {
            throw new JSONException("TODO : " + this.d);
        }
    }

    public final wqx X0() {
        return this.f2453a.m();
    }

    public BigInteger X1() {
        L2();
        return D0();
    }

    public abstract xqx X2(int i);

    public final void Y0(Object obj) {
        if (this.b != null) {
            Object obj2 = null;
            for (int i = 0; i < ((ArrayList) this.b).size(); i++) {
                d dVar = (d) ((ArrayList) this.b).get(i);
                com.alibaba.fastjson2.c cVar = dVar.d;
                if (!cVar.e) {
                    if ((this.f2453a.c & Feature.FieldBased.mask) != 0) {
                        JSONWriter.a f = JSONFactory.f();
                        f.c |= JSONWriter.Feature.FieldBased.mask;
                        cVar.f2461a = f;
                    }
                    obj2 = cVar.a(obj);
                }
                Object obj3 = dVar.c;
                Object obj4 = dVar.b;
                if (obj3 != null) {
                    if (obj4 instanceof Map) {
                        Map map = (Map) obj4;
                        if (!(obj3 instanceof vtn)) {
                            map.put(obj3, obj2);
                        } else if (map instanceof LinkedHashMap) {
                            int size = map.size();
                            if (size != 0) {
                                Object[] objArr = new Object[size];
                                Object[] objArr2 = new Object[size];
                                int i2 = 0;
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    if (obj3 == key) {
                                        objArr[i2] = obj2;
                                    } else {
                                        objArr[i2] = key;
                                    }
                                    objArr2[i2] = entry.getValue();
                                    i2++;
                                }
                                map.clear();
                                for (int i3 = 0; i3 < size; i3++) {
                                    map.put(objArr[i3], objArr2[i3]);
                                }
                            }
                        } else {
                            map.put(obj2, map.remove(obj3));
                        }
                    } else if (obj3 instanceof Integer) {
                        if (obj4 instanceof List) {
                            int intValue = ((Integer) obj3).intValue();
                            List list = (List) obj4;
                            if (intValue == list.size()) {
                                list.add(obj2);
                            } else if (intValue >= list.size() || list.get(intValue) != null) {
                                list.add(intValue, obj2);
                            } else {
                                list.set(intValue, obj2);
                            }
                        } else if (obj4 instanceof Object[]) {
                            ((Object[]) obj4)[((Integer) obj3).intValue()] = obj2;
                        } else if (obj4 instanceof Collection) {
                            ((Collection) obj4).add(obj2);
                        }
                    }
                }
                dVar.f2456a.h(obj4, obj2);
            }
        }
    }

    public byte[] Y1() {
        if (this.d == 'x') {
            return m2();
        }
        if (l1()) {
            String Q2 = Q2();
            if (Q2.isEmpty()) {
                return null;
            }
            if ((this.f2453a.c & Feature.Base64StringAsByteArray.mask) != 0) {
                return b2d.c(Q2);
            }
            throw new JSONException(a1("not support input ".concat(Q2)));
        } else if (v1()) {
            byte[] bArr = new byte[64];
            int i = 0;
            while (this.d != ']') {
                if (i == bArr.length) {
                    int length = bArr.length;
                    bArr = Arrays.copyOf(bArr, length + (length >> 1));
                }
                i++;
                bArr[i] = (byte) p2();
            }
            t1();
            w1();
            return Arrays.copyOf(bArr, i);
        } else {
            throw new JSONException(a1("not support read binary"));
        }
    }

    public void Y2(e eVar) {
        this.c = eVar.f2457a;
        this.d = (char) eVar.b;
    }

    public final String Z0() {
        return a1(null);
    }

    public Boolean Z1() {
        if (C1()) {
            return null;
        }
        boolean a2 = a2();
        if (a2 || !this.h) {
            return Boolean.valueOf(a2);
        }
        return null;
    }

    public final void Z2(boolean z) {
        this.u = z;
    }

    public final void a(List<Object> list, int i, Object obj) {
        if (obj instanceof com.alibaba.fastjson2.c) {
            b(list, i, (com.alibaba.fastjson2.c) obj);
            list.add(null);
            return;
        }
        list.add(obj);
    }

    public abstract boolean a2();

    public abstract void a3();

    public final void b(Collection collection, int i, com.alibaba.fastjson2.c cVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(new d(null, collection, Integer.valueOf(i), cVar));
    }

    public abstract boolean b1();

    public Calendar b2() {
        Date d2 = d2();
        if (d2 == null) {
            return null;
        }
        Calendar instance = Calendar.getInstance(this.f2453a.l());
        instance.setTime(d2);
        return instance;
    }

    public abstract void b3();

    public final void c(Map map, Object obj, com.alibaba.fastjson2.c cVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (map instanceof LinkedHashMap) {
            map.put(obj, null);
        }
        this.b.add(new d(null, map, obj, cVar));
    }

    public jdk c0(Class cls, long j, long j2) {
        return null;
    }

    public boolean c1() {
        return false;
    }

    public char c2() {
        String Q2 = Q2();
        if (Q2 != null && !Q2.isEmpty()) {
            return Q2.charAt(0);
        }
        this.h = true;
        return (char) 0;
    }

    public int c3() {
        if (v1()) {
            return Integer.MAX_VALUE;
        }
        throw new JSONException(a1("illegal input, expect '[', but " + this.d));
    }

    public final boolean d1(Feature feature) {
        if ((this.f2453a.c & feature.mask) != 0) {
            return true;
        }
        return false;
    }

    public Date d2() {
        c cVar = this.f2453a;
        cVar.getClass();
        if (h1()) {
            return new Date(r2());
        }
        return DateUtils.u(Q2(), null, cVar.m());
    }

    public final void e(g79 g79Var, Object obj, com.alibaba.fastjson2.c cVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(new d(g79Var, obj, g79Var.b, cVar));
    }

    public boolean e1() {
        if (this.d == 26) {
            return true;
        }
        return false;
    }

    public final Double e2() {
        if (C1()) {
            return null;
        }
        this.h = false;
        double f2 = f2();
        if (this.h) {
            return null;
        }
        return Double.valueOf(f2);
    }

    public final char f0() {
        return this.d;
    }

    public abstract double f2();

    public final int f3(List list) {
        if (list.size() == 1) {
            Object obj = list.get(0);
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
        }
        throw new JSONException("parseLong error, field : value " + list);
    }

    public final void g(Object[] objArr, int i, com.alibaba.fastjson2.c cVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(new d(null, objArr, Integer.valueOf(i), cVar));
    }

    public final boolean g1() {
        if ((this.f2453a.c & Feature.InitStringFieldAsEmpty.mask) != 0) {
            return true;
        }
        return false;
    }

    public abstract String g2();

    public final int g3(String str) {
        if (b2d.h(str)) {
            return Integer.parseInt(str);
        }
        throw new JSONException("parseInt error, value : ".concat(str));
    }

    public boolean h1() {
        char c2 = this.d;
        if (c2 == '-' || c2 == '+' || (c2 >= '0' && c2 <= '9')) {
            return true;
        }
        return false;
    }

    public abstract long h2();

    public final long h3(String str) {
        if (b2d.h(str)) {
            return Long.parseLong(str);
        }
        if (str.length() > 10 && str.length() < 40) {
            try {
                return DateUtils.f0(str, this.f2453a.b);
            } catch (JSONException | DateTimeException unused) {
            }
        }
        throw new JSONException("parseLong error, value : ".concat(str));
    }

    public final BigDecimal i0(JSONObject jSONObject) {
        BigDecimal bigDecimal = jSONObject.getBigDecimal("value");
        if (bigDecimal == null) {
            bigDecimal = jSONObject.getBigDecimal("$numberDecimal");
        }
        if (bigDecimal != null) {
            return bigDecimal;
        }
        throw new JSONException("can not cast to decimal " + jSONObject);
    }

    public boolean i1() {
        char c2 = this.d;
        if (c2 == '+' || c2 == '-') {
            return true;
        }
        switch (c2) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return true;
            default:
                return false;
        }
    }

    public abstract long i2();

    public final long i3(Map map) {
        Object obj = map.get("val");
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        throw new JSONException("parseLong error, value : " + map);
    }

    public boolean j1() {
        if (this.d == '{') {
            return true;
        }
        return false;
    }

    public final String j2() {
        i2();
        return L0();
    }

    public final Number j3(List list) {
        if (list.size() != 1) {
            return null;
        }
        Object obj = list.get(0);
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return TypeUtils.E((String) obj);
        }
        return null;
    }

    public abstract boolean k1();

    public final Float k2() {
        if (C1()) {
            return null;
        }
        this.h = false;
        float l2 = l2();
        if (this.h) {
            return null;
        }
        return Float.valueOf(l2);
    }

    public final Number k3(Map map) {
        Object obj = map.get("val");
        if (obj instanceof Number) {
            return (Number) obj;
        }
        return null;
    }

    public boolean l1() {
        char c2 = this.d;
        if (c2 == '\"' || c2 == '\'') {
            return true;
        }
        return false;
    }

    public abstract float l2();

    public final String l3(List list) {
        JSONWriter T0 = JSONWriter.T0();
        T0.b1(list);
        T0.g1(list);
        return T0.toString();
    }

    public final boolean m1(long j) {
        if (((j | this.f2453a.c) & Feature.SupportAutoType.mask) != 0) {
            return true;
        }
        return false;
    }

    public abstract byte[] m2();

    public final String m3(Map map) {
        JSONWriter T0 = JSONWriter.T0();
        T0.b1(map);
        T0.h1(map);
        return T0.toString();
    }

    public final JSONException n0(int i, int i2) {
        throw new JSONException("error, offset " + i + ", char " + ((char) i2));
    }

    public final boolean n1() {
        if ((this.f2453a.c & Feature.SupportArrayToBean.mask) != 0) {
            return true;
        }
        return false;
    }

    public abstract boolean n2();

    public final JSONException n3() {
        return new JSONException(a1("illegal value"));
    }

    public final boolean o1(long j) {
        if (((j | this.f2453a.c) & Feature.SupportArrayToBean.mask) != 0) {
            return true;
        }
        return false;
    }

    public abstract Integer o2();

    public boolean o3() {
        return this.h;
    }

    public final boolean p1() {
        if ((this.f2453a.c & Feature.SupportSmartMatch.mask) != 0) {
            return true;
        }
        return false;
    }

    public abstract int p2();

    public final boolean q1(long j) {
        if (((j | this.f2453a.c) & Feature.SupportSmartMatch.mask) != 0) {
            return true;
        }
        return false;
    }

    public abstract Long q2();

    public final boolean r1() {
        return this.u;
    }

    public abstract long r2();

    public e s1() {
        return new e(this.c, this.d);
    }

    public long[] s2() {
        if (C1()) {
            return null;
        }
        if (v1()) {
            long[] jArr = new long[8];
            int i = 0;
            while (!u1()) {
                if (!e1()) {
                    if (i == jArr.length) {
                        jArr = Arrays.copyOf(jArr, jArr.length << 1);
                    }
                    i++;
                    jArr[i] = r2();
                } else {
                    throw new JSONException(a1("input end"));
                }
            }
            w1();
            return i == jArr.length ? jArr : Arrays.copyOf(jArr, i);
        } else if (l1()) {
            String Q2 = Q2();
            if (Q2.isEmpty()) {
                return null;
            }
            throw new JSONException(a1("not support input ".concat(Q2)));
        } else {
            throw new JSONException(a1("TODO"));
        }
    }

    public abstract void t1();

    public abstract p7h t2();

    public final void u0(Class cls) {
        if ((this.f2453a.c & Feature.ErrorOnNoneSerializable.mask) != 0 && !Serializable.class.isAssignableFrom(cls)) {
            throw new JSONException("not support none-Serializable, class ".concat(cls.getName()));
        }
    }

    public abstract boolean u1();

    public abstract p7h u2();

    public abstract boolean v1();

    public abstract p7h v2();

    public abstract boolean w1();

    public abstract p7h w2();

    public abstract boolean x1();

    public q7h x2() {
        boolean h1 = h1();
        c cVar = this.f2453a;
        if (h1) {
            return xqx.d(vcf.d(r2()), cVar.m()).f31549a;
        }
        cVar.getClass();
        int V0 = V0();
        switch (V0) {
            case 8:
                p7h v2 = v2();
                if (v2 == null) {
                    return null;
                }
                return q7h.f(v2, x9h.MIN);
            case 9:
                p7h w2 = w2();
                if (w2 == null) {
                    return null;
                }
                return q7h.f(w2, x9h.MIN);
            case 10:
                p7h t2 = t2();
                if (t2 == null) {
                    return null;
                }
                return q7h.f(t2, x9h.MIN);
            case 11:
                p7h u2 = u2();
                if (u2 == null) {
                    return null;
                }
                return q7h.f(u2, x9h.MIN);
            case 16:
                return A2();
            case 17:
                q7h B2 = B2();
                if (B2 != null) {
                    return B2;
                }
                break;
            case 18:
                return C2();
            case 19:
                q7h D2 = D2();
                if (D2 != null) {
                    return D2;
                }
                break;
            case 20:
                q7h E2 = E2();
                if (E2 != null) {
                    return E2;
                }
                xqx X2 = X2(V0);
                if (X2 != null) {
                    return X2.f31549a;
                }
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                q7h F2 = F2(V0);
                if (F2 != null) {
                    return F2;
                }
                xqx X22 = X2(V0);
                if (X22 != null) {
                    wqx m = cVar.m();
                    if (!X22.c.equals(m)) {
                        return xqx.d(X22.h(), m).f31549a;
                    }
                    return X22.f31549a;
                }
                break;
        }
        String Q2 = Q2();
        if (Q2.isEmpty() || "null".equals(Q2)) {
            this.h = true;
            return null;
        }
        DateTimeFormatter e2 = cVar.e();
        if (e2 != null) {
            return q7h.f(e2.h(Q2), x9h.MIN);
        }
        if (b2d.h(Q2)) {
            return q7h.h(vcf.d(Long.parseLong(Q2)), cVar.m());
        }
        if (Q2.startsWith("/Date(", 0) && Q2.endsWith(")/")) {
            String substring = Q2.substring(6, Q2.length() - 2);
            int indexOf = substring.indexOf(43);
            if (indexOf == -1) {
                indexOf = substring.indexOf(45);
            }
            if (indexOf != -1) {
                substring = substring.substring(0, indexOf);
            }
            return q7h.h(vcf.d(Long.parseLong(substring)), cVar.m());
        } else if (Q2.equals("0000-00-00 00:00:00")) {
            this.h = true;
            return null;
        } else {
            throw new JSONException(a1("read LocalDateTime error ".concat(Q2)));
        }
    }

    public boolean y1(byte b2) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract q7h y2();

    public abstract boolean z1(char c2);

    public abstract q7h z2();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final long H2() {
        q7h q7hVar;
        long j;
        int i;
        this.h = false;
        c cVar = this.f2453a;
        cVar.getClass();
        xqx xqxVar = null;
        int V0 = V0();
        switch (V0) {
            case 8:
                p7h v2 = v2();
                if (v2 != null) {
                    q7hVar = q7h.f(v2, x9h.MIN);
                    break;
                } else {
                    throw new JSONException("TODO : " + Q2());
                }
            case 9:
                p7h w2 = w2();
                if (w2 != null) {
                    q7hVar = q7h.f(w2, x9h.MIN);
                    break;
                }
                q7hVar = null;
                break;
            case 10:
                p7h t2 = t2();
                if (t2 != null) {
                    q7hVar = q7h.f(t2, x9h.MIN);
                    break;
                } else {
                    String Q2 = Q2();
                    if ("0000-00-00".equals(Q2)) {
                        this.h = true;
                        return 0L;
                    } else if (b2d.h(Q2)) {
                        return Long.parseLong(Q2);
                    } else {
                        throw new JSONException("TODO : ".concat(Q2));
                    }
                }
            case 11:
                p7h u2 = u2();
                if (u2 != null) {
                    q7hVar = q7h.f(u2, x9h.MIN);
                    break;
                }
                q7hVar = null;
                break;
            case 12:
                q7hVar = y2();
                break;
            case 13:
            case 15:
            default:
                q7hVar = null;
                break;
            case 14:
                q7hVar = z2();
                break;
            case 16:
                q7hVar = A2();
                break;
            case 17:
                q7hVar = B2();
                break;
            case 18:
                q7hVar = C2();
                break;
            case 19:
                long G2 = G2();
                if (G2 == 0 && this.h) {
                    q7hVar = D2();
                    break;
                } else {
                    return G2;
                }
                break;
            case 20:
                q7hVar = E2();
                break;
        }
        if (q7hVar != null) {
            xqxVar = xqx.e(q7hVar, cVar.m());
        } else if (V0 >= 20) {
            xqx X2 = X2(V0);
            xqxVar = (X2 != null || V0 < 32 || V0 > 35) ? X2 : DateUtils.p0(Q2(), null);
        }
        if (xqxVar != null) {
            long g = xqxVar.g();
            int i2 = xqxVar.f31549a.b.d;
            if (g >= 0 || i2 <= 0) {
                j = g * 1000;
                i = i2 / 1000000;
            } else {
                j = (g + 1) * 1000;
                i = (i2 / 1000000) - 1000;
            }
            return j + i;
        }
        String Q22 = Q2();
        if (Q22.isEmpty() || "null".equals(Q22)) {
            this.h = true;
            return 0L;
        } else if ("0000-00-00T00:00:00".equals(Q22) || "0001-01-01T00:00:00+08:00".equals(Q22)) {
            return 0L;
        } else {
            if (Q22.startsWith("/Date(", 0) && Q22.endsWith(")/")) {
                String substring = Q22.substring(6, Q22.length() - 2);
                int indexOf = substring.indexOf(43);
                if (indexOf == -1) {
                    indexOf = substring.indexOf(45);
                }
                if (indexOf != -1) {
                    substring = substring.substring(0, indexOf);
                }
                return Long.parseLong(substring);
            } else if (b2d.h(Q22)) {
                return Long.parseLong(Q22);
            } else {
                throw new JSONException(a1("format " + ((String) null) + " not support, input " + Q22));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0164 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.math.BigDecimal C0() {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.C0():java.math.BigDecimal");
    }

    public final void N2(Object obj, long j) {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            c cVar = this.f2453a;
            jdk J = cVar.i.J(cls, ((cVar.c | j) & Feature.FieldBased.mask) != 0);
            if (J instanceof ldk) {
                ((ldk) J).p(this, obj, j);
            } else if (obj instanceof Map) {
                S1((Map) obj, j);
            } else {
                throw new JSONException("read object not support");
            }
        } else {
            throw new JSONException("object is null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Number Q0() {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.Q0():java.lang.Number");
    }

    public String a1(String str) {
        if (str == null || str.isEmpty()) {
            return "offset " + this.c;
        }
        return str + ", offset " + this.c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void S1(java.util.Map r18, long r19) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.S1(java.util.Map, long):void");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public DateTimeFormatter f2455a;
        public wqx b;
        public long c;
        public TimeZone d;
        public Supplier<Map> e;
        public Supplier<List> f;
        public a g;
        public ft8 h;
        public final ObjectReaderProvider i;

        public c(ObjectReaderProvider objectReaderProvider) {
            oij[] oijVarArr = JSONFactory.f2450a;
            this.c = 0L;
            this.i = objectReaderProvider;
            this.e = null;
            this.f = null;
            this.b = null;
        }

        public void a(uh9 uh9Var) {
            if (uh9Var instanceof a) {
                this.g = (a) uh9Var;
            }
            if (uh9Var instanceof ft8) {
                this.h = (ft8) uh9Var;
            }
        }

        public void b(Feature... featureArr) {
            for (Feature feature : featureArr) {
                this.c |= feature.mask;
            }
        }

        public int c() {
            return 524288;
        }

        public a d() {
            return this.g;
        }

        public DateTimeFormatter e() {
            return this.f2455a;
        }

        public long f() {
            return this.c;
        }

        public jdk g(Type type) {
            boolean z;
            if ((this.c & Feature.FieldBased.mask) != 0) {
                z = true;
            } else {
                z = false;
            }
            return this.i.J(type, z);
        }

        public jdk h(long j) {
            return this.i.G(j);
        }

        public jdk i(String str, Class cls) {
            Class<?> b;
            boolean z;
            a aVar = this.g;
            ObjectReaderProvider objectReaderProvider = this.i;
            if (aVar == null || (b = aVar.b(str, cls, this.c)) == null) {
                return objectReaderProvider.H(str, cls, this.c);
            }
            if ((this.c & Feature.FieldBased.mask) != 0) {
                z = true;
            } else {
                z = false;
            }
            return objectReaderProvider.J(b, z);
        }

        public jdk j(String str, Class cls, long j) {
            Class<?> b;
            boolean z;
            a aVar = this.g;
            ObjectReaderProvider objectReaderProvider = this.i;
            if (aVar == null || (b = aVar.b(str, cls, j)) == null) {
                return objectReaderProvider.H(str, cls, j | this.c);
            }
            if ((Feature.FieldBased.mask & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            return objectReaderProvider.J(b, z);
        }

        public Supplier<Map> k() {
            return this.e;
        }

        public TimeZone l() {
            if (this.d == null) {
                this.d = wqx.c;
            }
            return this.d;
        }

        public wqx m() {
            if (this.b == null) {
                this.b = wqx.d;
            }
            return this.b;
        }

        public boolean n(Feature feature) {
            if ((this.c & feature.mask) != 0) {
                return true;
            }
            return false;
        }

        public void o(Supplier<List> supplier) {
            this.f = supplier;
        }

        public void p(Supplier<Map> supplier) {
            this.e = supplier;
        }

        public c(ObjectReaderProvider objectReaderProvider, long j) {
            this.c = j;
            this.i = objectReaderProvider;
            oij[] oijVarArr = JSONFactory.f2450a;
            this.e = null;
            this.f = null;
            this.b = null;
        }

        public c(ObjectReaderProvider objectReaderProvider, Feature... featureArr) {
            oij[] oijVarArr = JSONFactory.f2450a;
            this.c = 0L;
            this.i = objectReaderProvider;
            this.e = null;
            this.f = null;
            this.b = null;
            for (Feature feature : featureArr) {
                this.c |= feature.mask;
            }
        }

        public c(ObjectReaderProvider objectReaderProvider, w1r w1rVar, uh9 uh9Var, Feature... featureArr) {
            oij[] oijVarArr = JSONFactory.f2450a;
            this.c = 0L;
            this.i = objectReaderProvider;
            this.b = null;
            a(uh9Var);
            for (Feature feature : featureArr) {
                this.c |= feature.mask;
            }
        }
    }

    public final void A(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        long j2;
        int i4 = i2 - i;
        if (this.m > 0) {
            i4--;
        }
        if (i4 <= 38) {
            int i5 = 9;
            int i6 = i4 % 9;
            if (i6 != 0) {
                i5 = i6;
            }
            int i7 = i + i5;
            int i8 = i + 1;
            char c2 = (char) bArr[i];
            char c3 = '.';
            if (c2 == '.') {
                i8 = i + 2;
                c2 = (char) bArr[i8];
                i3 = i7 + 1;
            } else {
                i3 = i7;
            }
            int i9 = c2 - '0';
            while (i8 < i7) {
                char c4 = (char) bArr[i8];
                if (c4 == '.') {
                    i8++;
                    c4 = (char) bArr[i8];
                    i3++;
                    if (i7 < i2) {
                        i7++;
                    }
                }
                i9 = (i9 * 10) + (c4 - '0');
                i8++;
            }
            this.q = i9;
            while (i3 < i2) {
                int i10 = i3 + 9;
                int i11 = i3 + 1;
                char c5 = (char) bArr[i3];
                if (c5 == c3) {
                    i11 = i3 + 2;
                    c5 = (char) bArr[i11];
                    i3 += 10;
                    i10 = i3;
                } else {
                    i3 = i10;
                }
                int i12 = c5 - '0';
                while (i11 < i10) {
                    char c6 = (char) bArr[i11];
                    if (c6 == c3) {
                        i11++;
                        c6 = (char) bArr[i11];
                        i3++;
                        i10++;
                    }
                    i12 = (i12 * 10) + (c6 - '0');
                    i11++;
                }
                long j3 = i12 & tiv.INT_MASK;
                int i13 = 3;
                long j4 = 0;
                int i14 = 3;
                while (i14 >= 0) {
                    if (i14 == 0) {
                        j2 = (1000000000 * (this.n & tiv.INT_MASK)) + j4;
                        this.n = (int) j2;
                    } else if (i14 == 1) {
                        j2 = (1000000000 * (this.o & tiv.INT_MASK)) + j4;
                        this.o = (int) j2;
                    } else if (i14 == 2) {
                        j2 = (1000000000 * (this.p & tiv.INT_MASK)) + j4;
                        this.p = (int) j2;
                    } else if (i14 == i13) {
                        j2 = (1000000000 * (this.q & tiv.INT_MASK)) + j4;
                        this.q = (int) j2;
                    } else {
                        throw new ArithmeticException("BigInteger would overflow supported range");
                    }
                    j4 = j2 >>> 32;
                    i14--;
                    i13 = 3;
                }
                long j5 = (this.q & tiv.INT_MASK) + j3;
                this.q = (int) j5;
                long j6 = j5 >>> 32;
                for (int i15 = 2; i15 >= 0; i15--) {
                    if (i15 == 0) {
                        j = (this.n & tiv.INT_MASK) + j6;
                        this.n = (int) j;
                    } else if (i15 == 1) {
                        j = (this.o & tiv.INT_MASK) + j6;
                        this.o = (int) j;
                    } else if (i15 == 2) {
                        j = (this.p & tiv.INT_MASK) + j6;
                        this.p = (int) j;
                    } else if (i15 == 3) {
                        j = (this.q & tiv.INT_MASK) + j6;
                        this.q = (int) j;
                    } else {
                        throw new ArithmeticException("BigInteger would overflow supported range");
                    }
                    j6 = j >>> 32;
                }
                c3 = '.';
            }
            return;
        }
        throw new JSONException("number too large : ".concat(new String(bArr, i, i4)));
    }

    public final void C(char[] cArr, int i, int i2) {
        int i3;
        long j;
        long j2;
        int i4 = i2 - i;
        if (this.m > 0) {
            i4--;
        }
        if (i4 <= 38) {
            int i5 = 9;
            int i6 = i4 % 9;
            if (i6 != 0) {
                i5 = i6;
            }
            int i7 = i + i5;
            int i8 = i + 1;
            char c2 = cArr[i];
            char c3 = '.';
            int i9 = 2;
            if (c2 == '.') {
                i8 = i + 2;
                c2 = cArr[i8];
                i3 = i7 + 1;
            } else {
                i3 = i7;
            }
            int i10 = c2 - '0';
            while (i8 < i7) {
                char c4 = cArr[i8];
                if (c4 == '.') {
                    i8++;
                    c4 = cArr[i8];
                    i3++;
                    if (i7 < i2) {
                        i7++;
                    }
                }
                i10 = (i10 * 10) + (c4 - '0');
                i8++;
            }
            this.q = i10;
            while (i3 < i2) {
                int i11 = i3 + 9;
                int i12 = i3 + 1;
                char c5 = cArr[i3];
                if (c5 == c3) {
                    i12 = i3 + 2;
                    c5 = cArr[i12];
                    i3 += 10;
                    i11 = i3;
                } else {
                    i3 = i11;
                }
                int i13 = c5 - '0';
                while (i12 < i11) {
                    char c6 = cArr[i12];
                    if (c6 == c3) {
                        i12++;
                        c6 = cArr[i12];
                        i3++;
                        i11++;
                    }
                    i13 = (i13 * 10) + (c6 - '0');
                    i12++;
                }
                long j3 = 0;
                int i14 = 3;
                while (i14 >= 0) {
                    if (i14 == 0) {
                        j2 = (1000000000 * (this.n & tiv.INT_MASK)) + j3;
                        this.n = (int) j2;
                    } else if (i14 == 1) {
                        j2 = (1000000000 * (this.o & tiv.INT_MASK)) + j3;
                        this.o = (int) j2;
                    } else if (i14 == i9) {
                        j2 = (1000000000 * (this.p & tiv.INT_MASK)) + j3;
                        this.p = (int) j2;
                    } else if (i14 == 3) {
                        j2 = (1000000000 * (this.q & tiv.INT_MASK)) + j3;
                        this.q = (int) j2;
                    } else {
                        throw new ArithmeticException("BigInteger would overflow supported range");
                    }
                    j3 = j2 >>> 32;
                    i14--;
                    i9 = 2;
                }
                long j4 = (this.q & tiv.INT_MASK) + (i13 & tiv.INT_MASK);
                this.q = (int) j4;
                long j5 = j4 >>> 32;
                for (int i15 = 2; i15 >= 0; i15--) {
                    if (i15 == 0) {
                        j = (this.n & tiv.INT_MASK) + j5;
                        this.n = (int) j;
                    } else if (i15 == 1) {
                        j = (this.o & tiv.INT_MASK) + j5;
                        this.o = (int) j;
                    } else if (i15 == 2) {
                        j = (this.p & tiv.INT_MASK) + j5;
                        this.p = (int) j;
                    } else if (i15 == 3) {
                        j = (this.q & tiv.INT_MASK) + j5;
                        this.q = (int) j;
                    } else {
                        throw new ArithmeticException("BigInteger would overflow supported range");
                    }
                    j5 = j >>> 32;
                }
                c3 = '.';
                i9 = 2;
            }
            return;
        }
        throw new JSONException("number too large : ".concat(new String(cArr, i, i4)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final char F(int i) {
        if (!(i == 34 || i == 35 || i == 64)) {
            if (i == 70) {
                return '\f';
            }
            if (i != 95) {
                if (i == 98) {
                    return '\b';
                }
                if (i == 102) {
                    return '\f';
                }
                if (i == 110) {
                    return '\n';
                }
                if (i == 114) {
                    return '\r';
                }
                if (i == 116) {
                    return '\t';
                }
                if (i == 118) {
                    return (char) 11;
                }
                switch (i) {
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                        break;
                    default:
                        switch (i) {
                            case 46:
                            case 47:
                                break;
                            case 48:
                                return (char) 0;
                            case 49:
                                return (char) 1;
                            case 50:
                                return (char) 2;
                            case 51:
                                return (char) 3;
                            case 52:
                                return (char) 4;
                            case 53:
                                return (char) 5;
                            case 54:
                                return (char) 6;
                            case 55:
                                return (char) 7;
                            default:
                                switch (i) {
                                    case 91:
                                    case 92:
                                    case 93:
                                        break;
                                    default:
                                        throw new JSONException(a1("unclosed.str '\\" + ((char) i)));
                                }
                        }
                }
            }
        }
        return (char) i;
    }
}
