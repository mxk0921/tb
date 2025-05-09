package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class yfk implements jdk {

    /* renamed from: a  reason: collision with root package name */
    public final Class f32050a;
    public final Class b;
    public final long c;

    public yfk(Class cls, Class cls2) {
        this.f32050a = cls;
        this.b = cls2;
        this.c = ls9.a(TypeUtils.n(cls2));
    }

    @Override // tb.jdk
    public Object D(long j) {
        Class cls = this.b;
        if (cls == ArrayList.class) {
            return new ArrayList();
        }
        if (cls == LinkedList.class) {
            return new LinkedList();
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            throw new JSONException("create list error, type " + cls);
        }
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
    public Object i(Collection collection) {
        Collection collection2 = (Collection) D(0L);
        for (Object obj : collection) {
            collection2.add(TypeUtils.S(obj));
        }
        return collection2;
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
        Collection collection;
        if (jSONReader.w) {
            return q(jSONReader, type, obj, 0L);
        }
        if (jSONReader.n2()) {
            return null;
        }
        boolean l1 = jSONReader.l1();
        JSONReader.c cVar = jSONReader.f2453a;
        if (l1) {
            Collection collection2 = (Collection) D(j | cVar.c);
            String Q2 = jSONReader.Q2();
            if (Q2.indexOf(44) != -1) {
                for (String str : Q2.split(",")) {
                    collection2.add(Long.valueOf(Long.parseLong(str)));
                }
            } else {
                collection2.add(Long.valueOf(Long.parseLong(Q2)));
            }
            jSONReader.w1();
            return collection2;
        }
        boolean G1 = jSONReader.G1();
        if (jSONReader.f0() == '[') {
            jSONReader.t1();
            if (!G1 || this.b != Collection.class) {
                collection = (Collection) D(j | cVar.c);
            } else {
                collection = new LinkedHashSet();
            }
            while (!jSONReader.e1()) {
                if (jSONReader.u1()) {
                    jSONReader.w1();
                    return collection;
                } else if (jSONReader.f0() != ',') {
                    collection.add(jSONReader.q2());
                } else {
                    throw new JSONException(jSONReader.a1("illegal input error"));
                }
            }
            throw new JSONException(jSONReader.a1("illegal input error"));
        }
        throw new JSONException(jSONReader.a1("format error"));
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        Collection collection;
        k2a d;
        if (jSONReader.C1()) {
            return null;
        }
        Class cls = this.f32050a;
        jdk c0 = jSONReader.c0(cls, this.c, j);
        if (c0 != null) {
            cls = c0.b();
        }
        if (cls == ArrayList.class) {
            collection = new ArrayList();
        } else if (cls == JSONArray.class) {
            collection = new JSONArray();
        } else if (cls == null || cls == this.f32050a) {
            collection = (Collection) D(j | jSONReader.f2453a.c);
        } else {
            collection = (Collection) c0.D(j);
        }
        int c3 = jSONReader.c3();
        for (int i = 0; i < c3; i++) {
            collection.add(jSONReader.q2());
        }
        if (c0 == null || (d = c0.d()) == null) {
            return collection;
        }
        return (Collection) d.apply(collection);
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
    public /* synthetic */ void s(Object obj, String str, Object obj2, long j) {
    }
}
