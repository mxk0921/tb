package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lek implements jdk {

    /* renamed from: a  reason: collision with root package name */
    public static final long f23296a = ls9.a("declaringClass");
    public static final long b = ls9.a("name");

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

    public final Field c(long j, String str, String str2) {
        if ((j & JSONReader.Feature.SupportClassForName.mask) != 0) {
            try {
                return TypeUtils.r(str2).getDeclaredField(str);
            } catch (NoSuchFieldException e) {
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

    public Object e(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.v1()) {
            String Q2 = jSONReader.Q2();
            String Q22 = jSONReader.Q2();
            if (jSONReader.u1()) {
                jSONReader.w1();
                return c(jSONReader.f2453a.c | j, Q22, Q2);
            }
            throw new JSONException("not support input " + jSONReader.Z0());
        }
        throw new JSONException("not support input " + jSONReader.Z0());
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
        boolean F1 = jSONReader.F1();
        boolean z = jSONReader.w;
        if (F1) {
            String str = null;
            String str2 = null;
            while (!jSONReader.E1()) {
                long h2 = jSONReader.h2();
                if (h2 == f23296a) {
                    str2 = jSONReader.Q2();
                } else if (h2 == b) {
                    str = jSONReader.Q2();
                } else {
                    jSONReader.b3();
                }
            }
            if (!z) {
                jSONReader.w1();
            }
            return c(j | jSONReader.f2453a.c, str, str2);
        } else if (!jSONReader.o1(j)) {
            throw new JSONException("not support input " + jSONReader.Z0());
        } else if (z) {
            return r(jSONReader, type, obj, j);
        } else {
            return e(jSONReader, type, obj, j);
        }
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        return o(jSONReader, type, obj, j);
    }

    @Override // tb.jdk
    public Object r(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.c3() == 2) {
            String Q2 = jSONReader.Q2();
            return c(j | jSONReader.f2453a.c, jSONReader.Q2(), Q2);
        }
        throw new JSONException("not support input " + jSONReader.Z0());
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
    public /* synthetic */ void s(Object obj, String str, Object obj2, long j) {
    }
}
