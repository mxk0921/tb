package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lgk implements jdk<Method> {

    /* renamed from: a  reason: collision with root package name */
    public static final long f23324a = ls9.a("declaringClass");
    public static final long b = ls9.a("name");
    public static final long c = ls9.a("parameterTypes");

    @Override // tb.jdk
    public /* synthetic */ Method D(long j) {
        cdk.d(this, j);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.reflect.Method] */
    @Override // tb.jdk
    public /* synthetic */ Method F(JSONReader jSONReader) {
        return cdk.l(this, jSONReader);
    }

    @Override // tb.jdk
    public /* synthetic */ String G() {
        return JSON.DEFAULT_TYPE_KEY;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.reflect.Method] */
    @Override // tb.jdk
    public /* synthetic */ Method a() {
        return cdk.c(this);
    }

    @Override // tb.jdk
    public /* synthetic */ Class<Method> b() {
        return null;
    }

    public final Method c(long j, String str, String str2, List<String> list) {
        Class<?>[] clsArr;
        if ((j & JSONReader.Feature.SupportClassForName.mask) != 0) {
            Class r = TypeUtils.r(str2);
            if (list == null) {
                clsArr = new Class[0];
            } else {
                Class<?>[] clsArr2 = new Class[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    clsArr2[i] = TypeUtils.r(list.get(i));
                }
                clsArr = clsArr2;
            }
            try {
                return r.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e) {
                throw new JSONException("method not found", e);
            }
        } else {
            throw new JSONException("ClassForName not support");
        }
    }

    @Override // tb.jdk
    public /* synthetic */ k2a d() {
        return null;
    }

    /* renamed from: e */
    public Method r(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.c3() == 3) {
            String Q2 = jSONReader.Q2();
            return c(jSONReader.f2453a.c | j, jSONReader.Q2(), Q2, jSONReader.V1(String.class));
        }
        throw new JSONException("not support input " + jSONReader.Z0());
    }

    public Method f(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.v1()) {
            String Q2 = jSONReader.Q2();
            String Q22 = jSONReader.Q2();
            List V1 = jSONReader.V1(String.class);
            if (jSONReader.u1()) {
                jSONReader.w1();
                return c(jSONReader.f2453a.c | j, Q22, Q2, V1);
            }
            throw new JSONException("not support input " + jSONReader.Z0());
        }
        throw new JSONException("not support input " + jSONReader.Z0());
    }

    /* renamed from: g */
    public Method q(JSONReader jSONReader, Type type, Object obj, long j) {
        return o(jSONReader, type, obj, j);
    }

    @Override // tb.jdk
    public /* synthetic */ g79 h(long j) {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ Method i(Collection collection) {
        cdk.e(this, collection);
        throw null;
    }

    @Override // tb.jdk
    public /* synthetic */ g79 j(String str) {
        return cdk.h(this, str);
    }

    /* renamed from: k */
    public Method o(JSONReader jSONReader, Type type, Object obj, long j) {
        boolean F1 = jSONReader.F1();
        boolean z = jSONReader.w;
        if (F1) {
            String str = null;
            String str2 = null;
            List list = null;
            while (!jSONReader.E1()) {
                long h2 = jSONReader.h2();
                if (h2 == f23324a) {
                    str2 = jSONReader.Q2();
                } else if (h2 == b) {
                    str = jSONReader.Q2();
                } else if (h2 == c) {
                    list = jSONReader.V1(String.class);
                } else {
                    jSONReader.b3();
                }
            }
            if (!z) {
                jSONReader.w1();
            }
            return c(jSONReader.f2453a.c | j, str, str2, list);
        } else if (!jSONReader.o1(j)) {
            throw new JSONException("not support input " + jSONReader.Z0());
        } else if (z) {
            return r(jSONReader, type, obj, j);
        } else {
            return f(jSONReader, type, obj, j);
        }
    }

    @Override // tb.jdk
    public /* synthetic */ long m() {
        return jdk.HASH_TYPE;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.reflect.Method] */
    @Override // tb.jdk
    public /* synthetic */ Method t(Map map, JSONReader.Feature... featureArr) {
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

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.reflect.Method] */
    @Override // tb.jdk
    public /* synthetic */ Method x(Map map, long j) {
        return cdk.f(this, map, j);
    }

    @Override // tb.jdk
    public /* synthetic */ jdk z(JSONReader.c cVar, long j) {
        return cdk.a(this, cVar, j);
    }

    @Override // tb.jdk
    public /* synthetic */ void s(Object obj, String str, Object obj2, long j) {
    }
}
