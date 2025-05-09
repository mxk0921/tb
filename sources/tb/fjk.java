package tb;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.z1;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class fjk extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final fjk f19342a = new fjk();
    public static final byte[] b = yqf.a(TypeUtils.n(LinkedHashSet.class));
    public static final long c = ls9.a(TypeUtils.n(LinkedHashSet.class));
    public static final byte[] d = yqf.a(TypeUtils.n(TreeSet.class));
    public static final long e = ls9.a(TypeUtils.n(TreeSet.class));

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        Type type2;
        Class cls;
        boolean z;
        Class<?> cls2;
        iik iikVar;
        boolean z2;
        String Y0;
        Type type3;
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        Class<?> cls3 = null;
        if (type instanceof Class) {
            cls = (Class) type;
            type2 = null;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                type3 = actualTypeArguments[0];
            } else {
                type3 = null;
            }
            Type rawType = parameterizedType.getRawType();
            if (rawType instanceof Class) {
                cls = (Class) rawType;
            } else {
                cls = null;
            }
            type2 = type3;
        } else {
            cls = null;
            type2 = null;
        }
        Collection collection = (Collection) obj;
        Class<?> cls4 = obj.getClass();
        boolean O0 = jSONWriter.O0(obj, cls);
        if (O0 && ((cls == Set.class && cls4 == HashSet.class) || (type == Collection.class && cls4 == ArrayList.class))) {
            O0 = false;
        }
        if (O0) {
            if (cls4 == LinkedHashSet.class) {
                jSONWriter.t2(b, c);
            } else if (cls4 == TreeSet.class) {
                jSONWriter.t2(d, e);
            } else {
                jSONWriter.s2(TypeUtils.n(cls4));
            }
        }
        boolean B0 = jSONWriter.B0();
        if (collection.size() <= 1 || (collection instanceof SortedSet) || (collection instanceof LinkedHashSet)) {
            z = B0;
        } else {
            z = false;
        }
        jSONWriter.d1(collection.size());
        iik iikVar2 = null;
        int i = 0;
        for (Object obj3 : collection) {
            if (obj3 == null) {
                jSONWriter.b2();
            } else {
                Class<?> cls5 = obj3.getClass();
                if (cls5 == cls3) {
                    iikVar = iikVar2;
                    cls2 = cls3;
                } else {
                    iikVar = jSONWriter.F(cls5);
                    cls2 = cls5;
                }
                if (!z || z1.n(cls5)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2 || (Y0 = jSONWriter.Y0(i, obj3)) == null) {
                    iikVar.e(jSONWriter, obj3, Integer.valueOf(i), type2, j);
                    if (z2) {
                        jSONWriter.X0(obj3);
                    }
                } else {
                    jSONWriter.i2(Y0);
                    jSONWriter.X0(obj3);
                }
                iikVar2 = iikVar;
                cls3 = cls2;
            }
            i++;
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.d) {
            e(jSONWriter, obj, obj2, type, j);
        } else if (obj == null) {
            jSONWriter.b2();
        } else {
            if ((obj instanceof Set) && jSONWriter.N0(obj, j)) {
                jSONWriter.f2(pg1.ATOM_Set);
            }
            jSONWriter.c1();
            Class<?> cls = null;
            iik iikVar = null;
            int i = 0;
            for (Object obj3 : (Iterable) obj) {
                if (i != 0) {
                    jSONWriter.t1();
                }
                if (obj3 == null) {
                    jSONWriter.b2();
                } else {
                    Class<?> cls2 = obj3.getClass();
                    if (cls2 != cls) {
                        iikVar = jSONWriter.F(cls2);
                        cls = cls2;
                    }
                    iikVar.y(jSONWriter, obj3, Integer.valueOf(i), null, 0L);
                }
                i++;
            }
            jSONWriter.e();
        }
    }
}
