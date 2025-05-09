package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class bgk implements jdk {

    /* renamed from: a  reason: collision with root package name */
    public final Class f16373a;
    public final Class b;

    public bgk(Class cls, Class cls2) {
        this.f16373a = cls;
        this.b = cls2;
    }

    public static /* synthetic */ Collection f(Collection collection) {
        return Collections.singleton(collection.iterator().next());
    }

    public static /* synthetic */ Collection g(Collection collection) {
        return Collections.singletonList(collection.iterator().next());
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
    public Class b() {
        return this.f16373a;
    }

    @Override // tb.jdk
    public /* synthetic */ k2a d() {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ g79 h(long j) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    @Override // tb.jdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(java.util.Collection r4) {
        /*
            r3 = this;
            java.lang.Class r0 = r3.f16373a
            boolean r0 = r0.isInstance(r4)
            if (r0 == 0) goto L_0x001c
            java.util.Iterator r0 = r4.iterator()
        L_0x000c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r0.next()
            boolean r1 = r1 instanceof java.lang.String
            if (r1 != 0) goto L_0x000c
            goto L_0x001c
        L_0x001b:
            return r4
        L_0x001c:
            r0 = 0
            java.lang.Object r0 = r3.D(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r4 = r4.iterator()
        L_0x0028:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r4.next()
            if (r1 == 0) goto L_0x0041
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            java.lang.String r1 = tb.wqf.q(r1)
            r0.add(r1)
            goto L_0x0028
        L_0x0041:
            r0.add(r1)
            goto L_0x0028
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bgk.i(java.util.Collection):java.lang.Object");
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
        if (jSONReader.G1()) {
            collection = new HashSet();
        } else {
            collection = (Collection) D(jSONReader.f2453a.c | j);
        }
        char f0 = jSONReader.f0();
        if (f0 == '[') {
            jSONReader.t1();
            while (!jSONReader.u1()) {
                collection.add(jSONReader.Q2());
            }
        } else if (f0 == '\"' || f0 == '\'' || f0 == '{') {
            String Q2 = jSONReader.Q2();
            if (!Q2.isEmpty()) {
                collection.add(Q2);
            }
        } else {
            throw new JSONException(jSONReader.Z0());
        }
        jSONReader.w1();
        return collection;
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        Class cls;
        Collection collection;
        k2a k2aVar = null;
        if (jSONReader.C1()) {
            return null;
        }
        jdk c0 = jSONReader.c0(this.f16373a, 0L, j);
        if (c0 != null) {
            cls = c0.b();
        } else {
            cls = this.b;
        }
        int i = 0;
        if (cls == xfk.o) {
            int c3 = jSONReader.c3();
            String[] strArr = new String[c3];
            while (i < c3) {
                strArr[i] = jSONReader.Q2();
                i++;
            }
            return Arrays.asList(strArr);
        }
        int c32 = jSONReader.c3();
        if (cls == ArrayList.class) {
            if (c32 > 0) {
                collection = new ArrayList(c32);
            } else {
                collection = new ArrayList();
            }
        } else if (cls == JSONArray.class) {
            if (c32 > 0) {
                collection = new JSONArray(c32);
            } else {
                collection = new JSONArray();
            }
        } else if (cls == xfk.p) {
            collection = new ArrayList();
            k2aVar = new gfk();
        } else if (cls == xfk.q) {
            collection = new ArrayList();
            k2aVar = new hfk();
        } else if (cls == xfk.r) {
            collection = new LinkedHashSet();
            k2aVar = new ifk();
        } else if (cls == xfk.m) {
            collection = new ArrayList();
            k2aVar = new k2a() { // from class: tb.zfk
                @Override // tb.k2a
                public final Object apply(Object obj2) {
                    Collection f;
                    f = bgk.f((Collection) obj2);
                    return f;
                }
            };
        } else if (cls == xfk.n) {
            collection = new ArrayList();
            k2aVar = new k2a() { // from class: tb.agk
                @Override // tb.k2a
                public final Object apply(Object obj2) {
                    Collection g;
                    g = bgk.g((Collection) obj2);
                    return g;
                }
            };
        } else if (cls == null || cls == this.f16373a) {
            collection = (Collection) D(j | jSONReader.f2453a.c);
        } else {
            try {
                collection = (Collection) cls.newInstance();
            } catch (IllegalAccessException | InstantiationException e) {
                throw new JSONException(jSONReader.a1("create instance error " + cls), e);
            }
        }
        while (i < c32) {
            collection.add(jSONReader.Q2());
            i++;
        }
        if (k2aVar != null) {
            return (Collection) k2aVar.apply(collection);
        }
        return collection;
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
