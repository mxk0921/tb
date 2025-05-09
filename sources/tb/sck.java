package tb;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.c;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class sck extends xgk {
    public final Class b;
    public final Class c;
    public final long d;
    public final long e;

    public sck(Class cls) {
        super(cls);
        Class<?> componentType = cls.getComponentType();
        this.b = componentType;
        String n = TypeUtils.n(componentType);
        this.d = ls9.a(n);
        this.e = ls9.a("[".concat(n));
        this.c = TypeUtils.i(componentType);
    }

    @Override // tb.xgk, tb.jdk
    public Object i(Collection collection) {
        Class<?> cls;
        k2a M;
        Object[] objArr = (Object[]) Array.newInstance(this.c, collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            Class<?> cls2 = this.b;
            if (!(next == null || (cls = next.getClass()) == cls2 || (M = JSONFactory.defaultObjectReaderProvider.M(cls, cls2)) == null)) {
                next = M.apply(next);
            }
            if (!cls2.isInstance(next)) {
                jdk I = JSONFactory.defaultObjectReaderProvider.I(cls2);
                if (next instanceof Map) {
                    next = I.t((Map) next, new JSONReader.Feature[0]);
                } else if (next instanceof Collection) {
                    next = I.i((Collection) next);
                } else if (next instanceof Object[]) {
                    next = I.i(JSONArray.of((Object[]) next));
                } else if (next != null) {
                    Class<?> cls3 = next.getClass();
                    if (cls3.isArray()) {
                        int length = Array.getLength(next);
                        JSONArray jSONArray = new JSONArray(length);
                        for (int i2 = 0; i2 < length; i2++) {
                            jSONArray.add(Array.get(next, i2));
                        }
                        next = I.i(jSONArray);
                    } else {
                        throw new JSONException("component type not match, expect " + cls2.getName() + ", but " + cls3);
                    }
                } else {
                    continue;
                }
            }
            objArr[i] = next;
            i++;
        }
        return objArr;
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.w) {
            return q(jSONReader, type, obj, 0L);
        }
        if (jSONReader.n2()) {
            return null;
        }
        if (jSONReader.v1()) {
            Class cls = this.b;
            Object[] objArr = (Object[]) Array.newInstance(cls, 16);
            int i = 0;
            while (!jSONReader.u1()) {
                int i2 = i + 1;
                if (i2 - objArr.length > 0) {
                    int length = objArr.length;
                    int i3 = length + (length >> 1);
                    if (i3 - i2 < 0) {
                        i3 = i2;
                    }
                    objArr = Arrays.copyOf(objArr, i3);
                }
                objArr[i] = jSONReader.O1(cls);
                jSONReader.w1();
                i = i2;
            }
            jSONReader.w1();
            return Arrays.copyOf(objArr, i);
        } else if (jSONReader.f0() == '\"' && jSONReader.Q2().isEmpty()) {
            return null;
        } else {
            throw new JSONException(jSONReader.a1("TODO"));
        }
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        Object obj2;
        if (jSONReader.W0() == -110) {
            jSONReader.t1();
            long T2 = jSONReader.T2();
            if (!(T2 == qck.TYPE_HASH_CODE || T2 == this.e)) {
                if (jSONReader.m1(j)) {
                    jdk S0 = jSONReader.S0(T2, this.f31383a, j);
                    if (S0 != null) {
                        return S0.o(jSONReader, type, obj, j);
                    }
                    throw new JSONException(jSONReader.a1("auotype not support : " + jSONReader.U0()));
                }
                throw new JSONException(jSONReader.a1("not support autotype : " + jSONReader.U0()));
            }
        }
        int c3 = jSONReader.c3();
        if (c3 == -1) {
            return null;
        }
        Object[] objArr = (Object[]) Array.newInstance(this.c, c3);
        for (int i = 0; i < c3; i++) {
            if (jSONReader.k1()) {
                String P2 = jSONReader.P2();
                if ("..".equals(P2)) {
                    obj2 = objArr;
                } else {
                    jSONReader.g(objArr, i, c.b(P2));
                    obj2 = null;
                }
            } else {
                jdk c0 = jSONReader.c0(this.c, this.d, j);
                if (c0 != null) {
                    obj2 = c0.q(jSONReader, null, null, j);
                } else {
                    obj2 = jSONReader.O1(this.b);
                }
            }
            objArr[i] = obj2;
        }
        return objArr;
    }
}
