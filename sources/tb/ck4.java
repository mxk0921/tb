package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ck4<T> implements k2a<Map<Long, Object>, T> {

    /* renamed from: a  reason: collision with root package name */
    public final Constructor f17111a;
    public final int b;
    public final Class[] c;
    public final boolean d;
    public final long[] e;
    public final Map<Set<Long>, Constructor> f;
    public final Map<Set<Long>, String[]> g;
    public final Map<Set<Long>, long[]> h;
    public final Map<Set<Long>, Type[]> i;

    public ck4(List<Constructor> list, Constructor constructor, k2a k2aVar, ba2 ba2Var, Constructor constructor2, String... strArr) {
        boolean z;
        Constructor constructor3;
        long j;
        String str;
        if (constructor2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        if (z) {
            constructor3 = constructor2;
        } else {
            constructor3 = constructor;
        }
        this.f17111a = constructor3;
        this.b = constructor3.getParameterTypes().length;
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        this.c = parameterTypes;
        this.e = new long[parameterTypes.length];
        for (int i = 0; i < this.c.length; i++) {
            if (i < strArr.length) {
                str = strArr[i];
            } else {
                str = null;
            }
            if (str == null) {
                str = "arg" + i;
            }
            this.e[i] = ls9.a(str);
        }
        if (list != null) {
            this.f = new HashMap(list.size());
            this.g = new HashMap(list.size());
            this.i = new HashMap(list.size());
            this.h = new HashMap(list.size());
            for (int i2 = 0; i2 < list.size(); i2++) {
                Constructor constructor4 = list.get(i2);
                constructor4.setAccessible(true);
                String[] Y = BeanUtils.Y(constructor4);
                Class<?>[] parameterTypes2 = constructor4.getParameterTypes();
                f79 f79Var = new f79();
                ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
                Annotation[][] parameterAnnotations = constructor4.getParameterAnnotations();
                for (int i3 = 0; i2 < parameterTypes2.length && i3 < Y.length; i3++) {
                    f79Var.b();
                    objectReaderProvider.B(f79Var, constructor4.getDeclaringClass(), constructor4, i3, parameterAnnotations);
                    String str2 = f79Var.f19065a;
                    if (str2 != null) {
                        Y[i3] = str2;
                    }
                }
                long[] jArr = new long[Y.length];
                Type[] genericParameterTypes = constructor4.getGenericParameterTypes();
                HashSet hashSet = new HashSet(Y.length);
                for (int i4 = 0; i4 < Y.length; i4++) {
                    String str3 = Y[i4];
                    if (str3 == null) {
                        j = 0;
                    } else {
                        j = ls9.a(str3);
                    }
                    jArr[i4] = j;
                    hashSet.add(Long.valueOf(j));
                }
                ((HashMap) this.f).put(hashSet, constructor4);
                ((HashMap) this.g).put(hashSet, Y);
                ((HashMap) this.h).put(hashSet, jArr);
                ((HashMap) this.i).put(hashSet, genericParameterTypes);
            }
        }
    }

    /* renamed from: a */
    public T apply(Map<Long, Object> map) {
        long[] jArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            jArr = this.e;
            if (i2 >= jArr.length) {
                break;
            } else if (!map.containsKey(Long.valueOf(jArr[i2]))) {
                Map<Set<Long>, Constructor> map2 = this.f;
                if (map2 != null) {
                    Set<Long> keySet = map.keySet();
                    Constructor constructor = (Constructor) ((HashMap) map2).get(keySet);
                    if (constructor != null) {
                        long[] jArr2 = (long[]) ((HashMap) this.h).get(keySet);
                        Type[] typeArr = (Type[]) ((HashMap) this.i).get(keySet);
                        Object[] objArr = new Object[jArr2.length];
                        while (i < jArr2.length) {
                            Object obj = map.get(Long.valueOf(jArr2[i]));
                            Type type = typeArr[i];
                            if (obj == null) {
                                obj = TypeUtils.j(type);
                            }
                            objArr[i] = obj;
                            i++;
                        }
                        try {
                            return (T) constructor.newInstance(objArr);
                        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e) {
                            throw new JSONException("invoke constructor error, " + constructor, e);
                        }
                    }
                }
            } else {
                i2++;
            }
        }
        Class[] clsArr = this.c;
        int length = clsArr.length;
        Object[] objArr2 = new Object[this.b];
        boolean z = this.d;
        Constructor constructor2 = this.f17111a;
        if (z) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                Object obj2 = map.get(Long.valueOf(jArr[i3]));
                if (obj2 != null) {
                    objArr2[i3] = obj2;
                } else {
                    i4 |= 1 << i3;
                    Class cls = clsArr[i3];
                    if (cls.isPrimitive()) {
                        objArr2[i3] = TypeUtils.j(cls);
                    }
                }
                int i5 = i3 + 1;
                if (i5 % 32 == 0 || i5 == length) {
                    objArr2[(i3 / 32) + length] = Integer.valueOf(i4);
                    i4 = 0;
                }
                i3 = i5;
            }
        } else {
            while (i < length) {
                Class cls2 = clsArr[i];
                Object obj3 = map.get(Long.valueOf(jArr[i]));
                if (obj3 == null) {
                    obj3 = TypeUtils.j(cls2);
                } else if (!cls2.isInstance(obj3)) {
                    obj3 = TypeUtils.a(obj3, cls2, JSONFactory.defaultObjectReaderProvider);
                } else if (Collection.class.isAssignableFrom(cls2) || Map.class.isAssignableFrom(cls2)) {
                    Type[] genericParameterTypes = constructor2.getGenericParameterTypes();
                    if (genericParameterTypes.length == clsArr.length) {
                        obj3 = TypeUtils.b(obj3, genericParameterTypes[i]);
                    }
                }
                objArr2[i] = obj3;
                i++;
            }
        }
        try {
            return (T) constructor2.newInstance(objArr2);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e2) {
            throw new JSONException("invoke constructor error, " + constructor2, e2);
        }
    }
}
