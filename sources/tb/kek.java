package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class kek implements jdk {

    /* renamed from: a  reason: collision with root package name */
    public final Method f22617a;
    public final Type b;
    public final Member c;
    public final Class d;
    public final Enum[] e;
    public final Enum[] f;
    public final long[] g;
    public final String[] h;
    public final long[] i;

    public kek(Class cls, Method method, Member member, Enum[] enumArr, Enum[] enumArr2, long[] jArr) {
        Class<?> cls2;
        Object obj;
        this.d = cls;
        this.f22617a = method;
        if (member instanceof AccessibleObject) {
            ((AccessibleObject) member).setAccessible(true);
        }
        this.c = member;
        Class<?> cls3 = null;
        if (member instanceof Field) {
            cls2 = ((Field) member).getType();
        } else if (member instanceof Method) {
            cls2 = ((Method) member).getReturnType();
        } else {
            cls2 = null;
        }
        if (cls2 != null) {
            if (cls2 == String.class) {
                this.h = new String[enumArr.length];
            } else {
                this.i = new long[enumArr.length];
            }
            for (int i = 0; i < enumArr.length; i++) {
                Enum r11 = enumArr[i];
                try {
                    if (member instanceof Field) {
                        obj = ((Field) member).get(r11);
                    } else {
                        obj = ((Method) member).invoke(r11, new Object[0]);
                    }
                    if (cls2 == String.class) {
                        this.h[i] = (String) obj;
                    } else if (obj instanceof Number) {
                        this.i[i] = ((Number) obj).longValue();
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (method != null) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1) {
                cls3 = parameterTypes[0];
            }
        }
        this.b = cls3;
        ls9.a(TypeUtils.n(cls));
        this.e = enumArr;
        this.f = enumArr2;
        this.g = jArr;
    }

    @Override // tb.jdk
    public /* synthetic */ Object D(long j) {
        cdk.d(this, j);
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
        return this.d;
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

    public Enum e(long j) {
        int binarySearch;
        Enum[] enumArr = this.e;
        if (enumArr != null && (binarySearch = Arrays.binarySearch(this.g, j)) >= 0) {
            return enumArr[binarySearch];
        }
        return null;
    }

    public Enum f(int i) {
        if (i >= 0) {
            Enum[] enumArr = this.f;
            if (i < enumArr.length) {
                return enumArr[i];
            }
        }
        throw new JSONException("No enum ordinal " + this.d.getCanonicalName() + "." + i);
    }

    public Enum g(int i) {
        Enum r4;
        Member member = this.c;
        if (member == null) {
            r4 = f(i);
        } else {
            try {
                boolean z = member instanceof Field;
                Enum[] enumArr = this.e;
                int i2 = 0;
                r4 = null;
                if (z) {
                    int length = enumArr.length;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        Enum r5 = enumArr[i2];
                        if (((Field) member).getInt(r5) == i) {
                            r4 = r5;
                            break;
                        }
                        i2++;
                    }
                } else {
                    Method method = (Method) member;
                    for (Enum r6 : enumArr) {
                        if (((Number) method.invoke(r6, new Object[0])).intValue() == i) {
                            r4 = r6;
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                throw new JSONException("parse enum error, class " + this.d.getName() + ", value " + i, e);
            }
        }
        if (r4 != null) {
            return r4;
        }
        throw new JSONException("None enum ordinal or value " + i);
    }

    @Override // tb.jdk
    public /* synthetic */ g79 h(long j) {
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

    @Override // tb.jdk
    public /* synthetic */ Object r(JSONReader jSONReader, Type type, Object obj, long j) {
        cdk.i(this, jSONReader, type, obj, j);
        throw null;
    }

    @Override // tb.jdk
    public /* synthetic */ Object t(Map map, JSONReader.Feature... featureArr) {
        return cdk.g(this, map, featureArr);
    }

    @Override // tb.jdk
    public /* synthetic */ g79 u(long j) {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ long v() {
        return 0L;
    }

    @Override // tb.jdk
    public /* synthetic */ jdk w(ObjectReaderProvider objectReaderProvider, long j) {
        return cdk.b(this, objectReaderProvider, j);
    }

    @Override // tb.jdk
    public /* synthetic */ Object x(Map map, long j) {
        return cdk.f(this, map, j);
    }

    @Override // tb.jdk
    public /* synthetic */ jdk z(JSONReader.c cVar, long j) {
        return cdk.a(this, cVar, j);
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        Enum r1;
        int T0 = jSONReader.T0();
        int W0 = jSONReader.W0();
        if (W0 == -110) {
            jdk c0 = jSONReader.c0(this.d, 0L, j);
            if (c0 != null) {
                if (c0 != this) {
                    return c0.q(jSONReader, type, obj, j);
                }
            } else if (jSONReader.d1(JSONReader.Feature.ErrorOnNotSupportAutoType)) {
                throw new JSONException(jSONReader.a1("not support enumType : " + jSONReader.U0()));
            }
        }
        if (W0 >= -16 && W0 <= 72) {
            if (W0 <= 47) {
                jSONReader.t1();
            } else {
                W0 = jSONReader.p2();
            }
            r1 = f(W0);
        } else if (jSONReader.D1()) {
            return null;
        } else {
            r1 = e(jSONReader.V2());
            if (r1 == null) {
                r1 = e(jSONReader.P0());
            }
        }
        if (r1 != null || jSONReader.T0() != T0 || !(type instanceof ParameterizedType) || !List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
            return r1;
        }
        throw new JSONException(kek.class.getSimpleName().concat(" parses error, JSONReader not forward when field type belongs to collection to avoid OOM"));
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        int i;
        Enum r7;
        Class cls;
        int i2 = 0;
        int T0 = jSONReader.T0();
        Type type2 = this.b;
        Class cls2 = this.d;
        if (type2 != null) {
            Object P1 = jSONReader.P1(type2);
            try {
                return this.f22617a.invoke(null, P1);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new JSONException(jSONReader.a1("create enum error, enumClass " + cls2.getName() + ", paramValue " + P1), e);
            }
        } else {
            boolean h1 = jSONReader.h1();
            Enum[] enumArr = this.e;
            Member member = this.c;
            long[] jArr = this.i;
            if (h1) {
                int p2 = jSONReader.p2();
                if (member == null) {
                    r7 = f(p2);
                } else {
                    if (jArr != null) {
                        while (i2 < jArr.length) {
                            cls2 = cls2;
                            if (jArr[i2] == p2) {
                                r7 = enumArr[i2];
                                break;
                            }
                            i2++;
                            cls2 = cls2;
                        }
                    }
                    r7 = null;
                    if (r7 == null && jSONReader.d1(JSONReader.Feature.ErrorOnEnumNotMatch)) {
                        throw new JSONException(jSONReader.a1("parse enum error, class " + cls2.getName() + ", " + member.getName() + " " + p2));
                    }
                }
                i = T0;
            } else if (!jSONReader.D1()) {
                String[] strArr = this.h;
                if (strArr == null || !jSONReader.l1()) {
                    cls = cls2;
                    if (jArr != null && jSONReader.l1()) {
                        int p22 = jSONReader.p2();
                        while (true) {
                            if (i2 >= jArr.length) {
                                i = T0;
                                r7 = null;
                                break;
                            }
                            i = T0;
                            if (jArr[i2] == p22) {
                                r7 = enumArr[i2];
                                break;
                            }
                            i2++;
                            T0 = i;
                        }
                    } else {
                        i = T0;
                        long V2 = jSONReader.V2();
                        if (V2 == ls9.MAGIC_HASH_CODE) {
                            return null;
                        }
                        r7 = e(V2);
                        if (r7 == null) {
                            r7 = e(jSONReader.P0());
                        }
                    }
                } else {
                    String Q2 = jSONReader.Q2();
                    while (true) {
                        if (i2 >= strArr.length) {
                            r7 = null;
                            break;
                        } else if (Q2.equals(strArr[i2])) {
                            r7 = enumArr[i2];
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (r7 != null || member == null) {
                        cls = cls2;
                    } else {
                        cls = cls2;
                        try {
                            r7 = Enum.valueOf(cls, Q2);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    i = T0;
                }
                if (r7 == null && jSONReader.d1(JSONReader.Feature.ErrorOnEnumNotMatch)) {
                    String U0 = jSONReader.U0();
                    throw new JSONException(jSONReader.a1("parse enum error, class " + cls.getName() + ", value " + U0));
                }
            } else {
                i = T0;
                r7 = null;
            }
            if (r7 != null || jSONReader.T0() != i || !(type instanceof ParameterizedType) || !List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return r7;
            }
            throw new JSONException(kek.class.getSimpleName().concat(" parses error, JSONReader not forward when field type belongs to collection to avoid OOM"));
        }
    }

    @Override // tb.jdk
    public /* synthetic */ void s(Object obj, String str, Object obj2, long j) {
    }
}
