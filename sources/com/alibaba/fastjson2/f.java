package com.alibaba.fastjson2;

import com.alibaba.fastjson2.c;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import tb.b2d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class f extends e {
    public static final f b = new f(0);
    public static final f c = new f(1);
    public static final f d = new f(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f2465a;

    public f(int i) {
        if (i >= 0) {
            this.f2465a = i;
            return;
        }
        throw new JSONException("not support negative index");
    }

    public static f c(int i) {
        if (i == 0) {
            return b;
        }
        if (i == 1) {
            return c;
        }
        if (i == 2) {
            return d;
        }
        return new f(i);
    }

    @Override // com.alibaba.fastjson2.e
    public void a(c.a aVar) {
        Object obj;
        c.a aVar2 = aVar.b;
        if (aVar2 == null) {
            obj = aVar.c;
        } else {
            obj = aVar2.d;
        }
        if (obj != null) {
            boolean z = obj instanceof List;
            int i = this.f2465a;
            if (z) {
                List list = (List) obj;
                if (i < list.size()) {
                    aVar.d = list.get(i);
                }
            } else if ((obj instanceof SortedSet) || (obj instanceof LinkedHashSet) || (i == 0 && (obj instanceof Collection) && ((Collection) obj).size() == 1)) {
                int i2 = 0;
                for (Object obj2 : (Collection) obj) {
                    if (i2 == i) {
                        aVar.d = obj2;
                        return;
                    }
                    i2++;
                }
            } else if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (i < objArr.length) {
                    aVar.d = objArr[i];
                }
            } else {
                Class<?> cls = obj.getClass();
                if (cls.isArray()) {
                    if (i < Array.getLength(obj)) {
                        aVar.d = Array.get(obj, i);
                    }
                } else if (Map.class.isAssignableFrom(cls)) {
                    aVar.d = b((Map) obj);
                } else if (i == 0) {
                    aVar.d = obj;
                } else {
                    throw new JSONException("jsonpath not support operate : " + aVar.f2462a + ", objectClass" + cls.getName());
                }
            }
        }
    }

    public final Object b(Map map) {
        int i = this.f2465a;
        Object obj = map.get(Integer.valueOf(i));
        if (obj == null) {
            obj = map.get(Integer.toString(i));
        }
        if (obj != null) {
            return obj;
        }
        int size = map.size();
        Iterator it = map.entrySet().iterator();
        int i2 = 0;
        if (size == 1 || (map instanceof LinkedHashMap) || (map instanceof SortedMap)) {
            while (i2 <= i && i2 < size && it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key instanceof Long) {
                    if (key.equals(Long.valueOf(i))) {
                        return value;
                    }
                } else if (i2 == i) {
                    obj = value;
                }
                i2++;
            }
            return obj;
        }
        while (i2 <= i && i2 < map.size() && it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key2 = entry2.getKey();
            Object value2 = entry2.getValue();
            if ((key2 instanceof Long) && key2.equals(Long.valueOf(i))) {
                return value2;
            }
            i2++;
        }
        return obj;
    }

    public String toString() {
        int i = this.f2465a;
        int k = b2d.k(i);
        char[] cArr = new char[k + 2];
        cArr[0] = '[';
        b2d.m(cArr, 1, i);
        cArr[k + 1] = ']';
        return new String(cArr);
    }
}
