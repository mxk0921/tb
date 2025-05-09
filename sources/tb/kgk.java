package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.c;
import com.alibaba.fastjson2.function.Supplier;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kgk implements jdk {

    /* renamed from: a  reason: collision with root package name */
    public final Class f22653a;
    public final Class b;
    public final Type c;
    public final Type d;
    public final Class e;
    public final long f;
    public final k2a g;
    public final Constructor h;
    public jdk i;
    public jdk j;

    public kgk(Class cls, Class cls2, Type type, Type type2, long j, k2a k2aVar) {
        Constructor<?> constructor = null;
        type = type == Object.class ? null : type;
        this.f22653a = cls;
        this.b = cls2;
        this.c = type;
        this.d = type2;
        this.e = TypeUtils.i(type2);
        this.f = j;
        this.g = k2aVar;
        Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Constructor<?> constructor2 = declaredConstructors[i];
            if (constructor2.getParameterTypes().length == 0 && !Modifier.isPublic(constructor2.getModifiers())) {
                constructor2.setAccessible(true);
                constructor = constructor2;
                break;
            }
            i++;
        }
        this.h = constructor;
    }

    @Override // tb.jdk
    public Object D(long j) {
        Class cls = this.b;
        if (cls == null || cls.isInterface()) {
            return new HashMap();
        }
        try {
            Constructor constructor = this.h;
            if (constructor != null) {
                return constructor.newInstance(new Object[0]);
            }
            return cls.newInstance();
        } catch (Exception e) {
            throw new JSONException("create map error", e);
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
        return this.f22653a;
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
        int i;
        int i2;
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Object obj2;
        boolean z;
        Object obj3;
        Object obj4;
        char c;
        Object b;
        Map map5;
        Map map6;
        Map map7;
        Object obj5 = null;
        if (jSONReader.F1()) {
            i = 0;
        } else if (jSONReader.r1()) {
            jSONReader.Z2(false);
            i = 1;
        } else if (jSONReader.D1()) {
            return null;
        } else {
            throw new JSONException(jSONReader.a1("expect '{', but '" + jSONReader.f0() + "'"));
        }
        JSONReader.c cVar = jSONReader.f2453a;
        long j2 = cVar.c | j;
        if (this.b == HashMap.class) {
            Supplier<Map> k = cVar.k();
            if (this.f22653a != Map.class || k == null) {
                map7 = new HashMap();
                map6 = null;
            } else {
                map7 = k.get();
                map6 = TypeUtils.k(map7);
            }
            i2 = i;
            map2 = map7;
            map = map6;
        } else {
            i2 = i;
            map2 = (Map) D(j2);
            map = null;
        }
        while (!jSONReader.E1() && !jSONReader.e1()) {
            if (!jSONReader.C1()) {
                Type type2 = this.c;
                if (type2 == String.class) {
                    b = jSONReader.g2();
                    if (i2 != 0 || (j2 & JSONReader.Feature.SupportAutoType.mask) == 0 || !b.equals(JSON.DEFAULT_TYPE_KEY)) {
                        map4 = map2;
                        map3 = map;
                        if (b == null) {
                            b = jSONReader.Q2();
                            if (!jSONReader.z1(f7l.CONDITION_IF_MIDDLE)) {
                                throw new JSONException(jSONReader.a1("illegal json"));
                            }
                        }
                        obj5 = b;
                    } else {
                        map4 = map2;
                        map3 = map;
                        jdk S0 = jSONReader.S0(jSONReader.T2(), this.f22653a, j);
                        if (S0 != null && (S0 instanceof ggk) && !map4.getClass().equals(((ggk) S0).c)) {
                            map5 = (Map) S0.D(j);
                            map2 = map5;
                            i2++;
                            map = map3;
                            obj5 = null;
                        }
                    }
                } else {
                    map4 = map2;
                    map3 = map;
                    if (i2 != 0 || !jSONReader.d1(JSONReader.Feature.SupportAutoType) || jSONReader.f0() != '\"' || ((type2 instanceof Class) && Enum.class.isAssignableFrom((Class) type2))) {
                        jdk jdkVar = this.j;
                        if (jdkVar != null) {
                            obj3 = JSON.DEFAULT_TYPE_KEY;
                            obj4 = jdkVar.o(jSONReader, null, null, 0L);
                            c = f7l.CONDITION_IF_MIDDLE;
                        } else {
                            obj3 = JSON.DEFAULT_TYPE_KEY;
                            c = f7l.CONDITION_IF_MIDDLE;
                            obj4 = jSONReader.P1(type2);
                        }
                        if (i2 != 0 || (JSONReader.Feature.SupportAutoType.mask & j2) == 0 || !obj4.equals(obj3)) {
                            jSONReader.z1(c);
                            obj5 = obj4;
                        }
                    } else {
                        String g2 = jSONReader.g2();
                        if (g2.equals(JSON.DEFAULT_TYPE_KEY)) {
                            jdk S02 = jSONReader.S0(jSONReader.T2(), this.f22653a, j);
                            if (S02 != null && (S02 instanceof ggk) && !map4.getClass().equals(((ggk) S02).c)) {
                                map5 = (Map) S02.D(j);
                                map2 = map5;
                                i2++;
                                map = map3;
                                obj5 = null;
                            }
                        } else {
                            b = TypeUtils.b(g2, type2);
                            obj5 = b;
                        }
                    }
                }
                map2 = map4;
                i2++;
                map = map3;
                obj5 = null;
            } else if (jSONReader.z1(f7l.CONDITION_IF_MIDDLE)) {
                map4 = map2;
                map3 = map;
            } else {
                throw new JSONException(jSONReader.a1("illegal json"));
            }
            if (this.i == null) {
                if ((JSONReader.Feature.FieldBased.mask & j2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.i = cVar.i.J(this.d, z);
            }
            Object o = this.i.o(jSONReader, this.d, obj, 0L);
            if (o != null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & j2) == 0) {
                if (map3 != null) {
                    obj2 = map3.put(obj5, o);
                } else {
                    obj2 = map4.put(obj5, o);
                }
                if (!(obj2 == null || (JSONReader.Feature.DuplicateKeyValueAsArray.mask & j2) == 0)) {
                    if (obj2 instanceof Collection) {
                        ((Collection) obj2).add(o);
                        map4.put(obj5, obj2);
                    } else {
                        map4.put(obj5, JSONArray.of(obj2, o));
                    }
                }
            }
            map2 = map4;
            i2++;
            map = map3;
            obj5 = null;
        }
        jSONReader.w1();
        k2a k2aVar = this.g;
        if (k2aVar != null) {
            return k2aVar.apply(map2);
        }
        return map2;
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        jdk jdkVar;
        Map map;
        Object g2;
        Object obj2;
        Object obj3;
        boolean z;
        byte W0 = jSONReader.W0();
        boolean z2 = false;
        k2a k2aVar = this.g;
        if (W0 == -110) {
            jdkVar = jSONReader.c0(this.f22653a, 0L, this.f | j);
            if (!(jdkVar == null || jdkVar == this)) {
                k2aVar = jdkVar.d();
                if (!(jdkVar instanceof ggk) && !(jdkVar instanceof kgk)) {
                    return jdkVar.q(jSONReader, type, obj, j);
                }
            }
        } else {
            jdkVar = null;
        }
        byte W02 = jSONReader.W0();
        if (W02 == -81) {
            jSONReader.t1();
            return null;
        }
        if (W02 == -90) {
            jSONReader.t1();
        }
        JSONReader.c cVar = jSONReader.f2453a;
        long j2 = j | cVar.c;
        if (jdkVar != null) {
            map = (Map) jdkVar.D(j2);
        } else if (this.b == HashMap.class) {
            map = new HashMap();
        } else {
            map = (Map) a();
        }
        int i = 0;
        while (jSONReader.W0() != -91) {
            Type type2 = this.c;
            if (type2 == String.class || jSONReader.l1()) {
                g2 = jSONReader.g2();
            } else if (jSONReader.k1()) {
                String P2 = jSONReader.P2();
                g2 = new vtn(i);
                jSONReader.c(map, g2, c.b(P2));
            } else {
                if (this.j == null && type2 != null) {
                    this.j = jSONReader.R0(type2);
                }
                jdk jdkVar2 = this.j;
                if (jdkVar2 == null) {
                    g2 = jSONReader.T1();
                } else {
                    g2 = jdkVar2.q(jSONReader, null, null, j);
                }
            }
            if (jSONReader.k1()) {
                String P22 = jSONReader.P2();
                if ("..".equals(P22)) {
                    map.put(g2, map);
                } else {
                    jSONReader.c(map, g2, c.b(P22));
                    if (!(map instanceof ConcurrentMap)) {
                        map.put(g2, z2);
                    }
                }
            } else if (jSONReader.C1()) {
                map.put(g2, z2);
            } else {
                Type type3 = this.d;
                if (type3 == Object.class) {
                    obj3 = jSONReader.T1();
                    obj2 = g2;
                } else {
                    obj2 = g2;
                    jdk c0 = jSONReader.c0(this.e, 0L, j);
                    if (c0 == null || c0 == this) {
                        if (this.i == null) {
                            if ((JSONReader.Feature.FieldBased.mask & j2) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.i = cVar.i.J(type3, z);
                        }
                        obj3 = this.i.q(jSONReader, this.d, obj2, j);
                    } else {
                        obj3 = c0.q(jSONReader, this.d, obj2, j);
                    }
                }
                if (obj3 != null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & j2) == 0) {
                    map.put(obj2, obj3);
                }
            }
            i++;
            z2 = false;
        }
        jSONReader.t1();
        if (k2aVar != null) {
            return k2aVar.apply(map);
        }
        return map;
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
        Map map2;
        Object obj;
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        Class cls = this.b;
        if (cls == Map.class || cls == HashMap.class) {
            map2 = new HashMap();
        } else {
            map2 = (Map) D(j);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Type type = this.c;
            if (type == null || type == String.class) {
                obj = key.toString();
            } else {
                obj = TypeUtils.b(key, type);
            }
            if (value != null) {
                Class<?> cls2 = value.getClass();
                Type type2 = this.d;
                if (type2 == Object.class) {
                    continue;
                } else if (cls2 == JSONObject.class || cls2 == JSONFactory.j()) {
                    if (this.i == null) {
                        this.i = objectReaderProvider.I(type2);
                    }
                    value = this.i.x((JSONObject) value, j);
                } else if ((cls2 == JSONArray.class || cls2 == JSONFactory.i()) && this.e == List.class) {
                    if (this.i == null) {
                        this.i = objectReaderProvider.I(type2);
                    }
                    this.i.i((JSONArray) value);
                } else {
                    k2a M = objectReaderProvider.M(cls2, type2);
                    if (M != null) {
                        value = M.apply(value);
                    } else if (value instanceof Map) {
                        Map map3 = (Map) value;
                        if (this.i == null) {
                            this.i = objectReaderProvider.I(type2);
                        }
                        try {
                            value = this.i.x(map3, j);
                        } catch (Exception unused) {
                        }
                    } else if (value instanceof Collection) {
                        if (this.i == null) {
                            this.i = objectReaderProvider.I(type2);
                        }
                        value = this.i.i((Collection) value);
                    } else if (!cls2.isInstance(value)) {
                        throw new JSONException("can not convert from " + cls2 + " to " + type2);
                    }
                }
            }
            map2.put(obj, value);
        }
        k2a k2aVar = this.g;
        if (k2aVar != null) {
            return k2aVar.apply(map2);
        }
        return map2;
    }

    @Override // tb.jdk
    public /* synthetic */ jdk z(JSONReader.c cVar, long j) {
        return cdk.a(this, cVar, j);
    }

    @Override // tb.jdk
    public /* synthetic */ void s(Object obj, String str, Object obj2, long j) {
    }
}
