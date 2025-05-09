package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tek implements jdk {

    /* renamed from: a  reason: collision with root package name */
    public final Type f28664a;
    public final Class<?> b;
    public jdk c;
    public final long d;

    public tek(GenericArrayType genericArrayType) {
        TypeUtils.i(genericArrayType);
        Type genericComponentType = genericArrayType.getGenericComponentType();
        this.f28664a = genericComponentType;
        Class<?> m = TypeUtils.m(genericComponentType);
        this.b = m;
        this.d = ls9.a("[" + TypeUtils.n(m));
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
    public /* synthetic */ Class b() {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ k2a d() {
        return null;
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
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        Object obj2;
        jdk jdkVar = this.c;
        Type type2 = this.f28664a;
        if (jdkVar == null) {
            this.c = jSONReader.f2453a.g(type2);
        }
        if (jSONReader.w) {
            return q(jSONReader, type, obj, 0L);
        }
        if (jSONReader.n2()) {
            return null;
        }
        char f0 = jSONReader.f0();
        if (f0 != '\"') {
            ArrayList arrayList = new ArrayList();
            if (f0 == '[') {
                jSONReader.t1();
                while (!jSONReader.u1()) {
                    jdk jdkVar2 = this.c;
                    if (jdkVar2 != null) {
                        obj2 = jdkVar2.o(jSONReader, this.f28664a, null, 0L);
                    } else if (type2 == String.class) {
                        obj2 = jSONReader.Q2();
                    } else {
                        throw new JSONException(jSONReader.a1("TODO : " + type2));
                    }
                    arrayList.add(obj2);
                    jSONReader.w1();
                }
                jSONReader.w1();
                Object newInstance = Array.newInstance(this.b, arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    Array.set(newInstance, i, arrayList.get(i));
                }
                return newInstance;
            }
            throw new JSONException(jSONReader.Z0());
        } else if (!(type instanceof GenericArrayType) || ((GenericArrayType) type).getGenericComponentType() != Byte.TYPE) {
            if (jSONReader.Q2().isEmpty()) {
                return null;
            }
            throw new JSONException(jSONReader.Z0());
        } else if ((jSONReader.B0(j) & JSONReader.Feature.Base64StringAsByteArray.mask) != 0) {
            return b2d.c(jSONReader.Q2());
        } else {
            return jSONReader.Y1();
        }
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
        if (!jSONReader.y1((byte) -110) || jSONReader.T2() == this.d) {
            int c3 = jSONReader.c3();
            if (c3 > 0 && this.c == null) {
                this.c = jSONReader.f2453a.g(this.f28664a);
            }
            Object newInstance = Array.newInstance(this.b, c3);
            for (int i = 0; i < c3; i++) {
                Array.set(newInstance, i, this.c.q(jSONReader, this.f28664a, null, 0L));
            }
            return newInstance;
        }
        String U0 = jSONReader.U0();
        throw new JSONException("not support input typeName " + U0);
    }

    @Override // tb.jdk
    public /* synthetic */ void s(Object obj, String str, Object obj2, long j) {
    }
}
