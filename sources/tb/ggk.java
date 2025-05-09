package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.Supplier;
import com.alibaba.fastjson2.i;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ggk implements jdk {
    public static final ggk INSTANCE = new ggk(null, HashMap.class, 77, HashMap.class, 0, null);
    public static final ggk INSTANCE_OBJECT = new ggk(null, JSONObject.class, -2622135058008237800L, JSONObject.class, 0, null);

    /* renamed from: a  reason: collision with root package name */
    public final Class f19974a;
    public final long b;
    public final Class c;
    public final long d;
    public final k2a e;
    public final boolean f;
    public final Object g;
    public volatile boolean h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements k2a<Map, Map> {
        /* renamed from: a */
        public Map apply(Map map) {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
    }

    public ggk(Class cls, long j, Object obj) {
        this(cls, cls, cls, j, null);
        this.g = obj;
    }

    @Override // tb.jdk
    public Object D(long j) {
        Class cls = this.c;
        if (cls == HashMap.class) {
            return new HashMap();
        }
        if (cls == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (cls == JSONObject.class) {
            return new JSONObject();
        }
        Object obj = this.g;
        if (obj != null) {
            return obj;
        }
        String name = cls.getName();
        if (name.equals("java.util.ImmutableCollections$Map1")) {
            return new HashMap();
        }
        if (name.equals("java.util.ImmutableCollections$MapN")) {
            return new LinkedHashMap();
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            throw new JSONException("create map error : " + cls);
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
    public Class b() {
        return this.f19974a;
    }

    @Override // tb.jdk
    public k2a d() {
        return this.e;
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
        Map map;
        Class cls;
        if (jSONReader.w) {
            return q(jSONReader, type, obj, j);
        }
        if (jSONReader.C1()) {
            return null;
        }
        JSONReader.c cVar = jSONReader.f2453a;
        Supplier<Map> k = cVar.k();
        if (k == null || !((cls = this.f19974a) == null || cls == JSONObject.class || "com.alibaba.fastjson.JSONObject".equals(cls.getName()))) {
            map = (Map) D(cVar.c | j);
        } else {
            map = k.get();
        }
        if (!jSONReader.l1() || jSONReader.r1()) {
            jSONReader.S1(map, j);
        } else {
            String Q2 = jSONReader.Q2();
            if (!Q2.isEmpty()) {
                JSONReader L1 = JSONReader.L1(Q2, jSONReader.E0());
                try {
                    L1.S1(map, j);
                    ((i) L1).close();
                } catch (Throwable th) {
                    try {
                        ((i) L1).close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        jSONReader.w1();
        if (this.f) {
            return JSONFactory.a(map);
        }
        k2a k2aVar = this.e;
        if (k2aVar != null) {
            return k2aVar.apply(map);
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x00f3 A[EDGE_INSN: B:114:0x00f3->B:48:0x00f3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0156  */
    @Override // tb.jdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(com.alibaba.fastjson2.JSONReader r20, java.lang.reflect.Type r21, java.lang.Object r22, long r23) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ggk.q(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
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
    public Object x(Map map, long j) {
        Class cls = this.f19974a;
        if (cls.isInstance(map)) {
            return map;
        }
        if (cls == JSONObject.class) {
            return new JSONObject(map);
        }
        Map map2 = (Map) D(j);
        map2.putAll(map);
        if (this.f) {
            return JSONFactory.a(map2);
        }
        k2a k2aVar = this.e;
        if (k2aVar != null) {
            return k2aVar.apply(map2);
        }
        return map2;
    }

    @Override // tb.jdk
    public /* synthetic */ jdk z(JSONReader.c cVar, long j) {
        return cdk.a(this, cVar, j);
    }

    public ggk(Type type, Class cls, Class cls2, long j, k2a k2aVar) {
        this(type, cls, ls9.a(TypeUtils.n(cls)), cls2, j, k2aVar);
    }

    public ggk(Type type, Class cls, long j, Class cls2, long j2, k2a k2aVar) {
        this.f19974a = cls;
        this.b = j;
        this.c = cls2;
        this.d = j2;
        this.e = k2aVar;
        this.f = cls != null && cls.getName().equals("com.alibaba.fastjson.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.jdk c(java.lang.reflect.Type r16, java.lang.Class r17, long r18) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ggk.c(java.lang.reflect.Type, java.lang.Class, long):tb.jdk");
    }

    @Override // tb.jdk
    public /* synthetic */ void s(Object obj, String str, Object obj2, long j) {
    }
}
