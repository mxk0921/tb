package tb;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.z1;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ckk extends jkk {
    public static final byte[] m = yqf.a("JO10");
    public static final long n = ls9.a("JO10");
    public static final ckk o = new ckk(String.class, Object.class, JSONObject.class, JSONObject.class, 0);
    public static ckk p;

    /* renamed from: a  reason: collision with root package name */
    public final Type f17115a;
    public final Class b;
    public final Type c;
    public final boolean d;
    public volatile iik e;
    public final byte[] f;
    public final long g;
    public final long h;
    public final Field i;
    public final long j;
    public final char[] k;
    public final byte[] l;

    public ckk(Type type, Type type2, Class cls, Type type3, long j) {
        this.j = -1L;
        this.c = type2;
        this.b = cls;
        this.f17115a = type3;
        this.h = j;
        if (type2 == null) {
            this.d = true;
        } else {
            this.d = !z1.n(TypeUtils.i(type2));
        }
        String n2 = TypeUtils.n(cls);
        String str = "\"@type\":\"" + cls.getName() + "\"";
        this.k = str.toCharArray();
        this.l = str.getBytes(StandardCharsets.UTF_8);
        boolean equals = "JO1".equals(n2);
        this.f = yqf.a(n2);
        this.g = ls9.a(n2);
        if (equals) {
            Field v = BeanUtils.v(cls, "map");
            this.i = v;
            if (v != null) {
                v.setAccessible(true);
                this.j = opf.UNSAFE.objectFieldOffset(v);
                return;
            }
            return;
        }
        this.i = null;
    }

    public static ckk b() {
        if (p == null) {
            Class j = JSONFactory.j();
            if (j == null) {
                p = null;
            } else {
                p = new ckk(String.class, Object.class, j, j, 0L);
            }
        }
        return p;
    }

    public static ckk d(Class cls) {
        if (cls == JSONObject.class) {
            return o;
        }
        if (cls == JSONFactory.j()) {
            return b();
        }
        return new ckk(null, null, cls, cls, 0L);
    }

    public static ckk h(Type type, Class cls) {
        Type type2;
        Type type3;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length == 2) {
                Type type4 = actualTypeArguments[0];
                type2 = actualTypeArguments[1];
                type3 = type4;
                return new ckk(type3, type2, cls, type, 0L);
            }
        }
        type3 = null;
        type2 = null;
        return new ckk(type3, type2, cls, type, 0L);
    }

    @Override // tb.jkk, tb.iik
    public void B(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        String str;
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        jSONWriter.e1();
        Map map = (Map) obj;
        long A = j | jSONWriter.A();
        if (!((JSONWriter.Feature.MapSortField.mask & A) == 0 || (map instanceof SortedMap) || map.getClass() == LinkedHashMap.class)) {
            map = new TreeMap(map);
        }
        JSONWriter.a aVar = jSONWriter.f2458a;
        aVar.getClass();
        boolean k = aVar.k(JSONWriter.Feature.WriteNulls.mask);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null || k) {
                Object key = entry.getKey();
                if (key == null) {
                    str = null;
                } else {
                    str = key.toString();
                }
                if (value != null || (jSONWriter.C(A) & JSONWriter.Feature.WriteNulls.mask) != 0) {
                    jSONWriter.W1(str);
                    jSONWriter.s1();
                    if (value == null) {
                        jSONWriter.b2();
                    } else {
                        jSONWriter.F(value.getClass()).y(jSONWriter, value, obj2, type, this.h);
                    }
                }
            }
        }
        jSONWriter.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    @Override // tb.jkk, tb.iik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(com.alibaba.fastjson2.JSONWriter r30, java.lang.Object r31, java.lang.Object r32, java.lang.reflect.Type r33, long r34) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ckk.e(com.alibaba.fastjson2.JSONWriter, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }

    public boolean i(JSONWriter jSONWriter) {
        if (jSONWriter.b) {
            jSONWriter.Y1(this.l);
            return true;
        }
        jSONWriter.a2(this.k);
        return true;
    }

    @Override // tb.jkk, tb.iik
    public void l(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        jSONWriter.e1();
        boolean L0 = jSONWriter.L0();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                jSONWriter.k2(str);
                Class<?> cls = value.getClass();
                if (cls == String.class) {
                    jSONWriter.k2((String) value);
                } else {
                    jSONWriter.F(cls).e(jSONWriter, value, str, this.c, this.h);
                }
            } else if (L0) {
                jSONWriter.k2(str);
                jSONWriter.b2();
            }
        }
        jSONWriter.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0159 A[SYNTHETIC] */
    @Override // tb.iik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y(com.alibaba.fastjson2.JSONWriter r19, java.lang.Object r20, java.lang.Object r21, java.lang.reflect.Type r22, long r23) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ckk.y(com.alibaba.fastjson2.JSONWriter, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }
}
